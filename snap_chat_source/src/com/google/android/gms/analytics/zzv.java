// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.analytics:
//            zzaj, zzu, AnalyticsReceiver, zzae, 
//            AnalyticsService, zzy, zzag, zzj, 
//            zzd, zzr, GoogleAnalytics, zzf, 
//            zze

class zzv extends zzaj
{

    private static final Object zzBQ = new Object();
    private static zzv zzCf;
    private Context mContext;
    private Handler mHandler;
    private zzd zzBR;
    private volatile zzf zzBS;
    private int zzBT;
    private long zzBU;
    private boolean zzBV;
    private boolean zzBW;
    private String zzBX;
    private boolean zzBY;
    private boolean zzBZ;
    private boolean zzBs;
    private boolean zzCa;
    private zze zzCb;
    private boolean zzCc;
    private zzu zzCd;
    private boolean zzCe;

    private zzv()
    {
        zzBT = 1800;
        zzBU = 0x8000000000000000L;
        zzBV = true;
        zzBY = false;
        zzBZ = true;
        zzCa = true;
        zzCb = new zze() {

            final zzv zzCg;

            public void zzD(boolean flag)
            {
                zzCg.zzb(flag, zzv.zza(zzCg));
            }

            
            {
                zzCg = zzv.this;
                super();
            }
        };
        zzCe = false;
        zzBs = false;
    }

    static long zza(zzv zzv1, long l)
    {
        zzv1.zzBU = l;
        return l;
    }

    static boolean zza(zzv zzv1)
    {
        return zzv1.zzBZ;
    }

    static long zzb(zzv zzv1)
    {
        return zzv1.zzBU;
    }

    static int zzc(zzv zzv1)
    {
        return zzv1.zzBT;
    }

    static boolean zzd(zzv zzv1)
    {
        return zzv1.zzCe;
    }

    static Handler zze(zzv zzv1)
    {
        return zzv1.mHandler;
    }

    public static zzv zzfE()
    {
        if (zzCf == null)
        {
            zzCf = new zzv();
        }
        return zzCf;
    }

    private void zzfF()
    {
        zzCd = new zzu(this);
        zzCd.zzD(mContext);
    }

    private PendingIntent zzfG()
    {
        Intent intent = new Intent(mContext.getApplicationContext(), com/google/android/gms/analytics/AnalyticsReceiver);
        intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        return PendingIntent.getBroadcast(mContext, 0, intent, 0);
    }

    private AlarmManager zzfH()
    {
        PendingIntent pendingintent = zzfG();
        AlarmManager alarmmanager = (AlarmManager)mContext.getApplicationContext().getSystemService("alarm");
        alarmmanager.cancel(pendingintent);
        return alarmmanager;
    }

