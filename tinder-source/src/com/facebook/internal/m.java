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
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.g;
import com.facebook.j;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
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
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.facebook.internal:
//            n, k, a, e

public final class m
{
    public static final class a
    {

        String a;
        String b;
        private Uri c;
        private int d[];

        static int[] a(JSONArray jsonarray)
        {
            int ai[] = null;
            if (jsonarray != null)
            {
                int k1 = jsonarray.length();
                ai = new int[k1];
                int i1 = 0;
                do
                {
                    if (i1 >= k1)
                    {
                        break;
                    }
                    int j1 = jsonarray.optInt(i1, -1);
                    int l = j1;
                    if (j1 == -1)
                    {
                        String s = jsonarray.optString(i1);
                        l = j1;
                        if (!m.a(s))
                        {
                            try
                            {
                                l = Integer.parseInt(s);
                            }
                            catch (NumberFormatException numberformatexception)
                            {
                                m.a("FacebookSDK", numberformatexception);
                                l = -1;
                            }
                        }
                    }
                    ai[i1] = l;
                    i1++;
                } while (true);
            }
            return ai;
        }

        a(String s, String s1, Uri uri, int ai[])
        {
            a = s;
            b = s1;
            c = uri;
            d = ai;
        }
    }

    public static final class b
    {

        public boolean a;
        public String b;
        public boolean c;
        public e d;
        private Map e;

        private b(boolean flag, String s, boolean flag1, Map map, e e1)
        {
            a = flag;
            b = s;
            c = flag1;
            e = map;
            d = e1;
        }

        b(boolean flag, String s, boolean flag1, Map map, e e1, byte byte0)
        {
            this(flag, s, flag1, map, e1);
        }
    }

    public static interface c
    {

        public abstract void a(FacebookException facebookexception);

        public abstract void a(JSONObject jsonobject);
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
        int l = 0;
        BufferedInputStream bufferedinputstream = new BufferedInputStream(inputstream);
        byte abyte0[] = new byte[8192];
_L1:
        int i1 = bufferedinputstream.read(abyte0);
        if (i1 == -1)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        outputstream.write(abyte0, 0, i1);
        l += i1;
          goto _L1
        bufferedinputstream.close();
        if (inputstream != null)
        {
            inputstream.close();
        }
        return l;
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

    public static long a(Uri uri)
    {
        uri = com.facebook.g.g().getContentResolver().query(uri, null, null, null, null);
        long l1;
        int l = uri.getColumnIndex("_size");
        uri.moveToFirst();
        l1 = uri.getLong(l);
        if (uri != null)
        {
            uri.close();
        }
        return l1;
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

    public static Uri a(String s, String s1, Bundle bundle)
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("https");
        builder.authority(s);
        builder.path(s1);
        if (bundle != null)
        {
            s = bundle.keySet().iterator();
            do
            {
                if (!s.hasNext())
                {
                    break;
                }
                s1 = (String)s.next();
                Object obj = bundle.get(s1);
                if (obj instanceof String)
                {
                    builder.appendQueryParameter(s1, (String)obj);
                }
            } while (true);
        }
        return builder.build();
    }

    static b a(String s, JSONObject jsonobject)
    {
        return b(s, jsonobject);
    }

