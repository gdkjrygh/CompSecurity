// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzak;
import com.google.android.gms.analytics.internal.zzd;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.internal.zzht;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            Tracker, GoogleAnalytics

private class d extends zzd
    implements ytics.a
{

    final Tracker a;
    private boolean b;
    private int c;
    private long d;
    private boolean e;
    private long f;

    private void c()
    {
        if (d >= 0L || b)
        {
            zzfT().zza(Tracker.zza(a));
            return;
        } else
        {
            zzfT().zzb(Tracker.zza(a));
            return;
        }
    }

    public void a(long l)
    {
        d = l;
        c();
    }

    public void a(Activity activity)
    {
        if (c == 0 && b())
        {
            e = true;
        }
        c = c + 1;
        if (b)
        {
            Object obj = activity.getIntent();
            if (obj != null)
            {
                a.setCampaignParamsOnNextHit(((Intent) (obj)).getData());
            }
            HashMap hashmap = new HashMap();
            hashmap.put("&t", "screenview");
            Tracker tracker = a;
            if (Tracker.zzk(a) != null)
            {
                obj = Tracker.zzk(a).zzq(activity);
            } else
            {
                obj = activity.getClass().getCanonicalName();
            }
            tracker.set("&cd", ((String) (obj)));
            if (TextUtils.isEmpty((CharSequence)hashmap.get("&dr")))
            {
                activity = Tracker.zzp(activity);
                if (!TextUtils.isEmpty(activity))
                {
                    hashmap.put("&dr", activity);
                }
            }
            a.send(hashmap);
        }
    }

    public void a(boolean flag)
    {
        b = flag;
        c();
    }

    public boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = e;
        e = false;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(Activity activity)
    {
        c = c - 1;
        c = Math.max(0, c);
        if (c == 0)
        {
            f = zzgG().elapsedRealtime();
        }
    }

    boolean b()
    {
        return zzgG().elapsedRealtime() >= f + Math.max(1000L, d);
    }

    protected void zzgb()
    {
    }

    protected ze(Tracker tracker, zze zze)
    {
        a = tracker;
        super(zze);
        d = -1L;
    }
}
