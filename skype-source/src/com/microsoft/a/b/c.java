// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.a.b;

import java.io.IOException;

// Referenced classes of package com.microsoft.a.b:
//            a

public final class c extends a
{

    private byte a[];
    private int b;

    public c()
    {
        this((byte)0);
    }

    private c(byte byte0)
    {
        a = new byte[1024];
        b = 0;
    }

    private void a(int i)
    {
        if (a.length >= b + i)
        {
            return;
        }
        int k = a.length + (a.length >> 1);
        int j = k;
        if (k < b + i)
        {
            j = b + i;
        }
        byte abyte0[] = new byte[j];
        System.arraycopy(a, 0, abyte0, 0, b);
        a = abyte0;
    }

    public final void a(byte byte0)
    {
        a(1);
        a[b] = byte0;
        b = b + 1;
    }

    public final void a(byte abyte0[])
    {
        a(abyte0, abyte0.length);
    }

    public final void a(byte abyte0[], int i)
    {
        a(i);
        System.arraycopy(abyte0, 0, a, b, i);
        b = b + i;
    }

    public final byte[] a()
    {
        byte abyte0[] = new byte[b];
        System.arraycopy(a, 0, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public final void close()
        throws IOException
    {
        a = null;
        b = -1;
    }
}
