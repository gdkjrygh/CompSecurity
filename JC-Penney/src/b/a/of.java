// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            oi, nr

public abstract class of extends oi
{

    final int h;

    of(int i)
    {
        h = i;
    }

    protected final int b(nr nr)
    {
        int i = ((of)nr).h;
        if (h < i)
        {
            return -1;
        }
        return h <= i ? 0 : 1;
    }

    public final boolean equals(Object obj)
    {
        return obj != null && getClass() == obj.getClass() && h == ((of)obj).h;
    }

    public final int g()
    {
        return h;
    }

    public final long h()
    {
        return (long)h;
    }

    public final int hashCode()
    {
        return h;
    }

    public final boolean k_()
    {
        return true;
    }
}
