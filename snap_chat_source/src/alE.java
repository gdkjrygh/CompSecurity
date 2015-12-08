// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public final class alE extends alX
    implements alO, Serializable
{

    private static final Set c;
    public final long a;
    public final alr b;
    private volatile transient int d;

    public alE()
    {
        this(alv.a(), ((alr) (ams.M())));
    }

    public alE(long l)
    {
        this(l, ((alr) (ams.M())));
    }

    public alE(long l, alr alr1)
    {
        alr1 = alv.a(alr1);
        l = alr1.a().a(alw.a, l);
        alr1 = alr1.b();
        a = alr1.u().d(l);
        b = alr1;
    }

    public final int a()
    {
        return 3;
    }

    public final int a(int i)
    {
        switch (i)
        {
        default:
            throw new IndexOutOfBoundsException((new StringBuilder("Invalid index: ")).append(i).toString());

        case 0: // '\0'
            return b.E().a(a);

        case 1: // '\001'
            return b.C().a(a);

        case 2: // '\002'
            return b.u().a(a);
        }
    }

    public final int a(alO alo)
    {
        if (this == alo)
        {
            return 0;
        }
        if (alo instanceof alE)
        {
            alE ale = (alE)alo;
            if (b.equals(ale.b))
            {
                if (a < ale.a)
                {
                    return -1;
                }
                return a != ale.a ? 1 : 0;
            }
        }
        return super.a(alo);
    }

    public final int a(alu alu1)
    {
        if (alu1 == null)
        {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (!b(alu1))
        {
            throw new IllegalArgumentException((new StringBuilder("Field '")).append(alu1).append("' is not supported").toString());
        } else
        {
            return alu1.a(b).a(a);
        }
    }

    public final als a(alw alw1)
    {
        alw1 = alv.a(alw1);
        alr alr1 = b.a(alw1);
        long l = alw1.e(a + 0x1499700L);
        return new als(alr1.u().d(l), alr1);
    }

    protected final alt a(int i, alr alr1)
    {
        switch (i)
        {
        default:
            throw new IndexOutOfBoundsException((new StringBuilder("Invalid index: ")).append(i).toString());

        case 0: // '\0'
            return alr1.E();

        case 1: // '\001'
            return alr1.C();

        case 2: // '\002'
            return alr1.u();
        }
    }

    public final alr b()
    {
        return b;
    }

    public final boolean b(alu alu1)
    {
        alA ala;
        if (alu1 != null)
        {
            if (c.contains(ala = alu1.x()) || ala.a(b).d() >= b.s().d())
            {
                return alu1.a(b).c();
            }
        }
        return false;
    }

    public final int compareTo(Object obj)
    {
        return a((alO)obj);
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof alE)
        {
            alE ale = (alE)obj;
            if (b.equals(ale.b))
            {
                return a == ale.a;
            }
        }
        return super.equals(obj);
    }

    public final int hashCode()
    {
        int j = d;
        int i = j;
        if (j == 0)
        {
            i = super.hashCode();
            d = i;
        }
        return i;
    }

    public final String toString()
    {
        return ans.a.c().a(this);
    }

    static 
    {
        HashSet hashset = new HashSet();
        c = hashset;
        hashset.add(alA.f());
        c.add(alA.g());
        c.add(alA.i());
        c.add(alA.h());
        c.add(alA.j());
        c.add(alA.k());
        c.add(alA.l());
    }
}
