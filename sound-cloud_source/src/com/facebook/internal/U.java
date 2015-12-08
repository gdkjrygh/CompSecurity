// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.C;
import com.facebook.D;
import com.facebook.E;
import com.facebook.GraphRequest;
import com.facebook.p;
import com.facebook.s;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.facebook.internal:
//            Y, V, R, W, 
//            d, t, X

public final class U
{
    public static final class a
    {

        String a;
        String b;
        Uri c;
        int d[];

        static int[] a(JSONArray jsonarray)
        {
            int ai[] = null;
            if (jsonarray != null)
            {
                int i1 = jsonarray.length();
                ai = new int[i1];
                int k = 0;
                do
                {
                    if (k >= i1)
                    {
                        break;
                    }
                    int l = jsonarray.optInt(k, -1);
                    int j = l;
                    if (l == -1)
                    {
                        String s1 = jsonarray.optString(k);
                        j = l;
                        if (!U.a(s1))
                        {
                            try
                            {
                                j = Integer.parseInt(s1);
                            }
                            catch (NumberFormatException numberformatexception)
                            {
                                U.a("FacebookSDK", numberformatexception);
                                j = -1;
                            }
                        }
                    }
                    ai[k] = j;
                    k++;
                } while (true);
            }
            return ai;
        }

        a(String s1, String s2, Uri uri, int ai[])
        {
            a = s1;
            b = s2;
            c = uri;
            d = ai;
        }
    }

    public static final class b
    {

        public boolean a;
        public String b;
        public boolean c;
        Map d;
        public t e;

        private b(boolean flag, String s1, boolean flag1, Map map, t t1)
        {
            a = flag;
            b = s1;
            c = flag1;
            d = map;
            e = t1;
        }

        b(boolean flag, String s1, boolean flag1, Map map, t t1, byte byte0)
        {
            this(flag, s1, flag1, map, t1);
        }
    }

    public static interface c
    {

        public abstract void a(p p1);

        public abstract void a(JSONObject jsonobject);
    }

    public static interface d
    {

        public abstract Object a(Object obj);
    }


    private static final String a[] = {
        "supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories"
    };
    private static Map b = new ConcurrentHashMap();
    private static AtomicBoolean c = new AtomicBoolean(false);
    private static int d = 0;
    private static long e = -1L;
    private static long f = -1L;
    private static long g = -1L;
    private static String h = "";
    private static String i = "NoCarrier";

    public static int a(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        int j = 0;
        BufferedInputStream bufferedinputstream = new BufferedInputStream(inputstream);
        byte abyte0[] = new byte[8192];
_L1:
        int k = bufferedinputstream.read(abyte0);
        if (k == -1)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        outputstream.write(abyte0, 0, k);
        j += k;
          goto _L1
        bufferedinputstream.close();
        if (inputstream != null)
        {
            inputstream.close();
        }
        return j;
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

    private static long a(double d1)
    {
        return Math.round(d1 / 1073741824D);
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

    public static a a(String s1, String s2, String s3)
    {
        if (a(s2) || a(s3))
        {
            return null;
        }
        s1 = (b)b.get(s1);
        if (s1 != null)
        {
            s1 = (Map)((b) (s1)).d.get(s2);
            if (s1 != null)
            {
                return (a)s1.get(s3);
            }
        }
        return null;
    }

    static b a(String s1, JSONObject jsonobject)
    {
        return b(s1, jsonobject);
    }

    public static b a(String s1, boolean flag)
    {
        if (!flag && b.containsKey(s1))
        {
            return (b)b.get(s1);
        }
        JSONObject jsonobject = h(s1);
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
        throws JSONException
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
                throw new p("Got an unexpected non-JSON object.");
            }
        } else
        {
            return jsonobject;
        }
    }

    public static String a(Context context)
    {
        Y.a(context, "context");
        s.a(context);
        return s.h();
    }

