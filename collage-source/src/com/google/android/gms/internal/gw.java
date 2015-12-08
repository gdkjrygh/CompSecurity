// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzm;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.ads.search.SearchAdView;
import java.io.IOException;
import java.io.InputStreamReader;
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
//            gt, gv, ay, au, 
//            n, gx, hs, hd, 
//            aq

public class gw
{

    public static final Handler a = new gt(Looper.getMainLooper());
    private static final String b = com/google/android/gms/ads/AdView.getName();
    private static final String c = com/google/android/gms/ads/InterstitialAd.getName();
    private static final String d = com/google/android/gms/ads/doubleclick/PublisherAdView.getName();
    private static final String e = com/google/android/gms/ads/doubleclick/PublisherInterstitialAd.getName();
    private static final String f = com/google/android/gms/ads/search/SearchAdView.getName();
    private static final String g = com/google/android/gms/ads/AdLoader.getName();
    private final Object h = new Object();
    private boolean i;
    private String j;
    private boolean k;

    public gw()
    {
        i = true;
        k = false;
    }

    static Object a(gw gw1)
    {
        return gw1.h;
    }

    static String a(gw gw1, String s)
    {
        gw1.j = s;
        return s;
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
            jsonarray.put(a((Object[])(Object[])obj));
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

    static boolean a(gw gw1, boolean flag)
    {
        gw1.i = flag;
        return flag;
    }

    public static void b(Runnable runnable)
    {
        if (Looper.getMainLooper().getThread() != Thread.currentThread())
        {
            runnable.run();
            return;
        } else
        {
            gv.a(runnable);
            return;
        }
    }

    private boolean h(Context context)
    {
        context = (PowerManager)context.getSystemService("power");
        if (context == null)
        {
            return false;
        } else
        {
            return context.isScreenOn();
        }
    }

    public Bitmap a(View view)
    {
        view.setDrawingCacheEnabled(true);
        Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return bitmap;
    }

    public DisplayMetrics a(WindowManager windowmanager)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        windowmanager.getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics;
    }

    public PopupWindow a(View view, int l, int i1, boolean flag)
    {
        return new PopupWindow(view, l, i1, flag);
    }

