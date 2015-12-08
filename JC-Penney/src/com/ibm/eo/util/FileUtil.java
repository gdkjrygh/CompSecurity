// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.util;

import android.app.Application;
import android.content.Context;
import com.ibm.eo.EOCore;
import com.ibm.eo.model.TLFCacheFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.ibm.eo.util:
//            LogInternal

public final class FileUtil
{

    private static volatile FileUtil _myInstance;

    private FileUtil()
    {
    }

    public static Boolean deleteFile(String s, String s1)
    {
        Object obj = Boolean.valueOf(false);
        s1 = new File(EOCore.getApplication().getApplicationContext().getDir(s, 0), s1);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!s1.exists()) goto _L2; else goto _L3
_L3:
        s1.delete();
        s = Boolean.valueOf(true);
_L7:
        StringBuilder stringbuilder;
        stringbuilder = (new StringBuilder()).append("Has been deleted:").append(s);
        if (!s.booleanValue())
        {
            break MISSING_BLOCK_LABEL_106;
        }
        obj = (new StringBuilder()).append(" File from cache:").append(s1.getAbsolutePath()).toString();
_L4:
        LogInternal.log(stringbuilder.append(((String) (obj))).toString());
        return s;
        obj = "";
          goto _L4
        s;
        s1 = null;
_L5:
        StringBuilder stringbuilder1 = (new StringBuilder()).append("Trying to delete file from cache:");
        if (s1 == null)
        {
            s1 = "";
        } else
        {
            s1 = s1.getAbsolutePath();
        }
        LogInternal.logException(s, stringbuilder1.append(s1).toString());
        return ((Boolean) (obj));
        s;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        obj = s;
        s = exception;
        if (true) goto _L5; else goto _L2
_L2:
        s = ((String) (obj));
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static FileUtil getInstance()
    {
        com/ibm/eo/util/FileUtil;
        JVM INSTR monitorenter ;
        FileUtil fileutil;
        if (_myInstance == null)
        {
            _myInstance = new FileUtil();
        }
        fileutil = _myInstance;
        com/ibm/eo/util/FileUtil;
        JVM INSTR monitorexit ;
        return fileutil;
        Exception exception;
        exception;
        throw exception;
    }

    public static Object getObject(File file)
    {
        ObjectInputStream objectinputstream;
        Object obj4;
        objectinputstream = null;
        obj4 = null;
        if (file != null) goto _L2; else goto _L1
_L1:
        Object obj = obj4;
_L4:
        return obj;
_L2:
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_206;
        }
        obj = new FileInputStream(file);
        objectinputstream = new ObjectInputStream(((java.io.InputStream) (obj)));
        Object obj1;
        ObjectInputStream objectinputstream1;
        objectinputstream1 = objectinputstream;
        obj1 = obj;
        Object obj3 = objectinputstream.readObject();
        file = ((File) (obj3));
_L9:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                LogInternal.logException(((Throwable) (obj)));
                return file;
            }
        }
        obj = file;
        if (objectinputstream == null) goto _L4; else goto _L3
_L3:
        objectinputstream.close();
        return file;
        Exception exception;
        exception;
        objectinputstream = null;
        obj = null;
_L8:
        objectinputstream1 = objectinputstream;
        obj1 = obj;
        LogInternal.logException(exception, (new StringBuilder()).append("Trying to get object from file:").append(file.getAbsolutePath()).toString());
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                LogInternal.logException(file);
                return null;
            }
        }
        obj = obj4;
        if (objectinputstream == null) goto _L4; else goto _L5
_L5:
        objectinputstream.close();
        return null;
        file;
        objectinputstream1 = null;
        obj = null;
_L7:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        ((FileInputStream) (obj)).close();
        if (objectinputstream1 != null)
        {
            try
            {
                objectinputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                LogInternal.logException(((Throwable) (obj)));
            }
        }
        throw file;
        file;
        objectinputstream1 = null;
        continue; /* Loop/switch isn't completed */
        file;
        obj = obj1;
        if (true) goto _L7; else goto _L6
