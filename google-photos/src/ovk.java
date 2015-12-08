// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.TreeMap;

final class ovk
    implements ovh
{

    private ovj a;

    ovk(ovj ovj1)
    {
        a = ovj1;
        super();
    }

    public final ote a()
    {
        return a.a;
    }

    public final void a(ovg ovg1)
    {
        p.a(ovg1);
        ovq ovq1 = a.b;
        ovq1;
        JVM INSTR monitorenter ;
        ovq ovq2;
        ovg ovg2;
        ovq2 = a.b;
        ovg2 = (ovg)ovq2.a.remove(Integer.valueOf(ovg1.a));
          goto _L1
_L3:
        ovq1;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (ovg2 == ovg1 || ovg2 == null) goto _L3; else goto _L2
_L2:
        ovq2.a(ovg2);
        if (true) goto _L3; else goto _L4
_L4:
        ovg1;
        ovq1;
        JVM INSTR monitorexit ;
        throw ovg1;
    }
}
