// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

// Referenced classes of package com.crashlytics.android:
//            ao, QueueFile

final class ap extends InputStream
{

    private int a;
    private int b;
    private QueueFile c;

    private ap(QueueFile queuefile, ao ao1)
    {
        c = queuefile;
        super();
        a = QueueFile.a(queuefile, ao1.b + 4);
        b = ao1.c;
    }

    ap(QueueFile queuefile, ao ao1, byte byte0)
    {
        this(queuefile, ao1);
    }

    public final int read()
        throws IOException
    {
        if (b == 0)
        {
            return -1;
        } else
        {
            QueueFile.a(c).seek(a);
            int i = QueueFile.a(c).read();
            a = QueueFile.a(c, a + 1);
            b = b - 1;
            return i;
        }
    }

    public final int read(byte abyte0[], int i, int j)
        throws IOException
    {
        QueueFile.a(abyte0, "buffer");
        if ((i | j) < 0 || j > abyte0.length - i)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (b > 0)
        {
            int k = j;
            if (j > b)
            {
                k = b;
            }
            QueueFile.a(c, a, abyte0, i, k);
            a = QueueFile.a(c, a + k);
            b = b - k;
            return k;
        } else
        {
            return -1;
        }
    }
}