    public static String a(Uri uri)
    {
        if (uri == null)
        {
            return null;
        } else
        {
            return uri.toString();
        }
    }

    public static String a(InputStream inputstream)
        throws IOException
    {
        Object obj = null;
        inputstream = new BufferedInputStream(inputstream);
        InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
        char ac[];
        obj = new StringBuilder();
        ac = new char[2048];
_L3:
        int j = inputstreamreader.read(ac);
        if (j == -1) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj)).append(ac, 0, j);
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

    public static String a(String s1, String s2)
    {
        if (a(s1))
        {
            return s2;
        } else
        {
            return s1;
        }
    }

    private static String a(String s1, byte abyte0[])
    {
        int k;
        try
        {
            s1 = MessageDigest.getInstance(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        s1.update(abyte0);
        s1 = s1.digest();
        abyte0 = new StringBuilder();
        k = s1.length;
        for (int j = 0; j < k; j++)
        {
            byte byte0 = s1[j];
            abyte0.append(Integer.toHexString(byte0 >> 4 & 0xf));
            abyte0.append(Integer.toHexString(byte0 >> 0 & 0xf));
        }

        return abyte0.toString();
    }

    public static String a(JSONObject jsonobject, String s1)
    {
        if (jsonobject != null)
        {
            return jsonobject.optString(s1, "");
        } else
        {
            return "";
        }
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

    public static List a(List list, d d1)
    {
        if (list != null)
        {
            ArrayList arraylist = new ArrayList();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Object obj = d1.a(list.next());
                if (obj != null)
                {
                    arraylist.add(obj);
                }
            } while (true);
            if (arraylist.size() != 0)
            {
                return arraylist;
            }
        }
        return null;
    }

    public static List a(JSONArray jsonarray)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < jsonarray.length(); j++)
        {
            arraylist.add(jsonarray.getString(j));
        }

        return arraylist;
    }

    public static Map a(Parcel parcel)
    {
        int k = parcel.readInt();
        if (k >= 0) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Map) (obj));
