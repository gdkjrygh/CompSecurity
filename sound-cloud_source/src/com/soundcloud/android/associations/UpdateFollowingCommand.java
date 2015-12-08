// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import android.content.ContentValues;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.commands.WriteStorageCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.WriteResult;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import java.util.Date;

class UpdateFollowingCommand extends WriteStorageCommand
{
    static final class UpdateFollowingParams
    {

        final boolean following;
        final Urn targetUrn;

        UpdateFollowingParams(Urn urn, boolean flag)
        {
            targetUrn = urn;
            following = flag;
        }
    }


    private final AccountOperations accountOperations;
    private int updatedFollowersCount;

    UpdateFollowingCommand(PropellerDatabase propellerdatabase, AccountOperations accountoperations)
    {
        super(propellerdatabase);
        accountOperations = accountoperations;
    }

    private ContentValues buildContentValuesForFollowersCount()
    {
        return ContentValuesBuilder.values().put("followers_count", updatedFollowersCount).get();
    }

    private ContentValues buildContentValuesForFollowing(UpdateFollowingParams updatefollowingparams)
    {
        long l = (new Date()).getTime();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("owner_id", Long.valueOf(accountOperations.getLoggedInUserId()));
        contentvalues.put("target_id", Long.valueOf(updatefollowingparams.targetUrn.getNumericId()));
        contentvalues.put("association_type", Integer.valueOf(2));
        contentvalues.put("resource_type", Integer.valueOf(0));
        contentvalues.put("created_at", Long.valueOf(l));
        if (updatefollowingparams.following)
        {
            contentvalues.put("added_at", Long.valueOf(l));
            contentvalues.putNull("removed_at");
            return contentvalues;
        } else
        {
            contentvalues.put("removed_at", Long.valueOf(l));
            contentvalues.putNull("added_at");
            return contentvalues;
        }
    }

    private Where buildWhereClauseForFollowersCount(UpdateFollowingParams updatefollowingparams)
    {
        return Filter.filter().whereEq("_id", Long.valueOf(updatefollowingparams.targetUrn.getNumericId()));
    }

    private boolean isFollowing(PropellerDatabase propellerdatabase, Urn urn)
    {
        return propellerdatabase.query((Query)((Query)((Query)((Query)Query.from(new String[] {
            Table.UserAssociations.name()
        }).select(new Object[] {
            "target_id"
        }).whereEq("target_id", Long.valueOf(urn.getNumericId()))).whereEq("resource_type", Integer.valueOf(0))).whereEq("association_type", Integer.valueOf(2))).whereNull("removed_at")).getResultCount() == 1;
    }

    private int obtainNewFollowersCount(PropellerDatabase propellerdatabase, UpdateFollowingParams updatefollowingparams)
    {
        int i = ((Integer)propellerdatabase.query((Query)Query.from(new String[] {
            Table.Users.name()
        }).select(new Object[] {
            "followers_count"
        }).whereEq("_id", Long.valueOf(updatefollowingparams.targetUrn.getNumericId()))).first(java/lang/Integer)).intValue();
        if (isFollowing(propellerdatabase, updatefollowingparams.targetUrn) == updatefollowingparams.following || i == -1)
        {
            return i;
        }
        if (updatefollowingparams.following)
        {
            return i + 1;
        } else
        {
            return i - 1;
        }
    }

    protected Integer transform(WriteResult writeresult)
    {
        return Integer.valueOf(updatedFollowersCount);
    }

    protected volatile Object transform(WriteResult writeresult)
    {
        return transform(writeresult);
    }

    protected WriteResult write(PropellerDatabase propellerdatabase, final UpdateFollowingParams params)
    {
        updatedFollowersCount = obtainNewFollowersCount(propellerdatabase, params);
        return propellerdatabase.runTransaction(new _cls1());
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (UpdateFollowingParams)obj);
    }




    private class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final UpdateFollowingCommand this$0;
        final UpdateFollowingParams val$params;

        public void steps(PropellerDatabase propellerdatabase)
        {
            step(propellerdatabase.update(Table.Users, buildContentValuesForFollowersCount(), buildWhereClauseForFollowersCount(params)));
            step(propellerdatabase.upsert(Table.UserAssociations, buildContentValuesForFollowing(params)));
        }

        _cls1()
        {
            this$0 = UpdateFollowingCommand.this;
            params = updatefollowingparams;
            super();
        }
    }

}
