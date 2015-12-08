// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.google.android.gms.internal:
//            zzbv, zzbx

public class zzby
{

    private boolean zzpb;
    private final Object zzqt = new Object();
    private SharedPreferences zztB;

    public zzby()
    {
        zzpb = false;
        zztB = null;
    }

    public Object zzc(zzbv zzbv1)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (zzpb)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        zzbv1 = ((zzbv) (zzbv1.zzcY()));
        return zzbv1;
        obj;
        JVM INSTR monitorexit ;
        return zzbv1.zza(zztB);
        zzbv1;
        obj;
        JVM INSTR monitorexit ;
        throw zzbv1;
    }

    public void zzw(Context context)
    {
label0:
        {
            synchronized (zzqt)
            {
                if (!zzpb)
                {
                    break label0;
                }
            }
            return;
        }
        context = GooglePlayServicesUtil.getRemoteContext(context);
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        zztB = zzo.zzbC().zzv(context);
        zzpb = true;
        obj;
        JVM INSTR monitorexit ;
    }
}
