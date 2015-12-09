// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.multidex;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

final class c
{
    static class a
    {

        long a;
        long b;

        a()
        {
        }
    }


    c()
    {
    }

    static long a(File file)
        throws IOException
    {
        file = new RandomAccessFile(file, "r");
        long l = a(((RandomAccessFile) (file)), a(((RandomAccessFile) (file))));
        file.close();
        return l;
        Exception exception;
        exception;
        file.close();
        throw exception;
    }

    static long a(RandomAccessFile randomaccessfile, a a1)
        throws IOException
    {
        CRC32 crc32 = new CRC32();
        long l = a1.b;
        randomaccessfile.seek(a1.a);
        int i = (int)Math.min(16384L, l);
        a1 = new byte[16384];
        i = randomaccessfile.read(a1, 0, i);
        do
        {
label0:
            {
                if (i != -1)
                {
                    crc32.update(a1, 0, i);
                    l -= i;
                    if (l != 0L)
                    {
                        break label0;
                    }
                }
                return crc32.getValue();
            }
            i = randomaccessfile.read(a1, 0, (int)Math.min(16384L, l));
        } while (true);
    }

    static a a(RandomAccessFile randomaccessfile)
        throws IOException, ZipException
    {
        long l = 0L;
        long l1 = randomaccessfile.length() - 22L;
        if (l1 < 0L)
        {
            throw new ZipException((new StringBuilder()).append("File too short to be a zip file: ").append(randomaccessfile.length()).toString());
        }
        long l2 = l1 - 0x10000L;
        int i;
        if (l2 >= 0L)
        {
            l = l2;
        }
        i = Integer.reverseBytes(0x6054b50);
        do
        {
            randomaccessfile.seek(l1);
            if (randomaccessfile.readInt() == i)
            {
                randomaccessfile.skipBytes(2);
                randomaccessfile.skipBytes(2);
                randomaccessfile.skipBytes(2);
                randomaccessfile.skipBytes(2);
                a a1 = new a();
                a1.b = (long)Integer.reverseBytes(randomaccessfile.readInt()) & 0xffffffffL;
                a1.a = (long)Integer.reverseBytes(randomaccessfile.readInt()) & 0xffffffffL;
                return a1;
            }
            l2 = l1 - 1L;
            l1 = l2;
        } while (l2 >= l);
        throw new ZipException("End Of Central Directory signature not found");
    }
}
