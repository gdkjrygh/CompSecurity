// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.internal.ChannelImpl;

public final class ctc
    implements android.os.Parcelable.Creator
{

    public ctc()
    {
    }

    public static void a(ChannelImpl channelimpl, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, channelimpl.a);
        brp.a(parcel, 2, channelimpl.b);
        brp.a(parcel, 3, channelimpl.c);
        brp.a(parcel, 4, channelimpl.d);
        brp.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s2 = null;
        int j = zza.a(parcel);
        String s = null;
        int i = 0;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    s = zza.h(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = zza.h(parcel, k);
                    break;

                case 4: // '\004'
                    s2 = zza.h(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ChannelImpl(i, s, s1, s2);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ChannelImpl[i];
    }
}
