// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.config.ecs.EcsConfiguration;

// Referenced classes of package com.skype.android.util:
//            StopWatch

public class SignInDurationReporter
{
    public static final class CheckPoint extends Enum
    {

        public static final CheckPoint a;
        public static final CheckPoint b;
        public static final CheckPoint c;
        public static final CheckPoint d;
        public static final CheckPoint e;
        public static final CheckPoint f;
        public static final CheckPoint g;
        public static final CheckPoint h;
        public static final CheckPoint i;
        public static final CheckPoint j;
        public static final CheckPoint k;
        private static final CheckPoint l[];

        public static CheckPoint valueOf(String s)
        {
            return (CheckPoint)Enum.valueOf(com/skype/android/util/SignInDurationReporter$CheckPoint, s);
        }

        public static CheckPoint[] values()
        {
            return (CheckPoint[])l.clone();
        }

        static 
        {
            a = new CheckPoint("LANDING_PAGE_BTN_CLICK", 0);
            b = new CheckPoint("UNIFIED_ACCOUNT_PICKER_SCREEN_ACC_SELECTED", 1);
            c = new CheckPoint("APP_SIGN_IN_BTN_CLICK", 2);
            d = new CheckPoint("LINKING_NO_BTN_CLICKED", 3);
            e = new CheckPoint("LINKING_SIGNIN_BTN_CLICKED", 4);
            f = new CheckPoint("HUB_LANDED", 5);
            g = new CheckPoint("MNV_FLOW_LANDED", 6);
            h = new CheckPoint("LINKING_TOU_FLOW_LANDED", 7);
            i = new CheckPoint("LINKING_COMPLETED_SCREEN", 8);
            j = new CheckPoint("APP_SIGN_IN_SCREEN_LOADED", 9);
            k = new CheckPoint("UNIFIED_ACCOUNT_PICKER_SCREEN_LOADED", 10);
            l = (new CheckPoint[] {
                a, b, c, d, e, f, g, h, i, j, 
                k
            });
        }

        private CheckPoint(String s, int i1)
        {
            super(s, i1);
        }
    }


    private StopWatch a;
    private boolean b;
    private String c;
    private boolean d;
    private long e;
    private String f;
    private String g;
    private Analytics h;
    private EcsConfiguration i;
    private AnalyticsPersistentStorage j;

    public SignInDurationReporter(Analytics analytics, EcsConfiguration ecsconfiguration, AnalyticsPersistentStorage analyticspersistentstorage)
    {
        e = 0L;
        a = new StopWatch();
        b = true;
        h = analytics;
        i = ecsconfiguration;
        j = analyticspersistentstorage;
    }

    private String a()
    {
        com.skype.android.app.signin.SignInConstants.FlowType flowtype;
        if (i.isAccountDisambiguationSupported())
        {
            flowtype = com.skype.android.app.signin.SignInConstants.FlowType.UNIFIED;
        } else
        {
            flowtype = com.skype.android.app.signin.SignInConstants.FlowType.SIMPLIFIED;
        }
        return String.valueOf(flowtype);
    }

    private void b()
    {
        b = false;
        a = new StopWatch();
        a.a();
    }

    public final void a(CheckPoint checkpoint)
    {
        a(checkpoint, null, false);
    }

    public final void a(CheckPoint checkpoint, String s)
    {
        a(checkpoint, null, false, s);
    }

    public final void a(CheckPoint checkpoint, String s, boolean flag)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[CheckPoint.values().length];
                try
                {
                    a[CheckPoint.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[CheckPoint.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[CheckPoint.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[CheckPoint.f.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[CheckPoint.g.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[CheckPoint.i.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[CheckPoint.h.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[CheckPoint.a.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[CheckPoint.b.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[CheckPoint.k.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[CheckPoint.j.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[checkpoint.ordinal()];
        JVM INSTR tableswitch 1 7: default 52
    //                   1 53
    //                   2 68
    //                   3 68
    //                   4 73
    //                   5 73
    //                   6 73
    //                   7 213;
           goto _L1 _L2 _L3 _L3 _L4 _L4 _L4 _L5
_L1:
        return;
_L2:
        b();
        c = s;
        d = flag;
        return;
_L3:
        b();
        return;
_L4:
        if (!b)
        {
            e = e + a.c();
            a.b();
            b = true;
            checkpoint = Analytics.f(e);
            s = AnalyticsEvent.dd;
            AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
            analyticsparametercontainer.a(AnalyticsParameter.z, a());
            analyticsparametercontainer.a(AnalyticsParameter.A, c);
            analyticsparametercontainer.a(AnalyticsParameter.B, Boolean.valueOf(d));
            analyticsparametercontainer.a(AnalyticsParameter.E, checkpoint);
            analyticsparametercontainer.a(AnalyticsParameter.F, j.b());
            h.a(s, analyticsparametercontainer);
            e = 0L;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (!b)
        {
            e = e + a.c();
            a.b();
            b = true;
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void a(CheckPoint checkpoint, String s, boolean flag, String s1)
    {
        _cls1.a[checkpoint.ordinal()];
        JVM INSTR tableswitch 8 11: default 40
    //                   8 41
    //                   9 41
    //                   10 52
    //                   11 52;
           goto _L1 _L2 _L2 _L3 _L3
_L1:
        return;
_L2:
        b();
        f = s1;
        return;
_L3:
        if (!b)
        {
            d = flag;
            c = s;
            g = s1;
            e = e + a.c();
            a.b();
            b = true;
            checkpoint = Analytics.f(e);
            s = AnalyticsEvent.de;
            s1 = new AnalyticsParameterContainer();
            s1.a(AnalyticsParameter.z, a());
            s1.a(AnalyticsParameter.A, c);
            s1.a(AnalyticsParameter.B, Boolean.valueOf(d));
            s1.a(AnalyticsParameter.C, f);
            s1.a(AnalyticsParameter.D, g);
            s1.a(AnalyticsParameter.E, checkpoint);
            s1.a(AnalyticsParameter.F, j.b());
            h.a(s, s1);
            e = 0L;
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
