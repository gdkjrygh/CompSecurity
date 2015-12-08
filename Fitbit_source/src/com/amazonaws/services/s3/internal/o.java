// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.e;
import com.amazonaws.services.s3.model.bm;
import com.amazonaws.services.s3.model.bn;
import java.io.IOException;
import java.io.InputStream;

public class o extends e
{

    private static final int a = 8192;
    private final bn b;
    private int c;
    private boolean d;

    public o(InputStream inputstream, bn bn1)
    {
        super(inputstream);
        b = bn1;
    }

    private void a(int i)
    {
        c = c + i;
        if (c >= 8192)
        {
            b.a(new bm(c));
            c = 0;
        }
    }

    private void e()
    {
        if (!d)
        {
            return;
        } else
        {
            bm bm1 = new bm(c);
            bm1.a(4);
            c = 0;
            b.a(bm1);
            return;
        }
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public boolean a()
    {
        return d;
    }

    public void close()
        throws IOException
    {
        if (c > 0)
        {
            b.a(new bm(c));
            c = 0;
        }
        super.close();
    }

    public int read()
        throws IOException
    {
        int i = super.read();
        if (i == -1)
        {
            e();
        }
        if (i != -1)
        {
            a(1);
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        i = super.read(abyte0, i, j);
        if (i == -1)
        {
            e();
        }
        if (i != -1)
        {
            a(i);
        }
        return i;
    }
}
