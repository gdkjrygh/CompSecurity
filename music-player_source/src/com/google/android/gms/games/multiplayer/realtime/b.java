// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            d, RoomEntity

final class b extends d
{

    b()
    {
    }

    public final RoomEntity a(Parcel parcel)
    {
        if (RoomEntity.a(RoomEntity.l()) || RoomEntity.a(com/google/android/gms/games/multiplayer/realtime/RoomEntity.getCanonicalName()))
        {
            return super.a(parcel);
        }
        String s = parcel.readString();
        String s1 = parcel.readString();
        long l1 = parcel.readLong();
        int j = parcel.readInt();
        String s2 = parcel.readString();
        int k = parcel.readInt();
        android.os.Bundle bundle = parcel.readBundle();
        int l = parcel.readInt();
        ArrayList arraylist = new ArrayList(l);
        for (int i = 0; i < l; i++)
        {
            arraylist.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
        }

        return new RoomEntity(2, s, s1, l1, j, s2, k, bundle, arraylist, -1);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }
}
