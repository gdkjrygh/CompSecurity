// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class hdb
{

    private static BigInteger a;
    private static BigInteger b;
    private static BigInteger c;
    private static BigInteger d;
    private static BigInteger e;
    private static BigInteger f;

    public static void a(File file, File file1)
    {
        if (file == null)
        {
            throw new NullPointerException("Source must not be null");
        }
        if (!file.exists())
        {
            throw new FileNotFoundException((new StringBuilder("Source '")).append(file).append("' does not exist").toString());
        }
        if (file.isDirectory())
        {
            throw new IOException((new StringBuilder("Source '")).append(file).append("' exists but is a directory").toString());
        }
        if (file.getCanonicalPath().equals(file1.getCanonicalPath()))
        {
            throw new IOException((new StringBuilder("Source '")).append(file).append("' and destination '").append(file1).append("' are the same").toString());
        }
        File file2 = file1.getParentFile();
        if (file2 != null && !file2.mkdirs() && !file2.isDirectory())
        {
            throw new IOException((new StringBuilder("Destination '")).append(file2).append("' directory cannot be created").toString());
        }
        if (file1.exists() && !file1.canWrite())
        {
            throw new IOException((new StringBuilder("Destination '")).append(file1).append("' exists but is read-only").toString());
        } else
        {
            a(file, file1, true);
            return;
        }
    }

    private static void a(File file, File file1, FileFilter filefilter, boolean flag, List list)
    {
        File afile[];
        if (filefilter == null)
        {
            afile = file.listFiles();
        } else
        {
            afile = file.listFiles(filefilter);
        }
        if (afile == null)
        {
            throw new IOException((new StringBuilder("Failed to list contents of ")).append(file).toString());
        }
        if (file1.exists())
        {
            if (!file1.isDirectory())
            {
                throw new IOException((new StringBuilder("Destination '")).append(file1).append("' exists but is not a directory").toString());
            }
        } else
        if (!file1.mkdirs() && !file1.isDirectory())
        {
            throw new IOException((new StringBuilder("Destination '")).append(file1).append("' directory cannot be created").toString());
        }
        if (!file1.canWrite())
        {
            throw new IOException((new StringBuilder("Destination '")).append(file1).append("' cannot be written to").toString());
        }
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file2 = afile[i];
            File file3 = new File(file1, file2.getName());
            if (list == null || !list.contains(file2.getCanonicalPath()))
            {
                if (file2.isDirectory())
                {
                    a(file2, file3, filefilter, flag, list);
                } else
                {
                    a(file2, file3, flag);
                }
            }
            i++;
        }
        if (flag)
        {
            file1.setLastModified(file.lastModified());
        }
    }

    private static void a(File file, File file1, boolean flag)
    {
        FileChannel filechannel1;
        filechannel1 = null;
        if (file1.exists() && file1.isDirectory())
        {
            throw new IOException((new StringBuilder("Destination '")).append(file1).append("' exists but is a directory").toString());
        }
        Object obj = new FileInputStream(file);
        Object obj1 = new FileOutputStream(file1);
        FileChannel filechannel = ((FileInputStream) (obj)).getChannel();
        filechannel1 = ((FileOutputStream) (obj1)).getChannel();
        long l2 = filechannel.size();
        long l = 0L;
          goto _L1
_L8:
        long l1;
        l1 = filechannel1.transferFrom(filechannel, l, l1);
        l += l1;
          goto _L1
_L6:
        l1 = l2 - l;
        continue; /* Loop/switch isn't completed */
        file;
        file1 = null;
        obj = null;
        obj1 = null;
        filechannel = filechannel1;
_L2:
        hdc.a(file1);
        hdc.a(((java.io.OutputStream) (obj)));
        hdc.a(filechannel);
        hdc.a(((java.io.InputStream) (obj1)));
        throw file;
_L4:
        hdc.a(filechannel1);
        hdc.a(((java.io.OutputStream) (obj1)));
        hdc.a(filechannel);
        hdc.a(((java.io.InputStream) (obj)));
        if (file.length() != file1.length())
        {
            throw new IOException((new StringBuilder("Failed to copy full contents from '")).append(file).append("' to '").append(file1).append("'").toString());
        }
        if (flag)
        {
            file1.setLastModified(file.lastModified());
        }
        return;
        file;
        file1 = null;
        Object obj2 = null;
        obj1 = obj;
        filechannel = filechannel1;
        obj = obj2;
        continue; /* Loop/switch isn't completed */
        file;
        file1 = null;
        Object obj3 = obj;
        filechannel = filechannel1;
        obj = obj1;
        obj1 = obj3;
        continue; /* Loop/switch isn't completed */
        file;
        Object obj4 = obj;
        file1 = null;
        obj = obj1;
        obj1 = obj4;
        continue; /* Loop/switch isn't completed */
        file;
        Object obj5 = obj;
        file1 = filechannel1;
        obj = obj1;
        obj1 = obj5;
        if (true) goto _L2; else goto _L1
_L1:
        if (l >= l2) goto _L4; else goto _L3
_L3:
        if (l2 - l <= 0x1e00000L) goto _L6; else goto _L5
_L5:
        l1 = 0x1e00000L;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void b(File file, File file1)
    {
        ArrayList arraylist;
label0:
        {
            if (file == null)
            {
                throw new NullPointerException("Source must not be null");
            }
            if (!file.exists())
            {
                throw new FileNotFoundException((new StringBuilder("Source '")).append(file).append("' does not exist").toString());
            }
            if (!file.isDirectory())
            {
                throw new IOException((new StringBuilder("Source '")).append(file).append("' exists but is not a directory").toString());
            }
            if (file.getCanonicalPath().equals(file1.getCanonicalPath()))
            {
                throw new IOException((new StringBuilder("Source '")).append(file).append("' and destination '").append(file1).append("' are the same").toString());
            }
            if (file1.getCanonicalPath().startsWith(file.getCanonicalPath()))
            {
                File afile[] = file.listFiles();
                if (afile != null && afile.length > 0)
                {
                    ArrayList arraylist1 = new ArrayList(afile.length);
                    int j = afile.length;
                    int i = 0;
                    do
                    {
                        arraylist = arraylist1;
                        if (i >= j)
                        {
                            break;
                        }
                        arraylist1.add((new File(file1, afile[i].getName())).getCanonicalPath());
                        i++;
                    } while (true);
                    break label0;
                }
            }
            arraylist = null;
        }
        a(file, file1, null, true, arraylist);
    }

    static 
    {
        BigInteger biginteger = BigInteger.valueOf(1024L);
        a = biginteger;
        b = biginteger.multiply(biginteger);
        c = a.multiply(b);
        d = a.multiply(c);
        e = a.multiply(d);
        a.multiply(e);
        f = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(0x1000000000000000L));
        a.multiply(f);
        Charset.forName("UTF-8");
    }
}
