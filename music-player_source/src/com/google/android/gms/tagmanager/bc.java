// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            t, a, bd

final class bc
{

    private a a;
    private bd b;
    private boolean c;

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!c) goto _L2; else goto _L1
_L1:
        t.a("Refreshing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        bd bd1 = b;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c;
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

    final String b()
    {
        if (c)
        {
            t.a("getContainerId called on a released ContainerHolder.");
            return "";
        } else
        {
            return a.a();
        }
    }

    final void c()
    {
        if (c)
        {
            t.a("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        } else
        {
            bd bd1 = b;
            return;
        }
    }

    final String d()
    {
        if (c)
        {
            t.a("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        } else
        {
            return b.a();
        }
    }
}
