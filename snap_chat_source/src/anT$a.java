// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class a extends a
{

    private final long a;
    private anT b;

    public final void a(anM anm, String s, boolean flag)
    {
        ang.String s1 = new <init>(s, flag);
        s = ((String) (b.a));
        s;
        JVM INSTR monitorenter ;
        if (b.a(a))
        {
            b.c.b.put(s1.a, s1);
            if (!s1.b)
            {
                break MISSING_BLOCK_LABEL_120;
            }
            anT ant = b;
            long l = a;
            anm.a(s1.a, new <init>(ant, s1, l));
            anT.a(b, anm, s1, a);
        }
_L2:
        return;
        b.a(2, a);
        if (true) goto _L2; else goto _L1
_L1:
        anm;
        s;
        JVM INSTR monitorexit ;
        throw anm;
    }

    public (anT ant, long l)
    {
        b = ant;
        super();
        a = l;
    }
}
