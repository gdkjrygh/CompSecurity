// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

// Referenced classes of package com.qihoo360.common.utils:
//            FileUtil

public class ZipUtil
{
    public static final class SizeLimitZipResult extends Enum
    {

        public static final SizeLimitZipResult SizeLimitZipResult_NotFound;
        public static final SizeLimitZipResult SizeLimitZipResult_OK;
        public static final SizeLimitZipResult SizeLimitZipResult_TooBig;
        private static final SizeLimitZipResult a[];

        public static SizeLimitZipResult valueOf(String s)
        {
            return (SizeLimitZipResult)Enum.valueOf(com/qihoo360/common/utils/ZipUtil$SizeLimitZipResult, s);
        }

        public static SizeLimitZipResult[] values()
        {
            SizeLimitZipResult asizelimitzipresult[] = a;
            int i = asizelimitzipresult.length;
            SizeLimitZipResult asizelimitzipresult1[] = new SizeLimitZipResult[i];
            System.arraycopy(asizelimitzipresult, 0, asizelimitzipresult1, 0, i);
            return asizelimitzipresult1;
        }

        static 
        {
            SizeLimitZipResult_OK = new SizeLimitZipResult("SizeLimitZipResult_OK", 0);
            SizeLimitZipResult_TooBig = new SizeLimitZipResult("SizeLimitZipResult_TooBig", 1);
            SizeLimitZipResult_NotFound = new SizeLimitZipResult("SizeLimitZipResult_NotFound", 2);
            a = (new SizeLimitZipResult[] {
                SizeLimitZipResult_OK, SizeLimitZipResult_TooBig, SizeLimitZipResult_NotFound
            });
        }

