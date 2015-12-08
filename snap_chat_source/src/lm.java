// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.analytics.framework.EasyMetric;

public final class lm
{

    public static final String CONTEXT_PARAM = "context";
    public static final String CURRENT_ACTION_PARAM = "current_action";
    public static final String FIRST_MEDIA_OPENED_EVENT = "FIRST_MEDIA_OPENED";
    public static final String LAST_ACTION_PARAM = "last_action";
    public static final String MEDIA_VIEW_INTERVAL_EVENT = "MEDIA_VIEW_INTERVAL";
    public static final String TYPE_PARAM = "type";
    private static lm sInstance = new lm();
    public EasyMetric mFirstMediaOpenedMetric;
    private EasyMetric mMediaViewIntervalMetric;
    private final com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory mMetricFactory;
    private final Jd mStartupContext;

    lm()
    {
        this(new com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory(), Jd.a());
    }

    private lm(com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory easymetricfactory, Jd jd)
    {
        mMetricFactory = easymetricfactory;
        mStartupContext = jd;
    }

    public static lm a()
    {
        return sInstance;
    }

    private void a(String s)
    {
        if (mMediaViewIntervalMetric != null)
        {
            mMediaViewIntervalMetric.a("context", s);
        }
    }

    private void b(String s)
    {
        if (mMediaViewIntervalMetric != null)
        {
            mMediaViewIntervalMetric.a("last_action", s);
        }
    }

    private void b(boolean flag)
    {
        if (flag || mMediaViewIntervalMetric == null)
        {
            mMediaViewIntervalMetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("MEDIA_VIEW_INTERVAL").a("last_action", "end_view_media").b();
        }
    }

    public final void a(String s, String s1)
    {
        c(s1, s);
        b(s1, s);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            b(true);
            b("kicked_out");
            return;
        } else
        {
            b(false);
            return;
        }
    }

    public final void b()
    {
        mFirstMediaOpenedMetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("FIRST_MEDIA_OPENED").b();
    }

    public final void b(String s, String s1)
    {
        b(false);
        a(s1);
        b(s);
    }

    public final void c(String s, String s1)
    {
        if (mMediaViewIntervalMetric != null)
        {
            mMediaViewIntervalMetric.a("current_action", s);
        }
        a(s1);
        if (mMediaViewIntervalMetric != null)
        {
            mMediaViewIntervalMetric.b(false);
            mMediaViewIntervalMetric = null;
        }
    }

}
