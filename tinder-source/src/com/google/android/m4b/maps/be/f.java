// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;

import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.b;
import com.google.android.m4b.maps.bw.e;

// Referenced classes of package com.google.android.m4b.maps.be:
//            k

public final class f
    implements k
{

    private static aa b = new b();
    private e a;

    public f()
    {
        a = new e(256);
    }

    public final void a(ac ac, aa aa1)
    {
        synchronized (a)
        {
            a.b(ac, aa1);
        }
        return;
        ac;
        e1;
        JVM INSTR monitorexit ;
        throw ac;
    }

    public final boolean a()
    {
        synchronized (a)
        {
            a.a(0);
        }
        return true;
        exception;
        e1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(aa aa1)
    {
        return aa1 == b;
    }

    public final void a_(ac ac)
    {
        a(ac, b);
    }

    public final boolean b(ac ac)
    {
        e e1 = a;
        e1;
        JVM INSTR monitorenter ;
        boolean flag;
        if (a.c(ac) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e1;
        JVM INSTR monitorexit ;
        return flag;
        ac;
        e1;
        JVM INSTR monitorexit ;
        throw ac;
    }

    public final aa c(ac ac)
    {
        synchronized (a)
        {
            ac = (aa)a.c(ac);
        }
        return ac;
        ac;
        e1;
        JVM INSTR monitorexit ;
        throw ac;
    }

}
