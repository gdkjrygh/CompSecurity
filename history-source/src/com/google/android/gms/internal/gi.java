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
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gr, gp, gm, go, 
//            gq

public final class gi
{
    private static final class a extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction()))
            {
                gi.y(true);
            } else
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
            {
                gi.y(false);
                return;
            }
        }

        private a()
        {
        }

    }


    private static final Object ut = new Object();
    private static final SimpleDateFormat wB[] = {
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"), new SimpleDateFormat("yyyyMMdd")
    };
    private static boolean wC = true;
    private static String wD;
    private static boolean wE = false;

    public static String L(String s1)
    {
        return Uri.parse(s1).buildUpon().query(null).build().toString();
    }

    public static int M(String s1)
    {
        int i;
        try
        {
            i = Integer.parseInt(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            gr.W((new StringBuilder()).append("Could not parse value:").append(s1).toString());
            return 0;
        }
        return i;
    }

    public static boolean N(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return false;
        } else
        {
            return s1.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
        }
    }

    public static long O(String s1)
    {
        SimpleDateFormat asimpledateformat[];
        int i;
        int j;
        i = 0;
        if (TextUtils.isEmpty(s1))
        {
            return -1L;
        }
        asimpledateformat = wB;
        j = asimpledateformat.length;
_L2:
        SimpleDateFormat simpledateformat;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        simpledateformat = asimpledateformat[i];
        long l;
        simpledateformat.setLenient(false);
        simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
        l = simpledateformat.parse(s1).getTime();
        return l;
        ParseException parseexception;
        parseexception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        long l1;
        try
        {
            l1 = Long.parseLong(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return -1L;
        }
        return l1;
    }

    static String P(String s1)
    {
        wD = s1;
        return s1;
    }

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

    public static void a(Context context, String s1, WebSettings websettings)
    {
        websettings.setUserAgentString(c(context, s1));
    }

    public static void a(Context context, String s1, List list)
    {
        for (list = list.iterator(); list.hasNext(); (new gp(context, s1, (String)list.next())).start()) { }
    }

    public static void a(Context context, String s1, List list, String s2)
    {
        for (list = list.iterator(); list.hasNext(); (new gp(context, s1, (String)list.next(), s2)).start()) { }
    }

    public static void a(Context context, String s1, boolean flag, HttpURLConnection httpurlconnection)
    {
        a(context, s1, flag, httpurlconnection, false);
    }

    public static void a(Context context, String s1, boolean flag, HttpURLConnection httpurlconnection, String s2)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(flag);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", s2);
        httpurlconnection.setUseCaches(false);
    }

    public static void a(Context context, String s1, boolean flag, HttpURLConnection httpurlconnection, boolean flag1)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(flag);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", c(context, s1));
        httpurlconnection.setUseCaches(flag1);
    }

    public static void a(WebView webview)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            gm.a(webview);
        }
    }

    private static void a(JSONArray jsonarray, Object obj)
        throws JSONException
    {
        if (obj instanceof Bundle)
        {
            jsonarray.put(c((Bundle)obj));
            return;
        }
        if (obj instanceof Map)
        {
            jsonarray.put(t((Map)obj));
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
            jsonobject.put(s1, c((Bundle)obj));
            return;
        }
        if (obj instanceof Map)
        {
            jsonobject.put(s1, t((Map)obj));
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

    public static void b(WebView webview)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            gm.b(webview);
        }
    }

    public static String c(Context context, String s1)
    {
label0:
        {
            synchronized (ut)
            {
                if (wD == null)
                {
                    break label0;
                }
                context = wD;
            }
            return context;
        }
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 17)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        String s2;
        wD = go.getDefaultUserAgent(context);
        wD = (new StringBuilder()).append(wD).append(" (Mobile; ").append(s1).append(")").toString();
        s2 = wD;
        obj;
        JVM INSTR monitorexit ;
        return s2;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        Exception exception;
        exception;
        if (gq.dB())
        {
            break MISSING_BLOCK_LABEL_161;
        }
        gq.wR.post(new Runnable(context) {

            final Context nf;

            public void run()
            {
                synchronized (gi.dy())
                {
                    gi.P(gi.u(nf));
                    gi.dy().notifyAll();
                }
                return;
                exception1;
                obj1;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                nf = context;
                super();
            }
        });
