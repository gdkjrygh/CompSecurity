// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
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
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
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

public final class kwz
{

    public static final Handler a = new kwu(Looper.getMainLooper());
    private final Object b = new Object();
    private String c;

    public kwz()
    {
    }

    public static int a(String s)
    {
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b.m((new StringBuilder("Could not parse value:")).append(s).toString());
            return 0;
        }
        return i;
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

    public static PopupWindow a(View view, int i, int j, boolean flag)
    {
        return new PopupWindow(view, i, j, false);
    }

    static Object a(kwz kwz1)
    {
        return kwz1.b;
    }

    public static String a()
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

    protected static String a(Context context)
    {
        return (new WebView(context)).getSettings().getUserAgentString();
    }

    public static String a(Context context, ksq ksq1, String s)
    {
        if (ksq1 == null)
        {
            return s;
        }
        Uri uri;
        Uri uri1;
        try
        {
            uri1 = Uri.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return s;
        }
        uri = uri1;
        if (ksq1.b(uri1))
        {
            uri = ksq1.a(uri1, context);
        }
        context = uri.toString();
        return context;
    }

    private String a(String s, Map map)
    {
        int i = s.indexOf("&adurl");
        if (i == -1)
        {
            i = s.indexOf("?adurl");
        }
        Object obj = Uri.parse(s);
        if ((new ksq(null)).b(((Uri) (obj))) && i != -1)
        {
            obj = new StringBuilder(s.substring(0, i + 1));
            String s2;
            for (Iterator iterator1 = map.keySet().iterator(); iterator1.hasNext(); ((StringBuilder) (obj)).append(s2).append("=").append((String)map.get(s2)).append("&"))
            {
                s2 = (String)iterator1.next();
            }

            return ((StringBuilder) (obj)).append(s.substring(i + 1)).toString();
        }
        s = ((Uri) (obj)).buildUpon();
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            s = s.appendQueryParameter(s1, (String)map.get(s1));
        }

        return s.build().toString();
    }

    static String a(kwz kwz1, String s)
    {
        kwz1.c = s;
        return s;
    }

    public static Map a(Uri uri)
    {
        if (uri == null)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = jqc.e().a(uri).iterator(); iterator.hasNext(); hashmap.put(s, uri.getQueryParameter(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    private JSONArray a(Collection collection)
    {
        JSONArray jsonarray = new JSONArray();
        for (collection = collection.iterator(); collection.hasNext(); a(jsonarray, collection.next())) { }
        return jsonarray;
    }

    private JSONObject a(Bundle bundle)
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

    public static void a(Context context, String s, String s1, Bundle bundle, boolean flag)
    {
        Context context2 = context.getApplicationContext();
        Context context1 = context2;
        if (context2 == null)
        {
            context1 = context;
        }
        bundle.putString("os", android.os.Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(android.os.Build.VERSION.SDK_INT));
        jqc.c();
        bundle.putString("device", b());
        bundle.putString("js", s);
        bundle.putString("appid", context1.getPackageName());
        bundle.putString("eids", TextUtils.join(",", ktk.a()));
        s1 = (new android.net.Uri.Builder()).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", s1);
        String s2;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); s1.appendQueryParameter(s2, bundle.getString(s2)))
        {
            s2 = (String)iterator.next();
        }

        jqc.c();
        s1 = s1.toString();
        bundle = new ArrayList();
        bundle.add(s1);
        a(context, s, ((List) (bundle)));
    }

    private static void a(Context context, String s, List list)
    {
        for (list = list.iterator(); list.hasNext(); kwv.a(((kwr) (new kxq(context, s, (String)list.next()))).c)) { }
    }

    public static void a(Context context, String s, List list, String s1)
    {
        for (list = list.iterator(); list.hasNext(); kwv.a(((kwr) (new kxq(context, s, (String)list.next(), s1))).c)) { }
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

    private void a(JSONArray jsonarray, Object obj)
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
            obj = ((Object) ((Object[])obj));
            JSONArray jsonarray1 = new JSONArray();
            int j = obj.length;
            for (int i = 0; i < j; i++)
            {
                a(jsonarray1, obj[i]);
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
            jsonobject.put(s, a(((Collection) (Arrays.asList((Object[])obj)))));
            return;
        } else
        {
            jsonobject.put(s, obj);
            return;
        }
    }

    public static void a(boolean flag, HttpURLConnection httpurlconnection, String s)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(true);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", s);
        httpurlconnection.setUseCaches(false);
    }

    public static boolean a(PackageManager packagemanager, String s, String s1)
    {
        return packagemanager.checkPermission(s1, s) == 0;
    }

    public static android.app.AlertDialog.Builder b(Context context)
    {
        return new android.app.AlertDialog.Builder(context);
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

    public static kta c(Context context)
    {
        return new kta(context);
    }

    public static int d(Activity activity)
    {
        if (activity == null)
        {
            b.m("Fail to get AdActivity type since it is null");
            return 0;
        }
        activity = AdOverlayInfoParcel.a(activity.getIntent());
        if (activity == null)
        {
            b.m("Fail to get AdOverlayInfo");
            return 0;
        }
        switch (((AdOverlayInfoParcel) (activity)).l)
        {
        default:
            return 0;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;
        }
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
            synchronized (b)
            {
                if (c == null)
                {
                    break label0;
                }
                context = c;
            }
            return context;
        }
        try
        {
            c = jqc.e().a(context);
        }
        catch (Exception exception) { }
        if (!TextUtils.isEmpty(c))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        jof.a();
        if (jpx.a())
        {
            break MISSING_BLOCK_LABEL_133;
        }
        c = null;
        a.post(new kxa(this, context));
_L1:
        context = c;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        b.wait();
          goto _L1
        context;
        c = c();
        b.m((new StringBuilder("Interrupted, use default user agent: ")).append(c).toString());
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        c = a(context);
_L2:
        c = (new StringBuilder()).append(c).append(" (Mobile; ").append(s).append(")").toString();
        context = c;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        c = c();
          goto _L2
    }

    public final String a(Context context, String s, String s1)
    {
        int i = jqb.a(context).c();
        ktd ktd = ktk.i;
        String s2 = s;
        if (((Boolean)jqc.i().a(ktd)).booleanValue())
        {
            s2 = s;
            if (jqb.a(context).a())
            {
                s2 = s;
                if (!TextUtils.isEmpty(s))
                {
                    context = Uri.parse(s);
                    s2 = s;
                    if ((new ksq(null)).a(context))
                    {
                        context = new HashMap();
                        context.put("ga_cid", s1);
                        context.put("ga_hid", String.valueOf(i));
                        s2 = a(s, ((Map) (context)));
                    }
                }
            }
        }
        return s2;
    }

    public final JSONObject a(Map map)
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

    public final int[] a(Activity activity)
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

    public final int[] b(Activity activity)
    {
        int ai[] = a(activity);
        return (new int[] {
            jof.a().b(activity, ai[0]), jof.a().b(activity, ai[1])
        });
    }

    public final int[] c(Activity activity)
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
        return (new int[] {
            jof.a().b(activity, ai[0]), jof.a().b(activity, ai[1])
        });
_L2:
        ai = d();
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        jns.getName();
        jnt.getName();
        jnu.getName();
        jnv.getName();
        jqd.getName();
        jnq.getName();
    }
}
