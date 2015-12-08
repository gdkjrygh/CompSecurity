// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.pandora.radio.data.u;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.f;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.cw.c;
import p.dd.ab;
import p.dd.z;
import p.df.a;

// Referenced classes of package com.pandora.radio.util:
//            NetworkUtil, l

public class i
{

    static Boolean a;

    public static int a(int j)
    {
        return (new GregorianCalendar()).get(1) - j;
    }

    public static int a(String s, String s1)
    {
        String s2 = s;
        if (s == null)
        {
            s2 = "";
        }
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return s2.compareTo(s);
    }

    public static int a(boolean flag)
    {
        return !flag ? 2 : 1;
    }

    public static String a()
    {
        switch (android.os.Build.VERSION.SDK_INT)
        {
        default:
            return "*";

        case 1: // '\001'
            return "1";

        case 2: // '\002'
            return "1.1";

        case 3: // '\003'
            return "1.5";

        case 4: // '\004'
            return "1.6";

        case 5: // '\005'
            return "2.0";

        case 6: // '\006'
            return "2.0.1";

        case 7: // '\007'
            return "2.1";

        case 8: // '\b'
            return "2.2";

        case 9: // '\t'
            return "2.3";

        case 10: // '\n'
            return "2.3.3";

        case 11: // '\013'
            return "3.0";

        case 12: // '\f'
            return "3.1";

        case 13: // '\r'
            return "3.2";

        case 14: // '\016'
            return "4.0";

        case 15: // '\017'
            return "4.0.3";

        case 16: // '\020'
            return "4.1";

        case 17: // '\021'
            return "4.2";

        case 18: // '\022'
            return "4.3";

        case 19: // '\023'
            return "4.4";
        }
    }

    public static transient String a(String s, String as[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag = true;
        int k = as.length;
        for (int j = 0; j < k;)
        {
            String s1 = as[j];
            boolean flag1 = flag;
            if (s1 != null)
            {
                flag1 = flag;
                if (!TextUtils.isEmpty(s1))
                {
                    if (!flag)
                    {
                        stringbuilder.append(s);
                    }
                    stringbuilder.append(s1);
                    flag1 = false;
                }
            }
            j++;
            flag = flag1;
        }

        return stringbuilder.toString();
    }

    public static Hashtable a(JSONObject jsonobject)
        throws JSONException
    {
        Hashtable hashtable = new Hashtable();
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Object obj = jsonobject.get(s);
            if (obj instanceof JSONArray)
            {
                hashtable.put(s, a((JSONArray)obj));
            } else
            if (obj instanceof JSONObject)
            {
                hashtable.put(s, a((JSONObject)obj));
            } else
            {
                hashtable.put(s, jsonobject.get(s));
            }
        }

        return hashtable;
    }

