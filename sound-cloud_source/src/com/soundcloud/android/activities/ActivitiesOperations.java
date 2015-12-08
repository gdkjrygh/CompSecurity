// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import com.soundcloud.android.api.legacy.model.ContentStats;
import com.soundcloud.android.sync.SyncContent;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.sync.timeline.TimelineOperations;
import java.util.List;
import rx.R;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.activities:
//            ActivitiesStorage

class ActivitiesOperations extends TimelineOperations
{

    private static final f TO_VIEW_MODELS = new _cls1();
    private final R scheduler;

    ActivitiesOperations(ActivitiesStorage activitiesstorage, SyncInitiator syncinitiator, ContentStats contentstats, R r)
    {
        super(SyncContent.MyActivities, activitiesstorage, syncinitiator, contentstats, r);
        scheduler = r;
    }

    b initialActivities()
    {
        return initialTimelineItems(false);
    }

    protected b initialTimelineItems(boolean flag)
    {
        return super.initialTimelineItems(flag).subscribeOn(scheduler);
    }

    protected boolean isEmptyResult(List list)
    {
        return list.isEmpty();
    }

    protected f toViewModels()
    {
        return TO_VIEW_MODELS;
    }

    b updatedActivities()
    {
        return updatedTimelineItems().subscribeOn(scheduler);
    }


    private class _cls1
        implements f
    {

        public final volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public final List call(List list)
        {
            ArrayList arraylist = new ArrayList(list.size());
            for (list = list.iterator(); list.hasNext(); arraylist.add(new ActivityItem((PropertySet)list.next()))) { }
            return arraylist;
        }

        _cls1()
        {
        }
    }

}
