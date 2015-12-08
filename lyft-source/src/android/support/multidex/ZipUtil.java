// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.multidex;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

final class ZipUtil
{

    static long a(File file)
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

    static long a(RandomAccessFile randomaccessfile, CentralDirectory centraldirectory)
    {
        CRC32 crc32 = new CRC32();
        long l = centraldirectory.b;
        randomaccessfile.seek(centraldirectory.a);
        int i = (int)Math.min(16384L, l);
        centraldirectory = new byte[16384];
        i = randomaccessfile.read(centraldirectory, 0, i);
        do
        {
label0:
            {
                if (i != -1)
                {
                    crc32.update(centraldirectory, 0, i);
                    l -= i;
                    if (l != 0L)
                    {
                        break label0;
                    }
                }
                return crc32.getValue();
            }
            i = randomaccessfile.read(centraldirectory, 0, (int)Math.min(16384L, l));
        } while (true);
    }

    static CentralDirectory a(RandomAccessFile randomaccessfile)
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
                CentralDirectory centraldirectory = new CentralDirectory();
                centraldirectory.b = (long)Integer.reverseBytes(randomaccessfile.readInt()) & 0xffffffffL;
                centraldirectory.a = (long)Integer.reverseBytes(randomaccessfile.readInt()) & 0xffffffffL;
                return centraldirectory;
            }
            l2 = l1 - 1L;
            l1 = l2;
        } while (l2 >= l);
        throw new ZipException("End Of Central Directory signature not found");
    }

    private class CentralDirectory
    {

        long a;
        long b;

        CentralDirectory()
        {
        }
    }

}
