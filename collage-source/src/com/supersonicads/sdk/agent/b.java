// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonicads.sdk.agent;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import com.supersonicads.sdk.a.d;
import com.supersonicads.sdk.b.a;
import com.supersonicads.sdk.b.c;
import com.supersonicads.sdk.b.e;
import com.supersonicads.sdk.b.f;
import com.supersonicads.sdk.controller.SupersonicWebView;
import java.util.Map;

public final class b
    implements com.supersonicads.sdk.b
{

    private static b a;
    private static MutableContextWrapper d;
    private SupersonicWebView b;
    private com.supersonicads.sdk.data.f c;

    private b(Activity activity, int i)
    {
        com.supersonicads.sdk.b.f.a(activity);
        com.supersonicads.sdk.b.c.a(i);
        com.supersonicads.sdk.b.c.a("SupersonicAdsPublisherAgent", "C'tor");
        d = new MutableContextWrapper(activity);
        activity.runOnUiThread(new SupersonicAdsPublisherAgent._cls1(this, activity, i));
        b(activity);
    }

    public static b a(Activity activity, int i)
    {
        com/supersonicads/sdk/agent/b;
        JVM INSTR monitorenter ;
        com.supersonicads.sdk.b.c.a("SupersonicAdsPublisherAgent", "getInstance()");
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        a = new b(activity, i);
_L1:
        activity = a;
        com/supersonicads/sdk/agent/b;
        JVM INSTR monitorexit ;
        return activity;
        d.setBaseContext(activity);
          goto _L1
        activity;
        throw activity;
    }

    static SupersonicWebView a(b b1)
    {
        return b1.b;
    }

    static SupersonicWebView a(b b1, SupersonicWebView supersonicwebview)
    {
        b1.b = supersonicwebview;
        return supersonicwebview;
    }

    private void b(Context context)
    {
        c = new com.supersonicads.sdk.data.f(context, com.supersonicads.sdk.data.f.a.a);
    }

    public static b d(Activity activity)
    {
        com/supersonicads/sdk/agent/b;
        JVM INSTR monitorenter ;
        activity = a(activity, 0);
        com/supersonicads/sdk/agent/b;
        JVM INSTR monitorexit ;
        return activity;
        activity;
        throw activity;
    }

    static MutableContextWrapper e()
    {
        return d;
    }

    private void f()
    {
        if (c != null)
        {
            c.a();
            com.supersonicads.sdk.b.f.a().a(c);
            c = null;
        }
    }

    public void a()
    {
        b.e();
    }

    public void a(Activity activity)
    {
        com.supersonicads.sdk.b.c.a("SupersonicAdsPublisherAgent", "release()");
        com.supersonicads.sdk.b.a.g();
        b.b(activity);
        if (!Looper.getMainLooper().equals(Looper.myLooper())) goto _L2; else goto _L1
_L1:
        b.destroy();
        b = null;
_L4:
        a = null;
        f();
        return;
_L2:
        try
        {
            (new Handler(Looper.getMainLooper())).post(new SupersonicAdsPublisherAgent._cls2(this));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity) { }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(Context context)
    {
        c = new com.supersonicads.sdk.data.f(context, com.supersonicads.sdk.data.f.a.b);
    }

    public void a(String s, String s1, com.supersonicads.sdk.a.c c1)
    {
        b.a(s, s1, c1);
    }

    public void a(String s, String s1, Map map, com.supersonicads.sdk.a.b b1)
    {
        b.a(s, s1, map, b1);
    }

    public void a(String s, String s1, Map map, com.supersonicads.sdk.a.c c1)
    {
        b.a(s, s1, map, c1);
    }

    public void a(String s, String s1, Map map, d d1)
    {
        b.a(s, s1, map, d1);
    }

    public void b()
    {
        b.d();
    }

    public void b(Activity activity)
    {
        try
        {
            b.f();
            b.b(activity);
            f();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            activity.printStackTrace();
        }
        (new e()).execute(new String[] {
            (new StringBuilder()).append("https://www.supersonicads.com/mobile/sdk5/log?method=").append(activity.getStackTrace()[0].getMethodName()).toString()
        });
    }

    public void c(Activity activity)
    {
        d.setBaseContext(activity);
        b.g();
        b.a(activity);
        if (c == null)
        {
            a(activity);
        }
    }

    public boolean c()
    {
        return b.c();
    }

    public SupersonicWebView d()
    {
        return b;
    }
}
