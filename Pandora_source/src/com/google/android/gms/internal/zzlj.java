// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;

// Referenced classes of package com.google.android.gms.internal:
//            zzlk

public class zzlj
    implements zzlk.zza
{

    private final zzlk zzayn;
    private boolean zzayo;

    public zzlj(Context context, int i)
    {
        this(context, i, null);
    }

    public zzlj(Context context, int i, String s)
    {
        this(context, i, s, null, true);
    }

    public zzlj(Context context, int i, String s, String s1, boolean flag)
    {
        String s2;
        if (context != context.getApplicationContext())
        {
            s2 = context.getClass().getName();
        } else
        {
            s2 = "OneTimePlayLogger";
        }
        zzayn = new zzlk(context, i, s, s1, this, flag, s2);
        zzayo = true;
    }

    private void zzvo()
    {
        if (!zzayo)
        {
            throw new IllegalStateException("Cannot reuse one-time logger after sending.");
        } else
        {
            return;
        }
    }

    public void send()
    {
        zzvo();
        zzayn.start();
        zzayo = false;
    }

    public transient void zza(String s, byte abyte0[], String as[])
    {
        zzvo();
        zzayn.zzb(s, abyte0, as);
    }

    public void zzf(PendingIntent pendingintent)
    {
        Log.w("OneTimePlayLogger", (new StringBuilder()).append("logger connection failed: ").append(pendingintent).toString());
    }

    public void zzvp()
    {
        zzayn.stop();
    }

    public void zzvq()
    {
        Log.w("OneTimePlayLogger", "logger connection failed");
    }
}
