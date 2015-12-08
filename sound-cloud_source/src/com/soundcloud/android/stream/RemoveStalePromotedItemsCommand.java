// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.commands.WriteStorageCommand;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RemoveStalePromotedItemsCommand extends WriteStorageCommand
{

    static final long STALE_TIME_MILLIS;
    private final DateProvider dateProvider;
    private List removeItems;

    protected RemoveStalePromotedItemsCommand(PropellerDatabase propellerdatabase, CurrentDateProvider currentdateprovider)
    {
        super(propellerdatabase);
        removeItems = Collections.emptyList();
        dateProvider = currentdateprovider;
    }

    protected volatile Object transform(WriteResult writeresult)
    {
        return transform(writeresult);
    }

    protected List transform(WriteResult writeresult)
    {
        return removeItems;
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (Void)obj);
    }

    protected WriteResult write(PropellerDatabase propellerdatabase, Void void1)
    {
        return propellerdatabase.runTransaction(new _cls1());
    }

    static 
    {
        STALE_TIME_MILLIS = TimeUnit.MINUTES.toMillis(50L);
    }




/*
    static List access$102(RemoveStalePromotedItemsCommand removestalepromoteditemscommand, List list)
    {
        removestalepromoteditemscommand.removeItems = list;
        return list;
    }

*/

    private class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final RemoveStalePromotedItemsCommand this$0;

        public void steps(PropellerDatabase propellerdatabase)
        {
            long l = dateProvider.getCurrentTime();
            long l1 = RemoveStalePromotedItemsCommand.STALE_TIME_MILLIS;
            com.soundcloud.propeller.query.Where where = Filter.filter().whereLt("created_at", Long.valueOf(l - l1));
            removeItems = propellerdatabase.query(Query.from(new String[] {
                Table.PromotedTracks.name()
            }).select(new Object[] {
                "_id"
            }).where(where)).toList(RxResultMapper.scalar(java/lang/Long));
            if (!removeItems.isEmpty())
            {
                Long long1;
                for (Iterator iterator = removeItems.iterator(); iterator.hasNext(); step(propellerdatabase.delete(Table.PromotedTracks, Filter.filter().whereEq("_id", long1))))
                {
                    long1 = (Long)iterator.next();
                    step(propellerdatabase.delete(Table.SoundStream, Filter.filter().whereEq("promoted_id", long1)));
                }

            }
        }

        _cls1()
        {
            this$0 = RemoveStalePromotedItemsCommand.this;
            super();
        }
    }

}
