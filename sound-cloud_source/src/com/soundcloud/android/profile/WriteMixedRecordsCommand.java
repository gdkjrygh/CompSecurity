// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.commands.Command;
import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.commands.StoreUsersCommand;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.playlists.PlaylistRecordHolder;
import com.soundcloud.android.tracks.TrackRecordHolder;
import com.soundcloud.android.users.UserRecordHolder;
import com.soundcloud.propeller.WriteResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WriteMixedRecordsCommand extends Command
{

    private final StorePlaylistsCommand storePlaylistsCommand;
    private final StoreTracksCommand storeTracksCommand;
    private final StoreUsersCommand storeUsersCommand;

    protected WriteMixedRecordsCommand(StoreTracksCommand storetrackscommand, StorePlaylistsCommand storeplaylistscommand, StoreUsersCommand storeuserscommand)
    {
        storeTracksCommand = storetrackscommand;
        storePlaylistsCommand = storeplaylistscommand;
        storeUsersCommand = storeuserscommand;
    }

    public Boolean call(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            PropertySetSource propertysetsource = (PropertySetSource)iterable.next();
            if (propertysetsource instanceof TrackRecordHolder)
            {
                arraylist.add(((TrackRecordHolder)propertysetsource).getTrackRecord());
            }
            if (propertysetsource instanceof PlaylistRecordHolder)
            {
                arraylist1.add(((PlaylistRecordHolder)propertysetsource).getPlaylistRecord());
            }
            if (propertysetsource instanceof UserRecordHolder)
            {
                arraylist2.add(((UserRecordHolder)propertysetsource).getUserRecord());
            }
        } while (true);
        boolean flag;
        if ((arraylist.isEmpty() || ((WriteResult)storeTracksCommand.call(arraylist)).success()) && (arraylist1.isEmpty() || ((WriteResult)storePlaylistsCommand.call(arraylist1)).success()) && (arraylist2.isEmpty() || ((WriteResult)storeUsersCommand.call(arraylist2)).success()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((Iterable)obj);
    }
}
