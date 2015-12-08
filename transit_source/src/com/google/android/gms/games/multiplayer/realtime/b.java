// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.games.multiplayer.ParticipantEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomEntity

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(RoomEntity roomentity, Parcel parcel, int i)
    {
        i = com.google.android.gms.common.internal.safeparcel.b.k(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, roomentity.getRoomId(), false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1000, roomentity.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, roomentity.getCreatorId(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, roomentity.getCreationTimestamp());
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 4, roomentity.getStatus());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, roomentity.getDescription(), false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 6, roomentity.getVariant());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, roomentity.getAutoMatchCriteria(), false);
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, 8, roomentity.getParticipants(), false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 9, roomentity.getAutoMatchWaitEstimateSeconds());
        com.google.android.gms.common.internal.safeparcel.b.C(parcel, i);
    }

    public RoomEntity[] V(int i)
    {
        return new RoomEntity[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return y(parcel);
    }

    public Object[] newArray(int i)
    {
        return V(i);
    }

    public RoomEntity y(Parcel parcel)
    {
        int i = 0;
        java.util.ArrayList arraylist = null;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        long l1 = 0L;
        android.os.Bundle bundle = null;
        int j = 0;
        String s = null;
        int k = 0;
        String s1 = null;
        String s2 = null;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 6: // '\006'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 7: // '\007'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.n(parcel, j1);
                    break;

                case 8: // '\b'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, ParticipantEntity.CREATOR);
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new RoomEntity(l, s2, s1, l1, k, s, j, bundle, arraylist, i);
            }
        } while (true);
    }
}
