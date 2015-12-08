// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetDataItemResponse, DataItemParcelable

public class zzan
    implements android.os.Parcelable.Creator
{

    public zzan()
    {
    }

    static void a(GetDataItemResponse getdataitemresponse, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, getdataitemresponse.a);
        zzb.a(parcel, 2, getdataitemresponse.b);
        zzb.a(parcel, 3, getdataitemresponse.c, i, false);
        zzb.a(parcel, j);
    }

    public GetDataItemResponse a(Parcel parcel)
    {
        int j = 0;
        int k = zza.b(parcel);
        DataItemParcelable dataitemparcelable = null;
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
                    dataitemparcelable = (DataItemParcelable)zza.a(parcel, l, DataItemParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GetDataItemResponse(i, j, dataitemparcelable);
            }
        } while (true);
    }

    public GetDataItemResponse[] a(int i)
    {
        return new GetDataItemResponse[i];
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
