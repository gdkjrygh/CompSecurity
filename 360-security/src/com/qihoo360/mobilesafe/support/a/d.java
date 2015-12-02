// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.qihoo360.common.utils.FileUtil;
import com.qihoo360.mobilesafe.support.NativeManager;
import com.qihoo360.mobilesafe.support.a;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            c, h, b, a

public class d extends c
{

    static Process i = null;
    private static Method j;
    private static Class k;
    private static b l;
    private static String m = null;
    private static String n = null;
    private static String o = null;
    private static int p = 5;
    private static int q = 500;

    public d(Context context)
    {
        super(context);
    }

    private static int a(Context context, String s)
    {
        int i1;
        String s1 = com.qihoo360.mobilesafe.support.a.h.a(s);
        if (TextUtils.isEmpty(s1))
        {
            return -1;
        }
        b(context);
        s = a(context);
        (new File(s)).getParent();
        String s2 = com.qihoo360.mobilesafe.support.a.h.a(context, true);
        OutputStream outputstream;
        boolean flag;
        if (k())
        {
            s = String.format("%s %s %s %s %s\n", new Object[] {
                s, "--class-name=com.qihoo360.server.RootServer --fixse2 --daemon --args", context.getApplicationInfo().dataDir, s2, m
            });
        } else
        {
            s = String.format("%s %s %s %s %s\n", new Object[] {
                s, "--class-name=com.qihoo360.server.RootServer --fixse --daemon --args", context.getApplicationInfo().dataDir, s2, m
            });
        }
        i = Runtime.getRuntime().exec(s1);
        new ByteArrayOutputStream();
        outputstream = i.getOutputStream();
        s2 = System.getenv("LD_LIBRARY_PATH");
        s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = "/system/lib:/vendor/lib";
        }
        outputstream.write(String.format("export _LD_LIBRARY_PATH=%s\n", new Object[] {
            s1
        }).getBytes());
        outputstream.write(String.format("export LD_LIBRARY_PATH=%s\n", new Object[] {
            s1
        }).getBytes());
        outputstream.write(String.format("export BOOTCLASSPATH=%s\n", new Object[] {
            System.getenv("BOOTCLASSPATH")
        }).getBytes());
        outputstream.write(String.format("export PATH=%s\n", new Object[] {
            System.getenv("PATH")
        }).getBytes());
        if (!TextUtils.isEmpty(a.b))
        {
            outputstream.write((new StringBuilder("export RT_SERVICE_NAME=")).append(a.b).append("\n").toString().getBytes());
        }
        if (!TextUtils.isEmpty(a.c))
        {
            outputstream.write((new StringBuilder("export RT_PROCESS_NAME=")).append(a.c).append("\n").toString().getBytes());
        }
        outputstream.write(String.format("export CLASSPATH=:%s\n", new Object[] {
            m
        }).getBytes());
        outputstream.write(s.getBytes());
        outputstream.flush();
        i1 = 0;
          goto _L1
_L7:
        outputstream.write("exit 100\n".getBytes());
        outputstream.flush();
        boolean flag1;
        try
        {
            outputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        if (!n() || l == null) goto _L3; else goto _L2
_L2:
        s = l.c("getcontext", null, null, 0L);
        if (s == null) goto _L3; else goto _L4
_L4:
        if (s.length <= 8) goto _L3; else goto _L5
_L5:
        flag = (new String(s, "utf-8")).contains("shell");
        if (flag)
        {
            (new Thread() {

                public void run()
                {
                    try
                    {
                        d.i.waitFor();
                        d.i.destroy();
                    }
                    catch (Exception exception) { }
                    d.i = null;
                }

            }).start();
            return 1;
        }
          goto _L3
_L8:
        flag1 = com.qihoo360.mobilesafe.support.a.c(context);
        if (flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        i1++;
        try
        {
            Thread.sleep(1000L);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally
        {
            (new _cls4()).start();
            throw context;
        }
        continue; /* Loop/switch isn't completed */
        s;
        (new _cls4()).start();
_L6:
        if (com.qihoo360.mobilesafe.support.a.c(context))
        {
            i1 = 0;
        } else
        {
            i1 = -1;
        }
        return i1;
_L3:
        (new _cls4()).start();
          goto _L6
_L1:
        if (i1 < 40) goto _L8; else goto _L7
    }

    public static IBinder a(String s)
    {
        if (j != null) goto _L2; else goto _L1
_L1:
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorenter ;
        Class class1;
        if (j != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        class1 = k;
        if (class1 != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        try
        {
            k = Class.forName("android.os.ServiceManager");
            if (k != null)
            {
                j = k.getMethod("getService", new Class[] {
                    java/lang/String
                });
            }
        }
        catch (Exception exception) { }
        if (j != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorexit ;
        return null;
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorexit ;
_L2:
        try
        {
            s = (IBinder)j.invoke(null, new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
        s;
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static final String a(Context context)
    {
        File file;
        file = new File((new StringBuilder(String.valueOf(context.getFilesDir().getAbsolutePath()))).append("/lib").append("ap").toString());
        if (file.exists() && a(context, file.getAbsolutePath(), "ap"))
        {
            return file.getAbsolutePath();
        }
        try
        {
            context = context.getAssets();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (context == null)
        {
            return file.getAbsolutePath();
        }
        FileOutputStream fileoutputstream;
        byte abyte0[];
        file.delete();
        file.createNewFile();
        context = context.open("ap");
        fileoutputstream = new FileOutputStream(file);
        abyte0 = new byte[4096];
_L1:
        int i1 = context.read(abyte0);
        if (i1 <= 0)
        {
            try
            {
                fileoutputstream.flush();
                fileoutputstream.close();
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                file.delete();
                return null;
            }
            NativeManager.chmod(file.getAbsolutePath(), 493);
            return file.getAbsolutePath();
        }
        fileoutputstream.write(abyte0, 0, i1);
          goto _L1
    }

    static void a(d d1, Object obj)
    {
        d1.a(obj);
    }

    private final void a(Object obj)
    {
        String s;
        String s1;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 18 && m())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = com.qihoo360.mobilesafe.support.a.a(g, "rt_server.jar");
        s1 = com.qihoo360.mobilesafe.support.a.a(g, "rt_st");
        m = s;
        o = s1;
        Exception exception;
        try
        {
            NativeManager.chmod(m, 420);
            NativeManager.chmod(o, 493);
        }
        catch (Throwable throwable) { }
        if (flag) goto _L2; else goto _L1
_L1:
        if (!a(s, ((String) (null))))
        {
            a(s, o);
        }
_L4:
        obj;
        JVM INSTR monitorenter ;
        obj.notify();
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            if (!c(s) && e)
            {
                Log.i("RootClient", (new StringBuilder("solution 2 failed:")).append(Build.FINGERPRINT).toString());
            }
        } else
        {
            a(g, "su");
        }
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static boolean a(Context context, String s, String s1)
    {
        byte abyte0[];
        abyte0 = null;
        try
        {
            context = context.getAssets();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (context == null)
        {
            return true;
        }
        context = context.open(s1);
        int i1;
        int k1;
        try
        {
            s1 = new FileInputStream(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s1 = null;
            s = context;
            context = s1;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            s1 = null;
        }
        s = new byte[4096];
        abyte0 = new byte[4096];
_L6:
        k1 = context.read(s);
        i1 = s1.read(abyte0);
        if (k1 != i1)
        {
            int j1;
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            return false;
        }
        j1 = 0;
        do
        {
            if (j1 >= k1)
            {
                if (k1 <= 0)
                {
                    try
                    {
                        context.close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context) { }
                    try
                    {
                        s1.close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        return true;
                    }
                    return true;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (s[j1] != abyte0[j1])
            {
                try
                {
                    context.close();
                }
                // Misplaced declaration of an exception variable
                catch (Context context) { }
                try
                {
                    s1.close();
                }
                // Misplaced declaration of an exception variable
                catch (Context context) { }
                return false;
            }
            j1++;
        } while (true);
        context;
        context = null;
        s = abyte0;
_L4:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        return false;
        s;
        s1 = null;
        context = null;
_L2:
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        s = context;
        context = s1;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    private final boolean a(String s, String s1, String s2)
    {
        File file = new File(s1);
        if (file.exists())
        {
            return true;
        } else
        {
            a(new String[] {
                String.format("cp %s %s", new Object[] {
                    s, s1
                }), String.format("chmod %s %s", new Object[] {
                    s2, s1
                })
            });
            return file.exists();
        }
    }

    private final boolean a(String as[])
    {
        OutputStream outputstream;
        OutputStream outputstream1;
        boolean flag;
        flag = false;
        if (as == null || as.length == 0)
        {
            throw new RuntimeException("No cmds specified");
        }
        outputstream1 = null;
        outputstream = outputstream1;
        Process process = Runtime.getRuntime().exec("su");
        outputstream = outputstream1;
        outputstream1 = process.getOutputStream();
        outputstream = outputstream1;
        int j1 = as.length;
        int i1 = 0;
_L6:
        if (i1 < j1) goto _L2; else goto _L1
_L1:
        outputstream = outputstream1;
        outputstream1.write("exit 0\n".getBytes());
        outputstream = outputstream1;
        outputstream1.flush();
        outputstream = outputstream1;
        process.waitFor();
        outputstream = outputstream1;
        process.destroy();
        if (outputstream1 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        outputstream1.close();
        flag = true;
_L4:
        return flag;
_L2:
        outputstream = outputstream1;
        outputstream1.write((new StringBuilder(String.valueOf(as[i1]))).append("\n").toString().getBytes());
        outputstream = outputstream1;
        outputstream1.flush();
        i1++;
        continue; /* Loop/switch isn't completed */
        as;
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        outputstream.close();
        throw as;
        as;
        if (!e) goto _L4; else goto _L3
_L3:
        Log.e("RootClient", "", as);
        return false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static void b(Context context)
    {
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorenter ;
        File file;
        file = context.getFileStreamPath("rt_server.jar");
        if (a(context, file.getAbsolutePath(), "rt_server.jar"))
        {
            break MISSING_BLOCK_LABEL_49;
        }
        m = com.qihoo360.mobilesafe.support.a.a(context, "rt_server.jar");
        try
        {
            NativeManager.chmod(m, 420);
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorexit ;
        return;
        if (!TextUtils.isEmpty(m))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        m = file.getAbsolutePath();
        break MISSING_BLOCK_LABEL_45;
        context;
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorexit ;
        throw context;
    }

    private final void b(String s)
    {
        a(new String[] {
            String.format("mount -o remount,%s /system", new Object[] {
                s
            })
        });
    }

    private final boolean c(String s)
    {
        String s1 = o();
        Object obj = "/system/bin/ap32";
        if (!p()) goto _L2; else goto _L1
_L1:
        b("rw");
        a(s1, "/system/bin/ap32", "0755");
        if (e)
        {
            Log.i("RootClient", "samsung device");
        }
        b("ro");
_L4:
        return a(s, ((String) (obj)));
_L2:
        obj = new File(g.getFilesDir(), "ap32");
        if (((File) (obj)).exists())
        {
            ((File) (obj)).delete();
        }
        FileUtil.copyFile(new File(s1), ((File) (obj)));
        if (!((File) (obj)).exists())
        {
            break; /* Loop/switch isn't completed */
        }
        ((File) (obj)).setExecutable(true, false);
        ((File) (obj)).setReadable(true, false);
        obj = ((File) (obj)).getAbsolutePath();
        if (true) goto _L4; else goto _L3
        s;
_L3:
        return false;
    }

    static void h()
    {
        j();
    }

    static b i()
    {
        return l;
    }

    private static void j()
    {
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorenter ;
        IBinder ibinder;
        if (l != null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ibinder = a(a.b);
        if (ibinder == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        l = com.qihoo360.mobilesafe.support.a.b.a.a(ibinder);
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static final boolean k()
    {
        String s = new String(Build.MODEL);
        return !TextUtils.isEmpty(s) && s.startsWith("SM-N91");
    }

    private static final boolean l()
    {
        boolean flag;
        try
        {
            flag = ((Boolean)Class.forName("android.os.SELinux").getMethod("isSELinuxEnabled", new Class[0]).invoke(null, new Object[0])).booleanValue();
        }
        catch (Throwable throwable)
        {
            return false;
        }
        return flag;
    }

    private static final boolean m()
    {
        boolean flag;
        try
        {
            flag = ((Boolean)Class.forName("android.os.SELinux").getMethod("isSELinuxEnforced", new Class[0]).invoke(null, new Object[0])).booleanValue();
        }
        catch (Throwable throwable)
        {
            return false;
        }
        return flag;
    }

    private static final boolean n()
    {
        while (android.os.Build.VERSION.SDK_INT < 18 || !l() || !m()) 
        {
            return false;
        }
        return true;
    }

    private final String o()
    {
        Object obj2 = null;
        Object obj1;
        Object obj3;
        obj3 = Runtime.getRuntime().exec("sh");
        obj1 = ((Process) (obj3)).getOutputStream();
        obj2 = new BufferedReader(new InputStreamReader(((Process) (obj3)).getInputStream()));
        ((OutputStream) (obj1)).write("ls -Z /system/bin\n".getBytes());
        ((OutputStream) (obj1)).flush();
_L4:
        Object obj = ((BufferedReader) (obj2)).readLine();
        if (obj == null) goto _L2; else goto _L1
_L1:
        String as[];
        String s1;
        as = ((String) (obj)).trim().split("\\s+");
        obj = as[3].trim();
        s1 = as[4].trim();
        if (!"u:object_r:zygote_exec:s0".equals(obj)) goto _L4; else goto _L3
_L3:
        obj = (new StringBuilder("/system/bin/")).append(s1).toString();
        if (!e) goto _L6; else goto _L5
_L5:
        if (as.length != 5) goto _L8; else goto _L7
_L7:
        Log.e("RootClient", "common file");
_L6:
        ((OutputStream) (obj1)).write("exit 0\n".getBytes());
        ((OutputStream) (obj1)).flush();
        ((Process) (obj3)).waitFor();
        ((Process) (obj3)).destroy();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        ((BufferedReader) (obj2)).close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        ((OutputStream) (obj1)).close();
        return ((String) (obj));
_L8:
        if (as.length == 7)
        {
            Log.e("RootClient", "link file");
        }
        continue; /* Loop/switch isn't completed */
        obj1;
        obj3 = null;
        obj = "/system/bin/app_process";
_L11:
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        ((BufferedReader) (obj3)).close();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        ((OutputStream) (obj2)).close();
        throw obj1;
        obj1;
_L10:
        ((Exception) (obj1)).printStackTrace();
        return ((String) (obj));
        obj1;
        if (true) goto _L10; else goto _L9
_L9:
        Exception exception;
        exception;
        obj = "/system/bin/app_process";
        obj2 = obj1;
        obj3 = null;
        obj1 = exception;
        continue; /* Loop/switch isn't completed */
        Exception exception1;
        exception1;
        obj = obj1;
        obj3 = obj2;
        String s = "/system/bin/app_process";
        obj1 = exception1;
        obj2 = obj;
        obj = s;
        continue; /* Loop/switch isn't completed */
        s;
        obj3 = obj2;
        obj2 = obj1;
        obj1 = s;
        continue; /* Loop/switch isn't completed */
        exception1;
        obj3 = obj1;
        Object obj4 = obj2;
        obj1 = exception1;
        obj2 = obj3;
        obj3 = obj4;
        if (true) goto _L11; else goto _L2
_L2:
        obj = "/system/bin/app_process";
        if (true) goto _L6; else goto _L12
_L12:
    }

    private final boolean p()
    {
        return Build.MANUFACTURER.equalsIgnoreCase("samsung") || Build.BRAND.equalsIgnoreCase("samsung");
    }

    protected c.a a(String s, List list, List list1, boolean flag, boolean flag1, com.qihoo360.mobilesafe.support.a.a a1, long l1)
    {
        c.a a2;
        a2 = new c.a();
        g();
        (new Thread(new Runnable(a2, flag1, a1, s, list, list1, l1) {

            final d a;
            private final c.a b;
            private final boolean c;
            private final com.qihoo360.mobilesafe.support.a.a d;
            private final String e;
            private final List f;
            private final List g;
            private final long h;

            public void run()
            {
                d.h();
                if (d.i() != null)
                {
                    break MISSING_BLOCK_LABEL_65;
                }
                synchronized (b)
                {
                    b.d = false;
                    b.notify();
                }
                if (!c || d == null)
                {
                    break MISSING_BLOCK_LABEL_59;
                }
                d.a(1, false, null);
                return;
                exception;
                a3;
                JVM INSTR monitorexit ;
                throw exception;
                b.a = d.i().b(e, f, g, h);
                if (c && d != null)
                {
                    d.a(1, b.a(), null);
                }
_L2:
                synchronized (b)
                {
                    b.d = false;
                    b.notify();
                }
                return;
                exception1;
                a4;
                JVM INSTR monitorexit ;
                throw exception1;
                Object obj;
                obj;
                if (c && d != null)
                {
                    try
                    {
                        d.a(1, false, null);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj) { }
                }
                if (true) goto _L2; else goto _L1
_L1:
                obj;
            }

            
            {
                a = d.this;
                b = a1;
                c = flag;
                d = a2;
                e = s;
                f = list;
                g = list1;
                h = l1;
                super();
            }
        })).start();
        if (flag1) goto _L2; else goto _L1
_L1:
        a2;
        JVM INSTR monitorenter ;
        if (a2.d)
        {
            a2.wait(l1);
        }
_L4:
        a2;
        JVM INSTR monitorexit ;
_L2:
        if (f)
        {
            Log.d("RootClient", (new StringBuilder("wait exit = ")).append(a2.a).toString());
        }
        return a2;
        s;
        if (!e) goto _L4; else goto _L3
_L3:
        Log.e("RootClient", s.getMessage(), s);
          goto _L4
        s;
        a2;
        JVM INSTR monitorexit ;
        throw s;
    }

    public boolean a()
    {
        while (!com.qihoo360.mobilesafe.support.a.a(g) || com.qihoo360.common.c.a.a(g) == 0x30e12) 
        {
            return false;
        }
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorenter ;
        int i1;
        if (!h)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        i1 = c();
        if (i1 < 0 || i1 == 11)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        b();
        l = null;
        h = false;
        b b1;
        j();
        b1 = l;
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        boolean flag = l.a();
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorexit ;
        return flag;
        Object obj;
        obj;
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        l = null;
        if (!(obj instanceof DeadObjectException))
        {
            break MISSING_BLOCK_LABEL_147;
        }
        j();
        if (l == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        flag = l.a();
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorexit ;
        return flag;
        obj;
        if (e)
        {
            Log.e("RootClient", "still failed", ((Throwable) (obj)));
        }
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorexit ;
        return false;
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorexit ;
        return false;
    }

    public boolean a(long l1)
    {
        if (e)
        {
            Log.v("RootClient", (new StringBuilder("start to invoe startServer in ")).append(Thread.currentThread().getId()).toString());
        }
        boolean flag = a();
        if (e)
        {
            Log.v("RootClient", (new StringBuilder("after start server ")).append(flag).toString());
        }
        return flag;
    }

    protected boolean a(String s, String s1)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        String s2;
        b();
        s2 = s1;
        if (TextUtils.isEmpty(s1))
        {
            s2 = com.qihoo360.mobilesafe.support.a.h.a("app_process");
        }
        if (s2 == null) goto _L1; else goto _L3
_L3:
        int i1;
        s1 = (new File(s2)).getParent();
        n = com.qihoo360.mobilesafe.support.a.h.c(g);
        String s4 = String.format("%s %s %s %s %s %s&\n", new Object[] {
            s2, s1, "com.qihoo360.server.RootServer", g.getApplicationInfo().dataDir, n, s
        });
        String s3;
        OutputStream outputstream;
        boolean flag;
        try
        {
            s1 = com.qihoo360.mobilesafe.support.a.h.a(g);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        if (s1 == null) goto _L1; else goto _L4
_L10:
        if (i1 < p) goto _L6; else goto _L5
_L5:
        if (i1 > p) goto _L1; else goto _L7
_L7:
        return true;
_L13:
        b = Runtime.getRuntime().exec(s1);
        outputstream = b.getOutputStream();
        s3 = System.getenv("LD_LIBRARY_PATH");
        s2 = s3;
        if (TextUtils.isEmpty(s3))
        {
            s2 = "/system/lib:/vendor/lib";
        }
        outputstream.write(String.format("export _LD_LIBRARY_PATH=%s\n", new Object[] {
            s2
        }).getBytes());
        outputstream.write(String.format("export LD_LIBRARY_PATH=%s\n", new Object[] {
            s2
        }).getBytes());
        outputstream.write(String.format("export BOOTCLASSPATH=%s\n", new Object[] {
            System.getenv("BOOTCLASSPATH")
        }).getBytes());
        outputstream.write(String.format("export PATH=%s\n", new Object[] {
            System.getenv("PATH")
        }).getBytes());
        outputstream.write(String.format("export CLASSPATH=%s\n", new Object[] {
            s
        }).getBytes());
        if (!TextUtils.isEmpty(a.b))
        {
            outputstream.write((new StringBuilder("export RT_SERVICE_NAME=")).append(a.b).append("\n").toString().getBytes());
        }
        if (!TextUtils.isEmpty(a.c))
        {
            outputstream.write((new StringBuilder("export RT_PROCESS_NAME=")).append(a.c).append("\n").toString().getBytes());
        }
        outputstream.write(s4.getBytes());
        outputstream.write("exit 100\n".getBytes());
        outputstream.flush();
        i1 = b.waitFor();
        try
        {
            outputstream.close();
        }
        catch (Exception exception) { }
        if (i1 == 100)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!s1.endsWith("360s"))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = "su";
        continue; /* Loop/switch isn't completed */
_L6:
        flag = a();
        if (flag) goto _L9; else goto _L8
_L8:
        i1++;
        try
        {
            Thread.sleep(q);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
          goto _L10
_L9:
        if (!e) goto _L5; else goto _L11
_L11:
        Log.v("RootClient", (new StringBuilder("success at time ")).append(i1).toString());
          goto _L5
_L4:
        if (s1 != null) goto _L13; else goto _L12
_L12:
        i1 = 0;
          goto _L10
    }

    protected byte[] a(String s, List list, List list1, boolean flag, com.qihoo360.mobilesafe.support.a.a a1, long l1)
    {
        c.a a2;
        a2 = new c.a();
        g();
        (new Thread(new Runnable(a2, flag, a1, s, list, list1, l1) {

            final d a;
            private final c.a b;
            private final boolean c;
            private final com.qihoo360.mobilesafe.support.a.a d;
            private final String e;
            private final List f;
            private final List g;
            private final long h;

            public void run()
            {
                d.h();
                if (d.i() != null)
                {
                    break MISSING_BLOCK_LABEL_65;
                }
                synchronized (b)
                {
                    b.d = false;
                    b.notify();
                }
                if (!c || d == null)
                {
                    break MISSING_BLOCK_LABEL_59;
                }
                d.a(2, false, null);
_L1:
                return;
                exception;
                a3;
                JVM INSTR monitorexit ;
                throw exception;
                try
                {
                    b.c = d.i().c(e, f, g, h);
                    if (c && d != null)
                    {
                        d.a(2, true, b.c);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    if (a.f)
                    {
                        Log.e("RootClient", ((Exception) (obj)).getMessage(), ((Throwable) (obj)));
                    }
                    if (c && d != null)
                    {
                        try
                        {
                            d.a(2, false, null);
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj) { }
                    }
                }
                synchronized (b)
                {
                    b.d = false;
                    b.notify();
                }
                if (a.f)
                {
                    Log.i("RootClient", "Exec thread finished.");
                    return;
                }
                  goto _L1
                exception1;
                obj;
                JVM INSTR monitorexit ;
                throw exception1;
                RemoteException remoteexception;
                remoteexception;
            }

            
            {
                a = d.this;
                b = a1;
                c = flag;
                d = a2;
                e = s;
                f = list;
                g = list1;
                h = l1;
                super();
            }
        })).start();
        if (flag) goto _L2; else goto _L1
_L1:
        a2;
        JVM INSTR monitorenter ;
        if (a2.d)
        {
            a2.wait(l1);
        }
_L4:
        a2;
        JVM INSTR monitorexit ;
_L2:
        if (f)
        {
            Log.d("RootClient", (new StringBuilder("wait exit = ")).append(a2.a).toString());
        }
        return a2.c;
        s;
        if (!e) goto _L4; else goto _L3
_L3:
        Log.e("RootClient", s.getMessage(), s);
          goto _L4
        s;
        a2;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected void b(long l1)
    {
        c.a a1 = new c.a();
        (new Thread(new Runnable(a1) {

            final d a;
            private final c.a b;

            public void run()
            {
                com.qihoo360.mobilesafe.support.a.d.a(a, b);
_L1:
                return;
                Exception exception1;
                exception1;
                if (a.e)
                {
                    Log.e("RootClient", "", exception1);
                    return;
                }
                  goto _L1
            }

            
            {
                a = d.this;
                b = a1;
                super();
            }
        })).start();
        a1;
        JVM INSTR monitorenter ;
        if (a1.d)
        {
            a1.wait(l1);
        }
_L2:
        a1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        if (!e) goto _L2; else goto _L1
_L1:
        Log.e("RootClient", ((InterruptedException) (obj)).getMessage(), ((Throwable) (obj)));
          goto _L2
        obj;
        a1;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public boolean b()
    {
        boolean flag = false;
        j();
        if (l != null)
        {
            try
            {
                flag = l.b();
            }
            catch (Exception exception)
            {
                return false;
            }
        }
        return flag;
    }

    public int c()
    {
        int i1 = -1;
        j();
        if (l != null)
        {
            try
            {
                i1 = l.c();
            }
            catch (Exception exception)
            {
                return -1;
            }
        }
        return i1;
    }

    public boolean e()
    {
        if (com.qihoo360.common.c.a.a(g) == 0x30e12)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = com.qihoo360.mobilesafe.support.a.b.a.a(a(a.b)).a();
        }
        catch (Exception exception)
        {
            return false;
        }
        return flag;
    }

    void g()
    {
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorenter ;
        if (m == null) goto _L2; else goto _L1
_L1:
        if ((new File(m)).exists())
        {
            break MISSING_BLOCK_LABEL_46;
        }
        com.qihoo360.mobilesafe.support.a.a(g, "rt_server.jar");
        Exception exception1;
        try
        {
            NativeManager.chmod(m, 420);
        }
        catch (Throwable throwable1) { }
        if (n == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        if (!(new File(n)).exists())
        {
            n = com.qihoo360.mobilesafe.support.a.h.c(g);
        }
_L3:
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorexit ;
        return;
_L2:
        m = com.qihoo360.mobilesafe.support.a.a(g, "rt_server.jar");
        try
        {
            NativeManager.chmod(m, 420);
        }
        catch (Throwable throwable) { }
        continue; /* Loop/switch isn't completed */
        try
        {
            n = com.qihoo360.mobilesafe.support.a.h.c(g);
        }
        catch (Exception exception) { }
        finally { }
          goto _L3
        com/qihoo360/mobilesafe/support/a/d;
        JVM INSTR monitorexit ;
        throw exception1;
        if (true) goto _L5; else goto _L4
_L5:
        break MISSING_BLOCK_LABEL_46;
_L4:
    }

}
