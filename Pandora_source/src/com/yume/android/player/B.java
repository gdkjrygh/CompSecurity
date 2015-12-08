// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

final class B extends Thread
{

    private static B b;
    private static boolean n = false;
    private String a;
    private String c;
    private FileOutputStream d;
    private File e;
    private Date f;
    private DateFormat g;
    private boolean h;
    private boolean i;
    private BlockingQueue j;
    private volatile boolean k;
    private volatile boolean l;
    private Context m;

    private B()
    {
        a = "YuMeAndroidPlayer";
        c = "yumesdk_log.txt";
        f = null;
        new SimpleDateFormat("MM/dd/yyyy hh:mm:ss:S a ");
        g = new SimpleDateFormat("hh:mm:ss:S a");
        h = true;
        i = true;
        j = new LinkedBlockingQueue();
        k = false;
        l = false;
        m = null;
        start();
    }

    public static B a()
    {
        com/yume/android/player/B;
        JVM INSTR monitorenter ;
        B b1;
        if (b == null)
        {
            b = new B();
            n = false;
        }
        b1 = b;
        com/yume/android/player/B;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        throw exception;
    }

    private String c()
    {
        String s = "";
        try
        {
            if (f != null)
            {
                f = null;
            }
            f = new Date();
            if (g != null)
            {
                s = g.format(f);
            }
        }
        catch (Exception exception)
        {
            Log.e(a, "Exception while getting current time.");
            exception.printStackTrace();
            return "";
        }
        return s;
    }

    private void d(String s)
    {
        if (!l) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (j == null) goto _L1; else goto _L3
_L3:
        j.put(s);
        return;
        s;
        Thread.currentThread().interrupt();
        return;
    }

    public final void a(Context context)
    {
        Object obj;
        boolean flag2;
        obj = null;
        for (flag2 = true; e != null || context == null;)
        {
            return;
        }

        m = context;
        try
        {
            if (m.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1)
            {
                h = false;
                b.b("Permission DENIED for writing to External Storage. Hence, not creating YuMe SDK log file.");
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            h = false;
            Log.e(a, "NullPointerException while creating SDK log file.");
            context.printStackTrace();
            return;
        }
        context = Environment.getExternalStorageState();
        if (!"mounted".equals(context)) goto _L2; else goto _L1
_L1:
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = true;
          goto _L3
_L8:
        if (flag) goto _L5; else goto _L4
_L4:
        h = false;
        b.b("External Storage not accessible. Hence, not creating YuMe SDK log file.");
        return;
_L2:
        File file;
        boolean flag3;
        if ("mounted_ro".equals(context))
        {
            flag = false;
            flag1 = true;
        } else
        {
            flag = false;
            flag1 = false;
        }
          goto _L3
_L5:
        file = m.getExternalFilesDir(null);
        context = ((Context) (obj));
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        context = file.getAbsolutePath();
        obj = context;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        file = Environment.getExternalStorageDirectory();
        obj = context;
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        obj = file.getAbsolutePath();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        h = false;
        b.b("Error getting External Storage directory. Hence, not creating YuMe SDK log file.");
        return;
        context = (new StringBuilder(String.valueOf(obj))).append("/yume_android_sdk").toString();
        Log.i(a, (new StringBuilder("SDK Log File Path: ")).append(context).toString());
        context = new File(context);
        context.mkdir();
        e = new File(context, c);
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        flag3 = e.exists();
        if (flag3)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        if (e.createNewFile())
        {
            Log.i(a, "SDK Log File Created successfully.");
        }
_L6:
        n = false;
        return;
        context;
        Log.e(a, "SDK Log File cannot be Created.");
        context.printStackTrace();
          goto _L6
        context;
        Log.e(a, "SDK Log File Creation failed (Security Exception).");
        context.printStackTrace();
          goto _L6
        Log.i(a, "SDK Log File already exists.");
          goto _L6
        h = false;
        Log.e(a, "SDK Log File cannot be Created in External Storage.");
        return;
_L3:
        if (flag1 && flag)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(Exception exception, String s)
    {
        String s1 = s;
        if (exception != null)
        {
            s1 = s;
            if (exception.getMessage() != null)
            {
                s1 = exception.getMessage();
            }
        }
        c(s1);
    }

    public final void a(String s)
    {
        if (s.length() != 0 && (i || h))
        {
            String s1 = (new StringBuilder(String.valueOf(c()))).append(": (D): ").append(s).append("\n").toString();
            if (i)
            {
                Log.d(a, s);
            }
            if (h)
            {
                d(s1);
                return;
            }
        }
    }

    public final void a(boolean flag)
    {
        h = flag;
    }

    public final void b()
    {
        if (d != null)
        {
            try
            {
                d.flush();
                d.close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
            d = null;
        }
    }

    public final void b(String s)
    {
        if (s.length() != 0 && (i || h))
        {
            String s1 = (new StringBuilder(String.valueOf(c()))).append(": (I): ").append(s).append("\n").toString();
            if (i)
            {
                Log.i(a, s);
            }
            if (h)
            {
                d(s1);
                return;
            }
        }
    }

    public final void b(boolean flag)
    {
        i = flag;
    }

    public final void c(String s)
    {
        if (s.length() != 0 && (i || h))
        {
            String s1 = (new StringBuilder(String.valueOf(c()))).append(": (E): ").append(s).append("\n").toString();
            if (i)
            {
                Log.e(a, s);
            }
            if (h)
            {
                d(s1);
                return;
            }
        }
    }

    public final Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public final void run()
    {
_L2:
        String s;
        s = (String)j.take();
        if (!s.equals("SHUT_DOWN_ATTEMPTED"))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        b();
        e = null;
        g = null;
        j = null;
        b = null;
        l = true;
        return;
        boolean flag = h;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        d = new FileOutputStream(e, n);
        if (!n)
        {
            n = true;
        }
        d.write(s.getBytes());
        d.flush();
        d.close();
        d = null;
          goto _L2
        Object obj;
        obj;
        Log.e(a, (new StringBuilder("writeLogToFile: ")).append(((IOException) (obj)).getMessage()).toString());
          goto _L2
        obj;
        ((InterruptedException) (obj)).printStackTrace();
        l = true;
        return;
        a(m);
          goto _L2
        obj;
        Log.e(a, (new StringBuilder("writeLogToFile: ")).append(((Exception) (obj)).getMessage()).toString());
          goto _L2
        obj;
        ((Exception) (obj)).printStackTrace();
        l = true;
        return;
        obj;
        l = true;
        throw obj;
    }

}
