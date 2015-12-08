// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.storage.Table;
import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.rx.RxResultMapper;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.stream:
//            RemoveStalePromotedItemsCommand

class this._cls0 extends com.soundcloud.propeller.nd._cls1
{

    final RemoveStalePromotedItemsCommand this$0;

    public void steps(PropellerDatabase propellerdatabase)
    {
        long l = RemoveStalePromotedItemsCommand.access$000(RemoveStalePromotedItemsCommand.this).getCurrentTime();
        long l1 = RemoveStalePromotedItemsCommand.STALE_TIME_MILLIS;
        com.soundcloud.propeller.query.Where where = Filter.filter().whereLt("created_at", Long.valueOf(l - l1));
        RemoveStalePromotedItemsCommand.access$102(RemoveStalePromotedItemsCommand.this, propellerdatabase.query(Query.from(new String[] {
            Table.PromotedTracks.name()
        }).select(new Object[] {
            "_id"
        }).where(where)).toList(RxResultMapper.scalar(java/lang/Long)));
        if (!RemoveStalePromotedItemsCommand.access$100(RemoveStalePromotedItemsCommand.this).isEmpty())
        {
            Long long1;
            for (Iterator iterator = RemoveStalePromotedItemsCommand.access$100(RemoveStalePromotedItemsCommand.this).iterator(); iterator.hasNext(); step(propellerdatabase.delete(Table.PromotedTracks, Filter.filter().whereEq("_id", long1))))
            {
                long1 = (Long)iterator.next();
                step(propellerdatabase.delete(Table.SoundStream, Filter.filter().whereEq("promoted_id", long1)));
            }

        }
    }

    ()
    {
        this$0 = RemoveStalePromotedItemsCommand.this;
        super();
    }
}
