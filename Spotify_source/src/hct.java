// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hct
{

    public final byte a[];
    public int b;
    public int c;
    public boolean d;
    boolean e;
    public hct f;
    public hct g;

    hct()
    {
        a = new byte[2048];
        e = true;
        d = false;
    }

    hct(hct hct1)
    {
        this(hct1.a, hct1.b, hct1.c);
        hct1.d = true;
    }

    public hct(byte abyte0[], int i, int j)
    {
        a = abyte0;
        b = i;
        c = j;
        e = false;
        d = true;
    }

    public final hct a()
    {
        hct hct1;
        if (f != this)
        {
            hct1 = f;
        } else
        {
            hct1 = null;
        }
        g.f = f;
        f.g = g;
        f = null;
        g = null;
        return hct1;
    }

    public final hct a(hct hct1)
    {
        hct1.g = this;
        hct1.f = f;
        f.g = hct1;
        f = hct1;
        return hct1;
    }

    public final void a(hct hct1, int i)
    {
        if (!hct1.e)
        {
            throw new IllegalArgumentException();
        }
        if (hct1.c + i > 2048)
        {
            if (hct1.d)
            {
                throw new IllegalArgumentException();
            }
            if ((hct1.c + i) - hct1.b > 2048)
            {
                throw new IllegalArgumentException();
            }
            System.arraycopy(hct1.a, hct1.b, hct1.a, 0, hct1.c - hct1.b);
            hct1.c = hct1.c - hct1.b;
            hct1.b = 0;
        }
        System.arraycopy(a, b, hct1.a, hct1.c, i);
        hct1.c = hct1.c + i;
        b = b + i;
    }
}
