// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            es, eq, er, et, 
//            eu

public final class eo
{
    private static final class a extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction()))
            {
                eo.p(true);
            } else
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
            {
                eo.p(false);
                return;
            }
        }

        private a()
        {
        }

    }


    private static final Object qp = new Object();
    private static boolean sl = true;
    private static String sm;
    private static boolean sn = false;

    public static String a(Readable readable)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder();
        CharBuffer charbuffer = CharBuffer.allocate(2048);
        do
        {
            int i = readable.read(charbuffer);
            if (i != -1)
            {
                charbuffer.flip();
                stringbuilder.append(charbuffer, 0, i);
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
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            a(jsonarray, aobj[i]);
        }

        return jsonarray;
    }

    public static void a(Context context, String s, WebSettings websettings)
    {
        websettings.setUserAgentString(c(context, s));
    }

    public static void a(Context context, String s, List list)
    {
        for (list = list.iterator(); list.hasNext(); (new es(context, s, (String)list.next())).start()) { }
    }

    public static void a(Context context, String s, boolean flag, HttpURLConnection httpurlconnection)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(flag);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", c(context, s));
        httpurlconnection.setUseCaches(false);
    }

    public static void a(WebView webview)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            eq.a(webview);
        }
    }

    private static void a(JSONArray jsonarray, Object obj)
        throws JSONException
    {
        if (obj instanceof Bundle)
        {
            jsonarray.put(b((Bundle)obj));
            return;
        }
        if (obj instanceof Map)
        {
            jsonarray.put(o((Map)obj));
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

    private static void a(JSONObject jsonobject, String s, Object obj)
        throws JSONException
    {
        if (obj instanceof Bundle)
        {
            jsonobject.put(s, b((Bundle)obj));
            return;
        }
        if (obj instanceof Map)
        {
            jsonobject.put(s, o((Map)obj));
            return;
        }
        if (obj instanceof Collection)
        {
            if (s == null)
            {
                s = "null";
            }
            jsonobject.put(s, a((Collection)obj));
            return;
        }
        if (obj instanceof Object[])
        {
            jsonobject.put(s, a(((Collection) (Arrays.asList((Object[])(Object[])obj)))));
            return;
        } else
        {
            jsonobject.put(s, obj);
            return;
        }
    }

    public static boolean a(PackageManager packagemanager, String s, String s1)
    {
        return packagemanager.checkPermission(s1, s) == 0;
    }

    public static boolean a(ClassLoader classloader, Class class1, String s)
    {
        boolean flag;
        try
        {
            flag = class1.isAssignableFrom(Class.forName(s, false, classloader));
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            return false;
        }
        return flag;
    }

    private static JSONObject b(Bundle bundle)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); a(jsonobject, s, bundle.get(s)))
        {
            s = (String)iterator.next();
        }

        return jsonobject;
    }

    public static void b(WebView webview)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            eq.b(webview);
        }
    }

    public static boolean bQ()
    {
        return sl;
    }

    public static int bR()
    {
        return android.os.Build.VERSION.SDK_INT < 9 ? 0 : 6;
    }

    public static int bS()
    {
        return android.os.Build.VERSION.SDK_INT < 9 ? 1 : 7;
    }

    public static String bT()
    {
        Object obj;
        byte abyte0[];
        byte abyte1[];
        int i;
        obj = UUID.randomUUID();
        abyte0 = BigInteger.valueOf(((UUID) (obj)).getLeastSignificantBits()).toByteArray();
        abyte1 = BigInteger.valueOf(((UUID) (obj)).getMostSignificantBits()).toByteArray();
        obj = (new BigInteger(1, abyte0)).toString();
        i = 0;
_L2:
        if (i >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1;
        obj1 = MessageDigest.getInstance("MD5");
        ((MessageDigest) (obj1)).update(abyte0);
        ((MessageDigest) (obj1)).update(abyte1);
        byte abyte2[] = new byte[8];
        System.arraycopy(((MessageDigest) (obj1)).digest(), 0, abyte2, 0, 8);
        obj1 = (new BigInteger(1, abyte2)).toString();
        obj = obj1;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return ((String) (obj));
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
          goto _L3
    }

    static Object bU()
    {
        return qp;
    }

    private static String c(Context context, String s)
    {
label0:
        {
            synchronized (qp)
            {
                if (sm == null)
                {
                    break label0;
                }
                context = sm;
            }
            return context;
        }
        if (android.os.Build.VERSION.SDK_INT < 17) goto _L2; else goto _L1
_L1:
        sm = er.getDefaultUserAgent(context);
_L4:
        sm = (new StringBuilder()).append(sm).append(" (Mobile; ").append(s).append(")").toString();
        context = sm;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
_L2:
        if (et.bW())
        {
            break MISSING_BLOCK_LABEL_130;
        }
        et.sv.post(new Runnable(context) {

            final Context qu;

            public void run()
            {
                synchronized (eo.bU())
                {
                    eo.w(eo.q(qu));
                    eo.bU().notifyAll();
                }
                return;
                exception;
                obj1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                qu = context;
                super();
            }
        });
_L5:
        context = sm;
        if (context != null) goto _L4; else goto _L3
_L3:
        qp.wait();
          goto _L5
        context;
        context = sm;
        obj;
        JVM INSTR monitorexit ;
        return context;
        sm = o(context);
          goto _L4
    }

    public static Map c(Uri uri)
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

    public static boolean m(Context context)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        context = context.getPackageManager().resolveActivity(intent, 0x10000);
        if (context == null || ((ResolveInfo) (context)).activityInfo == null)
        {
            eu.D("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        boolean flag;
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x10) == 0)
        {
            eu.D(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "keyboard"
            }));
            flag = false;
        } else
        {
            flag = true;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x20) == 0)
        {
            eu.D(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "keyboardHidden"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x80) == 0)
        {
            eu.D(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "orientation"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x100) == 0)
        {
            eu.D(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "screenLayout"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x200) == 0)
        {
            eu.D(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "uiMode"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x400) == 0)
        {
            eu.D(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "screenSize"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x800) == 0)
        {
            eu.D(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "smallestScreenSize"
            }));
            return false;
        } else
        {
            return flag;
        }
    }

    public static void n(Context context)
    {
        if (sn)
        {
            return;
        } else
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.USER_PRESENT");
            intentfilter.addAction("android.intent.action.SCREEN_OFF");
            context.getApplicationContext().registerReceiver(new a(), intentfilter);
            sn = true;
            return;
        }
    }

    private static String o(Context context)
    {
        return (new WebView(context)).getSettings().getUserAgentString();
    }

    public static JSONObject o(Map map)
        throws JSONException
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); a(jsonobject, s, map.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new JSONException((new StringBuilder()).append("Could not convert map to JSON: ").append(map.getMessage()).toString());
        }
        return jsonobject;
    }

    public static int p(Context context)
    {
        int i = 0;
        int j;
        if (context instanceof Activity)
        {
            context = ((Activity)context).getWindow();
            Rect rect = new Rect();
            context.getDecorView().getWindowVisibleDisplayFrame(rect);
            j = rect.top;
            i = context.findViewById(0x1020002).getTop() - j;
        } else
        {
            j = 0;
        }
        return i + j;
    }

    static boolean p(boolean flag)
    {
        sl = flag;
        return flag;
    }

    static String q(Context context)
    {
        return o(context);
    }

    public static String v(String s)
    {
        return Uri.parse(s).buildUpon().query(null).build().toString();
    }

    static String w(String s)
    {
        sm = s;
        return s;
    }

}
