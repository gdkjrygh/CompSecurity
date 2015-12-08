// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.places:
//            PlacePhotoMetadataResult

public final class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    static void a(PlacePhotoMetadataResult placephotometadataresult, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, placephotometadataresult.getStatus(), i);
        b.a(parcel, 1000, placephotometadataresult.a);
        b.a(parcel, 2, placephotometadataresult.b, i);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        Status status = null;
        int i = 0;
        DataHolder dataholder = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    status = (Status)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Status.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    dataholder = (DataHolder)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DataHolder.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PlacePhotoMetadataResult(i, status, dataholder);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PlacePhotoMetadataResult[i];
    }
}
