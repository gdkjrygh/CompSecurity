// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.cmcm.adsdk.b.c.b;
import com.cmcm.adsdk.b.d.a;

// Referenced classes of package com.cmcm.adsdk.b:
//            f

public final class e
{

    private static e a = null;
    private a b;
    private Context c;
    private String d;
    private boolean e;
    private PendingIntent f;
    private f g;

    private e(Context context)
    {
        e = false;
        c = context;
        b = com.cmcm.adsdk.b.d.a.a();
    }

    public static e a(Context context)
    {
        com/cmcm/adsdk/b/e;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new e(context);
        }
        context = a;
        com/cmcm/adsdk/b/e;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static String a(e e1)
    {
        return e1.d;
    }

    static a b(e e1)
    {
        return e1.b;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!e) goto _L2; else goto _L1
_L1:
        com.cmcm.adsdk.b.c.b.a("ConfigChangeMonitor", "has start monitor, avoid repeat monitor ...");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.cmcm.adsdk.b.c.b.a("ConfigChangeMonitor", "start monitor...");
        d = s;
        e = true;
        if (g == null)
        {
            g = new f(this, (byte)0);
        }
        s = new IntentFilter();
        s.addAction("com.cmcm.adsdk.ConfigMonitor_Action");
        c.getApplicationContext().registerReceiver(g, s);
_L5:
        s = new Intent();
        s.setAction("com.cmcm.adsdk.ConfigMonitor_Action");
        if (f == null)
        {
            f = PendingIntent.getBroadcast(c, 0, s, 0);
        }
        ((AlarmManager)c.getSystemService("alarm")).setRepeating(1, System.currentTimeMillis() + 0x6ddd00L, 0x6ddd00L, f);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
        s;
        s.printStackTrace();
          goto _L5
    }

}
