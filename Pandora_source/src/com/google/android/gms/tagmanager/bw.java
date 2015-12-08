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
//            j, zzdf, DataLayer

class bw extends j
{
    private final class a
        implements Runnable
    {

        final bw a;
        private final String b;
        private final String c;
        private final long d;
        private final long e;
        private final long f = System.currentTimeMillis();
        private long g;

        protected boolean a()
        {
            if (bw.d(a))
            {
                return bw.e(a);
            }
            Object obj = (ActivityManager)bw.f(a).getSystemService("activity");
            KeyguardManager keyguardmanager = (KeyguardManager)bw.f(a).getSystemService("keyguard");
            PowerManager powermanager = (PowerManager)bw.f(a).getSystemService("power");
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

        public void run()
        {
            if (e > 0L && g >= e)
            {
                if (!"0".equals(c))
                {
                    bw.a(a).remove(c);
                }
                return;
            }
            g = g + 1L;
            if (a())
            {
                long l1 = System.currentTimeMillis();
                bw.b(a).push(DataLayer.mapOf(new Object[] {
                    "event", b, "gtm.timerInterval", String.valueOf(d), "gtm.timerLimit", String.valueOf(e), "gtm.timerStartTime", String.valueOf(f), "gtm.timerCurrentTime", String.valueOf(l1), 
                    "gtm.timerElapsedTime", String.valueOf(l1 - f), "gtm.timerEventNumber", String.valueOf(g), "gtm.triggers", c
                }));
            }
            bw.c(a).postDelayed(this, d);
        }

        a(String s, String s1, long l1, long l2)
        {
            a = bw.this;
            super();
            b = s;
            c = s1;
            d = l1;
            e = l2;
        }
    }


    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private boolean f;
    private boolean g;
    private final Context h;
    private DataLayer i;
    private final HandlerThread j = new HandlerThread("Google GTM SDK Timer", 10);
    private Handler k;
    private final Set l = new HashSet();

    public bw(Context context, DataLayer datalayer)
    {
        super(a, new String[] {
            c, b
        });
        h = context;
        i = datalayer;
        j.start();
        k = new Handler(j.getLooper());
    }

    static Set a(bw bw1)
    {
        return bw1.l;
    }

    static DataLayer b(bw bw1)
    {
        return bw1.i;
    }

    static Handler c(bw bw1)
    {
        return bw1.k;
    }

    static boolean d(bw bw1)
    {
        return bw1.g;
    }

    static boolean e(bw bw1)
    {
        return bw1.f;
    }

    static Context f(bw bw1)
    {
        return bw1.h;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
label0:
        {
label1:
            {
                String s1 = zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(b));
                String s = zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(e));
                String s2 = zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(c));
                map = zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(d));
                long l1;
                long l2;
                try
                {
                    l1 = Long.parseLong(s2);
                }
                catch (NumberFormatException numberformatexception)
                {
                    l1 = 0L;
                }
                try
                {
                    l2 = Long.parseLong(map);
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    l2 = 0L;
                }
                if (l1 <= 0L || TextUtils.isEmpty(s1))
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
            if (!l.contains(map))
            {
                if (!"0".equals(map))
                {
                    l.add(map);
                }
                k.postDelayed(new a(s1, map, l1, l2), l1);
            }
        }
        return zzdf.zzxW();
    }

    public boolean zzwn()
    {
        return false;
    }

    static 
    {
        a = zza.zzbf.toString();
        b = zzb.zzeg.toString();
        c = zzb.zzdL.toString();
        d = zzb.zzdT.toString();
        e = zzb.zzfK.toString();
    }
}
