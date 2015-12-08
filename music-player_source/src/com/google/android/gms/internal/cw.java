// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;

// Referenced classes of package com.google.android.gms.internal:
//            cu, cx, cd, db, 
//            cf, ct, ek, dc

public final class cw extends cu
    implements c, d
{

    private final ct a;
    private final cx b;
    private final Object c = new Object();

    public cw(Context context, cd cd1, ct ct1)
    {
        super(cd1, ct1);
        a = ct1;
        b = new cx(context, this, this, cd1.l.e);
        b.d();
    }

    public final void a(a a1)
    {
        a.a(new cf(0));
    }

    public final void a_()
    {
        e();
    }

    public final void b()
    {
        com.google.android.gms.internal.ek.a("Disconnected from remote ad request service.");
    }

    public final void c()
    {
        synchronized (c)
        {
            if (b.e() || b.f())
            {
                b.g();
            }
        }
    }

    public final dc d()
    {
        obj;
        JVM INSTR monitorenter ;
        dc dc;
        IllegalStateException illegalstateexception;
        synchronized (c)
        {
            dc = b.c();
        }
        return dc;
        illegalstateexception;
        return null;
    }
}
