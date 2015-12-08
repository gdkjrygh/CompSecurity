// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetConnectedNodesResponse, NodeParcelable

public class zzam
    implements android.os.Parcelable.Creator
{

    public zzam()
    {
    }

    static void a(GetConnectedNodesResponse getconnectednodesresponse, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, getconnectednodesresponse.a);
        zzb.a(parcel, 2, getconnectednodesresponse.b);
        zzb.c(parcel, 3, getconnectednodesresponse.c, false);
        zzb.a(parcel, i);
    }

    public GetConnectedNodesResponse a(Parcel parcel)
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
                    arraylist = zza.c(parcel, l, NodeParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GetConnectedNodesResponse(i, j, arraylist);
            }
        } while (true);
    }

    public GetConnectedNodesResponse[] a(int i)
    {
        return new GetConnectedNodesResponse[i];
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
