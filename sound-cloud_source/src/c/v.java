// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;


final class v
{

    final byte a[];
    int b;
    int c;
    boolean d;
    boolean e;
    v f;
    v g;

    v()
    {
        a = new byte[2048];
        e = true;
        d = false;
    }

    v(v v1)
    {
        this(v1.a, v1.b, v1.c);
        v1.d = true;
    }

    private v(byte abyte0[], int i, int j)
    {
        a = abyte0;
        b = i;
        c = j;
        e = false;
        d = true;
    }

    public final v a()
    {
        v v1;
        if (f != this)
        {
            v1 = f;
        } else
        {
            v1 = null;
        }
        g.f = f;
        f.g = g;
        f = null;
        g = null;
        return v1;
    }

    public final v a(v v1)
    {
        v1.g = this;
        v1.f = f;
        f.g = v1;
        f = v1;
        return v1;
    }

    public final void a(v v1, int i)
    {
        if (!v1.e)
        {
            throw new IllegalArgumentException();
        }
        if (v1.c + i > 2048)
        {
            if (v1.d)
            {
                throw new IllegalArgumentException();
            }
            if ((v1.c + i) - v1.b > 2048)
            {
                throw new IllegalArgumentException();
            }
            System.arraycopy(v1.a, v1.b, v1.a, 0, v1.c - v1.b);
            v1.c = v1.c - v1.b;
            v1.b = 0;
        }
        System.arraycopy(a, b, v1.a, v1.c, i);
        v1.c = v1.c + i;
        b = b + i;
    }
}
