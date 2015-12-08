// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzeb, zzgd, zzec, zzfl, 
//            zzge

public class zzed extends zzeb
{

    zzed(Context context, zzfa.zza zza, zzgd zzgd1, zzef.zza zza1)
    {
        super(context, zza, zzgd1, zza1);
    }

    protected void zzg(long l)
        throws zzee.zza
    {
        Object obj = zznp.zzah();
        int i;
        int j;
        if (((AdSizeParcel) (obj)).zzpY)
        {
            j = mContext.getResources().getDisplayMetrics().widthPixels;
            i = mContext.getResources().getDisplayMetrics().heightPixels;
        } else
        {
            j = ((AdSizeParcel) (obj)).widthPixels;
            i = ((AdSizeParcel) (obj)).heightPixels;
        }
        obj = new zzec(this, zznp, j, i);
        zzfl.zzCr.post(new Runnable(((zzec) (obj))) {

            final zzec a;
            final zzed b;

            public void run()
            {
label0:
                {
                    synchronized (b.zzoe)
                    {
                        if (b.zzyi.errorCode == -2)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                b.zznp.zzft().zza(b);
                a.zza(b.zzyi);
                obj1;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                b = zzed.this;
                a = zzec1;
                super();
            }
        });
        zzf(l);
        if (((zzec) (obj)).zzee())
        {
            zzb.zzaj("Ad-Network indicated no fill with passback URL.");
            throw new zzee.zza("AdNetwork sent passback url", 3);
        }
        if (!((zzec) (obj)).zzef())
        {
            throw new zzee.zza("AdNetwork timed out", 2);
        } else
        {
            return;
        }
    }
}
