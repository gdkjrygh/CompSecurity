// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

final class okv
{

    final File a;
    final String b;
    final okd c;
    transient boolean d;
    transient boolean e;
    long f;
    long g;

    okv(File file, String s, okd okd1, boolean flag, long l, long l1)
    {
label0:
        {
            boolean flag1 = false;
            super();
            a = (File)p.b(file, "cacheDir cannot be null");
            b = (String)p.a(s, "name cannot be null");
            c = (okd)p.b(okd1, "map cannot be null");
            d = flag;
            e = false;
            if (l >= 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag, "lastAccessedTimestampMs cannot be negative");
            f = l;
            if (l1 < 0L)
            {
                flag = flag1;
                if (l1 != -1L)
                {
                    break label0;
                }
            }
            flag = true;
        }
        p.a(flag, "fileLengthBytes must be non-negative or must match FILE_LENGTH_UNKNOWN");
        g = l1;
    }

    public static okv a(File file, String s)
    {
        Object obj = String.valueOf(s);
        String s1 = String.valueOf("~m");
        byte abyte0[];
        if (s1.length() != 0)
        {
            obj = ((String) (obj)).concat(s1);
        } else
        {
            obj = new String(((String) (obj)));
        }
        obj = new File(file, ((String) (obj)));
        try
        {
            obj = new RandomAccessFile(((File) (obj)), "r");
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return null;
        }
        abyte0 = new byte[(int)((RandomAccessFile) (obj)).length()];
        ((RandomAccessFile) (obj)).readFully(abyte0);
        ((RandomAccessFile) (obj)).close();
        obj = (olk)qlw.a(new olk(), abyte0);
        if (((olk) (obj)).a != 1)
        {
            return null;
        } else
        {
            return new okv(file, s, okd.a(((olk) (obj)).d), false, ((olk) (obj)).b, ((olk) (obj)).c);
        }
        file;
        ((RandomAccessFile) (obj)).close();
        throw file;
    }

    public final void a(long l)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "timestampMs must be non-negative");
        f = l;
    }

    public final boolean a()
    {
        Object obj;
        Object obj1;
        if (!d || e)
        {
            return true;
        }
        obj1 = a;
        obj = String.valueOf(b);
        String s = String.valueOf("~m");
        byte abyte0[];
        if (s.length() != 0)
        {
            obj = ((String) (obj)).concat(s);
        } else
        {
            obj = new String(((String) (obj)));
        }
        obj = new File(((File) (obj1)), ((String) (obj)));
        obj1 = new olk();
        obj1.a = 1;
        obj1.b = f;
        obj1.c = g;
        obj1.d = c.a;
        abyte0 = olk.a(((qlw) (obj1)));
        obj1 = null;
        obj = new FileOutputStream(((File) (obj)));
        ((FileOutputStream) (obj)).write(abyte0);
        p.a(((java.io.Closeable) (obj)));
        return true;
        obj;
        obj = null;
_L4:
        p.a(((java.io.Closeable) (obj)));
        return false;
        Exception exception;
        exception;
        obj = obj1;
        obj1 = exception;
_L2:
        p.a(((java.io.Closeable) (obj)));
        throw obj1;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
        IOException ioexception;
        ioexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a(int i)
    {
        okd okd1 = c;
        if (i < 0)
        {
            throw new IndexOutOfBoundsException("bit index must be non-negative");
        }
        int j = i / 8;
        if (j < okd1.a.length)
        {
            i = (byte)(1 << i % 8);
            if ((okd1.a[j] & i) != 0)
            {
                return true;
            }
        }
        return false;
    }
}
