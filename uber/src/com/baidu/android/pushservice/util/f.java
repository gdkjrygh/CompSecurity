// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice.util;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.LocalServerSocket;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.baidu.android.pushservice.PushConstants;
import com.baidu.android.pushservice.a;
import com.baidu.android.pushservice.f.k;
import com.baidu.android.pushservice.jni.Base64Encoder;
import com.baidu.android.pushservice.jni.PushSocket;
import com.baidu.frontia.a.e.c;
import com.baidu.frontia.a.e.d;
import com.baidu.frontia.a.e.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.baidu.android.pushservice.util:
//            g, PushDatabase

public final class f
{

    private static final String a[] = {
        "android.permission.INTERNET", "android.permission.READ_PHONE_STATE", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WRITE_SETTINGS", "android.permission.VIBRATE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_WIFI_STATE"
    };
    private static ArrayList b = new ArrayList();

    public static String A(Context context)
    {
        String s1 = android.provider.Settings.System.getString(context.getContentResolver(), "com.baidu.push.cur_pkg");
        if (p(context, s1))
        {
            if (j(context, s1))
            {
                return s1;
            }
            if (com.baidu.android.pushservice.a.b())
            {
                com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder("The Highest priority Service: ")).append(s1).append(" is disabled,Maybe use setComponentEnabledSetting method").toString());
            }
        }
        return B(context);
    }

    public static String B(Context context)
    {
        String s1;
        String s3;
        Iterator iterator;
        long l1;
        s1 = context.getPackageName();
        List list = t(context.getApplicationContext());
        if (list.size() <= 1)
        {
            return s1;
        }
        l1 = context.getSharedPreferences((new StringBuilder()).append(context.getPackageName()).append(".push_sync").toString(), 5).getLong("priority2", 0L);
        s3 = android.provider.Settings.System.getString(context.getContentResolver(), "com.baidu.push.cur_pkg");
        iterator = list.iterator();
_L3:
        Object obj;
        String s2;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = ((ResolveInfo)iterator.next()).activityInfo.packageName;
        obj = null;
        Object obj1 = context.createPackageContext(s2, 2);
        obj = obj1;
        SharedPreferences sharedpreferences = ((Context) (obj1)).getSharedPreferences((new StringBuilder()).append(s2).append(".push_sync").toString(), 5);
        obj = sharedpreferences;
_L1:
        Object obj2;
        if (obj == null)
        {
            if (com.baidu.android.pushservice.a.b())
            {
                com.baidu.frontia.a.b.a.a.c("Utility", (new StringBuilder("App:")).append(s2).append(" doesn't init Version!").toString());
            }
        } else
        {
            long l2 = ((SharedPreferences) (obj)).getLong("priority2", 0L);
            if (l2 > l1)
            {
                if (com.baidu.android.pushservice.a.b())
                {
                    com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder("Find more higher priority pkg : ")).append(s2).append(" priority = ").append(l2).append(",Current highest priority pkg : ").append(s1).append(" priority = ").append(l1).toString());
                }
                if (j(((Context) (obj1)), s2))
                {
                    l1 = l2;
                    s1 = s2;
                } else
                if (com.baidu.android.pushservice.a.b())
                {
                    com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder()).append(s2).append("push service is disabled").toString());
                }
            } else
            if (l2 == l1 && s2.equals(s3) && j(((Context) (obj1)), s2))
            {
                s1 = s2;
                l1 = l2;
            }
        }
        continue; /* Loop/switch isn't completed */
        obj1;
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.c("Utility", (new StringBuilder("create packagecontext exception: ")).append(((Exception) (obj1)).getMessage()).toString());
        }
        obj2 = null;
        obj1 = obj;
        obj = obj2;
          goto _L1
        if (true) goto _L3; else goto _L2
_L2:
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder("Current highest priority Push PackageName: ")).append(s1).toString());
        }
        return s1;
    }

    public static long C(Context context)
    {
        String s1;
        Object obj;
        s1 = context.getPackageName();
        obj = t(context.getApplicationContext());
        if (((List) (obj)).size() > 1) goto _L2; else goto _L1
_L1:
        long l2 = 0L;
_L6:
        return l2;
_L2:
        String s3;
        Iterator iterator;
        long l1;
        l1 = context.getSharedPreferences((new StringBuilder()).append(context.getPackageName()).append(".push_sync").toString(), 5).getLong("priority2", 0L);
        s3 = android.provider.Settings.System.getString(context.getContentResolver(), "com.baidu.push.cur_pkg");
        iterator = ((List) (obj)).iterator();
_L4:
        String s2;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = ((ResolveInfo)iterator.next()).activityInfo.packageName;
        obj = context.createPackageContext(s2, 2);
        Object obj1 = ((Context) (obj)).getSharedPreferences((new StringBuilder()).append(s2).append(".push_sync").toString(), 5);
_L5:
        if (obj1 == null)
        {
            if (com.baidu.android.pushservice.a.b())
            {
                com.baidu.frontia.a.b.a.a.c("Utility", (new StringBuilder("App:")).append(s2).append(" doesn't init Version!").toString());
            }
        } else
        {
            l2 = ((SharedPreferences) (obj1)).getLong("priority2", 0L);
            if (l2 > l1)
            {
                if (com.baidu.android.pushservice.a.b())
                {
                    com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder("Find more higher priority pkg : ")).append(s2).append(" priority = ").append(l2).append(",Current highest priority pkg : ").append(s1).append(" priority = ").append(l1).toString());
                }
                if (j(((Context) (obj)), s2))
                {
                    l1 = l2;
                    s1 = s2;
                } else
                if (com.baidu.android.pushservice.a.b())
                {
                    com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder()).append(s2).append("push service is disabled").toString());
                }
            } else
            if (l2 == l1 && s2.equals(s3) && j(((Context) (obj)), s2))
            {
                s1 = s2;
                l1 = l2;
            }
        }
        if (true) goto _L4; else goto _L3
        obj1;
        obj = null;
_L7:
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.c("Utility", (new StringBuilder("create packagecontext exception: ")).append(((Exception) (obj1)).getMessage()).toString());
        }
        obj1 = null;
          goto _L5
