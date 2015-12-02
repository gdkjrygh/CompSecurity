// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.text.TextUtils;
import com.baidu.android.pushservice.util.f;
import com.baidu.frontia.a.b.a.a;
import com.baidu.frontia.a.e.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.baidu.android.pushservice:
//            a

public class PushSettings
{

    private static Context a;

    public PushSettings()
    {
    }

    public static String a()
    {
        return com.baidu.android.pushservice.util.f.q(a, "com.baidu.pushservice.channel_id");
    }

    public static void a(int k)
    {
        com.baidu.android.pushservice.util.f.a(a, "com.baidu.pushservice.cur_period", k);
    }

    public static void a(long l)
    {
        if (a == null)
        {
            com.baidu.frontia.a.b.a.a.c("PushSettings", "setLastSendStatisticTime mContext == null");
            return;
        } else
        {
            com.baidu.android.pushservice.util.f.a(a, "com.baidu.pushservice.cst", Long.valueOf(l));
            return;
        }
    }

    public static void a(Context context)
    {
        a = context;
    }

    public static void a(Context context, String s)
    {
        if (context == null)
        {
            com.baidu.frontia.a.b.a.a.c("PushSettings", "removeUninstalledAppLbsSwitch mContext == null");
        } else
        if (!TextUtils.isEmpty(s))
        {
            String s1 = android.provider.Settings.System.getString(context.getContentResolver(), "com.baidu.pushservice.le");
            if (!TextUtils.isEmpty(s1))
            {
                StringBuilder stringbuilder = new StringBuilder();
                String as[] = s1.trim().split(",");
                int l = as.length;
                for (int k = 0; k < l; k++)
                {
                    String s2 = as[k];
                    if (!s2.equals(s))
                    {
                        stringbuilder.append((new StringBuilder()).append(s2).append(",").toString());
                    }
                }

                com.baidu.android.pushservice.util.f.c(context, "com.baidu.pushservice.le", stringbuilder.toString());
                return;
            }
        }
    }

    public static void a(Context context, boolean flag)
    {
        boolean flag1 = false;
        if (context == null)
        {
            com.baidu.frontia.a.b.a.a.c("PushSettings", "setLbsEnabled mContext == null");
        } else
        {
            if (TextUtils.isEmpty(context.getPackageName()))
            {
                com.baidu.frontia.a.b.a.a.c("PushSettings", "mContext.getPackageName() == null");
                return;
            }
            String s = com.baidu.android.pushservice.util.f.q(context, "com.baidu.pushservice.le");
            if (!TextUtils.isEmpty(s))
            {
                StringBuilder stringbuilder = new StringBuilder();
                String as[] = s.trim().split(",");
                int l = as.length;
                for (int k = 0; k < l; k++)
                {
                    String s1 = as[k];
                    if (s1.equals(context.getPackageName()))
                    {
                        flag1 = true;
                        boolean flag2 = true;
                        if (!flag)
                        {
                            continue;
                        }
                        flag1 = flag2;
                    }
                    stringbuilder.append((new StringBuilder()).append(s1).append(",").toString());
                }

                if (!flag1)
                {
                    stringbuilder.append((new StringBuilder()).append(context.getPackageName()).append(",").toString());
                }
                com.baidu.android.pushservice.util.f.c(context, "com.baidu.pushservice.le", stringbuilder.toString());
                return;
            }
            if (flag)
            {
                com.baidu.android.pushservice.util.f.c(context, "com.baidu.pushservice.le", (new StringBuilder()).append(context.getPackageName()).append(",").toString());
                return;
            }
        }
    }

    public static void a(String s)
    {
        com.baidu.android.pushservice.util.f.c(a, "com.baidu.pushservice.channel_id", s);
    }

