// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashMap;

// Referenced classes of package b.a:
//            oq, ot, oo, nr

public final class op extends oq
{

    public static final op a;
    public static final op b;
    public static final op c;
    public static final op d;
    public static final op e;
    public static final op f;
    public static final op g;
    public static final op h;
    public static final op i;
    public static final op j;
    public static final op k;
    public static final op l;
    public static final op m;
    public static final op n;
    public static final op o;
    public static final op p;
    public static final op q;
    public static final op r;
    private static final HashMap s = new HashMap(100);
    private final ot t;
    private oo u;

    public op(ot ot1)
    {
        if (ot1 == null)
        {
            throw new NullPointerException("type == null");
        }
        if (ot1 == ot.j)
        {
            throw new UnsupportedOperationException("KNOWN_NULL is not representable");
        } else
        {
            t = ot1;
            u = null;
            return;
        }
    }

    public static op a(ot ot1)
    {
        HashMap hashmap = s;
        hashmap;
        JVM INSTR monitorenter ;
        op op2 = (op)s.get(ot1);
        op op1;
        op1 = op2;
        if (op2 != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        op1 = new op(ot1);
        s.put(ot1, op1);
        hashmap;
        JVM INSTR monitorexit ;
        return op1;
        ot1;
        throw ot1;
    }

    protected final int b(nr nr)
    {
        return t.e().compareTo(((op)nr).t.e());
    }

    public final ot b()
    {
        return ot.m;
    }

    public final String e()
    {
        return "type";
    }

    public final boolean equals(Object obj)
    {
        while (!(obj instanceof op) || t != ((op)obj).t) 
        {
            return false;
        }
        return true;
    }

    public final ot f()
    {
        return t;
    }

    public final oo g()
    {
        if (u == null)
        {
            u = new oo(t.e());
        }
        return u;
    }

    public final String h_()
    {
        return t.h_();
    }

    public final int hashCode()
    {
        return t.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("type{")).append(h_()).append('}').toString();
    }

    static 
    {
        a = a(ot.o);
        b = a(ot.s);
        c = a(ot.t);
        d = a(ot.u);
        e = a(ot.v);
        f = a(ot.w);
        g = a(ot.y);
        h = a(ot.x);
        i = a(ot.z);
        j = a(ot.A);
        k = a(ot.B);
        l = a(ot.C);
        m = a(ot.D);
        n = a(ot.E);
        o = a(ot.F);
        p = a(ot.H);
        q = a(ot.G);
        r = a(ot.J);
    }
}
