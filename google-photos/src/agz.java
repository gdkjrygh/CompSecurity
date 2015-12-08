// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class agz extends agw
{

    private Object f;

    agz()
    {
        f = null;
    }

    public final int a()
    {
        return 8;
    }

    public final Object a(int i)
    {
        return f;
    }

    public final void a(agw agw1)
    {
        agw1.e();
        JVM INSTR tableswitch 3 4: default 28
    //                   3 39
    //                   4 56;
           goto _L1 _L2 _L3
_L1:
        f = null;
_L5:
        d = false;
        return;
_L2:
        f = agw1.a(8);
        agw1.d();
        continue; /* Loop/switch isn't completed */
_L3:
        f = agw1.a(16);
        agw1.d();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(aif aif)
    {
        f = null;
    }

    public final void a(Object obj)
    {
        f = obj;
    }

    public final int b()
    {
        return 8;
    }

    public final boolean c()
    {
        return false;
    }

    public final int e()
    {
        return 3;
    }

    public final boolean f()
    {
        return false;
    }

    public final void g()
    {
        f = null;
    }

    public final int h()
    {
        return 0;
    }
}
