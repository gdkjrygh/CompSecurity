// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import android.app.KeyguardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.e;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads.internal.util:
//            s, q

public class g
{
    public static class a
    {

        public String a;
        public String b;
        public boolean c;

        public a(String s1, String s2, boolean flag)
        {
            a = s1;
            b = s2;
            c = flag;
        }
    }


    private static final Uri a = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    private static final String b = com/facebook/ads/internal/util/g.getSimpleName();

    public g()
    {
    }

    public static e a(AdSize adsize)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[AdSize.values().length];
                try
                {
                    a[AdSize.INTERSTITIAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[AdSize.RECTANGLE_HEIGHT_250.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[AdSize.BANNER_HEIGHT_90.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[AdSize.BANNER_HEIGHT_50.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[adsize.ordinal()])
        {
        default:
            return e.b;

        case 1: // '\001'
            return e.f;

        case 2: // '\002'
            return e.e;

        case 3: // '\003'
            return e.d;

        case 4: // '\004'
            return e.c;
        }
    }

    public static a a(ContentResolver contentresolver)
    {
        Cursor cursor = contentresolver.query(a, new String[] {
            "aid", "androidid", "limit_tracking"
        }, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        contentresolver = cursor;
        if (cursor.moveToFirst()) goto _L3; else goto _L2
_L2:
        contentresolver = cursor;
        a a1 = new a(null, null, false);
        contentresolver = a1;
        if (cursor != null)
        {
            cursor.close();
            contentresolver = a1;
        }
_L5:
        return contentresolver;
_L3:
        contentresolver = cursor;
        a1 = new a(cursor.getString(cursor.getColumnIndex("aid")), cursor.getString(cursor.getColumnIndex("androidid")), Boolean.valueOf(cursor.getString(cursor.getColumnIndex("limit_tracking"))).booleanValue());
        contentresolver = a1;
        if (cursor == null) goto _L5; else goto _L4
_L4:
        cursor.close();
        return a1;
        contentresolver;
        cursor = null;
_L9:
        contentresolver = cursor;
        a1 = new a(null, null, false);
        contentresolver = a1;
        if (cursor == null) goto _L5; else goto _L6
_L6:
        cursor.close();
        return a1;
        Exception exception;
        exception;
        contentresolver = null;
_L8:
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        throw exception;
        exception;
        if (true) goto _L8; else goto _L7
_L7:
        contentresolver;
          goto _L9
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
        return obj;
    }

    public static String a(Map map)
    {
        JSONObject jsonobject = new JSONObject();
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            try
            {
                jsonobject.put((String)entry.getKey(), entry.getValue());
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
            }
        }

        return jsonobject.toString();
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

    public static void a(Context context, String s1)
    {
        if (AdSettings.isTestMode(context))
        {
            Log.d("FBAudienceNetworkLog", (new StringBuilder()).append(s1).append(" (displayed for test ads only)").toString());
        }
    }

    public static void a(DisplayMetrics displaymetrics, View view, AdSize adsize)
    {
        int i;
        if ((int)((float)displaymetrics.widthPixels / displaymetrics.density) >= adsize.getWidth())
        {
            i = displaymetrics.widthPixels;
        } else
        {
            i = (int)Math.ceil((float)adsize.getWidth() * displaymetrics.density);
        }
        displaymetrics = new android.widget.RelativeLayout.LayoutParams(i, (int)Math.ceil((float)adsize.getHeight() * displaymetrics.density));
        displaymetrics.addRule(14, -1);
        view.setLayoutParams(displaymetrics);
    }

    public static void a(View view, boolean flag, String s1)
    {
    }

    public static boolean a()
    {
        String s1 = AdSettings.getUrlPrefix();
        return !s.a(s1) && s1.endsWith(".sb");
    }

    public static boolean a(Context context)
    {
        if (!((PowerManager)context.getSystemService("power")).isScreenOn())
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = ((KeyguardManager)context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return !flag;
    }

    public static boolean a(Context context, View view, int i)
    {
        if (view == null)
        {
            a(view, false, "adView is null.");
            return false;
        }
        if (view.getParent() == null)
        {
            a(view, false, "adView has no parent.");
            return false;
        }
        if (view.getVisibility() != 0)
        {
            a(view, false, "adView is not set to VISIBLE.");
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 11 && view.getAlpha() < 0.9F)
        {
            a(view, false, "adView is too transparent.");
            return false;
        }
        int k = view.getWidth();
        int j = view.getHeight();
        int ai[] = new int[2];
        DisplayMetrics displaymetrics;
        try
        {
            view.getLocationOnScreen(ai);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            a(view, false, "Cannot get location on screen.");
            return false;
        }
        displaymetrics = context.getResources().getDisplayMetrics();
        if (ai[0] < 0 || displaymetrics.widthPixels - ai[0] < k)
        {
            a(view, false, "adView is not fully on screen horizontally.");
            return false;
        }
        i = (int)(((double)j * (100D - (double)i)) / 100D);
        if (ai[1] < 0 && Math.abs(ai[1]) > i)
        {
            a(view, false, "adView is not visible from the top.");
            return false;
        }
        if ((j + ai[1]) - displaymetrics.heightPixels > i)
        {
            a(view, false, "adView is not visible from the bottom.");
            return false;
        } else
        {
            a(view, true, "adView is visible.");
            return a(context);
        }
    }

    public static HttpClient b()
    {
        DefaultHttpClient defaulthttpclient;
        Object obj;
        defaulthttpclient = new DefaultHttpClient();
        obj = defaulthttpclient.getParams();
        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), 30000);
        HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj)), 30000);
        if (!a())
        {
            break MISSING_BLOCK_LABEL_144;
        }
        Object obj1 = KeyStore.getInstance(KeyStore.getDefaultType());
        ((KeyStore) (obj1)).load(null, null);
        obj1 = new q(((KeyStore) (obj1)));
        ((SSLSocketFactory) (obj1)).setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        HttpProtocolParams.setVersion(((org.apache.http.params.HttpParams) (obj)), HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(((org.apache.http.params.HttpParams) (obj)), "UTF-8");
        SchemeRegistry schemeregistry = new SchemeRegistry();
        schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeregistry.register(new Scheme("https", ((org.apache.http.conn.scheme.SocketFactory) (obj1)), 443));
        obj = new DefaultHttpClient(new ThreadSafeClientConnManager(((org.apache.http.params.HttpParams) (obj)), schemeregistry), ((org.apache.http.params.HttpParams) (obj)));
        return ((HttpClient) (obj));
        Exception exception;
        exception;
        return defaulthttpclient;
    }

}
