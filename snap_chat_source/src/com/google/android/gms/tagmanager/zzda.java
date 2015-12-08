// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zzde, DataLayer

class zzda extends zzaj
{
    final class zza
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
                    com.google.android.gms.tagmanager.zzda.zza(zzaBh).remove(zzaBd);
                }
                return;
            }
            zzaBg = zzaBg + 1L;
            if (zzbu())
            {
                long l = System.currentTimeMillis();
                com.google.android.gms.tagmanager.zzda.zzb(zzaBh).push(DataLayer.mapOf(new Object[] {
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
                android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
                if (Process.myPid() == runningappprocessinfo.pid && runningappprocessinfo.importance == 100 && !keyguardmanager.inKeyguardRestrictedInputMode() && powermanager.isScreenOn())
                {
                    return true;
                }
            }

            return false;
        }

        zza(String s, String s1, long l, long l1)
        {
            zzaBh = zzda.this;
            super();
            zzaBc = s;
            zzaBd = s1;
            zzamf = l;
            zzaBe = l1;
        }
    }


    private static final String ID;
    private static final String NAME;
    private static final String zzaAV;
    private static final String zzaAW;
    private static final String zzaAX;
    private final Context mContext;
    private Handler mHandler;
    private boolean zzaAY;
    private boolean zzaAZ;
    private final HandlerThread zzaBa = new HandlerThread("Google GTM SDK Timer", 10);
    private final Set zzaBb = new HashSet();
    private DataLayer zzaxx;

    public zzda(Context context, DataLayer datalayer)
    {
        super(ID, new String[] {
            zzaAV, NAME
        });
        mContext = context;
        zzaxx = datalayer;
        zzaBa.start();
        mHandler = new Handler(zzaBa.getLooper());
    }

    static Set zza(zzda zzda1)
    {
        return zzda1.zzaBb;
    }

    static DataLayer zzb(zzda zzda1)
    {
        return zzda1.zzaxx;
    }

    static Handler zzc(zzda zzda1)
    {
        return zzda1.mHandler;
    }

    static boolean zzd(zzda zzda1)
    {
        return zzda1.zzaAZ;
    }

    static boolean zze(zzda zzda1)
    {
        return zzda1.zzaAY;
    }

    static Context zzf(zzda zzda1)
    {
        return zzda1.mContext;
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
label0:
        {
label1:
            {
                String s1 = zzde.zzg((com.google.android.gms.internal.zzd.zza)map.get(NAME));
                String s = zzde.zzg((com.google.android.gms.internal.zzd.zza)map.get(zzaAX));
                String s2 = zzde.zzg((com.google.android.gms.internal.zzd.zza)map.get(zzaAV));
                map = zzde.zzg((com.google.android.gms.internal.zzd.zza)map.get(zzaAW));
                long l;
                long l1;
                try
                {
                    l = Long.parseLong(s2);
                }
                catch (NumberFormatException numberformatexception)
                {
                    l = 0L;
                }
                try
                {
                    l1 = Long.parseLong(map);
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    l1 = 0L;
                }
                if (l <= 0L || TextUtils.isEmpty(s1))
                {
                    break label0;
                }
                if (s != null)
                {
                    map = s;
                    if (!s.isEmpty())
                    {
                        break label1;
                    }
                }
                map = "0";
            }
            if (!zzaBb.contains(map))
            {
                if (!"0".equals(map))
                {
                    zzaBb.add(map);
                }
                mHandler.postDelayed(new zza(s1, map, l, l1), l);
            }
        }
        return zzde.zzuf();
    }

    public boolean zzsD()
    {
        return false;
    }

    static 
    {
        ID = com.google.android.gms.internal.zza.zzba.toString();
        NAME = zzb.zzdB.toString();
        zzaAV = zzb.zzdh.toString();
        zzaAW = zzb.zzdp.toString();
        zzaAX = zzb.zzeV.toString();
    }
}
