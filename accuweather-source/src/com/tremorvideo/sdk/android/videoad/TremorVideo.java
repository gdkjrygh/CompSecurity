// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import java.util.Map;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, dw, cj, Playvideo, 
//            AdViewManager, Settings

public class TremorVideo
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a e[];
        private String d;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/tremorvideo/sdk/android/videoad/TremorVideo$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        public String toString()
        {
            return d;
        }

        static 
        {
            a = new a("Default", 0, "Default");
            b = new a("AppStart", 1, "App Start");
            c = new a("PreRoll", 2, "Pre Roll");
            e = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i, String s1)
        {
            super(s, i);
            d = s1;
        }
    }


    private static boolean a = false;
    private static Context b = null;
    private static long c = 0L;

    public TremorVideo()
    {
    }

    public static void destroy()
    {
        if (a)
        {
            ct.A();
            ct.b();
            a = false;
            b = null;
            c = 0L;
        }
    }

    public static String getSDKVersion()
    {
        return ct.w();
    }

    public static void handleAnalyticsEvent(Activity activity, String s)
    {
        if (a)
        {
            ct.a(activity, s);
        }
    }

    public static void handleAnalyticsEvent(Activity activity, String s, Map map)
    {
        if (a)
        {
            ct.a(activity, s, map);
        }
    }

    public static void handleAnalyticsStateChange(Activity activity, String s)
    {
        if (a)
        {
            ct.b(activity, s);
        }
    }

    public static void initialize(Context context, String s)
    {
        if (!a)
        {
            a = true;
            b = context;
            ct.a(context, new String[] {
                s
            });
            c = 0L;
        }
    }

    public static void initialize(Context context, String as[])
    {
        if (!a)
        {
            a = true;
            b = context;
            ct.a(context, as);
            c = 0L;
        }
    }

    public static boolean showAd(Activity activity, int i)
        throws Exception
    {
        ct.d("TremorDebug: TremorVideo.ShowAd - Starting");
        if (!a)
        {
            ct.d(" TremorDebug: TremorVideo.ShowAd - not initialized return false");
            return false;
        }
        if (showAd(activity, ct.n(), i))
        {
            ct.d("TremorDebug: TremorVideo.ShowAd - return true");
            return true;
        } else
        {
            ct.d("TremorDebug: TremorVideo.ShowAd - return false");
            return false;
        }
    }

    public static boolean showAd(Activity activity, String s, int i)
        throws Exception
    {
        ct.d("TremorDebug: startAd - start");
        if (a)
        {
            dw dw1 = ct.y();
            if (!dw1.a(s))
            {
                ct.d("TremorDebug: startAd - start");
                dw1.f(s);
                long l = ct.B();
                if (l - c >= 2000L)
                {
                    ct.d("Sending Avail...");
                    c = l;
                    cj.a(activity, dw1.e());
                    return false;
                }
            } else
            {
                ct.d("TremorDebug: startAd - calling startAdView");
                if (!dw1.e(s))
                {
                    ct.d("TremorDebug: startAd - startAdView returned false. Throw an exception");
                    throw new Exception("An ad has already been started.");
                }
                ct.d("TremorDebug: startAd - returned true. Start the play video activity");
                ct.d((new StringBuilder()).append("Starting ad for: ").append(s).toString());
                s = new Intent(b, com/tremorvideo/sdk/android/videoad/Playvideo);
                s.putExtra("tremorVideoType", "ad");
                try
                {
                    ct.d("TremorDebug: startAd - starting activity");
                    activity.startActivityForResult(s, i);
                }
                // Misplaced declaration of an exception variable
                catch (Activity activity)
                {
                    ct.d("TremorDebug: startAd - Exception starting activity");
                    throw new Exception("Unable to create the ad intent. Make sure you add the 'com.tremorvideo.sdk.android.videoad.Playvideo' activity to your AndroiManifest.xml.");
                }
                return true;
            }
        }
        return false;
    }

    public static AdViewManager showAdManual(Activity activity, ViewGroup viewgroup)
        throws Exception
    {
        if (!a)
        {
            return null;
        } else
        {
            return showAdManual(activity, ct.n(), viewgroup);
        }
    }

    public static AdViewManager showAdManual(Activity activity, String s, ViewGroup viewgroup)
        throws Exception
    {
        if (a)
        {
            dw dw1 = ct.y();
            if (!dw1.c(s))
            {
                dw1.f(s);
                long l = ct.B();
                if (l - c >= 2000L)
                {
                    ct.d("Sending Avail...");
                    c = l;
                    cj.a(activity, dw1.e());
                    return null;
                }
            } else
            if (!dw1.e(s))
            {
                throw new Exception("An ad has already been started.");
            } else
            {
                return new AdViewManager(activity, viewgroup, dw1.d());
            }
        }
        return null;
    }

    public static void start()
    {
        if (a)
        {
            ct.z();
            ct.y().c();
        }
    }

    public static void stop()
    {
        if (a)
        {
            ct.A();
            ct.y().b();
        }
    }

    public static void updateSettings(Settings settings)
    {
        if (a)
        {
            ct.a(settings);
        }
    }

}