    public static b a(String s, boolean flag)
    {
        if (!flag && b.containsKey(s))
        {
            return (b)b.get(s);
        }
        JSONObject jsonobject = f(s);
        if (jsonobject == null)
        {
            return null;
        } else
        {
            return b(s, jsonobject);
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

    public static Object a(JSONObject jsonobject, String s, String s1)
        throws JSONException
    {
        jsonobject = ((JSONObject) (jsonobject.opt(s)));
        if (jsonobject != null && (jsonobject instanceof String))
        {
            jsonobject = ((JSONObject) ((new JSONTokener((String)jsonobject)).nextValue()));
        }
        if (jsonobject != null && !(jsonobject instanceof JSONObject) && !(jsonobject instanceof JSONArray))
        {
            if (s1 != null)
            {
                s = new JSONObject();
                s.putOpt(s1, jsonobject);
                return s;
            } else
            {
                throw new FacebookException("Got an unexpected non-JSON object.");
            }
        } else
        {
            return jsonobject;
        }
    }

    public static String a(Context context)
    {
        n.a(context, "context");
        com.facebook.g.a(context);
        return com.facebook.g.j();
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
        int l = inputstreamreader.read(ac);
        if (l == -1) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj)).append(ac, 0, l);
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

    private static String a(String s, byte abyte0[])
    {
        int i1;
        try
        {
            s = MessageDigest.getInstance(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        s.update(abyte0);
        s = s.digest();
        abyte0 = new StringBuilder();
        i1 = s.length;
        for (int l = 0; l < i1; l++)
        {
            byte byte0 = s[l];
            abyte0.append(Integer.toHexString(byte0 >> 4 & 0xf));
            abyte0.append(Integer.toHexString(byte0 >> 0 & 0xf));
        }

        return abyte0.toString();
    }

    public static String a(byte abyte0[])
    {
        return a("SHA-1", abyte0);
    }

    public static transient Method a(Class class1, String s, Class aclass[])
    {
        try
        {
            class1 = class1.getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public static transient Method a(String s, String s1, Class aclass[])
    {
        try
        {
            s = a(Class.forName(s), s1, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static transient Collection a(Object aobj[])
    {
        return Collections.unmodifiableCollection(Arrays.asList(aobj));
    }

    public static Date a(Bundle bundle, String s, Date date)
    {
        if (bundle == null)
        {
            return null;
        }
        bundle = ((Bundle) (bundle.get(s)));
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
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        for (int l = 0; l < jsonarray.length(); l++)
        {
            arraylist.add(jsonarray.getString(l));
        }

        return arraylist;
    }

    public static Map a(Parcel parcel)
    {
        int i1 = parcel.readInt();
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Map) (obj));
_L2:
        HashMap hashmap = new HashMap();
        int l = 0;
        do
        {
            obj = hashmap;
            if (l >= i1)
            {
                continue;
            }
            hashmap.put(parcel.readString(), parcel.readString());
            l++;
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
                int l = 0;
                while (l < jsonarray.length()) 
                {
                    Object obj = jsonarray.optJSONObject(l);
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
                            String s = jsonobject[0];
                            String s2 = jsonobject[1];
                            if (a(s) || a(s2))
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
                                jsonobject = new a(s, s2, jsonobject, a.a(((JSONObject) (obj)).optJSONArray("versions")));
                            }
                        }
                    }
                    if (jsonobject != null)
                    {
                        String s1 = ((a) (jsonobject)).a;
                        Map map = (Map)hashmap.get(s1);
                        obj = map;
                        if (map == null)
                        {
                            obj = new HashMap();
                            hashmap.put(s1, obj);
                        }
                        ((Map) (obj)).put(((a) (jsonobject)).b, jsonobject);
                    }
                    l++;
                }
            }
        }
        return hashmap;
    }

    static AtomicBoolean a()
    {
        return c;
    }

    public static void a(Context context, String s)
    {
        boolean flag = c.compareAndSet(false, true);
        if (!a(s) && !b.containsKey(s) && flag)
        {
            String s1 = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[] {
                s
            });
            com.facebook.g.e().execute(new Runnable(s, context, s1) {

                final String a;
                final Context b;
                final String c;

                public final void run()
                {
                    JSONObject jsonobject = m.e(a);
                    if (jsonobject != null)
                    {
                        m.a(a, jsonobject);
                        b.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).edit().putString(c, jsonobject.toString()).apply();
                    }
                    m.a().set(false);
                }

            
            {
                a = s;
                b = context;
                c = s1;
                super();
            }
            });
            context = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(s1, null);
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
                    b(s, context);
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

    public static void a(String s, c c1)
    {
        JSONObject jsonobject = k.a(s);
        if (jsonobject != null)
        {
            c1.a(jsonobject);
            return;
        } else
        {
            c1 = new com.facebook.GraphRequest.b(c1, s) {

                final c a;
                final String b;

                public final void a(j j1)
                {
                    if (j1.b != null)
                    {
                        a.a(j1.b.e);
                        return;
                    } else
                    {
                        k.a(b, j1.a);
                        a.a(j1.a);
                        return;
                    }
                }

            
            {
                a = c1;
                b = s;
                super();
            }
            };
            s = g(s);
            s.a(c1);
            s.b();
            return;
        }
    }

    public static void a(String s, Exception exception)
    {
        if (com.facebook.g.b())
        {
            Log.d(s, (new StringBuilder()).append(exception.getClass().getSimpleName()).append(": ").append(exception.getMessage()).toString());
        }
    }

    public static void a(String s, String s1)
    {
        if (com.facebook.g.b() && s1 != null)
        {
            Log.d(s, s1);
        }
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        if (com.facebook.g.b() && !a(s))
        {
            Log.d(s, s1, throwable);
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
        int l;
        int i1;
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
            String s;
            int j1;
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
                if (c())
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
                if (c())
                {
                    StatFs statfs1 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    long l2 = statfs1.getAvailableBlocks();
                    g = (long)statfs1.getBlockSize() * l2;
                }
                g = a(g);
            }
            catch (Exception exception1) { }
        }
        s = context.getPackageName();
        i1 = -1;
        obj = "";
        l = i1;
        obj1 = context.getPackageManager().getPackageInfo(s, 0);
        l = i1;
        i1 = ((PackageInfo) (obj1)).versionCode;
        l = i1;
        obj1 = ((PackageInfo) (obj1)).versionName;
        l = i1;
        obj = obj1;
_L3:
        jsonarray.put(s);
        jsonarray.put(l);
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
        l = ((DisplayMetrics) (obj)).widthPixels;
        i1 = ((DisplayMetrics) (obj)).heightPixels;
        f1 = ((DisplayMetrics) (obj)).density;
        d1 = f1;
        j1 = i1;
        i1 = l;
        l = j1;
_L1:
        jsonarray.put(i1);
        jsonarray.put(l);
        jsonarray.put(String.format("%.2f", new Object[] {
            Double.valueOf(d1)
        }));
        jsonarray.put(b());
        jsonarray.put(f);
        jsonarray.put(g);
        jsonobject.put("extinfo", jsonarray.toString());
        return;
        context;
        l = 0;
        i1 = 0;
_L2:
        d1 = 0.0D;
          goto _L1
        context;
        j1 = 0;
        i1 = l;
        l = j1;
          goto _L2
        context;
        j1 = l;
        l = i1;
        i1 = j1;
          goto _L2
        namenotfoundexception;
          goto _L3
        d1 = 0.0D;
        l = 0;
        i1 = 0;
          goto _L1
    }

    public static void a(JSONObject jsonobject, com.facebook.internal.a a1, String s, boolean flag)
        throws JSONException
    {
        boolean flag2 = true;
        if (a1 != null && a1.a != null)
        {
            jsonobject.put("attribution", a1.a);
        }
        if (a1 != null && a1.b != null)
        {
            jsonobject.put("advertiser_id", a1.b);
            boolean flag1;
            if (!a1.d)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            jsonobject.put("advertiser_tracking_enabled", flag1);
        }
        if (a1 != null && a1.c != null)
        {
            jsonobject.put("installer_package", a1.c);
        }
        jsonobject.put("anon_id", s);
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

    public static boolean a(String s)
    {
        return s == null || s.length() == 0;
    }

    public static boolean a(Collection collection)
    {
        return collection == null || collection.size() == 0;
    }

    private static int b()
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
            d = (new File("/sys/devices/system/cpu/")).listFiles(new FilenameFilter() {

                public final boolean accept(File file, String s)
                {
                    return Pattern.matches("cpu[0-9]+", s);
                }

            }).length;
        }
        catch (Exception exception) { }
        if (d <= 0)
        {
            d = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return d;
    }

    public static Bundle b(String s)
    {
        Bundle bundle = new Bundle();
        if (a(s)) goto _L2; else goto _L1
_L1:
        int l;
        int i1;
        s = s.split("&");
        i1 = s.length;
        l = 0;
_L8:
        if (l >= i1) goto _L2; else goto _L3
_L3:
        String as[] = s[l].split("=");
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
        l++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static b b(String s, JSONObject jsonobject)
    {
        JSONArray jsonarray = jsonobject.optJSONArray("android_sdk_error_categories");
        if (jsonarray != null) goto _L2; else goto _L1
_L1:
        Object obj = com.facebook.internal.e.a();
_L4:
        jsonobject = new b(jsonobject.optBoolean("supports_implicit_sdk_logging", false), jsonobject.optString("gdpv4_nux_content", ""), jsonobject.optBoolean("gdpv4_nux_enabled", false), a(jsonobject.optJSONObject("android_dialog_configs")), ((e) (obj)), (byte)0);
        b.put(s, jsonobject);
        return jsonobject;
_L2:
        if (jsonarray == null)
        {
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        int l = 0;
        obj = null;
        String s1 = null;
        String s2 = null;
        Map map = null;
        Map map1 = null;
        Map map2 = null;
        while (l < jsonarray.length()) 
        {
            JSONObject jsonobject1 = jsonarray.optJSONObject(l);
            Map map3 = map2;
            Map map4 = map1;
            Map map5 = map;
            String s3 = s2;
            String s4 = s1;
            Object obj1 = obj;
            if (jsonobject1 != null)
            {
                String s5 = jsonobject1.optString("name");
                map3 = map2;
                map4 = map1;
                map5 = map;
                s3 = s2;
                s4 = s1;
                obj1 = obj;
                if (s5 != null)
                {
                    if (s5.equalsIgnoreCase("other"))
                    {
                        s3 = jsonobject1.optString("recovery_message", null);
                        map3 = com.facebook.internal.e.a(jsonobject1);
                        obj1 = obj;
                        s4 = s1;
                        map5 = map;
                        map4 = map1;
                    } else
                    if (s5.equalsIgnoreCase("transient"))
                    {
                        s4 = jsonobject1.optString("recovery_message", null);
                        map4 = com.facebook.internal.e.a(jsonobject1);
                        map3 = map2;
                        map5 = map;
                        s3 = s2;
                        obj1 = obj;
                    } else
                    {
                        map3 = map2;
                        map4 = map1;
                        map5 = map;
                        s3 = s2;
                        s4 = s1;
                        obj1 = obj;
                        if (s5.equalsIgnoreCase("login_recoverable"))
                        {
                            obj1 = jsonobject1.optString("recovery_message", null);
                            map5 = com.facebook.internal.e.a(jsonobject1);
                            map3 = map2;
                            map4 = map1;
                            s3 = s2;
                            s4 = s1;
                        }
                    }
                }
            }
            l++;
            map2 = map3;
            map1 = map4;
            map = map5;
            s2 = s3;
            s1 = s4;
            obj = obj1;
        }
        obj = new e(map2, map1, map, s2, s1, ((String) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static transient List b(Object aobj[])
    {
        ArrayList arraylist = new ArrayList();
        for (int l = 0; l < 2; l++)
        {
            Object obj = aobj[l];
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

    private static void b(Context context, String s)
    {
        CookieSyncManager.createInstance(context).sync();
        context = CookieManager.getInstance();
        String s1 = context.getCookie(s);
        if (s1 == null)
        {
            return;
        }
        String as[] = s1.split(";");
        int i1 = as.length;
        for (int l = 0; l < i1; l++)
        {
            String as1[] = as[l].split("=");
            if (as1.length > 0)
            {
                context.setCookie(s, (new StringBuilder()).append(as1[0].trim()).append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;").toString());
            }
        }

        context.removeExpiredCookie();
    }

    public static b c(String s)
    {
        if (s != null)
        {
            return (b)b.get(s);
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

    private static boolean c()
    {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static JSONObject d(String s)
    {
        JSONObject jsonobject = k.a(s);
        if (jsonobject != null)
        {
            return jsonobject;
        }
        s = g(s).a();
        if (((j) (s)).b != null)
        {
            return null;
        } else
        {
            return ((j) (s)).a;
        }
    }

    static JSONObject e(String s)
    {
        return f(s);
    }

    private static JSONObject f(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", a));
        s = GraphRequest.a(s);
        s.g = true;
        s.d = bundle;
        return s.a().a;
    }

    private static GraphRequest g(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", s);
        return new GraphRequest(null, "me", bundle, HttpMethod.a, null);
    }

}
