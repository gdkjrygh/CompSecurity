// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zzd

class zzNi
    implements Runnable
{

    final zzd zzNb;
    final ConnectionResult zzNi;

    public void run()
    {
        zzd.zza(zzNb).lock();
        if (!zzd.zzd(zzNb, zzNi))
        {
            break MISSING_BLOCK_LABEL_186;
        }
        zzd.zze(zzNb, false);
        Iterator iterator = zzd.zzp(zzNb).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
              = ()iterator.next();
             1 = ()zzd.zzq(zzNb).get();
            if (1.isConnected())
            {
                1.disconnect();
            }
            if (!zzd.zzm(zzNb).containsKey())
            {
                zzd.zzm(zzNb).put(, new ConnectionResult(17, null));
            }
        } while (true);
        break MISSING_BLOCK_LABEL_157;
        Exception exception;
        exception;
        zzd.zza(zzNb).unlock();
        throw exception;
        zzd.zze(zzNb, true);
        zzd.zzr(zzNb);
_L1:
        zzd.zza(zzNb).unlock();
        return;
        zzd.zze(zzNb, zzNi);
          goto _L1
    }

    esult(zzd zzd1, ConnectionResult connectionresult)
    {
        zzNb = zzd1;
        zzNi = connectionresult;
        super();
    }
}
