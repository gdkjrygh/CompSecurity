// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.h;


// Referenced classes of package kik.a.h:
//            k

public final class b extends k
{

    private int b;
    private int c;
    private long d;
    private float e;

    public b()
    {
        this(5, 1000L, 2.0F);
    }

    public b(int i, long l, float f)
    {
        super(l);
        b = i;
        c = i;
        d = l;
        e = f;
    }

    public final boolean a()
    {
        if (c <= 0 && b >= 0)
        {
            return false;
        } else
        {
            c = c - 1;
            return super.a();
        }
    }

    protected final long b()
    {
        long l = d;
        d = (long)((float)d * e);
        return l;
    }

    public final void c()
    {
        c = b;
        d = a;
        super.c();
    }
}
