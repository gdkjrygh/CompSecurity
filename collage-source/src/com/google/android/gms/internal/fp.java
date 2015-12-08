// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            hh, hs, ch

public final class fp
{

    hs a;
    cw.d b;
    public final ch c = new _cls1();
    public final ch d = new _cls2();
    private final Object e = new Object();
    private String f;
    private String g;
    private hh h;

    public fp(String s, String s1)
    {
        h = new hh();
        g = s1;
        f = s;
    }

    static Object a(fp fp1)
    {
        return fp1.e;
    }

    static hh b(fp fp1)
    {
        return fp1.h;
    }

    static String c(fp fp1)
    {
        return fp1.f;
    }

    static String d(fp fp1)
    {
        return fp1.g;
    }

    public cw.d a()
    {
        return b;
    }

    public void a(cw.d d1)
    {
        b = d1;
    }

    public void a(hs hs1)
    {
        a = hs1;
    }

    public Future b()
    {
        return h;
    }

    public void c()
    {
        if (a != null)
        {
            a.destroy();
            a = null;
        }
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
