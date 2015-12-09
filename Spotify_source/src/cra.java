// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;

public final class cra
    implements android.os.Parcelable.Creator
{

    public cra()
    {
    }

    public static void a(GetChannelOutputStreamResponse getchanneloutputstreamresponse, Parcel parcel, int i)
    {
        int j = brp.a(parcel, 20293);
        brp.b(parcel, 1, getchanneloutputstreamresponse.a);
        brp.b(parcel, 2, getchanneloutputstreamresponse.b);
        brp.a(parcel, 3, getchanneloutputstreamresponse.c, i);
        brp.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = zza.a(parcel);
        ParcelFileDescriptor parcelfiledescriptor = null;
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
                    parcelfiledescriptor = (ParcelFileDescriptor)zza.a(parcel, l, ParcelFileDescriptor.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GetChannelOutputStreamResponse(i, j, parcelfiledescriptor);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GetChannelOutputStreamResponse[i];
    }
}
