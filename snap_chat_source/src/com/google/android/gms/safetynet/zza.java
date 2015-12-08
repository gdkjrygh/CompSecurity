// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.safetynet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.safetynet:
//            zzb

public class zza
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    public final int zzFG;
    private String zzawF;

    zza(int i, String s)
    {
        zzFG = i;
        zzawF = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getJwsResult()
    {
        return zzawF;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
