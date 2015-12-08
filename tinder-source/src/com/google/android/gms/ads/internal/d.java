// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.purchase.f;
import com.google.android.gms.ads.internal.request.a;
import com.google.android.gms.internal.ax;
import com.google.android.gms.internal.bc;
import com.google.android.gms.internal.cb;
import com.google.android.gms.internal.ce;
import com.google.android.gms.internal.cf;
import com.google.android.gms.internal.cl;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.s;
import com.google.android.gms.internal.t;
import com.google.android.gms.internal.u;
import com.google.android.gms.internal.y;

public final class d
{

    private static final Object a;
    private static d b;
    private final a c = new a();
    private final com.google.android.gms.ads.internal.overlay.a d = new com.google.android.gms.ads.internal.overlay.a();
    private final c e = new c();
    private final cb f = new cb();
    private final cl g = new cl();
    private final cy h = new cy();
    private final cm i;
    private final cf j = new cf();
    private final ef k = new eg();
    private final y l = new y();
    private final ce m = new ce();
    private final t n = new t();
    private final s o = new s();
    private final u p = new u();
    private final f q = new f();
    private final cp r = new cp();
    private final bc s = new bc();
    private final ax t = new ax();

    protected d()
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        Object obj;
        if (i1 >= 19)
        {
            obj = new com.google.android.gms.internal.cm.g();
        } else
        if (i1 >= 18)
        {
            obj = new com.google.android.gms.internal.cm.e();
        } else
        if (i1 >= 17)
        {
            obj = new com.google.android.gms.internal.cm.d();
        } else
        if (i1 >= 16)
        {
            obj = new com.google.android.gms.internal.cm.f();
        } else
        if (i1 >= 14)
        {
            obj = new com.google.android.gms.internal.cm.c();
        } else
        if (i1 >= 11)
        {
            obj = new com.google.android.gms.internal.cm.b();
        } else
        if (i1 >= 9)
        {
            obj = new com.google.android.gms.internal.cm.a();
        } else
        {
            obj = new cm();
        }
        i = ((cm) (obj));
    }

    public static com.google.android.gms.ads.internal.overlay.a a()
    {
        return l().d;
    }

    public static c b()
    {
        return l().e;
    }

    public static cl c()
    {
        return l().g;
    }

    public static cy d()
    {
        return l().h;
    }

    public static cm e()
    {
        return l().i;
    }

    public static cf f()
    {
        return l().j;
    }

    public static ef g()
    {
        return l().k;
    }

    public static s h()
    {
        return l().o;
    }

    public static u i()
    {
        return l().p;
    }

    public static f j()
    {
        return l().q;
    }

    public static ax k()
    {
        return l().t;
    }

    private static d l()
    {
        d d1;
        synchronized (a)
        {
            d1 = b;
        }
        return d1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        a = new Object();
        d d1 = new d();
        synchronized (a)
        {
            b = d1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
