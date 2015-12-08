// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetChannelOutputStreamResponse

public final class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    static void a(GetChannelOutputStreamResponse getchanneloutputstreamresponse, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, getchanneloutputstreamresponse.a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, getchanneloutputstreamresponse.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, getchanneloutputstreamresponse.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
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
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, i1);
                    break;

                case 2: // '\002'
                    j = zza.e(parcel, i1);
                    break;

                case 3: // '\003'
                    parcelfiledescriptor = (ParcelFileDescriptor)zza.a(parcel, i1, ParcelFileDescriptor.CREATOR);
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
