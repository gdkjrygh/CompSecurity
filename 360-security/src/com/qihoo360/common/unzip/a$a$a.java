// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.unzip;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

// Referenced classes of package com.qihoo360.common.unzip:
//            a

private class c extends InputStream
{

    final b a;
    private long b;
    private long c;
    private boolean d;

    void a()
    {
        d = true;
    }

    public int read()
        throws IOException
    {
        long l = b;
        b = l - 1L;
        if (l <= 0L)
        {
            if (d)
            {
                d = false;
                return 0;
            } else
            {
                return -1;
            }
        }
        int i;
        synchronized (d(a).a)
        {
            RandomAccessFile randomaccessfile1 = a(a).a;
            long l1 = c;
            c = l1 + 1L;
            randomaccessfile1.seek(l1);
            i = c(a).a.read();
        }
        return i;
        exception;
        randomaccessfile;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        int k = 0;
        if (b > 0L) goto _L2; else goto _L1
_L1:
        if (!d) goto _L4; else goto _L3
_L3:
        d = false;
        abyte0[i] = 0;
        k = 1;
_L6:
        return k;
_L4:
        return -1;
_L2:
        if (j <= 0) goto _L6; else goto _L5
_L5:
        k = j;
        if ((long)j > b)
        {
            k = (int)b;
        }
        synchronized (b(a).a)
        {
            a(a).a.seek(c);
            i = c(a).a.read(abyte0, i, k);
        }
        k = i;
        if (i <= 0) goto _L6; else goto _L7
_L7:
        c = c + (long)i;
        b = b - (long)i;
        return i;
        abyte0;
        randomaccessfile;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    ( , long l, long l1)
    {
        a = ;
        super();
        d = false;
        b = l1;
        c = l;
    }
}
