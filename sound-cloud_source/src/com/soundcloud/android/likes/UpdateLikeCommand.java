// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import android.content.ContentValues;
import com.soundcloud.android.commands.WriteStorageCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.WriteResult;
import com.soundcloud.propeller.query.Query;
import java.util.Date;

class UpdateLikeCommand extends WriteStorageCommand
{
    static final class UpdateLikeParams
    {

        final boolean addLike;
        final Urn targetUrn;

        UpdateLikeParams(Urn urn, boolean flag)
        {
            addLike = flag;
            targetUrn = urn;
        }
    }


    private int updatedLikesCount;

    UpdateLikeCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    private ContentValues buildContentValuesForLike(UpdateLikeParams updatelikeparams)
    {
        Date date = new Date();
        ContentValues contentvalues = new ContentValues();
        Urn urn = updatelikeparams.targetUrn;
        contentvalues.put("_id", Long.valueOf(urn.getNumericId()));
        contentvalues.put("_type", Integer.valueOf(getSoundType(urn)));
        contentvalues.put("created_at", Long.valueOf(date.getTime()));
        if (updatelikeparams.addLike)
        {
            contentvalues.put("added_at", Long.valueOf(date.getTime()));
            contentvalues.putNull("removed_at");
            return contentvalues;
        } else
        {
            contentvalues.put("removed_at", Long.valueOf(date.getTime()));
            contentvalues.putNull("added_at");
            return contentvalues;
        }
    }

    private int getSoundType(Urn urn)
    {
        return !urn.isTrack() ? 1 : 0;
    }

    private int obtainNewLikesCount(PropellerDatabase propellerdatabase, UpdateLikeParams updatelikeparams)
    {
        int i = ((Integer)propellerdatabase.query((Query)((Query)Query.from(new String[] {
            Table.SoundView.name()
        }).select(new Object[] {
            "favoritings_count"
        }).whereEq("_id", Long.valueOf(updatelikeparams.targetUrn.getNumericId()))).whereEq("_type", Integer.valueOf(getSoundType(updatelikeparams.targetUrn)))).first(java/lang/Integer)).intValue();
        if (updatelikeparams.addLike)
        {
            return i + 1;
        } else
        {
            return i - 1;
        }
    }

    protected Integer transform(WriteResult writeresult)
    {
        return Integer.valueOf(updatedLikesCount);
    }

    protected volatile Object transform(WriteResult writeresult)
    {
        return transform(writeresult);
    }

    protected WriteResult write(PropellerDatabase propellerdatabase, final UpdateLikeParams params)
    {
        updatedLikesCount = obtainNewLikesCount(propellerdatabase, params);
        return propellerdatabase.runTransaction(new _cls1());
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (UpdateLikeParams)obj);
    }




    private class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final UpdateLikeCommand this$0;
        final UpdateLikeParams val$params;

        public void steps(PropellerDatabase propellerdatabase)
        {
            step(propellerdatabase.update(Table.Sounds, ContentValuesBuilder.values().put("favoritings_count", updatedLikesCount).get(), Filter.filter().whereEq("_id", Long.valueOf(params.targetUrn.getNumericId())).whereEq("_type", Integer.valueOf(getSoundType(params.targetUrn)))));
            step(propellerdatabase.upsert(Table.Likes, buildContentValuesForLike(params)));
        }

        _cls1()
        {
            this$0 = UpdateLikeCommand.this;
            params = updatelikeparams;
            super();
        }
    }

}
