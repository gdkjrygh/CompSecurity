// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomEntityCreator, RoomEntity

static final class  extends RoomEntityCreator
{

    public RoomEntity bo(Parcel parcel)
    {
        if (RoomEntity.b(RoomEntity.gR()) || RoomEntity.aQ(com/google/android/gms/games/multiplayer/realtime/RoomEntity.getCanonicalName()))
        {
            return super.bo(parcel);
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
            arraylist.add(ParticipantEntity.CREATOR.(parcel));
        }

        return new RoomEntity(2, s, s1, l1, j, s2, k, bundle, arraylist, -1);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bo(parcel);
    }

    ()
    {
    }
}
