// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.crash;

import android.app.Activity;
import android.content.Context;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.util.Charsets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.hockeyapp.android.CrashManager;
import net.hockeyapp.android.CrashManagerListener;

// Referenced classes of package com.skype.android.crash:
//            CrashReporter, CrashReporterConfig, RestartExceptionHandler

public class HockeyAppCrashReporter
    implements CrashReporter
{

    private boolean b;
    private CrashReporterConfig c;
    private Context d;
    private String e;
    private CrashManagerListener f;

    public HockeyAppCrashReporter(ApplicationConfig applicationconfig)
    {
        f = new CrashManagerListener() {

            final HockeyAppCrashReporter a;

            public final String getContact()
            {
                return HockeyAppCrashReporter.a(a);
            }

            public final String getDescription()
            {
                StringBuilder stringbuilder = new StringBuilder();
                HockeyAppCrashReporter.a(a, stringbuilder);
                return stringbuilder.toString();
            }

            public final String getUserID()
            {
                if (HockeyAppCrashReporter.b(a).a())
                {
                    return android.provider.Settings.Secure.getString(HockeyAppCrashReporter.c(a).getContentResolver(), "android_id");
                } else
                {
                    return "";
                }
            }

            public final net.hockeyapp.android.CrashManagerListener.CrashHandlingPolicy onCrashesFound()
            {
                if ("qb-market".contains("beta") || "releaseQb".contains("debug"))
                {
                    return net.hockeyapp.android.CrashManagerListener.CrashHandlingPolicy.SEND_SILENTLY;
                }
                if (HockeyAppCrashReporter.b(a).c())
                {
                    return net.hockeyapp.android.CrashManagerListener.CrashHandlingPolicy.ASK_USER;
                } else
                {
                    return net.hockeyapp.android.CrashManagerListener.CrashHandlingPolicy.SEND_SILENTLY;
                }
            }

            
            {
                a = HockeyAppCrashReporter.this;
                super();
            }
        };
        c = applicationconfig.getCrashReporterConfig();
    }

    static String a(HockeyAppCrashReporter hockeyappcrashreporter)
    {
        return hockeyappcrashreporter.e;
    }

    static void a(HockeyAppCrashReporter hockeyappcrashreporter, StringBuilder stringbuilder)
    {
        if (!hockeyappcrashreporter.c.b())
        {
            break MISSING_BLOCK_LABEL_73;
        }
        hockeyappcrashreporter = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d com.skype:D *:S").getInputStream(), Charsets.a));
_L1:
        String s = hockeyappcrashreporter.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        stringbuilder.append(s);
        stringbuilder.append(System.getProperty("line.separator"));
          goto _L1
        try
        {
            hockeyappcrashreporter.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HockeyAppCrashReporter hockeyappcrashreporter) { }
    }

    static CrashReporterConfig b(HockeyAppCrashReporter hockeyappcrashreporter)
    {
        return hockeyappcrashreporter.c;
    }

    static Context c(HockeyAppCrashReporter hockeyappcrashreporter)
    {
        return hockeyappcrashreporter.d;
    }

    public final void a()
    {
        e = null;
    }

    public final void a(Activity activity)
    {
        d = activity.getApplicationContext();
        if (!b)
        {
            Thread.setDefaultUncaughtExceptionHandler(new RestartExceptionHandler(d));
            CrashManager.register(d, "74a6db1ddfb946077fcbe1649ad4ff1e", f, true);
            b = true;
        }
    }
}
