// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AddLocalCapabilityResponse

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void a(AddLocalCapabilityResponse addlocalcapabilityresponse, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, addlocalcapabilityresponse.a);
        zzb.a(parcel, 2, addlocalcapabilityresponse.b);
        zzb.a(parcel, i);
    }

    public AddLocalCapabilityResponse a(Parcel parcel)
    {
        int j = 0;
        int k = zza.b(parcel);
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
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new AddLocalCapabilityResponse(i, j);
            }
        } while (true);
    }

    public AddLocalCapabilityResponse[] a(int i)
    {
        return new AddLocalCapabilityResponse[i];
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
