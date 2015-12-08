// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetAllCapabilitiesResponse, CapabilityInfoParcelable

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(GetAllCapabilitiesResponse getallcapabilitiesresponse, Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getallcapabilitiesresponse.a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, getallcapabilitiesresponse.b);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 3, getallcapabilitiesresponse.c);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = 0;
        int l = zza.a(parcel);
        java.util.ArrayList arraylist = null;
        int j = 0;
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
                    j = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    k = zza.e(parcel, i1);
                    break;

                case 3: // '\003'
                    arraylist = zza.c(parcel, i1, CapabilityInfoParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new GetAllCapabilitiesResponse(j, k, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int j)
    {
        return new GetAllCapabilitiesResponse[j];
    }
}