_L2:
        HashMap hashmap = new HashMap();
        int j = 0;
        do
        {
            obj = hashmap;
            if (j >= k)
            {
                continue;
            }
            hashmap.put(parcel.readString(), parcel.readString());
            j++;
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
                int j = 0;
                while (j < jsonarray.length()) 
                {
                    Object obj = jsonarray.optJSONObject(j);
                    jsonobject = ((JSONObject) (obj)).optString("name");
                    if (a(((String) (jsonobject))))
                    {
                        jsonobject = null;
                    } else
                    {
                        jsonobject = jsonobject.split("\\|");
                        if (jsonobject.length != 2)
                        {
                            jsonobject = null;
                        } else
                        {
                            String s1 = jsonobject[0];
                            String s3 = jsonobject[1];
                            if (a(s1) || a(s3))
                            {
                                jsonobject = null;
                            } else
                            {
                                jsonobject = ((JSONObject) (obj)).optString("url");
                                if (!a(((String) (jsonobject))))
                                {
                                    jsonobject = Uri.parse(jsonobject);
                                } else
                                {
                                    jsonobject = null;
                                }
                                jsonobject = new a(s1, s3, jsonobject, a.a(((JSONObject) (obj)).optJSONArray("versions")));
                            }
                        }
                    }
                    if (jsonobject != null)
                    {
                        String s2 = ((a) (jsonobject)).a;
                        Map map = (Map)hashmap.get(s2);
                        obj = map;
                        if (map == null)
                        {
                            obj = new HashMap();
                            hashmap.put(s2, obj);
                        }
                        ((Map) (obj)).put(((a) (jsonobject)).b, jsonobject);
                    }
                    j++;
                }
            }
        }
        return hashmap;
    }

    public static void a()
    {
        s.b();
    }

    public static void a(Context context, String s1)
    {
        boolean flag = c.compareAndSet(false, true);
        if (!a(s1) && !b.containsKey(s1) && flag)
        {
            String s2 = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[] {
                s1
            });
            s.d().execute(new V(s1, context, s2));
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

    public static void a(Bundle bundle, String s1, Uri uri)
    {
        if (uri != null)
        {
            a(bundle, s1, uri.toString());
        }
    }

    public static void a(Bundle bundle, String s1, String s2)
    {
        if (!a(s2))
        {
            bundle.putString(s1, s2);
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

    public static void a(File file)
    {
        if (!file.exists())
        {
            return;
        }
        if (file.isDirectory())
        {
            File afile[] = file.listFiles();
            int k = afile.length;
            for (int j = 0; j < k; j++)
            {
                a(afile[j]);
            }

        }
        file.delete();
    }

    public static void a(String s1, c c1)
    {
        JSONObject jsonobject = R.a(s1);
        if (jsonobject != null)
        {
            c1.a(jsonobject);
            return;
        } else
        {
            c1 = new W(c1, s1);
            s1 = i(s1);
            s1.a(c1);
            c1 = new GraphRequest[1];
            c1[0] = s1;
            Y.a(c1, "requests");
            GraphRequest.b(new C(Arrays.asList(c1)));
            return;
        }
    }

    public static void a(String s1, Exception exception)
    {
        if (s.b() && s1 != null && exception != null)
        {
            (new StringBuilder()).append(exception.getClass().getSimpleName()).append(": ").append(exception.getMessage());
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
        throws JSONException
    {
        double d1;
        int j;
        int k;
        JSONArray jsonarray = new JSONArray();
        jsonarray.put("a2");
        if (e == -1L || System.currentTimeMillis() - e >= 0x1b7740L)
        {
            e = System.currentTimeMillis();
            float f1;
            Object obj;
            Exception exception;
            Object obj1;
            android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
            String s1;
            int l;
            try
            {
                TimeZone timezone = TimeZone.getDefault();
                h = timezone.getDisplayName(timezone.inDaylightTime(new Date()), 0);
            }
            catch (Exception exception4) { }
            if (i.equals("NoCarrier"))
            {
                try
                {
                    i = ((TelephonyManager)context.getSystemService("phone")).getNetworkOperatorName();
                }
                catch (Exception exception3) { }
            }
            try
            {
                if (d())
                {
                    StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    long l1 = statfs.getBlockCount();
                    f = (long)statfs.getBlockSize() * l1;
                }
                f = a(f);
            }
            catch (Exception exception2) { }
            try
            {
                if (d())
                {
                    StatFs statfs1 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    long l2 = statfs1.getAvailableBlocks();
                    g = (long)statfs1.getBlockSize() * l2;
                }
                g = a(g);
            }
            catch (Exception exception1) { }
        }
        s1 = context.getPackageName();
        k = -1;
        obj = "";
        j = k;
        obj1 = context.getPackageManager().getPackageInfo(s1, 0);
        j = k;
        k = ((PackageInfo) (obj1)).versionCode;
        j = k;
        obj1 = ((PackageInfo) (obj1)).versionName;
        j = k;
        obj = obj1;
_L3:
        jsonarray.put(s1);
        jsonarray.put(j);
        jsonarray.put(obj);
        jsonarray.put(android.os.Build.VERSION.RELEASE);
        jsonarray.put(Build.MODEL);
        try
        {
            obj = context.getResources().getConfiguration().locale;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            exception = Locale.getDefault();
        }
        jsonarray.put((new StringBuilder()).append(((Locale) (obj)).getLanguage()).append("_").append(((Locale) (obj)).getCountry()).toString());
        jsonarray.put(h);
        jsonarray.put(i);
        context = (WindowManager)context.getSystemService("window");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_604;
        }
        context = context.getDefaultDisplay();
        obj = new DisplayMetrics();
        context.getMetrics(((DisplayMetrics) (obj)));
        j = ((DisplayMetrics) (obj)).widthPixels;
        k = ((DisplayMetrics) (obj)).heightPixels;
        f1 = ((DisplayMetrics) (obj)).density;
        d1 = f1;
        l = k;
        k = j;
        j = l;
_L1:
        jsonarray.put(k);
        jsonarray.put(j);
        jsonarray.put(String.format("%.2f", new Object[] {
            Double.valueOf(d1)
        }));
        jsonarray.put(c());
        jsonarray.put(f);
        jsonarray.put(g);
        jsonobject.put("extinfo", jsonarray.toString());
        return;
        context;
        j = 0;
        k = 0;
_L2:
        d1 = 0.0D;
          goto _L1
        context;
        l = 0;
        k = j;
        j = l;
          goto _L2
        context;
        l = j;
        j = k;
        k = l;
          goto _L2
        namenotfoundexception;
          goto _L3
        d1 = 0.0D;
        j = 0;
        k = 0;
          goto _L1
    }

    public static void a(JSONObject jsonobject, com.facebook.internal.d d1, String s1, boolean flag)
        throws JSONException
    {
        boolean flag2 = true;
        if (d1 != null && d1.a != null)
        {
            jsonobject.put("attribution", d1.a);
        }
        if (d1 != null && d1.b != null)
        {
            jsonobject.put("advertiser_id", d1.b);
            boolean flag1;
            if (!d1.d)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            jsonobject.put("advertiser_tracking_enabled", flag1);
        }
        if (d1 != null && d1.c != null)
        {
            jsonobject.put("installer_package", d1.c);
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

    private static b b(String s1, JSONObject jsonobject)
    {
        JSONArray jsonarray = jsonobject.optJSONArray("android_sdk_error_categories");
        if (jsonarray != null) goto _L2; else goto _L1
_L1:
        Object obj = t.a();
_L4:
        jsonobject = new b(jsonobject.optBoolean("supports_implicit_sdk_logging", false), jsonobject.optString("gdpv4_nux_content", ""), jsonobject.optBoolean("gdpv4_nux_enabled", false), a(jsonobject.optJSONObject("android_dialog_configs")), ((t) (obj)), (byte)0);
        b.put(s1, jsonobject);
        return jsonobject;
_L2:
        if (jsonarray == null)
        {
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        int j = 0;
        obj = null;
        String s2 = null;
        String s3 = null;
        Map map = null;
        Map map1 = null;
        Map map2 = null;
        while (j < jsonarray.length()) 
        {
            JSONObject jsonobject1 = jsonarray.optJSONObject(j);
            Map map3 = map2;
            Map map4 = map1;
            Map map5 = map;
            String s4 = s3;
            String s5 = s2;
            Object obj1 = obj;
            if (jsonobject1 != null)
            {
                String s6 = jsonobject1.optString("name");
                map3 = map2;
                map4 = map1;
                map5 = map;
                s4 = s3;
                s5 = s2;
                obj1 = obj;
                if (s6 != null)
                {
                    if (s6.equalsIgnoreCase("other"))
                    {
                        s4 = jsonobject1.optString("recovery_message", null);
                        map3 = t.a(jsonobject1);
                        obj1 = obj;
                        s5 = s2;
                        map5 = map;
                        map4 = map1;
                    } else
                    if (s6.equalsIgnoreCase("transient"))
                    {
                        s5 = jsonobject1.optString("recovery_message", null);
                        map4 = t.a(jsonobject1);
                        map3 = map2;
                        map5 = map;
                        s4 = s3;
                        obj1 = obj;
                    } else
                    {
                        map3 = map2;
                        map4 = map1;
                        map5 = map;
                        s4 = s3;
                        s5 = s2;
                        obj1 = obj;
                        if (s6.equalsIgnoreCase("login_recoverable"))
                        {
                            obj1 = jsonobject1.optString("recovery_message", null);
                            map5 = t.a(jsonobject1);
                            map3 = map2;
                            map4 = map1;
                            s4 = s3;
                            s5 = s2;
                        }
                    }
                }
            }
            j++;
            map2 = map3;
            map1 = map4;
            map = map5;
            s3 = s4;
            s2 = s5;
            obj = obj1;
        }
        obj = new t(map2, map1, map, s3, s2, ((String) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String b(String s1)
    {
        return a("MD5", s1.getBytes());
    }

    public static transient List b(Object aobj[])
    {
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < 2; j++)
        {
            Object obj = aobj[j];
            if (obj != null)
            {
                arraylist.add(obj);
            }
        }

        return arraylist;
    }

    public static Set b(JSONArray jsonarray)
        throws JSONException
    {
        HashSet hashset = new HashSet();
        for (int j = 0; j < jsonarray.length(); j++)
        {
            hashset.add(jsonarray.getString(j));
        }

        return hashset;
    }

    static AtomicBoolean b()
    {
        return c;
    }

    public static JSONObject b(JSONObject jsonobject, String s1)
    {
        if (jsonobject != null)
        {
            return jsonobject.optJSONObject(s1);
        } else
        {
            return null;
        }
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
        int k = as.length;
        for (int j = 0; j < k; j++)
        {
            String as1[] = as[j].split("=");
            if (as1.length > 0)
            {
                context.setCookie(s1, (new StringBuilder()).append(as1[0].trim()).append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;").toString());
            }
        }

        context.removeExpiredCookie();
    }

    public static boolean b(Uri uri)
    {
        return uri != null && ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()));
    }

    private static int c()
    {
        if (d > 0)
        {
            return d;
        }
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            d = 1;
            return 1;
        }
        try
        {
            d = (new File("/sys/devices/system/cpu/")).listFiles(new X()).length;
        }
        catch (Exception exception) { }
        if (d <= 0)
        {
            d = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return d;
    }

    public static Bundle c(String s1)
    {
        Bundle bundle = new Bundle();
        if (a(s1)) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        s1 = s1.split("&");
        k = s1.length;
        j = 0;
_L8:
        if (j >= k) goto _L2; else goto _L3
_L3:
        String as[] = s1[j].split("=");
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
        j++;
        if (true) goto _L8; else goto _L7
_L7:
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

    public static JSONArray c(JSONObject jsonobject, String s1)
    {
        if (jsonobject != null)
        {
            return jsonobject.optJSONArray(s1);
        } else
        {
            return null;
        }
    }

    public static boolean c(Uri uri)
    {
        return uri != null && "content".equalsIgnoreCase(uri.getScheme());
    }

    public static void d(String s1)
    {
        if (s.b())
        {
            a(s1);
        }
    }

    private static boolean d()
    {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static boolean d(Uri uri)
    {
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public static long e(Uri uri)
    {
        uri = s.f().getContentResolver().query(uri, null, null, null, null);
        long l;
        int j = uri.getColumnIndex("_size");
        uri.moveToFirst();
        l = uri.getLong(j);
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

    public static b e(String s1)
    {
        if (s1 != null)
        {
            return (b)b.get(s1);
        } else
        {
            return null;
        }
    }

    public static JSONObject f(String s1)
    {
        JSONObject jsonobject = R.a(s1);
        if (jsonobject != null)
        {
            return jsonobject;
        }
        s1 = i(s1).a();
        if (((D) (s1)).b != null)
        {
            return null;
        } else
        {
            return ((D) (s1)).a;
        }
    }

    static JSONObject g(String s1)
    {
        return h(s1);
    }

    private static JSONObject h(String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", a));
        s1 = GraphRequest.b(s1);
        s1.h = true;
        s1.d = bundle;
        return s1.a().a;
    }

    private static GraphRequest i(String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", s1);
        return new GraphRequest(null, "me", bundle, E.a, null);
    }

}
