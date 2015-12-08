// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetCapabilityResponse, CapabilityInfoParcelable

public class zzaf
    implements android.os.Parcelable.Creator
{

    public zzaf()
    {
    }

    static void a(GetCapabilityResponse getcapabilityresponse, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, getcapabilityresponse.a);
        zzb.a(parcel, 2, getcapabilityresponse.b);
        zzb.a(parcel, 3, getcapabilityresponse.c, i, false);
        zzb.a(parcel, j);
    }

    public GetCapabilityResponse a(Parcel parcel)
    {
        int j = 0;
        int k = zza.b(parcel);
        CapabilityInfoParcelable capabilityinfoparcelable = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    j = zza.f(parcel, l);
                    break;

                case 3: // '\003'
                    capabilityinfoparcelable = (CapabilityInfoParcelable)zza.a(parcel, l, CapabilityInfoParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GetCapabilityResponse(i, j, capabilityinfoparcelable);
            }
        } while (true);
    }

    public GetCapabilityResponse[] a(int i)
    {
        return new GetCapabilityResponse[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
