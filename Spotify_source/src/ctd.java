// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;

public final class ctd
    implements android.os.Parcelable.Creator
{

    public ctd()
    {
    }

    public static void a(ChannelReceiveFileResponse channelreceivefileresponse, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, channelreceivefileresponse.a);
        brp.b(parcel, 2, channelreceivefileresponse.b);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = zza.a(parcel);
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
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ChannelReceiveFileResponse(i, j);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ChannelReceiveFileResponse[i];
    }
}
