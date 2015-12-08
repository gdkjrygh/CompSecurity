// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.offline;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipUtils
{

    public ZipUtils()
    {
    }

    public static String decompress(byte abyte0[])
        throws IOException
    {
        abyte0 = new ByteArrayInputStream(abyte0, 4, abyte0.length - 4);
        GZIPInputStream gzipinputstream = new GZIPInputStream(abyte0, 32);
        StringBuilder stringbuilder = new StringBuilder();
        byte abyte1[] = new byte[32];
        do
        {
            int i = gzipinputstream.read(abyte1);
            if (i == -1)
            {
                gzipinputstream.close();
                abyte0.close();
                return stringbuilder.toString();
            }
            stringbuilder.append(new String(abyte1, 0, i));
        } while (true);
    }

    public static void deleteDirectory(File file)
    {
_L5:
        int i;
        if (i >= as.length)
        {
            file.delete();
            return;
        }
        file1 = new File(file, as[i]);
        if (!file1.isDirectory()) goto _L2; else goto _L1
_L1:
        deleteDirectory(file1);
        file1.delete();
          goto _L3
_L2:
        file1.delete();
          goto _L3
        String as[];
        File file1;
        if (file.isDirectory())
        {
            try
            {
                as = file.list();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                Logging.log(file.getMessage());
                return;
            }
            if (as == null)
            {
                return;
            }
        } else
        {
            return;
        }
        i = 0;
        continue; /* Loop/switch isn't completed */
_L3:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static ArrayList unzipAndDelete(String s, String s1)
        throws IOException
    {
        Object obj2;
        ArrayList arraylist;
        arraylist = new ArrayList();
        obj2 = "";
        ZipInputStream zipinputstream;
        File file = new File(s1);
        if (!file.isDirectory())
        {
            file.mkdirs();
        }
        zipinputstream = new ZipInputStream(new FileInputStream(s));
_L4:
        byte abyte0[] = ((byte []) (obj2));
        Object obj1 = zipinputstream.getNextEntry();
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        if (((String) (obj2)).length() > 0)
        {
            s1 = (new StringBuilder("mv ")).append(((String) (obj2))).append(".tmp").append(" ").append(((String) (obj2))).toString();
            Runtime.getRuntime().exec(s1);
        }
        s1 = arraylist;
        try
        {
            if (!(new File(s)).delete())
            {
                throw new Exception("Error in deleting Zip file ");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logging.log(Log.getStackTraceString(s));
            s1 = null;
        }
        return s1;
        abyte0 = ((byte []) (obj2));
        Object obj = (new StringBuilder(String.valueOf(s1))).append("/").append(((ZipEntry) (obj1)).getName()).toString();
        abyte0 = ((byte []) (obj2));
        arraylist.add(obj);
        abyte0 = ((byte []) (obj2));
        if (!((ZipEntry) (obj1)).isDirectory()) goto _L2; else goto _L1
_L1:
        abyte0 = ((byte []) (obj2));
        obj = new File(((String) (obj)));
        abyte0 = ((byte []) (obj2));
        if (((File) (obj)).isDirectory()) goto _L4; else goto _L3
_L3:
        abyte0 = ((byte []) (obj2));
        ((File) (obj)).mkdirs();
          goto _L4
        s1;
_L7:
        if (abyte0.length() > 0)
        {
            abyte0 = (new StringBuilder("mv ")).append(abyte0).append(".tmp").append(" ").append(abyte0).toString();
            Runtime.getRuntime().exec(abyte0);
        }
        if (!(new File(s)).delete())
        {
            throw new Exception("Error in deleting Zip file ");
        }
          goto _L5
_L2:
        abyte0 = ((byte []) (obj2));
        String s2 = ((ZipEntry) (obj1)).getName().substring(((ZipEntry) (obj1)).getName().lastIndexOf(".") + 1, ((ZipEntry) (obj1)).getName().length());
        Object obj3;
        abyte0 = ((byte []) (obj2));
        obj1 = obj2;
        obj3 = obj;
        if (s2.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_409;
        }
        abyte0 = ((byte []) (obj2));
        boolean flag = s2.equalsIgnoreCase("xml");
        obj1 = obj2;
        obj3 = obj;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_409;
        }
        obj3 = (new StringBuilder(String.valueOf(obj))).append(".tmp").toString();
        obj1 = obj;
        abyte0 = ((byte []) (obj1));
        obj = new FileOutputStream(((String) (obj3)), false);
        abyte0 = ((byte []) (obj1));
        obj.toString().length();
        abyte0 = new byte[8192];
_L6:
        int i = zipinputstream.read(abyte0);
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_473;
        }
        zipinputstream.closeEntry();
        abyte0 = ((byte []) (obj1));
        ((FileOutputStream) (obj)).close();
        obj2 = obj1;
          goto _L4
        ((FileOutputStream) (obj)).write(abyte0, 0, i);
          goto _L6
        s1;
        abyte0 = ((byte []) (obj1));
        ((FileOutputStream) (obj)).close();
        abyte0 = ((byte []) (obj1));
        throw s1;
_L5:
        throw s1;
        s1;
        abyte0 = ((byte []) (obj));
          goto _L7
    }

    public static ArrayList unzipAndDeleteUsingTempExt1(String s, String s1)
        throws IOException
    {
        Object obj;
        String s6;
        ArrayList arraylist = new ArrayList();
        Object obj1;
        Exception exception;
        boolean flag;
        try
        {
            obj = new File(s1);
            if (!((File) (obj)).isDirectory())
            {
                ((File) (obj)).mkdirs();
            }
            obj = new ZipInputStream(new FileInputStream(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logging.log(Log.getStackTraceString(s));
            return null;
        }
_L8:
        obj1 = ((ZipInputStream) (obj)).getNextEntry();
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        ((ZipInputStream) (obj)).close();
        if (!(new File(s)).delete()) goto _L4; else goto _L3
_L3:
        Logging.log("tmp zip deleted");
        s = arraylist.iterator();
_L11:
        flag = s.hasNext();
        if (!flag)
        {
            return arraylist;
        }
        break MISSING_BLOCK_LABEL_412;
_L2:
        s6 = (new StringBuilder(String.valueOf(s1))).append("/").append(((ZipEntry) (obj1)).getName()).toString();
        arraylist.add(s6);
        if (((ZipEntry) (obj1)).isDirectory())
        {
            obj1 = new File(s6);
            if (!((File) (obj1)).isDirectory())
            {
                ((File) (obj1)).mkdirs();
            }
            break MISSING_BLOCK_LABEL_45;
        }
          goto _L5
        exception;
        ((ZipInputStream) (obj)).close();
        if (!(new File(s)).delete()) goto _L7; else goto _L6
_L6:
        Logging.log("tmp zip deleted");
        s = arraylist.iterator();
_L10:
        if (!s.hasNext())
        {
            throw exception;
        }
        break MISSING_BLOCK_LABEL_319;
_L5:
        FileOutputStream fileoutputstream = new FileOutputStream((new StringBuilder(String.valueOf(s6))).append(".tmp").toString(), false);
        byte abyte0[] = new byte[4096];
_L9:
        int i = ((ZipInputStream) (obj)).read(abyte0);
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        ((ZipInputStream) (obj)).closeEntry();
        fileoutputstream.close();
          goto _L8
        fileoutputstream.write(abyte0, 0, i);
          goto _L9
        Exception exception1;
        exception1;
        fileoutputstream.close();
        throw exception1;
_L7:
        throw new Exception("Error in deleting Zip file ");
        String s2 = (String)s.next();
        String as[] = s2.split("/");
        String s3 = (new StringBuilder(String.valueOf(s1))).append(as[as.length - 1]).append(".tmp").toString();
        s2 = (new StringBuilder("mv -f ")).append(s3).append(" ").append(s2).toString();
        Runtime.getRuntime().exec(s2);
          goto _L10
_L4:
        throw new Exception("Error in deleting Zip file ");
        String s4 = (String)s.next();
        String as1[] = s4.split("/");
        String s5 = (new StringBuilder(String.valueOf(s1))).append(as1[as1.length - 1]).append(".tmp").toString();
        s4 = (new StringBuilder("mv -f ")).append(s5).append(" ").append(s4).toString();
        Runtime.getRuntime().exec(s4);
          goto _L11
    }
}
