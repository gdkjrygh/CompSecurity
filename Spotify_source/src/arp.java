// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.FacebookException;
import com.facebook.Request;
import com.facebook.model.GraphObject;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class arp
{

    private static final String a[] = {
        "supports_attribution", "supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs"
    };
    private static Map b = new ConcurrentHashMap();
    private static AsyncTask c;

    public static Uri a(String s, String s1, Bundle bundle)
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("https");
        builder.authority(s);
        builder.path(s1);
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
        return builder.build();
    }

    static AsyncTask a()
    {
        c = null;
        return null;
    }

    public static arq a(String s, String s1, String s2)
    {
        if (a(s1) || a(s2))
        {
            return null;
        }
        s = (arr)b.get(s);
        if (s != null)
        {
            s = (Map)((arr) (s)).e.get(s1);
            if (s != null)
            {
                return (arq)s.get(s2);
            }
        }
        return null;
    }

    static arr a(String s, JSONObject jsonobject)
    {
        return b(s, jsonobject);
    }

    public static arr a(String s, boolean flag)
    {
        if (!flag && b.containsKey(s))
        {
            return (arr)b.get(s);
        }
        GraphObject graphobject = e(s);
        if (graphobject == null)
        {
            return null;
        } else
        {
            return b(s, graphobject.getInnerJSONObject());
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
        ars.a(context, "context");
        aph.c(context);
        return aph.i();
    }

    public static String a(GraphObject graphobject, String s)
    {
        Object obj = "";
        if (graphobject != null)
        {
            obj = graphobject.getProperty(s);
        }
        graphobject = ((GraphObject) (obj));
        if (!(obj instanceof String))
        {
            graphobject = "";
        }
        return (String)graphobject;
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

    public static String a(String s, String s1)
    {
        if (a(s))
        {
            return s1;
        } else
        {
            return s;
        }
    }

    private static String a(String s, byte abyte0[])
    {
        int j;
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
        j = s.length;
        for (int i = 0; i < j; i++)
        {
            byte byte0 = s[i];
            abyte0.append(Integer.toHexString(byte0 >> 4 & 0xf));
            abyte0.append(Integer.toHexString(byte0 & 0xf));
        }

        return abyte0.toString();
    }

    static String a(byte abyte0[])
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
                    Object obj = jsonarray.optJSONObject(i);
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
                                jsonobject = new arq(s, s2, jsonobject, arq.a(((JSONObject) (obj)).optJSONArray("versions")));
                            }
                        }
                    }
                    if (jsonobject != null)
                    {
                        String s1 = ((arq) (jsonobject)).a;
                        Map map = (Map)hashmap.get(s1);
                        obj = map;
                        if (map == null)
                        {
                            obj = new HashMap();
                            hashmap.put(s1, obj);
                        }
                        ((Map) (obj)).put(((arq) (jsonobject)).b, jsonobject);
                    }
                    i++;
                }
            }
        }
        return hashmap;
    }

    public static void a(Context context, String s)
    {
        if (!a(s) && !b.containsKey(s) && c == null)
        {
            String s1 = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[] {
                s
            });
            AsyncTask asynctask = new AsyncTask(s, context, s1) {

                private String a;
                private Context b;
                private String c;

                protected final Object doInBackground(Object aobj[])
                {
                    return arp.d(a);
                }

                protected final void onPostExecute(Object obj)
                {
                    obj = (GraphObject)obj;
                    if (obj != null)
                    {
                        obj = ((GraphObject) (obj)).getInnerJSONObject();
                        arp.a(a, ((JSONObject) (obj)));
                        b.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).edit().putString(c, ((JSONObject) (obj)).toString()).apply();
                    }
                    arp.a();
                }

            
            {
                a = s;
                b = context;
                c = s1;
                super();
            }
            };
            c = asynctask;
            asynctask.execute(null);
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

    public static void a(GraphObject graphobject, Context context)
    {
        String s;
        JSONArray jsonarray;
        String s1;
        int i;
        int j;
        jsonarray = new JSONArray();
        jsonarray.put("a1");
        s1 = context.getPackageName();
        j = -1;
        s = "";
        i = j;
        context = context.getPackageManager().getPackageInfo(s1, 0);
        i = j;
        j = ((PackageInfo) (context)).versionCode;
        i = j;
        context = ((PackageInfo) (context)).versionName;
        i = j;
_L2:
        jsonarray.put(s1);
        jsonarray.put(i);
        jsonarray.put(context);
        graphobject.setProperty("extinfo", jsonarray.toString());
        return;
        context;
        context = s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(GraphObject graphobject, apo apo1, String s, boolean flag)
    {
        boolean flag2 = true;
        if (apo1 != null && apo1.a != null)
        {
            graphobject.setProperty("attribution", apo1.a);
        }
        if (apo1 != null && apo1.b != null)
        {
            graphobject.setProperty("advertiser_id", apo1.b);
            boolean flag1;
            if (!apo1.c)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            graphobject.setProperty("advertiser_tracking_enabled", Boolean.valueOf(flag1));
        } else
        if (s != null)
        {
            graphobject.setProperty("advertiser_id", s);
        }
        if (!flag)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        graphobject.setProperty("application_tracking_enabled", Boolean.valueOf(flag));
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
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                a(afile[i]);
            }

        }
        file.delete();
    }

    public static void a(String s, Exception exception)
    {
        if (aph.b())
        {
            Log.d(s, (new StringBuilder()).append(exception.getClass().getSimpleName()).append(": ").append(exception.getMessage()).toString());
        }
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        if (aph.b() && !a(s))
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

    public static boolean a(Collection collection, Collection collection1)
    {
        boolean flag = false;
        if (collection1 == null || collection1.size() == 0)
        {
            if (collection == null || collection.size() == 0)
            {
                flag = true;
            }
            return flag;
        }
        collection1 = new HashSet(collection1);
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!collection1.contains(collection.next()))
            {
                return false;
            }
        }

        return true;
    }

    public static int[] a(int ai[], int ai1[])
    {
        int ai2[];
        int l;
        int i1;
        int j1;
        i1 = 0;
        if (ai == null)
        {
            return ai1;
        }
        if (ai1 == null)
        {
            return ai;
        }
        ai2 = new int[ai.length + ai1.length];
        j1 = 0;
        l = 0;
_L7:
        int i = l;
        if (j1 >= ai.length) goto _L2; else goto _L1
_L1:
        i = l;
        if (i1 >= ai1.length) goto _L2; else goto _L3
_L3:
        int k = ai[j1];
        int k1 = ai1[i1];
        int j;
        if (j1 < ai.length - 1)
        {
            i = ai[j1 + 1];
        } else
        {
            i = 0x7fffffff;
        }
        if (i1 < ai1.length - 1)
        {
            j = ai1[i1 + 1];
        } else
        {
            j = 0x7fffffff;
        }
        if (k >= k1) goto _L5; else goto _L4
_L4:
        if (i > k1)
        {
            if (i > j)
            {
                break MISSING_BLOCK_LABEL_297;
            }
            j1 += 2;
            k = k1;
            j = i;
            i = j1;
            k1 = i1;
        } else
        {
            i = j1 + 2;
            j = 0x7fffffff;
            k = 0x80000000;
            k1 = i1;
        }
_L12:
        i1 = k1;
        j1 = i;
        if (k == 0x80000000) goto _L7; else goto _L6
_L6:
        i1 = l + 1;
        ai2[l] = k;
        if (j == 0x7fffffff) goto _L9; else goto _L8
_L8:
        l = i1 + 1;
        ai2[i1] = j;
        i1 = k1;
        j1 = i;
          goto _L7
_L5:
        if (j <= k) goto _L11; else goto _L10
_L10:
label0:
        {
            if (j <= i)
            {
                break label0;
            }
            j1 += 2;
            j = i;
            k1 = i1;
            i = j1;
        }
          goto _L12
        i = k;
_L14:
        k = j;
        j = i;
        i = k;
_L13:
        k1 = i1 + 2;
        k = j;
        j = i;
        i = j1;
          goto _L12
_L9:
        i = i1;
_L2:
        return Arrays.copyOf(ai2, i);
_L11:
        i = 0x7fffffff;
        j = 0x80000000;
          goto _L13
        i = k1;
          goto _L14
    }

    private static arr b(String s, JSONObject jsonobject)
    {
        jsonobject = new arr(jsonobject.optBoolean("supports_attribution", false), jsonobject.optBoolean("supports_implicit_sdk_logging", false), jsonobject.optString("gdpv4_nux_content", ""), jsonobject.optBoolean("gdpv4_nux_enabled", false), a(jsonobject.optJSONObject("android_dialog_configs")), (byte)0);
        b.put(s, jsonobject);
        return jsonobject;
    }

    public static String b(Context context, String s)
    {
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (context == null)
        {
            return null;
        } else
        {
            return c("SHA-1", (new StringBuilder()).append(context).append(s).toString());
        }
    }

    public static String b(String s)
    {
        return c("MD5", s);
    }

    public static transient List b(Object aobj[])
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < 2; i++)
        {
            Object obj = aobj[i];
            if (obj != null)
            {
                arraylist.add(obj);
            }
        }

        return arraylist;
    }

    public static JSONObject b(GraphObject graphobject, String s)
    {
        if (graphobject == null)
        {
            return null;
        }
        graphobject = ((GraphObject) (graphobject.getProperty(s)));
        if (!(graphobject instanceof JSONObject))
        {
            return null;
        } else
        {
            return (JSONObject)graphobject;
        }
    }

    public static void b(Context context)
    {
        c(context, "facebook.com");
        c(context, ".facebook.com");
        c(context, "https://facebook.com");
        c(context, "https://.facebook.com");
    }

    public static void b(String s, String s1)
    {
        if (aph.b() && s1 != null)
        {
            Log.d(s, s1);
        }
    }

    public static Bundle c(String s)
    {
        Bundle bundle = new Bundle();
        if (a(s)) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        s = s.split("&");
        j = s.length;
        i = 0;
_L8:
        if (i >= j) goto _L2; else goto _L3
_L3:
        String as[] = s[i].split("=");
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

    private static String c(String s, String s1)
    {
        return a(s, s1.getBytes());
    }

    public static JSONArray c(GraphObject graphobject, String s)
    {
        if (graphobject == null)
        {
            return null;
        }
        graphobject = ((GraphObject) (graphobject.getProperty(s)));
        if (!(graphobject instanceof JSONArray))
        {
            return null;
        } else
        {
            return (JSONArray)graphobject;
        }
    }

    public static void c(Context context)
    {
        aqb.a(context);
    }

    private static void c(Context context, String s)
    {
        CookieSyncManager.createInstance(context).sync();
        context = CookieManager.getInstance();
        String s1 = context.getCookie(s);
        if (s1 == null)
        {
            return;
        }
        String as[] = s1.split(";");
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String as1[] = as[i].split("=");
            if (as1.length > 0)
            {
                context.setCookie(s, (new StringBuilder()).append(as1[0].trim()).append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;").toString());
            }
        }

        context.removeExpiredCookie();
    }

    static GraphObject d(String s)
    {
        return e(s);
    }

    public static String d(Context context)
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

    private static GraphObject e(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", a));
        s = Request.a(s);
        s.g = true;
        s.c = bundle;
        return s.a().a;
    }

}
