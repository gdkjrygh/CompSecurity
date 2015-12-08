// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.slideshow;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import ekk;
import ekm;
import ekp;
import ekq;
import ekw;
import elt;
import em;
import emp;
import euv;
import gap;
import imf;
import java.util.List;
import nux;
import nuy;
import olm;
import onh;

public class SlideshowService extends Service
{

    private static final onh a = new onh("null_cursor_debug");
    private static final ekk b = (new ekm()).a(elt).a();
    private Handler c;
    private Bundle d;
    private int e;
    private boolean f;
    private android.os.PowerManager.WakeLock g;
    private android.net.wifi.WifiManager.WifiLock h;

    public SlideshowService()
    {
        e = -1;
    }

    public static Bundle a(SlideshowService slideshowservice)
    {
        return slideshowservice.d;
    }

    public static emp a(SlideshowService slideshowservice, Bundle bundle)
    {
        ekq ekq1 = (ekq)bundle.getParcelable("com.google.android.apps.photos.core.media_collection");
        bundle = (ekw)bundle.getParcelable("com.google.android.apps.photos.core.query_options");
        return new emp(slideshowservice.getApplicationContext(), ekq1, bundle, b);
    }

    private static String a(ekp ekp1)
    {
        if (ekp1 == null)
        {
            return null;
        }
        ekp1 = ((elt)ekp1.a(elt)).e();
        if (ekp1.g().e())
        {
            return ekp1.b().toString();
        } else
        {
            return ekp1.a();
        }
    }

    public static onh a()
    {
        return a;
    }

    private void a(int i)
    {
        c.sendEmptyMessageDelayed(1, i);
    }

    public static void a(Context context)
    {
        Intent intent = new Intent(context, com/google/android/apps/photos/slideshow/SlideshowService);
        intent.setAction("com.google.android.apps.photos.STOP_SLIDESHOW");
        context.startService(intent);
    }

    public static void a(Context context, ekq ekq1, ekw ekw1, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.apps.photos.core.media_collection", ekq1);
        bundle.putParcelable("com.google.android.apps.photos.core.query_options", ekw1);
        ekq1 = new Intent(context, com/google/android/apps/photos/slideshow/SlideshowService);
        ekq1.setAction("com.google.android.apps.photos.START_SLIDESHOW");
        ekq1.putExtra("slideshow_arguments", bundle);
        ekq1.putExtra("slideshow_position", i);
        context.startService(ekq1);
    }

    public static void a(SlideshowService slideshowservice, List list)
    {
        Object obj1 = null;
        slideshowservice.e = slideshowservice.e + 1;
        nux nux1 = (nux)olm.a(slideshowservice.getApplicationContext(), nux);
        Bundle bundle = new Bundle(slideshowservice.d);
        if (slideshowservice.e >= list.size() || !slideshowservice.f)
        {
            slideshowservice.d();
            return;
        }
        Object obj = (ekp)list.get(slideshowservice.e);
        if (nux1.a())
        {
            int i;
            if (slideshowservice.e < list.size() - 1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                list = (ekp)list.get(slideshowservice.e + 1);
            } else
            {
                list = null;
            }
            i = slideshowservice.e;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = new nuy(a(((ekp) (obj))), ((ekp) (obj)).c().g);
            }
            if (list == null)
            {
                list = obj1;
            } else
            {
                list = new nuy(a(((ekp) (list))), list.c().g);
            }
            nux1.a(bundle, i, ((nuy) (obj)), list);
        }
        slideshowservice.e();
        slideshowservice.a(5000);
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (((nux)olm.a(getApplicationContext(), nux)).a())
        {
            h.acquire();
        }
        g.acquire();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b(Context context)
    {
        Intent intent = new Intent(context, com/google/android/apps/photos/slideshow/SlideshowService);
        intent.setAction("com.google.android.apps.photos.QUERY_STATE");
        context.startService(intent);
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (h.isHeld())
        {
            h.release();
        }
        if (g.isHeld())
        {
            g.release();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void d()
    {
        c.removeCallbacksAndMessages(null);
        f = false;
        e();
        c();
        return;
        Exception exception;
        exception;
        c();
        throw exception;
    }

    private void e()
    {
        Intent intent = new Intent("com.google.android.apps.photos.SLIDESHOW_STATE");
        intent.putExtra("slideshow_playing", f);
        intent.putExtra("slideshow_position", e);
        em.a(getApplicationContext()).a(intent);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        c = new Handler(new imf(this));
        g = ((PowerManager)getSystemService("power")).newWakeLock(1, "SLIDE_SHOW_WAKE_LOCK");
        h = ((WifiManager)getSystemService("wifi")).createWifiLock(1, "SLIDE_SHOW_WIFI_LOCK");
    }

    public void onDestroy()
    {
        if (f)
        {
            d();
        }
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent != null && intent.getAction() != null) goto _L2; else goto _L1
_L1:
        return 2;
_L2:
        if ("com.google.android.apps.photos.START_SLIDESHOW".equals(intent.getAction()))
        {
            b();
            if (f)
            {
                d();
            }
            d = intent.getBundleExtra("slideshow_arguments");
            e = intent.getIntExtra("slideshow_position", 0);
            f = true;
            a(0);
            return 2;
        }
        if ("com.google.android.apps.photos.STOP_SLIDESHOW".equals(intent.getAction()))
        {
            d();
            stopSelfResult(j);
            return 2;
        }
        if (!"com.google.android.apps.photos.QUERY_STATE".equals(intent.getAction()))
        {
            continue; /* Loop/switch isn't completed */
        }
        e();
        if (f) goto _L1; else goto _L3
_L3:
        stopSelfResult(j);
        return 2;
        if (!"com.google.android.apps.photos.STOP_CASTING".equals(intent.getAction())) goto _L1; else goto _L4
_L4:
        d();
        stopSelfResult(j);
        ((nux)olm.a(getApplicationContext(), nux)).b();
        return 2;
    }

}
