// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.m4b.maps.a.d;
import com.google.android.m4b.maps.a.l;
import com.google.android.m4b.maps.am.a;
import com.google.android.m4b.maps.am.c;
import com.google.android.m4b.maps.am.f;
import java.io.File;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            y, p

public final class h
{

    private static final h a = new h();

    private h()
    {
    }

    public static l a(Context context, com.google.android.m4b.maps.am.f.a a1, String s, boolean flag)
    {
        if (flag)
        {
            a1 = new y(context, s);
        } else
        {
            a1 = new f(a1);
        }
        a1 = new a(a1);
        return new p(new c(new File(context.getCacheDir(), "com.google.android.gms.maps.volley")), a1, new p._cls1((((ActivityManager)context.getSystemService("activity")).getMemoryClass() * 1024 * 1024) / 8), new d(new Handler(Looper.getMainLooper())));
    }

    public static h a()
    {
        return a;
    }

}
