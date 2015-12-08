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
    static final class a
    {

        long a;
        long b;

        a()
        {
        }
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

    private static long a(RandomAccessFile randomaccessfile, a a1)
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
            if (i == -1)
            {
                break;
            }
            crc32.update(a1, 0, i);
            l -= i;
            if (l == 0L)
            {
                break;
            }
            i = randomaccessfile.read(a1, 0, (int)Math.min(16384L, l));
        } while (true);
        return crc32.getValue();
    }

    private static a a(RandomAccessFile randomaccessfile)
        throws IOException, ZipException
    {
        long l1 = randomaccessfile.length() - 22L;
        if (l1 < 0L)
        {
            throw new ZipException((new StringBuilder("File too short to be a zip file: ")).append(randomaccessfile.length()).toString());
        }
        long l2 = l1 - 0x10000L;
        long l = l2;
        if (l2 < 0L)
        {
            l = 0L;
        }
        int i = Integer.reverseBytes(0x6054b50);
        do
        {
            randomaccessfile.seek(l1);
            if (randomaccessfile.readInt() != i)
            {
                long l3 = l1 - 1L;
                l1 = l3;
                if (l3 < l)
                {
                    throw new ZipException("End Of Central Directory signature not found");
                }
            } else
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
        } while (true);
    }
}