_L1:
        context = wD;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        ut.wait();
          goto _L1
        context;
        wD = dw();
        gr.W((new StringBuilder()).append("Interrupted, use default user agent: ").append(wD).toString());
          goto _L1
        wD = r(context);
_L2:
        wD = (new StringBuilder()).append(wD).append(" (Mobile; ").append(s1).append(")").toString();
        context = wD;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        wD = dw();
          goto _L2
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

    private static JSONObject c(Bundle bundle)
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

    public static void c(Context context, String s1, String s2)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s2);
        a(context, s1, arraylist);
    }

    public static boolean dt()
    {
        return wC;
    }

    public static int du()
    {
        return android.os.Build.VERSION.SDK_INT < 9 ? 0 : 6;
    }

    public static int dv()
    {
        return android.os.Build.VERSION.SDK_INT < 9 ? 1 : 7;
    }

    static String dw()
    {
        StringBuffer stringbuffer = new StringBuffer(256);
        stringbuffer.append("Mozilla/5.0 (Linux; U; Android");
        if (android.os.Build.VERSION.RELEASE != null)
        {
            stringbuffer.append(" ").append(android.os.Build.VERSION.RELEASE);
        }
        stringbuffer.append("; ").append(Locale.getDefault());
        if (Build.DEVICE != null)
        {
            stringbuffer.append("; ").append(Build.DEVICE);
            if (Build.DISPLAY != null)
            {
                stringbuffer.append(" Build/").append(Build.DISPLAY);
            }
        }
        stringbuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringbuffer.toString();
    }

    public static String dx()
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

    static Object dy()
    {
        return ut;
    }

    public static boolean p(Context context)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        context = context.getPackageManager().resolveActivity(intent, 0x10000);
        if (context == null || ((ResolveInfo) (context)).activityInfo == null)
        {
            gr.W("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        boolean flag;
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x10) == 0)
        {
            gr.W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "keyboard"
            }));
            flag = false;
        } else
        {
            flag = true;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x20) == 0)
        {
            gr.W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "keyboardHidden"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x80) == 0)
        {
            gr.W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "orientation"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x100) == 0)
        {
            gr.W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "screenLayout"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x200) == 0)
        {
            gr.W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "uiMode"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x400) == 0)
        {
            gr.W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "screenSize"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x800) == 0)
        {
            gr.W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "smallestScreenSize"
            }));
            return false;
        } else
        {
            return flag;
        }
    }

    public static void q(Context context)
    {
        if (wE)
        {
            return;
        } else
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.USER_PRESENT");
            intentfilter.addAction("android.intent.action.SCREEN_OFF");
            context.getApplicationContext().registerReceiver(new a(), intentfilter);
            wE = true;
            return;
        }
    }

    private static String r(Context context)
    {
        return (new WebView(context)).getSettings().getUserAgentString();
    }

    public static int s(Context context)
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

    public static JSONObject t(Map map)
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

    public static int[] t(Context context)
    {
        context = (WindowManager)context.getSystemService("window");
        DisplayMetrics displaymetrics = new DisplayMetrics();
        context.getDefaultDisplay().getMetrics(displaymetrics);
        float f = 160F / (float)displaymetrics.densityDpi;
        return (new int[] {
            (int)((float)displaymetrics.widthPixels * f), (int)(f * (float)displaymetrics.heightPixels)
        });
    }

    static String u(Context context)
    {
        return r(context);
    }

    static boolean y(boolean flag)
    {
        wC = flag;
        return flag;
    }

}
