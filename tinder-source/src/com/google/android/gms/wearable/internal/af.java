// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            OpenChannelResponse, ChannelImpl

public final class af
    implements android.os.Parcelable.Creator
{

    public af()
    {
    }

    static void a(OpenChannelResponse openchannelresponse, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, openchannelresponse.a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, openchannelresponse.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, openchannelresponse.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = zza.a(parcel);
        ChannelImpl channelimpl = null;
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
                    channelimpl = (ChannelImpl)zza.a(parcel, l, ChannelImpl.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new OpenChannelResponse(i, j, channelimpl);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new OpenChannelResponse[i];
    }
}
