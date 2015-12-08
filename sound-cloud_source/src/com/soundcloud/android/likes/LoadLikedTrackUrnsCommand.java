// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.commands.LegacyCommand;
import com.soundcloud.android.commands.TrackUrnMapper;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.Field;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import java.util.List;

public class LoadLikedTrackUrnsCommand extends LegacyCommand
{

    private final PropellerDatabase database;

    LoadLikedTrackUrnsCommand(PropellerDatabase propellerdatabase)
    {
        database = propellerdatabase;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public List call()
        throws Exception
    {
        Where where = Filter.filter().whereEq(Table.Likes.field("_id"), Table.Sounds.field("_id")).whereEq(Table.Likes.field("_type"), Table.Sounds.field("_type"));
        return database.query((Query)((Query)Query.from(new String[] {
            Table.Likes.name()
        }).select(new Object[] {
            Field.field("Likes._id").as("_id")
        }).innerJoin(Table.Sounds.name(), where).whereEq("Likes._type", Integer.valueOf(0))).order("Likes.created_at", com.soundcloud.propeller.query.Query.Order.DESC).whereNull("removed_at")).toList(new TrackUrnMapper());
    }
}
