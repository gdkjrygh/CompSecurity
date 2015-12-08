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
    public final boolean zzpt;
    public final boolean zzpu;
    public final String zzpv;
    public final boolean zzpw;
    public final float zzpx;

    InterstitialAdParameterParcel(int i, boolean flag, boolean flag1, String s, boolean flag2, float f)
    {
        versionCode = i;
        zzpt = flag;
        zzpu = flag1;
        zzpv = s;
        zzpw = flag2;
        zzpx = f;
    }

    public InterstitialAdParameterParcel(boolean flag, boolean flag1, String s, boolean flag2, float f)
    {
        this(2, flag, flag1, s, flag2, f);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzl.a(this, parcel);
    }

}
