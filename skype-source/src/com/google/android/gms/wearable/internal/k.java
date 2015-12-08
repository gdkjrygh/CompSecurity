// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetChannelOutputStreamResponse

public final class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    static void a(GetChannelOutputStreamResponse getchanneloutputstreamresponse, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, getchanneloutputstreamresponse.a);
        b.a(parcel, 2, getchanneloutputstreamresponse.b);
        b.a(parcel, 3, getchanneloutputstreamresponse.c, i);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        ParcelFileDescriptor parcelfiledescriptor = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 3: // '\003'
                    parcelfiledescriptor = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, ParcelFileDescriptor.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
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
