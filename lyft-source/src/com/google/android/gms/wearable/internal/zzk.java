// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ChannelEventParcelable, ChannelImpl

public class zzk
    implements android.os.Parcelable.Creator
{

    public zzk()
    {
    }

    static void a(ChannelEventParcelable channeleventparcelable, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, channeleventparcelable.a);
        zzb.a(parcel, 2, channeleventparcelable.b, i, false);
        zzb.a(parcel, 3, channeleventparcelable.c);
        zzb.a(parcel, 4, channeleventparcelable.d);
        zzb.a(parcel, 5, channeleventparcelable.e);
        zzb.a(parcel, j);
    }

    public ChannelEventParcelable a(Parcel parcel)
    {
        int i = 0;
        int i1 = zza.b(parcel);
        ChannelImpl channelimpl = null;
        int j = 0;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = zza.a(parcel);
                switch (zza.a(j1))
                {
                default:
                    zza.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = zza.f(parcel, j1);
                    break;

                case 2: // '\002'
                    channelimpl = (ChannelImpl)zza.a(parcel, j1, ChannelImpl.CREATOR);
                    break;

                case 3: // '\003'
                    k = zza.f(parcel, j1);
                    break;

                case 4: // '\004'
                    j = zza.f(parcel, j1);
                    break;

                case 5: // '\005'
                    i = zza.f(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new ChannelEventParcelable(l, channelimpl, k, j, i);
            }
        } while (true);
    }

    public ChannelEventParcelable[] a(int i)
    {
        return new ChannelEventParcelable[i];
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
