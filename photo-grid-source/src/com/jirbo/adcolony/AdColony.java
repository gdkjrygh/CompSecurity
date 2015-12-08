// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Handler;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.jirbo.adcolony:
//            a, ADCVideo, d, b, 
//            c, l, t, g, 
//            u, ac, ad, h, 
//            AdColonyV4VCAd, AdColonyNativeAdView, AdColonyAdAvailabilityListener, AdColonyV4VCListener

public class AdColony
{

    static boolean b;
    boolean a;

    public AdColony()
    {
        a = false;
    }

    public static Activity activity()
    {
        return com.jirbo.adcolony.a.b();
    }

    public static void addAdAvailabilityListener(AdColonyAdAvailabilityListener adcolonyadavailabilitylistener)
    {
        if (a.af.contains(adcolonyadavailabilitylistener))
        {
            return;
        } else
        {
            a.af.add(adcolonyadavailabilitylistener);
            return;
        }
    }

    public static void addV4VCListener(AdColonyV4VCListener adcolonyv4vclistener)
    {
        if (a.ae.contains(adcolonyv4vclistener))
        {
            return;
        } else
        {
            a.ae.add(adcolonyv4vclistener);
            return;
        }
    }

    public static void cancelVideo()
    {
        if (a.K != null)
        {
            a.K.finish();
            a.aa = true;
            a.M.b(null);
        }
    }

