// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

public final class dtb extends mtf
{

    private final Intent a;

    public dtb(Intent intent)
    {
        super("AliveLogTask");
        a = intent;
    }

    protected final mue a(Context context)
    {
        Object obj;
        context = (dtc)olm.a(context, dtc);
        obj = a;
        if (!"com.google.android.apps.photos.alivelog.DAILY_LOG".equals(((Intent) (obj)).getAction())) goto _L2; else goto _L1
_L1:
        if (context.a())
        {
            if (context.b())
            {
                obj = PendingIntent.getBroadcast(((dtc) (context)).a, 0, context.c(), 0x20000000);
                if (obj != null)
                {
                    ((AlarmManager)((dtc) (context)).a.getSystemService("alarm")).cancel(((PendingIntent) (obj)));
                }
            }
        } else
        {
            obj = new HashMap();
            ((Map) (obj)).put("&t", "screenview");
            ((Map) (obj)).put("&cd", "AliveLog");
            ((dtc) (context)).b.a(((Map) (obj)));
        }
_L4:
        return new mue(true);
_L2:
        if ("android.intent.action.ACTION_POWER_CONNECTED".equals(((Intent) (obj)).getAction()) && !context.a() && !context.b())
        {
            PendingIntent pendingintent = PendingIntent.getBroadcast(((dtc) (context)).a, 0, context.c(), 0x10000000);
            ((dtc) (context)).c.setInexactRepeating(3, SystemClock.elapsedRealtime(), 0x5265c00L, pendingintent);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
