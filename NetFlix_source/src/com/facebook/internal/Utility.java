// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.FacebookException;
import com.facebook.Request;
import com.facebook.Response;
import com.facebook.model.GraphObject;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class Utility
{

    private static final String APPLICATION_FIELDS = "fields";
    public static final int DEFAULT_STREAM_BUFFER_SIZE = 8192;
    private static final String HASH_ALGORITHM_MD5 = "MD5";
    private static final Object LOCK = new Object();
    static final String LOG_TAG = "FacebookSDK";
    private static final String SUPPORTS_ATTRIBUTION = "supports_attribution";
    private static final String URL_SCHEME = "https";
    private static volatile boolean attributionAllowedForLastAppChecked = false;
    private static volatile String lastAppCheckedForAttributionStatus = "";

    public Utility()
    {
    }

    public static transient ArrayList arrayList(Object aobj[])
    {
        ArrayList arraylist = new ArrayList(aobj.length);
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(aobj[i]);
        }

        return arraylist;
    }

    public static Uri buildUri(String s, String s1, Bundle bundle)
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

    private static void clearCookiesForDomain(Context context, String s)
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

    public static void clearFacebookCookies(Context context)
    {
        clearCookiesForDomain(context, "facebook.com");
        clearCookiesForDomain(context, ".facebook.com");
        clearCookiesForDomain(context, "https://facebook.com");
        clearCookiesForDomain(context, "https://.facebook.com");
    }

    public static void closeQuietly(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    static Map convertJSONObjectToHashMap(JSONObject jsonobject)
    {
        HashMap hashmap;
        JSONArray jsonarray;
        int i;
        hashmap = new HashMap();
        jsonarray = jsonobject.names();
        i = 0;
_L3:
        if (i >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        Object obj1;
        String s;
        s = jsonarray.getString(i);
        obj1 = jsonobject.get(s);
        Object obj = obj1;
        try
        {
            if (obj1 instanceof JSONObject)
            {
                obj = convertJSONObjectToHashMap((JSONObject)obj1);
            }
            hashmap.put(s, obj);
        }
        catch (JSONException jsonexception) { }
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        return hashmap;
    }

    public static void disconnectQuietly(URLConnection urlconnection)
    {
        if (urlconnection instanceof HttpURLConnection)
        {
            ((HttpURLConnection)urlconnection).disconnect();
        }
    }

    public static String getMetadataApplicationId(Context context)
    {
        context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        if (((ApplicationInfo) (context)).metaData == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        context = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ApplicationId");
        return context;
        context;
        return null;
    }

    public static Object getStringPropertyAsJSON(JSONObject jsonobject, String s, String s1)
        throws JSONException
    {
        s = ((String) (jsonobject.opt(s)));
        jsonobject = s;
        if (s != null)
        {
            jsonobject = s;
            if (s instanceof String)
            {
                jsonobject = ((JSONObject) ((new JSONTokener((String)s)).nextValue()));
            }
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

    public static boolean isNullOrEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public static boolean isNullOrEmpty(Collection collection)
    {
        return collection == null || collection.size() == 0;
    }

    public static boolean isSubset(Collection collection, Collection collection1)
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

    public static void logd(String s, Exception exception)
    {
    }

    public static void logd(String s, String s1)
    {
    }

    static String md5hash(String s)
    {
        Object obj;
        int j;
        try
        {
            obj = MessageDigest.getInstance("MD5");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        ((MessageDigest) (obj)).update(s.getBytes());
        s = ((MessageDigest) (obj)).digest();
        obj = new StringBuilder();
        j = s.length;
        for (int i = 0; i < j; i++)
        {
            byte byte0 = s[i];
            ((StringBuilder) (obj)).append(Integer.toHexString(byte0 >> 4 & 0xf));
            ((StringBuilder) (obj)).append(Integer.toHexString(byte0 >> 0 & 0xf));
        }

        return ((StringBuilder) (obj)).toString();
    }

    public static void putObjectInBundle(Bundle bundle, String s, Object obj)
    {
        if (obj instanceof String)
        {
            bundle.putString(s, (String)obj);
            return;
        }
        if (obj instanceof Parcelable)
        {
            bundle.putParcelable(s, (Parcelable)obj);
            return;
        }
        if (obj instanceof byte[])
        {
            bundle.putByteArray(s, (byte[])(byte[])obj);
            return;
        } else
        {
            throw new FacebookException("attempted to add unsupported type to Bundle");
        }
    }

    public static boolean queryAppAttributionSupportAndWait(String s)
    {
label0:
        {
            boolean flag;
            synchronized (LOCK)
            {
                if (!s.equals(lastAppCheckedForAttributionStatus))
                {
                    break label0;
                }
                flag = attributionAllowedForLastAppChecked;
            }
            return flag;
        }
        Object obj;
        Object obj2;
        obj = new Bundle();
        ((Bundle) (obj)).putString("fields", "supports_attribution");
        obj2 = Request.newGraphPathRequest(null, s, null);
        ((Request) (obj2)).setParameters(((Bundle) (obj)));
        obj2 = ((Request) (obj2)).executeAndWait().getGraphObject();
        obj = Boolean.valueOf(false);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        obj = ((GraphObject) (obj2)).getProperty("supports_attribution");
        if (!(obj instanceof Boolean))
        {
            obj = Boolean.valueOf(false);
        }
        lastAppCheckedForAttributionStatus = s;
        boolean flag1;
        if (((Boolean)obj).booleanValue())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        attributionAllowedForLastAppChecked = flag1;
        flag1 = attributionAllowedForLastAppChecked;
        obj1;
        JVM INSTR monitorexit ;
        return flag1;
        s;
        obj1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static String readStreamToString(InputStream inputstream)
        throws IOException
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        inputstream = new BufferedInputStream(inputstream);
        obj = new InputStreamReader(inputstream);
        char ac[];
        obj1 = new StringBuilder();
        ac = new char[2048];
_L3:
        int i = ((InputStreamReader) (obj)).read(ac);
        if (i == -1) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj1)).append(ac, 0, i);
          goto _L3
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
_L5:
        closeQuietly(inputstream);
        closeQuietly(((Closeable) (obj1)));
        throw obj;
_L2:
        obj1 = ((StringBuilder) (obj1)).toString();
        closeQuietly(inputstream);
        closeQuietly(((Closeable) (obj)));
        return ((String) (obj1));
        exception;
        inputstream = ((InputStream) (obj));
        obj = exception;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean stringsEqualOrEmpty(String s, String s1)
    {
        boolean flag = TextUtils.isEmpty(s);
        boolean flag1 = TextUtils.isEmpty(s1);
        if (flag && flag1)
        {
            return true;
        }
        if (!flag && !flag1)
        {
            return s.equals(s1);
        } else
        {
            return false;
        }
    }

    public static transient Collection unmodifiableCollection(Object aobj[])
    {
        return Collections.unmodifiableCollection(Arrays.asList(aobj));
    }

}
