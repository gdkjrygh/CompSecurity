// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.internal.DataItemParcelable;
import com.google.android.gms.wearable.internal.PutDataResponse;

public final class cse
    implements android.os.Parcelable.Creator
{

    public cse()
    {
    }

    public static void a(PutDataResponse putdataresponse, Parcel parcel, int i)
    {
        int j = brp.a(parcel, 20293);
        brp.b(parcel, 1, putdataresponse.a);
        brp.b(parcel, 2, putdataresponse.b);
        brp.a(parcel, 3, putdataresponse.c, i);
        brp.b(parcel, j);
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
                return new PutDataResponse(i, j, dataitemparcelable);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PutDataResponse[i];
    }
}
