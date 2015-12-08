// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import com.soundcloud.android.commands.DefaultWriteStorageCommand;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Where;

public class RemoveLocalPlaylistsCommand extends DefaultWriteStorageCommand
{

    RemoveLocalPlaylistsCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (Void)obj);
    }

    protected WriteResult write(PropellerDatabase propellerdatabase, Void void1)
    {
        return propellerdatabase.delete(Table.Sounds, Filter.filter().whereEq("_type", Integer.valueOf(1)).whereLt("_id", Integer.valueOf(0)));
    }
}
