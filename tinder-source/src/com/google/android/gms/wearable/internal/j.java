// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetCapabilityResponse, CapabilityInfoParcelable

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(GetCapabilityResponse getcapabilityresponse, Parcel parcel, int i)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getcapabilityresponse.a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, getcapabilityresponse.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, getcapabilityresponse.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = 0;
        int l = zza.a(parcel);
        CapabilityInfoParcelable capabilityinfoparcelable = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    k = zza.e(parcel, i1);
                    break;

                case 3: // '\003'
                    capabilityinfoparcelable = (CapabilityInfoParcelable)zza.a(parcel, i1, CapabilityInfoParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new GetCapabilityResponse(i, k, capabilityinfoparcelable);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GetCapabilityResponse[i];
    }
}
