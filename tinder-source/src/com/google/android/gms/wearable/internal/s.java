// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetDataItemResponse, DataItemParcelable

public final class s
    implements android.os.Parcelable.Creator
{

    public s()
    {
    }

    static void a(GetDataItemResponse getdataitemresponse, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getdataitemresponse.a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, getdataitemresponse.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, getdataitemresponse.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = zza.a(parcel);
        DataItemParcelable dataitemparcelable = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = zza.e(parcel, l);
                    break;

                case 3: // '\003'
                    dataitemparcelable = (DataItemParcelable)zza.a(parcel, l, DataItemParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GetDataItemResponse(i, j, dataitemparcelable);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GetDataItemResponse[i];
    }
}
