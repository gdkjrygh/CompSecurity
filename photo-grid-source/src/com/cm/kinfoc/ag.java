// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import android.content.Context;
import android.content.res.AssetManager;
import com.cm.kinfoc.a.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.cm.kinfoc:
//            h

public final class ag
{

    public static final boolean a = false;
    private static final Object b = new Object();

    public static long a(long l)
    {
        return (long)((double)((System.currentTimeMillis() - l) / 0x5265c00L) + 0.5D);
    }

    public static File a(Context context, int i)
    {
        return a(e(context, i));
    }

    private static File a(File file)
    {
        if (file != null) goto _L2; else goto _L1
_L1:
        File file1 = null;
_L4:
        return file1;
_L2:
        if (!file.isDirectory())
        {
            break; /* Loop/switch isn't completed */
        }
        file1 = file;
        if (file.exists()) goto _L4; else goto _L3
_L3:
        return null;
    }

    public static String a(String s)
    {
        Object obj;
        String s1;
        s1 = "";
        obj = s1;
        if (s == null) goto _L2; else goto _L1
_L1:
        obj = s1;
        if (s.length() == 0) goto _L2; else goto _L3
_L3:
        int i;
        int j;
        int k;
        try
        {
            obj = MessageDigest.getInstance("MD5");
            ((MessageDigest) (obj)).update(s.getBytes());
            s = ((MessageDigest) (obj)).digest();
            obj = new StringBuilder();
            k = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "";
        }
        i = 0;
          goto _L4
_L8:
        if (j >= 16)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        ((StringBuilder) (obj)).append("0");
        ((StringBuilder) (obj)).append(Integer.toHexString(j));
        i++;
          goto _L4
_L6:
        obj = ((StringBuilder) (obj)).toString();
_L2:
        return ((String) (obj));
_L4:
        if (i >= k) goto _L6; else goto _L5
_L5:
        byte byte0 = s[i];
        j = byte0;
        if (byte0 < 0)
        {
            j = byte0 + 256;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static boolean a()
    {
        try
        {
            System.loadLibrary("kcmutil");
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            return false;
        }
        return true;
    }

    public static boolean a(Context context)
    {
        boolean flag1;
        flag1 = false;
        if (context == null)
        {
            return false;
        }
        com.cm.kinfoc.a.e.a();
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = com.cm.kinfoc.a.e.a().c();
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        boolean flag2;
        boolean flag3;
        ((File) (obj1)).getAbsolutePath();
        obj1 = ((File) (obj1)).getAbsolutePath();
        flag2 = a(context, "kfmt.dat", (new StringBuilder()).append(((String) (obj1))).append(File.separatorChar).append("kfmt.dat").toString());
        flag3 = a(context, "kctrl.dat", (new StringBuilder()).append(((String) (obj1))).append(File.separatorChar).append("kctrl.dat").toString());
        boolean flag;
        flag = flag1;
        if (flag2)
        {
            flag = flag1;
            if (flag3)
            {
                flag = true;
            }
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
    }

    private static boolean a(Context context, String s, String s1)
    {
        byte abyte0[];
        Object obj;
        Object obj1;
        boolean flag;
        flag = true;
        obj = null;
        obj1 = null;
        abyte0 = null;
        if (context != null) goto _L2; else goto _L1
_L1:
        flag = false;
_L8:
        return flag;
_L2:
        AssetManager assetmanager;
        File file;
        assetmanager = context.getAssets();
        file = new File(s1);
        if (!file.exists()) goto _L4; else goto _L3
_L3:
        if (!file.isFile()) goto _L6; else goto _L5
_L5:
        String s2 = com.cm.kinfoc.a.e.a().a(file);
        boolean flag1;
        try
        {
            context = assetmanager.open(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        flag1 = s2.equals(com.cm.kinfoc.a.e.a().a(context));
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        if (context == null) goto _L8; else goto _L7
_L7:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return true;
        }
        return true;
        file.delete();
_L12:
label0:
        {
            int i;
            try
            {
                s = assetmanager.open(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s = null;
                s1 = abyte0;
                break label0;
            }
            try
            {
                s1 = new FileOutputStream(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1 = abyte0;
            }
        }
        abyte0 = new byte[4096];
_L11:
        i = s.read(abyte0);
        if (i <= 0) goto _L10; else goto _L9
_L9:
        s1.write(abyte0, 0, i);
          goto _L11
        s;
_L16:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return false;
            }
            return false;
        }
        break MISSING_BLOCK_LABEL_282;
_L6:
        h.a(s1);
_L4:
        context = null;
          goto _L12
_L10:
        s.close();
        s1.flush();
        s1.close();
        if (context == null) goto _L8; else goto _L13
_L13:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return true;
        }
        return true;
        context;
        s = obj1;
_L15:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        throw context;
        s1;
        s = context;
        context = s1;
        continue; /* Loop/switch isn't completed */
        s1;
        s = context;
        context = s1;
        if (true) goto _L15; else goto _L14
_L14:
        context;
        context = obj;
          goto _L16
        s;
          goto _L16
        return false;
          goto _L12
    }

    public static int b(Context context)
    {
        context = b(context, 1);
        if (context != null)
        {
            context = context.getAbsolutePath();
            if (context != null && context.length() > 0)
            {
                if ((context = new File(context)).exists() && context.isDirectory() && (context = context.list()) != null)
                {
                    return context.length;
                }
            }
        }
        return 0;
    }

    public static File b()
    {
        return a(com.cm.kinfoc.a.e.a().c());
    }

    public static File b(Context context, int i)
    {
        return a(f(context, i));
    }

    public static File c(Context context, int i)
    {
        context = f(context, i);
        if (context != null)
        {
            if (context.exists())
            {
                if (context.isFile())
                {
                    context.delete();
                    context.mkdir();
                }
            } else
            {
                context.mkdir();
            }
            if (context.exists())
            {
                return context;
            }
        }
        return null;
    }

    public static File d(Context context, int i)
    {
        context = e(context, i);
        if (context != null)
        {
            if (context.exists())
            {
                if (context.isFile())
                {
                    context.delete();
                    context.mkdir();
                }
            } else
            {
                context.mkdir();
            }
            if (context.exists())
            {
                return context;
            }
        }
        return null;
    }

    private static File e(Context context, int i)
    {
        if (context != null)
        {
            if ((context = context.getFilesDir()) != null)
            {
                return new File(context, (new StringBuilder("infoc_")).append(Integer.toString(i)).toString());
            }
        }
        return null;
    }

    private static File f(Context context, int i)
    {
        if (context != null)
        {
            if ((context = context.getFilesDir()) != null)
            {
                return new File(context, (new StringBuilder("infoc_force_")).append(Integer.toString(i)).toString());
            }
        }
        return null;
    }

    static 
    {
        com.cm.kinfoc.a.e.a();
    }
}
