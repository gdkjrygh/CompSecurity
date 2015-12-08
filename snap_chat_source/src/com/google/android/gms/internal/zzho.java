// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
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
//            zzhx, zzca, zzbx, zzba, 
//            zzk, zzhu, zzic, zzab, 
//            zzhp, zzbe, zzhw, zzeo, 
//            zzbu

public class zzho
{
    final class zza extends BroadcastReceiver
    {

        final zzho zzzs;

        public final void onReceive(Context context, Intent intent)
        {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction()))
            {
                zzho.zza(zzzs, true);
            } else
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
            {
                zzho.zza(zzzs, false);
                return;
            }
        }

        private zza()
        {
            zzzs = zzho.this;
            super();
        }

    }


    private final Object zznh = new Object();
    private String zzyW;
    private boolean zzzq;
    private boolean zzzr;

    public zzho()
    {
        zzzq = true;
        zzzr = false;
    }

    static Object zza(zzho zzho1)
    {
        return zzho1.zznh;
    }

    static String zza(zzho zzho1, String s)
    {
        zzho1.zzyW = s;
        return s;
    }

    private JSONArray zza(Collection collection)
    {
        JSONArray jsonarray = new JSONArray();
        for (collection = collection.iterator(); collection.hasNext(); zza(jsonarray, collection.next())) { }
        return jsonarray;
    }

    private void zza(JSONArray jsonarray, Object obj)
    {
        if (obj instanceof Bundle)
        {
            jsonarray.put(zzg((Bundle)obj));
            return;
        }
        if (obj instanceof Map)
        {
            jsonarray.put(zzw((Map)obj));
            return;
        }
        if (obj instanceof Collection)
        {
            jsonarray.put(zza((Collection)obj));
            return;
        }
        if (obj instanceof Object[])
        {
            jsonarray.put(zza((Object[])obj));
            return;
        } else
        {
            jsonarray.put(obj);
            return;
        }
    }

    private void zza(JSONObject jsonobject, String s, Object obj)
    {
        if (obj instanceof Bundle)
        {
            jsonobject.put(s, zzg((Bundle)obj));
            return;
        }
        if (obj instanceof Map)
        {
            jsonobject.put(s, zzw((Map)obj));
            return;
        }
        if (obj instanceof Collection)
        {
            if (s == null)
            {
                s = "null";
            }
            jsonobject.put(s, zza((Collection)obj));
            return;
        }
        if (obj instanceof Object[])
        {
            jsonobject.put(s, zza(((Collection) (Arrays.asList((Object[])obj)))));
            return;
        } else
        {
            jsonobject.put(s, obj);
            return;
        }
    }

    static boolean zza(zzho zzho1, boolean flag)
    {
        zzho1.zzzq = flag;
        return flag;
    }

    private JSONObject zzg(Bundle bundle)
    {
        JSONObject jsonobject = new JSONObject();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); zza(jsonobject, s, bundle.get(s)))
        {
            s = (String)iterator.next();
        }

        return jsonobject;
    }

    public String zzS(String s)
    {
        return Uri.parse(s).buildUpon().query(null).build().toString();
    }

    public int zzT(String s)
    {
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzhx.zzac((new StringBuilder("Could not parse value:")).append(s).toString());
            return 0;
        }
        return i;
    }

    public boolean zzU(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            return s.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
        }
    }

    public DisplayMetrics zza(WindowManager windowmanager)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        windowmanager.getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics;
    }

    public PopupWindow zza(View view, int i, int j, boolean flag)
    {
        return new PopupWindow(view, i, j, flag);
    }

    public String zza(Context context, View view, zzba zzba1)
    {
        if (!((Boolean)zzca.zzqM.get()).booleanValue())
        {
            return null;
        }
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("width", zzba1.width);
        jsonobject1.put("height", zzba1.height);
        jsonobject.put("size", jsonobject1);
        jsonobject.put("activity", zzy(context));
        if (zzba1.zzpb) goto _L2; else goto _L1
_L1:
        context = new JSONArray();
_L8:
        if (view == null) goto _L4; else goto _L3
_L3:
        int i;
        try
        {
            zzba1 = view.getParent();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzhx.zzd("Fail to get view hierarchy json", context);
            return null;
        }
        if (zzba1 == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        i = -1;
        if (zzba1 instanceof ViewGroup)
        {
            i = ((ViewGroup)zzba1).indexOfChild(view);
        }
        view = new JSONObject();
        view.put("type", zzba1.getClass().getName());
        view.put("index_of_child", i);
        context.put(view);
        if (zzba1 == null) goto _L6; else goto _L5
_L5:
        if (zzba1 instanceof View)
        {
            view = (View)zzba1;
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

    public String zza(Context context, zzk zzk1, String s)
    {
        if (zzk1 == null)
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
        if (zzk1.zzc(uri1))
        {
            uri = zzk1.zza(uri1, context);
        }
        context = uri.toString();
        return context;
    }

    public String zza(InputStreamReader inputstreamreader)
    {
        StringBuilder stringbuilder = new StringBuilder(8192);
        char ac[] = new char[2048];
        do
        {
            int i = inputstreamreader.read(ac);
            if (i != -1)
            {
                stringbuilder.append(ac, 0, i);
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }

    JSONArray zza(Object aobj[])
    {
        JSONArray jsonarray = new JSONArray();
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            zza(jsonarray, aobj[i]);
        }

        return jsonarray;
    }

    public void zza(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        activity = activity.getWindow();
        if (activity != null && activity.getDecorView() != null && activity.getDecorView().getViewTreeObserver() != null)
        {
            activity.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(ongloballayoutlistener);
        }
    }

    public void zza(Context context, String s, WebSettings websettings)
    {
        websettings.setUserAgentString(zze(context, s));
    }

    public void zza(Context context, String s, List list)
    {
        for (list = list.iterator(); list.hasNext(); (new zzhu(context, s, (String)list.next())).start()) { }
    }

    public void zza(Context context, String s, List list, String s1)
    {
        for (list = list.iterator(); list.hasNext(); (new zzhu(context, s, (String)list.next(), s1)).start()) { }
    }

    public void zza(Context context, String s, boolean flag, HttpURLConnection httpurlconnection)
    {
        zza(context, s, flag, httpurlconnection, false);
    }

    public void zza(Context context, String s, boolean flag, HttpURLConnection httpurlconnection, String s1)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(flag);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", s1);
        httpurlconnection.setUseCaches(false);
    }

    public void zza(Context context, String s, boolean flag, HttpURLConnection httpurlconnection, boolean flag1)
    {
        httpurlconnection.setConnectTimeout(60000);
        httpurlconnection.setInstanceFollowRedirects(flag);
        httpurlconnection.setReadTimeout(60000);
        httpurlconnection.setRequestProperty("User-Agent", zze(context, s));
        httpurlconnection.setUseCaches(flag1);
    }

    public boolean zza(PackageManager packagemanager, String s, String s1)
    {
        return packagemanager.checkPermission(s1, s) == 0;
    }

    public boolean zza(ClassLoader classloader, Class class1, String s)
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

    public String zzb(zzic zzic1, String s)
    {
        return zza(zzic1.getContext(), zzic1.zzeI(), s);
    }

    public void zzc(Context context, String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s1);
        zza(context, s, arraylist);
    }

    public Map zzd(Uri uri)
    {
        if (uri == null)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = zzab.zzaO().zze(uri).iterator(); iterator.hasNext(); hashmap.put(s, uri.getQueryParameter(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    public String zze(Context context, String s)
    {
label0:
        {
            synchronized (zznh)
            {
                if (zzyW == null)
                {
                    break label0;
                }
                context = zzyW;
            }
            return context;
        }
        try
        {
            zzyW = zzab.zzaO().getDefaultUserAgent(context);
        }
        catch (Exception exception) { }
        if (!TextUtils.isEmpty(zzyW))
        {
            break MISSING_BLOCK_LABEL_142;
        }
        if (zzbe.zzbD().zzeC())
        {
            break MISSING_BLOCK_LABEL_133;
        }
        zzyW = null;
        zzhw.zzzG.post(new Runnable(context) {

            final Context zznK;
            final zzho zzzs;

            public void run()
            {
                synchronized (zzho.zza(zzzs))
                {
                    zzho.zza(zzzs, zzzs.zzv(zznK));
                    zzho.zza(zzzs).notifyAll();
                }
                return;
                exception1;
                obj1;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                zzzs = zzho.this;
                zznK = context;
                super();
            }
        });
_L1:
        context = zzyW;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        zznh.wait();
          goto _L1
        context;
        zzyW = zzet();
        zzhx.zzac((new StringBuilder("Interrupted, use default user agent: ")).append(zzyW).toString());
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        zzyW = zzv(context);
_L2:
        zzyW = (new StringBuilder()).append(zzyW).append(" (Mobile; ").append(s).append(")").toString();
        context = zzyW;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        zzyW = zzet();
          goto _L2
    }

    public boolean zzes()
    {
        return zzzq;
    }

    String zzet()
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

    public String zzeu()
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

    public String zzev()
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

    protected int[] zzew()
    {
        return (new int[] {
            0, 0
        });
    }

    public int[] zzg(Activity activity)
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
        return zzew();
    }

    public Bitmap zzh(View view)
    {
        view.setDrawingCacheEnabled(true);
        Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return bitmap;
    }

    public int[] zzh(Activity activity)
    {
        int ai[] = zzg(activity);
        return (new int[] {
            zzbe.zzbD().zzc(activity, ai[0]), zzbe.zzbD().zzc(activity, ai[1])
        });
    }

    public int[] zzi(Activity activity)
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
        return zzew();
    }

    public int[] zzj(Activity activity)
    {
        int ai[] = zzi(activity);
        return (new int[] {
            zzbe.zzbD().zzc(activity, ai[0]), zzbe.zzbD().zzc(activity, ai[1])
        });
    }

    public int zzk(Activity activity)
    {
        if (activity == null)
        {
            zzhx.zzac("Fail to get AdActivity type since it is null");
            return 0;
        }
        activity = zzeo.zzb(activity.getIntent());
        if (activity == null)
        {
            zzhx.zzac("Fail to get AdOverlayInfo");
            return 0;
        }
        switch (((zzeo) (activity)).zzuw)
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

    public boolean zzt(Context context)
    {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        context = context.getPackageManager().resolveActivity(intent, 0x10000);
        if (context == null || ((ResolveInfo) (context)).activityInfo == null)
        {
            zzhx.zzac("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        boolean flag;
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x10) == 0)
        {
            zzhx.zzac(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "keyboard"
            }));
            flag = false;
        } else
        {
            flag = true;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x20) == 0)
        {
            zzhx.zzac(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "keyboardHidden"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x80) == 0)
        {
            zzhx.zzac(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "orientation"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x100) == 0)
        {
            zzhx.zzac(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "screenLayout"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x200) == 0)
        {
            zzhx.zzac(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "uiMode"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x400) == 0)
        {
            zzhx.zzac(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "screenSize"
            }));
            flag = false;
        }
        if ((((ResolveInfo) (context)).activityInfo.configChanges & 0x800) == 0)
        {
            zzhx.zzac(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
                "smallestScreenSize"
            }));
            return false;
        } else
        {
            return flag;
        }
    }

    public boolean zzu(Context context)
    {
        if (zzzr)
        {
            return false;
        } else
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.USER_PRESENT");
            intentfilter.addAction("android.intent.action.SCREEN_OFF");
            context.getApplicationContext().registerReceiver(new zza(), intentfilter);
            zzzr = true;
            return true;
        }
    }

    protected String zzv(Context context)
    {
        return (new WebView(context)).getSettings().getUserAgentString();
    }

    public android.app.AlertDialog.Builder zzw(Context context)
    {
        return new android.app.AlertDialog.Builder(context);
    }

    public JSONObject zzw(Map map)
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); zza(jsonobject, s, map.get(s)))
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

    public zzbu zzx(Context context)
    {
        return new zzbu(context);
    }

    public String zzy(Context context)
    {
        context = (ActivityManager)context.getSystemService("activity");
        if (context == null)
        {
            return null;
        }
        context = context.getRunningTasks(1);
        if (context != null && !context.isEmpty())
        {
            context = (android.app.ActivityManager.RunningTaskInfo)context.get(0);
            if (context != null && ((android.app.ActivityManager.RunningTaskInfo) (context)).topActivity != null)
            {
                return ((android.app.ActivityManager.RunningTaskInfo) (context)).topActivity.getClassName();
            }
        }
        return null;
    }
}
