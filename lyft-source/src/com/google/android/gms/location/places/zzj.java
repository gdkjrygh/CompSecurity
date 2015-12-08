// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places:
//            PlacePhotoResult

public class zzj
    implements android.os.Parcelable.Creator
{

    public zzj()
    {
    }

    static void a(PlacePhotoResult placephotoresult, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, placephotoresult.a(), i, false);
        zzb.a(parcel, 1000, placephotoresult.a);
        zzb.a(parcel, 2, placephotoresult.b, i, false);
        zzb.a(parcel, j);
    }

    public PlacePhotoResult a(Parcel parcel)
    {
        BitmapTeleporter bitmapteleporter = null;
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
                    bitmapteleporter = (BitmapTeleporter)zza.a(parcel, k, BitmapTeleporter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PlacePhotoResult(i, status, bitmapteleporter);
            }
        } while (true);
    }

    public PlacePhotoResult[] a(int i)
    {
        return new PlacePhotoResult[i];
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
