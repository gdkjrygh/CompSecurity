// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzg, zzf

public class DeviceStatus
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    private double zzMD;
    private boolean zzME;
    private int zzNI;
    private int zzNJ;
    private ApplicationMetadata zzNU;
    private final int zzzH;

    public DeviceStatus()
    {
        this(3, (0.0D / 0.0D), false, -1, null, -1);
    }

    DeviceStatus(int i, double d, boolean flag, int j, ApplicationMetadata applicationmetadata, int k)
    {
        zzzH = i;
        zzMD = d;
        zzME = flag;
        zzNI = j;
        zzNU = applicationmetadata;
        zzNJ = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof DeviceStatus))
            {
                return false;
            }
            obj = (DeviceStatus)obj;
            if (zzMD != ((DeviceStatus) (obj)).zzMD || zzME != ((DeviceStatus) (obj)).zzME || zzNI != ((DeviceStatus) (obj)).zzNI || !zzf.zza(zzNU, ((DeviceStatus) (obj)).zzNU) || zzNJ != ((DeviceStatus) (obj)).zzNJ)
            {
                return false;
            }
        }
        return true;
    }

    public ApplicationMetadata getApplicationMetadata()
    {
        return zzNU;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Double.valueOf(zzMD), Boolean.valueOf(zzME), Integer.valueOf(zzNI), zzNU, Integer.valueOf(zzNJ)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

    public double zzkc()
    {
        return zzMD;
    }

    public int zzkd()
    {
        return zzNI;
    }

    public int zzke()
    {
        return zzNJ;
    }

    public boolean zzkm()
    {
        return zzME;
    }

}