_L6:
        exception;
        objectinputstream = null;
          goto _L8
        exception;
          goto _L8
        Object obj2 = null;
        obj = null;
        file = objectinputstream;
        objectinputstream = obj2;
          goto _L9
    }

    public static List getObjects(String s)
    {
        ArrayList arraylist = new ArrayList();
        s = EOCore.getApplication().getApplicationContext().getDir(s, 0).listFiles();
        Arrays.sort(s, new _cls1());
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            File file = s[i];
            int k = file.getName().lastIndexOf(".");
            if ("png".equals(file.getName().substring(k + 1, file.getName().length())))
            {
                continue;
            }
            Object obj = getObject(file);
            if (obj instanceof TLFCacheFile)
            {
                arraylist.add((TLFCacheFile)obj);
            }
            file.delete();
        }

        return arraylist;
    }

    public static Boolean saveObject(Object obj, String s, String s1)
    {
        Object obj1;
        Object obj3;
        obj3 = null;
        obj1 = Boolean.valueOf(true);
        File file = new File(EOCore.getApplication().getApplicationContext().getDir(s, 0), s1);
        Object obj2 = new FileOutputStream(file);
        obj3 = new ObjectOutputStream(((java.io.OutputStream) (obj2)));
        Object obj4;
        ((ObjectOutputStream) (obj3)).writeObject(obj);
        obj4 = (new StringBuilder()).append("Has been saved:").append(obj1);
        if (!((Boolean) (obj1)).booleanValue()) goto _L2; else goto _L1
_L1:
        obj = (new StringBuilder()).append(" File to cache:").append(file.getAbsolutePath()).toString();
_L3:
        LogInternal.log(((StringBuilder) (obj4)).append(((String) (obj))).toString());
        if (obj3 != null)
        {
            try
            {
                ((ObjectOutputStream) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                LogInternal.logException(((Throwable) (obj)));
                return ((Boolean) (obj1));
            }
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        ((FileOutputStream) (obj2)).close();
        obj = obj1;
        if (((Boolean) (obj1)).booleanValue())
        {
            break MISSING_BLOCK_LABEL_155;
        }
        file.delete();
        obj = obj1;
_L7:
        return ((Boolean) (obj));
_L2:
        obj = "";
          goto _L3
        obj2;
        obj = null;
        file = null;
_L13:
        obj4 = Boolean.valueOf(false);
        obj1 = obj4;
        StringBuilder stringbuilder = (new StringBuilder()).append("Trying to save file to cache:");
        if (file != null) goto _L5; else goto _L4
_L4:
        String s2 = "";
_L8:
        obj1 = obj4;
        LogInternal.logException(((Throwable) (obj2)), stringbuilder.append(s2).toString());
        obj1 = obj4;
        deleteFile(s, s1);
        if (obj != null)
        {
            try
            {
                ((ObjectOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                LogInternal.logException(((Throwable) (obj)));
                return ((Boolean) (obj4));
            }
        }
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        ((FileOutputStream) (obj3)).close();
        obj = obj4;
        if (((Boolean) (obj4)).booleanValue()) goto _L7; else goto _L6
_L6:
        file.delete();
        return ((Boolean) (obj4));
_L5:
        obj1 = obj4;
        s2 = file.getAbsolutePath();
          goto _L8
        s;
        obj = null;
        obj2 = null;
        file = null;
        s1 = ((String) (obj1));
        obj1 = obj2;
_L12:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_318;
        }
        ((ObjectOutputStream) (obj)).close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        ((FileOutputStream) (obj1)).close();
        if (!s1.booleanValue())
        {
            file.delete();
        }
_L10:
        throw s;
        obj;
        LogInternal.logException(((Throwable) (obj)));
        if (true) goto _L10; else goto _L9
_L9:
        s;
        obj = null;
        obj2 = null;
        s1 = ((String) (obj1));
        obj1 = obj2;
        continue; /* Loop/switch isn't completed */
        s;
        obj = null;
        s1 = ((String) (obj1));
        obj1 = obj2;
        continue; /* Loop/switch isn't completed */
        s;
        s1 = ((String) (obj1));
        obj = obj3;
        obj1 = obj2;
        continue; /* Loop/switch isn't completed */
        s;
        s1 = ((String) (obj1));
        obj1 = obj3;
        if (true) goto _L12; else goto _L11
_L11:
        obj2;
        obj = null;
          goto _L13
        Exception exception;
        exception;
        obj = null;
        obj3 = obj2;
        obj2 = exception;
          goto _L13
        obj;
        Object obj5 = obj2;
        obj2 = obj;
        obj = obj3;
        obj3 = obj5;
          goto _L13
    }

    private class _cls1
        implements Comparator
    {

        public int compare(Object obj, Object obj1)
        {
            return Long.valueOf(((File)obj).lastModified()).compareTo(Long.valueOf(((File)obj1).lastModified()));
        }

        _cls1()
        {
        }
    }

}
