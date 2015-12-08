// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import java.io.InputStream;
import java.io.RandomAccessFile;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            QueueFile

final class <init> extends InputStream
{

    final QueueFile a;
    private int b;
    private int c;

    public int read()
    {
        if (c == 0)
        {
            return -1;
        } else
        {
            QueueFile.a(a).seek(b);
            int i = QueueFile.a(a).read();
            b = QueueFile.a(a, b + 1);
            c = c - 1;
            return i;
        }
    }

    public int read(byte abyte0[], int i, int j)
    {
        QueueFile.a(abyte0, "buffer");
        if ((i | j) < 0 || j > abyte0.length - i)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (c > 0)
        {
            int k = j;
            if (j > c)
            {
                k = c;
            }
            QueueFile.a(a, b, abyte0, i, k);
            b = QueueFile.a(a, b + k);
            c = c - k;
            return k;
        } else
        {
            return -1;
        }
    }

    private (QueueFile queuefile,  )
    {
        a = queuefile;
        super();
        b = QueueFile.a(queuefile, .b + 4);
        c = .c;
    }

    c(QueueFile queuefile, c c1, c c2)
    {
        this(queuefile, c1);
    }
}
