// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzl

public final class InterstitialAdParameterParcel
    implements SafeParcelable
{

    public static final zzl CREATOR = new zzl();
    public final int versionCode;
    public final boolean zzpk;
    public final boolean zzpl;

    InterstitialAdParameterParcel(int i, boolean flag, boolean flag1)
    {
        versionCode = i;
        zzpk = flag;
        zzpl = flag1;
    }

    public InterstitialAdParameterParcel(boolean flag, boolean flag1)
    {
        versionCode = 1;
        zzpk = flag;
        zzpl = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

}
