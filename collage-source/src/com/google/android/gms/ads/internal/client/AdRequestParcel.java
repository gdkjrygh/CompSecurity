// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.y;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzf, SearchAdRequestParcel

public final class AdRequestParcel
    implements SafeParcelable
{

    public static final zzf CREATOR = new zzf();
    public final Bundle extras;
    public final int versionCode;
    public final Bundle zzsA;
    public final Bundle zzsB;
    public final List zzsC;
    public final String zzsD;
    public final String zzsE;
    public final long zzsq;
    public final int zzsr;
    public final List zzss;
    public final boolean zzst;
    public final int zzsu;
    public final boolean zzsv;
    public final String zzsw;
    public final SearchAdRequestParcel zzsx;
    public final Location zzsy;
    public final String zzsz;

    public AdRequestParcel(int i, long l, Bundle bundle, int j, List list, boolean flag, 
            int k, boolean flag1, String s, SearchAdRequestParcel searchadrequestparcel, Location location, String s1, Bundle bundle1, 
            Bundle bundle2, List list1, String s2, String s3)
    {
        versionCode = i;
        zzsq = l;
        Bundle bundle3 = bundle;
        if (bundle == null)
        {
            bundle3 = new Bundle();
        }
        extras = bundle3;
        zzsr = j;
        zzss = list;
        zzst = flag;
        zzsu = k;
        zzsv = flag1;
        zzsw = s;
        zzsx = searchadrequestparcel;
        zzsy = location;
        zzsz = s1;
        zzsA = bundle1;
        zzsB = bundle2;
        zzsC = list1;
        zzsD = s2;
        zzsE = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof AdRequestParcel)
        {
            if (versionCode == ((AdRequestParcel) (obj = (AdRequestParcel)obj)).versionCode && zzsq == ((AdRequestParcel) (obj)).zzsq && y.a(extras, ((AdRequestParcel) (obj)).extras) && zzsr == ((AdRequestParcel) (obj)).zzsr && y.a(zzss, ((AdRequestParcel) (obj)).zzss) && zzst == ((AdRequestParcel) (obj)).zzst && zzsu == ((AdRequestParcel) (obj)).zzsu && zzsv == ((AdRequestParcel) (obj)).zzsv && y.a(zzsw, ((AdRequestParcel) (obj)).zzsw) && y.a(zzsx, ((AdRequestParcel) (obj)).zzsx) && y.a(zzsy, ((AdRequestParcel) (obj)).zzsy) && y.a(zzsz, ((AdRequestParcel) (obj)).zzsz) && y.a(zzsA, ((AdRequestParcel) (obj)).zzsA) && y.a(zzsB, ((AdRequestParcel) (obj)).zzsB) && y.a(zzsC, ((AdRequestParcel) (obj)).zzsC) && y.a(zzsD, ((AdRequestParcel) (obj)).zzsD) && y.a(zzsE, ((AdRequestParcel) (obj)).zzsE))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return y.a(new Object[] {
            Integer.valueOf(versionCode), Long.valueOf(zzsq), extras, Integer.valueOf(zzsr), zzss, Boolean.valueOf(zzst), Integer.valueOf(zzsu), Boolean.valueOf(zzsv), zzsw, zzsx, 
            zzsy, zzsz, zzsA, zzsB, zzsC, zzsD, zzsE
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

}
