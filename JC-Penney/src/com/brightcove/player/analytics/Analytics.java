// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.analytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.model.Video;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.analytics:
//            a, b, c, d, 
//            e, f, g, h, 
//            i

public class Analytics extends AbstractComponent
{

    public static final String TAG = com/brightcove/player/analytics/Analytics.getSimpleName();
    private final Map a;
    private int b;
    private int c;
    private int d;
    public String destination;
    private boolean e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private boolean k;
    private Context l;

    public Analytics(EventEmitter eventemitter, Context context)
    {
        this(eventemitter, context, com/brightcove/player/analytics/Analytics);
    }

    protected Analytics(EventEmitter eventemitter, Context context, Class class1)
    {
        super(eventemitter, class1);
        a = new HashMap();
        i = "android-native-sdk";
        l = context;
        d = 0;
        c = 0;
        e = false;
        a(context);
        a();
        f = b(context);
    }

    static int a(Analytics analytics, int i1)
    {
        analytics.b = i1;
        return i1;
    }

    static String a(Analytics analytics, String s)
    {
        analytics.j = s;
        return s;
    }

    static Map a(Analytics analytics)
    {
        return analytics.a;
    }

    private void a()
    {
        F.on("addAnalyticsBaseParams", new a(this));
        F.on("setAnalyticsBaseParams", new b(this));
        F.on("willChangeVideo", new c(this));
        F.on("didSeekTo", new d(this));
        F.on("progress", new e(this));
        F.on("completed", new f(this));
        F.on("videoDurationChanged", new g(this));
        F.on("version", new h(this));
    }

    private void a(Context context)
    {
        Object obj;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        obj = context.getApplicationContext();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        obj = ((Context) (obj)).getPackageManager();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        obj = (String)((PackageManager) (obj)).getApplicationLabel(((PackageManager) (obj)).getApplicationInfo(context.getPackageName(), 0));
        setDestination((new StringBuilder()).append("bcsdk://").append(((String) (obj))).append("/").append(context.getClass().getPackage().getName()).toString());
        return;
        context;
        Log.w(TAG, "No application name found.");
        return;
    }

    static void a(Analytics analytics, Event event, int i1, int j1)
    {
        analytics.a(event, i1, j1);
    }

    static void a(Analytics analytics, Event event, String s, Map map)
    {
        analytics.b(event, s, map);
    }

