// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzda, DataLayer

final class zzaBe
    implements Runnable
{

    private final String zzaBc;
    private final String zzaBd;
    private final long zzaBe;
    private final long zzaBf = System.currentTimeMillis();
    private long zzaBg;
    final zzda zzaBh;
    private final long zzamf;

    public final void run()
    {
        if (zzaBe > 0L && zzaBg >= zzaBe)
        {
            if (!"0".equals(zzaBd))
            {
                zzda.zza(zzaBh).remove(zzaBd);
            }
            return;
        }
        zzaBg = zzaBg + 1L;
        if (zzbu())
        {
            long l = System.currentTimeMillis();
            zzda.zzb(zzaBh).push(DataLayer.mapOf(new Object[] {
                "event", zzaBc, "gtm.timerInterval", String.valueOf(zzamf), "gtm.timerLimit", String.valueOf(zzaBe), "gtm.timerStartTime", String.valueOf(zzaBf), "gtm.timerCurrentTime", String.valueOf(l), 
                "gtm.timerElapsedTime", String.valueOf(l - zzaBf), "gtm.timerEventNumber", String.valueOf(zzaBg), "gtm.triggers", zzaBd
            }));
        }
        zzda.zzc(zzaBh).postDelayed(this, zzamf);
    }

    protected final boolean zzbu()
    {
        if (zzda.zzd(zzaBh))
        {
            return zzda.zze(zzaBh);
        }
        Object obj = (ActivityManager)zzda.zzf(zzaBh).getSystemService("activity");
        KeyguardManager keyguardmanager = (KeyguardManager)zzda.zzf(zzaBh).getSystemService("keyguard");
        PowerManager powermanager = (PowerManager)zzda.zzf(zzaBh).getSystemService("power");
        for (obj = ((ActivityManager) (obj)).getRunningAppProcesses().iterator(); ((Iterator) (obj)).hasNext();)
        {
            android.app.anager.RunningAppProcessInfo runningappprocessinfo = (android.app.anager.RunningAppProcessInfo)((Iterator) (obj)).next();
            if (Process.myPid() == runningappprocessinfo.pid && runningappprocessinfo.importance == 100 && !keyguardmanager.inKeyguardRestrictedInputMode() && powermanager.isScreenOn())
            {
                return true;
            }
        }

        return false;
    }

    ssInfo(zzda zzda1, String s, String s1, long l, long l1)
    {
        zzaBh = zzda1;
        super();
        zzaBc = s;
        zzaBd = s1;
        zzamf = l;
        zzaBe = l1;
    }
}
