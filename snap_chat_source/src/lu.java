// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.analytics.framework.EasyMetric;
import java.util.concurrent.atomic.AtomicInteger;

public final class lu
{

    private static final lu INSTANCE = new lu();
    private com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory mMetricFactory;
    public AtomicInteger mSnapEngagement;
    public AtomicInteger mSnapSends;
    public AtomicInteger mSnapViews;

    private lu()
    {
        this(new com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory());
    }

    private lu(com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory easymetricfactory)
    {
        mMetricFactory = easymetricfactory;
        mSnapViews = new AtomicInteger();
        mSnapSends = new AtomicInteger();
        mSnapEngagement = new AtomicInteger();
    }

    public static lu a()
    {
        return INSTANCE;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("SNAP_VIEWS_IN_SESSION").a("count", Integer.valueOf(mSnapViews.get())).b(false);
        com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("SNAP_SENDS_IN_SESSION").a("count", Integer.valueOf(mSnapSends.get())).b(false);
        com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("SNAP_ENGAGEMENT_IN_SESSION").a("count", Integer.valueOf(mSnapEngagement.get())).b(false);
        mSnapViews.set(0);
        mSnapSends.set(0);
        mSnapEngagement.set(0);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
