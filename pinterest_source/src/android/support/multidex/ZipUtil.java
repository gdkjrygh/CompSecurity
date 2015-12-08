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

    private static final int BUFFER_SIZE = 16384;
    private static final int ENDHDR = 22;
    private static final int ENDSIG = 0x6054b50;

    ZipUtil()
    {
    }

    static long computeCrcOfCentralDir(RandomAccessFile randomaccessfile, CentralDirectory centraldirectory)
    {
        CRC32 crc32 = new CRC32();
        long l = centraldirectory.size;
        randomaccessfile.seek(centraldirectory.offset);
        int i = (int)Math.min(16384L, l);
        centraldirectory = new byte[16384];
        i = randomaccessfile.read(centraldirectory, 0, i);
        do
        {
            if (i == -1)
            {
                break;
            }
            crc32.update(centraldirectory, 0, i);
            l -= i;
            if (l == 0L)
            {
                break;
            }
            i = randomaccessfile.read(centraldirectory, 0, (int)Math.min(16384L, l));
        } while (true);
        return crc32.getValue();
    }

    static CentralDirectory findCentralDirectory(RandomAccessFile randomaccessfile)
    {
        long l = 0L;
        long l1 = randomaccessfile.length() - 22L;
        if (l1 < 0L)
        {
            throw new ZipException((new StringBuilder("File too short to be a zip file: ")).append(randomaccessfile.length()).toString());
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
            if (randomaccessfile.readInt() != i)
            {
                l2 = l1 - 1L;
                l1 = l2;
                if (l2 < l)
                {
                    throw new ZipException("End Of Central Directory signature not found");
                }
            } else
            {
                randomaccessfile.skipBytes(2);
                randomaccessfile.skipBytes(2);
                randomaccessfile.skipBytes(2);
                randomaccessfile.skipBytes(2);
                CentralDirectory centraldirectory = new CentralDirectory();
                centraldirectory.size = (long)Integer.reverseBytes(randomaccessfile.readInt()) & 0xffffffffL;
                centraldirectory.offset = (long)Integer.reverseBytes(randomaccessfile.readInt()) & 0xffffffffL;
                return centraldirectory;
            }
        } while (true);
    }

    static long getZipCrc(File file)
    {
        file = new RandomAccessFile(file, "r");
        long l = computeCrcOfCentralDir(file, findCentralDirectory(file));
        file.close();
        return l;
        Exception exception;
        exception;
        file.close();
        throw exception;
    }

    private class CentralDirectory
    {

        long offset;
        long size;

        CentralDirectory()
        {
        }
    }

}