    public static void a(String s, int k, String s1)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com.baidu.frontia.a.b.a.a.d("PushSettings", "setApiInfo mContext == null");
_L4:
        return;
_L2:
        if (k != 9)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        try
        {
            s1 = j();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.baidu.frontia.a.b.a.a.b("PushSettings", "set appInfo exception");
            return;
        }
        if (s1 == null) goto _L4; else goto _L3
_L3:
        if (!s1.containsKey((new StringBuilder("com.baidu.pushservice")).append(s).toString())) goto _L4; else goto _L5
_L5:
        s1.remove((new StringBuilder("com.baidu.pushservice")).append(s).toString());
        a(((HashMap) (s1)));
        com.baidu.android.pushservice.util.f.c(a, (new StringBuilder("com.baidu.pushservice")).append(s).toString(), "");
        return;
        s1 = (new StringBuilder()).append(k).append(s1).toString();
        String s2;
        Object obj;
        try
        {
            s2 = com.baidu.frontia.a.e.b.a(com.baidu.frontia.a.e.a.a("2011121211143000", "9876543210123456", s1.getBytes()), "utf-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s2 = "";
            com.baidu.frontia.a.b.a.a.a("PushSettings", "setAppInfo exception");
        }
        if (TextUtils.isEmpty(s2)) goto _L4; else goto _L6
_L6:
        s1 = null;
        obj = j();
        s1 = ((String) (obj));
_L8:
        obj = s1;
        if (s1 == null)
        {
            obj = new HashMap();
        }
        if (!((HashMap) (obj)).containsKey((new StringBuilder("com.baidu.pushservice")).append(s).toString()))
        {
            ((HashMap) (obj)).put((new StringBuilder("com.baidu.pushservice")).append(s).toString(), s2);
            a(((HashMap) (obj)));
        }
        com.baidu.android.pushservice.util.f.c(a, (new StringBuilder("com.baidu.pushservice")).append(s).toString(), s2);
        return;
        Exception exception;
        exception;
        com.baidu.frontia.a.b.a.a.a("PushSettings", (new StringBuilder("set AppInfo exception")).append(exception.toString()).toString());
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void a(String s, String s1, String s2)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com.baidu.frontia.a.b.a.a.c("PushSettings", "setFrontiaUser mContext == null");
_L4:
        return;
_L2:
        Object obj = android.provider.Settings.System.getString(a.getContentResolver(), "com.baidu.pushservice.fu");
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_119;
        }
        obj = new JSONObject();
_L5:
        ((JSONObject) (obj)).put(s1, (new StringBuilder()).append(s).append(",").append(s2).toString());
        android.provider.Settings.System.putString(a.getContentResolver(), "com.baidu.pushservice.fu", ((JSONObject) (obj)).toString());
        return;
        s;
        if (!com.baidu.android.pushservice.a.b()) goto _L4; else goto _L3
_L3:
        com.baidu.frontia.a.b.a.a.d("PushSettings", (new StringBuilder("error ")).append(s.getMessage()).toString());
        return;
        obj = new JSONObject(((String) (obj)));
          goto _L5
    }

    private static void a(HashMap hashmap)
    {
        try
        {
            Object obj = Environment.getExternalStorageDirectory().getAbsolutePath();
            Object obj1 = new File(((String) (obj)), "baidu/pushservice/files");
            if (!((File) (obj1)).exists())
            {
                ((File) (obj1)).mkdirs();
            }
            obj = new FileOutputStream(new File(((String) (obj)), "baidu/pushservice/files/apps"));
            obj1 = new ObjectOutputStream(((java.io.OutputStream) (obj)));
            ((ObjectOutputStream) (obj1)).writeObject(hashmap);
            ((ObjectOutputStream) (obj1)).close();
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            com.baidu.frontia.a.b.a.a.a("PushSettings", "setAppInfo read file exception");
        }
    }

    public static String b()
    {
        return com.baidu.android.pushservice.util.f.q(a, "com.baidu.pushservice.channel_token_rsa");
    }

    public static String b(String s)
    {
        if (a == null)
        {
            com.baidu.frontia.a.b.a.a.d("PushSettings", "setApiInfo mContext == null");
            return "";
        }
        String s1 = com.baidu.android.pushservice.util.f.q(a, (new StringBuilder("com.baidu.pushservice")).append(s).toString());
        Object obj = s1;
        if (!TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_80;
        }
        try
        {
            obj = j();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        obj = (String)((HashMap) (obj)).get((new StringBuilder("com.baidu.pushservice")).append(s).toString());
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            try
            {
                s = new String(com.baidu.frontia.a.e.a.b("2011121211143000", "9876543210123456", com.baidu.frontia.a.e.b.a(((String) (obj)).getBytes())));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return "";
            }
            return s;
        } else
        {
            return "";
        }
        return "";
    }

    public static void b(int k)
    {
        if (a == null)
        {
            com.baidu.frontia.a.b.a.a.c("PushSettings", "setStatisticSendDisabled mContext == null");
            return;
        } else
        {
            android.provider.Settings.System.putInt(a.getContentResolver(), "com.baidu.pushservice.sd", k);
            return;
        }
    }

    public static void b(long l)
    {
        if (a == null)
        {
            com.baidu.frontia.a.b.a.a.c("PushSettings", "setLastSendStatisticTime mContext == null");
            return;
        } else
        {
            android.provider.Settings.System.putLong(a.getContentResolver(), "com.baidu.pushservice.st", l);
            return;
        }
    }

    public static boolean b(Context context)
    {
        int k;
        try
        {
            k = com.baidu.android.pushservice.util.f.r(context, "com.baidu.pushservice.PushSettings.connect_state").intValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.baidu.frontia.a.b.a.a.c("PushSettings", "com.baidu.pushservice.PushSettings.connect_state setting is not set.");
            return false;
        }
        return k == 1;
    }

    public static long c(Context context)
    {
        if (context == null)
        {
            com.baidu.frontia.a.b.a.a.d("PushSettings", "getLastSendStatisticTime mContext == null");
            return 0L;
        }
        long l;
        try
        {
            l = android.provider.Settings.System.getLong(context.getContentResolver(), "com.baidu.pushservice.cst");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.baidu.frontia.a.b.a.a.c("PushSettings", "Setting not found: com.baidu.pushservice.cst");
            return 0L;
        }
        return l;
    }

    public static void c(int k)
    {
        if (a == null)
        {
            com.baidu.frontia.a.b.a.a.c("PushSettings", "setCurPeriod mContext == null");
            return;
        } else
        {
            com.baidu.android.pushservice.util.f.a(a, "com.baidu.pushservice.lsi", k * 1000);
            return;
        }
    }

    public static void c(String s)
    {
        if (a == null)
        {
            com.baidu.frontia.a.b.a.a.d("PushSettings", "setChannelToken mContext == null");
            return;
        } else
        {
            com.baidu.android.pushservice.util.f.c(a, "com.baidu.pushservice.channel_token_rsa", s);
            return;
        }
    }

    public static boolean c()
    {
        if (a != null)
        {
            int k;
            try
            {
                k = com.baidu.android.pushservice.util.f.r(a, "com.baidu.android.pushservice.PushSettings.debug_mode").intValue();
            }
            catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception)
            {
                return false;
            }
            if (k == 1)
            {
                return true;
            }
        }
        return false;
    }

    public static int d()
    {
        if (a == null)
        {
            com.baidu.frontia.a.b.a.a.d("PushSettings", "getCurPeriod mContext == null");
            return 0;
        }
        int k;
        try
        {
            k = com.baidu.android.pushservice.util.f.r(a, "com.baidu.pushservice.cur_period").intValue();
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception)
        {
            return 0;
        }
        return k;
    }

    public static String d(String s)
    {
        if (a == null)
        {
            com.baidu.frontia.a.b.a.a.d("PushSettings", "getLbsSendInterval mContext == null");
            return "";
        }
        String s1 = android.provider.Settings.System.getString(a.getContentResolver(), "com.baidu.pushservice.fu");
        if (!TextUtils.isEmpty(s1))
        {
            try
            {
                s = (new JSONObject(s1)).getString(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                com.baidu.frontia.a.b.a.a.d("PushSettings", (new StringBuilder("error ")).append(s.getMessage()).toString());
                return "";
            }
            return s;
        } else
        {
            return "";
        }
    }

    public static void d(Context context)
    {
        if (context == null)
        {
            com.baidu.frontia.a.b.a.a.c("PushSettings", "tofms mContext == null");
        }
        com.baidu.android.pushservice.util.f.c(context, "com.baidu.pushservice.lms", "off");
    }

    public static long e()
    {
        return android.provider.Settings.System.getLong(a.getContentResolver(), "com.baidu.pushservice.st", 0x2932e00L);
    }

    public static void e(Context context)
    {
        if (context == null)
        {
            com.baidu.frontia.a.b.a.a.c("PushSettings", "toms mContext == null");
        }
        com.baidu.android.pushservice.util.f.c(context, "com.baidu.pushservice.lms", "");
    }

    public static void enableDebugMode(Context context, boolean flag)
    {
        if (flag)
        {
            com.baidu.android.pushservice.util.f.a(context, "com.baidu.android.pushservice.PushSettings.debug_mode", 1);
            return;
        } else
        {
            com.baidu.android.pushservice.util.f.a(context, "com.baidu.android.pushservice.PushSettings.debug_mode", 0);
            return;
        }
    }

    public static int f()
    {
        return android.provider.Settings.System.getInt(a.getContentResolver(), "com.baidu.pushservice.sd", 0);
    }

    public static void f(Context context)
    {
        if (context != null) goto _L2; else goto _L1
_L1:
        com.baidu.frontia.a.b.a.a.c("PushSettings", "refreshLbsSwitchInfo mContext == null");
_L4:
        return;
_L2:
        Object obj = com.baidu.android.pushservice.util.f.q(context, "com.baidu.pushservice.le");
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L4; else goto _L3
_L3:
        StringBuilder stringbuilder;
        String as[];
        PackageManager packagemanager;
        int k;
        int l;
        stringbuilder = new StringBuilder();
        as = ((String) (obj)).trim().split(",");
        packagemanager = context.getPackageManager();
        l = as.length;
        k = 0;
_L6:
        String s;
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        s = as[k];
        obj = null;
        android.content.pm.PackageInfo packageinfo = packagemanager.getPackageInfo(s, 0);
        obj = packageinfo;
_L7:
        if (obj != null)
        {
            stringbuilder.append((new StringBuilder()).append(s).append(",").toString());
        }
        k++;
        if (true) goto _L6; else goto _L5
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        com.baidu.frontia.a.b.a.a.c("PushSettings", com.baidu.frontia.a.b.a.a.a(namenotfoundexception));
          goto _L7
_L5:
        com.baidu.android.pushservice.util.f.c(context, "com.baidu.pushservice.le", stringbuilder.toString());
        return;
    }

    public static int g()
    {
        if (a == null)
        {
            com.baidu.frontia.a.b.a.a.d("PushSettings", "getLbsSendInterval mContext == null");
            return 0;
        } else
        {
            return android.provider.Settings.System.getInt(a.getContentResolver(), "com.baidu.pushservice.lsi", 0x1b7740);
        }
    }

    public static boolean h()
    {
        return !TextUtils.isEmpty(com.baidu.android.pushservice.util.f.q(a, "com.baidu.pushservice.le"));
    }

    public static boolean i()
    {
        return TextUtils.equals(com.baidu.android.pushservice.util.f.q(a, "com.baidu.pushservice.lms"), "off");
    }

    private static HashMap j()
    {
        Object obj = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), "baidu/pushservice/files");
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).mkdirs();
        }
        obj = new File(((File) (obj)), "apps");
        if (!((File) (obj)).exists())
        {
            return null;
        } else
        {
            obj = new FileInputStream(((File) (obj)));
            ObjectInputStream objectinputstream = new ObjectInputStream(((java.io.InputStream) (obj)));
            new HashMap();
            HashMap hashmap = (HashMap)objectinputstream.readObject();
            objectinputstream.close();
            ((FileInputStream) (obj)).close();
            return hashmap;
        }
    }
}