_L3:
        l2 = l1;
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder("Current highest priority Push PackageName: ")).append(s1).append("Highest Priority is ").append(l1).toString());
            return l1;
        }
          goto _L6
        obj1;
          goto _L7
    }

    private static boolean D(Context context)
    {
        if (!a(context, "com.baidu.android.pushservice.action.notification.SHOW", "com.baidu.android.pushservice.PushServiceReceiver", true))
        {
            com.baidu.frontia.a.b.a.a.d("Utility", "com.baidu.android.pushservice.PushServiceReceiver did not declaredcom.baidu.android.pushservice.action.notification.SHOW");
            return false;
        }
        if (!a(context, "android.net.conn.CONNECTIVITY_CHANGE", "com.baidu.android.pushservice.PushServiceReceiver", true))
        {
            com.baidu.frontia.a.b.a.a.d("Utility", "com.baidu.android.pushservice.PushServiceReceiver did not declaredandroid.net.conn.CONNECTIVITY_CHANGE");
            return false;
        }
        if (!a(context, "com.baidu.android.pushservice.action.BIND_SYNC", "com.baidu.android.pushservice.RegistrationReceiver", true))
        {
            com.baidu.frontia.a.b.a.a.d("Utility", "com.baidu.android.pushservice.RegistrationReceiver did not declaredcom.baidu.android.pushservice.action.BIND_SYNC");
            return false;
        }
        if (!a(context, "com.baidu.android.pushservice.action.METHOD", "com.baidu.android.pushservice.RegistrationReceiver", true))
        {
            com.baidu.frontia.a.b.a.a.d("Utility", "com.baidu.android.pushservice.PushServiceReceiver did not declaredcom.baidu.android.pushservice.action.notification.SHOW");
            return false;
        } else
        {
            return true;
        }
    }

    private static boolean E(Context context)
    {
        return a(context, "com.baidu.android.pushservice.action.PUSH_SERVICE", "com.baidu.android.pushservice.PushService", false);
    }

    private static ArrayList F(Context context)
    {
        Object obj = t(context.getApplicationContext());
        context = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
            if (context.contains(resolveinfo.activityInfo.packageName))
            {
                context.add(resolveinfo.activityInfo.packageName);
            }
        } while (true);
        return context;
    }

    public static int a(Map map, String s1, int i1)
    {
        map = (String)map.get(s1);
        int j1 = i1;
        if (map != null)
        {
            try
            {
                j1 = Integer.valueOf(map).intValue();
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                j1 = i1;
                if (com.baidu.android.pushservice.a.b())
                {
                    com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder("getMapInt E: ")).append(map).toString());
                    return i1;
                }
            }
        }
        return j1;
    }

    public static PackageInfo a(Context context, String s1)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(s1, 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static k a(k k1, Context context, String s1)
    {
        PackageInfo packageinfo = a(context, s1);
        if (packageinfo != null)
        {
            k1.e(packageinfo.applicationInfo.loadLabel(context.getPackageManager()).toString());
            k1.g(packageinfo.versionName);
            k1.a(packageinfo.versionCode);
            k1.f(o(context, s1));
            k1.b(n(context, s1));
        }
        return k1;
    }

    public static String a(long l1)
    {
        StringBuffer stringbuffer = new StringBuffer();
        long l5 = System.currentTimeMillis() - l1;
        long l2 = (long)Math.ceil(((double)l5 * 1.0D) / 1000D);
        long l3 = (long)Math.ceil((float)(l5 / 60L) / 1000F);
        long l4 = (long)Math.ceil((float)(l5 / 60L / 60L) / 1000F);
        l5 = (long)Math.ceil((float)(l5 / 24L / 60L / 60L) / 1000F);
        if (l5 - 1L > 3L)
        {
            stringbuffer.append((new SimpleDateFormat("MM\u6708dd\u65E5")).format(new Date(l1)));
        } else
        if (l5 - 1L > 0L)
        {
            stringbuffer.append((new StringBuilder()).append(l5).append("\u5929\u524D").toString());
        } else
        if (l4 - 1L > 0L)
        {
            if (l4 >= 24L)
            {
                stringbuffer.append("1\u5929\u524D");
            } else
            {
                stringbuffer.append((new StringBuilder()).append(l4).append("\u5C0F\u65F6\u524D").toString());
            }
        } else
        if (l3 - 1L > 0L)
        {
            if (l3 == 60L)
            {
                stringbuffer.append("1\u5C0F\u65F6\u524D");
            } else
            {
                stringbuffer.append((new StringBuilder()).append(l3).append("\u5206\u949F\u524D").toString());
            }
        } else
        if (l2 - 1L > 0L)
        {
            if (l2 == 60L)
            {
                stringbuffer.append("1\u5206\u949F\u524D");
            } else
            {
                stringbuffer.append((new StringBuilder()).append(l2).append("\u79D2\u524D").toString());
            }
        } else
        {
            stringbuffer.append("\u521A\u521A");
        }
        return stringbuffer.toString();
    }

    public static String a(Context context, String s1, String s2)
    {
        if (context == null)
        {
            com.baidu.frontia.a.b.a.a.a("Utility", "getMetaData context == null");
        } else
        {
            try
            {
                context = context.getPackageManager().getApplicationInfo(s1, 128);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                com.baidu.frontia.a.b.a.a.a("getMetaDataString", (new StringBuilder("--- ")).append(s1).append(" GetMetaData Exception:\r\n").toString(), context);
                context = null;
            }
            if (context != null && ((ApplicationInfo) (context)).metaData != null)
            {
                return ((ApplicationInfo) (context)).metaData.getString(s2);
            }
        }
        return null;
    }

    public static String a(Throwable throwable)
    {
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter, true);
        throwable.printStackTrace(printwriter);
        printwriter.flush();
        stringwriter.flush();
        return stringwriter.toString();
    }

    public static String a(Map map, String s1, String s2)
    {
        map = (String)map.get(s1);
        if (map == null)
        {
            return s2;
        } else
        {
            return map;
        }
    }

    public static void a(Context context, long l1)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("Utility", ">>> setAlarmForRestart");
        }
        context = context.getApplicationContext();
        Intent intent = PushConstants.createMethodIntent(context);
        intent.setClassName(context.getPackageName(), e(context, context.getPackageName(), intent.getAction()));
        a(context, intent, l1);
    }

    public static void a(Context context, Intent intent, long l1)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder(">>> setAlarmForSendInent : \r\n")).append(intent).toString());
        }
        intent = PendingIntent.getBroadcast(context, 0, intent, 0x10000000);
        context = (AlarmManager)context.getSystemService("alarm");
        context.cancel(intent);
        context.set(3, SystemClock.elapsedRealtime() + l1, intent);
    }

    public static void a(Context context, Intent intent, String s1, String s2)
    {
        intent.setFlags(32);
        if ((Build.MANUFACTURER.toLowerCase().startsWith("meizu") || Build.DISPLAY.toLowerCase().startsWith("flyme") || Build.MANUFACTURER.toLowerCase().startsWith("vivo") || Build.MANUFACTURER.toLowerCase().startsWith("bbk") || Build.DISPLAY.toLowerCase().startsWith("lenovoa788t") || Build.MANUFACTURER.toLowerCase().startsWith("zte") && Build.DISPLAY.toLowerCase().startsWith("g720t")) && n(context, s2) >= 32)
        {
            if (!TextUtils.isEmpty(s1))
            {
                intent.setAction(s1);
            }
            if (!TextUtils.isEmpty(s2))
            {
                intent.setPackage(s2);
                intent.setClassName(s2, "com.baidu.android.pushservice.CommandService");
            }
            intent.putExtra("command_type", "reflect_receiver");
            try
            {
                context.startService(intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                com.baidu.frontia.a.b.a.a.d("Utility", (new StringBuilder("error ")).append(context.getMessage()).toString());
            }
            return;
        }
        if (!TextUtils.isEmpty(s1))
        {
            intent.setAction(s1);
        }
        if (!TextUtils.isEmpty(s2))
        {
            intent.setPackage(s2);
        }
        s1 = e(context, s2, s1);
        if (!TextUtils.isEmpty(s1))
        {
            intent.setClassName(s2, s1);
        }
        context.sendBroadcast(intent);
    }

    public static void a(Context context, String s1, int i1)
    {
        if (context == null)
        {
            com.baidu.frontia.a.b.a.a.c("Utility", "putSPInt context == null");
            return;
        } else
        {
            android.provider.Settings.System.putInt(context.getContentResolver(), s1, i1);
            return;
        }
    }

    public static void a(Context context, String s1, Long long1)
    {
        if (context == null)
        {
            com.baidu.frontia.a.b.a.a.c("Utility", "putSPLong context == null");
            return;
        } else
        {
            android.provider.Settings.System.putLong(context.getContentResolver(), s1, long1.longValue());
            return;
        }
    }

    public static void a(Context context, boolean flag, boolean flag1)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder()).append(context.getPackageName()).append(":updateServiceInfo2  isForce =").append(flag).append("isSend = ").append(flag1).toString());
        }
        Object obj = context.getSharedPreferences("pst", 0);
        int i1 = e(context, context.getPackageName());
        if (((SharedPreferences) (obj)).getInt("pr_app_v", 0) < i1 || flag)
        {
            android.content.SharedPreferences.Editor editor = context.getSharedPreferences((new StringBuilder()).append(context.getPackageName()).append(".push_sync").toString(), 5).edit();
            if (c(context))
            {
                editor.putLong("priority2", 0L);
            } else
            {
                editor.putLong("priority2", m(context));
            }
            editor.putInt("version2", com.baidu.android.pushservice.a.a());
            editor.commit();
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putInt("pr_app_v", i1);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
        if (flag1)
        {
            n(context);
        }
    }

    public static void a(String s1, Context context)
    {
        com/baidu/android/pushservice/util/f;
        JVM INSTR monitorenter ;
        if (a.d <= 0) goto _L2; else goto _L1
_L1:
        b(s1, context);
_L4:
        com/baidu/android/pushservice/util/f;
        JVM INSTR monitorexit ;
        return;
_L2:
        context = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date());
        b.add((new StringBuilder("\n\r")).append(context).append(" ").append(s1).append("\n\r").toString());
        if (b.size() < 10) goto _L4; else goto _L3
