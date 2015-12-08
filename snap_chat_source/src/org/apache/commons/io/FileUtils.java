// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;

// Referenced classes of package org.apache.commons.io:
//            FilenameUtils, IOUtils, Charsets

public class FileUtils
{

    public static final File EMPTY_FILE_ARRAY[] = new File[0];
    public static final BigInteger ONE_EB_BI;
    public static final BigInteger ONE_GB_BI;
    public static final BigInteger ONE_KB_BI;
    public static final BigInteger ONE_MB_BI;
    public static final BigInteger ONE_PB_BI;
    public static final BigInteger ONE_TB_BI;
    public static final BigInteger ONE_YB;
    public static final BigInteger ONE_ZB;
    private static final Charset UTF8 = Charset.forName("UTF-8");

    public static void cleanDirectory(File file)
    {
        if (!file.exists())
        {
            throw new IllegalArgumentException((new StringBuilder()).append(file).append(" does not exist").toString());
        }
        if (!file.isDirectory())
        {
            throw new IllegalArgumentException((new StringBuilder()).append(file).append(" is not a directory").toString());
        }
        File afile[] = file.listFiles();
        if (afile == null)
        {
            throw new IOException((new StringBuilder("Failed to list contents of ")).append(file).toString());
        }
        int j = afile.length;
        file = null;
        int i = 0;
        while (i < j) 
        {
            File file1 = afile[i];
            try
            {
                forceDelete(file1);
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
            i++;
        }
        if (file != null)
        {
            throw file;
        } else
        {
            return;
        }
    }

    public static void deleteDirectory(File file)
    {
        if (file.exists())
        {
            if (!isSymlink(file))
            {
                cleanDirectory(file);
            }
            if (!file.delete())
            {
                throw new IOException((new StringBuilder("Unable to delete directory ")).append(file).append(".").toString());
            }
        }
    }

    public static void forceDelete(File file)
    {
        if (file.isDirectory())
        {
            deleteDirectory(file);
        } else
        {
            boolean flag = file.exists();
            if (!file.delete())
            {
                if (!flag)
                {
                    throw new FileNotFoundException((new StringBuilder("File does not exist: ")).append(file).toString());
                } else
                {
                    throw new IOException((new StringBuilder("Unable to delete file: ")).append(file).toString());
                }
            }
        }
    }

    public static boolean isSymlink(File file)
    {
        if (file == null)
        {
            throw new NullPointerException("File must not be null");
        }
        if (FilenameUtils.isSystemWindows())
        {
            return false;
        }
        File file1 = file;
        if (file.getParent() != null)
        {
            file1 = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file1.getCanonicalFile().equals(file1.getAbsoluteFile());
    }

    public static FileInputStream openInputStream(File file)
    {
        if (file.exists())
        {
            if (file.isDirectory())
            {
                throw new IOException((new StringBuilder("File '")).append(file).append("' exists but is a directory").toString());
            }
            if (!file.canRead())
            {
                throw new IOException((new StringBuilder("File '")).append(file).append("' cannot be read").toString());
            } else
            {
                return new FileInputStream(file);
            }
        } else
        {
            throw new FileNotFoundException((new StringBuilder("File '")).append(file).append("' does not exist").toString());
        }
    }

    public static byte[] readFileToByteArray(File file)
    {
        FileInputStream fileinputstream = null;
        FileInputStream fileinputstream1 = openInputStream(file);
        fileinputstream = fileinputstream1;
        file = IOUtils.toByteArray(fileinputstream1, file.length());
        IOUtils.closeQuietly(fileinputstream1);
        return file;
        file;
        IOUtils.closeQuietly(fileinputstream);
        throw file;
    }

    public static String readFileToString(File file, String s)
    {
        return readFileToString(file, Charsets.toCharset(s));
    }

    public static String readFileToString(File file, Charset charset)
    {
        File file1 = null;
        file = openInputStream(file);
        file1 = file;
        charset = IOUtils.toString(file, Charsets.toCharset(charset));
        IOUtils.closeQuietly(file);
        return charset;
        file;
        IOUtils.closeQuietly(file1);
        throw file;
    }

    static 
    {
        BigInteger biginteger = BigInteger.valueOf(1024L);
        ONE_KB_BI = biginteger;
        ONE_MB_BI = biginteger.multiply(biginteger);
        ONE_GB_BI = ONE_KB_BI.multiply(ONE_MB_BI);
        ONE_TB_BI = ONE_KB_BI.multiply(ONE_GB_BI);
        ONE_PB_BI = ONE_KB_BI.multiply(ONE_TB_BI);
        ONE_EB_BI = ONE_KB_BI.multiply(ONE_PB_BI);
        ONE_ZB = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(0x1000000000000000L));
        ONE_YB = ONE_KB_BI.multiply(ONE_ZB);
    }
}
