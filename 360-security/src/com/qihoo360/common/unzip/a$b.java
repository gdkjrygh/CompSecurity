// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.unzip;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Enumeration;
import java.util.NoSuchElementException;

// Referenced classes of package com.qihoo360.common.unzip:
//            a, ZipShort, ZipLong

public class c
    implements Enumeration
{

    final a a;
    private boolean b;
    private long c;

    private String a(byte abyte0[])
    {
        char ac[] = new char[abyte0.length];
        int i = 0;
        do
        {
            if (i >= abyte0.length)
            {
                return new String(ac);
            }
            ac[i] = (char)abyte0[i];
            i++;
        } while (true);
    }

    private c b()
        throws IOException
    {
        c c1 = new <init>(a);
        a.a.readFully(com.qihoo360.common.unzip.a.b(a));
        c1.b = ZipShort.getValue(com.qihoo360.common.unzip.a.b(a), 4);
        c1.c = ZipShort.getValue(com.qihoo360.common.unzip.a.b(a), 6);
        c1.d = ZipLong.getValue(com.qihoo360.common.unzip.a.b(a), 16);
        int i = ZipShort.getValue(com.qihoo360.common.unzip.a.b(a), 24);
        int j = ZipShort.getValue(com.qihoo360.common.unzip.a.b(a), 26);
        int k = ZipShort.getValue(com.qihoo360.common.unzip.a.b(a), 28);
        byte abyte0[] = new byte[i];
        a.a.readFully(abyte0);
        c1.a = a(abyte0);
        c1.e = ZipLong.getValue(com.qihoo360.common.unzip.a.b(a), 38);
        com.qihoo360.common.unzip.a.a(a, j);
        com.qihoo360.common.unzip.a.a(a, k);
        c = a.a.getFilePointer();
        c1.c();
        a.a.seek(c);
        return c1;
    }

    public c a()
    {
        if (!b)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        c c1;
        if (c > 0L)
        {
            a.a.seek(c);
        }
        c1 = b();
        a.a.readFully(com.qihoo360.common.unzip.a.a(a));
        boolean flag;
        if (ZipLong.getValue(com.qihoo360.common.unzip.a.a(a)) == com.qihoo360.common.unzip.a.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        c = a.a.getFilePointer();
        return c1;
        Exception exception;
        exception;
        throw new NoSuchElementException();
    }

    public boolean hasMoreElements()
    {
        return b;
    }

    public Object nextElement()
    {
        return a();
    }

    public on(a a1)
    {
        a = a1;
        super();
        b = true;
        c = -1L;
    }
}