_L3:
        new String();
        s1 = b.toString();
        Date date;
        Object obj;
        File file;
        obj = Environment.getExternalStorageDirectory().getAbsolutePath();
        file = new File(((String) (obj)), "baidu/pushservice/files");
        if (!file.exists())
        {
            file.mkdirs();
        }
        context = new SimpleDateFormat("yyyyMMdd");
        date = new Date();
        String s2 = context.format(date);
        obj = new File(((String) (obj)), (new StringBuilder("baidu/pushservice/files/msg")).append(s2).append(".log").toString());
        if (((File) (obj)).exists()) goto _L6; else goto _L5
_L5:
        File afile[];
        int j1;
        afile = file.listFiles();
        j1 = afile.length;
        int i1 = 0;
_L10:
        if (i1 >= j1) goto _L6; else goto _L7
_L7:
        File file1 = afile[i1];
        try
        {
            String s3 = file1.getName();
            if (s3.startsWith("msg") && s3.length() > 0 && (int)Math.abs((context.parse(s3.substring(3, 11)).getTime() - date.getTime()) / 0x5265c00L) >= 7)
            {
                file1.delete();
            }
            break MISSING_BLOCK_LABEL_349;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        finally
        {
            throw s1;
        }
          goto _L8
_L6:
        context = new FileWriter(((File) (obj)), true);
        context.write(s1);
        context.close();
_L9:
        b.clear();
          goto _L4
_L8:
        com.baidu.frontia.a.b.a.a.d("Utility", s1.getMessage());
          goto _L9
        i1++;
          goto _L10
    }

    private static void a(String s1, String s2)
    {
        int i1 = 0;
        com/baidu/android/pushservice/util/f;
        JVM INSTR monitorenter ;
        String s3;
        String s4 = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())).format(new Date());
        s3 = new String();
        if (s4.length() > 0)
        {
            s3 = s4.substring(0, 4).concat(s4.substring(5, 7)).concat(s4.substring(8, 10));
        }
        s2 = (new StringBuilder()).append(s4).append(" ").append(s2).append("\n\r").toString();
        String s5;
        File file;
        s5 = Environment.getExternalStorageDirectory().getAbsolutePath();
        file = new File(s5, "baidu/pushservice/files");
        if (file.exists()) goto _L2; else goto _L1
_L1:
        file.mkdirs();
_L4:
        s1 = new FileOutputStream(new File(s5, (new StringBuilder("baidu/pushservice/files/")).append(s1).append(s3).append(".log").toString()), true);
        s1.write(s2.getBytes());
        s1.close();
_L7:
        com/baidu/android/pushservice/util/f;
        JVM INSTR monitorexit ;
        return;
_L2:
        SimpleDateFormat simpledateformat;
        File afile[];
        int j1;
        simpledateformat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        afile = file.listFiles();
        j1 = afile.length;
_L6:
        if (i1 >= j1) goto _L4; else goto _L3
