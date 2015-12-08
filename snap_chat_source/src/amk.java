// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class amk extends alZ
{

    private static final alt E = new amg("BE");
    private static final Map F = new HashMap();
    private static final amk G;

    private amk(alr alr, Object obj)
    {
        super(alr, obj);
    }

    public static amk b(alw alw1)
    {
        amk;
        JVM INSTR monitorenter ;
        alw alw2;
        alw2 = alw1;
        if (alw1 != null)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        alw2 = alw.a();
        Map map = F;
        map;
        JVM INSTR monitorenter ;
        amk amk1 = (amk)F.get(alw2);
        alw1 = amk1;
        if (amk1 != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        alw1 = new amk(aml.b(alw2), null);
        alw1 = new amk(amv.a(alw1, new als(alw1), null), "");
        F.put(alw2, alw1);
        map;
        JVM INSTR monitorexit ;
        amk;
        JVM INSTR monitorexit ;
        return alw1;
        alw1;
        map;
        JVM INSTR monitorexit ;
        throw alw1;
        alw1;
        amk;
        JVM INSTR monitorexit ;
        throw alw1;
    }

    public final alr a(alw alw1)
    {
        alw alw2 = alw1;
        if (alw1 == null)
        {
            alw2 = alw.a();
        }
        if (alw2 == a())
        {
            return this;
        } else
        {
            return b(alw2);
        }
    }

    protected final void a(alZ.a a1)
    {
        if (super.b == null)
        {
            a1.E = new ana(new anh(a1.E), 543);
            a1.F = new amV(a1.E, alu.t());
            a1.B = new ana(new anh(a1.B), 543);
            a1.H = new amW(new ana(a1.F, 99), alu.v());
            a1.G = new ana(new ane((amW)a1.H), alu.u());
            a1.C = new ana(new ane(a1.B, alu.q()), alu.q());
            a1.I = E;
        }
    }

    public final alr b()
    {
        return G;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof amk)
        {
            obj = (amk)obj;
            return a().equals(((amk) (obj)).a());
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return "Buddhist".hashCode() * 11 + a().hashCode();
    }

    public final String toString()
    {
        String s = "BuddhistChronology";
        alw alw1 = a();
        if (alw1 != null)
        {
            s = (new StringBuilder()).append("BuddhistChronology").append('[').append(alw1.c).append(']').toString();
        }
        return s;
    }

    static 
    {
        G = b(alw.a);
    }
}
