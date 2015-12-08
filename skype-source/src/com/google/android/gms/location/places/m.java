// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.places:
//            PlacePhotoResult

public final class m
    implements android.os.Parcelable.Creator
{

    public m()
    {
    }

    static void a(PlacePhotoResult placephotoresult, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, placephotoresult.getStatus(), i);
        b.a(parcel, 1000, placephotoresult.a);
        b.a(parcel, 2, placephotoresult.b, i);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        Status status = null;
        int i = 0;
        BitmapTeleporter bitmapteleporter = null;
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
                    bitmapteleporter = (BitmapTeleporter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, BitmapTeleporter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PlacePhotoResult(i, status, bitmapteleporter);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PlacePhotoResult[i];
    }
}
