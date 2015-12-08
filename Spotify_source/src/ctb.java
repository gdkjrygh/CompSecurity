// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.ChannelImpl;

public final class ctb
    implements android.os.Parcelable.Creator
{

    public ctb()
    {
    }

    public static void a(ChannelEventParcelable channeleventparcelable, Parcel parcel, int i)
    {
        int j = brp.a(parcel, 20293);
        brp.b(parcel, 1, channeleventparcelable.a);
        brp.a(parcel, 2, channeleventparcelable.b, i);
        brp.b(parcel, 3, channeleventparcelable.c);
        brp.b(parcel, 4, channeleventparcelable.d);
        brp.b(parcel, 5, channeleventparcelable.e);
        brp.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        int i1 = zza.a(parcel);
        ChannelImpl channelimpl = null;
        int j = 0;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    zza.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = zza.e(parcel, j1);
                    break;

                case 2: // '\002'
                    channelimpl = (ChannelImpl)zza.a(parcel, j1, ChannelImpl.CREATOR);
                    break;

                case 3: // '\003'
                    k = zza.e(parcel, j1);
                    break;

                case 4: // '\004'
                    j = zza.e(parcel, j1);
                    break;

                case 5: // '\005'
                    i = zza.e(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new ChannelEventParcelable(l, channelimpl, k, j, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new ChannelEventParcelable[i];
    }
}
