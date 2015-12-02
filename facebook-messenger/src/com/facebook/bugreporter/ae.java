// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.app.Activity;
import android.app.Dialog;
import android.hardware.SensorManager;
import com.facebook.base.activity.a;

// Referenced classes of package com.facebook.bugreporter:
//            ab, af

public class ae extends a
{

    final ab a;
    private SensorManager b;
    private com.facebook.m.a c;

    public ae(ab ab1)
    {
        a = ab1;
        super();
    }

    void a()
    {
        if (c != null)
        {
            c.b();
        }
    }

    public void b(Activity activity)
    {
        while (activity.isChild() || !((Boolean)ab.d(a).b()).booleanValue()) 
        {
            return;
        }
        if (c == null)
        {
            c = new af(this);
        }
        b.registerListener(c, b.getDefaultSensor(1), 2);
        com.facebook.bugreporter.ab.a(a, true);
        com.facebook.bugreporter.ab.a(a, activity);
    }

    public void c(Activity activity)
    {
        while (activity.isChild() || c == null || !ab.e(a)) 
        {
            return;
        }
        if (ab.f(a))
        {
            ab.g(a).dismiss();
        }
        b.unregisterListener(c);
        com.facebook.bugreporter.ab.a(a, false);
        com.facebook.bugreporter.ab.a(a, null);
    }

    public void g(Activity activity)
    {
        b = (SensorManager)activity.getSystemService("sensor");
    }
}
