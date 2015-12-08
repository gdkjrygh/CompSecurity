// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            aw, a, c, az, 
//            ea

public class av
    implements a.a, aw
{

    public static az a;
    public static a.a b;
    a c;
    Activity d;
    a.a e;
    az f;

    public av()
    {
    }

    public int a(ea ea)
    {
        return e.a(ea);
    }

    public int a(ea ea, int k)
    {
        return e.a(ea, k);
    }

    public az a()
    {
        return f;
    }

    public void a(float f1, float f2)
    {
    }

    public void a(int k)
    {
        e.a(k);
    }

    public void a(int k, int l, Intent intent)
    {
    }

    public void a(Configuration configuration)
    {
        c.a(configuration);
    }

    public void a(Bundle bundle, Activity activity)
    {
        f = a;
        e = b;
        a = null;
        b = null;
        d = activity;
        d.requestWindowFeature(1);
        d.getWindow().setFlags(1024, 1024);
        c = new c(this, d, f, false);
    }

    public void a(a a1)
    {
        d.setResult(100, new Intent());
        d.finish();
    }

    public boolean a(int k, KeyEvent keyevent)
    {
        return c.a(k, keyevent);
    }

    public Context b()
    {
        return d;
    }

    public void b(int k)
    {
    }

    public int c()
    {
        return Resources.getSystem().getConfiguration().orientation != 2 ? 1 : 0;
    }

    public int d()
    {
        return -1;
    }

    public boolean e()
    {
        return false;
    }

    public void f()
    {
        c.c();
    }

    public void g()
    {
        c.d();
    }

    public void h()
    {
        c.e();
    }

    public void i()
    {
    }

    public void j()
    {
    }
}