_L3:
        File file1 = afile[i1];
        if (file1.getName().startsWith(s1) && Integer.parseInt(s3) - Integer.parseInt(simpledateformat.format(Long.valueOf(file1.lastModified()))) >= 7)
        {
            file1.delete();
        }
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
          goto _L4
        s1;
        com.baidu.frontia.a.b.a.a.d("Utility", (new StringBuilder("error ")).append(s1.getMessage()).toString());
          goto _L7
        s1;
        throw s1;
          goto _L4
    }

    public static void a(HashMap hashmap)
    {
        try
        {
            Object obj = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), "baidu/hybrid");
            if (!((File) (obj)).exists())
            {
                ((File) (obj)).mkdirs();
            }
            obj = new FileOutputStream(new File(((File) (obj)), "notimap"));
            ObjectOutputStream objectoutputstream = new ObjectOutputStream(((java.io.OutputStream) (obj)));
            objectoutputstream.writeObject(hashmap);
            objectoutputstream.close();
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            return;
        }
    }

    public static boolean a()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    private static boolean a(int i1, int j1, int k1, int l1)
    {
_L2:
        do
        {
            return true;
        } while (i1 < i2 && i2 < k1 || i2 == i1 && j2 >= j1 || i2 == k1 && j2 <= l1);
_L4:
        return false;
        i2 = Calendar.getInstance(Locale.CHINA).get(11);
        j2 = Calendar.getInstance(Locale.CHINA).get(12);
        if (i1 < k1)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        if (i1 <= k1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i2 > i1 && i2 < 24 || i2 < k1 || i2 == i1 && j2 >= j1) goto _L2; else goto _L1
_L1:
        if (i2 != k1 || j2 > l1) goto _L4; else goto _L3
_L3:
        return true;
        if (i1 != i2 || j2 < j1 || l1 < j2) goto _L4; else goto _L5
_L5:
        return true;
    }

    public static boolean a(Context context)
    {
        File file = new File("/data/data/root");
        try
        {
            file.createNewFile();
            if (file.exists())
            {
                file.delete();
            }
        }
        catch (IOException ioexception)
        {
            if (a(context, "com.noshufou.android.su") == null && a(context, "com.miui.uac") == null)
            {
                return false;
            }
        }
        return true;
    }

    private static boolean a(Context context, String s1, String s2, boolean flag)
    {
label0:
        {
            s1 = new Intent(s1);
            s1.setPackage(context.getPackageName());
            Object obj = context.getPackageManager();
            if (flag)
            {
                context = ((PackageManager) (obj)).queryBroadcastReceivers(s1, 544);
                if (context.size() <= 0)
                {
                    return false;
                }
                context = context.iterator();
                do
                {
                    if (!context.hasNext())
                    {
                        break label0;
                    }
                } while (!s2.equals(((ResolveInfo)context.next()).activityInfo.name));
                return true;
            }
            s1 = ((PackageManager) (obj)).queryIntentServices(s1, 544);
            if (s1.size() <= 0)
            {
                return false;
            }
            s1 = s1.iterator();
            int i1;
            do
            {
                do
                {
                    if (!s1.hasNext())
                    {
                        break label0;
                    }
                    obj = (ResolveInfo)s1.next();
                } while (!s2.equals(((ResolveInfo) (obj)).serviceInfo.name));
                i1 = x(context, s2);
                if (!((ResolveInfo) (obj)).serviceInfo.exported)
                {
                    return false;
                }
            } while (i1 != 1 && (i1 != 0 || !((ResolveInfo) (obj)).serviceInfo.enabled));
            return true;
        }
        return false;
    }

    public static boolean a(String s1)
    {
        if (s1.isEmpty())
        {
            com.baidu.frontia.a.b.a.a.c("Utility", "api_key incorrect ");
            return false;
        }
        if (s1.contains(" "))
        {
            com.baidu.frontia.a.b.a.a.c("Utility", "api_key incorrect ");
            return false;
        } else
        {
            return true;
        }
    }

    static boolean a(String s1, String as[])
    {
        boolean flag1 = false;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i1 < as.length)
                {
                    if (!s1.equals(as[i1]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while (true);
    }

    public static Intent b(Context context, String s1)
    {
        g g1 = new g();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction(s1);
        s1 = context.registerReceiver(g1, intentfilter);
        context.unregisterReceiver(g1);
        return s1;
    }

    public static HashMap b()
    {
        Object obj = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), "baidu/hybrid");
        if (!((File) (obj)).exists())
        {
            return null;
        }
        obj = new File(((File) (obj)), "notimap");
        if (!((File) (obj)).exists())
        {
            return null;
        }
        FileInputStream fileinputstream;
        ObjectInputStream objectinputstream;
        try
        {
            fileinputstream = new FileInputStream(((File) (obj)));
            objectinputstream = new ObjectInputStream(fileinputstream);
            obj = (HashMap)objectinputstream.readObject();
        }
        catch (Exception exception)
        {
            return null;
        }
        try
        {
            objectinputstream.close();
            fileinputstream.close();
        }
        catch (Exception exception1)
        {
            return ((HashMap) (obj));
        }
        return ((HashMap) (obj));
    }

    public static void b(String s1)
    {
        com/baidu/android/pushservice/util/f;
        JVM INSTR monitorenter ;
        a(s1, ((Context) (null)));
        com/baidu/android/pushservice/util/f;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    private static void b(String s1, Context context)
    {
        com/baidu/android/pushservice/util/f;
        JVM INSTR monitorenter ;
        if (context == null) goto _L2; else goto _L1
_L1:
        String s2;
        Object obj;
        obj = (TelephonyManager)context.getSystemService("phone");
        s2 = ((TelephonyManager) (obj)).getDeviceId();
        if (TextUtils.isEmpty(s2))
        {
            s2 = "NULL";
        }
        String s3;
        StringBuffer stringbuffer;
        int i1;
        obj = (new StringBuilder()).append("samonitor").append(((TelephonyManager) (obj)).getDeviceId()).toString();
        s3 = y(context);
        i1 = z(context);
        Object obj1 = F(context);
        stringbuffer = new StringBuffer();
        String s4;
        for (obj1 = ((ArrayList) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); stringbuffer.append((new StringBuilder()).append(s4).append(";").toString()))
        {
            s4 = (String)((Iterator) (obj1)).next();
        }

        break MISSING_BLOCK_LABEL_150;
        s1;
        throw s1;
        context = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses().iterator();
_L6:
        if (!context.hasNext()) goto _L4; else goto _L3
_L3:
        if (!((android.app.ActivityManager.RunningAppProcessInfo)context.next()).processName.startsWith("com.sina.weibo")) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L8:
        a(((String) (obj)), (new StringBuilder("#IMEI:")).append(s2).append("#networkType:").append(s3).append("#mobileType:").append(i1).append("#AllPackagesUsingPush:").append(stringbuffer.toString()).append("#isSinaWeiBoRunnning:").append(flag).append("#").append(s1).toString());
_L2:
        com/baidu/android/pushservice/util/f;
        JVM INSTR monitorexit ;
        return;
_L4:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static boolean b(Context context, String s1, String s2)
    {
        boolean flag1 = false;
        boolean flag;
        try
        {
            context = context.getPackageManager().getApplicationInfo(s1, 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.baidu.frontia.a.b.a.a.a("getMetaDataBoolean", (new StringBuilder("--- ")).append(s1).append(" GetMetaData Exception:\r\n").toString(), context);
            context = null;
        }
        flag = flag1;
        if (context != null)
        {
            flag = flag1;
            if (((ApplicationInfo) (context)).metaData != null)
            {
                flag = ((ApplicationInfo) (context)).metaData.getBoolean(s2);
            }
        }
        return flag;
    }

    public static int[] b(Context context)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        return (new int[] {
            displaymetrics.heightPixels, displaymetrics.widthPixels
        });
    }

    public static String c(String s1)
    {
        if (!TextUtils.isDigitsOnly(s1))
        {
            return "0";
        }
        s1 = new BigInteger(s1);
        if (!s1.and(new BigInteger("0800000000000000", 16)).equals(BigInteger.ZERO))
        {
            System.out.println("encode =  1");
            s1 = s1.xor(new BigInteger("22727017042830095"));
            s1 = s1.and(new BigInteger("000000ff00000000", 16)).shiftLeft(16).add(s1.and(new BigInteger("000000000000ffff", 16)).shiftLeft(32)).add(s1.and(new BigInteger("00ffff0000000000", 16)).shiftRight(24).and(new BigInteger("00000000ffff0000", 16))).add(s1.and(new BigInteger("00000000ffff0000", 16)).shiftRight(16)).add(s1.and(new BigInteger("ff00000000000000", 16)));
        } else
        {
            s1 = s1.xor(new BigInteger("282335"));
            s1 = s1.and(new BigInteger("00ff0000", 16)).shiftLeft(8).add(s1.and(new BigInteger("000000ff", 16)).shiftLeft(16)).add(s1.and(new BigInteger("ff000000", 16)).shiftRight(16).and(new BigInteger("0000ff00", 16))).add(s1.and(new BigInteger("0000ff00", 16)).shiftRight(8));
        }
        return s1.toString();
    }

    public static void c(Context context, String s1, String s2)
    {
        if (context == null)
        {
            com.baidu.frontia.a.b.a.a.c("Utility", "putSPString context == null");
            return;
        } else
        {
            android.provider.Settings.System.putString(context.getContentResolver(), s1, s2);
            return;
        }
    }

    public static boolean c(Context context)
    {
        String s1 = com.baidu.android.pushservice.a.c(context);
        boolean flag;
        if ("enabled".equals(s1))
        {
            flag = false;
        } else
        if ("disabled".equals(s1))
        {
            flag = true;
        } else
        {
            flag = b(context, context.getPackageName(), "DisableService");
        }
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.a("Utility", (new StringBuilder("--- isDisableService v: ")).append(s1).append(" r: ").append(flag).toString());
        }
        return flag;
    }

    public static boolean c(Context context, String s1)
    {
        boolean flag = false;
        int i1;
        try
        {
            i1 = context.getPackageManager().getApplicationInfo(s1, 0).flags;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.baidu.frontia.a.b.a.a.d("Utility", (new StringBuilder("error ")).append(context.getMessage()).toString());
            return false;
        }
        if ((i1 & 1) != 0)
        {
            flag = true;
        }
        return flag;
    }

    public static int d(String s1)
    {
        long l1;
        try
        {
            l1 = Long.parseLong(s1);
        }
        catch (Exception exception)
        {
            String s2 = s1;
            long l2;
            try
            {
                if (s1.length() > 0)
                {
                    s2 = s1.substring(1);
                }
                l2 = Long.parseLong(s2);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.baidu.frontia.a.b.a.a.c("Utility", (new StringBuilder("exception ")).append(s1.getMessage()).toString());
                return 0;
            }
            return (int)l2;
        }
        return (int)l1;
    }

    public static Intent d(Context context)
    {
        Intent intent = new Intent("com.baidu.android.pushservice.action.METHOD");
        intent.addFlags(32);
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        intent.putExtra("pkg_name", context.getPackageName());
        intent.putExtra("method_version", "V2");
        return intent;
    }

    public static String d(Context context, String s1, String s2)
    {
        context = com.baidu.frontia.a.e.c.a(context);
        if (!TextUtils.isEmpty(context) && !TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) goto _L2; else goto _L1
_L1:
        context = "";
_L4:
        return context;
_L2:
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(context).append("#");
        stringbuilder.append(s2).append("#");
        stringbuilder.append(s1);
        context = stringbuilder.toString();
        if (!TextUtils.isEmpty(context))
        {
            context = new String(Base64Encoder.a(context.getBytes()));
        }
        try
        {
            s1 = URLEncoder.encode(context, "utf-8");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.baidu.frontia.a.b.a.a.d("Utility", (new StringBuilder("error ")).append(context.getMessage()).toString());
            return "";
        }
        context = s1;
        if (!com.baidu.android.pushservice.a.b()) goto _L4; else goto _L3
_L3:
        com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder("+++++++++++++++++++++ push token is ")).append(s1).toString());
        return s1;
    }

    public static boolean d(Context context, String s1)
    {
        if (context == null || TextUtils.isEmpty(s1))
        {
            return false;
        }
        try
        {
            context.getPackageManager().getApplicationInfo(s1, 8192);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    public static int e(Context context, String s1)
    {
        context = a(context, s1);
        if (context != null)
        {
            return ((PackageInfo) (context)).versionCode;
        } else
        {
            return 0;
        }
    }

    public static Intent e(Context context)
    {
        context = new Intent("com.baidu.android.pushservice.action.METHOD");
        context.addFlags(32);
        context.putExtra("method_version", "V2");
        return context;
    }

    public static String e(Context context, String s1, String s2)
    {
        if (!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2))
        {
            s2 = new Intent(s2);
            s2.setPackage(s1);
            context = context.getPackageManager().queryBroadcastReceivers(s2, 544);
            if (context != null && context.size() > 0)
            {
                return ((ResolveInfo)context.get(0)).activityInfo.name;
            }
        }
        return null;
    }

    public static Intent f(Context context)
    {
        Intent intent = new Intent("com.baidu.android.pushservice.action.METHOD");
        intent.addFlags(32);
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        intent.putExtra("method_version", "V2");
        return intent;
    }

    public static void f(Context context, String s1, String s2)
    {
        if (context == null || TextUtils.isEmpty(s2))
        {
            return;
        }
        Object obj = s1;
        if (TextUtils.isEmpty(s1))
        {
            PackageManager packagemanager = context.getPackageManager();
            obj = packagemanager.getInstalledPackages(0).iterator();
            String s3;
            do
            {
                s3 = s1;
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                s3 = ((PackageInfo)((Iterator) (obj)).next()).applicationInfo.name;
            } while (TextUtils.isEmpty(s3) || !s3.startsWith("com.baidu.searchbox") && !s3.equals("com.baidu.browser.apps"));
            obj = s3;
            if (TextUtils.isEmpty(s3))
            {
                s1 = packagemanager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.baidu.com")), 0);
                obj = s3;
                if (((ResolveInfo) (s1)).resolvePackageName != null)
                {
                    obj = ((ResolveInfo) (s1)).resolvePackageName;
                }
            }
        }
        s1 = new Intent();
        s1.setAction("android.intent.action.VIEW");
        s1.setData(Uri.parse(s2));
        s1.setPackage(((String) (obj)));
        s1.setFlags(0x10000000);
        context.startActivity(s1);
    }

    public static boolean f(Context context, String s1)
    {
        boolean flag1 = false;
        boolean flag;
        try
        {
            context = context.getPackageManager().getApplicationInfo(s1, 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.baidu.frontia.a.b.a.a.a("isBaiduApp", (new StringBuilder("--- ")).append(s1).append(" GetMetaData Exception:\r\n").toString(), context);
            context = null;
        }
        flag = flag1;
        if (context != null)
        {
            flag = flag1;
            if (((ApplicationInfo) (context)).metaData != null)
            {
                flag = ((ApplicationInfo) (context)).metaData.getBoolean("IsBaiduApp");
            }
        }
        return flag;
    }

    public static Intent g(Context context)
    {
        return d(context);
    }

    public static void g(Context context, String s1)
    {
        Intent intent = PushConstants.createMethodIntent(context);
        intent.putExtra("method", "pushservice_restart");
        intent.setPackage(s1);
        context.sendBroadcast(intent);
        intent = PushConstants.createMethodIntent(context);
        intent.putExtra("method", "pushservice_restart_v2");
        if (!TextUtils.isEmpty(s1) && s1.equals(A(context)))
        {
            intent.putExtra("priority2", 0x7fffffffffffffffL);
        } else
        {
            intent.putExtra("priority2", o(context));
        }
        if (s1 != null)
        {
            intent.setPackage(s1);
        }
        context.sendBroadcast(intent);
        com.baidu.android.pushservice.a.a(context, false);
    }

    public static void h(Context context)
    {
        a(context, false, false);
    }

    public static void h(Context context, String s1)
    {
        Intent intent = new Intent("com.baidu.android.pushservice.action.PUSH_SERVICE");
        intent.putExtra("priority2", o(context));
        if (!TextUtils.isEmpty(s1))
        {
            intent.setClassName(s1, "com.baidu.android.pushservice.PushService");
        }
        intent.putExtra("method", "pushservice_restart_v2");
        intent.putExtra("pkg_name", context.getPackageName());
        context.startService(intent);
_L1:
        return;
        context;
        com.baidu.frontia.a.b.a.a.d("Utility", (new StringBuilder("error ")).append(context.getMessage()).toString());
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.a("Utility", "startService by action fail");
            return;
        }
          goto _L1
    }

    public static long i(Context context, String s1)
    {
        long l2 = 0L;
        context = context.createPackageContext(s1, 2).getSharedPreferences((new StringBuilder()).append(s1).append(".push_sync").toString(), 5);
        long l1 = l2;
        if (context != null)
        {
            try
            {
                l1 = context.getLong("priority2", 0L);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                l1 = l2;
                if (com.baidu.android.pushservice.a.b())
                {
                    com.baidu.frontia.a.b.a.a.c("Utility", (new StringBuilder("create packagecontext exception: ")).append(context.getMessage()).toString());
                    return 0L;
                }
            }
        }
        return l1;
    }

    static boolean i(Context context)
    {
        int i1;
        PackageManager packagemanager = context.getPackageManager();
        try
        {
            context = packagemanager.getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.baidu.frontia.a.b.a.a.d("Utility", (new StringBuilder("error ")).append(context.getMessage()).toString());
            return false;
        }
        if (context != null) goto _L2; else goto _L1
_L1:
        com.baidu.frontia.a.b.a.a.d("Utility", "Permissions Push-SDK need are not exist !");
        return false;
_L4:
        if (i1 >= a.length)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        if (a(a[i1], context))
        {
            break MISSING_BLOCK_LABEL_113;
        }
        com.baidu.frontia.a.b.a.a.d("Utility", (new StringBuilder()).append(a[i1]).append(" permission Push-SDK need is not exist !").toString());
        return false;
        i1++;
        continue; /* Loop/switch isn't completed */
        return true;
_L2:
        i1 = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void j(Context context)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("Utility", ">>> setAlarmForPeriodRestart");
        }
        a(context, 0x493e0L);
    }

    public static boolean j(Context context, String s1)
    {
        Object obj;
        int i1;
        boolean flag2;
        flag2 = false;
        obj = new Intent("com.baidu.android.pushservice.action.PUSH_SERVICE");
        ((Intent) (obj)).setPackage(s1);
        context = context.getPackageManager();
        obj = context.queryIntentServices(((Intent) (obj)), 544);
        i1 = 0;
_L3:
        if (i1 >= ((List) (obj)).size())
        {
            break MISSING_BLOCK_LABEL_156;
        }
        if (!"com.baidu.android.pushservice.PushService".equals(((ResolveInfo)((List) (obj)).get(i1)).serviceInfo.name) || !((ResolveInfo)((List) (obj)).get(i1)).serviceInfo.exported) goto _L2; else goto _L1
_L1:
        boolean flag = ((ResolveInfo)((List) (obj)).get(i1)).serviceInfo.enabled;
_L4:
        boolean flag1;
label0:
        {
            i1 = context.getComponentEnabledSetting(new ComponentName(s1, "com.baidu.android.pushservice.PushService"));
            if (i1 != 1)
            {
                flag1 = flag2;
                if (i1 != 0)
                {
                    break label0;
                }
                flag1 = flag2;
                if (!flag)
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        return flag1;
_L2:
        i1++;
          goto _L3
        flag = false;
          goto _L4
    }

    public static void k(Context context)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.a("Utility", (new StringBuilder("--- Start Service from ")).append(context.getPackageName()).toString());
        }
        if (com.baidu.android.pushservice.a.b(context))
        {
            if (com.baidu.android.pushservice.a.b())
            {
                com.baidu.frontia.a.b.a.a.a("Utility", "--- Restart Highest Push Service!!");
            }
            String s1 = android.provider.Settings.System.getString(context.getContentResolver(), "com.baidu.push.cur_pkg");
            if (!TextUtils.isEmpty(s1))
            {
                w(context, s1);
            }
            String s3 = context.getApplicationContext().getPackageName();
            if (!TextUtils.isEmpty(s3))
            {
                if (!s3.equalsIgnoreCase(s1))
                {
                    w(context, s3);
                } else
                {
                    Iterator iterator = x(context).iterator();
                    while (iterator.hasNext()) 
                    {
                        g(context, (String)iterator.next());
                    }
                }
            }
            com.baidu.android.pushservice.a.a(context, false);
            return;
        } else
        {
            String s2 = context.getPackageName();
            Intent intent = d(context);
            intent.setPackage(s2);
            context.sendBroadcast(intent);
            l(context);
            return;
        }
    }

    public static boolean k(Context context, String s1)
    {
        s1 = new Intent("com.baidu.android.pushservice.action.notification.CLICK");
        s1.setPackage(context.getPackageName());
        PackageManager packagemanager = context.getPackageManager();
        s1 = packagemanager.queryBroadcastReceivers(s1, 544);
        if (s1.size() > 0)
        {
            s1 = s1.iterator();
            boolean flag;
            if (s1.hasNext())
            {
                ResolveInfo resolveinfo = (ResolveInfo)s1.next();
                s1 = resolveinfo.activityInfo.name;
                flag = resolveinfo.activityInfo.enabled;
            } else
            {
                s1 = null;
                flag = false;
            }
            if (a(context, "com.baidu.android.pushservice.action.MESSAGE", s1, true) && a(context, "com.baidu.android.pushservice.action.RECEIVE", s1, true))
            {
                int i1 = packagemanager.getComponentEnabledSetting(new ComponentName(context.getPackageName(), s1));
                if (i1 == 1 || i1 == 0 && flag)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void l(Context context)
    {
        String s1 = A(context);
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.a("Utility", (new StringBuilder("--- Start the Highest priority Service: ")).append(s1).toString());
        }
        h(context, s1);
    }

    public static boolean l(Context context, String s1)
    {
        String s2;
        PackageManager packagemanager;
        if (context.getSharedPreferences((new StringBuilder()).append(context.getPackageName()).append(".push_sync").toString(), 5).getInt("version2", 0) < 29)
        {
            return true;
        }
        s1 = new ComponentName(context, "com.baidu.android.pushservice.CommandService");
        packagemanager = context.getPackageManager();
        context = new ServiceInfo();
        s2 = "";
        s1 = packagemanager.getServiceInfo(s1, 128);
        context = s1;
        s1 = ((ServiceInfo) (context)).name;
_L2:
        if (s1.isEmpty())
        {
            com.baidu.frontia.a.b.a.a.c("Utility", "com.baidu.android.pushservice.CommandService did not declared ");
            return false;
        }
        break; /* Loop/switch isn't completed */
        s1;
_L3:
        com.baidu.frontia.a.b.a.a.d("Utility", (new StringBuilder("error ")).append(s1.getMessage()).toString());
        s1 = s2;
        if (true) goto _L2; else goto _L1
_L1:
        if (!((ServiceInfo) (context)).enabled && !((ServiceInfo) (context)).exported)
        {
            com.baidu.frontia.a.b.a.a.c("Utility", "com.baidu.android.pushservice.CommandService did not declared ");
            return false;
        } else
        {
            return true;
        }
        s1;
          goto _L3
    }

    public static long m(Context context)
    {
        long l1 = com.baidu.android.pushservice.a.a();
        if (a.d <= 5 && a.d > 0)
        {
            return (l1 << 4) + 10L + (long)a.d;
        }
        long l2 = l1 << 1;
        l1 = l2;
        if (f(context, context.getPackageName()))
        {
            if (com.baidu.android.pushservice.a.b())
            {
                com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder("--- get ")).append(context).append(" PriorityVersion, baidu app").toString());
            }
            l1 = l2 + 1L;
        }
        l2 = l1 << 1;
        l1 = l2;
        if (c(context, context.getPackageName()))
        {
            if (com.baidu.android.pushservice.a.b())
            {
                com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder("--- get ")).append(context).append(" PriorityVersion, system app").toString());
            }
            l1 = l2 + 1L;
        }
        return (l1 << 2) + (long)s(context);
    }

    public static boolean m(Context context, String s1)
    {
        if (PushSocket.a()) goto _L2; else goto _L1
_L1:
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.c("Utility", "socket library checkfailed");
        }
