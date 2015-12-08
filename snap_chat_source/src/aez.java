// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;

public final class aez extends aeA
{

    public static final aez a;
    private static final HashMap c = new HashMap(100);
    final aeD b;
    private aey d;

    public aez(aeD aed)
    {
        if (aed == null)
        {
            throw new NullPointerException("type == null");
        }
        if (aed == aeD.j)
        {
            throw new UnsupportedOperationException("KNOWN_NULL is not representable");
        } else
        {
            b = aed;
            d = null;
            return;
        }
    }

    public static aez a(aeD aed)
    {
        HashMap hashmap = c;
        hashmap;
        JVM INSTR monitorenter ;
        aez aez2 = (aez)c.get(aed);
        aez aez1;
        aez1 = aez2;
        if (aez2 != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        aez1 = new aez(aed);
        c.put(aed, aez1);
        hashmap;
        JVM INSTR monitorexit ;
        return aez1;
        aed;
        throw aed;
    }

    public final String ag_()
    {
        return b.ag_();
    }

    protected final int b(aec aec)
    {
        return b.H.compareTo(((aez)aec).b.H);
    }

    public final aeD b()
    {
        return aeD.l;
    }

    public final String e()
    {
        return "type";
    }

    public final boolean equals(Object obj)
    {
        while (!(obj instanceof aez) || b != ((aez)obj).b) 
        {
            return false;
        }
        return true;
    }

    public final aey f()
    {
        if (d == null)
        {
            d = new aey(b.H);
        }
        return d;
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("type{")).append(ag_()).append('}').toString();
    }

    static 
    {
        a = a(aeD.m);
        a(aeD.p);
        a(aeD.q);
        a(aeD.r);
        a(aeD.s);
        a(aeD.t);
        a(aeD.v);
        a(aeD.u);
        a(aeD.w);
        a(aeD.x);
        a(aeD.y);
        a(aeD.z);
        a(aeD.A);
        a(aeD.B);
        a(aeD.C);
        a(aeD.E);
        a(aeD.D);
        a(aeD.G);
    }
}