    private static Map a(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(s, bundle.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    private static Vector a(JSONArray jsonarray)
        throws JSONException
    {
        Vector vector = new Vector();
        if (jsonarray == null)
        {
            return vector;
        }
        int j = 0;
        while (j < jsonarray.length()) 
        {
            Object obj = jsonarray.get(j);
            if (obj instanceof JSONArray)
            {
                vector.add(a((JSONArray)obj));
            } else
            if (obj instanceof JSONObject)
            {
                vector.add(a((JSONObject)obj));
            } else
            {
                vector.add(jsonarray.get(j).toString());
            }
            j++;
        }
        return vector;
    }

    public static void a(android.content.SharedPreferences.Editor editor, SharedPreferences sharedpreferences, String s, int j)
    {
        if (sharedpreferences.contains(s))
        {
            editor.putInt(s, sharedpreferences.getInt(s, j));
        }
    }

    public static void a(android.content.SharedPreferences.Editor editor, SharedPreferences sharedpreferences, String s, long l1)
    {
        if (sharedpreferences.contains(s))
        {
            editor.putLong(s, sharedpreferences.getLong(s, l1));
        }
    }

    public static void a(android.content.SharedPreferences.Editor editor, SharedPreferences sharedpreferences, String s, String s1)
    {
        if (sharedpreferences.contains(s))
        {
            editor.putString(s, sharedpreferences.getString(s, s1));
        }
    }

    public static void a(android.content.SharedPreferences.Editor editor, SharedPreferences sharedpreferences, String s, boolean flag)
    {
        if (sharedpreferences.contains(s))
        {
            editor.putBoolean(s, sharedpreferences.getBoolean(s, flag));
        }
    }

    public static void a(String s, int j)
    {
        c.z.a(new ab(s, j, null));
    }

    public static boolean a(String s)
    {
        return s == null || s.length() == 0 || s.trim().length() == 0;
    }

    public static y b()
    {
        Object obj = c.z;
        String s = ((c) (obj)).x().b("CURRENT_STATION_TOKEN");
        if (a(s))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj = ((c) (obj)).y().a(((c) (obj)).s(), s);
        return ((y) (obj));
        Exception exception;
        exception;
        p.df.a.b("RadioUtil", "Error calling getLastPlayedStationData", exception);
        return null;
    }

    public static String b(String s)
    {
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "utf-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return s;
        }
        return s1;
    }

    public static String c(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return s;
        } else
        {
            return Base64.encodeToString(s.getBytes(), 0);
        }
    }

    public static void c()
    {
        c.z.x().c("CURRENT_STATION_TOKEN");
    }

    public static Bundle d(String s)
    {
        if (a(s))
        {
            return null;
        }
        Bundle bundle = new Bundle();
        String as[] = s.split(";");
        int j = 1;
        while (j < as.length) 
        {
            s = as[j].split("=");
            if (s.length != 1 && s.length != 2)
            {
                continue;
            }
            String s2 = s[0];
            String s1;
            if (s.length == 2)
            {
                s = s[1];
            } else
            {
                s = "";
            }
            s1 = s;
            if (bundle.containsKey(s2))
            {
                s1 = s;
                if (!a(s))
                {
                    s1 = s;
                    if (!a(bundle.getString(s2)))
                    {
                        s1 = (new StringBuilder()).append(bundle.getString(s2)).append(",").append(s).toString();
                    }
                }
            }
            bundle.putString(s2, s1);
            j++;
        }
        return bundle;
    }

    public static void d()
    {
        u u1 = c.z.t();
        if (c.z.C())
        {
            if (u1.f() > 20 || !c.z.u().b())
            {
                a("Network Error", 0x186a1);
                u1.d();
                return;
            } else
            {
                u1.e();
                return;
            }
        } else
        {
            c.z.a(new z());
            return;
        }
    }

    public static Map e(String s)
    {
        return a(d(s));
    }

    public static boolean e()
    {
        if (a == null)
        {
            a = Boolean.valueOf(((p.cx.u)c.z.p()).d().contains("tuner.pandora.com"));
        }
        return a.booleanValue();
    }

    public static String f(String s)
        throws NoSuchAlgorithmException
    {
        if (s == null)
        {
            throw new NullPointerException("input string cannot be null!");
        } else
        {
            MessageDigest messagedigest = MessageDigest.getInstance("SHA-256");
            messagedigest.update(s.getBytes());
            return new String(p.dv.a.a(messagedigest.digest()));
        }
    }

    public static boolean f()
    {
        return ((TelephonyManager)com.pandora.radio.util.l.a(c.z.s(), "phone")).getCallState() != 0;
    }

    public static long g()
    {
        int j = TimeZone.getDefault().getRawOffset();
        return System.currentTimeMillis() - (long)j;
    }

    public static String g(String s)
        throws NoSuchAlgorithmException
    {
        if (s == null)
        {
            throw new NullPointerException("input string cannot be null!");
        } else
        {
            MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
            messagedigest.update(s.getBytes());
            return new String(p.dv.a.a(messagedigest.digest()));
        }
    }
}
