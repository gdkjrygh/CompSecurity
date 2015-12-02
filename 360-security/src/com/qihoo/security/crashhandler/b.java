// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.crashhandler;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.qihoo.security.env.a;
import com.qihoo360.common.utils.FileUtil;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

// Referenced classes of package com.qihoo.security.crashhandler:
//            c, UploadActivity, a

public class b
    implements Runnable, Thread.UncaughtExceptionHandler, InvocationHandler
{
    static final class a extends Instrumentation
    {

        public Activity newActivity(ClassLoader classloader, String s, Intent intent)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException
        {
            try
            {
                classloader = super.newActivity(classloader, s, intent);
            }
            // Misplaced declaration of an exception variable
            catch (ClassLoader classloader)
            {
                String s1 = com.qihoo.security.crashhandler.b.a("ActivityThread".getBytes());
                Parcel parcel = Parcel.obtain();
                intent.writeToParcel(parcel, 0);
                Log.e(s1, com.qihoo.security.crashhandler.b.a(parcel.marshall()));
                parcel.recycle();
                Log.e(s1, com.qihoo.security.crashhandler.b.a(s.getBytes()));
                throw classloader;
            }
            return classloader;
        }

        a()
        {
        }
    }


    private static b b;
    private Thread.UncaughtExceptionHandler a;
    private final Context c;
    private final Properties d = new Properties();

    private b(Context context)
    {
        c = context;
    }

    static Context a(b b1)
    {
        return b1.c;
    }

    public static b a(Context context)
    {
        if (b == null)
        {
            b = new b(context);
        }
        return b;
    }

    static String a(byte abyte0[])
    {
        return b(abyte0);
    }

    static void a(b b1, Throwable throwable)
    {
        b1.b(throwable);
    }

    private boolean a(Throwable throwable)
    {
        if (throwable == null)
        {
            return true;
        } else
        {
            (new Thread(throwable) {

                final Throwable a;
                final b b;

                public void run()
                {
                    Looper.prepare();
                    b.c(com.qihoo.security.crashhandler.b.a(b));
                    com.qihoo.security.crashhandler.b.a(b, a);
                    com.qihoo.security.crashhandler.a.a(com.qihoo.security.crashhandler.b.a(b).getFilesDir());
                    com.qihoo.security.crashhandler.a.b(com.qihoo.security.crashhandler.b.a(b).getFilesDir());
                    File file = b.b(b);
                    if (file != null && file.exists())
                    {
                        try
                        {
                            com.qihoo.security.e.a.a(com.qihoo.security.crashhandler.b.a(b)).a(file.getAbsolutePath());
                        }
                        catch (Throwable throwable1) { }
                    }
                    Looper.loop();
                }

            
            {
                b = b.this;
                a = throwable;
                super();
            }
            }).start();
            return true;
        }
    }

    static File b(b b1)
    {
        return b1.e();
    }

    private static String b(byte abyte0[])
    {
        return Base64.encodeToString(abyte0, 2);
    }

    private void b(Throwable throwable)
    {
        Log.e("CrashHandler", "Crash Log BEGIN");
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter);
        try
        {
            throwable.printStackTrace(printwriter);
        }
        catch (Error error) { }
        throwable = throwable.getCause();
        do
        {
            if (throwable == null)
            {
                break;
            }
            try
            {
                throwable.printStackTrace(printwriter);
                throwable = throwable.getCause();
                continue;
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable) { }
            break;
        } while (true);
        throwable = stringwriter.toString();
        printwriter.close();
        d.put("STACK_TRACE", throwable);
        Log.e("CrashHandler", throwable);
        try
        {
            throwable = new File(c.getFilesDir(), "crash");
            if (!throwable.exists())
            {
                throwable.mkdir();
            }
            throwable = new FileOutputStream(new File(throwable, "crash_report.txt"));
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append("{");
            stringbuffer.append((new StringBuilder()).append("STACK_TRACE=").append(d.getProperty("STACK_TRACE", "unkown")).append(",").toString());
            stringbuffer.append((new StringBuilder()).append("versionName=").append(d.getProperty("versionName", "not set")).append(",").toString());
            stringbuffer.append((new StringBuilder()).append("versionCode=").append(d.getProperty("versionCode", "not set")).append(",").toString());
            stringbuffer.append((new StringBuilder()).append("isSystem=").append(d.getProperty("isSystem", "false")).append(",").toString());
            stringbuffer.append((new StringBuilder()).append("versionBuild=").append(d.getProperty("versionBuild")).append(",").toString());
            stringbuffer.append((new StringBuilder()).append("cid=").append(d.getProperty("cid")).append(",").toString());
            if (!TextUtils.isEmpty(d.getProperty("UserQid")))
            {
                stringbuffer.append((new StringBuilder()).append("UserQid=").append(d.getProperty("UserQid")).append(",").toString());
            }
            stringbuffer.append((new StringBuilder()).append("signature_md5=").append(d(c)).append(",").toString());
            stringbuffer.append("}");
            throwable.write(stringbuffer.toString().getBytes());
            throwable.close();
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            Log.e("CrashHandler", "an error occured while writing report file...", throwable);
        }
        Log.i("CrashHandler", "Crash Log END");
    }

    public static boolean b(Context context)
    {
        if (context != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        Object obj1;
        Object obj2;
        boolean flag;
        try
        {
            for (; context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) { }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("CrashHandler", "", context);
            return false;
        }
        obj = Class.forName("android.app.ActivityThread");
        obj1 = ((Class) (obj)).getMethod("currentActivityThread", (Class[])null).invoke(null, (Object[])null);
        Log.e("CrashHandler", (new StringBuilder()).append("aThread:").append(obj1).toString());
        obj2 = context.getClass().getDeclaredField("mPackageInfo");
        ((Field) (obj2)).setAccessible(true);
        obj2 = ((Field) (obj2)).get(context);
        Log.e("CrashHandler", (new StringBuilder()).append("packageInfo:").append(obj2).toString());
        obj = (Resources)obj2.getClass().getMethod("getResources", new Class[] {
            obj
        }).invoke(obj2, new Object[] {
            obj1
        });
        Log.e("CrashHandler", (new StringBuilder()).append("resources:").append(obj).toString());
        obj = (String)obj2.getClass().getMethod("getResDir", (Class[])null).invoke(obj2, (Object[])null);
        Log.e("CrashHandler", (new StringBuilder()).append("resDir:").append(((String) (obj))).toString());
        if (obj == null) goto _L1; else goto _L3
_L3:
        context = context.getPackageManager().getPackageInfo("com.qihoo.security.lite", 0).applicationInfo.sourceDir;
        Log.e("CrashHandler", (new StringBuilder()).append("sourceDir:").append(context).toString());
        flag = ((String) (obj)).equals(context);
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    private static String d(Context context)
    {
        context = e(context);
        StringBuilder stringbuilder = new StringBuilder();
        if (context != null && context.length > 0)
        {
            int k = context.length;
            for (int i = 0; i < k; i++)
            {
                stringbuilder.append(Utils.getMD5(context[i].toByteArray()));
                stringbuilder.append(":");
            }

        }
        int j = stringbuilder.lastIndexOf(":");
        if (j >= 0)
        {
            stringbuilder.deleteCharAt(j);
        }
        return stringbuilder.toString();
    }

    private File e()
    {
        File file = c.getFilesDir();
        if (file != null)
        {
            return new File(file, "crash");
        } else
        {
            return null;
        }
    }

    private static Signature[] e(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        context = context.getPackageName();
        if (TextUtils.isEmpty(context) || packagemanager == null)
        {
            return null;
        }
        try
        {
            context = packagemanager.getPackageInfo(context, 64).signatures;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return context;
    }

    public void a()
    {
        a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        (new Thread(this)).start();
    }

    public int b()
    {
        File file = e();
        int i = -1;
        if (file != null)
        {
            i = (new c(c)).a(file);
            a(c).c();
        }
        return i;
    }

    public void c()
    {
        File file = e();
        if (file != null)
        {
            FileUtil.deleteDir(file.getAbsolutePath());
        }
    }

    public void c(Context context)
    {
        boolean flag = true;
        PackageInfo packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
        if (packageinfo == null) goto _L2; else goto _L1
_L1:
        Properties properties = d;
        if (packageinfo.versionName != null) goto _L4; else goto _L3
_L3:
        String s = "not set";
_L5:
        properties.put("versionName", s);
        d.put("versionCode", String.valueOf(packageinfo.versionCode));
        if ((packageinfo.applicationInfo.flags & 1) != 1)
        {
            flag = false;
        }
        d.put("isSystem", Boolean.valueOf(flag));
_L2:
        d.put("versionBuild", "3742");
        d.put("cid", String.valueOf(com.qihoo.security.env.a.a(context)));
        context = SharedPref.b(context, "quc_id", "");
        if (!TextUtils.isEmpty(context))
        {
            context = Utils.DES_decrypt(context, "com.qihoo.security.lite");
            d.put("UserQid", context);
        }
        return;
_L4:
        s = packageinfo.versionName;
          goto _L5
        Throwable throwable;
        throwable;
          goto _L2
    }

    public boolean d()
    {
        File file = e();
        if (file != null)
        {
            return file.exists();
        } else
        {
            return false;
        }
    }

    public Object invoke(Object obj, Method method, Object aobj[])
        throws Throwable
    {
        obj = method.getReturnType();
        if (obj != null && obj.equals(Boolean.TYPE))
        {
            return Boolean.valueOf(false);
        } else
        {
            return null;
        }
    }

    public void run()
    {
        if (android.os.Build.VERSION.SDK_INT != 17) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = Class.forName("android.os.SystemProperties").getMethod("get", new Class[] {
            java/lang/String, java/lang/String
        });
        ((Method) (obj)).setAccessible(true);
        obj = (String)((Method) (obj)).invoke(null, new Object[] {
            "ro.mediatek.platform", "unknown"
        });
        if (((String) (obj)).equals("MT6572")) goto _L4; else goto _L3
_L3:
        boolean flag1 = ((String) (obj)).equals("MT6592");
        if (!flag1) goto _L2; else goto _L4
_L4:
        Class.forName("android.app.ANRManagerProxy");
        boolean flag = false;
_L7:
        if (!flag) goto _L2; else goto _L5
_L5:
        Object obj1 = Class.forName("android.app.ANRManagerNative").getDeclaredField("gDefault");
        ((Field) (obj1)).setAccessible(true);
        obj1 = ((Field) (obj1)).get(null);
        Field field = obj1.getClass().getSuperclass().getDeclaredField("mInstance");
        field.setAccessible(true);
        Class class1 = Class.forName("android.app.IANRManager");
        field.set(obj1, Proxy.newProxyInstance(getClass().getClassLoader(), new Class[] {
            class1
        }, this));
_L2:
        ArrayList arraylist = new ArrayList();
        arraylist.add("asus/WW_fonepad/K012:4.3/JSS15Q/WW_fonepad-10.32.1.33.1-20140901:user/release-keys");
        arraylist.add("asus/WW_fonepad/K012:4.3/JSS15Q/WW_fonepad-10.32.1.30.5-20140701:user/release-keys");
        arraylist.add("asus/WW_fonepad/K012:4.3/JSS15Q/WW_fonepad-10.32.1.31.2-20140721:user/release-keys");
        if (arraylist.contains(Build.FINGERPRINT))
        {
            Object obj2 = Class.forName("android.app.ActivityThread");
            Object obj3 = ((Class) (obj2)).getDeclaredMethod("currentActivityThread", new Class[0]);
            ((Method) (obj3)).setAccessible(true);
            obj3 = ((Method) (obj3)).invoke(null, (Object[])null);
            obj2 = ((Class) (obj2)).getDeclaredField("mInstrumentation");
            ((Field) (obj2)).setAccessible(true);
            ((Field) (obj2)).set(obj3, new a());
        }
        return;
        Exception exception;
        exception;
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
        exception;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        if (!a(throwable) && a != null)
        {
            a.uncaughtException(thread, throwable);
            return;
        }
        try
        {
            Thread.sleep(2000L);
        }
        // Misplaced declaration of an exception variable
        catch (Thread thread) { }
        if (!b(c))
        {
            thread = new Intent(c, com/qihoo/security/crashhandler/UploadActivity);
            thread.addFlags(0x10000000);
            c.startActivity(thread);
        }
        System.exit(1);
    }
}
