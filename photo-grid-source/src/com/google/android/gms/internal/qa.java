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
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
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
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.internal.bl;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
//            pm, cy, cx, ad, 
//            qd, rb, pu, cm, 
//            qb, qc

public final class qa
{

    public static final Handler a = new pm(Looper.getMainLooper());
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

    public qa()
    {
        i = true;
        k = false;
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

    static Object a(qa qa1)
    {
        return qa1.h;
    }

    public static String a(Context context, View view, AdSizeParcel adsizeparcel)
    {
        cq cq = cy.W;
        if (!((Boolean)zzp.zzbE().a(cq)).booleanValue())
        {
            return null;
        }
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("width", adsizeparcel.width);
        jsonobject1.put("height", adsizeparcel.height);
        jsonobject.put("size", jsonobject1);
        jsonobject.put("activity", h(context));
        if (adsizeparcel.zztf) goto _L2; else goto _L1
_L1:
        context = new JSONArray();
_L8:
        if (view == null) goto _L4; else goto _L3
_L3:
        int l;
        try
        {
            adsizeparcel = view.getParent();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.zzd("Fail to get view hierarchy json", context);
            return null;
        }
        if (adsizeparcel == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        l = -1;
        if (adsizeparcel instanceof ViewGroup)
        {
            l = ((ViewGroup)adsizeparcel).indexOfChild(view);
        }
        view = new JSONObject();
        view.put("type", adsizeparcel.getClass().getName());
        view.put("index_of_child", l);
        context.put(view);
        if (adsizeparcel == null) goto _L6; else goto _L5
_L5:
        if (adsizeparcel instanceof View)
        {
            view = (View)adsizeparcel;
            continue; /* Loop/switch isn't completed */
        }
          goto _L6
_L4:
        if (context.length() > 0)
        {
            jsonobject.put("parents", context);
        }
_L2:
        context = jsonobject.toString();
        return context;
_L6:
        view = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static String a(Context context, ad ad1, String s)
    {
        if (ad1 == null)
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
        if (ad1.b(uri1))
        {
            uri = ad1.a(uri1, context);
        }
        context = uri.toString();
        return context;
    }

    static String a(qa qa1, String s)
    {
        qa1.j = s;
        return s;
    }

    public static String a(InputStreamReader inputstreamreader)
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

    public static String a(String s)
    {
        return Uri.parse(s).buildUpon().query(null).build().toString();
    }

    public static String a(StackTraceElement astacktraceelement[], String s)
    {
        Object obj = cy.ah;
        if (!((Boolean)zzp.zzbE().a(((cq) (obj)))).booleanValue()) goto _L2; else goto _L1
_L1:
        int l = 0;
_L5:
        String s1;
        if (l + 1 >= astacktraceelement.length)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        obj = astacktraceelement[l];
        s1 = ((StackTraceElement) (obj)).getClassName();
        if (!"loadAd".equalsIgnoreCase(((StackTraceElement) (obj)).getMethodName()) || !b.equalsIgnoreCase(s1) && !c.equalsIgnoreCase(s1) && !d.equalsIgnoreCase(s1) && !e.equalsIgnoreCase(s1) && !f.equalsIgnoreCase(s1) && !g.equalsIgnoreCase(s1)) goto _L4; else goto _L3
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

    public static Map a(Uri uri)
    {
        if (uri == null)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = zzp.zzbx().a(uri).iterator(); iterator.hasNext(); hashmap.put(s, uri.getQueryParameter(s)))
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

    public static void a(Context context, String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s1);
        a(context, s, ((List) (arraylist)));
    }

    public static void a(Context context, String s, String s1, Bundle bundle, boolean flag)
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
            zzp.zzbv();
            bundle.putString("device", c());
            bundle.putString("js", s);
            bundle.putString("appid", context1.getPackageName());
            bundle.putString("eids", TextUtils.join(",", cy.a()));
        }
        s1 = (new android.net.Uri.Builder()).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", s1);
        String s2;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); s1.appendQueryParameter(s2, bundle.getString(s2)))
        {
            s2 = (String)iterator.next();
        }

