// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import com.soundcloud.android.commands.LegacyCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Where;

class RemovePlaylistCommand extends LegacyCommand
{

    private final PropellerDatabase database;

    RemovePlaylistCommand(PropellerDatabase propellerdatabase)
    {
        database = propellerdatabase;
    }

    public WriteResult call()
        throws Exception
    {
        Where where = Filter.filter().whereEq("_id", Long.valueOf(((Urn)input).getNumericId())).whereEq("_type", Integer.valueOf(1));
        return database.delete(Table.Sounds, where);
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }
}
