// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.a;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

// Referenced classes of package android.support.a:
//            f

final class e
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

    private static long a(RandomAccessFile randomaccessfile, f f1)
    {
        CRC32 crc32 = new CRC32();
        long l = f1.b;
        randomaccessfile.seek(f1.a);
        int i = (int)Math.min(16384L, l);
        f1 = new byte[16384];
        i = randomaccessfile.read(f1, 0, i);
        do
        {
            if (i == -1)
            {
                break;
            }
            crc32.update(f1, 0, i);
            l -= i;
            if (l == 0L)
            {
                break;
            }
            i = randomaccessfile.read(f1, 0, (int)Math.min(16384L, l));
        } while (true);
        return crc32.getValue();
    }

    private static f a(RandomAccessFile randomaccessfile)
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
                f f1 = new f();
                f1.b = (long)Integer.reverseBytes(randomaccessfile.readInt()) & 0xffffffffL;
                f1.a = (long)Integer.reverseBytes(randomaccessfile.readInt()) & 0xffffffffL;
                return f1;
            }
        } while (true);
    }
}
