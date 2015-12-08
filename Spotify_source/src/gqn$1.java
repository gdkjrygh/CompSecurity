// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nit> extends hcl
{

    private gsb a;
    private gqn b;

    public final void close()
    {
label0:
        {
            synchronized (b.b)
            {
                if (!b.a)
                {
                    break label0;
                }
            }
            return;
        }
        b.a = true;
        gqm gqm2 = b.b;
        gqm2.b = gqm2.b + 1;
        gqm1;
        JVM INSTR monitorexit ;
        super.close();
        a.a();
        return;
        exception;
        gqm1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (gqn gqn1, hcv hcv, gsb gsb1)
    {
        b = gqn1;
        a = gsb1;
        super(hcv);
    }
}