        zzp.zzbv();
        a(context, s, s1.toString());
    }

    public static void a(Context context, String s, List list)
    {
        for (list = list.iterator(); list.hasNext(); (new rb(context, s, (String)list.next())).zzgz()) { }
    }

    public static void a(Context context, String s, List list, String s1)
    {
        for (list = list.iterator(); list.hasNext(); (new rb(context, s, (String)list.next(), s1)).zzgz()) { }
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

    public static boolean a(Context context)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        context = context.getPackageManager().resolveActivity(intent, 0x10000);
        if (context == null || ((ResolveInfo) (context)).activityInfo == null)
        {
            zzb.zzaH("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        boolean flag;
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x10) == 0)
        {
            zzb.zzaH(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "keyboard"
            }));
            flag = false;
        } else
        {
            flag = true;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x20) == 0)
        {
            zzb.zzaH(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "keyboardHidden"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x80) == 0)
        {
            zzb.zzaH(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "orientation"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x100) == 0)
        {
            zzb.zzaH(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "screenLayout"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x200) == 0)
        {
            zzb.zzaH(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "uiMode"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x400) == 0)
        {
            zzb.zzaH(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "screenSize"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x800) == 0)
        {
            zzb.zzaH(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "smallestScreenSize"
            }));
            return false;
        } else
        {
            return flag;
        }
    }

    public static boolean a(Context context, Bitmap bitmap, String s)
    {
        bl.c("saveImageToFile must not be called on the main UI thread.");
        try
        {
            context = context.openFileOutput(s, 0);
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, context);
            context.close();
            bitmap.recycle();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.zzb("Fail to save file", context);
            return false;
        }
        return true;
    }

    public static boolean a(PackageManager packagemanager, String s, String s1)
    {
        return packagemanager.checkPermission(s1, s) == 0;
    }

    static boolean a(qa qa1, boolean flag)
    {
        qa1.i = flag;
        return flag;
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
        return e();
    }

    public static int b(String s)
    {
        int l;
        try
        {
            l = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.zzaH((new StringBuilder("Could not parse value:")).append(s).toString());
            return 0;
        }
        return l;
    }

    public static Bitmap b(Context context, String s)
    {
        bl.c("getBackgroundImage must not be called on the main UI thread.");
        try
        {
            context = context.openFileInput(s);
            s = BitmapFactory.decodeStream(context);
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.e("Fail to get background image");
            return null;
        }
        return s;
    }

    public static String b()
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

    public static void b(Activity activity, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            activity.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(onscrollchangedlistener);
        }
    }

    public static void b(Context context, String s, String s1, Bundle bundle, boolean flag)
    {
        cq cq = cy.ae;
        if (((Boolean)zzp.zzbE().a(cq)).booleanValue())
        {
            a(context, s, s1, bundle, flag);
        }
    }

    public static void b(Runnable runnable)
    {
        if (Looper.getMainLooper().getThread() != Thread.currentThread())
        {
            runnable.run();
            return;
        } else
        {
            pu.a(runnable);
            return;
        }
    }

    public static int[] b(Activity activity)
    {
        int ai[] = a(activity);
        return (new int[] {
            zzl.zzcF().zzc(activity, ai[0]), zzl.zzcF().zzc(activity, ai[1])
        });
    }

    public static String c()
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

    protected static String c(Context context)
    {
        return (new WebView(context)).getSettings().getUserAgentString();
    }

    public static void c(Context context, String s)
    {
        bl.c("deleteFile must not be called on the main UI thread.");
        context.deleteFile(s);
    }

    public static boolean c(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            return s.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
        }
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
        return (new int[] {
            zzl.zzcF().zzc(activity, ai[0]), zzl.zzcF().zzc(activity, ai[1])
        });
_L2:
        ai = e();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static android.app.AlertDialog.Builder d(Context context)
    {
        return new android.app.AlertDialog.Builder(context);
    }

    private static String d()
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

    public static cm e(Context context)
    {
        return new cm(context);
    }

    private static int[] e()
    {
        return (new int[] {
            0, 0
        });
    }

    public static boolean f(Context context)
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
        if (obj != null && keyguardmanager != null) goto _L2; else goto _L1
_L2:
        obj = ((ActivityManager) (obj)).getRunningAppProcesses();
        if (obj == null)
        {
            return false;
        }
        obj = ((List) (obj)).iterator();
_L6:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
        if (Process.myPid() != runningappprocessinfo.pid) goto _L6; else goto _L5
_L5:
        if (runningappprocessinfo.importance != 100 || keyguardmanager.inKeyguardRestrictedInputMode()) goto _L4; else goto _L7
_L7:
        context = (PowerManager)context.getSystemService("power");
        if (context != null) goto _L9; else goto _L8
_L8:
        flag = false;
          goto _L10
_L9:
        flag = context.isScreenOn();
          goto _L10
_L4:
        return false;
_L1:
        return false;
_L10:
        if (!flag) goto _L4; else goto _L11
_L11:
        return true;
    }

    public static Bitmap g(Context context)
    {
        if (!(context instanceof Activity))
        {
            return null;
        }
        Bitmap bitmap;
        try
        {
            context = ((Activity)context).getWindow().getDecorView();
            bitmap = Bitmap.createBitmap(context.getWidth(), context.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            context.layout(0, 0, context.getWidth(), context.getHeight());
            context.draw(canvas);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.zzb("Fail to capture screen shot", context);
            return null;
        }
        return bitmap;
    }

    private static String h(Context context)
    {
        context = (ActivityManager)context.getSystemService("activity");
        if (context == null)
        {
            return null;
        }
        context = context.getRunningTasks(1);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (context.isEmpty())
        {
            break MISSING_BLOCK_LABEL_68;
        }
        context = (android.app.ActivityManager.RunningTaskInfo)context.get(0);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (((android.app.ActivityManager.RunningTaskInfo) (context)).topActivity == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        context = ((android.app.ActivityManager.RunningTaskInfo) (context)).topActivity.getClassName();
        return context;
        context;
        return null;
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
            j = zzp.zzbx().a(context);
        }
        catch (Exception exception) { }
        if (!TextUtils.isEmpty(j))
        {
            break MISSING_BLOCK_LABEL_140;
        }
        if (zzl.zzcF().zzgT())
        {
            break MISSING_BLOCK_LABEL_132;
        }
        j = null;
        a.post(new qb(this, context));
_L1:
        context = j;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        h.wait();
          goto _L1
        context;
        j = d();
        zzb.zzaH((new StringBuilder("Interrupted, use default user agent: ")).append(j).toString());
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
        j = d();
          goto _L2
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

    public final boolean a()
    {
        return i;
    }

    public final boolean b(Context context)
    {
        if (k)
        {
            return false;
        } else
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.USER_PRESENT");
            intentfilter.addAction("android.intent.action.SCREEN_OFF");
            context.getApplicationContext().registerReceiver(new qc(this, (byte)0), intentfilter);
            k = true;
            return true;
        }
    }

}
