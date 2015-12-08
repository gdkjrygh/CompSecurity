// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.skylib;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.TextUtils;
import com.skype.GIImpl;
import com.skype.SkyLib;
import com.skype.SkyLibImpl;
import com.skype.Utility;
import com.skype.android.analytics.AnalyticsStorage;
import com.skype.android.gen.GIListener;
import com.skype.android.gen.SkyLibListener;
import com.skype.android.util.CrashAndAnrHandler;
import com.skype.android.util.MethodTrace;
import com.skype.pcmhost.PcmHost;
import java.io.File;
import java.util.Locale;

// Referenced classes of package com.skype.android.skylib:
//            InitializerConfiguration, VideoHostInitializer, PcmHostCallback, GISetup, 
//            PropertiesFileSetup

public class SkyLibInitializer
{

    private static SkyLibInitializer a = new SkyLibInitializer();
    private Context b;
    private SkyLib c;
    private GIListener d;
    private SkyLibListener e;
    private PcmHost f;
    private PcmHostCallback g;
    private VideoHostInitializer h;

    private SkyLibInitializer()
    {
    }

    public static SkyLibInitializer a()
    {
        return a;
    }

    public final SkyLib a(Context context, InitializerConfiguration initializerconfiguration, AnalyticsStorage analyticsstorage)
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_561;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        throw new IllegalArgumentException("null context");
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        String s;
        GISetup gisetup;
        String s3;
        VideoHostInitializer videohostinitializer;
        boolean flag;
        boolean flag1;
        s3 = initializerconfiguration.a();
        s = initializerconfiguration.b();
        gisetup = initializerconfiguration.c();
        videohostinitializer = initializerconfiguration.d();
        flag = initializerconfiguration.e();
        flag1 = initializerconfiguration.f();
        if (s3 != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        throw new IllegalArgumentException("null version");
        Object obj;
        obj = s;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        obj = context.getFilesDir().getAbsolutePath();
        if (gisetup != null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        throw new IllegalArgumentException("null giSetup");
        if (videohostinitializer != null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        throw new IllegalArgumentException("null videoHostInitializer");
        MethodTrace methodtrace;
        methodtrace = new MethodTrace("SkyLibInitializer", "init");
        b = context;
        s = context.getFilesDir().getAbsolutePath();
        String s1 = context.getCacheDir().getAbsolutePath();
        CrashAndAnrHandler.saveHandlers();
        Utility.initialize(context, initializerconfiguration.h(), s1, s);
        String s2;
        s2 = "";
        s = s2;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        File file = context.getExternalCacheDir();
        s = s2;
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        long l = SystemClock.elapsedRealtime();
        s = (new StringBuilder()).append(file.getAbsolutePath()).append('/').append("skylib_").append(l).append(".log").toString();
        Utility.initMedia();
        h = videohostinitializer;
        h.initLibs(context);
        GIImpl.initPlatform(s, flag1, true);
        c = new SkyLibImpl(s3, ((String) (obj)), false, false);
        obj = context.getPackageManager();
        g = new PcmHostCallback();
        f = new PcmHost(context, ((PackageManager) (obj)).hasSystemFeature("android.hardware.telephony"), false, true, g);
        obj = c.getSetup();
        flag = initializerconfiguration.j();
        gisetup.a(b, ((com.skype.Setup) (obj)), GISetup.Scope.a);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_396;
        }
        (new PropertiesFileSetup()).a(b, ((com.skype.Setup) (obj)), GISetup.Scope.a);
        initializerconfiguration = android.provider.Settings.Secure.getString(b.getContentResolver(), "android_id");
        c.setAndroidId(initializerconfiguration);
        initializerconfiguration = analyticsstorage.b();
        c.ecsAddQueryParameter("", "clientid", initializerconfiguration);
        c.setIMEI(initializerconfiguration);
        initializerconfiguration = new MethodTrace("SkyLib", "start");
        h.postInit(context);
        c.fireIntent(com.skype.SkyLib.INTENT.I_UNKNOWN);
        c.start(true);
        initializerconfiguration.b();
        b();
        d = new GIListener();
        e = new SkyLibListener();
        c.addListener(d);
        c.addListener(e);
        methodtrace.b();
        CrashAndAnrHandler.restoreHandlers();
        context = c;
        this;
        JVM INSTR monitorexit ;
        return context;
    }

    public final void b()
    {
        String s = b.getResources().getConfiguration().locale.getLanguage();
        if (!TextUtils.isEmpty(s))
        {
            c.setUIStrProp(com.skype.SkyLib.UIPROP.UIPROP_LANGUAGE, s);
            c.setUIStrProp(com.skype.SkyLib.UIPROP.UIPROP_NOTIFICATIONS_LANGUAGE, s);
        }
    }

    public final SkyLib c()
    {
        return c;
    }

    public final PcmHost d()
    {
        return f;
    }

    public final PcmHostCallback e()
    {
        return g;
    }

}
