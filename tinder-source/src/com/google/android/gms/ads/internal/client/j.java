// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.reward.client.b;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.internal.al;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            f, k, b

public final class j
{

    private static final Object a;
    private static j b;
    private final a c = new a();
    private final f d = new f();
    private final k e = new k();
    private final com.google.android.gms.ads.internal.client.b f = new com.google.android.gms.ads.internal.client.b();
    private final al g = new al();
    private final b h = new b();

    protected j()
    {
    }

    public static a a()
    {
        return b().c;
    }

    private static j b()
    {
        j j1;
        synchronized (a)
        {
            j1 = b;
        }
        return j1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        a = new Object();
        j j1 = new j();
        synchronized (a)
        {
            b = j1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
