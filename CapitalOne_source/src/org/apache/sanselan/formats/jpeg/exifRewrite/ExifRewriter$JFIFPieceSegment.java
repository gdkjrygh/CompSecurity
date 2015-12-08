// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg.exifRewrite;

import java.io.OutputStream;

class d extends d
{

    public final int a;
    public final byte b[];
    public final byte c[];
    public final byte d[];

    protected final void a(OutputStream outputstream)
    {
        outputstream.write(b);
        outputstream.write(c);
        outputstream.write(d);
    }

    public (int i, byte abyte0[], byte abyte1[], byte abyte2[])
    {
        super((byte)0);
        a = i;
        b = abyte0;
        c = abyte1;
        d = abyte2;
    }
}
