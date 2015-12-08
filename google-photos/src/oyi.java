// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oyi extends qlq
{

    private static volatile oyi a[];

    public oyi()
    {
        F = null;
        G = -1;
    }

    public static oyi[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new oyi[0];
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final qlw a(qlo qlo1)
    {
_L3:
        int i = qlo1.a();
        i;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 33;
           goto _L1 _L2
_L1:
        if (super.a(qlo1, i)) goto _L3; else goto _L2
_L2:
        return this;
    }
}
