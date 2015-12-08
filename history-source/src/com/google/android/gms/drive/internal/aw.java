// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.StorageStats;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnStorageStatsResponse

public class aw
    implements android.os.Parcelable.Creator
{

    public aw()
    {
    }

    static void a(OnStorageStatsResponse onstoragestatsresponse, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, onstoragestatsresponse.CK);
        b.a(parcel, 2, onstoragestatsresponse.QS, i, false);
        b.H(parcel, j);
    }

    public OnStorageStatsResponse aB(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int i = 0;
        StorageStats storagestats = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    storagestats = (StorageStats)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, StorageStats.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new OnStorageStatsResponse(i, storagestats);
            }
        } while (true);
    }

    public OnStorageStatsResponse[] bQ(int i)
    {
        return new OnStorageStatsResponse[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aB(parcel);
    }

    public Object[] newArray(int i)
    {
        return bQ(i);
    }
}
