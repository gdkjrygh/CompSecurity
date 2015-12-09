// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.write;

import java.io.IOException;
import java.io.OutputStream;

class b extends OutputStream
{

    private final byte a[];
    private int b;

    public void write(int i)
    {
        if (b >= a.length)
        {
            throw new IOException("Buffer overflow.");
        } else
        {
            byte abyte0[] = a;
            int j = b;
            b = j + 1;
            abyte0[j] = (byte)i;
            return;
        }
    }

    public void write(byte abyte0[], int i, int j)
    {
        if (b + j > a.length)
        {
            throw new IOException("Buffer overflow.");
        } else
        {
            System.arraycopy(abyte0, i, a, b, j);
            b = b + j;
            return;
        }
    }

    public (byte abyte0[], int i)
    {
        a = abyte0;
        b = i;
    }
}
