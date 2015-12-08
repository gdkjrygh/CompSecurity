// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.jirbo.adcolony:
//            a

class x extends InputStream
{

    InputStream a;
    byte b[];
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;

    x(String s)
    {
        b = new byte[1024];
        if (a.n != 0)
        {
            h = 23;
            g = 23;
        }
        c = (int)(new File(s)).length();
        a = new FileInputStream(s);
    }

    void a()
    {
        for (e = 0; e == 0; e = a.read(b, 0, 1024)) { }
        for (int i = 0; i < e; i++)
        {
            b[i] = (byte)(b[i] ^ g);
            g = g + h;
        }

        f = 0;
    }

    public int available()
    {
        return (e - f) + a.available();
    }

    public void close()
    {
        a.close();
    }

    public void mark(int i)
    {
    }

    public boolean markSupported()
    {
        return false;
    }

    public int read()
    {
        if (d == c)
        {
            return -1;
        }
        if (f >= e)
        {
            a();
        }
        d = d + 1;
        byte abyte0[] = b;
        int i = f;
        f = i + 1;
        return abyte0[i];
    }

    public int read(byte abyte0[])
    {
        return read(abyte0, 0, abyte0.length);
    }

    public int read(byte abyte0[], int i, int j)
    {
        if (d == c)
        {
            return -1;
        }
        int l = c - d;
        int k = j;
        if (j > l)
        {
            k = l;
        }
        boolean flag = false;
        l = k;
        j = i;
        k = ((flag) ? 1 : 0);
        for (i = l; i > 0;)
        {
            if (f == e)
            {
                a();
            }
            int i1;
            int j1;
            if (i < e)
            {
                i1 = i;
            } else
            {
                i1 = e;
            }
            for (j1 = 0; j1 < i1;)
            {
                byte abyte1[] = b;
                int k1 = f;
                f = k1 + 1;
                abyte0[j] = abyte1[k1];
                j1++;
                j++;
            }

            i -= i1;
            k += i1;
            d = i1 + d;
        }

        return k;
    }

    public void reset()
    {
        throw new IOException("ADCStreamReader does not support reset().");
    }

    public long skip(long l)
    {
        throw new IOException("ADCStreamReader does not support skip().");
    }
}
