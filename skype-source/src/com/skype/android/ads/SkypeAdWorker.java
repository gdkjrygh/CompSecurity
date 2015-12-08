// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import android.content.Context;
import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.ads:
//            ConfigManager, SkypeAdManager, SkypeAdControlManager

public class SkypeAdWorker
    implements ConfigManager.ConfigListener
{
    private final class a extends TimerTask
    {

        final SkypeAdWorker a;

        public final void run()
        {
            SkypeAdManager skypeadmanager = SkypeAdManager.d();
            if (skypeadmanager != null && skypeadmanager.i())
            {
                return;
            } else
            {
                ConfigManager.b(SkypeAdWorker.a(a));
                return;
            }
        }

        private a()
        {
            a = SkypeAdWorker.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final SkypeAdWorker a = new SkypeAdWorker();
    private final String b = "SkypeAdWorker";
    private Context c;
    private Timer d;
    private boolean e;
    private final int f = 30000;
    private int g;

    private SkypeAdWorker()
    {
        e = false;
        g = 30000;
    }

    static Context a(SkypeAdWorker skypeadworker)
    {
        return skypeadworker.c;
    }

    public static SkypeAdWorker a()
    {
        return a;
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        e();
        d = new Timer();
        d.schedule(new a((byte)0), g);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (d != null)
        {
            d.cancel();
            d.purge();
            d = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        if (context != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        c = context;
        if (!e)
        {
            e = true;
            ConfigManager.a(this);
            ConfigManager.b(context);
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public final void a(Exception exception)
    {
        Log.e("SkypeAdWorker", (new StringBuilder("download config exception ")).append(exception).toString());
        int i = (int)ConfigManager.k();
        if (g >= i)
        {
            g = 30000;
        } else
        {
            g = g * 2;
        }
        (new StringBuilder("retry download config with backoff interval ")).append(g);
        d();
    }

    public final void a(JSONObject jsonobject)
    {
        SkypeAdManager.d().k();
        SkypeAdControlManager.a().a(jsonobject);
        g = 30000;
    }

    public final void b()
    {
        for (SkypeAdManager skypeadmanager = SkypeAdManager.d(); skypeadmanager != null && skypeadmanager.i() || c == null;)
        {
            return;
        }

        ConfigManager.b(c);
    }

    public final void c()
    {
        ConfigManager.e();
        g = 30000;
        e();
    }

}
