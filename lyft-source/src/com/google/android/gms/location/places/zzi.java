// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places:
//            PlacePhotoMetadataResult

public class zzi
    implements android.os.Parcelable.Creator
{

    public zzi()
    {
    }

    static void a(PlacePhotoMetadataResult placephotometadataresult, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, placephotometadataresult.a(), i, false);
        zzb.a(parcel, 1000, placephotometadataresult.a);
        zzb.a(parcel, 2, placephotometadataresult.b, i, false);
        zzb.a(parcel, j);
    }

    public PlacePhotoMetadataResult a(Parcel parcel)
    {
        DataHolder dataholder = null;
        int j = zza.b(parcel);
        int i = 0;
        Status status = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.a(parcel);
                switch (zza.a(k))
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    status = (Status)zza.a(parcel, k, Status.CREATOR);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    dataholder = (DataHolder)zza.a(parcel, k, DataHolder.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PlacePhotoMetadataResult(i, status, dataholder);
            }
        } while (true);
    }

    public PlacePhotoMetadataResult[] a(int i)
    {
        return new PlacePhotoMetadataResult[i];
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
