// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.bi;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.g.b;
import com.qihoo.security.service.d;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.o;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.appbox.bi:
//            b, d

public class a
{

    private static final String a = com/qihoo/security/appbox/bi/a.getSimpleName();
    private static final Uri b;
    private static String c = null;
    private static boolean d = false;
    private static ArrayList e = null;
    private static int f = 180;

    public a()
    {
    }

    public static void a()
    {
        long l = SharedPref.b(SecurityApplication.a(), "last_appbox_report_time", 0L);
        long l1 = System.currentTimeMillis();
        if (l1 - l >= 0x2932e00L || l1 < l)
        {
            b();
        }
    }

    public static void a(Context context)
    {
        try
        {
            context.getContentResolver().delete(b, null, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void a(String s)
    {
        ContentResolver contentresolver = SecurityApplication.a().getContentResolver();
        Cursor cursor = contentresolver.query(b, b.a.a, "pn =? and tp = 1", new String[] {
            s
        }, "_id DESC");
        boolean flag;
        if (cursor != null)
        {
            if (cursor.getCount() > 0)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            Utils.closeCursor(cursor);
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            if ((s = (new com.qihoo.security.appbox.bi.d(false, s, System.currentTimeMillis())).a()) != null)
            {
                try
                {
                    contentresolver.insert(b, s);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return;
                }
            }
        }
    }

    public static void a(String s, int i)
    {
        ContentResolver contentresolver;
        s = (new com.qihoo.security.appbox.bi.d(true, s, System.currentTimeMillis(), i)).a();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        contentresolver = SecurityApplication.a().getContentResolver();
        contentresolver.insert(b, s);
        return;
        s;
    }

    static boolean a(boolean flag)
    {
        d = flag;
        return flag;
    }

    public static void b()
    {
        Context context;
        if (!d)
        {
            if ((context = SecurityApplication.a()) != null && SharedPref.b(context, "reg", false) && SharedPref.b(context, "user_ex", true) && b(context))
            {
                d = true;
                long l = System.currentTimeMillis();
                Object obj = d(context);
                if (obj == null)
                {
                    d = false;
                    return;
                }
                obj = new b(context, c, ((String) (obj)).getBytes());
                if (!o.a().equals(context.getPackageName()))
                {
                    com.qihoo.security.service.d.a(a, Integer.valueOf(obj.hashCode()));
                }
                ((b) (obj)).a(new com.qihoo.security.g.b.a(context, ((b) (obj)), l) {

                    final Context a;
                    final b b;
                    final long c;

                    public void a()
                    {
                    }

                    public void a(int i)
                    {
                        a.a(false);
                        String s = o.a();
                        if (s != null && !s.equals(a.getPackageName()))
                        {
                            com.qihoo.security.service.d.b(a.c(), Integer.valueOf(b.hashCode()));
                        }
                        if (i == 0)
                        {
                            SharedPref.a(a, "last_appbox_report_time", System.currentTimeMillis());
                            a.a(a);
                        }
                    }

            
            {
                a = context;
                b = b1;
                c = l;
                super();
            }
                });
                ((b) (obj)).a();
                return;
            }
        }
    }

    private static boolean b(Context context)
    {
        if (TextUtils.isEmpty(c))
        {
            Object obj = new com.qihoo.security.d.a(context);
            context = ((com.qihoo.security.d.a) (obj)).a("appboxstat", "host");
            obj = ((com.qihoo.security.d.a) (obj)).a("appboxstat", "pam1");
            if (TextUtils.isEmpty(context) || TextUtils.isEmpty(((CharSequence) (obj))))
            {
                return false;
            }
            c = (new StringBuilder()).append("http://").append(context).append("/").append(((String) (obj))).append("?ver=").append("1.0.8.3742").append("&uiver=").append(400).toString();
        }
        return true;
    }

    static String c()
    {
        return a;
    }

    private static String c(Context context)
    {
        Object obj1 = null;
        Object obj = new JSONArray();
        context = context.getContentResolver().query(b.buildUpon().appendQueryParameter("limit", "1199").build(), b.a.a, null, null, "_id DESC");
        if (context == null) goto _L2; else goto _L1
_L1:
        for (; context.moveToNext(); ((JSONArray) (obj)).put(obj1))
        {
            obj1 = new JSONObject();
            ((JSONObject) (obj1)).put("mType", context.getInt(0));
            ((JSONObject) (obj1)).put("mPackName", context.getString(1));
            ((JSONObject) (obj1)).put("mTimeStamp", context.getLong(2));
            ((JSONObject) (obj1)).put("mLine", context.getInt(3));
        }

          goto _L2
        obj1;
        obj1 = obj;
        obj = context;
        context = ((Context) (obj1));
_L8:
        Utils.closeCursor(((Cursor) (obj)));
        obj = context;
_L3:
        Error error;
        if (obj != null && ((JSONArray) (obj)).length() > 0)
        {
            return ((JSONArray) (obj)).toString();
        } else
        {
            return null;
        }
_L2:
        Utils.closeCursor(context);
          goto _L3
        context;
        obj = null;
        context = null;
_L6:
        Utils.closeCursor(context);
          goto _L3
        obj;
        context = ((Context) (obj1));
_L5:
        Utils.closeCursor(context);
        throw obj;
        obj;
        if (true) goto _L5; else goto _L4
_L4:
        context;
        context = null;
          goto _L6
        error;
          goto _L6
        context;
        context = null;
        obj = null;
        continue; /* Loop/switch isn't completed */
        context;
        context = ((Context) (obj));
        obj = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static String d(Context context)
    {
        Object obj;
        String s3;
        Locale locale;
        String s4;
        TelephonyManager telephonymanager;
        s4 = c(context);
        if (s4 == null)
        {
            return null;
        }
        telephonymanager = (TelephonyManager)context.getSystemService("phone");
        locale = Locale.getDefault();
        obj = "";
        s3 = "";
        String s = telephonymanager.getSimOperator();
        Object obj1;
        String s2;
        s2 = s3;
        obj1 = s;
        obj = s;
        if (s.length() <= 3)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = s;
        s2 = s.substring(0, 3);
        obj1 = s;
_L2:
        obj = (new StringBuilder(512)).append("Action=andr_ms");
        ((StringBuilder) (obj)).append("&k1=").append(Utils.getMD5(o.b(context)));
        ((StringBuilder) (obj)).append("&k2=").append("Android");
        ((StringBuilder) (obj)).append("&k3=");
        ((StringBuilder) (obj)).append("&k4=");
        ((StringBuilder) (obj)).append("&k5=").append("1.0.8").append(".").append("3742");
        ((StringBuilder) (obj)).append("&k6=").append(Build.MODEL.trim().toLowerCase()).append("%").append(Build.MANUFACTURER.trim().toLowerCase()).append("%").append(android.os.Build.VERSION.SDK_INT).append("%").append(((String) (obj1))).append("%").append(s2);
        ((StringBuilder) (obj)).append("&k7=");
        ((StringBuilder) (obj)).append("&k8=");
        ((StringBuilder) (obj)).append("&k9=").append(s4);
        ((StringBuilder) (obj)).append("&k10=").append(400);
        ((StringBuilder) (obj)).append("&k11=").append(com.qihoo.security.env.a.a(context));
        ((StringBuilder) (obj)).append("&k12=").append(locale.getLanguage());
        String s1 = telephonymanager.getSimCountryIso();
        if (!TextUtils.isEmpty(s1))
        {
            ((StringBuilder) (obj)).append("&k13=").append(s1.toUpperCase());
        } else
        {
            ((StringBuilder) (obj)).append("&k13=").append(locale.getCountry());
        }
        ((StringBuilder) (obj)).append("&k14=");
        ((StringBuilder) (obj)).append("&k15=");
        ((StringBuilder) (obj)).append("&k16=");
        ((StringBuilder) (obj)).append("&k17=").append(SharedPref.b(context, "g_subcid", ""));
        ((StringBuilder) (obj)).append("&k18=");
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (TextUtils.isEmpty(context))
        {
            ((StringBuilder) (obj)).append("&k19=").append("");
        } else
        {
            ((StringBuilder) (obj)).append("&k19=").append(context.toLowerCase(Locale.US));
        }
        ((StringBuilder) (obj)).append("&k20=");
        try
        {
            context = Utils.encodeBase64(Utils.urlEncrypt(((StringBuilder) (obj)).toString().getBytes()));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        return context;
        Exception exception;
        exception;
        s2 = s3;
        obj1 = obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        b = Uri.withAppendedPath(b.a, "log");
    }
}
