// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import android.content.ContentValues;
import com.soundcloud.android.commands.Command;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.propeller.ChangeResult;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.query.Where;
import java.util.Date;

class RepostStorage
{

    private final DateProvider dateProvider;
    private final PropellerDatabase propeller;

    RepostStorage(PropellerDatabase propellerdatabase, CurrentDateProvider currentdateprovider)
    {
        propeller = propellerdatabase;
        dateProvider = currentdateprovider;
    }

    private ContentValues buildContentValuesForRepost(Urn urn)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("type", "repost");
        int i;
        if (urn.isTrack())
        {
            i = 0;
        } else
        {
            i = 1;
        }
        contentvalues.put("target_type", Integer.valueOf(i));
        contentvalues.put("target_id", Long.valueOf(urn.getNumericId()));
        contentvalues.put("created_at", Long.valueOf(dateProvider.getCurrentDate().getTime()));
        return contentvalues;
    }

    private int getSoundType(Urn urn)
    {
        return !urn.isTrack() ? 1 : 0;
    }

    private int obtainNewRepostCount(PropellerDatabase propellerdatabase, Urn urn, boolean flag)
    {
        int i = ((Integer)propellerdatabase.query((Query)((Query)Query.from(new String[] {
            Table.SoundView.name()
        }).select(new Object[] {
            "reposts_count"
        }).whereEq("_id", Long.valueOf(urn.getNumericId()))).whereEq("_type", Integer.valueOf(getSoundType(urn)))).first(java/lang/Integer)).intValue();
        if (flag)
        {
            return i + 1;
        } else
        {
            return i - 1;
        }
    }

    private ChangeResult updateRepostCount(PropellerDatabase propellerdatabase, Urn urn, int i)
    {
        return propellerdatabase.update(Table.Sounds, ContentValuesBuilder.values().put("reposts_count", i).get(), Filter.filter().whereEq("_id", Long.valueOf(urn.getNumericId())).whereEq("_type", Integer.valueOf(getSoundType(urn))));
    }

    Command addRepost()
    {
        return new _cls1(propeller);
    }

    Command removeRepost()
    {
        return new _cls2(propeller);
    }




    private class _cls1 extends WriteStorageCommand
    {

        final RepostStorage this$0;
        private int updatedRepostCount;

        protected Integer transform(WriteResult writeresult)
        {
            return Integer.valueOf(updatedRepostCount);
        }

        protected volatile Object transform(WriteResult writeresult)
        {
            return transform(writeresult);
        }

        public WriteResult write(PropellerDatabase propellerdatabase, final Urn urn)
        {
            updatedRepostCount = obtainNewRepostCount(propellerdatabase, urn, true);
            class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
            {

                final _cls1 this$1;
                final Urn val$urn;

                public void steps(PropellerDatabase propellerdatabase1)
                {
                    step(updateRepostCount(propellerdatabase1, urn, updatedRepostCount));
                    step(propellerdatabase1.insert(Table.Posts, buildContentValuesForRepost(urn)));
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    urn = urn1;
                    super();
                }
            }

            return propellerdatabase.runTransaction(new _cls1());
        }

        public volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
        {
            return write(propellerdatabase, (Urn)obj);
        }


        _cls1(PropellerDatabase propellerdatabase)
        {
            this$0 = RepostStorage.this;
            super(propellerdatabase);
        }
    }


    private class _cls2 extends WriteStorageCommand
    {

        final RepostStorage this$0;
        private int updatedRepostCount;

        protected Integer transform(WriteResult writeresult)
        {
            return Integer.valueOf(updatedRepostCount);
        }

        protected volatile Object transform(WriteResult writeresult)
        {
            return transform(writeresult);
        }

        public WriteResult write(PropellerDatabase propellerdatabase, final Urn urn)
        {
            int i = 0;
            updatedRepostCount = obtainNewRepostCount(propellerdatabase, urn, false);
            Where where = Filter.filter().whereEq("target_id", Long.valueOf(urn.getNumericId()));
            class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
            {

                final _cls2 this$1;
                final Urn val$urn;
                final Where val$whereClause;

                public void steps(PropellerDatabase propellerdatabase1)
                {
                    step(updateRepostCount(propellerdatabase1, urn, updatedRepostCount));
                    step(propellerdatabase1.delete(Table.Posts, whereClause));
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    urn = urn1;
                    whereClause = where;
                    super();
                }
            }

            if (!urn.isTrack())
            {
                i = 1;
            }
            return propellerdatabase.runTransaction(new _cls1());
        }

        public volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
        {
            return write(propellerdatabase, (Urn)obj);
        }


        _cls2(PropellerDatabase propellerdatabase)
        {
            this$0 = RepostStorage.this;
            super(propellerdatabase);
        }
    }

}
