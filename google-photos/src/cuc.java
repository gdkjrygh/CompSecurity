// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cuc
{

    private static final cuc c;
    final cud a;
    final long b;
    private volatile int d;

    private cuc(cud cud1, long l)
    {
        a = cud1;
        b = l;
    }

    public static cuc a()
    {
        return c;
    }

    public static cuc a(long l)
    {
        return new cuc(cud.a, l);
    }

    public static cuc b(long l)
    {
        return new cuc(cud.b, l);
    }

    public static cuc c(long l)
    {
        return new cuc(cud.d, l);
    }

    public final boolean b()
    {
        return a == cud.b;
    }

    public final boolean c()
    {
        return a == cud.d;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof cuc))
            {
                return false;
            }
            obj = (cuc)obj;
            if (a != ((cuc) (obj)).a || b != ((cuc) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (d == 0)
        {
            d = b.h(a, b.a(b, 17));
        }
        return d;
    }

    public String toString()
    {
        return b.a(cuc, new Object[] {
            a, Long.valueOf(b)
        });
    }

    static 
    {
        c = new cuc(cud.a, 0L);
        new cuc(cud.c, 0L);
    }
}
