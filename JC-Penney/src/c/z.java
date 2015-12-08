// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;


// Referenced classes of package c:
//            aa

final class z
{

    final byte a[];
    int b;
    int c;
    boolean d;
    boolean e;
    z f;
    z g;

    z()
    {
        a = new byte[2048];
        e = true;
        d = false;
    }

    z(z z1)
    {
        this(z1.a, z1.b, z1.c);
        z1.d = true;
    }

    z(byte abyte0[], int i, int j)
    {
        a = abyte0;
        b = i;
        c = j;
        e = false;
        d = true;
    }

    public z a()
    {
        z z1;
        if (f != this)
        {
            z1 = f;
        } else
        {
            z1 = null;
        }
        g.f = f;
        f.g = g;
        f = null;
        g = null;
        return z1;
    }

    public z a(int i)
    {
        if (i <= 0 || i > c - b)
        {
            throw new IllegalArgumentException();
        } else
        {
            z z1 = new z(this);
            z1.c = z1.b + i;
            b = b + i;
            g.a(z1);
            return z1;
        }
    }

    public z a(z z1)
    {
        z1.g = this;
        z1.f = f;
        f.g = z1;
        f = z1;
        return z1;
    }

    public void a(z z1, int i)
    {
        if (!z1.e)
        {
            throw new IllegalArgumentException();
        }
        if (z1.c + i > 2048)
        {
            if (z1.d)
            {
                throw new IllegalArgumentException();
            }
            if ((z1.c + i) - z1.b > 2048)
            {
                throw new IllegalArgumentException();
            }
            System.arraycopy(z1.a, z1.b, z1.a, 0, z1.c - z1.b);
            z1.c = z1.c - z1.b;
            z1.b = 0;
        }
        System.arraycopy(a, b, z1.a, z1.c, i);
        z1.c = z1.c + i;
        b = b + i;
    }

    public void b()
    {
        if (g == this)
        {
            throw new IllegalStateException();
        }
        if (g.e)
        {
            int j = c - b;
            int k = g.c;
            int i;
            if (g.d)
            {
                i = 0;
            } else
            {
                i = g.b;
            }
            if (j <= i + (2048 - k))
            {
                a(g, j);
                a();
                aa.a(this);
                return;
            }
        }
    }
}
