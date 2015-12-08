// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import com.soundcloud.android.commands.LegacyCommand;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.Query;
import java.util.List;

// Referenced classes of package com.soundcloud.android.sync.likes:
//            LikeMapper

class LoadLikesPendingAdditionCommand extends LegacyCommand
{

    private final PropellerDatabase database;

    LoadLikesPendingAdditionCommand(PropellerDatabase propellerdatabase)
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
        return database.query((Query)((Query)Query.from(new String[] {
            Table.Likes.name()
        }).whereEq("_type", input)).order("created_at", com.soundcloud.propeller.query.Query.Order.DESC).whereNotNull("added_at")).toList(new LikeMapper());
    }
}