    public static transient void configure(Activity activity1, String s, String s1, String as[])
    {
        Handler handler;
        _cls1 _lcls1;
        b = false;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            (new a(activity1)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else
        {
            (new a(activity1)).execute(new Void[0]);
        }
        com.jirbo.adcolony.a.ag.clear();
        handler = new Handler();
        _lcls1 = new _cls1();
        if (com.jirbo.adcolony.a.y && !com.jirbo.adcolony.a.z) goto _L2; else goto _L1
_L1:
        if (!com.jirbo.adcolony.a.q) goto _L4; else goto _L3
_L3:
        return;
_L4:
        if (s1 == null)
        {
            com.jirbo.adcolony.a.a("Null App ID - disabling AdColony.");
            return;
        }
        if (as == null)
        {
            com.jirbo.adcolony.a.a("Null Zone IDs array - disabling AdColony.");
            return;
        }
        if (as.length == 0)
        {
            com.jirbo.adcolony.a.a("No Zone IDs provided - disabling AdColony.");
            return;
        }
        com.jirbo.adcolony.a.b(activity1);
        com.jirbo.adcolony.a.l.a(s, s1, as);
        com.jirbo.adcolony.a.o = true;
        com.jirbo.adcolony.a.y = true;
        handler.postDelayed(_lcls1, 0x1d4c0L);
_L2:
        if (com.jirbo.adcolony.a.K == null)
        {
            com.jirbo.adcolony.a.v = true;
        }
        com.jirbo.adcolony.a.ae.clear();
        com.jirbo.adcolony.a.af.clear();
        com.jirbo.adcolony.a.ah = new HashMap();
        int i = 0;
        while (i < as.length) 
        {
            com.jirbo.adcolony.a.ah.put(as[i], Boolean.valueOf(false));
            i++;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public static void disable()
    {
        com.jirbo.adcolony.a.q = true;
    }

    public static void disableDECOverride()
    {
        com.jirbo.adcolony.a.e = null;
    }

    public static void forceMobileCache()
    {
        if (!com.jirbo.adcolony.a.E)
        {
            com.jirbo.adcolony.a.E = true;
            com.jirbo.adcolony.a.y = false;
            com.jirbo.adcolony.a.l.b.d = true;
            com.jirbo.adcolony.a.l.b.b = false;
            com.jirbo.adcolony.a.l.b.c = true;
        }
    }

    public static String getCustomID()
    {
        return com.jirbo.adcolony.a.l.a.x;
    }

    public static String getDeviceID()
    {
        return com.jirbo.adcolony.a.l.a.y;
    }

    public static int getRemainingV4VCForZone(String s)
    {
        if (com.jirbo.adcolony.a.l == null || com.jirbo.adcolony.a.l.h == null || com.jirbo.adcolony.a.l.b == null || com.jirbo.adcolony.a.l.b.j == null || com.jirbo.adcolony.a.l.b.j.n == null)
        {
            return l.c.c("getRemainingV4VCForZone called before AdColony has finished configuring.");
        }
        n.ab ab = com.jirbo.adcolony.a.l.b.j.n.a(s);
        if (ab == null)
        {
            return l.c.c("getRemainingV4VCForZone called before AdColony has finished configuring, or the zone passed in is invalid.");
        }
        if (!ab.j.a)
        {
            return l.c.c("getRemainingV4VCForZone called with non-V4VC zone.");
        } else
        {
            return ab.j.b.a - com.jirbo.adcolony.a.l.h.b(s);
        }
    }

    public static void get_images(String s)
    {
        com.jirbo.adcolony.a.l.a.b(s);
    }

    public static boolean isTablet()
    {
        return g.i();
    }

    public static boolean isZoneNative(String s)
    {
        if (com.jirbo.adcolony.a.l != null && com.jirbo.adcolony.a.l.b != null && com.jirbo.adcolony.a.l.b.j != null && com.jirbo.adcolony.a.l.b.j.n != null && com.jirbo.adcolony.a.l.b.j.n.a(s) != null && com.jirbo.adcolony.a.l.b.j.n.a(s).i != null && com.jirbo.adcolony.a.l.b.j.n.a(s).i.a != null)
        {
            int i = 0;
            while (i < com.jirbo.adcolony.a.l.b.j.n.a(s).i.a.size()) 
            {
                if (com.jirbo.adcolony.a.l.b.j.n.a(s).i.a(i).w.a)
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static boolean isZoneV4VC(String s)
    {
        while (com.jirbo.adcolony.a.l == null || com.jirbo.adcolony.a.l.b == null || com.jirbo.adcolony.a.l.b.j == null || com.jirbo.adcolony.a.l.b.j.n == null) 
        {
            return false;
        }
        return com.jirbo.adcolony.a.l.b.a(s, false);
    }

    public static void notifyIAPComplete(String s, String s1)
    {
        notifyIAPComplete(s, s1, null, 0.0D);
    }

    public static void notifyIAPComplete(String s, String s1, String s2, double d1)
    {
        l.c.b("notifyIAPComplete() called.");
        ADCData.g g1 = new ADCData.g();
        g1.b("product_id", s);
        if (d1 != 0.0D)
        {
            g1.b("price", d1);
        }
        g1.b("trans_id", s1);
        g1.b("quantity", 1);
        if (s2 != null)
        {
            g1.b("price_currency_code", s2);
        }
        if (com.jirbo.adcolony.a.F)
        {
            com.jirbo.adcolony.a.l.d.a("in_app_purchase", g1);
            return;
        } else
        {
            com.jirbo.adcolony.a.Z.a(g1);
            return;
        }
    }

    public static void onBackPressed()
    {
        int i = 0;
        if (com.jirbo.adcolony.a.I != null && ((com.jirbo.adcolony.a.I instanceof ac) || (com.jirbo.adcolony.a.I instanceof ad)))
        {
            ((ViewGroup)com.jirbo.adcolony.a.I.getParent()).removeView(com.jirbo.adcolony.a.I);
            com.jirbo.adcolony.a.v = true;
            com.jirbo.adcolony.a.I.G.c(false);
            for (; i < com.jirbo.adcolony.a.ad.size(); i++)
            {
                ((Bitmap)com.jirbo.adcolony.a.ad.get(i)).recycle();
            }

            com.jirbo.adcolony.a.ad.clear();
            com.jirbo.adcolony.a.I = null;
        }
    }

    public static void pause()
    {
        l.c.b("[ADC] AdColony pause called.");
        com.jirbo.adcolony.a.t = true;
        for (int i = 0; i < com.jirbo.adcolony.a.ag.size(); i++)
        {
            if (com.jirbo.adcolony.a.ag.get(i) == null)
            {
                continue;
            }
            AdColonyNativeAdView adcolonynativeadview = (AdColonyNativeAdView)com.jirbo.adcolony.a.ag.get(i);
            adcolonynativeadview.A = true;
            if (adcolonynativeadview.ad == null || adcolonynativeadview.u || !adcolonynativeadview.ad.isPlaying())
            {
                continue;
            }
            if (com.jirbo.adcolony.a.v)
            {
                adcolonynativeadview.R.setVisibility(0);
            }
            adcolonynativeadview.c();
        }

    }

    public static void removeAdAvailabilityListener(AdColonyAdAvailabilityListener adcolonyadavailabilitylistener)
    {
        com.jirbo.adcolony.a.af.remove(adcolonyadavailabilitylistener);
    }

    public static void removeV4VCListener(AdColonyV4VCListener adcolonyv4vclistener)
    {
        com.jirbo.adcolony.a.ae.remove(adcolonyv4vclistener);
    }

    public static void resume(Activity activity1)
    {
        l.c.b("[ADC] AdColony resume called.");
        com.jirbo.adcolony.a.t = false;
        com.jirbo.adcolony.a.a(activity1);
        com.jirbo.adcolony.a.s = false;
        if (activity1 == null)
        {
            l.d.b("Activity reference is null. Disabling AdColony.");
            disable();
            return;
        } else
        {
            (new Thread(new _cls2(activity1))).start();
            com.jirbo.adcolony.a.D = false;
            return;
        }
    }

    public static void setCustomID(String s)
    {
        if (!s.equals(com.jirbo.adcolony.a.l.a.x))
        {
            com.jirbo.adcolony.a.l.a.x = s;
            com.jirbo.adcolony.a.y = false;
            com.jirbo.adcolony.a.l.b.d = true;
            com.jirbo.adcolony.a.l.b.b = false;
            com.jirbo.adcolony.a.l.b.c = true;
        }
    }

    public static void setDeviceID(String s)
    {
        if (!s.equals(com.jirbo.adcolony.a.l.a.y))
        {
            com.jirbo.adcolony.a.l.a.y = s;
            com.jirbo.adcolony.a.y = false;
            com.jirbo.adcolony.a.l.b.d = true;
            com.jirbo.adcolony.a.l.b.b = false;
            com.jirbo.adcolony.a.l.b.c = true;
        }
    }

    public static String statusForZone(String s)
    {
        if (com.jirbo.adcolony.a.l == null || com.jirbo.adcolony.a.l.b == null || com.jirbo.adcolony.a.l.b.j == null || com.jirbo.adcolony.a.l.b.j.n == null)
        {
            return "unknown";
        }
        if (com.jirbo.adcolony.a.q)
        {
            return "unknown";
        }
        n.ab ab = com.jirbo.adcolony.a.l.b.j.n.a(s);
        if (ab != null)
        {
            if (!ab.e)
            {
                return "off";
            }
            if (ab.f && com.jirbo.adcolony.a.l.b.c(s, true))
            {
                return "active";
            } else
            {
                return "loading";
            }
        }
        if (!com.jirbo.adcolony.a.p)
        {
            return "unknown";
        } else
        {
            return "invalid";
        }
    }

    private class a extends AsyncTask
    {

        Activity a;
        String b;
        boolean c;

        protected transient Void a(Void avoid[])
        {
            try
            {
                avoid = AdvertisingIdClient.getAdvertisingIdInfo(a);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                l.d.b("Google Play Services SDK not installed! Collecting Android Id instead of Advertising Id.");
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                l.d.b("Google Play Services SDK is out of date! Collecting Android Id instead of Advertising Id.");
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                l.d.b("Advertising Id not available! Collecting Android Id instead of Advertising Id.");
                avoid.printStackTrace();
                return null;
            }
            b = avoid.getId();
            c = avoid.isLimitAdTrackingEnabled();
            return null;
        }

        protected void a(Void void1)
        {
            g.a = b;
            g.b = c;
            AdColony.b = true;
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((Void)obj);
        }

        a(Activity activity1)
        {
            b = "";
            a = activity1;
        }
    }


    private class _cls1
        implements Runnable
    {

        public final void run()
        {
            com.jirbo.adcolony.a.y = false;
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements Runnable
    {

        final Activity a;

        public final void run()
        {
            class _cls1
                implements Runnable
            {

                final _cls2 a;

                public void run()
                {
                    for (int i = 0; i < com.jirbo.adcolony.a.ag.size(); i++)
                    {
                        AdColonyNativeAdView adcolonynativeadview = (AdColonyNativeAdView)com.jirbo.adcolony.a.ag.get(i);
                        if (adcolonynativeadview == null || com.jirbo.adcolony.a.b() != adcolonynativeadview.d || adcolonynativeadview.u)
                        {
                            continue;
                        }
                        adcolonynativeadview.A = false;
                        adcolonynativeadview.invalidate();
                        if (adcolonynativeadview.R != null)
                        {
                            adcolonynativeadview.R.a = false;
                            adcolonynativeadview.R.invalidate();
                        }
                    }

                }

                _cls1()
                {
                    a = _cls2.this;
                    super();
                }
            }

            a.runOnUiThread(new _cls1());
        }

        _cls2(Activity activity1)
        {
            a = activity1;
            super();
        }
    }

}
