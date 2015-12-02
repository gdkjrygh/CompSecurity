// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.content.Context;
import android.os.FileUtils;
import android.text.TextUtils;
import java.io.File;

// Referenced classes of package com.qihoo360.common.utils:
//            ZipUtil, ProcessLock

public class NativeLoader
{

    public NativeLoader()
    {
    }

    private static void a(String s, String s1)
    {
        s = (new File(s)).listFiles();
        int j = s.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            File file = s[i];
            if (file.isFile() && file.exists() && file.getName().startsWith(s1))
            {
                if (file.delete());
            }
            i++;
        } while (true);
    }

    private static boolean a(String s)
    {
        try
        {
            System.loadLibrary(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    private static boolean b(String s)
    {
        try
        {
            Runtime.getRuntime().load(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    private static String c(String s)
    {
        int ai[];
        String s1;
        int i;
        try
        {
            ai = new int[1];
            i = FileUtils.getPermissions(s, ai);
        }
        catch (Throwable throwable)
        {
            return (new StringBuilder("getFilePermissions: ")).append(s).append("error: ").append(throwable).toString();
        }
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        return String.format("file:%s permissions:%o", new Object[] {
            s, Integer.valueOf(ai[0])
        });
        s1 = String.format("getFilePermissions: %s err:%d", new Object[] {
            s, Integer.valueOf(i)
        });
        return s1;
    }

    public static String getFileAndDirPermissions(String s)
    {
        String s1 = c(s);
        Object obj = (new File(s)).getParentFile();
        s = s1;
        if (obj != null)
        {
            obj = ((File) (obj)).getAbsolutePath();
            s = s1;
            if (obj != null)
            {
                s = c(((String) (obj)));
                s = (new StringBuilder(String.valueOf(s1))).append(" ").append(s).toString();
            }
        }
        return s;
    }

    public static String getLibraryPath(Context context, String s)
    {
        context = context.getFilesDir();
        if (context != null)
        {
            context = context.getParentFile();
            if (context != null)
            {
                context = new File((new StringBuilder(String.valueOf(context.getAbsolutePath()))).append("/lib/lib").append(s).append(".so").toString());
                if (context.exists())
                {
                    return context.getAbsolutePath();
                }
            }
        }
        return null;
    }

    public static boolean load(Context context, String s)
    {
        String s1 = getLibraryPath(context, s);
        if (TextUtils.isEmpty(s1))
        {
            if (a(s))
            {
                return true;
            }
            s1 = (new StringBuilder("lib")).append(s).append(".so").toString();
            File file = context.getFileStreamPath(s1);
            s = file.getAbsolutePath();
            if (file.isFile())
            {
                return b(s);
            }
            if (ZipUtil.extract(context.getPackageCodePath(), (new StringBuilder("lib/armeabi/")).append(s1).toString(), file))
            {
                try
                {
                    FileUtils.setPermissions(s, 493, -1, -1);
                }
                // Misplaced declaration of an exception variable
                catch (Context context) { }
                return b(s);
            } else
            {
                return false;
            }
        } else
        {
            return b(s1);
        }
    }

    public static boolean load(Context context, String s, String s1)
    {
        String s2 = getLibraryPath(context, s);
        if ((TextUtils.isEmpty(s2) || !b(s2)) && !a(s))
        {
            s = (new StringBuilder("lib")).append(s).append(".so").toString();
            String s3 = (new StringBuilder(String.valueOf(context.getFilesDir().getAbsolutePath()))).append("/").append("lib").toString();
            Object obj = new File(s3);
            if (!((File) (obj)).exists())
            {
                if (!((File) (obj)).mkdir())
                {
                    return false;
                }
                if (FileUtils.setPermissions(s3, 493, -1, -1) == 0);
            }
            obj = (new StringBuilder(String.valueOf(s3))).append("/").append(s).toString();
            File file = new File(((String) (obj)));
            if (!file.isFile() || !b(((String) (obj))))
            {
                a(s3, (new StringBuilder("lib")).append(s1).toString());
                if (ZipUtil.extract(context.getPackageCodePath(), (new StringBuilder("lib/armeabi/")).append(s).toString(), file))
                {
                    try
                    {
                        FileUtils.setPermissions(((String) (obj)), 493, -1, -1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context) { }
                    return b(((String) (obj)));
                } else
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean load(Context context, String s, String s1, StringBuffer stringbuffer)
    {
        Object obj;
        boolean flag;
        flag = true;
        if (stringbuffer != null)
        {
            stringbuffer.delete(0, stringbuffer.length());
        }
        obj = getLibraryPath(context, s);
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && b(((String) (obj)))) goto _L2; else goto _L1
_L1:
        if (!a(s)) goto _L4; else goto _L3
_L3:
        if (stringbuffer != null)
        {
            stringbuffer.append(((String) (obj)));
        }
        context = null;
_L6:
        if (context != null)
        {
            context.freeLock();
        }
        return flag;
_L4:
        obj = new ProcessLock(context, s1, true);
        if (!((ProcessLock) (obj)).tryLock(0, 0, true))
        {
            flag = false;
            context = ((Context) (obj));
            continue; /* Loop/switch isn't completed */
        }
        s = (new StringBuilder("lib")).append(s).append(".so").toString();
        String s2 = (new StringBuilder(String.valueOf(context.getFilesDir().getAbsolutePath()))).append("/").append("lib").toString();
        Object obj1 = new File(s2);
        if (!((File) (obj1)).exists())
        {
            if (!((File) (obj1)).mkdir())
            {
                flag = false;
                context = ((Context) (obj));
                continue; /* Loop/switch isn't completed */
            }
            if (FileUtils.setPermissions(s2, 493, -1, -1) == 0);
        }
        obj1 = (new StringBuilder(String.valueOf(s2))).append("/").append(s).toString();
        File file = new File(((String) (obj1)));
        if (file.isFile() && b(((String) (obj1))))
        {
            if (stringbuffer != null)
            {
                stringbuffer.append(((String) (obj1)));
            }
            context = ((Context) (obj));
        } else
        {
            a(s2, (new StringBuilder("lib")).append(s1).toString());
            if (ZipUtil.extract(context.getPackageCodePath(), (new StringBuilder("lib/armeabi/")).append(s).toString(), file))
            {
                try
                {
                    FileUtils.setPermissions(((String) (obj1)), 493, -1, -1);
                }
                // Misplaced declaration of an exception variable
                catch (Context context) { }
                flag = b(((String) (obj1)));
                if (stringbuffer != null)
                {
                    stringbuffer.append(((String) (obj1)));
                    context = ((Context) (obj));
                } else
                {
                    context = ((Context) (obj));
                }
            } else
            {
                flag = false;
                context = ((Context) (obj));
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (stringbuffer != null)
        {
            stringbuffer.append(((String) (obj)));
        }
        context = null;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
