// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;

public final class bdd extends InputStream
{

    private final bdc a;
    private final bde b;
    private final byte c[] = new byte[1];
    private boolean d;
    private boolean e;

    public bdd(bdc bdc1, bde bde)
    {
        d = false;
        e = false;
        a = bdc1;
        b = bde;
    }

    final void a()
    {
        if (!d)
        {
            a.a(b);
            d = true;
        }
    }

    public final void close()
    {
        if (!e)
        {
            a.b();
            e = true;
        }
    }

    public final int read()
    {
        if (read(c) == -1)
        {
            return -1;
        } else
        {
            return c[0] & 0xff;
        }
    }

    public final int read(byte abyte0[])
    {
        return read(abyte0, 0, abyte0.length);
    }

    public final int read(byte abyte0[], int i, int j)
    {
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        a();
        return a.a(abyte0, i, j);
    }

    public final long skip(long l)
    {
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        a();
        return super.skip(l);
    }
}
