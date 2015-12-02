// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.support;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.g.a;
import com.qihoo360.common.utils.StorageDeviceUtils;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.o;
import com.qihoo360.mobilesafe.share.SharedPref;
import com.qihoo360.mobilesafe.share.d;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.GZIPOutputStream;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.support:
//            StatisticianProvider

public class b
{
    private static final class a extends Handler
    {

        public void handleMessage(Message message)
        {
            if (message != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            int i1 = message.arg1;
            switch (message.what)
            {
            default:
                return;

            case 0: // '\0'
                message = com.qihoo.security.support.b.d(i1);
                Object obj;
                Object obj1;
                String s;
                int j1;
                int k1;
                long l1;
                try
                {
                    b.b(message, com.qihoo.security.support.b.a(message, 0) + 1);
                    if (b.e(i1))
                    {
                        message = b.f(i1);
                        com.qihoo.security.support.b.d(message, b.c(message, 0) + 1);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Message message) { }
                b.b(i1);
                return;

            case 1: // '\001'
                j1 = message.arg2;
                message = com.qihoo.security.support.b.d(i1);
                try
                {
                    b.b(message, com.qihoo.security.support.b.a(message, 0) + j1);
                    if (b.e(i1))
                    {
                        message = b.f(i1);
                        com.qihoo.security.support.b.d(message, b.c(message, 0) + 1);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Message message) { }
                com.qihoo.security.support.b.a(i1, j1);
                return;

            case 2: // '\002'
                j1 = message.arg2;
                message = com.qihoo.security.support.b.d(i1);
                try
                {
                    b.b(message, j1);
                }
                // Misplaced declaration of an exception variable
                catch (Message message) { }
                com.qihoo.security.support.b.a(i1, j1);
                return;

            case 3: // '\003'
                obj = com.qihoo.security.support.b.d(i1);
                l1 = message.getData().getLong("value");
                try
                {
                    b.b(((String) (obj)), com.qihoo.security.support.b.a(((String) (obj)), 0L) + l1);
                    if (b.e(i1))
                    {
                        message = b.f(i1);
                        com.qihoo.security.support.b.d(message, b.c(message, 0) + 1);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Message message) { }
                com.qihoo.security.support.b.a(i1, l1);
                return;

            case 4: // '\004'
                j1 = message.arg2;
                k1 = message.getData().getInt("value");
                try
                {
                    message = com.qihoo.security.support.b.d(i1);
                    b.c(message, com.qihoo.security.support.b.a(b.b(message, ""), j1, k1));
                }
                // Misplaced declaration of an exception variable
                catch (Message message) { }
                com.qihoo.security.support.b.a(i1, j1);
                return;

            case 5: // '\005'
                com.qihoo.security.support.b.a(i1, String.valueOf(message.arg2), String.valueOf(message.getData().getInt("value")));
                return;

            case 6: // '\006'
                message = SecurityApplication.a().getContentResolver();
                if (message != null)
                {
                    obj = com.qihoo.security.support.b.a(i1, 0L, System.currentTimeMillis(), false);
                    if (obj != null)
                    {
                        try
                        {
                            message.insert(com.qihoo.security.support.StatisticianProvider.a, ((ContentValues) (obj)));
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Message message)
                        {
                            return;
                        }
                    }
                }
                break;

            case 7: // '\007'
                obj1 = message.getData();
                message = ((Bundle) (obj1)).getString("value");
                obj = ((Bundle) (obj1)).getString("value2");
                l1 = ((Bundle) (obj1)).getLong("value3");
                obj1 = SecurityApplication.a().getContentResolver();
                if (obj1 != null)
                {
                    message = com.qihoo.security.support.b.a(i1, message, ((String) (obj)), l1, System.currentTimeMillis(), true);
                    if (message != null)
                    {
                        try
                        {
                            ((ContentResolver) (obj1)).insert(com.qihoo.security.support.StatisticianProvider.a, message);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Message message)
                        {
                            return;
                        }
                    }
                }
                break;

            case 8: // '\b'
                obj1 = message.getData();
                message = ((Bundle) (obj1)).getString("value");
                obj = ((Bundle) (obj1)).getString("value2");
                s = ((Bundle) (obj1)).getString("value3");
                obj1 = SecurityApplication.a().getContentResolver();
                if (obj1 != null)
                {
                    message = com.qihoo.security.support.b.a(i1, message, ((String) (obj)), s, System.currentTimeMillis(), true);
                    if (message != null)
                    {
                        try
                        {
                            ((ContentResolver) (obj1)).insert(com.qihoo.security.support.StatisticianProvider.a, message);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Message message)
                        {
                            return;
                        }
                    }
                }
                break;

            case 9: // '\t'
                obj = message.getData();
                message = ((Bundle) (obj)).getString("value");
                obj1 = ((Bundle) (obj)).getString("value2");
                obj = SecurityApplication.a().getContentResolver();
                if (obj != null)
                {
                    message = com.qihoo.security.support.b.a(i1, message, ((String) (obj1)), System.currentTimeMillis(), true);
                    if (message != null)
                    {
                        try
                        {
                            ((ContentResolver) (obj)).insert(com.qihoo.security.support.StatisticianProvider.a, message);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Message message)
                        {
                            return;
                        }
                    }
                }
                break;

            case 10: // '\n'
                l1 = message.getData().getLong("value");
                message = SecurityApplication.a().getContentResolver();
                continue; /* Loop/switch isn't completed */
            }
            if (true)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (message == null) goto _L1; else goto _L3
_L3:
            obj = com.qihoo.security.support.b.a(i1, l1, System.currentTimeMillis(), true);
            if (obj != null)
            {
                try
                {
                    message.insert(com.qihoo.security.support.StatisticianProvider.a, ((ContentValues) (obj)));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    return;
                }
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        public a(Looper looper)
        {
            super(looper);
        }
    }


    private static String a = null;
    private static String b = null;
    private static String c = null;
    private static String d = null;
    private static String e = null;
    private static String f = null;
    private static boolean g = false;
    private static boolean h = false;
    private static boolean i = false;
    private static int j = 98;
    private static int k[] = {
        10006, 11001, 11002, 11008, 11011, 11307, 11308, 11309, 11310, 11311, 
        11312, 11014, 11015, 11018, 11019, 11020, 11021, 11022, 11023, 11026, 
        11027, 11401, 11402, 11403, 11404, 11405, 11304, 11305, 12001, 12002, 
        12003, 12005, 12006, 12007, 12008, 12011, 12012, 12013, 12014, 12015, 
        12016, 12017, 12051, 12052, 12053, 12054, 12055, 12056, 12018, 12019, 
        12020, 12021, 12022, 12024, 12025, 12026, 12027, 12140, 12145, 12147, 
        12151, 12152, 12029, 12030, 12034, 12035, 12036, 12037, 12038, 12039, 
        12040, 12041, 12042, 12045, 12048, 12049, 13001, 13002, 13005, 13006, 
        13007, 13008, 13009, 13012, 13013, 13016, 13017, 13018, 13019, 13020, 
        13021, 13022, 13023, 14001, 14002, 14004, 14005, 14007, 14008, 14010, 
        14011, 14012, 14014, 14015, 14017, 14019, 14020, 14021, 14022, 14024, 
        14025, 14026, 14027, 14028, 14029, 14030, 14301, 14304, 14305, 14306, 
        14308, 15001, 15002, 15003, 15004, 15005, 15006, 15007, 15008, 15009, 
        15010, 15011, 15012, 15014, 15016, 15017, 15018, 15019, 15020, 15021, 
        16001, 16003, 16004, 16005, 16006, 16007, 16008, 16009, 16010, 16011, 
        16012, 16013, 16014, 16015, 17001, 17002, 17003, 17004, 17012, 17013, 
        17014, 17021, 17022, 17022, 17023, 18001, 18003, 18009, 18306, 18305, 
        18307, 18308, 18309, 18310, 18311, 18312, 18314, 19001, 19002, 19003, 
        19004, 19005, 19007, 19008, 19009, 19010, 19011, 20001, 20002, 20003, 
        20004, 20005, 20006, 20031, 20032, 21001, 21002, 21003, 22001, 22002, 
        22003, 22004, 23001, 23002, 23003, 23004, 23005, 23006, 23007, 23008, 
        23009, 23010, 23011, 23012, 23013, 23014, 24001, 24002, 24004, 24005, 
        24006, 24007, 24008, 24009, 24012, 25001, 25002, 25003, 25004, 1121, 
        26001, 26002, 26003, 26004, 26005, 26011, 17025, 17026, 17027, 24026, 
        25005, 25006, 25007, 25008, 25009, 25010, 30000, 30001, 30002, 30003, 
        30004, 11017, 11024, 11025, 11313, 11314, 11315, 11316, 11317, 11322, 
        11319, 11321, 11306, 20030, 30005, 30007, 18012, 14031, 14032, 12031, 
        12032, 12033, 12043, 12044
    };
    private static int l[] = {
        10005, 11004, 11005, 11009, 11028, 12046, 12047, 13003, 13004, 13010, 
        13011, 13014, 13015, 14003, 14006, 14009, 14013, 14016, 14023, 16002, 
        18013, 24010, 24011, 26010
    };
    private static int m[] = {
        11003, 12023, 12028, 15022, 15013, 15015, 12050, 18302, 25180, 25181, 
        25182, 25183, 25184, 25185, 25186, 25187, 25188, 25189, 25190, 25191, 
        25192, 25193, 25194, 25195, 25196, 25197, 25198, 25199, 25200, 25201
    };
    private static volatile a n;
    private static volatile Looper o;

    private static int a(Context context, int i1)
    {
        return e(g(i1), 0);
    }

    static int a(String s, int i1)
    {
        return f(s, i1);
    }

    static long a(String s, long l1)
    {
        return c(s, l1);
    }

    static ContentValues a(int i1, long l1, long l2, boolean flag)
    {
        return b(i1, l1, l2, flag);
    }

    static ContentValues a(int i1, String s, String s1, long l1, long l2, boolean flag)
    {
        return b(i1, s, s1, l1, l2, flag);
    }

    static ContentValues a(int i1, String s, String s1, long l1, boolean flag)
    {
        return b(i1, s, s1, l1, flag);
    }

    static ContentValues a(int i1, String s, String s1, String s2, long l1, boolean flag)
    {
        return b(i1, s, s1, s2, l1, flag);
    }

    private static String a(long l1)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        simpledateformat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        return simpledateformat.format(new Date(l1));
    }

    private static String a(Context context, String s)
    {
        JSONObject jsonobject = new JSONObject();
        c(context, jsonobject);
        b(context, s, jsonobject);
        a(context, s, jsonobject);
        if (jsonobject.length() > 0)
        {
            return jsonobject.toString();
        } else
        {
            return "";
        }
    }

    static String a(String s, int i1, int j1)
    {
        return b(s, i1, j1);
    }

    public static void a()
    {
        if (Calendar.getInstance().get(12) % 30 != 0)
        {
            long l1 = SharedPref.b(SecurityApplication.a(), "last_stat", 0L);
            long l2 = System.currentTimeMillis();
            if (l2 - l1 >= 0x1499700L || l2 < l1)
            {
                d();
                a("afe_Active", "");
                return;
            }
        }
    }

    public static void a(int i1)
    {
        a(i1, 1);
    }

    public static void a(int i1, int j1)
    {
        a(String.format(Locale.US, "afe_%d", new Object[] {
            Integer.valueOf(i1)
        }), String.valueOf(j1));
    }

    public static void a(int i1, int j1, int k1)
    {
        Message message = n.obtainMessage();
        message.what = 4;
        message.arg1 = i1;
        message.arg2 = j1;
        Bundle bundle = new Bundle();
        bundle.putInt("value", k1);
        message.setData(bundle);
        n.sendMessage(message);
    }

    public static void a(int i1, long l1)
    {
        Message message = n.obtainMessage();
        message.what = 10;
        message.arg1 = i1;
        Bundle bundle = new Bundle();
        bundle.putLong("value", l1);
        message.setData(bundle);
        n.sendMessage(message);
    }

    public static void a(int i1, String s, String s1)
    {
        Message message = n.obtainMessage();
        message.what = 9;
        message.arg1 = i1;
        Bundle bundle = new Bundle();
        bundle.putString("value", s);
        bundle.putString("value2", s1);
        message.setData(bundle);
        n.sendMessage(message);
    }

    public static void a(int i1, String s, String s1, long l1)
    {
        Message message = n.obtainMessage();
        message.what = 7;
        message.arg1 = i1;
        Bundle bundle = new Bundle();
        bundle.putString("value", s);
        bundle.putString("value2", s1);
        bundle.putLong("value3", l1);
        message.setData(bundle);
        n.sendMessage(message);
    }

    public static void a(int i1, String s, String s1, String s2)
    {
        Message message = n.obtainMessage();
        message.what = 8;
        message.arg1 = i1;
        Bundle bundle = new Bundle();
        bundle.putString("value", s);
        bundle.putString("value2", s1);
        bundle.putString("value3", s2);
        message.setData(bundle);
        n.sendMessage(message);
    }

    public static final void a(Context context)
    {
        try
        {
            AppsFlyerProperties.getInstance().disableLogOutput(true);
            AppsFlyerLib.setAppsFlyerKey("z4EY4D3yJVHeVzS93ba8vV");
            AppsFlyerLib.sendTracking(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    private static void a(Context context, String s, JSONObject jsonobject)
    {
        ContentResolver contentresolver = context.getContentResolver();
        s = (new StringBuilder()).append("ver='").append(s).append("'").toString();
        s = contentresolver.query(com.qihoo.security.support.StatisticianProvider.a.buildUpon().appendQueryParameter("limit", "2000").build(), new String[] {
            "sid", "sv", "ts", "r0", "r1"
        }, s, null, "_id DESC");
        if (s == null) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray = new JSONArray();
_L5:
        if (!s.moveToNext()) goto _L4; else goto _L3
_L3:
        JSONObject jsonobject1;
        String s1;
        jsonobject1 = new JSONObject();
        jsonobject1.put("a", s.getInt(0));
        s1 = s.getString(1);
        if (!TextUtils.isEmpty(s1))
        {
            jsonobject1.put("v", s1);
        }
        jsonobject1.put("t", a(s.getLong(2)));
        s1 = s.getString(3);
        if (!TextUtils.isEmpty(s1))
        {
            jsonobject1.put("v2", s1);
        }
        s1 = s.getString(4);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        jsonobject1.put("v3", s1);
        jsonarray.put(jsonobject1);
          goto _L5
        context;
_L12:
        Utils.closeCursor(s);
        return;
_L4:
        boolean flag;
        context = SharedPref.b(context.getApplicationContext(), "package_source", "");
        if (TextUtils.isEmpty(context))
        {
            break MISSING_BLOCK_LABEL_290;
        }
        flag = context.equals("google play");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        context = new JSONObject();
        context.put("a", 10007);
        context.put("t", a(System.currentTimeMillis()));
        jsonarray.put(context);
_L6:
        if (jsonarray.length() > 0)
        {
            jsonobject.put("actions", jsonarray);
        }
_L2:
        Utils.closeCursor(s);
        return;
        context;
        context.printStackTrace();
          goto _L6
        context;
_L10:
        Utils.closeCursor(s);
        return;
        context;
        s = null;
_L8:
        Utils.closeCursor(s);
        throw context;
        context;
        if (true) goto _L8; else goto _L7
_L7:
        context;
        s = null;
        if (true) goto _L10; else goto _L9
_L9:
        context;
        s = null;
        if (true) goto _L12; else goto _L11
_L11:
    }

    static void a(Context context, HttpClient httpclient)
    {
        e(context, httpclient);
    }

    private static void a(Context context, JSONObject jsonobject)
    {
        int ai[] = l;
        int j1 = ai.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            int k1 = ai[i1];
            int l1 = a(context, k1);
            if (l1 <= 0)
            {
                continue;
            }
            long l2 = b(context, k1);
            if (l2 > 0L)
            {
                JSONObject jsonobject1 = new JSONObject();
                try
                {
                    jsonobject1.put("t", l2);
                    jsonobject1.put("c", l1);
                    jsonobject.put(String.valueOf(k1), jsonobject1);
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
            }
            i1++;
        }
    }

    public static void a(String s)
    {
    }

    public static void a(String s, String s1)
    {
        if (TextUtils.isEmpty(s) || s1 == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        AppsFlyerLib.sendTrackingWithEvent(SecurityApplication.a(), s, s1);
        return;
        s;
    }

    private static void a(JSONObject jsonobject, int i1, int j1)
    {
        try
        {
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.put("v", j1);
            jsonobject.put(String.valueOf(i1), jsonobject1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
        }
    }

    private static boolean a(String s, Context context, HttpClient httpclient)
    {
        byte byte0 = -1;
        String s1 = c(context, s);
        int i1 = byte0;
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_114;
        }
        s = a(context, s);
        i1 = byte0;
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_114;
        }
        s = Utils.encodeBase64(Utils.urlEncrypt(a(s.getBytes()))).getBytes();
        context = new ByteArrayOutputStream();
        i1 = byte0;
        if (com.qihoo.security.g.a.a(httpclient, s1, s, context, null) <= 0)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        i1 = byte0;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        s = new JSONObject(context.toString());
        i1 = byte0;
        if (s != null)
        {
            try
            {
                i1 = s.getInt("ret");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                i1 = byte0;
            }
        }
        return i1 == 0;
    }

    private static byte[] a(byte abyte0[])
    {
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            GZIPOutputStream gzipoutputstream = new GZIPOutputStream(bytearrayoutputstream);
            gzipoutputstream.write(abyte0);
            gzipoutputstream.finish();
            bytearrayoutputstream.close();
            gzipoutputstream.close();
            abyte0 = bytearrayoutputstream.toByteArray();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return null;
        }
        return abyte0;
    }

    private static long b(Context context, int i1)
    {
        return c(h(i1), 0L);
    }

    private static ContentValues b(int i1, long l1, long l2, boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("sid", Integer.valueOf(i1));
        String s;
        if (flag)
        {
            s = String.valueOf(l1);
        } else
        {
            s = "";
        }
        contentvalues.put("sv", s);
        contentvalues.put("ts", Long.valueOf(l2));
        if (TextUtils.isEmpty(f))
        {
            f = "1.0.8.3742";
        }
        contentvalues.put("ver", f);
        if (contentvalues.size() > 0)
        {
            return contentvalues;
        } else
        {
            return null;
        }
    }

    private static ContentValues b(int i1, String s, String s1, long l1, long l2, boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("sid", Integer.valueOf(i1));
        if (!flag)
        {
            s = "";
        }
        contentvalues.put("sv", s);
        contentvalues.put("ts", Long.valueOf(l2));
        if (TextUtils.isEmpty(f))
        {
            f = "1.0.8.3742";
        }
        contentvalues.put("ver", f);
        if (!flag)
        {
            s1 = "";
        }
        contentvalues.put("r0", s1);
        if (!flag)
        {
            l1 = 0L;
        }
        contentvalues.put("r1", Long.valueOf(l1));
        if (contentvalues.size() > 0)
        {
            return contentvalues;
        } else
        {
            return null;
        }
    }

    private static ContentValues b(int i1, String s, String s1, long l1, boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("sid", Integer.valueOf(i1));
        if (!flag)
        {
            s = "";
        }
        contentvalues.put("sv", s);
        contentvalues.put("ts", Long.valueOf(l1));
        if (TextUtils.isEmpty(f))
        {
            f = "1.0.8.3742";
        }
        contentvalues.put("ver", f);
        if (flag)
        {
            s = String.valueOf(s1);
        } else
        {
            s = "";
        }
        contentvalues.put("r0", s);
        if (contentvalues.size() > 0)
        {
            return contentvalues;
        } else
        {
            return null;
        }
    }

    private static ContentValues b(int i1, String s, String s1, String s2, long l1, boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("sid", Integer.valueOf(i1));
        if (!flag)
        {
            s = "";
        }
        contentvalues.put("sv", s);
        contentvalues.put("ts", Long.valueOf(l1));
        if (TextUtils.isEmpty(f))
        {
            f = "1.0.8.3742";
        }
        contentvalues.put("ver", f);
        if (!flag)
        {
            s1 = "";
        }
        contentvalues.put("r0", s1);
        if (!flag)
        {
            s2 = "";
        }
        contentvalues.put("r1", s2);
        if (contentvalues.size() > 0)
        {
            return contentvalues;
        } else
        {
            return null;
        }
    }

    private static String b(Context context)
    {
        JSONObject jsonobject = new JSONObject();
        d(context, jsonobject);
        a(context, jsonobject);
        b(context, jsonobject);
        f(context, jsonobject);
        e(context, jsonobject);
        return jsonobject.toString();
    }

    private static String b(String s, int i1, int j1)
    {
        boolean flag1 = false;
        JSONArray jsonarray = new JSONArray(s);
_L1:
        Exception exception;
        JSONObject jsonobject;
        int k1;
        boolean flag;
        int l1;
        try
        {
            l1 = jsonarray.length();
        }
        catch (Exception exception1)
        {
            return s;
        }
        k1 = 0;
_L2:
        flag = flag1;
        if (k1 >= l1)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        jsonobject = jsonarray.getJSONObject(k1);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        if (jsonobject.getInt("v") != i1)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        jsonobject.put("c", jsonobject.getInt("c") + j1);
        flag = true;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        jsonobject = new JSONObject();
        jsonobject.put("v", i1);
        jsonobject.put("c", j1);
        jsonarray.put(l1, jsonobject);
        return jsonarray.toString();
        exception;
        exception = new JSONArray();
          goto _L1
        k1++;
          goto _L2
    }

    static String b(String s, String s1)
    {
        return d(s, s1);
    }

    public static void b()
    {
        if (!g && !h && !i) goto _L2; else goto _L1
_L1:
        Context context;
        return;
_L2:
        if ((context = SecurityApplication.a()) == null) goto _L1; else goto _L3
_L3:
        if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(b))
        {
            break; /* Loop/switch isn't completed */
        }
        com.qihoo.security.d.a a1 = new com.qihoo.security.d.a(context);
        a = a1.a("stat", "host");
        b = a1.a("stat", "pam1");
        c = a1.a("stat", "pam2");
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(b) || TextUtils.isEmpty(c)) goto _L1; else goto _L4
_L4:
        try
        {
            (new Thread(new Runnable(context) {

                final Context a;

                public void run()
                {
                    HttpClient httpclient = com.qihoo.security.g.a.a(com.qihoo.security.g.a.a(a, new com.qihoo.security.d.a(a)));
                    String s = com.qihoo360.mobilesafe.b.o.a();
                    if (!s.equals(a.getPackageName()))
                    {
                        com.qihoo.security.service.d.a("Statistician2", Integer.valueOf(httpclient.hashCode()));
                    }
                    com.qihoo.security.support.b.a(a, httpclient);
                    if (!s.equals(a.getPackageName()))
                    {
                        com.qihoo.security.service.d.b("Statistician2", Integer.valueOf(httpclient.hashCode()));
                    }
                    if (httpclient != null)
                    {
                        httpclient.getConnectionManager().shutdown();
                    }
_L2:
                    return;
                    Object obj;
                    obj;
                    if (httpclient == null) goto _L2; else goto _L1
_L1:
                    httpclient.getConnectionManager().shutdown();
                    return;
                    obj;
                    if (httpclient != null)
                    {
                        httpclient.getConnectionManager().shutdown();
                    }
                    throw obj;
                }

            
            {
                a = context;
                super();
            }
            })).start();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public static void b(int i1)
    {
        Message message = n.obtainMessage();
        message.what = 6;
        message.arg1 = i1;
        n.sendMessage(message);
    }

    public static void b(int i1, int j1)
    {
        Message message = n.obtainMessage();
        message.what = 1;
        message.arg1 = i1;
        message.arg2 = j1;
        n.sendMessage(message);
    }

    public static void b(int i1, int j1, int k1)
    {
        Message message = n.obtainMessage();
        message.what = 5;
        message.arg1 = i1;
        message.arg2 = j1;
        Bundle bundle = new Bundle();
        bundle.putInt("value", k1);
        message.setData(bundle);
        n.sendMessage(message);
    }

    public static void b(int i1, long l1)
    {
        Message message = n.obtainMessage();
        message.what = 3;
        message.arg1 = i1;
        Bundle bundle = new Bundle();
        bundle.putLong("value", l1);
        message.setData(bundle);
        n.sendMessage(message);
    }

    private static void b(Context context, String s)
    {
        try
        {
            s = (new StringBuilder()).append("ver='").append(s).append("'").toString();
            Uri uri = com.qihoo.security.support.StatisticianProvider.a.buildUpon().appendQueryParameter("limit", "2000").build();
            context.getContentResolver().delete(uri, s, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    private static void b(Context context, String s, JSONObject jsonobject)
    {
        try
        {
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.put("pkg", "com.qihoo.security.lite");
            jsonobject1.put("ver", s);
            jsonobject1.put("top_chl", com.qihoo.security.env.a.a(context));
            jsonobject1.put("sub_chl", SharedPref.b(context, "g_subcid", ""));
            jsonobject.put("app", jsonobject1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    static void b(Context context, HttpClient httpclient)
    {
        f(context, httpclient);
    }

    private static void b(Context context, JSONObject jsonobject)
    {
        long l1 = 1L;
        long l2 = StorageDeviceUtils.getTotalStorageSize(context);
        a(jsonobject, 10004, (int)(((l2 - StorageDeviceUtils.getFreeStorageSize(context)) * 100L) / l2));
        a(jsonobject, 10001, d(context));
        l2 = Utils.getMemoryTotalKb() / 1024L;
        if (l2 >= 1L)
        {
            l1 = l2;
        }
        a(jsonobject, 10002, (int)l1);
        a(jsonobject, 10003, com.qihoo360.mobilesafe.b.o.b());
        context = SharedPref.b(context.getApplicationContext(), "package_source", "");
        if (!TextUtils.isEmpty(context) && context.equals("google play"))
        {
            break MISSING_BLOCK_LABEL_118;
        }
        jsonobject.put(String.valueOf(10007), 1);
        return;
        context;
        context.printStackTrace();
        return;
    }

    static void b(String s, int i1)
    {
        h(s, i1);
    }

    static void b(String s, long l1)
    {
        d(s, l1);
    }

    static int c(String s, int i1)
    {
        return e(s, i1);
    }

    private static final long c(String s, long l1)
    {
        return com.qihoo360.mobilesafe.share.d.b("sp_stat", s, l1);
    }

    private static String c(Context context, String s)
    {
        if (context == null)
        {
            return null;
        }
        if (TextUtils.isEmpty(d) || TextUtils.isEmpty(e))
        {
            com.qihoo.security.d.a a1 = new com.qihoo.security.d.a(context);
            d = a1.a("statapi", "host");
            e = a1.a("statapi", "file");
            if (TextUtils.isEmpty(d) || TextUtils.isEmpty(e))
            {
                d = "api.data.360safe.com";
                e = "api_v2.php";
            }
        }
        return String.format(Locale.US, "http://%s/%s?pkg=%s&ver=%s&uiver=%s", new Object[] {
            d, e, context.getPackageName(), s, Integer.valueOf(400)
        });
    }

    private static HashSet c(Context context)
    {
        Exception exception;
        Object obj1;
        HashSet hashset;
        obj1 = null;
        exception = null;
        hashset = new HashSet();
        context = context.getContentResolver().query(com.qihoo.security.support.StatisticianProvider.a, new String[] {
            "ver"
        }, "0=0) group by(ver", null, "_id DESC");
        if (context == null) goto _L2; else goto _L1
_L1:
        for (; context.moveToNext(); hashset.add(context.getString(0))) { }
          goto _L2
        exception;
_L8:
        Utils.closeCursor(context);
        return hashset;
_L2:
        Utils.closeCursor(context);
        return hashset;
        context;
        context = exception;
_L6:
        Utils.closeCursor(context);
        return hashset;
        Object obj;
        obj;
        context = obj1;
_L4:
        Utils.closeCursor(context);
        throw obj;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        context;
        context = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void c()
    {
        HandlerThread handlerthread = new HandlerThread("statistician2", 0);
        handlerthread.start();
        if (n == null)
        {
            o = handlerthread.getLooper();
            n = new a(o);
        }
    }

    public static void c(int i1)
    {
        Message message = n.obtainMessage();
        message.what = 0;
        message.arg1 = i1;
        n.sendMessage(message);
    }

    public static void c(int i1, int j1)
    {
        Message message = n.obtainMessage();
        message.what = 2;
        message.arg1 = i1;
        message.arg2 = j1;
        n.sendMessage(message);
    }

    static void c(Context context, HttpClient httpclient)
    {
        d(context, httpclient);
    }

    private static void c(Context context, JSONObject jsonobject)
    {
        JSONObject jsonobject1;
        jsonobject1 = new JSONObject();
        jsonobject1.put("time", a(System.currentTimeMillis()));
        jsonobject1.put("imei_hash", Utils.getMD5(com.qihoo360.mobilesafe.b.o.b(context)));
        String s;
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = "";
        obj1 = "";
        s = ((String) (obj1));
        obj = obj2;
        Object obj3 = (TelephonyManager)context.getSystemService("phone");
        s = ((String) (obj1));
        obj = obj2;
        obj1 = ((TelephonyManager) (obj3)).getSimCountryIso();
        s = ((String) (obj1));
        obj = obj2;
        obj2 = ((TelephonyManager) (obj3)).getSimOperator();
        s = ((String) (obj1));
        obj = obj2;
        if (((String) (obj2)).length() <= 3) goto _L2; else goto _L1
_L1:
        s = ((String) (obj1));
        obj = obj2;
        obj3 = ((String) (obj2)).substring(0, 3);
        s = ((String) (obj3));
_L5:
        obj = Locale.getDefault();
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            break MISSING_BLOCK_LABEL_342;
        }
        jsonobject1.put("dist", ((String) (obj1)).toUpperCase(Locale.US));
_L3:
        long l2;
        jsonobject1.put("lang", ((Locale) (obj)).getLanguage());
        jsonobject1.put("model", Build.MODEL.trim().toLowerCase(Locale.US));
        jsonobject1.put("manu", Build.MANUFACTURER.trim().toLowerCase(Locale.US));
        jsonobject1.put("sdk", android.os.Build.VERSION.SDK_INT);
        jsonobject1.put("op", obj2);
        jsonobject1.put("mcc", s);
        jsonobject1.put("reso", d(context));
        l2 = Utils.getMemoryTotalKb() / 1024L;
        long l1 = l2;
        if (l2 < 1L)
        {
            l1 = 1L;
        }
        try
        {
            jsonobject1.put("mem", l1);
            jsonobject1.put("cpu_num", com.qihoo360.mobilesafe.b.o.b());
            l1 = StorageDeviceUtils.getTotalStorageSize(context);
            jsonobject1.put("disk_use", (int)(((l1 - StorageDeviceUtils.getFreeStorageSize(context)) * 100L) / l1));
            jsonobject.put("dev", jsonobject1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_363;
        jsonobject1.put("dist", ((Locale) (obj)).getCountry());
          goto _L3
        return;
_L2:
        s = "";
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        exception = s;
        s = "";
        obj2 = obj;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static void c(String s, String s1)
    {
        e(s, s1);
    }

    private static int d(Context context)
    {
        int j1 = j;
        context = com.qihoo360.mobilesafe.b.o.f(context);
        int i1 = j1;
        if (context != null)
        {
            i1 = j1;
            if (context[0] > 0)
            {
                i1 = j1;
                if (context[1] > 0)
                {
                    i1 = Integer.valueOf((new StringBuilder()).append(String.valueOf(context[0])).append(String.format("%05d", new Object[] {
                        Integer.valueOf(context[1])
                    })).toString()).intValue();
                }
            }
        }
        return i1;
    }

    static String d(int i1)
    {
        return h(i1);
    }

    private static final String d(String s, String s1)
    {
        return com.qihoo360.mobilesafe.share.d.b("sp_stat", s, s1);
    }

    private static void d()
    {
        if (!g && !h && !i) goto _L2; else goto _L1
_L1:
        Context context;
        return;
_L2:
        if ((context = SecurityApplication.a()) == null) goto _L1; else goto _L3
_L3:
        if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(b))
        {
            break; /* Loop/switch isn't completed */
        }
        com.qihoo.security.d.a a1 = new com.qihoo.security.d.a(context);
        a = a1.a("stat", "host");
        b = a1.a("stat", "pam1");
        c = a1.a("stat", "pam2");
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(b) || TextUtils.isEmpty(c)) goto _L1; else goto _L4
_L4:
        try
        {
            (new Thread(new Runnable(context) {

                final Context a;

                public void run()
                {
                    HttpClient httpclient = com.qihoo.security.g.a.a(com.qihoo.security.g.a.a(a, new com.qihoo.security.d.a(a)));
                    String s = com.qihoo360.mobilesafe.b.o.a();
                    if (!s.equals(a.getPackageName()))
                    {
                        com.qihoo.security.service.d.a("Statistician2", Integer.valueOf(httpclient.hashCode()));
                    }
                    b.b(a, httpclient);
                    com.qihoo.security.support.b.a(a, httpclient);
                    b.c(a, httpclient);
                    if (!s.equals(a.getPackageName()))
                    {
                        com.qihoo.security.service.d.b("Statistician2", Integer.valueOf(httpclient.hashCode()));
                    }
                    if (httpclient != null)
                    {
                        httpclient.getConnectionManager().shutdown();
                    }
_L2:
                    return;
                    Object obj;
                    obj;
                    if (httpclient == null) goto _L2; else goto _L1
_L1:
                    httpclient.getConnectionManager().shutdown();
                    return;
                    obj;
                    if (httpclient != null)
                    {
                        httpclient.getConnectionManager().shutdown();
                    }
                    throw obj;
                }

            
            {
                a = context;
                super();
            }
            })).start();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private static void d(Context context, HttpClient httpclient)
    {
        Object obj2 = null;
        if (!SharedPref.b(context, "reg", false)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        String s3;
        Locale locale;
        TelephonyManager telephonymanager;
        h = true;
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
            break MISSING_BLOCK_LABEL_80;
        }
        obj = s;
        s2 = s.substring(0, 3);
        obj1 = s;
_L8:
        obj = (new StringBuilder(512)).append("Action=andr_ms");
        ((StringBuilder) (obj)).append("&k1=").append(Utils.getMD5(com.qihoo360.mobilesafe.b.o.b(context)));
        ((StringBuilder) (obj)).append("&k2=").append("Android");
        ((StringBuilder) (obj)).append("&k3=");
        ((StringBuilder) (obj)).append("&k4=");
        ((StringBuilder) (obj)).append("&k5=").append("1.0.8").append(".").append("3742");
        ((StringBuilder) (obj)).append("&k6=").append(Build.MODEL.trim().toLowerCase(Locale.US)).append("%").append(Build.MANUFACTURER.trim().toLowerCase(Locale.US)).append("%").append(android.os.Build.VERSION.SDK_INT).append("%").append(((String) (obj1))).append("%").append(s2);
        ((StringBuilder) (obj)).append("&k7=");
        ((StringBuilder) (obj)).append("&k8=");
        ((StringBuilder) (obj)).append("&k9=");
        ((StringBuilder) (obj)).append("&k10=").append(400);
        ((StringBuilder) (obj)).append("&k11=").append(com.qihoo.security.env.a.a(context));
        ((StringBuilder) (obj)).append("&k12=").append(locale.getLanguage());
        String s1 = telephonymanager.getSimCountryIso();
        if (!TextUtils.isEmpty(s1))
        {
            ((StringBuilder) (obj)).append("&k13=").append(s1.toUpperCase(Locale.US));
        } else
        {
            ((StringBuilder) (obj)).append("&k13=").append(locale.getCountry());
        }
        ((StringBuilder) (obj)).append("&k14=");
        ((StringBuilder) (obj)).append("&k15=");
        ((StringBuilder) (obj)).append("&k16=");
        ((StringBuilder) (obj)).append("&k17=").append(SharedPref.b(context, "g_subcid", ""));
        ((StringBuilder) (obj)).append("&k18=");
        s1 = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (TextUtils.isEmpty(s1))
        {
            ((StringBuilder) (obj)).append("&k19=").append("");
        } else
        {
            ((StringBuilder) (obj)).append("&k19=").append(s1.toLowerCase(Locale.US));
        }
        s1 = SharedPref.b(context, "gp_url", "");
        ((StringBuilder) (obj)).append("&k20=").append(URLEncoder.encode(s1));
        try
        {
            obj = URLEncoder.encode(Utils.encodeBase64(Utils.urlEncrypt(a(((StringBuilder) (obj)).toString().getBytes()))));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            h = false;
            return;
        }
        s1 = String.format(Locale.US, "http://%s/%s_%s%s?ver=%s&uiver=%s&parae=%s", new Object[] {
            a, b, Integer.valueOf(400), c, "1.0.8.3742", Integer.valueOf(400), obj
        });
        obj = new ByteArrayOutputStream();
        if (com.qihoo.security.g.a.a(httpclient, s1, ((java.io.OutputStream) (obj)), null) <= 0 || obj == null)
        {
            break MISSING_BLOCK_LABEL_595;
        }
        httpclient = ((ByteArrayOutputStream) (obj)).toString();
        httpclient = new JSONObject(httpclient);
        if (httpclient == null)
        {
            break MISSING_BLOCK_LABEL_587;
        }
        httpclient.getInt("retcode");
        SharedPref.a(context, "reg", true);
_L7:
        h = false;
        if (obj != null)
        {
            try
            {
                ((ByteArrayOutputStream) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
          goto _L1
        context;
        obj = null;
_L6:
        h = false;
        if (obj == null) goto _L1; else goto _L3
_L3:
        try
        {
            ((ByteArrayOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
        obj = obj2;
_L5:
        h = false;
        if (obj != null)
        {
            try
            {
                ((ByteArrayOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
        }
        throw context;
        context;
        if (true) goto _L5; else goto _L4
_L4:
        context;
          goto _L6
        context;
          goto _L7
        Exception exception;
        exception;
        s2 = s3;
        obj1 = obj;
          goto _L8
    }

    private static void d(Context context, JSONObject jsonobject)
    {
        int ai[] = k;
        int j1 = ai.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            int k1 = ai[i1];
            long l1 = b(context, k1);
            if (l1 > 0L)
            {
                try
                {
                    jsonobject.put(String.valueOf(k1), l1);
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
            }
            i1++;
        }
    }

    static void d(String s, int i1)
    {
        g(s, i1);
    }

    private static final void d(String s, long l1)
    {
        com.qihoo360.mobilesafe.share.d.a("sp_stat", s, l1);
    }

    private static final int e(String s, int i1)
    {
        return com.qihoo360.mobilesafe.share.d.b("sp_account", s, i1);
    }

    private static void e(Context context)
    {
        try
        {
            com.qihoo360.mobilesafe.share.d.a("sp_stat");
            com.qihoo360.mobilesafe.share.d.a("sp_account");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    private static void e(Context context, HttpClient httpclient)
    {
        while (!SharedPref.b(context, "reg", false) || !SharedPref.b(context, "user_ex_v3", true) || !SharedPref.b(context, "user_ex", true)) 
        {
            return;
        }
        g = true;
        Object obj = c(context);
        if (obj != null)
        {
            ((HashSet) (obj)).size();
            obj = ((HashSet) (obj)).iterator();
            int i1 = 0;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                String s = (String)((Iterator) (obj)).next();
                if (a(s, context, httpclient))
                {
                    i1++;
                    b(context, s);
                }
            } while (true);
            if (i1 > 0)
            {
                SharedPref.a(context, "last_stat", System.currentTimeMillis());
            }
        }
        g = false;
    }

    private static void e(Context context, JSONObject jsonobject)
    {
        context = m;
        int j1 = context.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            int k1 = context[i1];
            String s = h(k1);
            try
            {
                s = d(s, "");
                if (!TextUtils.isEmpty(s))
                {
                    jsonobject.put(String.valueOf(k1), new JSONArray(s));
                }
            }
            catch (Exception exception) { }
            i1++;
        }
    }

    private static final void e(String s, String s1)
    {
        com.qihoo360.mobilesafe.share.d.a("sp_stat", s, s1);
    }

    static boolean e(int i1)
    {
        return i(i1);
    }

    private static final int f(String s, int i1)
    {
        return com.qihoo360.mobilesafe.share.d.b("sp_stat", s, i1);
    }

    static String f(int i1)
    {
        return g(i1);
    }

    private static void f(Context context, HttpClient httpclient)
    {
        Object obj3;
        obj3 = null;
        break MISSING_BLOCK_LABEL_3;
_L1:
        Object obj;
        Object obj1;
        String s;
        String s1;
        Object obj4;
        Locale locale;
        do
        {
            return;
        } while (!SharedPref.b(context, "reg", false) || !SharedPref.b(context, "user_ex_v3", true) || !SharedPref.b(context, "user_ex", true));
        g = true;
        System.currentTimeMillis();
        obj4 = (TelephonyManager)context.getSystemService("phone");
        locale = Locale.getDefault();
        s = "";
        s1 = "";
        obj1 = "";
        obj = s;
        Object obj2 = ((TelephonyManager) (obj4)).getSimCountryIso();
        obj1 = obj2;
        obj = s;
        s = ((TelephonyManager) (obj4)).getSimOperator();
        obj1 = obj2;
        obj = s;
        if (s.length() <= 3)
        {
            break MISSING_BLOCK_LABEL_778;
        }
        obj1 = obj2;
        obj = s;
        obj4 = s.substring(0, 3);
        obj = obj4;
_L8:
        obj1 = s;
_L7:
        StringBuilder stringbuilder = (new StringBuilder(512)).append("Action=andr_ms");
        stringbuilder.append("&k1=").append(Utils.getMD5(com.qihoo360.mobilesafe.b.o.b(context)));
        stringbuilder.append("&k2=").append("Android");
        stringbuilder.append("&k3=");
        stringbuilder.append("&k4=");
        stringbuilder.append("&k5=").append("1.0.8.3742");
        stringbuilder.append("&k6=").append(Build.MODEL.trim().toLowerCase(Locale.US)).append("%").append(Build.MANUFACTURER.trim().toLowerCase(Locale.US)).append("%").append(android.os.Build.VERSION.SDK_INT).append("%").append(((String) (obj1))).append("%").append(((String) (obj)));
        stringbuilder.append("&k7=");
        stringbuilder.append("&k8=");
        stringbuilder.append("&k9=");
        stringbuilder.append("&k10=").append(400);
        stringbuilder.append("&k11=").append(com.qihoo.security.env.a.a(context));
        stringbuilder.append("&k12=").append(locale.getLanguage());
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            stringbuilder.append("&k13=").append(((String) (obj2)).toUpperCase(Locale.US));
        } else
        {
            stringbuilder.append("&k13=").append(locale.getCountry());
        }
        stringbuilder.append("&k14=");
        stringbuilder.append("&k15=").append(URLEncoder.encode(b(context)));
        stringbuilder.append("&k16=");
        stringbuilder.append("&k17=").append(SharedPref.b(context, "g_subcid", ""));
        stringbuilder.append("&k18=");
        obj = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            stringbuilder.append("&k19=").append("");
        } else
        {
            stringbuilder.append("&k19=").append(((String) (obj)).toLowerCase(Locale.US));
        }
        stringbuilder.append("&k20=");
        try
        {
            obj = URLEncoder.encode(Utils.encodeBase64(Utils.urlEncrypt(a(stringbuilder.toString().getBytes()))));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            g = false;
            return;
        }
        obj1 = String.format(Locale.US, "http://%s/%s_%s%s?ver=%s&uiver=%s&parae=%s", new Object[] {
            a, b, Integer.valueOf(400), c, "1.0.8.3742", Integer.valueOf(400), obj
        });
        obj = new ByteArrayOutputStream();
        if (com.qihoo.security.g.a.a(httpclient, ((String) (obj1)), ((java.io.OutputStream) (obj)), null) <= 0 || obj == null)
        {
            break MISSING_BLOCK_LABEL_650;
        }
        httpclient = ((ByteArrayOutputStream) (obj)).toString();
        httpclient = new JSONObject(httpclient);
        if (httpclient == null)
        {
            break MISSING_BLOCK_LABEL_637;
        }
        httpclient.getInt("retcode");
        SharedPref.a(context, "last_stat", System.currentTimeMillis());
        e(context);
_L6:
        g = false;
        if (obj != null)
        {
            try
            {
                ((ByteArrayOutputStream) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
          goto _L1
        context;
        obj = null;
_L5:
        g = false;
        if (obj == null) goto _L1; else goto _L2
_L2:
        try
        {
            ((ByteArrayOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
        obj = obj3;
_L4:
        g = false;
        if (obj != null)
        {
            try
            {
                ((ByteArrayOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpClient httpclient) { }
        }
        throw context;
        context;
        if (true) goto _L4; else goto _L3
_L3:
        context;
          goto _L5
        context;
          goto _L6
        Exception exception;
        exception;
        exception = ((Exception) (obj1));
        obj1 = obj;
        obj = s1;
          goto _L7
        obj = "";
          goto _L8
    }

    private static void f(Context context, JSONObject jsonobject)
    {
    }

    private static String g(int i1)
    {
        return String.format(Locale.US, "acnt%d", new Object[] {
            Integer.valueOf(i1)
        });
    }

    private static final void g(String s, int i1)
    {
        com.qihoo360.mobilesafe.share.d.a("sp_account", s, i1);
    }

    private static String h(int i1)
    {
        return String.format(Locale.US, "func%d", new Object[] {
            Integer.valueOf(i1)
        });
    }

    private static final void h(String s, int i1)
    {
        com.qihoo360.mobilesafe.share.d.a("sp_stat", s, i1);
    }

    private static boolean i(int i1)
    {
        boolean flag1 = false;
        int j1 = l.length;
        int ai[] = l;
        int k1 = ai.length;
        j1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j1 < k1)
                {
                    if (ai[j1] != i1)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j1++;
        } while (true);
    }

}
