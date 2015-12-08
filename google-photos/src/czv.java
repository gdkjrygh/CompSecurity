// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class czv
    implements czw
{

    private final long a;
    private final float b;
    private final float c;

    public czv(long l)
    {
        this(l, 0.0F, 1.0F);
    }

    private czv(long l, float f, float f1)
    {
        a = l;
        b = 0.0F;
        c = 1.0F;
    }

    public final float a(long l)
    {
        return b + ((float)l * (c - b)) / (float)a;
    }

    public final long b()
    {
        return a;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof czv))
            {
                return false;
            }
            obj = (czv)obj;
            if (b != ((czv) (obj)).b || c != ((czv) (obj)).c || a != ((czv) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b.a(b, b.a(c, b.a(a, 17)));
    }

    public final String toString()
    {
        return b.a(getClass(), new Object[] {
            Long.valueOf(a), Float.valueOf(b), Float.valueOf(c)
        });
    }
}
