// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            oi, nr

public abstract class og extends oi
{

    final long c;

    og(long l)
    {
        c = l;
    }

    protected final int b(nr nr)
    {
        long l = ((og)nr).c;
        if (c < l)
        {
            return -1;
        }
        return c <= l ? 0 : 1;
    }

    public final boolean equals(Object obj)
    {
        return obj != null && getClass() == obj.getClass() && c == ((og)obj).c;
    }

    public final int g()
    {
        return (int)c;
    }

    public final long h()
    {
        return c;
    }

    public final int hashCode()
    {
        return (int)c ^ (int)(c >> 32);
    }

    public final boolean k_()
    {
        return (long)(int)c == c;
    }
}
