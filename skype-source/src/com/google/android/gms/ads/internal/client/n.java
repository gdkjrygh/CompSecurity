// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.reward.client.b;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.internal.bx;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            h, o, b

public final class n
{

    private static final Object a;
    private static n b;
    private final a c = new a();
    private final h d = new h();
    private final o e = new o();
    private final com.google.android.gms.ads.internal.client.b f = new com.google.android.gms.ads.internal.client.b();
    private final bx g = new bx();
    private final b h = new b();

    protected n()
    {
    }

    public static a a()
    {
        return e().c;
    }

    public static h b()
    {
        return e().d;
    }

    public static o c()
    {
        return e().e;
    }

    public static bx d()
    {
        return e().g;
    }

    private static n e()
    {
        n n1;
        synchronized (a)
        {
            n1 = b;
        }
        return n1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        a = new Object();
        n n1 = new n();
        synchronized (a)
        {
            b = n1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
