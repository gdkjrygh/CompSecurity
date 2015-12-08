// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class amA
{

    private static amA b;
    public amB a;
    private amB c;
    private amB d;
    private amB e;
    private amB f;

    protected amA()
    {
        a = new amB(new amz[] {
            amL.a, amP.a, amy.a, amC.a, amG.a, amH.a
        });
        c = new amB(new amz[] {
            amN.a, amL.a, amP.a, amy.a, amC.a, amG.a, amH.a
        });
        d = new amB(new amz[] {
            amK.a, amM.a, amP.a, amG.a, amH.a
        });
        e = new amB(new amz[] {
            amK.a, amO.a, amM.a, amP.a, amH.a
        });
        f = new amB(new amz[] {
            amM.a, amP.a, amH.a
        });
    }

    public static amA a()
    {
        if (b == null)
        {
            b = new amA();
        }
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder("ConverterManager[")).append(a.a.length).append(" instant,").append(c.a.length).append(" partial,").append(d.a.length).append(" duration,").append(e.a.length).append(" period,").append(f.a.length).append(" interval]").toString();
    }
}