        private SizeLimitZipResult(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface ZipTraversalCallback
    {

        public abstract boolean onProgress(ZipFile zipfile, ZipEntry zipentry)
            throws IOException;
    }

    static class a
        implements ZipTraversalCallback
    {

        boolean a;
        File b;

        public boolean onProgress(ZipFile zipfile, ZipEntry zipentry)
            throws IOException
        {
            Object obj;
            Object obj3;
            File file;
            boolean flag;
            obj = null;
            obj3 = null;
            flag = true;
            file = new File(b, zipentry.getName());
            if (!zipentry.isDirectory()) goto _L2; else goto _L1
_L1:
            if (!file.exists() && !file.mkdirs()) goto _L4; else goto _L3
_L3:
            flag = false;
_L8:
            return flag;
_L4:
            a = false;
            return true;
_L2:
            File file1 = file.getParentFile();
            if (!file1.exists() && !file1.mkdirs()) goto _L6; else goto _L5
_L5:
            zipfile = zipfile.getInputStream(zipentry);
            zipentry = new FileOutputStream(file);
            FileUtil.copyStream(zipfile, zipentry);
            if (zipfile != null)
            {
                zipfile.close();
            }
            if (zipentry != null)
            {
                zipentry.close();
            }
            return false;
            zipfile;
            zipfile = null;
            zipentry = obj3;
_L11:
            a = false;
            if (zipentry != null)
            {
                zipentry.close();
            }
            if (zipfile == null) goto _L8; else goto _L7
_L7:
            zipfile.close();
            return true;
            zipentry;
            zipfile = null;
_L10:
            if (zipfile != null)
            {
                zipfile.close();
            }
            if (obj != null)
            {
                ((OutputStream) (obj)).close();
            }
            throw zipentry;
_L6:
            a = false;
            return true;
            zipentry;
            continue; /* Loop/switch isn't completed */
            Exception exception;
            exception;
            obj = zipentry;
            zipentry = exception;
            continue; /* Loop/switch isn't completed */
            Object obj1;
            obj1;
            ZipEntry zipentry1 = zipentry;
            zipentry = ((ZipEntry) (obj1));
            obj1 = zipfile;
            zipfile = zipentry1;
            if (true) goto _L10; else goto _L9
_L9:
            zipentry;
            Object obj2 = null;
            zipentry = zipfile;
            zipfile = obj2;
              goto _L11
            obj2;
            ZipFile zipfile1 = zipfile;
            zipfile = zipentry;
            zipentry = zipfile1;
              goto _L11
        }

        a()
        {
            a = true;
        }
    }

    static class b
        implements ZipTraversalCallback
    {

        boolean a;
        String b;
        File c;

        public boolean onProgress(ZipFile zipfile, ZipEntry zipentry)
            throws IOException
        {
            while (zipentry.isDirectory() || !b.equals(zipentry.getName())) 
            {
                return false;
            }
            zipfile = zipfile.getInputStream(zipentry);
            zipentry = new FileOutputStream(c);
            FileUtil.copyStream(zipfile, zipentry);
            zipfile.close();
            zipentry.close();
            a = true;
            return true;
        }

        b()
        {
            a = false;
        }
    }


    public static final boolean bDebug = false;

    public ZipUtil()
    {
    }

    public static byte[] GZip(byte abyte0[])
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        Object obj = new GZIPOutputStream(bytearrayoutputstream);
        abyte0 = new BufferedInputStream(new ByteArrayInputStream(abyte0), 32768);
        Object obj1;
        byte abyte1[];
        abyte1 = abyte0;
        obj1 = obj;
        byte abyte2[] = new byte[4096];
_L3:
        abyte1 = abyte0;
        obj1 = obj;
        int i = abyte0.read(abyte2);
        if (i != -1) goto _L2; else goto _L1
_L1:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        abyte0.close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        ((GZIPOutputStream) (obj)).close();
        bytearrayoutputstream.close();
_L4:
        return bytearrayoutputstream.toByteArray();
_L2:
        abyte1 = abyte0;
        obj1 = obj;
        ((GZIPOutputStream) (obj)).write(abyte2, 0, i);
          goto _L3
        Exception exception;
        exception;
_L7:
        abyte1 = abyte0;
        obj1 = obj;
        exception.printStackTrace();
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return null;
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        ((GZIPOutputStream) (obj)).close();
        bytearrayoutputstream.close();
        return null;
        abyte0;
        abyte1 = null;
        obj = null;
_L6:
        if (abyte1 == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        abyte1.close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        ((GZIPOutputStream) (obj)).close();
        bytearrayoutputstream.close();
_L5:
        throw abyte0;
        abyte0;
          goto _L4
        obj;
          goto _L5
        abyte0;
        abyte1 = null;
          goto _L6
        abyte0;
        obj = obj1;
          goto _L6
        exception;
        abyte0 = null;
        obj = null;
          goto _L7
        exception;
        abyte0 = null;
          goto _L7
    }

    public static void GzipOneFile(File file, File file1)
        throws IOException
    {
        if (file.exists())
        {
            file1 = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(file1), 32768));
            a(file, file1);
            file1.close();
        }
    }

