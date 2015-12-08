// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.env;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebView;
import com.google.android.gms.common.e;
import com.vungle.log.Logger;
import com.vungle.publisher.br;
import com.vungle.publisher.bt;
import com.vungle.publisher.bu;
import com.vungle.publisher.dc;
import com.vungle.publisher.dd;
import com.vungle.publisher.device.AudioHelper;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.util.ViewUtils;
import java.util.concurrent.atomic.AtomicBoolean;

public class AndroidDevice
    implements bt
{

    static int a = 5000;
    final AtomicBoolean b = new AtomicBoolean();
    boolean c;
    String d;
    String e;
    String f;
    AudioHelper g;
    WindowManager h;
    Context i;
    EventBus j;
    SharedPreferences k;
    DeviceIdStrategy l;
    private final String m;

    public AndroidDevice()
    {
        m = android.os.Build.VERSION.RELEASE;
    }

    static boolean a(String s1)
    {
        return !TextUtils.isEmpty(s1);
    }

    private void t()
    {
        long l1;
        long l2;
        if (b.get())
        {
            break MISSING_BLOCK_LABEL_125;
        }
        l1 = System.currentTimeMillis();
        l2 = a;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Logger.d("VungleDevice", "waiting for device ID");
_L1:
        long l3;
        if (b.get())
        {
            break MISSING_BLOCK_LABEL_106;
        }
        l3 = System.currentTimeMillis();
        if (l3 >= l1 + l2)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        b.wait(a);
          goto _L1
        Object obj1;
        obj1;
        Logger.v("VungleDevice", "interrupted while awaiting device ID");
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        if (!f())
        {
            Logger.w("VungleDevice", "no device ID available");
        }
        throw obj;
        obj;
        JVM INSTR monitorexit ;
        if (!b.get())
        {
            break MISSING_BLOCK_LABEL_140;
        }
        Logger.d("VungleDevice", "obtained device ID");
        if (!f())
        {
            Logger.w("VungleDevice", "no device ID available");
        }
        return;
        throw new bu((new StringBuilder("timeout after ")).append(a).append(" ms").toString());
    }

    public final String a()
    {
        t();
        return d;
    }

    public final void a(WebView webview)
    {
        webview = ViewUtils.a(webview);
        k.edit().putString("defaultUserAgent", webview).commit();
    }

    public final boolean a(Context context)
    {
        return ((KeyguardManager)context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    public final boolean a(br br1)
    {
        return android.os.Build.VERSION.SDK_INT >= br1.d;
    }

    final boolean b()
    {
        return !TextUtils.isEmpty(d);
    }

    final boolean b(String s1)
    {
        int i1 = com.google.android.gms.common.e.a(i);
        boolean flag;
        if (i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        Logger.i(s1, (new StringBuilder("Google Play Services not available: ")).append(com.google.android.gms.common.e.a(i1)).toString());
        return flag;
        s1;
        flag = false;
_L4:
        Logger.w("VungleConfig", dc.a(s1));
        return flag;
        NoClassDefFoundError noclassdeffounderror;
        noclassdeffounderror;
        flag = false;
_L2:
        Logger.d(s1, (new StringBuilder()).append(noclassdeffounderror.getClass().getSimpleName()).append(": ").append(noclassdeffounderror.getMessage()).toString());
        Logger.v(s1, noclassdeffounderror);
        return flag;
        noclassdeffounderror;
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String c()
    {
        t();
        String s2 = e;
        String s1 = s2;
        if (a(s2))
        {
            s1 = s2;
            if (b())
            {
                Logger.w("VungleDevice", "have advertising and Android ID");
                d();
                s1 = null;
            }
        }
        return s1;
    }

    final void d()
    {
        Logger.i("VungleDevice", "clearing Android ID");
        e = null;
    }

    final void e()
    {
        if (!b.getAndSet(true))
        {
            synchronized (b)
            {
                b.notifyAll();
            }
            return;
        } else
        {
            return;
        }
        exception;
        atomicboolean;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final boolean f()
    {
        return b() || a(e) || l();
    }

    public final String g()
    {
        return m;
    }

    public final DisplayMetrics h()
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        try
        {
            h.getDefaultDisplay().getMetrics(displaymetrics);
        }
        catch (Exception exception)
        {
            Logger.d("VungleDevice", "error getting display metrics", exception);
            return displaymetrics;
        }
        return displaymetrics;
    }

    public final boolean i()
    {
        return c;
    }

    public final String j()
    {
        String s2 = f;
        String s1 = s2;
        if (l())
        {
            s1 = s2;
            if (b())
            {
                Logger.w("VungleDevice", "have advertising and mac address");
                k();
                s1 = null;
            }
        }
        return s1;
    }

    final void k()
    {
        Logger.i("VungleDevice", "clearing MAC address");
        f = null;
    }

    final boolean l()
    {
        return !TextUtils.isEmpty(f);
    }

    public final String m()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (Build.MANUFACTURER != null) goto _L2; else goto _L1
_L1:
        String s1 = "";
_L7:
        stringbuilder = stringbuilder.append(s1).append(",");
        if (Build.MODEL != null) goto _L4; else goto _L3
_L3:
        s1 = "";
_L5:
        return stringbuilder.append(s1).toString();
_L2:
        s1 = Build.MANUFACTURER;
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = Build.MODEL;
          goto _L5
        Exception exception;
        exception;
        Logger.d("VungleDevice", "error getting device model", exception);
        return null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final Float n()
    {
        float f1;
        try
        {
            f1 = g.c();
        }
        catch (Exception exception)
        {
            Logger.d("VungleDevice", "error getting volume info", exception);
            return null;
        }
        return Float.valueOf(f1);
    }

    public final boolean o()
    {
        boolean flag = "mounted".equals(Environment.getExternalStorageState());
        boolean flag1 = dd.a(i, this);
        if (flag1 && flag)
        {
            Logger.v("VungleDevice", "external storage writable");
        } else
        {
            Logger.w("VungleDevice", "external storage not writable");
        }
        return flag1 && flag;
    }

    public final boolean p()
    {
        return b("VungleDevice");
    }

    public final String q()
    {
        if (b("VungleDevice"))
        {
            return Integer.toString(0x3d8024);
        } else
        {
            return null;
        }
    }

    public final void r()
    {
    /* block-local class not found */
    class DeviceIdStrategy {}

        l.c(this);
    }

    public final String s()
    {
        return k.getString("defaultUserAgent", null);
    }

}
