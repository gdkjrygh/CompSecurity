// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.timeline;

import com.soundcloud.android.api.legacy.model.ContentStats;
import com.soundcloud.android.api.model.Timestamped;
import com.soundcloud.android.sync.SyncContent;
import com.soundcloud.android.sync.SyncInitiator;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import rx.R;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.sync.timeline:
//            TimelineStorage

public abstract class TimelineOperations
{

    private static final long INITIAL_TIMESTAMP = 0x7fffffffffffffffL;
    static final int PAGE_SIZE = 30;
    private static final String TAG = "Timeline";
    private final ContentStats contentStats;
    private final List noMorePagesSentinel = Collections.emptyList();
    private final R scheduler;
    private final TimelineStorage storage;
    private final SyncContent syncContent;
    private final SyncInitiator syncInitiator;

    public TimelineOperations(SyncContent synccontent, TimelineStorage timelinestorage, SyncInitiator syncinitiator, ContentStats contentstats, R r)
    {
        syncContent = synccontent;
        storage = timelinestorage;
        syncInitiator = syncinitiator;
        contentStats = contentstats;
        scheduler = r;
    }

    private b handleEmptyLocalResult(long l, boolean flag)
    {
        if (flag)
        {
            return b.just(noMorePagesSentinel);
        }
        if (l == 0x7fffffffffffffffL)
        {
            return syncInitiator.syncNewTimelineItems(syncContent).flatMap(handleSyncResult(l));
        } else
        {
            return syncInitiator.backfillTimelineItems(syncContent).flatMap(handleSyncResult(l));
        }
    }

    private f handleLocalResult(final long timestamp, final boolean syncCompleted)
    {
        return new _cls1();
    }

    private f handleSyncResult(final long currentTimestamp)
    {
        return new _cls2();
    }

    private b pagedTimelineItems(long l, boolean flag)
    {
        return storage.timelineItemsBefore(l, 30).toList().subscribeOn(scheduler).map(toViewModels()).flatMap(handleLocalResult(l, flag));
    }

    private void updateLastSeenTimestamp(List list)
    {
        list = getFirstItemTimestamp(list);
        if (list != null)
        {
            contentStats.setLastSeen(syncContent.content, list.getTime());
        }
    }

    public Date getFirstItemTimestamp(List list)
    {
        list = list.listIterator();
        if (list.hasNext())
        {
            return ((Timestamped)list.next()).getCreatedAt();
        } else
        {
            return null;
        }
    }

    public Date getLastItemTimestamp(List list)
    {
        list = list.listIterator(list.size());
        if (list.hasPrevious())
        {
            return ((Timestamped)list.previous()).getCreatedAt();
        } else
        {
            return null;
        }
    }

    public b initialTimelineItems(boolean flag)
    {
        return storage.timelineItems(30).toList().map(toViewModels()).flatMap(handleLocalResult(0x7fffffffffffffffL, flag));
    }

    public abstract boolean isEmptyResult(List list);

    public com.soundcloud.rx.Pager.PagingFunction pagingFunction()
    {
        return new _cls3();
    }

    public abstract f toViewModels();

    public b updatedTimelineItems()
    {
        return syncInitiator.refreshTimelineItems(syncContent).flatMap(handleSyncResult(0x7fffffffffffffffL));
    }





    private class _cls1
        implements f
    {

        final TimelineOperations this$0;
        final boolean val$syncCompleted;
        final long val$timestamp;

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public b call(List list)
        {
            if (isEmptyResult(list))
            {
                return handleEmptyLocalResult(timestamp, syncCompleted);
            } else
            {
                updateLastSeenTimestamp(list);
                return b.just(list);
            }
        }

        _cls1()
        {
            this$0 = TimelineOperations.this;
            timestamp = l;
            syncCompleted = flag;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final TimelineOperations this$0;
        final long val$currentTimestamp;

        public volatile Object call(Object obj)
        {
            return call((Boolean)obj);
        }

        public b call(Boolean boolean1)
        {
            (new StringBuilder("Sync finished; new items? => ")).append(boolean1);
            if (boolean1.booleanValue())
            {
                if (currentTimestamp == 0x7fffffffffffffffL)
                {
                    return initialTimelineItems(true);
                } else
                {
                    return pagedTimelineItems(currentTimestamp, true);
                }
            } else
            {
                return b.just(noMorePagesSentinel);
            }
        }

        _cls2()
        {
            this$0 = TimelineOperations.this;
            currentTimestamp = l;
            super();
        }
    }


    private class _cls3
        implements com.soundcloud.rx.Pager.PagingFunction
    {

        final TimelineOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public b call(List list)
        {
            if (list == noMorePagesSentinel)
            {
                return Pager.finish();
            }
            list = getLastItemTimestamp(list);
            if (list != null)
            {
                long l = list.getTime();
                return pagedTimelineItems(l, false);
            } else
            {
                return Pager.finish();
            }
        }

        _cls3()
        {
            this$0 = TimelineOperations.this;
            super();
        }
    }

}
