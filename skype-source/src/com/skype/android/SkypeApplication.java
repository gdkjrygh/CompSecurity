// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.app.Application;
import android.content.Context;
import android.net.http.HttpResponseCache;
import android.support.multidex.a;
import com.skype.android.app.WakeupSchedulerAgent;
import com.skype.android.app.access.AccessAgent;
import com.skype.android.app.ads.AdManagerInitializer;
import com.skype.android.app.calling.CallAgent;
import com.skype.android.app.chat.MessageAgent;
import com.skype.android.app.contacts.ContactAgent;
import com.skype.android.app.media.MediaMessageAgent;
import com.skype.android.app.media.MediaSaveToGalleryAgent;
import com.skype.android.app.signin.AccountAgent;
import com.skype.android.app.transfer.TransferAgent;
import com.skype.android.breakpad.BreakpadWrapper;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.ConfigUpdater;
import com.skype.android.config.LoggingConfig;
import com.skype.android.config.UpdateConfig;
import com.skype.android.config.partner.CobrandIdSource;
import com.skype.android.config.partner.TrackingIdSource;
import com.skype.android.crash.DumpUploader;
import com.skype.android.inject.ApplicationModule;
import com.skype.android.push.PushManager;
import com.skype.android.service.ContactsScrapeAgent;
import com.skype.android.telemetry.SCTManager;
import com.skype.android.util.PerformanceLog;
import com.skype.android.util.StartupTimeReporter;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.chained.Retriever;
import com.skype.android.wakeup.ForegroundObserver;
import java.io.File;
import java.util.logging.LogManager;
import net.hockeyapp.android.Constants;

// Referenced classes of package com.skype.android:
//            DaggerSkypeApplicationComponent, SkypeModule, SkypeApplicationComponent

public class SkypeApplication extends Application
    implements SkypeApplicationComponent.ComponentProvider
{

    ForegroundObserver a;
    PushManager b;
    DumpUploader c;
    AdManagerInitializer d;
    WakeupSchedulerAgent e;
    AccountAgent f;
    CallAgent g;
    MessageAgent h;
    MediaSaveToGalleryAgent i;
    TransferAgent j;
    ContactAgent k;
    AccessAgent l;
    AccessibilityUtil m;
    MediaMessageAgent n;
    ContactsScrapeAgent o;
    SCTManager p;
    private Retriever q;
    private Retriever r;
    private SkypeApplicationComponent s;

    public SkypeApplication()
    {
    }

    public static String b()
    {
        return "6.13.0.608";
    }

    public static String d()
    {
        return String.format("%s/%s", new Object[] {
            "20703", "6.13.0.608"
        });
    }

    public static String g()
    {
        return "20703";
    }

    private String h()
    {
        if (r == null)
        {
            r = CobrandIdSource.chainTogether(this);
        }
        String s1 = (String)r.getValue();
        if (CobrandIdSource.isPlaceholder(s1))
        {
            return "6.13.0.608";
        } else
        {
            String as[] = "6.13.0.608".split("[\\.\\-]");
            as[2] = s1;
            return String.format("%s.%s.%s.%s", new Object[] {
                as[0], as[1], as[2], as[3]
            });
        }
    }

    public final SkypeApplicationComponent a()
    {
        if (s == null)
        {
            s = DaggerSkypeApplicationComponent.builder().a(new ApplicationModule(this)).a(new SkypeModule()).a();
        }
        return s;
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        android.support.multidex.a.a(this);
    }

    public final String c()
    {
        return String.format("%s/%s", new Object[] {
            "20703", e()
        });
    }

    public final String e()
    {
        String s1 = f();
        String s2 = h();
        if (TrackingIdSource.isPlaceholder(s1))
        {
            return s2;
        } else
        {
            return String.format("%s/%s", new Object[] {
                s2, s1
            });
        }
    }

    public final String f()
    {
        if (q == null)
        {
            q = TrackingIdSource.chainTogether(this);
        }
        return (String)q.getValue();
    }

    public void onCreate()
    {
        StartupTimeReporter.a().c();
        super.onCreate();
        PerformanceLog.e.b();
        LogManager.getLogManager().reset();
        Object obj = ApplicationConfig.getInstance();
        String s1 = c();
        if (((ApplicationConfig) (obj)).getUpdateConfig().getLastVersion() == null)
        {
            ((ApplicationConfig) (obj)).getUpdateConfig().setLastVersion(s1);
        }
        ((ApplicationConfig) (obj)).getUpdateConfig().setLastOsVersion(android.os.Build.VERSION.SDK_INT);
        ((ApplicationConfig) (obj)).getLoggingConfig().setSaveCorelibLogs(false);
        ((ApplicationConfig) (obj)).getLoggingConfig().setSaveAppLogs(false);
        (new ConfigUpdater(this)).updateLocalConfig();
        a().inject(this);
        try
        {
            if (getCacheDir() != null)
            {
                HttpResponseCache.install(new File(getCacheDir(), "http"), 0x500000L);
            }
        }
        catch (Exception exception) { }
        Constants.loadFromContext(getApplicationContext());
        obj = getApplicationContext().getFilesDir().getAbsolutePath();
        BreakpadWrapper.a();
        BreakpadWrapper.a(((String) (obj)));
        c.a(h());
        obj = new File(((String) (obj)));
        c.a("74a6db1ddfb946077fcbe1649ad4ff1e", ((File) (obj)));
    }
}
