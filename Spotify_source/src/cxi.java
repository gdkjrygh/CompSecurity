// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

public final class cxi
{

    public static boolean a = false;
    private static cxi v;
    private static final Object w = new Object();
    final int b;
    final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    final boolean i;
    final String j;
    final String k;
    final String l;
    final String m;
    public final String n;
    public final String o;
    final boolean p;
    public final String q;
    public final String r;
    private final int s;
    private final int t;
    private SSLSocketFactory u;

    private cxi(Bundle bundle, Context context)
    {
        Object obj;
        obj = null;
        super();
        Object obj1;
        obj1 = SSLContext.getInstance("TLS");
        ((SSLContext) (obj1)).init(null, null, null);
        obj1 = ((SSLContext) (obj1)).getSocketFactory();
        obj = obj1;
_L1:
        u = ((SSLSocketFactory) (obj));
        a = bundle.getBoolean("com.mixpanel.android.MPConfig.EnableDebugLogging", false);
        if (bundle.containsKey("com.mixpanel.android.MPConfig.AutoCheckForSurveys"))
        {
            Log.w("MixpanelAPI.Conf", "com.mixpanel.android.MPConfig.AutoCheckForSurveys has been deprecated in favor of com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates. Please update this key as soon as possible.");
        }
        b = bundle.getInt("com.mixpanel.android.MPConfig.BulkUploadLimit", 40);
        s = bundle.getInt("com.mixpanel.android.MPConfig.FlushInterval", 60000);
        t = bundle.getInt("com.mixpanel.android.MPConfig.DebugFlushInterval", 1000);
        c = bundle.getInt("com.mixpanel.android.MPConfig.DataExpiration", 0x19bfcc00);
        d = bundle.getInt("com.mixpanel.android.MPConfig.MinimumDatabaseLimit", 0x1400000);
        e = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableFallback", true);
        r = bundle.getString("com.mixpanel.android.MPConfig.ResourcePackageName");
        g = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableGestureBindingUI", false);
        h = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableEmulatorBindingUI", false);
        i = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableAppOpenEvent", true);
        boolean flag = bundle.getBoolean("com.mixpanel.android.MPConfig.AutoCheckForSurveys", true);
        boolean flag1 = bundle.getBoolean("com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates", true);
        String s1;
        GeneralSecurityException generalsecurityexception;
        if (flag && flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = flag;
        f = bundle.getBoolean("com.mixpanel.android.MPConfig.TestMode", false);
        s1 = bundle.getString("com.mixpanel.android.MPConfig.EventsEndpoint");
        obj = s1;
        if (s1 == null)
        {
            obj = "https://api.mixpanel.com/track?ip=1";
        }
        j = ((String) (obj));
        s1 = bundle.getString("com.mixpanel.android.MPConfig.EventsFallbackEndpoint");
        obj = s1;
        if (s1 == null)
        {
            obj = "http://api.mixpanel.com/track?ip=1";
        }
        k = ((String) (obj));
        s1 = bundle.getString("com.mixpanel.android.MPConfig.PeopleEndpoint");
        obj = s1;
        if (s1 == null)
        {
            obj = "https://api.mixpanel.com/engage";
        }
        l = ((String) (obj));
        s1 = bundle.getString("com.mixpanel.android.MPConfig.PeopleFallbackEndpoint");
        obj = s1;
        if (s1 == null)
        {
            obj = "http://api.mixpanel.com/engage";
        }
        m = ((String) (obj));
        s1 = bundle.getString("com.mixpanel.android.MPConfig.DecideEndpoint");
        obj = s1;
        if (s1 == null)
        {
            obj = "https://decide.mixpanel.com/decide";
        }
        n = ((String) (obj));
        s1 = bundle.getString("com.mixpanel.android.MPConfig.DecideFallbackEndpoint");
        obj = s1;
        if (s1 == null)
        {
            obj = "http://decide.mixpanel.com/decide";
        }
        o = ((String) (obj));
        obj = bundle.getString("com.mixpanel.android.MPConfig.EditorUrl");
        bundle = ((Bundle) (obj));
        if (obj == null)
        {
            bundle = "wss://switchboard.mixpanel.com/connect/";
        }
        q = bundle;
        if (a)
        {
            Log.v("MixpanelAPI.Conf", (new StringBuilder("Mixpanel configured with:\n    AutoShowMixpanelUpdates ")).append(p).append("\n    BulkUploadLimit ").append(b).append("\n    FlushInterval ").append(b(context)).append("\n    DataExpiration ").append(c).append("\n    MinimumDatabaseLimit ").append(d).append("\n    DisableFallback ").append(e).append("\n    DisableAppOpenEvent ").append(i).append("\n    DisableDeviceUIBinding ").append(g).append("\n    DisableEmulatorUIBinding ").append(h).append("\n    EnableDebugLogging ").append(a).append("\n    TestMode ").append(f).append("\n    EventsEndpoint ").append(j).append("\n    PeopleEndpoint ").append(l).append("\n    DecideEndpoint ").append(n).append("\n    EventsFallbackEndpoint ").append(k).append("\n    PeopleFallbackEndpoint ").append(m).append("\n    DecideFallbackEndpoint ").append(o).append("\n    EditorUrl ").append(q).append("\n").toString());
        }
        return;
        generalsecurityexception;
        Log.i("MixpanelAPI.Conf", "System has no SSL support. Built-in events editor will not be available", generalsecurityexception);
          goto _L1
    }

    public static cxi a(Context context)
    {
        synchronized (w)
        {
            if (v == null)
            {
                v = c(context.getApplicationContext());
            }
        }
        return v;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static cxi c(Context context)
    {
        String s1 = context.getPackageName();
        Bundle bundle;
        Bundle bundle1;
        try
        {
            bundle1 = context.getPackageManager().getApplicationInfo(s1, 128).metaData;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder("Can't configure Mixpanel with package name ")).append(s1).toString(), context);
        }
        bundle = bundle1;
        if (bundle1 != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        bundle = new Bundle();
        context = new cxi(bundle, context);
        return context;
    }

    public final SSLSocketFactory a()
    {
        this;
        JVM INSTR monitorenter ;
        SSLSocketFactory sslsocketfactory = u;
        this;
        JVM INSTR monitorexit ;
        return sslsocketfactory;
        Exception exception;
        exception;
        throw exception;
    }

    public final int b(Context context)
    {
        boolean flag;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        context = context.getApplicationInfo();
        int i1 = ((ApplicationInfo) (context)).flags & 2;
        context.flags = i1;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        flag = true;
_L1:
        if (flag)
        {
            return t;
        } else
        {
            return s;
        }
        flag = false;
          goto _L1
    }

}