_L4:
        return false;
_L2:
        if (r(context))
        {
            break; /* Loop/switch isn't completed */
        }
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.c("Utility", "checkSDKAndroidManifest checkfailed");
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (a(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.c("Utility", "checkApikey checkfailed");
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (p(context))
        {
            break; /* Loop/switch isn't completed */
        }
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.c("Utility", "checkSelfConfigedReciver checkfailed");
            return false;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (!q(context))
        {
            if (com.baidu.android.pushservice.a.b())
            {
                com.baidu.frontia.a.b.a.a.c("Utility", "checkCommandServiceEnable checkfailed");
                return false;
            }
        } else
        {
            return true;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public static int n(Context context, String s1)
    {
        Object obj = null;
        try
        {
            context = context.createPackageContext(s1, 2).getSharedPreferences((new StringBuilder()).append(s1).append(".push_sync").toString(), 5);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.baidu.frontia.a.b.a.a.d("Utility", context.getMessage());
            context = obj;
        }
        if (context == null)
        {
            com.baidu.frontia.a.b.a.a.c("Utility", (new StringBuilder("App:")).append(s1).append(" doesn't init Version!").toString());
            return 0;
        }
        int i1 = context.getInt("version2", 0);
        if (i1 > 0)
        {
            return i1;
        } else
        {
            return context.getInt("version", 0);
        }
    }

    public static void n(Context context)
    {
        String s1 = B(context);
        String s2 = A(context);
        if (!s2.equals(s1))
        {
            Intent intent = d(context);
            intent.putExtra("method", "pushservice_restart_v2");
            intent.putExtra("pkg_name", context.getPackageName());
            intent.putExtra("priority2", i(context, s1));
            if (com.baidu.android.pushservice.a.b())
            {
                com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder(" restart  ")).append(s2).append("pushservice_restart_v2").toString());
            }
            intent.setClassName(s2, "com.baidu.android.pushservice.PushService");
            context.startService(intent);
        }
        Iterator iterator = ((ActivityManager)context.getSystemService("activity")).getRunningServices(1000).iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            android.app.ActivityManager.RunningServiceInfo runningserviceinfo = (android.app.ActivityManager.RunningServiceInfo)iterator.next();
            String s3 = runningserviceinfo.service.getPackageName();
            if (runningserviceinfo.service.getClassName().equals("com.baidu.android.pushservice.PushService"))
            {
                if (s1.equals(s3))
                {
                    flag = true;
                } else
                {
                    Intent intent2 = d(context);
                    intent2.putExtra("method", "pushservice_restart_v2");
                    intent2.putExtra("pkg_name", context.getPackageName());
                    intent2.putExtra("priority2", i(context, s1));
                    if (com.baidu.android.pushservice.a.b())
                    {
                        com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder(" restart  ")).append(s3).append("pushservice_restart_v2").toString());
                    }
                    intent2.setClassName(s3, "com.baidu.android.pushservice.PushService");
                    context.startService(intent2);
                }
            }
        } while (true);
        if (!flag)
        {
            Intent intent1 = d(context);
            intent1.putExtra("method", "pushservice_restart_v2");
            intent1.putExtra("pkg_name", context.getPackageName());
            intent1.putExtra("priority2", o(context));
            if (com.baidu.android.pushservice.a.b())
            {
                com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder(" restart  ")).append(s2).append("pushservice_restart_v2").toString());
            }
            intent1.setClassName(s1, "com.baidu.android.pushservice.PushService");
            context.startService(intent1);
        }
    }

    public static long o(Context context)
    {
        return context.getSharedPreferences((new StringBuilder()).append(context.getPackageName()).append(".push_sync").toString(), 5).getLong("priority2", 0L);
    }

    public static String o(Context context, String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return "";
        } else
        {
            return a(context, s1, "BaiduPush_CHANNEL");
        }
    }

    static boolean p(Context context)
    {
        return k(context, context.getPackageName());
    }

    public static boolean p(Context context, String s1)
    {
        boolean flag = false;
        if (!TextUtils.isEmpty(s1))
        {
            context = context.getPackageManager().getInstalledPackages(0);
            ArrayList arraylist = new ArrayList();
            if (context != null)
            {
                for (int i1 = 0; i1 < context.size(); i1++)
                {
                    arraylist.add(((PackageInfo)context.get(i1)).packageName);
                }

            }
            flag = arraylist.contains(s1);
        }
        return flag;
    }

    public static String q(Context context, String s1)
    {
        if (context == null)
        {
            com.baidu.frontia.a.b.a.a.c("Utility", "getSPString context == null");
            return "";
        } else
        {
            return android.provider.Settings.System.getString(context.getContentResolver(), s1);
        }
    }

    static boolean q(Context context)
    {
        return l(context, context.getPackageName());
    }

    public static Integer r(Context context, String s1)
    {
        if (context == null)
        {
            com.baidu.frontia.a.b.a.a.c("Utility", "getSPInt context == null");
            return Integer.valueOf(0x80000000);
        } else
        {
            return Integer.valueOf(android.provider.Settings.System.getInt(context.getContentResolver(), s1));
        }
    }

    public static boolean r(Context context)
    {
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("Utility", "check PushService AndroidManifest declearation !");
        }
        while (!i(context) || !D(context) || !E(context)) 
        {
            return false;
        }
        return true;
    }

    static int s(Context context)
    {
        int j1 = 0;
        if (a(context, "android.intent.action.USER_PRESENT", "com.baidu.android.pushservice.PushServiceReceiver", true))
        {
            j1 = 1;
        }
        int i1 = j1;
        if (a(context, "android.intent.action.MEDIA_MOUNTED", "com.baidu.android.pushservice.PushServiceReceiver", true))
        {
            i1 = j1 + 1;
        }
        j1 = i1;
        if (a(context, "android.intent.action.ACTION_POWER_CONNECTED", "com.baidu.android.pushservice.PushServiceReceiver", true))
        {
            j1 = i1 + 1;
        }
        i1 = j1;
        if (a(context, "android.intent.action.ACTION_POWER_DISCONNECTED", "com.baidu.android.pushservice.PushServiceReceiver", true))
        {
            i1 = j1 + 1;
        }
        return i1;
    }

    public static boolean s(Context context, String s1)
    {
        boolean flag2 = false;
        boolean flag = false;
        if (context == null || TextUtils.isEmpty(s1))
        {
            flag2 = flag;
            if (com.baidu.android.pushservice.a.b())
            {
                com.baidu.frontia.a.b.a.a.b("Utility", "isNoDisturb parameters illegal : false");
                flag2 = flag;
            }
        } else
        {
            context = PushDatabase.getNoDisturb(context, s1);
            boolean flag1 = flag2;
            if (context != null)
            {
                flag1 = flag2;
                if (4 == context.length)
                {
                    flag1 = a(context[0], context[1], context[2], context[3]);
                }
            }
            flag2 = flag1;
            if (com.baidu.android.pushservice.a.b())
            {
                com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder("isNoDisturb :")).append(flag1).toString());
                return flag1;
            }
        }
        return flag2;
    }

    public static String t(Context context, String s1)
    {
        context = com.baidu.frontia.a.e.e.a(context.getPackageManager().getPackageInfo(s1, 64).signatures[0].toByteArray(), false);
        return context;
        context;
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.c("Utility", (new StringBuilder(" packageName not found: ")).append(s1).toString());
        }
