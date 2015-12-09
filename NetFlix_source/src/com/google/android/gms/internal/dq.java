// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            du, ds, dt, dv, 
//            dw

public final class dq
{
    private static final class a extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction()))
            {
                dq.o(true);
            } else
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
            {
                dq.o(false);
                return;
            }
        }

        private a()
        {
        }

    }


    private static final Object px = new Object();
    private static boolean re = true;
    private static String rf;
    private static boolean rg = false;

    public static String a(Readable readable)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder();
        CharBuffer charbuffer = CharBuffer.allocate(2048);
        do
        {
            int l = readable.read(charbuffer);
            if (l != -1)
            {
                charbuffer.flip();
                stringbuilder.append(charbuffer, 0, l);
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }

    private static JSONArray a(Collection collection)
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        for (collection = collection.iterator(); collection.hasNext(); a(jsonarray, collection.next())) { }
        return jsonarray;
    }

    static JSONArray a(Object aobj[])
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        int i1 = aobj.length;
        for (int l = 0; l < i1; l++)
        {
            a(jsonarray, aobj[l]);
        }

        return jsonarray;
    }

    private static JSONObject a(Bundle bundle)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        String s1;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); a(jsonobject, s1, bundle.get(s1)))
        {
            s1 = (String)iterator.next();
        }

        return jsonobject;
    }

    public static void a(Context context, String s1, WebSettings websettings)
    {
        websettings.setUserAgentString(b(context, s1));
    }

    public static void a(Context context, String s1, List list)
    {
        for (list = list.iterator(); list.hasNext(); (new du(context, s1, (String)list.next())).start()) { }
    }

    public static void a(Context context, String s1, boolean flag, HttpURLConnection httpurlconnection)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(flag);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", b(context, s1));
        httpurlconnection.setUseCaches(false);
    }

    public static void a(WebView webview)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            ds.a(webview);
        }
    }

    private static void a(JSONArray jsonarray, Object obj)
        throws JSONException
    {
        if (obj instanceof Bundle)
        {
            jsonarray.put(a((Bundle)obj));
            return;
        }
        if (obj instanceof Map)
        {
            jsonarray.put(p((Map)obj));
            return;
        }
        if (obj instanceof Collection)
        {
            jsonarray.put(a((Collection)obj));
            return;
        }
        if (obj instanceof Object[])
        {
            jsonarray.put(a((Object[])(Object[])obj));
            return;
        } else
        {
            jsonarray.put(obj);
            return;
        }
    }

    private static void a(JSONObject jsonobject, String s1, Object obj)
        throws JSONException
    {
        if (obj instanceof Bundle)
        {
            jsonobject.put(s1, a((Bundle)obj));
            return;
        }
        if (obj instanceof Map)
        {
            jsonobject.put(s1, p((Map)obj));
            return;
        }
        if (obj instanceof Collection)
        {
            if (s1 == null)
            {
                s1 = "null";
            }
            jsonobject.put(s1, a((Collection)obj));
            return;
        }
        if (obj instanceof Object[])
        {
            jsonobject.put(s1, a(((Collection) (Arrays.asList((Object[])(Object[])obj)))));
            return;
        } else
        {
            jsonobject.put(s1, obj);
            return;
        }
    }

    public static boolean a(PackageManager packagemanager, String s1, String s2)
    {
        return packagemanager.checkPermission(s2, s1) == 0;
    }

    public static boolean a(ClassLoader classloader, Class class1, String s1)
    {
        boolean flag;
        try
        {
            flag = class1.isAssignableFrom(Class.forName(s1, false, classloader));
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            return false;
        }
        return flag;
    }

    private static String b(Context context, String s1)
    {
label0:
        {
            synchronized (px)
            {
                if (rf == null)
                {
                    break label0;
                }
                context = rf;
            }
            return context;
        }
        if (android.os.Build.VERSION.SDK_INT < 17) goto _L2; else goto _L1
_L1:
        rf = dt.getDefaultUserAgent(context);
_L4:
        rf = (new StringBuilder()).append(rf).append(" (Mobile; ").append(s1).append(")").toString();
        context = rf;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
_L2:
        if (dv.bD())
        {
            break MISSING_BLOCK_LABEL_128;
        }
        dv.rp.post(new Runnable(context) {

            final Context pB;

            public void run()
            {
                synchronized (dq.bB())
                {
                    dq.s(dq.k(pB));
                    dq.bB().notifyAll();
                }
                return;
                exception;
                obj1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                pB = context;
                super();
            }
        });
_L5:
        context = rf;
        if (context != null) goto _L4; else goto _L3
_L3:
        px.wait();
          goto _L5
        context;
        context = rf;
        obj;
        JVM INSTR monitorexit ;
        return context;
        rf = j(context);
          goto _L4
    }

    public static Map b(Uri uri)
    {
        if (uri == null)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        Object obj = new UrlQuerySanitizer();
        ((UrlQuerySanitizer) (obj)).setAllowUnregisteredParamaters(true);
        ((UrlQuerySanitizer) (obj)).setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
        ((UrlQuerySanitizer) (obj)).parseUrl(uri.toString());
        for (uri = ((UrlQuerySanitizer) (obj)).getParameterList().iterator(); uri.hasNext(); hashmap.put(((android.net.UrlQuerySanitizer.ParameterValuePair) (obj)).mParameter, ((android.net.UrlQuerySanitizer.ParameterValuePair) (obj)).mValue))
        {
            obj = (android.net.UrlQuerySanitizer.ParameterValuePair)uri.next();
        }

        return hashmap;
    }

    public static void b(WebView webview)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            ds.b(webview);
        }
    }

    public static int bA()
    {
        return android.os.Build.VERSION.SDK_INT < 9 ? 1 : 7;
    }

    static Object bB()
    {
        return px;
    }

    public static boolean by()
    {
        return re;
    }

    public static int bz()
    {
        return android.os.Build.VERSION.SDK_INT < 9 ? 0 : 6;
    }

    public static boolean h(Context context)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        context = context.getPackageManager().resolveActivity(intent, 0x10000);
        if (context == null || ((ResolveInfo) (context)).activityInfo == null)
        {
            dw.z("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        boolean flag;
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x10) == 0)
        {
            dw.z(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "keyboard"
            }));
            flag = false;
        } else
        {
            flag = true;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x20) == 0)
        {
            dw.z(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "keyboardHidden"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x80) == 0)
        {
            dw.z(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "orientation"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x100) == 0)
        {
            dw.z(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "screenLayout"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x200) == 0)
        {
            dw.z(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "uiMode"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x400) == 0)
        {
            dw.z(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "screenSize"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x800) == 0)
        {
            dw.z(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "smallestScreenSize"
            }));
            return false;
        } else
        {
            return flag;
        }
    }

    public static void i(Context context)
    {
        if (rg)
        {
            return;
        } else
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.USER_PRESENT");
            intentfilter.addAction("android.intent.action.SCREEN_OFF");
            context.getApplicationContext().registerReceiver(new a(), intentfilter);
            rg = true;
            return;
        }
    }

    private static String j(Context context)
    {
        return (new WebView(context)).getSettings().getUserAgentString();
    }

    static String k(Context context)
    {
        return j(context);
    }

    static boolean o(boolean flag)
    {
        re = flag;
        return flag;
    }

    public static JSONObject p(Map map)
        throws JSONException
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            String s1;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); a(jsonobject, s1, map.get(s1)))
            {
                s1 = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new JSONException((new StringBuilder()).append("Could not convert map to JSON: ").append(map.getMessage()).toString());
        }
        return jsonobject;
    }

    public static String r(String s1)
    {
        return Uri.parse(s1).buildUpon().query(null).build().toString();
    }

    static String s(String s1)
    {
        rf = s1;
        return s1;
    }

}
