// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzny;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            zzd, zzb, zza, PlayLoggerContext, 
//            LogEvent

public class zzf extends zzi
{

    private final String zzJd;
    private final zzd zzayI;
    private final com.google.android.gms.playlog.internal.zzb zzayJ = new com.google.android.gms.playlog.internal.zzb();
    private boolean zzayK;
    private final Object zzoe = new Object();

    public zzf(Context context, Looper looper, zzd zzd1, zze zze)
    {
        super(context, looper, 24, zzd1, zzd1, zze);
        zzJd = context.getPackageName();
        zzayI = (zzd)zzv.zzr(zzd1);
        zzayI.zza(this);
        zzayK = true;
    }

    private void zzc(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        zzayJ.zza(playloggercontext, logevent);
    }

    private void zzd(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        try
        {
            zzvt();
            ((zza)zzlX()).zza(zzJd, playloggercontext, logevent);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("PlayLoggerImpl", "Couldn't send log event.  Will try caching.");
            zzc(playloggercontext, logevent);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            Log.e("PlayLoggerImpl", "Service was disconnected.  Will try caching.");
        }
        zzc(playloggercontext, logevent);
    }

    private void zzvt()
    {
        Object obj;
        ArrayList arraylist;
        zzb.zza zza1;
        Iterator iterator;
        boolean flag;
        if (!zzayK)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.zzb.zzP(flag);
        if (zzayJ.isEmpty()) goto _L2; else goto _L1
_L1:
        obj = null;
        arraylist = new ArrayList();
        iterator = zzayJ.zzvr().iterator();
_L5:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_195;
        }
        zza1 = (zzb.zza)iterator.next();
        if (zza1.zzayy == null) goto _L4; else goto _L3
_L3:
        ((zza)zzlX()).zza(zzJd, zza1.zzayw, zzny.zzf(zza1.zzayy));
          goto _L5
_L2:
        return;
_L4:
label0:
        {
            if (!zza1.zzayw.equals(obj))
            {
                break label0;
            }
            arraylist.add(zza1.zzayx);
        }
          goto _L5
        if (!arraylist.isEmpty())
        {
            ((zza)zzlX()).zza(zzJd, ((PlayLoggerContext) (obj)), arraylist);
            arraylist.clear();
        }
        obj = zza1.zzayw;
        arraylist.add(zza1.zzayx);
          goto _L5
        try
        {
            if (!arraylist.isEmpty())
            {
                ((zza)zzlX()).zza(zzJd, ((PlayLoggerContext) (obj)), arraylist);
            }
            zzayJ.clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("PlayLoggerImpl", "Couldn't send cached log events to AndroidLog service.  Retaining in memory cache.");
        }
          goto _L2
    }

    public void start()
    {
label0:
        {
            synchronized (zzoe)
            {
                if (!isConnecting() && !isConnected())
                {
                    break label0;
                }
            }
            return;
        }
        zzayI.zzae(true);
        connect();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void stop()
    {
        synchronized (zzoe)
        {
            zzayI.zzae(false);
            disconnect();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzcu(ibinder);
    }

    void zzaf(boolean flag)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        boolean flag1;
        flag1 = zzayK;
        zzayK = flag;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (!zzayK)
        {
            zzvt();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzb(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (!zzayK)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        zzc(playloggercontext, logevent);
_L2:
        return;
        zzd(playloggercontext, logevent);
        if (true) goto _L2; else goto _L1
_L1:
        playloggercontext;
        obj;
        JVM INSTR monitorexit ;
        throw playloggercontext;
    }

    protected zza zzcu(IBinder ibinder)
    {
        return zza.zza.zzct(ibinder);
    }

    protected String zzeq()
    {
        return "com.google.android.gms.playlog.service.START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.playlog.internal.IPlayLogService";
    }
}
