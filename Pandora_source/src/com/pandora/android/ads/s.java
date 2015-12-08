// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.widget.FrameLayout;
import com.pandora.android.data.u;
import com.pandora.android.provider.b;
import com.pandora.android.provider.c;
import com.yume.android.sdk.YuMeAdBlockType;
import com.yume.android.sdk.YuMeAdEvent;
import com.yume.android.sdk.YuMeAdParams;
import com.yume.android.sdk.YuMeAppInterface;
import com.yume.android.sdk.YuMeDownloadStatus;
import com.yume.android.sdk.YuMeException;
import com.yume.android.sdk.YuMeSDKInterface;
import com.yume.android.sdk.YuMeSDKInterfaceImpl;
import com.yume.android.sdk.YuMeStorageMode;
import java.util.Locale;
import p.df.a;

// Referenced classes of package com.pandora.android.ads:
//            VideoAdManager

public class s
    implements YuMeAppInterface
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final a f[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/pandora/android/ads/s$a, s1);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        static 
        {
            a = new a("EmptyAdReceived", 0);
            b = new a("AdFailed", 1);
            c = new a("AdRequestTimedOut", 2);
            d = new a("EmptyAdInCache", 3);
            e = new a("OtherAdReadyType", 4);
            f = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s1, int l)
        {
            super(s1, l);
        }
    }

    public static class b extends com.pandora.radio.util.b
    {

        private static volatile s a = null;

        public static s a()
        {
            com/pandora/android/ads/s$b;
            JVM INSTR monitorenter ;
            s s1;
            if (a == null)
            {
                a = new s();
            }
            s1 = a;
            com/pandora/android/ads/s$b;
            JVM INSTR monitorexit ;
            return s1;
            Exception exception;
            exception;
            com/pandora/android/ads/s$b;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public static void b()
        {
            a();
        }

        public static void c()
        {
            if (a != null && com.pandora.android.ads.s.a(a))
            {
                try
                {
                    s.f().YuMeSDK_DeInit();
                }
                catch (Exception exception)
                {
                    com.pandora.android.ads.s.a(a, "Error with YuMe deinit", exception);
                }
                com.pandora.android.ads.s.a(null);
                com.pandora.android.ads.s.a(a, false);
            }
        }


        public b()
        {
        }
    }


    private static YuMeSDKInterface a = null;
    private Activity b;
    private boolean c;
    private boolean d;
    private Handler e;
    private u f;
    private String g;
    private boolean h;
    private String i;
    private String j;
    private String k;

    private s()
    {
        c = false;
        d = false;
        k = "preroll";
        e = new Handler();
    }


    static YuMeSDKInterface a(YuMeSDKInterface yumesdkinterface)
    {
        a = yumesdkinterface;
        return yumesdkinterface;
    }

    static void a(s s1, String s2, Exception exception)
    {
        s1.a(s2, exception);
    }

    private void a(YuMeAdParams yumeadparams)
    {
        d((new StringBuilder()).append("YuMe adParam.adServerUrl=").append(yumeadparams.adServerUrl).toString());
        d((new StringBuilder()).append("YuMe adParam.domainId=").append(yumeadparams.domainId).toString());
        d((new StringBuilder()).append("YuMe adParam.qsParams=").append(yumeadparams.qsParams).toString());
        d((new StringBuilder()).append("YuMe adParam.adTimeout=").append(yumeadparams.adTimeout).toString());
        d((new StringBuilder()).append("YuMe adParam.videoTimeout=").append(yumeadparams.videoTimeout).toString());
        d((new StringBuilder()).append("YuMe adParam.bSupportMP4=").append(yumeadparams.bSupportMP4).toString());
        d((new StringBuilder()).append("YuMe adParam.bSupport3GPP=").append(yumeadparams.bSupport3GPP).toString());
        d((new StringBuilder()).append("YuMe adParam.bSupportHighBitRate=").append(yumeadparams.bSupportHighBitRate).toString());
        d((new StringBuilder()).append("YuMe adParam.bSupportAutoNetworkDetect=").append(yumeadparams.bSupportAutoNetworkDetect).toString());
        d((new StringBuilder()).append("YuMe adParam.bEnableCaching=").append(yumeadparams.bEnableCaching).toString());
        d((new StringBuilder()).append("YuMe adParam.bEnableAutoPrefetch=").append(yumeadparams.bEnableAutoPrefetch).toString());
        d((new StringBuilder()).append("YuMe adParam.storageSize=").append(yumeadparams.storageSize).toString());
        d((new StringBuilder()).append("YuMe adParam.bEnableCBToggle=").append(yumeadparams.bEnableCBToggle).toString());
        d((new StringBuilder()).append("YuMe adParam.bEnableLocationSupport=").append(yumeadparams.bEnableLocationSupport).toString());
        d((new StringBuilder()).append("YuMe adParam.bEnableFileLogging=").append(yumeadparams.bEnableFileLogging).toString());
        d((new StringBuilder()).append("YuMe adParam.bEnableConsoleLogging=").append(yumeadparams.bEnableConsoleLogging).toString());
        d((new StringBuilder()).append("YuMe adParam.storageMode=").append(yumeadparams.storageMode).toString());
        d((new StringBuilder()).append("YuMe adParam.bRequireVastAds=").append(yumeadparams.bRequireVastAds).toString());
    }

    private void a(String s1, Exception exception)
    {
        p.df.a.c("YuMeInterfaceHelper", s1, exception);
    }

    static boolean a(s s1)
    {
        return s1.h;
    }

    static boolean a(s s1, boolean flag)
    {
        s1.h = flag;
        return flag;
    }

    private a b(String s1)
    {
        if ("Empty Ad Received.".equals(s1))
        {
            return com.pandora.android.ads.a.a;
        }
        if ("Ad Request Timed Out.".equals(s1))
        {
            return com.pandora.android.ads.a.c;
        }
        if ("Ad Failed.".equals(s1))
        {
            return com.pandora.android.ads.a.b;
        }
        if ("Empty Ad in Cache.".equals(s1))
        {
            return a.d;
        } else
        {
            return a.e;
        }
    }

    static void b(s s1)
    {
        s1.g();
    }

    private static YuMeAdBlockType c(String s1)
    {
        YuMeAdBlockType yumeadblocktype = YuMeAdBlockType.PREROLL;
        if (s1 != null)
        {
            if (s1.equalsIgnoreCase("preroll"))
            {
                return YuMeAdBlockType.PREROLL;
            }
            if (s1.equalsIgnoreCase("none"))
            {
                return YuMeAdBlockType.NONE;
            }
            if (s1.equalsIgnoreCase("midroll"))
            {
                return YuMeAdBlockType.MIDROLL;
            }
            if (s1.equalsIgnoreCase("postroll"))
            {
                return YuMeAdBlockType.POSTROLL;
            }
        }
        return yumeadblocktype;
    }

    static void c(s s1)
    {
        s1.h();
    }

    private void d(String s1)
    {
        p.df.a.c("YuMeInterfaceHelper", s1);
    }

    static YuMeSDKInterface f()
    {
        return a;
    }

    private void g()
    {
        if (h)
        {
            return;
        }
        if (!j())
        {
            d("Bailing on initting YuMe, due to OS build number being too low");
            return;
        }
        if (i == null || j == null)
        {
            d((new StringBuilder()).append("Bailing on initting YuMe, due to yumeAdServer (").append(i).append(") and/or yumeDomain + (").append(j).append(") being null").toString());
            return;
        }
        try
        {
            YuMeAdParams yumeadparams = new YuMeAdParams();
            yumeadparams.adServerUrl = i;
            yumeadparams.domainId = j;
            yumeadparams.qsParams = null;
            yumeadparams.adTimeout = 8;
            yumeadparams.videoTimeout = 8;
            yumeadparams.bRequireVastAds = Boolean.valueOf(true);
            yumeadparams.bSupportMP4 = Boolean.valueOf(false);
            yumeadparams.bSupport3GPP = Boolean.valueOf(false);
            yumeadparams.bSupportHighBitRate = Boolean.valueOf(false);
            yumeadparams.bSupportAutoNetworkDetect = Boolean.valueOf(false);
            yumeadparams.bEnableCaching = Boolean.valueOf(true);
            yumeadparams.bEnableAutoPrefetch = Boolean.valueOf(false);
            yumeadparams.storageSize = 10F;
            yumeadparams.bEnableCBToggle = Boolean.valueOf(true);
            yumeadparams.bEnableLocationSupport = Boolean.valueOf(true);
            yumeadparams.bEnableFileLogging = Boolean.valueOf(p.df.a.a());
            yumeadparams.bEnableConsoleLogging = Boolean.valueOf(p.df.a.a());
            yumeadparams.storageMode = YuMeStorageMode.EXTERNAL_STORAGE;
            long l = System.currentTimeMillis();
            a = new YuMeSDKInterfaceImpl();
            a(yumeadparams);
            a.YuMeSDK_Init(yumeadparams, this);
            d((new StringBuilder()).append("YuMe: YuMeSDK_Init time = ").append(System.currentTimeMillis() - l).toString());
            h = true;
            return;
        }
        catch (Exception exception)
        {
            a("Error with YuMe init", exception);
        }
    }

    private void h()
    {
        if (!h)
        {
            p.df.a.c("YuMeInterfaceHelper", "YuMe: prefetchAd() called, but YuMe is not initialized");
            return;
        }
        YuMeAdBlockType yumeadblocktype = YuMeAdBlockType.PREROLL;
        try
        {
            a.YuMeSDK_InitAd(yumeadblocktype);
            return;
        }
        catch (Exception exception)
        {
            p.df.a.c("YuMeInterfaceHelper", "Error with YuMe ad prefetch", exception);
        }
        i();
    }

    private void i()
    {
        if (f != null)
        {
            f.H();
            f = null;
        }
    }

    private static boolean j()
    {
        return android.os.Build.VERSION.SDK_INT >= 8;
    }

    public void YuMeApp_EventListener(YuMeAdBlockType yumeadblocktype, YuMeAdEvent yumeadevent, String s1)
    {
        String s2;
        if (yumeadblocktype == null)
        {
            yumeadblocktype = "?";
        } else
        {
            yumeadblocktype = yumeadblocktype.toString();
        }
        if (yumeadevent == null)
        {
            s2 = "?";
        } else
        {
            s2 = yumeadevent.toString();
        }
        d(String.format("YuMeSDK_Event: YuMeAdBlockType=%s; YuMeAdEvent=%s; eventInfo=%s", new Object[] {
            yumeadblocktype, s2, s1
        }));
        if (yumeadevent != null) goto _L2; else goto _L1
_L1:
        d("YuMeSDK_Event is null, skipping YuMeApp_EventListener");
_L12:
        return;
_L2:
        static class _cls2
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[YuMeAdEvent.values().length];
                try
                {
                    b[YuMeAdEvent.AD_READY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    b[YuMeAdEvent.AD_AND_ASSETS_READY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    b[YuMeAdEvent.AD_NOT_READY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    b[YuMeAdEvent.AD_PRESENT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    b[YuMeAdEvent.AD_ABSENT.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    b[YuMeAdEvent.AD_PLAYING.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[YuMeAdEvent.AD_COMPLETED.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[YuMeAdEvent.AD_ERROR.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[YuMeAdEvent.AD_EXPIRED.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                a = new int[a.values().length];
                try
                {
                    a[a.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.pandora.android.ads.a.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.pandora.android.ads.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.android.ads.a.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.pandora.android.ads._cls2.b[yumeadevent.ordinal()];
        JVM INSTR tableswitch 1 9: default 132
    //                   1 55
    //                   2 133
    //                   3 139
    //                   4 55
    //                   5 55
    //                   6 185
    //                   7 191
    //                   8 197
    //                   9 203;
           goto _L3 _L4 _L5 _L6 _L4 _L4 _L7 _L8 _L9 _L10
_L4:
        continue; /* Loop/switch isn't completed */
_L7:
        break; /* Loop/switch isn't completed */
_L3:
        return;
_L5:
        c = true;
        return;
_L6:
        c = false;
        switch (com.pandora.android.ads._cls2.a[b(s1).ordinal()])
        {
        default:
            i();
            return;

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        if (true) goto _L12; else goto _L11
_L11:
        d = true;
        return;
_L8:
        a(true);
        return;
_L9:
        a(false);
        return;
_L10:
        c = false;
        i();
        return;
    }

    public Context YuMeApp_GetActivityContext()
    {
        return b;
    }

    public Context YuMeApp_GetApplicationContext()
    {
        return com.pandora.android.provider.b.a.h();
    }

    public void a()
    {
        if (!h)
        {
            p.df.a.b("YuMeInterfaceHelper", "YuMe: logYuMeStatus, but YuMe is not initialized");
            return;
        }
        try
        {
            YuMeDownloadStatus yumedownloadstatus = a.YuMeSDK_GetDownloadStatus();
            float f1 = a.YuMeSDK_GetDownloadedPercentage();
            p.df.a.b("YuMeInterfaceHelper", String.format(Locale.getDefault(), "YuMe state: %s, download percent = %f", new Object[] {
                yumedownloadstatus.toString(), Float.valueOf(f1)
            }));
            return;
        }
        catch (Exception exception)
        {
            p.df.a.c("YuMeInterfaceHelper", "Error with logYuMeStatus", exception);
        }
    }

    public void a(Activity activity)
    {
        this;
        JVM INSTR monitorenter ;
        b = activity;
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public void a(FrameLayout framelayout)
    {
        if (!h)
        {
            return;
        }
        try
        {
            a.YuMeSDK_SetParentView(framelayout);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FrameLayout framelayout)
        {
            p.df.a.c("YuMeInterfaceHelper", "Error with YuMe set parent view", framelayout);
        }
    }

    public void a(u u1)
    {
        f = u1;
        i = u1.m();
        j = u1.r();
        k = u1.s();
        e.post(new Runnable() {

            final s a;

            public void run()
            {
                com.pandora.android.ads.s.b(a);
                if (com.pandora.android.ads.s.a(a))
                {
                    com.pandora.android.ads.s.c(a);
                }
            }

            
            {
                a = s.this;
                super();
            }
        });
    }

    public void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        g = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (d) goto _L2; else goto _L1
_L1:
        p.df.a.c("YuMeInterfaceHelper", " ---- YuMeInterfaceHelper.setAdComplete(); video ad was not playing, so not attempting to restart audio.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        p.df.a.c("YuMeInterfaceHelper", " ---- YuMeInterfaceHelper.setAdComplete(); video ad was playing, so attempting to restart audio.");
        d = false;
        b.finish();
        b = null;
        if ((com.pandora.android.data.s)com.pandora.android.provider.c.a(g) != null)
        {
            com.pandora.android.ads.VideoAdManager.c.a().a(g, null);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean b()
    {
        return h && c;
    }

    public void c()
    {
        if (!h)
        {
            return;
        }
        try
        {
            a.YuMeSDK_BackKeyPressed();
            return;
        }
        catch (Exception exception)
        {
            p.df.a.c("YuMeInterfaceHelper", "Error with YuMe back key", exception);
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public void d()
    {
        if (!h)
        {
            return;
        }
        try
        {
            a.YuMeSDK_StopAd();
            return;
        }
        catch (Exception exception)
        {
            p.df.a.c("YuMeInterfaceHelper", "Error with YuMe stop ad", exception);
        }
    }

    public boolean e()
    {
        boolean flag = true;
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag2 = h;
        if (flag2) goto _L2; else goto _L1
_L1:
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        YuMeAdBlockType yumeadblocktype = c(k);
        d = true;
        a.YuMeSDK_ShowAd(yumeadblocktype);
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        p.df.a.c("YuMeInterfaceHelper", "Error with YuMe display ad", ((Throwable) (obj)));
        a(false);
        flag = false;
        continue; /* Loop/switch isn't completed */
        obj;
        p.df.a.c("YuMeInterfaceHelper", "Error with YuMe display ad", ((Throwable) (obj)));
        a(false);
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
    }

}
