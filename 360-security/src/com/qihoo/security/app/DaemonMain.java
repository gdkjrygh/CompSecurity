// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.IPackageManager;
import android.os.ServiceManager;
import android.util.Log;
import com.qihoo.utils.notice.c;
import com.qihoo360.mobilesafe.b.a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.lang.reflect.Method;

// Referenced classes of package com.qihoo.security.app:
//            DaemonService

public class DaemonMain
{

    private static boolean a;

    public DaemonMain()
    {
    }

    public static void a(Context context)
    {
        try
        {
            File file = new File("/data/data/com.qihoo.security/files/stopped");
            if (file.exists())
            {
                file.delete();
                com.qihoo.utils.notice.c.a(context, false);
                com.qihoo360.mobilesafe.b.a.f(context);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void a(boolean flag)
    {
        if (flag)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        File file = new File("/data/data/com.qihoo.security/files/stopped");
        if (file.exists())
        {
            file.delete();
        }
        return;
        Exception exception;
        exception;
    }

    public static boolean a()
    {
        return a;
    }

    private static boolean a(String s, File file)
    {
        file = new BufferedReader(new FileReader(file));
        boolean flag = s.equals(file.readLine().split("=")[1]);
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return false;
            }
            return flag;
        } else
        {
            return flag;
        }
_L2:
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        file.close();
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        file = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static final ApplicationInfo b()
    {
        Object obj;
        int i;
        IPackageManager ipackagemanager;
        Method amethod[];
        int j;
        try
        {
            ipackagemanager = android.content.pm.IPackageManager.Stub.asInterface(ServiceManager.getService("package"));
            amethod = android/content/pm/IPackageManager.getDeclaredMethods();
            j = amethod.length;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L1
_L1:
        obj = amethod[i];
        if (!((Method) (obj)).getName().equals("getApplicationInfo")) goto _L4; else goto _L3
_L5:
        if (((Method) (obj)).getParameterTypes().length == 3)
        {
            return (ApplicationInfo)((Method) (obj)).invoke(ipackagemanager, new Object[] {
                "com.qihoo.security", Integer.valueOf(0), Integer.valueOf(0)
            });
        }
        obj = (ApplicationInfo)((Method) (obj)).invoke(ipackagemanager, new Object[] {
            "com.qihoo.security", Integer.valueOf(0)
        });
        return ((ApplicationInfo) (obj));
_L2:
        obj = null;
_L3:
        if (obj == null)
        {
            return null;
        }
        if (true) goto _L5; else goto _L4
_L4:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static void b(Context context)
    {
        (new Thread(new Runnable(context) {

            final Context a;

            public void run()
            {
                com.qihoo.security.app.DaemonMain.c(a);
            }

            
            {
                a = context;
                super();
            }
        })).start();
    }

    static void c(Context context)
    {
        d(context);
    }

    private static void d(Context context)
    {
        File file;
        boolean flag;
        file = context.getFilesDir();
        Intent intent = new Intent();
        intent.setClass(context, com/qihoo/security/app/DaemonService);
        context.startService(intent);
        flag = (new File("/data/data/com.qihoo.security/files/stopped")).exists();
        com.qihoo.utils.notice.c.a(context, flag);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        com.qihoo360.mobilesafe.b.a.f(context);
        String s;
        context = context.getApplicationInfo().sourceDir;
        s = file.getAbsolutePath();
        file = new File(file, "d");
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_105;
        }
        if (a(context, file))
        {
            a = true;
            return;
        }
        file.delete();
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        fileoutputstream.write(String.format("export CLASSPATH=%s\nexec app_process %s %s", new Object[] {
            context, s, com/qihoo/security/app/DaemonMain.getName()
        }).getBytes("UTF-8"));
        fileoutputstream.close();
        if (android.os.Build.VERSION.SDK_INT > 8)
        {
            file.setExecutable(true);
            file.setReadable(true);
        }
_L2:
        a = true;
        return;
        context;
        Log.e("DaemonMain", "", context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void main(String args[])
    {
        boolean flag;
        flag = true;
        try
        {
            args = b();
        }
        // Misplaced declaration of an exception variable
        catch (String args[])
        {
            return;
        }
        if (args == null)
        {
            return;
        }
        if ((((ApplicationInfo) (args)).flags & 0x200000) == 0)
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        args = new File("/data/data/com.qihoo.security/files/stopped");
        if (!args.exists())
        {
            args = new FileOutputStream(args);
            args.write(1);
            args.close();
            return;
        }
    }
}