    private void zzfI()
    {
        ActivityInfo activityinfo;
        zzfH();
        activityinfo = mContext.getPackageManager().getReceiverInfo(new ComponentName(mContext, com/google/android/gms/analytics/AnalyticsReceiver), 2);
        if (activityinfo == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        if (!activityinfo.enabled || zzBT <= 0)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        zzh(zzBT, zzBT);
        zzae.zzab("Using a receiver for local dispatch.");
        zzCc = true;
_L1:
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        zzae.zzab("Receiver for local dispatch not registered. For more reliable analytics, please see http://goo.gl/8Rd3yj for instructions.");
        mHandler = new Handler(mContext.getMainLooper(), new android.os.Handler.Callback() {

            final zzv zzCg;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && zzv.zzfK().equals(message.obj))
                {
                    long l = SystemClock.elapsedRealtime();
                    if (l >= zzv.zzb(zzCg) + (long)(zzv.zzc(zzCg) * 1000))
                    {
                        zzy.zzfV().zzF(true);
                        zzCg.dispatchLocalHits();
                        zzy.zzfV().zzF(false);
                        zzv.zza(zzCg, l);
                    }
                    if (zzv.zzc(zzCg) > 0 && !zzv.zzd(zzCg))
                    {
                        zzv.zze(zzCg).sendMessageDelayed(zzv.zze(zzCg).obtainMessage(1, zzv.zzfK()), Math.min(60, zzv.zzc(zzCg)) * 1000);
                    }
                }
                return true;
            }

            
            {
                zzCg = zzv.this;
                super();
            }
        });
        if (zzBT > 0)
        {
            mHandler.sendMessageDelayed(mHandler.obtainMessage(1, zzBQ), Math.min(60, zzBT) * 1000);
            return;
        }
          goto _L1
    }

    static Object zzfK()
    {
        return zzBQ;
    }

    private void zzh(int i, int j)
    {
        int l = i;
        int i1 = j;
        if (!zzBY)
        {
            int k = i;
            if (i < 1800)
            {
                k = 1800;
            }
            l = k;
            i1 = j;
            if (j < 1800)
            {
                i1 = 1800;
                l = k;
            }
        }
        zzfH().setInexactRepeating(2, l * 1000, i1 * 1000, zzfG());
    }

    void dispatchLocalHits()
    {
        this;
        JVM INSTR monitorenter ;
        zzF(null);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void setLocalDispatchPeriod(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (mHandler != null || zzCc) goto _L2; else goto _L1
_L1:
        zzae.zzab("Dispatch period set with null handler and no receiver. Dispatch will run once initialization is complete.");
        zzBT = i;
        AnalyticsService.zzC(i);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzy.zzfV().zza(zzy.zza.zzDO);
        if (!zzCe && zzBZ && zzBT > 0)
        {
            if (mHandler != null)
            {
                mHandler.removeMessages(1, zzBQ);
            }
            if (zzCc)
            {
                zzfH();
            }
        }
        zzBT = i;
        AnalyticsService.zzC(i);
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!zzCe && zzBZ)
        {
            if (mHandler != null)
            {
                mHandler.sendMessageDelayed(mHandler.obtainMessage(1, zzBQ), Math.min(60, zzBT) * 1000);
            }
            if (zzCc)
            {
                zzh(i, i);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    zzd zzE(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        if (mContext == null)
        {
            mContext = context;
        }
        if (zzBR != null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        if (mContext == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_48;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        zzBR = new zzag(zzCb, mContext, new zzj());
        zzBR.setDryRun(zzBs);
        if (zzBX != null)
        {
            zzBR.zzff().zzak(zzBX);
            zzBX = null;
        }
        if (mHandler == null && !zzCc)
        {
            zzfI();
        }
        if (zzCd == null && zzCa)
        {
            zzfF();
        }
        context = zzBR;
        this;
        JVM INSTR monitorexit ;
        return context;
    }

    void zzE(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        zzb(zzCe, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void zzF(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = null;
        if (zzBS == null) goto _L2; else goto _L1
_L1:
        context = zzBS;
_L8:
        if (context != null) goto _L4; else goto _L3
_L3:
        zzae.zzab("Dispatch call queued. Dispatch will run once initialization is complete.");
        zzBV = true;
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        context = GoogleAnalytics.getInstance(context).zzgm();
        continue; /* Loop/switch isn't completed */
        context = obj;
        if (GoogleAnalytics.zzgj() != null)
        {
            context = GoogleAnalytics.zzgj().zzgm();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        zzy.zzfV().zza(zzy.zza.zzDN);
        context.dispatch();
        if (true) goto _L6; else goto _L5
_L5:
        context;
        throw context;
        if (true) goto _L8; else goto _L7
_L7:
    }

    void zza(Context context, zzf zzf1)
    {
        this;
        JVM INSTR monitorenter ;
        Context context1 = mContext;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        mContext = context.getApplicationContext();
        if (zzBS == null)
        {
            zzBS = zzf1;
            if (zzBV)
            {
                dispatchLocalHits();
                zzBV = false;
            }
            if (zzBW)
            {
                zzfh();
                zzBW = false;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    void zzb(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzCe != flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = zzBZ;
        if (flag2 != flag1) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!flag && flag1)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (zzBT > 0)
        {
            if (mHandler != null)
            {
                mHandler.removeMessages(1, zzBQ);
            }
            if (zzCc)
            {
                zzfH();
            }
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (zzBT > 0)
        {
            if (mHandler != null)
            {
                mHandler.sendMessageDelayed(mHandler.obtainMessage(1, zzBQ), Math.min(60, zzBT) * 1000);
            }
            if (zzCc)
            {
                zzh(zzBT, zzBT);
            }
        }
        StringBuilder stringbuilder = new StringBuilder("PowerSaveMode ");
        Object obj;
        if (!flag && flag1)
        {
            obj = "terminated.";
        } else
        {
            obj = "initiated.";
        }
        zzae.zzab(stringbuilder.append(((String) (obj))).toString());
        zzCe = flag;
        zzBZ = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    void zzfJ()
    {
        this;
        JVM INSTR monitorenter ;
        if (!zzCe && zzBZ && zzBT > 0)
        {
            if (mHandler != null)
            {
                mHandler.removeMessages(1, zzBQ);
                zzBU = 0x8000000000000000L;
                mHandler.sendMessage(mHandler.obtainMessage(1, zzBQ));
            }
            if (zzCc)
            {
                zzh(0, zzBT);
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void zzfh()
    {
        if (zzBS == null)
        {
            zzae.zzab("setForceLocalDispatch() queued. It will be called once initialization is complete.");
            zzBW = true;
            return;
        } else
        {
            zzy.zzfV().zza(zzy.zza.zzEa);
            zzBS.zzfh();
            return;
        }
    }

}