    private void a(Event event, int i1, int j1)
    {
        i1 /= 1000;
        j1 = j1 / 1000 - 1;
        if (j1 < i1)
        {
            return;
        }
        HashMap hashmap = new HashMap();
        if (b > 0)
        {
            hashmap.put("range", String.format("%d..%d", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(j1)
            }));
        } else
        {
            hashmap.put("video_seconds_viewed", String.format("%d", new Object[] {
                Integer.valueOf(j1 - i1)
            }));
        }
        b(event, "video_engagement", hashmap);
    }

    static boolean a(Analytics analytics, boolean flag)
    {
        analytics.e = flag;
        return flag;
    }

    static int b(Analytics analytics, int i1)
    {
        analytics.c = i1;
        return i1;
    }

    private String b()
    {
        return Build.CPU_ABI;
    }

    private String b(Context context)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        if (((TelephonyManager)context.getSystemService("phone")).getPhoneType() != 0)
        {
            return "mobile";
        }
        break MISSING_BLOCK_LABEL_33;
        context;
        return "tablet";
        context;
        return "tablet";
        return "tablet";
    }

    static void b(Analytics analytics)
    {
        analytics.d();
    }

    private void b(Event event, String s, Map map)
    {
        Object obj = map;
        if (map == null)
        {
            obj = new HashMap();
        }
        Object obj1 = (Video)event.properties.get("video");
        map = ((Map) (obj1));
        if (obj1 == null)
        {
            map = (Video)event.properties.get("currentVideo");
        }
        obj1 = map;
        if (map == null)
        {
            obj1 = (Video)event.properties.get("nextVideo");
        }
        if (obj1 != null)
        {
            map = ((Video) (obj1)).getId();
            if (!map.isEmpty())
            {
                ((Map) (obj)).put("video", map);
            }
            map = ((Video) (obj1)).getStringProperty("pubId");
            if (map != null && !map.isEmpty())
            {
                ((Map) (obj)).put("account", map);
            } else
            if (g != null)
            {
                ((Map) (obj)).put("account", g);
            } else
            {
                Log.w(TAG, "Missing account ID.");
                return;
            }
        }
        a(event, s, ((Map) (obj)));
    }

    static int c(Analytics analytics)
    {
        return analytics.d;
    }

    static int c(Analytics analytics, int i1)
    {
        analytics.d = i1;
        return i1;
    }

    private String c()
    {
        return Build.SUPPORTED_ABIS[0];
    }

    static int d(Analytics analytics)
    {
        return analytics.c;
    }

    private void d()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("baseParams", a);
        F.emit("didSetAnalyticsBaseParams", hashmap);
    }

    static boolean e(Analytics analytics)
    {
        return analytics.e;
    }

    static EventEmitter f(Analytics analytics)
    {
        return analytics.F;
    }

    static EventEmitter g(Analytics analytics)
    {
        return analytics.F;
    }

    static EventEmitter h(Analytics analytics)
    {
        return analytics.F;
    }

    static EventEmitter i(Analytics analytics)
    {
        return analytics.F;
    }

    protected Map a(Event event, String s, Map map)
    {
        HashMap hashmap = new HashMap();
        hashmap.putAll(a);
        if (map != null)
        {
            hashmap.putAll(map);
        }
        event = (Video)event.properties.get("video");
        if (event != null && event.getId() != null)
        {
            event = event.getStringProperty("name");
            if (event != null && event.isEmpty())
            {
                hashmap.put("video_name", event);
            }
        }
        if (b > 0)
        {
            hashmap.put("video_duration", (new StringBuilder()).append("").append(b / 1000).toString());
        }
        hashmap.put("event", s);
        hashmap.put("domain", "videocloud");
        hashmap.put("device_os", "android");
        hashmap.put("device_type", f);
        hashmap.put("device_os_version", android.os.Build.VERSION.RELEASE);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            hashmap.put("device_cpu", c());
        } else
        {
            hashmap.put("device_cpu", b());
        }
        hashmap.put("time", (new StringBuilder()).append("").append((new Date()).getTime()).toString());
        hashmap.put("platform", i);
        hashmap.put("platform_version", j);
        if (destination != null)
        {
            hashmap.put("destination", destination);
        }
        if (h != null)
        {
            hashmap.put("source", h);
        }
        if (k)
        {
            hashmap.put("user", android.provider.Settings.Secure.getString(l.getContentResolver(), "android_id"));
        }
        event = new i(this);
        s = new HashMap[1];
        s[0] = hashmap;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            event.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, s);
            return hashmap;
        } else
        {
            event.execute(s);
            return hashmap;
        }
    }

    public String getAccount()
    {
        return g;
    }

    public boolean getUniqueIdentifierEnabled()
    {
        return k;
    }

    public void setAccount(String s)
    {
        g = s;
        HashMap hashmap = new HashMap();
        hashmap.put("value", s);
        F.emit("account", hashmap);
    }

    public void setDestination(String s)
    {
        destination = s;
        Uri uri = Uri.parse(s);
        if (uri.getScheme() == null)
        {
            Log.e(TAG, (new StringBuilder()).append("Invalid destination (a scheme is required): ").append(s).toString());
        }
        if (uri.getAuthority() == null)
        {
            Log.e(TAG, (new StringBuilder()).append("Invalid destination (an authority is required): ").append(s).toString());
        }
    }

    public void setSource(String s)
    {
        h = s;
        Uri uri = Uri.parse(s);
        if (uri.getScheme() == null)
        {
            Log.e(TAG, (new StringBuilder()).append("Invalid source (a scheme is required): ").append(s).toString());
        }
        if (uri.getAuthority() == null)
        {
            Log.e(TAG, (new StringBuilder()).append("Invalid source (an authority is required): ").append(s).toString());
        }
    }

    public void setUniqueIdentifierEnabled(boolean flag)
    {
        k = flag;
    }

}
