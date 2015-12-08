// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;


final class o
{

    final byte a[];
    int b;
    int c;
    boolean d;
    boolean e;
    o f;
    o g;

    o()
    {
        a = new byte[2048];
        e = true;
        d = false;
    }

    o(o o1)
    {
        this(o1.a, o1.b, o1.c);
        o1.d = true;
    }

    private o(byte abyte0[], int i, int j)
    {
        a = abyte0;
        b = i;
        c = j;
        e = false;
        d = true;
    }

    public final o a()
    {
        o o1;
        if (f != this)
        {
            o1 = f;
        } else
        {
            o1 = null;
        }
        g.f = f;
        f.g = g;
        f = null;
        g = null;
        return o1;
    }

    public final o a(o o1)
    {
        o1.g = this;
        o1.f = f;
        f.g = o1;
        f = o1;
        return o1;
    }

    public final void a(o o1, int i)
    {
        if (!o1.e)
        {
            throw new IllegalArgumentException();
        }
        if (o1.c + i > 2048)
        {
            if (o1.d)
            {
                throw new IllegalArgumentException();
            }
            if ((o1.c + i) - o1.b > 2048)
            {
                throw new IllegalArgumentException();
            }
            System.arraycopy(o1.a, o1.b, o1.a, 0, o1.c - o1.b);
            o1.c = o1.c - o1.b;
            o1.b = 0;
        }
        System.arraycopy(a, b, o1.a, o1.c, i);
        o1.c = o1.c + i;
        b = b + i;
    }
}
