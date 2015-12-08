// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ChannelEventParcelable, ChannelImpl

public final class ba
    implements android.os.Parcelable.Creator
{

    public ba()
    {
    }

    static void a(ChannelEventParcelable channeleventparcelable, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, channeleventparcelable.a);
        b.a(parcel, 2, channeleventparcelable.b, i);
        b.a(parcel, 3, channeleventparcelable.c);
        b.a(parcel, 4, channeleventparcelable.d);
        b.a(parcel, 5, channeleventparcelable.e);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
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
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    channelimpl = (ChannelImpl)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, ChannelImpl.CREATOR);
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
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