_L2:
        return null;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static List t(Context context)
    {
        new ArrayList();
        Intent intent = new Intent("com.baidu.android.pushservice.action.BIND_SYNC");
        return context.getPackageManager().queryBroadcastReceivers(intent, 544);
    }

    private static void u(Context context, String s1)
    {
        Intent intent = d(context);
        intent.putExtra("type", "service_restart");
        intent.setPackage(s1);
        context.sendBroadcast(intent);
    }

    public static boolean u(Context context)
    {
        boolean flag = true;
        LocalServerSocket localserversocket = new LocalServerSocket(v(context));
        context = localserversocket;
_L2:
        if (context != null)
        {
            flag = false;
            Exception exception;
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                com.baidu.frontia.a.b.a.a.d("Utility", (new StringBuilder("error ")).append(context.getMessage()).toString());
                return false;
            }
        }
        return flag;
        exception;
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("Utility", (new StringBuilder("--- Socket Adress (")).append(v(context)).append(") in use --- @ ").append(context.getPackageName()).toString());
        }
        context = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String v(Context context)
    {
        context = com.baidu.frontia.a.e.d.a(context);
        return com.baidu.frontia.a.e.e.a((new StringBuilder("com.baidu.pushservice.singelinstancev2")).append(context).toString().getBytes(), false);
    }

    private static boolean v(Context context, String s1)
    {
        boolean flag1 = false;
        boolean flag;
        try
        {
            context = context.createPackageContext(s1, 2).getSharedPreferences((new StringBuilder()).append(s1).append(".push_sync").toString(), 5);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.baidu.frontia.a.b.a.a.d("Utility", context.getMessage());
            context = null;
        }
        flag = flag1;
        if (context != null)
        {
            flag = flag1;
            if (context.getInt("version", 0) > 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public static ArrayList w(Context context)
    {
        ArrayList arraylist = F(context);
        Object obj = ((ActivityManager)context.getSystemService("activity")).getRunningServices(1000);
        ArrayList arraylist1 = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            android.app.ActivityManager.RunningServiceInfo runningserviceinfo = (android.app.ActivityManager.RunningServiceInfo)((Iterator) (obj)).next();
            String s1 = runningserviceinfo.service.getPackageName();
            if (!arraylist1.contains(s1) && arraylist.contains(s1) && (runningserviceinfo.service.getClassName().contains("PushService") || runningserviceinfo.service.getClassName().contains("MoPlusService")) && v(context, s1))
            {
                arraylist1.add(runningserviceinfo.service.getPackageName());
            }
        } while (true);
        return arraylist1;
    }

    private static void w(Context context, String s1)
    {
        if (!v(context, s1))
        {
            Intent intent = d(context);
            intent.putExtra("method", "pushservice_restart_v2");
            intent.putExtra("pkg_name", context.getPackageName());
            intent.putExtra("priority2", o(context));
            intent.setPackage(s1);
            context.sendBroadcast(intent);
            h(context, s1);
            u(context, s1);
            return;
        } else
        {
            Intent intent1 = d(context);
            intent1.putExtra("method", "pushservice_restart");
            intent1.putExtra("pkg_name", context.getPackageName());
            intent1.setPackage(s1);
            context.sendBroadcast(intent1);
            u(context, s1);
            return;
        }
    }

    private static int x(Context context, String s1)
    {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context.getPackageName(), s1));
    }

    public static List x(Context context)
    {
        Object obj = ((ActivityManager)context.getSystemService("activity")).getRunningServices(500);
        context = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            android.app.ActivityManager.RunningServiceInfo runningserviceinfo = (android.app.ActivityManager.RunningServiceInfo)((Iterator) (obj)).next();
            if (runningserviceinfo.service.getClassName().contains("com.baidu.android.pushservice.PushService"))
            {
                context.add(runningserviceinfo.service.getPackageName());
            }
        } while (true);
        return context;
    }

    public static String y(Context context)
    {
        Object obj;
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        obj = context.getActiveNetworkInfo();
        if (obj == null || !((NetworkInfo) (obj)).isConnected() || ((NetworkInfo) (obj)).getState() != android.net.NetworkInfo.State.CONNECTED)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        if (!((NetworkInfo) (obj)).getTypeName().equals("WIFI")) goto _L2; else goto _L1
_L1:
        obj = ((NetworkInfo) (obj)).getTypeName();
_L4:
        return ((String) (obj));
_L2:
        context = null;
        if (((NetworkInfo) (obj)).getExtraInfo() != null)
        {
            context = ((NetworkInfo) (obj)).getExtraInfo().toLowerCase();
        }
        if (context == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = context;
        if (!context.isEmpty()) goto _L4; else goto _L3
_L3:
        return "unknown";
        return "unknown";
    }

    public static int z(Context context)
    {
_L2:
        String s1;
        if (context.equals("WF"))
        {
            return 1;
        }
        if (context.equals("2G"))
        {
            return 2;
        }
        if (context.equals("3G"))
        {
            return 3;
        }
        return !context.equals("4G") ? 0 : 4;
        if (context != null)
        {
            NetworkInfo networkinfo = ((ConnectivityManager)context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (networkinfo != null && networkinfo.isConnectedOrConnecting())
            {
                if (networkinfo.getTypeName().toLowerCase().equals("wifi"))
                {
                    context = "WF";
                    break MISSING_BLOCK_LABEL_52;
                } else
                {
                    s1 = "2G";
                    context = s1;
                    switch (networkinfo.getSubtype())
                    {
                    default:
                        context = s1;
                        break;

                    case 3: // '\003'
                        context = "3G";
                        break;

                    case 7: // '\007'
                        context = "3G";
                        break;

                    case 5: // '\005'
                        context = "3G";
                        break;

                    case 6: // '\006'
                        context = "3G";
                        break;

                    case 8: // '\b'
                        context = "3G";
                        break;

                    case 10: // '\n'
                        context = "3G";
                        break;

                    case 9: // '\t'
                        context = "3G";
                        break;

                    case 14: // '\016'
                        context = "3G";
                        break;

                    case 12: // '\f'
                        context = "3G";
                        break;

                    case 15: // '\017'
                        context = "3G";
                        break;

                    case 13: // '\r'
                        context = "4G";
                        break;

                    case 1: // '\001'
                    case 2: // '\002'
                    case 4: // '\004'
                    case 11: // '\013'
                        break;
                    }
                    continue; /* Loop/switch isn't completed */
                }
            }
        }
        context = "";
        if (true) goto _L2; else goto _L1
_L1:
    }

}
