// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nbw
{

    final int a;
    final int b;
    final long c;
    private final nbx d;

    nbw(int i, int j, long l, nbx nbx1)
    {
        b = i;
        a = j;
        c = l;
        d = nbx1;
    }

    nbw(int i, int j, nbx nbx1)
    {
        this(i, j, (long)i * (long)j << 2, nbx1);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof nbw)
        {
            obj = (nbw)obj;
            return d.a(this, ((nbw) (obj)));
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return d.a(this);
    }

    public final String toString()
    {
        int i = b;
        int j = a;
        return (new StringBuilder(35)).append("BitmapKey(").append(i).append(", ").append(j).append(")").toString();
    }
}
