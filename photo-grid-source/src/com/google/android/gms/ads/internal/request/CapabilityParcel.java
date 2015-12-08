// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzi

public class CapabilityParcel
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    public final int versionCode;
    public final boolean zzFa;
    public final boolean zzFb;

    CapabilityParcel(int i, boolean flag, boolean flag1)
    {
        versionCode = i;
        zzFa = flag;
        zzFb = flag1;
    }

    public CapabilityParcel(boolean flag, boolean flag1)
    {
        this(1, flag, flag1);
    }

    public int describeContents()
    {
        return 0;
    }

    public Bundle toBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("iap_supported", zzFa);
        bundle.putBoolean("default_iap_supported", zzFb);
        return bundle;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.a(this, parcel);
    }

}
