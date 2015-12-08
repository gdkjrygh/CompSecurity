// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.an;
import com.facebook.ao;
import com.facebook.m;
import com.facebook.s;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.facebook.b:
//            ap, ar, ao, am, 
//            aj, aq, an, d, 
//            t

public final class al
{

    private static final String a[] = {
        "supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories"
    };
    private static Map b = new ConcurrentHashMap();
    private static AtomicBoolean c = new AtomicBoolean(false);

    public static int a(InputStream inputstream, OutputStream outputstream)
    {
        int i = 0;
        BufferedInputStream bufferedinputstream = new BufferedInputStream(inputstream);
        byte abyte0[] = new byte[8192];
_L1:
        int j = bufferedinputstream.read(abyte0);
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        outputstream.write(abyte0, 0, j);
        i += j;
          goto _L1
        if (bufferedinputstream != null)
        {
            bufferedinputstream.close();
        }
        if (inputstream != null)
        {
            inputstream.close();
        }
        return i;
        outputstream;
        bufferedinputstream = null;
_L3:
        if (bufferedinputstream != null)
        {
            bufferedinputstream.close();
        }
        if (inputstream != null)
        {
            inputstream.close();
        }
        throw outputstream;
        outputstream;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static long a(Uri uri)
    {
        uri = s.f().getContentResolver().query(uri, null, null, null, null);
        long l;
        int i = uri.getColumnIndex("_size");
        uri.moveToFirst();
        l = uri.getLong(i);
        if (uri != null)
        {
            uri.close();
        }
        return l;
        Exception exception;
        exception;
        uri = null;
_L2:
        if (uri != null)
        {
            uri.close();
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static Uri a(String s1, String s2, Bundle bundle)
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("https");
        builder.authority(s1);
        builder.path(s2);
        if (bundle != null)
        {
            s1 = bundle.keySet().iterator();
            do
            {
                if (!s1.hasNext())
                {
                    break;
                }
                s2 = (String)s1.next();
                Object obj = bundle.get(s2);
                if (obj instanceof String)
                {
                    builder.appendQueryParameter(s2, (String)obj);
                }
            } while (true);
        }
        return builder.build();
    }

    static ap a(String s1, JSONObject jsonobject)
    {
        return b(s1, jsonobject);
    }

    public static ap a(String s1, boolean flag)
    {
        if (!flag && b.containsKey(s1))
        {
            return (ap)b.get(s1);
        }
        JSONObject jsonobject = f(s1);
        if (jsonobject == null)
        {
            return null;
        } else
        {
            return b(s1, jsonobject);
        }
    }

    public static transient Object a(Object obj, Method method, Object aobj[])
    {
        try
        {
            obj = method.invoke(obj, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        return obj;
    }

    public static Object a(JSONObject jsonobject, String s1, String s2)
    {
        jsonobject = ((JSONObject) (jsonobject.opt(s1)));
        if (jsonobject != null && (jsonobject instanceof String))
        {
            jsonobject = ((JSONObject) ((new JSONTokener((String)jsonobject)).nextValue()));
        }
        if (jsonobject != null && !(jsonobject instanceof JSONObject) && !(jsonobject instanceof JSONArray))
        {
            if (s2 != null)
            {
                s1 = new JSONObject();
                s1.putOpt(s2, jsonobject);
                return s1;
            } else
            {
                throw new m("Got an unexpected non-JSON object.");
            }
        } else
        {
            return jsonobject;
        }
    }

    public static String a(Context context)
    {
        ar.a(context, "context");
        s.a(context);
        return s.h();
    }

    public static String a(InputStream inputstream)
    {
        Object obj = null;
        inputstream = new BufferedInputStream(inputstream);
        InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
        char ac[];
        obj = new StringBuilder();
        ac = new char[2048];
_L3:
        int i = inputstreamreader.read(ac);
        if (i == -1) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj)).append(ac, 0, i);
          goto _L3
        Exception exception;
        exception;
        obj = inputstream;
        inputstream = exception;
_L5:
        a(((Closeable) (obj)));
        a(((Closeable) (inputstreamreader)));
        throw inputstream;
_L2:
        obj = ((StringBuilder) (obj)).toString();
        a(((Closeable) (inputstream)));
        a(((Closeable) (inputstreamreader)));
        return ((String) (obj));
        inputstream;
        inputstreamreader = null;
        continue; /* Loop/switch isn't completed */
        exception;
        inputstreamreader = null;
        obj = inputstream;
        inputstream = exception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static String a(String s1, byte abyte0[])
    {
        try
        {
            s1 = MessageDigest.getInstance(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        return a(((MessageDigest) (s1)), abyte0);
    }

    private static String a(MessageDigest messagedigest, byte abyte0[])
    {
        messagedigest.update(abyte0);
        messagedigest = messagedigest.digest();
        abyte0 = new StringBuilder();
        int j = messagedigest.length;
        for (int i = 0; i < j; i++)
        {
            byte byte0 = messagedigest[i];
            abyte0.append(Integer.toHexString(byte0 >> 4 & 0xf));
            abyte0.append(Integer.toHexString(byte0 >> 0 & 0xf));
        }

        return abyte0.toString();
    }

    public static String a(byte abyte0[])
    {
        return a("SHA-1", abyte0);
    }

    public static transient Method a(Class class1, String s1, Class aclass[])
    {
        try
        {
            class1 = class1.getMethod(s1, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public static transient Method a(String s1, String s2, Class aclass[])
    {
        try
        {
            s1 = a(Class.forName(s1), s2, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        return s1;
    }

    public static transient Collection a(Object aobj[])
    {
        return Collections.unmodifiableCollection(Arrays.asList(aobj));
    }

    public static Date a(Bundle bundle, String s1, Date date)
    {
        if (bundle == null)
        {
            return null;
        }
        bundle = ((Bundle) (bundle.get(s1)));
        long l;
        if (bundle instanceof Long)
        {
            l = ((Long)bundle).longValue();
        } else
        if (bundle instanceof String)
        {
            try
            {
                l = Long.parseLong((String)bundle);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                return null;
            }
        } else
        {
            return null;
        }
        if (l == 0L)
        {
            return new Date(0x7fffffffffffffffL);
        } else
        {
            return new Date(l * 1000L + date.getTime());
        }
    }

    public static List a(JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(jsonarray.getString(i));
        }

        return arraylist;
    }

    public static Map a(Parcel parcel)
    {
        int j = parcel.readInt();
        if (j >= 0) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Map) (obj));
_L2:
        HashMap hashmap = new HashMap();
        int i = 0;
        do
        {
            obj = hashmap;
            if (i >= j)
            {
                continue;
            }
            hashmap.put(parcel.readString(), parcel.readString());
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static Map a(JSONObject jsonobject)
    {
        HashMap hashmap = new HashMap();
        if (jsonobject != null)
        {
            JSONArray jsonarray = jsonobject.optJSONArray("data");
            if (jsonarray != null)
            {
                int i = 0;
                while (i < jsonarray.length()) 
                {
                    com.facebook.b.ao ao1 = ao.a(jsonarray.optJSONObject(i));
                    if (ao1 != null)
                    {
                        String s1 = ao1.a();
                        Map map = (Map)hashmap.get(s1);
                        jsonobject = map;
                        if (map == null)
                        {
                            jsonobject = new HashMap();
                            hashmap.put(s1, jsonobject);
                        }
                        jsonobject.put(ao1.b(), ao1);
                    }
                    i++;
                }
            }
        }
        return hashmap;
    }

    static AtomicBoolean a()
    {
        return c;
    }

    public static void a(Context context, String s1)
    {
        boolean flag = c.compareAndSet(false, true);
        if (!a(s1) && !b.containsKey(s1) && flag)
        {
            String s2 = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[] {
                s1
            });
            s.d().execute(new am(s1, context, s2));
            context = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(s2, null);
            if (!a(((String) (context))))
            {
                try
                {
                    context = new JSONObject(context);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    a("FacebookSDK", ((Exception) (context)));
                    context = null;
                }
                if (context != null)
                {
                    b(s1, context);
                    return;
                }
            }
        }
    }

    public static void a(Parcel parcel, Map map)
    {
        if (map == null)
        {
            parcel.writeInt(-1);
        } else
        {
            parcel.writeInt(map.size());
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                parcel.writeString((String)entry.getKey());
                parcel.writeString((String)entry.getValue());
            }
        }
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static void a(String s1, aq aq1)
    {
        JSONObject jsonobject = aj.a(s1);
        if (jsonobject != null)
        {
            aq1.a(jsonobject);
            return;
        } else
        {
            aq1 = new com.facebook.b.an(aq1, s1);
            s1 = g(s1);
            s1.a(aq1);
            s1.h();
            return;
        }
    }

    public static void a(String s1, Exception exception)
    {
        if (s.b() && s1 != null && exception != null)
        {
            Log.d(s1, (new StringBuilder()).append(exception.getClass().getSimpleName()).append(": ").append(exception.getMessage()).toString());
        }
    }

    public static void a(String s1, String s2)
    {
        if (s.b() && s1 != null && s2 != null)
        {
            Log.d(s1, s2);
        }
    }

    public static void a(String s1, String s2, Throwable throwable)
    {
        if (s.b() && !a(s1))
        {
            Log.d(s1, s2, throwable);
        }
    }

    public static void a(URLConnection urlconnection)
    {
        if (urlconnection instanceof HttpURLConnection)
        {
            ((HttpURLConnection)urlconnection).disconnect();
        }
    }

    public static void a(JSONObject jsonobject, Context context)
    {
        String s1;
        JSONArray jsonarray;
        String s2;
        int i;
        int j;
        jsonarray = new JSONArray();
        jsonarray.put("a1");
        s2 = context.getPackageName();
        j = -1;
        s1 = "";
        i = j;
        context = context.getPackageManager().getPackageInfo(s2, 0);
        i = j;
        j = ((PackageInfo) (context)).versionCode;
        i = j;
        context = ((PackageInfo) (context)).versionName;
        i = j;
_L2:
        jsonarray.put(s2);
        jsonarray.put(i);
        jsonarray.put(context);
        jsonobject.put("extinfo", jsonarray.toString());
        return;
        context;
        context = s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(JSONObject jsonobject, d d1, String s1, boolean flag)
    {
        boolean flag2 = true;
        if (d1 != null && d1.a() != null)
        {
            jsonobject.put("attribution", d1.a());
        }
        if (d1 != null && d1.b() != null)
        {
            jsonobject.put("advertiser_id", d1.b());
            boolean flag1;
            if (!d1.c())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            jsonobject.put("advertiser_tracking_enabled", flag1);
        }
        jsonobject.put("anon_id", s1);
        if (!flag)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        jsonobject.put("application_tracking_enabled", flag);
    }

    public static boolean a(AccessToken accesstoken)
    {
        if (accesstoken != null)
        {
            return accesstoken.equals(AccessToken.a());
        } else
        {
            return false;
        }
    }

    public static boolean a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static boolean a(String s1)
    {
        return s1 == null || s1.length() == 0;
    }

    public static boolean a(Collection collection)
    {
        return collection == null || collection.size() == 0;
    }

    public static Bundle b(String s1)
    {
        Bundle bundle = new Bundle();
        if (a(s1)) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        s1 = s1.split("&");
        j = s1.length;
        i = 0;
_L8:
        if (i >= j) goto _L2; else goto _L3
_L3:
        String as[] = s1[i].split("=");
        if (as.length != 2) goto _L5; else goto _L4
_L4:
        bundle.putString(URLDecoder.decode(as[0], "UTF-8"), URLDecoder.decode(as[1], "UTF-8"));
          goto _L6
_L5:
        try
        {
            if (as.length == 1)
            {
                bundle.putString(URLDecoder.decode(as[0], "UTF-8"), "");
            }
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            a("FacebookSDK", unsupportedencodingexception);
        }
          goto _L6
_L2:
        return bundle;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static ap b(String s1, JSONObject jsonobject)
    {
        Object obj = jsonobject.optJSONArray("android_sdk_error_categories");
        if (obj == null)
        {
            obj = t.a();
        } else
        {
            obj = t.a(((JSONArray) (obj)));
        }
        jsonobject = new ap(jsonobject.optBoolean("supports_implicit_sdk_logging", false), jsonobject.optString("gdpv4_nux_content", ""), jsonobject.optBoolean("gdpv4_nux_enabled", false), a(jsonobject.optJSONObject("android_dialog_configs")), ((t) (obj)), null);
        b.put(s1, jsonobject);
        return jsonobject;
    }

    public static transient List b(Object aobj[])
    {
        ArrayList arraylist = new ArrayList();
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = aobj[i];
            if (obj != null)
            {
                arraylist.add(obj);
            }
        }

        return arraylist;
    }

    public static void b(Context context)
    {
        b(context, "facebook.com");
        b(context, ".facebook.com");
        b(context, "https://facebook.com");
        b(context, "https://.facebook.com");
    }

    private static void b(Context context, String s1)
    {
        CookieSyncManager.createInstance(context).sync();
        context = CookieManager.getInstance();
        String s2 = context.getCookie(s1);
        if (s2 == null)
        {
            return;
        }
        String as[] = s2.split(";");
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String as1[] = as[i].split("=");
            if (as1.length > 0)
            {
                context.setCookie(s1, (new StringBuilder()).append(as1[0].trim()).append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;").toString());
            }
        }

        context.removeExpiredCookie();
    }

    public static ap c(String s1)
    {
        if (s1 != null)
        {
            return (ap)b.get(s1);
        } else
        {
            return null;
        }
    }

    public static String c(Context context)
    {
        if (context == null)
        {
            return "null";
        }
        if (context == context.getApplicationContext())
        {
            return "unknown";
        } else
        {
            return context.getClass().getSimpleName();
        }
    }

    public static JSONObject d(String s1)
    {
        JSONObject jsonobject = aj.a(s1);
        if (jsonobject != null)
        {
            return jsonobject;
        }
        s1 = g(s1).g();
        if (s1.a() != null)
        {
            return null;
        } else
        {
            return s1.b();
        }
    }

    static JSONObject e(String s1)
    {
        return f(s1);
    }

    private static JSONObject f(String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", a));
        s1 = GraphRequest.a(null, s1, null);
        s1.a(true);
        s1.a(bundle);
        return s1.g().b();
    }

    private static GraphRequest g(String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", s1);
        return new GraphRequest(null, "me", bundle, ao.a, null);
    }

}
