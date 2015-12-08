// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            QueueFile

private final class <init> extends InputStream
{

    private int position;
    private int remaining;
    final QueueFile this$0;

    public int read()
        throws IOException
    {
        if (remaining == 0)
        {
            return -1;
        } else
        {
            QueueFile.access$400(QueueFile.this).seek(position);
            int i = QueueFile.access$400(QueueFile.this).read();
            position = QueueFile.access$100(QueueFile.this, position + 1);
            remaining = remaining - 1;
            return i;
        }
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        QueueFile.access$200(abyte0, "buffer");
        if ((i | j) < 0 || j > abyte0.length - i)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (remaining > 0)
        {
            int k = j;
            if (j > remaining)
            {
                k = remaining;
            }
            QueueFile.access$300(QueueFile.this, position, abyte0, i, k);
            position = QueueFile.access$100(QueueFile.this, position + k);
            remaining = remaining - k;
            return k;
        } else
        {
            return -1;
        }
    }

    private ( )
    {
        this$0 = QueueFile.this;
        super();
        position = QueueFile.access$100(QueueFile.this, .position + 4);
        remaining = .remaining;
    }

    remaining(remaining remaining1, remaining remaining2)
    {
        this(remaining1);
    }
}
