// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzi

public class NativeAdOptionsParcel
    implements SafeParcelable
{

    public static final zzi CREATOR = new zzi();
    public final int versionCode;
    public final boolean zzwR;
    public final int zzwS;
    public final boolean zzwT;

    public NativeAdOptionsParcel(int i, boolean flag, int j, boolean flag1)
    {
        versionCode = i;
        zzwR = flag;
        zzwS = j;
        zzwT = flag1;
    }

    public NativeAdOptionsParcel(NativeAdOptions nativeadoptions)
    {
        this(1, nativeadoptions.shouldReturnUrlsForImageAssets(), nativeadoptions.getImageOrientation(), nativeadoptions.shouldRequestMultipleImages());
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.a(this, parcel);
    }

}