    public String a(Context context, View view, AdSizeParcel adsizeparcel)
    {
        if (!((Boolean)ay.W.c()).booleanValue())
        {
            return null;
        }
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("width", adsizeparcel.width);
        jsonobject1.put("height", adsizeparcel.height);
        jsonobject.put("size", jsonobject1);
        jsonobject.put("activity", f(context));
        if (adsizeparcel.zzsH) goto _L2; else goto _L1
_L1:
        adsizeparcel = new JSONArray();
_L7:
        if (view == null) goto _L4; else goto _L3
_L3:
        int l;
        try
        {
            context = view.getParent();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.zzd("Fail to get view hierarchy json", context);
            return null;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        l = -1;
        if (context instanceof ViewGroup)
        {
            l = ((ViewGroup)context).indexOfChild(view);
        }
        view = new JSONObject();
        view.put("type", context.getClass().getName());
        view.put("index_of_child", l);
        adsizeparcel.put(view);
        if (context == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(context instanceof View))
        {
            break; /* Loop/switch isn't completed */
        }
        context = (View)context;
          goto _L5
_L4:
        if (adsizeparcel.length() > 0)
        {
            jsonobject.put("parents", adsizeparcel);
        }
_L2:
        context = jsonobject.toString();
        return context;
_L5:
        view = context;
        if (true) goto _L7; else goto _L6
_L6:
        context = null;
          goto _L5
        if (true) goto _L7; else goto _L8
_L8:
    }

    public String a(Context context, n n1, String s)
    {
        if (n1 == null)
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
        if (n1.c(uri1))
        {
            uri = n1.a(uri1, context);
        }
        context = uri.toString();
        return context;
    }

    public String a(Context context, String s)
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
            j = zzp.zzbz().a(context);
        }
        catch (Exception exception) { }
        if (!TextUtils.isEmpty(j))
        {
            break MISSING_BLOCK_LABEL_145;
        }
        if (zzk.zzcE().zzgI())
        {
            break MISSING_BLOCK_LABEL_136;
        }
        j = null;
        a.post(new zzhu._cls1(this, context));
_L1:
        context = j;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        h.wait();
          goto _L1
        context;
        j = b();
        zzb.zzaE((new StringBuilder()).append("Interrupted, use default user agent: ").append(j).toString());
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        j = c(context);
_L2:
        j = (new StringBuilder()).append(j).append(" (Mobile; ").append(s).append(")").toString();
        context = j;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        j = b();
          goto _L2
    }

    public String a(Context context, String s, String s1, int l)
    {
        if (!((Boolean)ay.V.c()).booleanValue() || !zzm.zzq(context).zzbn() || TextUtils.isEmpty(s) || !b(Uri.parse(s)))
        {
            return s;
        } else
        {
            context = new HashMap();
            context.put("ga_cid", s1);
            context.put("ga_hid", String.valueOf(l));
            return a(s, ((Map) (context)));
        }
    }

    public String a(hs hs1, String s)
    {
        return a(hs1.getContext(), hs1.k(), s);
    }

    public String a(InputStreamReader inputstreamreader)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder(8192);
        char ac[] = new char[2048];
        do
        {
            int l = inputstreamreader.read(ac);
            if (l != -1)
            {
                stringbuilder.append(ac, 0, l);
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }

    public String a(String s)
    {
        return Uri.parse(s).buildUpon().query(null).build().toString();
    }

    String a(String s, Map map)
    {
        int l = s.indexOf("&adurl");
        if (l == -1)
        {
            l = s.indexOf("?adurl");
        }
        Object obj = Uri.parse(s);
        if (c(((Uri) (obj))) && l != -1)
        {
            obj = new StringBuilder(s.substring(0, l + 1));
            String s2;
            for (Iterator iterator1 = map.keySet().iterator(); iterator1.hasNext(); ((StringBuilder) (obj)).append(s2).append("=").append((String)map.get(s2)).append("&"))
            {
                s2 = (String)iterator1.next();
            }

            return ((StringBuilder) (obj)).append(s.substring(l + 1)).toString();
        }
        s = ((Uri) (obj)).buildUpon();
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            s = s.appendQueryParameter(s1, (String)map.get(s1));
        }

        return s.build().toString();
    }

    public String a(StackTraceElement astacktraceelement[], String s)
    {
        if (!((Boolean)ay.ah.c()).booleanValue()) goto _L2; else goto _L1
_L1:
        int l = 0;
_L5:
        StackTraceElement stacktraceelement;
        String s1;
        if (l + 1 >= astacktraceelement.length)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        stacktraceelement = astacktraceelement[l];
        s1 = stacktraceelement.getClassName();
        if (!"loadAd".equalsIgnoreCase(stacktraceelement.getMethodName()) || !b.equalsIgnoreCase(s1) && !c.equalsIgnoreCase(s1) && !d.equalsIgnoreCase(s1) && !e.equalsIgnoreCase(s1) && !f.equalsIgnoreCase(s1) && !g.equalsIgnoreCase(s1)) goto _L4; else goto _L3
_L3:
        astacktraceelement = astacktraceelement[l + 1].getClassName();
_L6:
        if (astacktraceelement != null && !astacktraceelement.contains(s))
        {
            return astacktraceelement;
        }
          goto _L2
_L4:
        l++;
          goto _L5
_L2:
        return null;
        astacktraceelement = null;
          goto _L6
    }

    public ArrayList a(Context context, List list, String s)
    {
        int l = zzm.zzq(context).zzbp();
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(a(context, (String)list.next(), s, l))) { }
        return arraylist;
    }

    public Map a(Uri uri)
    {
        if (uri == null)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = zzp.zzbz().a(uri).iterator(); iterator.hasNext(); hashmap.put(s, uri.getQueryParameter(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    JSONArray a(Object aobj[])
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

    public JSONObject a(Map map)
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

    public void a(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            activity.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(ongloballayoutlistener);
        }
    }

    public void a(Activity activity, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            activity.getDecorView().getViewTreeObserver().addOnScrollChangedListener(onscrollchangedlistener);
        }
    }

    public void a(Context context, String s, WebSettings websettings)
    {
        websettings.setUserAgentString(a(context, s));
    }

    public void a(Context context, String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s1);
        a(context, s, ((List) (arraylist)));
    }

    public void a(Context context, String s, String s1, Bundle bundle, boolean flag)
    {
        if (flag)
        {
            Context context2 = context.getApplicationContext();
            Context context1 = context2;
            if (context2 == null)
            {
                context1 = context;
            }
            bundle.putString("os", android.os.Build.VERSION.RELEASE);
            bundle.putString("api", String.valueOf(android.os.Build.VERSION.SDK_INT));
            bundle.putString("device", zzp.zzbx().d());
            bundle.putString("js", s);
            bundle.putString("appid", context1.getPackageName());
            bundle.putString("eids", TextUtils.join(",", ay.a()));
        }
        s1 = (new android.net.Uri.Builder()).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", s1);
        String s2;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); s1.appendQueryParameter(s2, bundle.getString(s2)))
        {
            s2 = (String)iterator.next();
        }

        zzp.zzbx().a(context, s, s1.toString());
    }

    public void a(Context context, String s, List list)
    {
        for (list = list.iterator(); list.hasNext(); (new hd(context, s, (String)list.next())).zzgn()) { }
    }

    public void a(Context context, String s, List list, String s1)
    {
        for (list = list.iterator(); list.hasNext(); (new hd(context, s, (String)list.next(), s1)).zzgn()) { }
    }

    public void a(Context context, String s, boolean flag, HttpURLConnection httpurlconnection)
    {
        a(context, s, flag, httpurlconnection, false);
    }

    public void a(Context context, String s, boolean flag, HttpURLConnection httpurlconnection, String s1)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(flag);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", s1);
        httpurlconnection.setUseCaches(false);
    }

    public void a(Context context, String s, boolean flag, HttpURLConnection httpurlconnection, boolean flag1)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(flag);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", a(context, s));
        httpurlconnection.setUseCaches(flag1);
    }

    public boolean a()
    {
        return i;
    }

    public boolean a(Context context)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        context = context.getPackageManager().resolveActivity(intent, 0x10000);
        if (context == null || ((ResolveInfo) (context)).activityInfo == null)
        {
            zzb.zzaE("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        boolean flag;
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x10) == 0)
        {
            zzb.zzaE(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "keyboard"
            }));
            flag = false;
        } else
        {
            flag = true;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x20) == 0)
        {
            zzb.zzaE(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "keyboardHidden"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x80) == 0)
        {
            zzb.zzaE(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "orientation"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x100) == 0)
        {
            zzb.zzaE(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "screenLayout"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x200) == 0)
        {
            zzb.zzaE(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "uiMode"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x400) == 0)
        {
            zzb.zzaE(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "screenSize"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x800) == 0)
        {
            zzb.zzaE(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "smallestScreenSize"
            }));
            return false;
        } else
        {
            return flag;
        }
    }

    public boolean a(PackageManager packagemanager, String s, String s1)
    {
        return packagemanager.checkPermission(s1, s) == 0;
    }

    public boolean a(ClassLoader classloader, Class class1, String s)
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

    public int[] a(Activity activity)
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
        return e();
    }

    public int b(String s)
    {
        int l;
        try
        {
            l = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.zzaE((new StringBuilder()).append("Could not parse value:").append(s).toString());
            return 0;
        }
        return l;
    }

    String b()
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

    public String b(Context context, String s, String s1)
    {
        return a(context, s, s1, zzm.zzq(context).zzbp());
    }

    public void b(Activity activity, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            activity.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(onscrollchangedlistener);
        }
    }

    public void b(Context context, String s, String s1, Bundle bundle, boolean flag)
    {
        if (((Boolean)ay.ae.c()).booleanValue())
        {
            a(context, s, s1, bundle, flag);
        }
    }

    public boolean b(Context context)
    {
        if (k)
        {
            return false;
        } else
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.USER_PRESENT");
            intentfilter.addAction("android.intent.action.SCREEN_OFF");
    /* block-local class not found */
    class a {}

            context.getApplicationContext().registerReceiver(new a(null), intentfilter);
            k = true;
            return true;
        }
    }

    public boolean b(Uri uri)
    {
        return (new n(null)).b(uri);
    }

    public int[] b(Activity activity)
    {
        int ai[] = a(activity);
        return (new int[] {
            zzk.zzcE().zzc(activity, ai[0]), zzk.zzcE().zzc(activity, ai[1])
        });
    }

    public String c()
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

    protected String c(Context context)
    {
        return (new WebView(context)).getSettings().getUserAgentString();
    }

    public boolean c(Uri uri)
    {
        return (new n(null)).c(uri);
    }

    public boolean c(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            return s.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
        }
    }

    public int[] c(Activity activity)
    {
        activity = activity.getWindow();
        if (activity != null)
        {
            activity = activity.findViewById(0x1020002);
            if (activity != null)
            {
                return (new int[] {
                    activity.getTop(), activity.getBottom()
                });
            }
        }
        return e();
    }

    public android.app.AlertDialog.Builder d(Context context)
    {
        return new android.app.AlertDialog.Builder(context);
    }

    public String d()
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

    public int[] d(Activity activity)
    {
        int ai[] = c(activity);
        return (new int[] {
            zzk.zzcE().zzc(activity, ai[0]), zzk.zzcE().zzc(activity, ai[1])
        });
    }

    public int e(Activity activity)
    {
        if (activity == null)
        {
            zzb.zzaE("Fail to get AdActivity type since it is null");
            return 0;
        }
        activity = AdOverlayInfoParcel.zzb(activity.getIntent());
        if (activity == null)
        {
            zzb.zzaE("Fail to get AdOverlayInfo");
            return 0;
        }
        switch (((AdOverlayInfoParcel) (activity)).zzAX)
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

    public aq e(Context context)
    {
        return new aq(context);
    }

    protected int[] e()
    {
        return (new int[] {
            0, 0
        });
    }

    public String f(Context context)
    {
        context = (ActivityManager)context.getSystemService("activity");
        if (context == null)
        {
            return null;
        }
        context = context.getRunningTasks(1);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        if (context.isEmpty())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        context = (android.app.ActivityManager.RunningTaskInfo)context.get(0);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        if (((android.app.ActivityManager.RunningTaskInfo) (context)).topActivity == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        context = ((android.app.ActivityManager.RunningTaskInfo) (context)).topActivity.getClassName();
        return context;
        context;
        return null;
    }

    public boolean g(Context context)
    {
        KeyguardManager keyguardmanager;
        Object obj;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        boolean flag;
        try
        {
            obj = (ActivityManager)context.getSystemService("activity");
            keyguardmanager = (KeyguardManager)context.getSystemService("keyguard");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if (obj == null || keyguardmanager == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        obj = ((ActivityManager) (obj)).getRunningAppProcesses();
        if (obj == null)
        {
            return false;
        }
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_113;
            }
            runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
        } while (Process.myPid() != runningappprocessinfo.pid);
        if (runningappprocessinfo.importance != 100 || keyguardmanager.inKeyguardRestrictedInputMode())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        flag = h(context);
        if (flag)
        {
            return true;
        }
        return false;
        return false;
    }

}
