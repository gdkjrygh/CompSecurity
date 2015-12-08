// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetAllCapabilitiesResponse, CapabilityInfoParcelable

public class zzae
    implements android.os.Parcelable.Creator
{

    public zzae()
    {
    }

    static void a(GetAllCapabilitiesResponse getallcapabilitiesresponse, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, getallcapabilitiesresponse.a);
        zzb.a(parcel, 2, getallcapabilitiesresponse.b);
        zzb.c(parcel, 3, getallcapabilitiesresponse.c, false);
        zzb.a(parcel, i);
    }

    public GetAllCapabilitiesResponse a(Parcel parcel)
    {
        int j = 0;
        int k = zza.b(parcel);
        java.util.ArrayList arraylist = null;
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
                    arraylist = zza.c(parcel, l, CapabilityInfoParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GetAllCapabilitiesResponse(i, j, arraylist);
            }
        } while (true);
    }

    public GetAllCapabilitiesResponse[] a(int i)
    {
        return new GetAllCapabilitiesResponse[i];
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
