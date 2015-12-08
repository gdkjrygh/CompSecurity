// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.location.zzh;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzpm, zzpc, zzpi

public class zzpe
{
    static class zzb extends com.google.android.gms.location.zzd.zza
    {

        private Handler zzamW;

        public void onLocationChanged(Location location)
        {
            if (zzamW == null)
            {
                return;
            } else
            {
                Message message = Message.obtain();
                message.what = 1;
                message.obj = location;
                zzamW.sendMessage(message);
                return;
            }
        }
    }

    static class zzc extends com.google.android.gms.location.zze.zza
    {

        private Handler zzamW;

        public void zza(zzh zzh)
        {
            if (zzamW == null)
            {
                return;
            } else
            {
                Message message = Message.obtain();
                message.obj = zzh;
                zzamW.sendMessage(message);
                return;
            }
        }
    }


    private final Context mContext;
    private Map zzZH;
    private ContentProviderClient zzamS;
    private boolean zzamT;
    private Map zzamU;
    private final zzpm zzamz;

    public zzpe(Context context, zzpm zzpm1)
    {
        zzamS = null;
        zzamT = false;
        zzZH = new HashMap();
        zzamU = new HashMap();
        mContext = context;
        zzamz = zzpm1;
    }

    public void removeAllListeners()
    {
        Object obj = zzZH;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = zzZH.values().iterator();
_L2:
        Object obj1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_84;
            }
            obj1 = (zzb)iterator.next();
        } while (obj1 == null);
        ((zzpc)zzamz.zzjb()).zza(zzpi.zzb(((com.google.android.gms.location.zzd) (obj1))));
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
        zzZH.clear();
        exception = zzamU.values().iterator();
_L3:
        do
        {
            if (!exception.hasNext())
            {
                break MISSING_BLOCK_LABEL_155;
            }
            obj1 = (zzc)exception.next();
        } while (obj1 == null);
        ((zzpc)zzamz.zzjb()).zza(zzpi.zza(((com.google.android.gms.location.zze) (obj1))));
          goto _L3
        zzamU.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public void zzW(boolean flag)
    {
        zzamz.zzfc();
        ((zzpc)zzamz.zzjb()).zzW(flag);
        zzamT = flag;
    }

    public Location zzpx()
    {
        zzamz.zzfc();
        Location location;
        try
        {
            location = ((zzpc)zzamz.zzjb()).zzcj(mContext.getPackageName());
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return location;
    }

    public void zzpy()
    {
        if (!zzamT)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        zzW(false);
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }
}
