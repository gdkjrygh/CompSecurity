// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.c;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

// Referenced classes of package com.mobvista.sdk.m.a.c:
//            b, c, d

public final class a
{

    public static int a = 202;
    public static int b = 203;
    public static int c = 204;
    private d d;
    private String e;
    private String f;
    private String g;
    private String h;
    private Handler i;

    public a()
    {
        i = new b(this, Looper.getMainLooper());
    }

    static d a(a a1)
    {
        return a1.d;
    }

    private void a()
    {
        c c1 = new c(this);
        com.mobvista.sdk.m.a.e.a.a().c(c1);
    }

    private void a(String s, String s1, String s2, String s3)
    {
        if (!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3))
        {
            e = s;
            f = s1;
            g = s2;
            h = s3;
            a();
        }
    }

    static String b(a a1)
    {
        return a1.e;
    }

    static String c(a a1)
    {
        return a1.f;
    }

    static String d(a a1)
    {
        return a1.g;
    }

    static String e(a a1)
    {
        return a1.h;
    }

    static Handler f(a a1)
    {
        return a1.i;
    }

    public final void a(d d1)
    {
        d = d1;
    }

    public final void a(String s, String s1, String s2, String s3, d d1)
    {
        a(d1);
        a(s, s1, s2, s3);
    }

}
