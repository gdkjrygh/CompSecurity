// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.a.c;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.b.a;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.internal.client.j;
import com.google.android.gms.common.internal.u;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            cj, e, cm, v, 
//            cq, q

public final class cl
{

    public static final Handler a = new cj(Looper.getMainLooper());
    private static final String b = com/google/android/gms/ads/d.getName();
    private static final String c = com/google/android/gms/ads/e.getName();
    private static final String d = com/google/android/gms/ads/a/c.getName();
    private static final String e = com/google/android/gms/ads/a/d.getName();
    private static final String f = com/google/android/gms/ads/b/a.getName();
    private static final String g = com/google/android/gms/ads/b.getName();
    private final Object h = new Object();
    private boolean i;
    private String j;
    private boolean k;

    public cl()
    {
        i = true;
        k = false;
    }

    public static int a(String s)
    {
        int l;
        try
        {
            l = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("Could not parse value:")).append(s).toString());
            return 0;
        }
        return l;
    }

    public static Bitmap a(View view)
    {
        view.setDrawingCacheEnabled(true);
        Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return bitmap;
    }

    public static DisplayMetrics a(WindowManager windowmanager)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        windowmanager.getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics;
    }

    public static PopupWindow a(View view, int l, int i1)
    {
        return new PopupWindow(view, l, i1, false);
    }

    static Object a(cl cl1)
    {
        return cl1.h;
    }

    public static String a()
    {
        Object obj;
        byte abyte0[];
        byte abyte1[];
        int l;
        obj = UUID.randomUUID();
        abyte0 = BigInteger.valueOf(((UUID) (obj)).getLeastSignificantBits()).toByteArray();
        abyte1 = BigInteger.valueOf(((UUID) (obj)).getMostSignificantBits()).toByteArray();
        obj = (new BigInteger(1, abyte0)).toString();
        l = 0;
_L2:
        if (l >= 2)
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
        l++;
        if (true) goto _L2; else goto _L1
_L1:
        return ((String) (obj));
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
          goto _L3
    }

    protected static String a(Context context)
    {
        return (new WebView(context)).getSettings().getUserAgentString();
    }

    static String a(cl cl1, String s)
    {
        cl1.j = s;
        return s;
    }

    public static String a(com.google.android.gms.internal.e e1, String s)
    {
        boolean flag1 = false;
        if (e1 == null)
        {
            return s;
        }
        String as[];
        Uri uri;
        Uri uri1;
        String s1;
        int l;
        boolean flag;
        int i1;
        try
        {
            uri1 = Uri.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.e e1)
        {
            return s;
        }
        flag = flag1;
        if (!e1.a(uri1)) goto _L2; else goto _L1
_L1:
        as = com.google.android.gms.internal.e.a;
        i1 = as.length;
        l = 0;
_L7:
        flag = flag1;
        if (l >= i1) goto _L2; else goto _L3
_L3:
        s1 = as[l];
        if (!uri1.getPath().endsWith(s1)) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        uri = uri1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        uri = e1.b(uri1);
        e1 = uri.toString();
        return e1;
_L5:
        l++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static Map a(Uri uri)
    {
        if (uri == null)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = com.google.android.gms.ads.internal.d.e().a(uri).iterator(); iterator.hasNext(); hashmap.put(s, uri.getQueryParameter(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    private JSONArray a(Collection collection)
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        for (collection = collection.iterator(); collection.hasNext(); a(jsonarray, collection.next())) { }
        return jsonarray;
    }

    private JSONObject a(Bundle bundle)
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

    public static void a(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            activity.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(ongloballayoutlistener);
        }
    }

    public static void a(Activity activity, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            activity.getDecorView().getViewTreeObserver().addOnScrollChangedListener(onscrollchangedlistener);
        }
    }

    public static void a(Context context, Intent intent)
    {
        try
        {
            context.startActivity(intent);
            return;
        }
        catch (Throwable throwable)
        {
            intent.addFlags(0x10000000);
        }
        context.startActivity(intent);
    }

    public static void a(Context context, String s, String s1, Bundle bundle)
    {
        Context context2 = context.getApplicationContext();
        Context context1 = context2;
        if (context2 == null)
        {
            context1 = context;
        }
        bundle.putString("os", android.os.Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(android.os.Build.VERSION.SDK_INT));
        com.google.android.gms.ads.internal.d.c();
        bundle.putString("device", b());
        bundle.putString("js", s);
        bundle.putString("appid", context1.getPackageName());
        bundle.putString("eids", TextUtils.join(",", com.google.android.gms.internal.v.a()));
        s1 = (new android.net.Uri.Builder()).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", s1);
        String s2;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); s1.appendQueryParameter(s2, bundle.getString(s2)))
        {
            s2 = (String)iterator.next();
        }

        com.google.android.gms.ads.internal.d.c();
        s1 = s1.toString();
        bundle = new ArrayList();
        bundle.add(s1);
        a(context, s, ((List) (bundle)));
    }

    private static void a(Context context, String s, List list)
    {
        for (list = list.iterator(); list.hasNext(); (new cq(context, s, (String)list.next())).b()) { }
    }

    public static void a(Context context, String s, List list, String s1)
    {
        for (list = list.iterator(); list.hasNext(); (new cq(context, s, (String)list.next(), s1)).b()) { }
    }

    public static void a(Runnable runnable)
    {
        if (Looper.getMainLooper().getThread() == Thread.currentThread())
        {
            runnable.run();
            return;
        } else
        {
            a.post(runnable);
            return;
        }
    }

    public static void a(HttpURLConnection httpurlconnection, String s)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(true);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", s);
        httpurlconnection.setUseCaches(false);
    }

    private void a(JSONArray jsonarray, Object obj)
        throws JSONException
    {
        if (obj instanceof Bundle)
        {
            jsonarray.put(a((Bundle)obj));
            return;
        }
        if (obj instanceof Map)
        {
            jsonarray.put(a((Map)obj));
            return;
        }
        if (obj instanceof Collection)
        {
            jsonarray.put(a((Collection)obj));
            return;
        }
        if (obj instanceof Object[])
        {
            obj = ((Object) ((Object[])(Object[])obj));
            JSONArray jsonarray1 = new JSONArray();
            int i1 = obj.length;
            for (int l = 0; l < i1; l++)
            {
                a(jsonarray1, obj[l]);
            }

            jsonarray.put(jsonarray1);
            return;
        } else
        {
            jsonarray.put(obj);
            return;
        }
    }

    private void a(JSONObject jsonobject, String s, Object obj)
        throws JSONException
    {
        if (obj instanceof Bundle)
        {
            jsonobject.put(s, a((Bundle)obj));
            return;
        }
        if (obj instanceof Map)
        {
            jsonobject.put(s, a((Map)obj));
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

    public static int[] a(Activity activity)
    {
        activity = activity.getWindow();
        if (activity != null)
        {
            activity = activity.findViewById(0x1020002);
            if (activity != null)
            {
                return (new int[] {
                    activity.getWidth(), activity.getHeight()
                });
            }
        }
        return d();
    }

    public static android.app.AlertDialog.Builder b(Context context)
    {
        return new android.app.AlertDialog.Builder(context);
    }

    public static Bitmap b(Context context, String s)
    {
        u.c("getBackgroundImage must not be called on the main UI thread.");
        try
        {
            context = context.openFileInput(s);
            s = BitmapFactory.decodeStream(context);
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Fail to get background image");
            return null;
        }
        return s;
    }

    public static String b()
    {
        String s = Build.MANUFACTURER;
        String s1 = Build.MODEL;
        if (s1.startsWith(s))
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append(s).append(" ").append(s1).toString();
        }
    }

    public static void b(Activity activity, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            activity.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(onscrollchangedlistener);
        }
    }

    public static boolean b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            return s.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
        }
    }

    public static int[] b(Activity activity)
    {
        int ai[] = a(activity);
        com.google.android.gms.ads.internal.client.j.a();
        int l = com.google.android.gms.ads.internal.util.client.a.b(activity, ai[0]);
        com.google.android.gms.ads.internal.client.j.a();
        return (new int[] {
            l, com.google.android.gms.ads.internal.util.client.a.b(activity, ai[1])
        });
    }

    public static q c(Context context)
    {
        return new q(context);
    }

    private static String c()
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

    public static int[] c(Activity activity)
    {
        Window window = activity.getWindow();
        if (window == null) goto _L2; else goto _L1
_L1:
        View view = window.findViewById(0x1020002);
        if (view == null) goto _L2; else goto _L3
_L3:
        int ai[];
        ai = new int[2];
        ai[0] = view.getTop();
        ai[1] = view.getBottom();
_L5:
        com.google.android.gms.ads.internal.client.j.a();
        int l = com.google.android.gms.ads.internal.util.client.a.b(activity, ai[0]);
        com.google.android.gms.ads.internal.client.j.a();
        return (new int[] {
            l, com.google.android.gms.ads.internal.util.client.a.b(activity, ai[1])
        });
_L2:
        ai = d();
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static int[] d()
    {
        return (new int[] {
            0, 0
        });
    }

    public final String a(Context context, String s)
    {
label0:
        {
            synchronized (h)
            {
                if (j == null)
                {
                    break label0;
                }
                context = j;
            }
            return context;
        }
        try
        {
            j = com.google.android.gms.ads.internal.d.e().a(context);
        }
        catch (Exception exception) { }
        if (!TextUtils.isEmpty(j))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        com.google.android.gms.ads.internal.client.j.a();
        if (com.google.android.gms.ads.internal.util.client.a.a())
        {
            break MISSING_BLOCK_LABEL_133;
        }
        j = null;
        a.post(new Runnable(context) {

            final Context a;
            final cl b;

            public final void run()
            {
                synchronized (com.google.android.gms.internal.cl.a(b))
                {
                    com.google.android.gms.internal.cl.a(b, com.google.android.gms.internal.cl.a(a));
                    com.google.android.gms.internal.cl.a(b).notifyAll();
                }
                return;
                exception1;
                obj1;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                b = cl.this;
                a = context;
                super();
            }
        });
_L1:
        context = j;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        h.wait();
          goto _L1
        context;
        j = c();
        com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("Interrupted, use default user agent: ")).append(j).toString());
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        j = a(context);
_L2:
        j = (new StringBuilder()).append(j).append(" (Mobile; ").append(s).append(")").toString();
        context = j;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        j = c();
          goto _L2
    }

    public final JSONObject a(Map map)
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
            throw new JSONException((new StringBuilder("Could not convert map to JSON: ")).append(map.getMessage()).toString());
        }
        return jsonobject;
    }

    public final void a(Context context, String s, boolean flag, HttpURLConnection httpurlconnection)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(flag);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", a(context, s));
        httpurlconnection.setUseCaches(false);
    }

}
