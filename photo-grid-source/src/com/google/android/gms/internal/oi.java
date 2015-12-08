// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

// Referenced classes of package com.google.android.gms.internal:
//            oj, ip

public final class oi extends com.google.android.gms.ads.internal.reward.client.zzb.zza
{

    private final Context a;
    private final VersionInfoParcel b;
    private final oj c;
    private final Object d = new Object();

    public oi(Context context, ip ip, VersionInfoParcel versioninfoparcel)
    {
        a = context;
        b = versioninfoparcel;
        c = new oj(context, AdSizeParcel.zzcC(), ip, versioninfoparcel);
    }

    public final void destroy()
    {
        synchronized (d)
        {
            c.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean isLoaded()
    {
        boolean flag;
        synchronized (d)
        {
            flag = c.f();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void pause()
    {
        synchronized (d)
        {
            c.pause();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void resume()
    {
        synchronized (d)
        {
            c.resume();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void setUserId(String s)
    {
        synchronized (d)
        {
            c.a(s);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void show()
    {
        synchronized (d)
        {
            c.e();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void zza(RewardedVideoAdRequestParcel rewardedvideoadrequestparcel)
    {
        synchronized (d)
        {
            c.a(rewardedvideoadrequestparcel);
        }
        return;
        rewardedvideoadrequestparcel;
        obj;
        JVM INSTR monitorexit ;
        throw rewardedvideoadrequestparcel;
    }

    public final void zza(zzd zzd)
    {
        synchronized (d)
        {
            c.a(zzd);
        }
        return;
        zzd;
        obj;
        JVM INSTR monitorexit ;
        throw zzd;
    }
}
