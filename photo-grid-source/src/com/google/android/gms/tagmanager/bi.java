// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.tagmanager:
//            b, a, y, k, 
//            bj, bk

final class bi
    implements b
{

    private a a;
    private a b;
    private Status c;
    private bk d;
    private bj e;
    private boolean f;
    private k g;

    public final Status a()
    {
        return c;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = f;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.a(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!f) goto _L2; else goto _L1
_L1:
        y.a("Releasing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f = true;
        g.a(this);
        a.b();
        a = null;
        b = null;
        e = null;
        d = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            y.a("Refreshing a released ContainerHolder.");
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final String d()
    {
        if (f)
        {
            y.a("getContainerId called on a released ContainerHolder.");
            return "";
        } else
        {
            return a.a();
        }
    }

    final void e()
    {
        if (f)
        {
            y.a("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        }
    }

    final String f()
    {
        if (f)
        {
            y.a("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        } else
        {
            return e.a();
        }
    }
}
