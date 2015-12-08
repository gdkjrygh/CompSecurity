// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package ar.com.hjg.pngj:
//            i, x

public final class a
{

    private InputStream a;
    private byte b[];
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;

    public a(InputStream inputstream)
    {
        this(inputstream, (byte)0);
    }

    private a(InputStream inputstream, byte byte0)
    {
        e = false;
        f = true;
        g = false;
        a = inputstream;
        b = new byte[8192];
    }

    private int a(i j, int k)
    {
        int l = 0;
        if (c == 0 && c <= 0 && !e)
        {
            try
            {
                d = 0;
                c = a.read(b);
                if (c < 0)
                {
                    b();
                }
            }
            // Misplaced declaration of an exception variable
            catch (i j)
            {
                throw new x(j);
            }
        }
        if (k <= 0 || k >= c)
        {
            k = c;
        }
        if (k > 0)
        {
            k = j.a(b, d, k);
            l = k;
            if (k > 0)
            {
                d = d + k;
                c = c - k;
                l = k;
            }
        }
        if (l <= 0 && g)
        {
            throw new x("failed feed bytes");
        } else
        {
            return l;
        }
    }

    public final int a(i j)
    {
        return a(j, -1);
    }

    public final void a()
    {
        f = true;
    }

    public final void b()
    {
        e = true;
        b = null;
        c = 0;
        d = 0;
        if (a != null && f)
        {
            try
            {
                a.close();
            }
            catch (Exception exception) { }
        }
        a = null;
    }

    public final boolean b(i j)
    {
        int l;
        for (int k = 36; k > 0; k -= l)
        {
            l = a(j, k);
            if (l <= 0)
            {
                return false;
            }
        }

        return true;
    }

    public final void c()
    {
        g = true;
    }
}
