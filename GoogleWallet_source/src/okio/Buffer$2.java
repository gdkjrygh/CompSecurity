// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.InputStream;

// Referenced classes of package okio:
//            Buffer

final class tream extends InputStream
{

    final Buffer this$0;

    public final int available()
    {
        return (int)Math.min(size, 0x7fffffffL);
    }

    public final void close()
    {
    }

    public final int read()
    {
        if (size > 0L)
        {
            return readByte() & 0xff;
        } else
        {
            return -1;
        }
    }

    public final int read(byte abyte0[], int i, int j)
    {
        return Buffer.this.read(abyte0, i, j);
    }

    public final String toString()
    {
        return (new StringBuilder()).append(Buffer.this).append(".inputStream()").toString();
    }

    ng()
    {
        this$0 = Buffer.this;
        super();
    }
}
