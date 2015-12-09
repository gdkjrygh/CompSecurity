// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.common.byteSources;

import java.io.InputStream;

// Referenced classes of package org.apache.sanselan.common.byteSources:
//            ByteSourceInputStream

class <init> extends InputStream
{

    final ByteSourceInputStream a;
    private d b;
    private boolean c;
    private int d;

    public int read()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        if (!c) goto _L4; else goto _L3
_L3:
        return -1;
_L4:
        b = ByteSourceInputStream.b(a);
        c = true;
_L2:
        if (b != null && d >= b.b.length)
        {
            b = b.b();
            d = 0;
        }
        if (b != null && d < b.b.length)
        {
            byte abyte0[] = b.b;
            int i = d;
            d = i + 1;
            return abyte0[i] & 0xff;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public int read(byte abyte0[], int i, int j)
    {
        if (abyte0 == null)
        {
            throw new NullPointerException();
        }
        if (i < 0 || i > abyte0.length || j < 0 || i + j > abyte0.length || i + j < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        if (j == 0)
        {
            return 0;
        }
        if (b == null)
        {
            if (c)
            {
                return -1;
            }
            b = ByteSourceInputStream.b(a);
            c = true;
        }
        if (b != null && d >= b.b.length)
        {
            b = b.b();
            d = 0;
        }
        if (b == null)
        {
            return -1;
        }
        if (d >= b.b.length)
        {
            return -1;
        } else
        {
            j = Math.min(j, b.b.length - d);
            System.arraycopy(b.b, d, abyte0, i, j);
            d = d + j;
            return j;
        }
    }

    private (ByteSourceInputStream bytesourceinputstream)
    {
        a = bytesourceinputstream;
        super();
        b = null;
        c = false;
        d = 0;
    }

    d(ByteSourceInputStream bytesourceinputstream, byte byte0)
    {
        this(bytesourceinputstream);
    }
}
