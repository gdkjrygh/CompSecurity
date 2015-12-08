// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.purchase.i;
import com.google.android.gms.ads.internal.request.a;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.aw;
import com.google.android.gms.internal.ax;
import com.google.android.gms.internal.bc;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.df;
import com.google.android.gms.internal.fc;
import com.google.android.gms.internal.ft;
import com.google.android.gms.internal.gd;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.gn;
import com.google.android.gms.internal.gr;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.io;
import com.google.android.gms.internal.ip;

public final class p
{

    private static final Object a;
    private static p b;
    private final a c = new a();
    private final com.google.android.gms.ads.internal.overlay.a d = new com.google.android.gms.ads.internal.overlay.a();
    private final d e = new d();
    private final fc f = new fc();
    private final gm g = new gm();
    private final hk h = new hk();
    private final gn i;
    private final gd j = new gd();
    private final io k = new ip();
    private final bc l = new bc();
    private final ft m = new ft();
    private final aw n = new aw();
    private final av o = new av();
    private final ax p = new ax();
    private final i q = new i();
    private final gr r = new gr();
    private final df s = new df();
    private final cp t = new cp();

    protected p()
    {
        i = gn.a(android.os.Build.VERSION.SDK_INT);
    }

    public static a a()
    {
        return s().c;
    }

    public static com.google.android.gms.ads.internal.overlay.a b()
    {
        return s().d;
    }

    public static d c()
    {
        return s().e;
    }

    public static fc d()
    {
        return s().f;
    }

    public static gm e()
    {
        return s().g;
    }

    public static hk f()
    {
        return s().h;
    }

    public static gn g()
    {
        return s().i;
    }

    public static gd h()
    {
        return s().j;
    }

    public static io i()
    {
        return s().k;
    }

    public static bc j()
    {
        return s().l;
    }

    public static ft k()
    {
        return s().m;
    }

    public static aw l()
    {
        return s().n;
    }

    public static av m()
    {
        return s().o;
    }

    public static ax n()
    {
        return s().p;
    }

    public static i o()
    {
        return s().q;
    }

    public static gr p()
    {
        return s().r;
    }

    public static df q()
    {
        return s().s;
    }

    public static cp r()
    {
        return s().t;
    }

    private static p s()
    {
        p p1;
        synchronized (a)
        {
            p1 = b;
        }
        return p1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        a = new Object();
        p p1 = new p();
        synchronized (a)
        {
            b = p1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
