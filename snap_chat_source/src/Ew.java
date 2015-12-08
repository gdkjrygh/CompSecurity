// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.ui.snapview.SnapViewSessionStopReason;
import com.snapchat.android.util.debug.FeatureFlagManager;
import java.util.HashSet;
import java.util.Set;

public final class Ew
{
    public static final class a
    {

        public boolean a;
        public Long b;
        public Long c;
        public Set d;
        public Long e;
        public double f;
        public hn g;
        public ki h;
        public String i;
        public boolean j;
        public long k;

        protected a()
        {
            a = false;
            b = Long.valueOf(0L);
            c = Long.valueOf(0L);
            d = new HashSet();
            e = Long.valueOf(0L);
            f = 0.0D;
            h = null;
            i = null;
            j = false;
            k = -1L;
        }
    }


    private static final Ew g = new Ew();
    public final BlizzardEventLogger a;
    public final FriendManager b;
    public final Cl c;
    public a d;
    public final Bn e;
    public final Cc f;

    private Ew()
    {
        BlizzardEventLogger blizzardeventlogger = BlizzardEventLogger.a();
        FriendManager friendmanager = FriendManager.e();
        new com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory();
        new PB();
        Cl cl = Cl.a();
        Bn bn = Bn.a();
        Cc cc = Cc.a();
        FeatureFlagManager.a();
        this(blizzardeventlogger, friendmanager, cl, bn, cc);
    }

    private Ew(BlizzardEventLogger blizzardeventlogger, FriendManager friendmanager, Cl cl, Bn bn, Cc cc)
    {
        a = blizzardeventlogger;
        b = friendmanager;
        c = cl;
        d = null;
        e = bn;
        f = cc;
    }

    public static double a(double d1)
    {
        return (double)Math.round(d1 * 10D) / 10D;
    }

    public static Ew a()
    {
        return g;
    }

    public static hJ a(int i)
    {
        switch (i)
        {
        default:
            return hJ.IMAGE;

        case 1: // '\001'
            return hJ.VIDEO;

        case 2: // '\002'
            return hJ.VIDEO_NO_SOUND;
        }
    }

    public static ki b(Bk bk)
    {
        if (bk.mIsShared)
        {
            return ki.OUR;
        }
        if (TextUtils.equals(bk.mPostedStoryId, "my_story_ads79sdf"))
        {
            return ki.MY;
        }
        if (bk.aJ())
        {
            return ki.BRAND;
        } else
        {
            return ki.USER;
        }
    }

    public final void a(Bk bk)
    {
        kc kc1 = new kc();
        kc1.storyType = b(bk);
        kc1.posterId = bk.j();
        kc1.storySnapId = bk.d();
        if (b.n(bk.mUsername))
        {
            kc1.geoFence = "LOCAL";
        }
        kc1.storySnapId = bk.d();
        kc1.snapTime = Double.valueOf(bk.G());
        a.a(kc1);
    }

    public final void a(String s, String s1, String s2, fU fu, long l, long l1, MediaOpenOrigin mediaopenorigin)
    {
        jT jt = new jT();
        jt.posterId = s;
        jt.additionalInfo = fu;
        jt.viewLocation = d.e;
        jt.storyType = ki.OUR;
        jt.adUnitId = s1;
        jt.adRequestClientId = s2;
        jt.adSkipCount = Long.valueOf(l);
        jt.adResolveTimeSec = Double.valueOf((double)l1 / 1000D);
        if (b.n(s))
        {
            jt.geoFence = "LOCAL";
        }
        if (mediaopenorigin != null)
        {
            jt.source = mediaopenorigin.getSourceType();
            Timber.c("StoryUsageAnalytics", "LOG story ad skip: source: %s", new Object[] {
                mediaopenorigin.getSourceType().name()
            });
        }
        a.a(jt);
    }

    public final void a(boolean flag)
    {
        if (d == null)
        {
            d = new a();
        }
        a a1 = d;
        long l;
        if (flag)
        {
            l = 0L;
        } else
        {
            l = 1L;
        }
        a1.e = Long.valueOf(l);
    }

    public final void b()
    {
        if (d == null)
        {
            d = new a();
        }
        d.k = -1L;
    }


    // Unreferenced inner class Ew$1

/* anonymous class */
    public static final class _cls1
    {

        public static final int a[];
        public static final int b[];

        static 
        {
            b = new int[SnapViewSessionStopReason.values().length];
            try
            {
                b[SnapViewSessionStopReason.SKIP_REQUESTED.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror14) { }
            try
            {
                b[SnapViewSessionStopReason.ABORT_REQUESTED.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror13) { }
            try
            {
                b[SnapViewSessionStopReason.TEMPORARY_ABORT_REQUEST.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror12) { }
            try
            {
                b[SnapViewSessionStopReason.TIMER_EXPIRED.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            a = new int[com.snapchat.android.ads.AdRequestError.ErrorCode.values().length];
            try
            {
                a[com.snapchat.android.ads.AdRequestError.ErrorCode.ERROR_CODE_INTERNAL_ERROR.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                a[com.snapchat.android.ads.AdRequestError.ErrorCode.ERROR_CODE_INVALID_REQUEST.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                a[com.snapchat.android.ads.AdRequestError.ErrorCode.ERROR_CODE_NETWORK_ERROR.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                a[com.snapchat.android.ads.AdRequestError.ErrorCode.ERROR_CODE_NO_FILL.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                a[com.snapchat.android.ads.AdRequestError.ErrorCode.ERROR_CODE_UNKNOWN.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[com.snapchat.android.ads.AdRequestError.ErrorCode.CONTENT_NO_FILL.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[com.snapchat.android.ads.AdRequestError.ErrorCode.TIMEOUT.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[com.snapchat.android.ads.AdRequestError.ErrorCode.EMPTY_CONTENT.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[com.snapchat.android.ads.AdRequestError.ErrorCode.INVALID_AD_UNIT_URL.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.snapchat.android.ads.AdRequestError.ErrorCode.ADMANAGER_INACTIVE.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.snapchat.android.ads.AdRequestError.ErrorCode.UNKNOWN.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
