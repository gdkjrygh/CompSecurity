// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Build;
import android.preference.PreferenceManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.roidapp.baselib.c.n;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.roidapp.photogrid.common:
//            ai, ah

public final class ag
{

    private static ag a = null;

    public ag()
    {
    }

    static long a(String s)
    {
        return d(s);
    }

    public static ag a()
    {
        if (a == null)
        {
            a = new ag();
        }
        return a;
    }

    public static String a(Context context, String s)
    {
        if (!s.equals("cn")) goto _L2; else goto _L1
_L1:
        Object obj = PreferenceManager.getDefaultSharedPreferences(context).getString("kindsoftV5_cn", null);
        if ("cn_null".equals(obj) || obj == null || ((String) (obj)).equals("")) goto _L4; else goto _L3
_L3:
        if (!((String) (obj)).equals("cn_null")) goto _L6; else goto _L5
_L5:
        return null;
_L6:
        return ((String) (obj));
_L2:
        if (!s.equals("cn2")) goto _L4; else goto _L7
_L7:
        obj = PreferenceManager.getDefaultSharedPreferences(context).getString("kindsoftV5_cn2", null);
        if (obj == null) goto _L4; else goto _L8
_L8:
        if (((String) (obj)).equals("cn2_null")) goto _L5; else goto _L9
_L9:
        return ((String) (obj));
_L4:
        obj = context.getAssets().open(s);
        Object obj1 = new BufferedReader(new InputStreamReader(((InputStream) (obj))));
        Object obj2 = new StringBuffer();
_L12:
        String s1 = ((BufferedReader) (obj1)).readLine();
        if (s1 == null) goto _L11; else goto _L10
_L10:
        ((StringBuffer) (obj2)).append(s1);
          goto _L12
        obj2;
        obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L26:
        if (!s.equals("cn")) goto _L14; else goto _L13
_L13:
        context = PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putString("kindsoftV5_cn", "cn_null");
        context.apply();
_L24:
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
        }
        if (obj == null) goto _L5; else goto _L15
_L15:
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return null;
_L11:
        obj2 = ((StringBuffer) (obj2)).toString();
        if (obj2 == null) goto _L17; else goto _L16
_L16:
        if (((String) (obj2)).equals("")) goto _L17; else goto _L18
_L18:
        if (!s.equals("cn")) goto _L20; else goto _L19
_L19:
        android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.putString("kindsoftV5_cn", ((String) (obj2)));
        editor.apply();
_L22:
        android.content.SharedPreferences.Editor editor1;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
        }
        try
        {
            ((BufferedReader) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        return ((String) (obj2));
_L20:
        if (!s.equals("cn2")) goto _L22; else goto _L21
_L21:
        editor1 = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor1.putString("kindsoftV5_cn2", ((String) (obj2)));
        editor1.apply();
          goto _L22
        context;
        s = ((String) (obj1));
_L25:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
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
_L17:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
        }
        try
        {
            ((BufferedReader) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return null;
_L14:
        if (!s.equals("cn2")) goto _L24; else goto _L23
_L23:
        context = PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putString("kindsoftV5_cn2", "cn2_null");
        context.apply();
          goto _L24
        context;
        s = ((String) (obj));
        obj = obj1;
          goto _L25
        context;
        s = null;
        obj = null;
          goto _L25
        context;
        s = null;
          goto _L25
        obj;
        obj = null;
        obj1 = null;
          goto _L26
        IOException ioexception;
        ioexception;
        Object obj3 = null;
        ioexception = ((IOException) (obj));
        obj = obj3;
          goto _L26
    }

    static void a(Context context, String s, String s1)
    {
        b(context, s, s1);
    }

    static String b()
    {
        return c();
    }

    static String b(Context context)
    {
        return c(context);
    }

    static String b(String s)
    {
        return e(s);
    }

    private static void b(Context context, String s, String s1)
    {
        context = context.getSharedPreferences("pg_clients", 0).edit();
        context.putString(s, s1);
        context.apply();
    }

    private static String c()
    {
        Object obj = NetworkInterface.getNetworkInterfaces();
_L2:
        Enumeration enumeration;
        if (!((Enumeration) (obj)).hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_74;
        }
        enumeration = ((NetworkInterface)((Enumeration) (obj)).nextElement()).getInetAddresses();
_L4:
        if (!enumeration.hasMoreElements()) goto _L2; else goto _L1
_L1:
        InetAddress inetaddress = (InetAddress)enumeration.nextElement();
        if (inetaddress.isLoopbackAddress() || inetaddress.isLinkLocalAddress()) goto _L4; else goto _L3
_L3:
        obj = inetaddress.getHostAddress().toString();
        return ((String) (obj));
        SocketException socketexception;
        socketexception;
        socketexception.printStackTrace();
        return "";
    }

    private static String c(Context context)
    {
        String s1 = d(context, "client");
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = UUID.randomUUID().toString().replace("-", "");
            b(context, "client", s);
        }
        return s;
    }

    static String c(Context context, String s)
    {
        return d(context, s);
    }

    private static String c(String s)
    {
        if (s == null || s == "")
        {
            return "";
        }
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception.printStackTrace();
            return s;
        }
        return s1;
    }

    private static long d(String s)
    {
        long l;
        long l1;
        long l2;
        long l3;
        try
        {
            s = s.split("\\.");
            l = Long.valueOf(s[0]).longValue();
            l1 = Long.valueOf(s[1]).longValue();
            l2 = Long.valueOf(s[2]).longValue();
            l3 = Long.valueOf(s[3]).longValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return 0L;
        }
        return l3 | (l << 24 | l1 << 16 | l2 << 8);
    }

    private static String d(Context context)
    {
        String s;
        try
        {
            s = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "NoAndroidId";
        }
        context = s;
        if (s == null)
        {
            context = "NoAndroidId";
        }
        return context;
    }

    private static String d(Context context, String s)
    {
        return context.getSharedPreferences("pg_clients", 0).getString(s, "");
    }

    private static String e(String s)
    {
        StringBuilder stringbuilder;
        int i;
        int j;
        byte byte0;
        try
        {
            s = MessageDigest.getInstance("MD5").digest(s.getBytes("UTF-8"));
            stringbuilder = new StringBuilder(s.length * 2);
            j = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "";
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = s[i];
        if ((byte0 & 0xff) >= 16)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        stringbuilder.append("0");
        stringbuilder.append(Integer.toHexString(byte0 & 0xff));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_32;
_L1:
        s = stringbuilder.toString();
        return s;
    }

    public final void a(Context context)
    {
        String s3 = d(context);
        Object obj;
        String s4;
        String s5;
        obj = (TelephonyManager)context.getSystemService("phone");
        s4 = c(context);
        s5 = c(Build.MODEL);
        String s = c(Build.BRAND);
_L1:
        String s6 = c(((TelephonyManager) (obj)).getNetworkOperatorName());
        String s1 = "1";
        String s2 = a(context, "cn");
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        obj = s2;
        if (!s2.equals(""))
        {
            break MISSING_BLOCK_LABEL_86;
        }
        obj = context.getString(0x7f070052);
        String s7;
        String s8;
        String s9;
        s2 = a(context, "cn2");
        Log.e("KingsoftV5", (new StringBuilder("cn: ")).append(((String) (obj))).append("cn2: ").append(s2).toString());
        s7 = c(android.os.Build.VERSION.RELEASE);
        s8 = n.d(context);
        s9 = Locale.getDefault().getCountry();
        if (context.getApplicationContext().getFilesDir().getAbsolutePath().startsWith("/system"))
        {
            s1 = "0";
        }
        NoSuchFieldError nosuchfielderror;
        try
        {
            s = String.format("http://pg.tj.ijinshan.com/tj/?actionname=active&imei=%s&model=%s&carriers=%s&intype=%s&channel=%s&os=android&osver=%s&aid=%s&cn2=%s&ver=%s&brand=%s&cl=%s", new Object[] {
                s4, s5, s6, s1, obj, s7, s3, s2, s8, s, 
                s9
            });
            ai.a().b().execute(new ah(this, s, context));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_282;
        nosuchfielderror;
        nosuchfielderror.printStackTrace();
        nosuchfielderror = "";
          goto _L1
    }

    public final void b(Context context, String s)
    {
        String s5 = d(context);
        String s6 = c(context);
        String s1;
        String s2;
        String s3;
        String s7;
        try
        {
            s1 = c(Build.BRAND);
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            try
            {
                nosuchfielderror.printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return;
            }
            nosuchfielderror = "";
        }
        s7 = c(Build.MODEL);
        s3 = a(context, "cn");
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        s2 = s3;
        if (!s3.equals(""))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        s2 = context.getString(0x7f070052);
        String s4 = a(context, "cn2");
        Log.e("KingsoftV5", (new StringBuilder("cn: ")).append(s2).append("cn2: ").append(s4).toString());
        String s8 = Locale.getDefault().getCountry();
        String s9 = c(android.os.Build.VERSION.RELEASE);
        String s10 = n.d(context);
        Object obj = Calendar.getInstance();
        obj = (new StringBuilder()).append(((Calendar) (obj)).getTimeInMillis() / 1000L).toString();
        s = String.format((new StringBuilder("http://pg.tj.ijinshan.com/tj/?actionname=")).append(s).append("&root=1&model=%s&brand=%s&osver=%s&channel=%s&ver=%s&imei=%s&aid=%s&timestamp=%s&cl=%s&cn2=%s").toString(), new Object[] {
            s7, s1, s9, s2, s10, s6, s5, obj, s8, s4
        });
        ai.a().b().execute(new ah(this, s, context));
        return;
    }

}
