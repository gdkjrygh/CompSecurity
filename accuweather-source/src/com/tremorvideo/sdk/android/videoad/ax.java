// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            aw, ay, ct, dp

public class ax
    implements aw
{

    Activity a;
    dp b;
    String c;

    public ax()
    {
    }

    public void a(float f1, float f2)
    {
    }

    public void a(int k, int l, Intent intent)
    {
    }

    public void a(Configuration configuration)
    {
    }

    public void a(Bundle bundle, Activity activity)
    {
        Thread.setDefaultUncaughtExceptionHandler(new ay(this));
        a = activity;
        a.requestWindowFeature(1);
        a.getWindow().setFlags(1024, 1024);
        ct.a(a.getWindow());
        c = a.getIntent().getExtras().getString("tremorVideoURL");
        c = c.replace("https", "http");
        b = ct.a(a);
        b.f();
        b.a(c);
        a.setContentView(b);
    }

    public boolean a(int k, KeyEvent keyevent)
    {
        if (k == 4)
        {
            b.c();
        }
        return false;
    }

    public boolean e()
    {
        return false;
    }

    public void f()
    {
    }

    public void g()
    {
        b.e();
    }

    public void h()
    {
        b.d();
    }

    public void i()
    {
        b.c();
    }

    public void j()
    {
        ct.d("ActivityWebView - onDestroy");
        b.f();
        b = null;
    }
}
