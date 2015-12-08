// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzd;
import com.google.android.gms.location.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzpj, zzpg

public class zzpi
    implements SafeParcelable
{

    public static final zzpj CREATOR = new zzpj();
    PendingIntent mPendingIntent;
    private final int zzFG;
    int zzanl;
    zzpg zzanm;
    zzd zzann;
    zze zzano;

    zzpi(int i, int j, zzpg zzpg, IBinder ibinder, PendingIntent pendingintent, IBinder ibinder1)
    {
        Object obj = null;
        super();
        zzFG = i;
        zzanl = j;
        zzanm = zzpg;
        if (ibinder == null)
        {
            zzpg = null;
        } else
        {
            zzpg = com.google.android.gms.location.zzd.zza.zzbg(ibinder);
        }
        zzann = zzpg;
        mPendingIntent = pendingintent;
        if (ibinder1 == null)
        {
            zzpg = obj;
        } else
        {
            zzpg = com.google.android.gms.location.zze.zza.zzbh(ibinder1);
        }
        zzano = zzpg;
    }

    public static zzpi zza(zze zze1)
    {
        return new zzpi(1, 2, null, null, null, zze1.asBinder());
    }

    public static zzpi zzb(zzd zzd1)
    {
        return new zzpi(1, 2, null, zzd1.asBinder(), null, null);
    }

    public int describeContents()
    {
        return 0;
    }

    int getVersionCode()
    {
        return zzFG;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzpj.zza(this, parcel, i);
    }

    IBinder zzpA()
    {
        if (zzano == null)
        {
            return null;
        } else
        {
            return zzano.asBinder();
        }
    }

    IBinder zzpz()
    {
        if (zzann == null)
        {
            return null;
        } else
        {
            return zzann.asBinder();
        }
    }

}
