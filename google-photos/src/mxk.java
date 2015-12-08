// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;
import java.nio.ByteBuffer;

final class mxk extends InputStream
{

    private ByteBuffer a;

    public mxk(ByteBuffer bytebuffer)
    {
        a = bytebuffer;
    }

    public final int read()
    {
        if (!a.hasRemaining())
        {
            return -1;
        } else
        {
            return a.get() & 0xff;
        }
    }

    public final int read(byte abyte0[], int i, int j)
    {
        if (!a.hasRemaining())
        {
            return -1;
        } else
        {
            j = Math.min(j, a.remaining());
            a.get(abyte0, i, j);
            return j;
        }
    }
}