    public static void ZipDir(File file, File file1)
        throws IOException
    {
        file1 = new ZipOutputStream(new FileOutputStream(file1));
        if (!file.isDirectory()) goto _L2; else goto _L1
_L1:
        File afile[];
        int i;
        afile = file.listFiles();
        i = 0;
_L5:
        if (i < afile.length) goto _L3; else goto _L2
_L2:
        file1.close();
        return;
_L3:
        File file2 = afile[i];
        FileInputStream fileinputstream = new FileInputStream(file2);
        file1.putNextEntry(new ZipEntry((new StringBuilder(String.valueOf(file.getName()))).append(File.separator).append(file2.getName()).toString()));
        do
        {
            int j;
label0:
            {
                j = fileinputstream.read();
                if (j != -1)
                {
                    break label0;
                }
                fileinputstream.close();
                i++;
            }
            if (true)
            {
                continue;
            }
            file1.write(j);
        } while (true);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static SizeLimitZipResult ZipDirGzip(File file, File file1, int i, int j)
        throws IOException
    {
        File file2 = new File((new StringBuilder(String.valueOf(file1.getAbsolutePath()))).append(".tmp").toString());
        file2.delete();
        file = a(file, file2, i, j);
        if (file == SizeLimitZipResult.SizeLimitZipResult_NotFound)
        {
            return file;
        } else
        {
            GzipOneFile(file2, file1);
            file2.delete();
            return file;
        }
    }

    private static SizeLimitZipResult a(File file, File file1, long l, long l1)
        throws IOException
    {
        File afile[];
        ZipOutputStream zipoutputstream;
        int i;
        boolean flag1;
        int k;
        SizeLimitZipResult sizelimitzipresult = SizeLimitZipResult.SizeLimitZipResult_OK;
        if (!file.exists() || !file.isDirectory())
        {
            break MISSING_BLOCK_LABEL_421;
        }
        afile = file.listFiles();
        FileOutputStream fileoutputstream;
        boolean flag;
        if (afile.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        fileoutputstream = new FileOutputStream(file1);
        zipoutputstream = new ZipOutputStream(fileoutputstream);
        file1 = null;
        if (l1 <= 0L && l <= 0L)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (flag1)
        {
            file1 = new StringBuilder();
        }
        i = 0;
        file = sizelimitzipresult;
        k = 0;
_L7:
        FileInputStream fileinputstream;
        File file2;
        int j;
        if (k >= afile.length)
        {
            if (flag1)
            {
                if (i == 0 && flag)
                {
                    zipoutputstream.putNextEntry(new ZipEntry("common.txt"));
                    zipoutputstream.write(file1.toString().getBytes());
                    zipoutputstream.closeEntry();
                }
                zipoutputstream.setComment(file1.toString());
            }
            zipoutputstream.close();
            fileoutputstream.close();
            return file;
        }
        file2 = afile[k];
        fileinputstream = new FileInputStream(file2);
        j = i;
        if (!flag1) goto _L4; else goto _L3
_L3:
        j = fileinputstream.available();
        file1.append("[").append(k).append("/").append(afile.length).append("]");
        file1.append(file2.getName());
        file1.append("(").append(j).append(")");
        if ((long)j <= l) goto _L6; else goto _L5
_L5:
        file1.append("[TOO BIG !!!]\n");
        file = SizeLimitZipResult.SizeLimitZipResult_TooBig;
_L12:
        k++;
          goto _L7
_L6:
        if ((long)(i + j) >= l1) goto _L9; else goto _L8
_L8:
        j = i + j;
        file1.append('\n');
_L4:
        byte abyte0[];
        zipoutputstream.putNextEntry(new ZipEntry(file2.getName()));
        abyte0 = new byte[1024];
_L13:
        i = fileinputstream.read(abyte0, 0, 1024);
        if (i != -1) goto _L11; else goto _L10
_L10:
        zipoutputstream.closeEntry();
        fileinputstream.close();
        i = j;
          goto _L12
_L9:
        file1.append("[Tatol BIG !!!]\n");
        file = SizeLimitZipResult.SizeLimitZipResult_TooBig;
          goto _L12
_L11:
        zipoutputstream.write(abyte0, 0, i);
          goto _L13
_L2:
        return SizeLimitZipResult.SizeLimitZipResult_NotFound;
        return SizeLimitZipResult.SizeLimitZipResult_NotFound;
          goto _L12
    }

    private static void a(File file, GZIPOutputStream gzipoutputstream)
        throws FileNotFoundException, IOException
    {
        byte abyte0[] = new byte[32768];
        file = new BufferedInputStream(new FileInputStream(file), 32768);
        do
        {
            int i = file.read(abyte0);
            if (i == -1)
            {
                file.close();
                gzipoutputstream.flush();
                return;
            }
            gzipoutputstream.write(abyte0, 0, i);
        } while (true);
    }

    private static void a(ZipOutputStream zipoutputstream, File file, String s)
    {
        if (!file.isDirectory()) goto _L2; else goto _L1
_L1:
        file = file.listFiles();
        if (file == null) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        j = file.length;
        i = 0;
_L6:
        if (i < j) goto _L5; else goto _L4
_L4:
        return;
_L5:
        File file1 = file[i];
        a(zipoutputstream, file1, (new StringBuilder(String.valueOf(s))).append("/").append(file1.getName()).toString());
        i++;
          goto _L6
_L2:
        if (!file.canRead()) goto _L4; else goto _L7
_L7:
        Object obj = null;
        file = new FileInputStream(file);
        zipoutputstream.putNextEntry(new ZipEntry(s));
        FileUtil.copyStream(file, zipoutputstream);
        zipoutputstream.closeEntry();
        if (file != null)
        {
            try
            {
                file.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ZipOutputStream zipoutputstream)
            {
                return;
            }
        }
          goto _L4
        zipoutputstream;
        file = null;
_L11:
        if (file == null) goto _L4; else goto _L8
_L8:
        try
        {
            file.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ZipOutputStream zipoutputstream)
        {
            return;
        }
        zipoutputstream;
        file = obj;
_L10:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw zipoutputstream;
        zipoutputstream;
        if (true) goto _L10; else goto _L9
_L9:
        zipoutputstream;
          goto _L11
    }

    public static boolean createZipFile(File file, File file1, String s)
    {
        Object obj = null;
        file = new ZipOutputStream(new FileOutputStream(file));
        a(file, file1, s);
        file.finish();
        file.flush();
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        return true;
        file;
        file = null;
_L4:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        return false;
        file;
        file1 = obj;
_L2:
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file1) { }
        }
        throw file;
        s;
        file1 = file;
        file = s;
        if (true) goto _L2; else goto _L1
_L1:
        file1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean extract(String s, File file)
    {
        a a1 = new a();
        a1.b = file;
        traverseZipFile(s, a1);
        return a1.a;
    }

    public static boolean extract(String s, String s1, File file)
    {
        b b1 = new b();
        b1.b = s1;
        b1.c = file;
        traverseZipFile(s, b1);
        return b1.a;
    }

    public static void traverseZipFile(String s, ZipTraversalCallback ziptraversalcallback)
    {
        Enumeration enumeration = null;
        s = new ZipFile(s);
        enumeration = s.entries();
_L3:
        boolean flag = enumeration.hasMoreElements();
        if (flag) goto _L2; else goto _L1
_L1:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        s.close();
_L5:
        return;
_L2:
        flag = ziptraversalcallback.onProgress(s, (ZipEntry)enumeration.nextElement());
        if (!flag) goto _L3; else goto _L1
        s;
        s = enumeration;
_L8:
        if (s == null) goto _L5; else goto _L4
_L4:
        try
        {
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        ziptraversalcallback;
        s = null;
_L7:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw ziptraversalcallback;
        s;
        return;
        ziptraversalcallback;
        if (true) goto _L7; else goto _L6
_L6:
        ziptraversalcallback;
          goto _L8
    }

    public static void unGzipFile(File file, File file1)
        throws IOException
    {
        unGzipFile(((InputStream) (new FileInputStream(file))), file1);
    }

    public static void unGzipFile(InputStream inputstream, File file)
        throws IOException
    {
        Object obj = null;
        inputstream = new GZIPInputStream(inputstream);
        file = new FileOutputStream(file);
        obj = new byte[1024];
_L1:
        int i = inputstream.read(((byte []) (obj)));
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        file.flush();
        Exception exception;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        file.close();
        return;
        file.write(((byte []) (obj)), 0, i);
          goto _L1
        exception;
        obj = inputstream;
        inputstream = exception;
_L3:
        if (obj != null)
        {
            try
            {
                ((GZIPInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw inputstream;
        inputstream;
        return;
        inputstream;
        file = null;
        continue; /* Loop/switch isn't completed */
        Exception exception1;
        exception1;
        file = null;
        obj = inputstream;
        inputstream = exception1;
        if (true) goto _L3; else goto _L2
_L2:
    }
}
