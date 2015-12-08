// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class alF extends alX
    implements alO, Serializable
{

    public final long a;
    public final alr b;

    public alF()
    {
        this(alv.a(), ((alr) (ams.M())));
    }

    public alF(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        this(i, j, k, l, i1, j1, k1, ((alr) (ams.L())));
    }

    private alF(int i, int j, int k, int l, int i1, int j1, int k1, 
            alr alr1)
    {
        alr1 = alv.a(alr1).b();
        long l1 = alr1.a(i, j, k, l, i1, j1, k1);
        b = alr1;
        a = l1;
    }

    public alF(long l)
    {
        this(l, ((alr) (ams.M())));
    }

    private alF(long l, alr alr1)
    {
        alr1 = alv.a(alr1);
        a = alr1.a().a(alw.a, l);
        b = alr1.b();
    }

    public static alF c()
    {
        return new alF();
    }

    public final int a()
    {
        return 4;
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

        case 3: // '\003'
            return b.e().a(a);
        }
    }

    public final int a(alO alo)
    {
        if (this == alo)
        {
            return 0;
        }
        if (alo instanceof alF)
        {
            alF alf = (alF)alo;
            if (b.equals(alf.b))
            {
                if (a < alf.a)
                {
                    return -1;
                }
                return a != alf.a ? 1 : 0;
            }
        }
        return super.a(alo);
    }

    public final int a(alu alu1)
    {
        if (alu1 == null)
        {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else
        {
            return alu1.a(b).a(a);
        }
    }

    public final alF a(long l)
    {
        if (l == a)
        {
            return this;
        } else
        {
            return new alF(l, b);
        }
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

        case 3: // '\003'
            return alr1.e();
        }
    }

    public final alF b(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return a(b.i().a(a, i));
        }
    }

    public final alr b()
    {
        return b;
    }

    public final boolean b(alu alu1)
    {
        if (alu1 == null)
        {
            return false;
        } else
        {
            return alu1.a(b).c();
        }
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
        if (obj instanceof alF)
        {
            alF alf = (alF)obj;
            if (b.equals(alf.b))
            {
                return a == alf.a;
            }
        }
        return super.equals(obj);
    }

    public final String toString()
    {
        return ans.a.b().a(this);
    }
}
