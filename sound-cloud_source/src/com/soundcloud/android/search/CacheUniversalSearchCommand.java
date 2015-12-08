// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.commands.LegacyCommand;
import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.commands.StoreUsersCommand;
import com.soundcloud.propeller.PropellerWriteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.search:
//            ApiUniversalSearchItem

class CacheUniversalSearchCommand extends LegacyCommand
{

    private final StorePlaylistsCommand storePlaylistsCommand;
    private final StoreTracksCommand storeTracksCommand;
    private final StoreUsersCommand storeUsersCommand;

    public CacheUniversalSearchCommand(StoreTracksCommand storetrackscommand, StorePlaylistsCommand storeplaylistscommand, StoreUsersCommand storeuserscommand)
    {
        storeTracksCommand = storetrackscommand;
        storePlaylistsCommand = storeplaylistscommand;
        storeUsersCommand = storeuserscommand;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws PropellerWriteException
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        Iterator iterator = ((Iterable)input).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ApiUniversalSearchItem apiuniversalsearchitem = (ApiUniversalSearchItem)iterator.next();
            if (apiuniversalsearchitem.isUser())
            {
                arraylist.add(apiuniversalsearchitem.getUser());
            } else
            if (apiuniversalsearchitem.isPlaylist())
            {
                arraylist1.add(apiuniversalsearchitem.getPlaylist());
            } else
            if (apiuniversalsearchitem.isTrack())
            {
                arraylist2.add(apiuniversalsearchitem.getTrack());
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            storeUsersCommand.call(arraylist);
        }
        if (!arraylist1.isEmpty())
        {
            storePlaylistsCommand.call(arraylist1);
        }
        if (!arraylist2.isEmpty())
        {
            storeTracksCommand.call(arraylist2);
        }
        return null;
    }
}
