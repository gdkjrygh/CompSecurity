// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchEntity

public class TurnBasedMatchEntityCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public TurnBasedMatchEntityCreator()
    {
    }

    static void a(TurnBasedMatchEntity turnbasedmatchentity, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.a(parcel, 1, turnbasedmatchentity.getGame(), i, false);
        b.a(parcel, 2, turnbasedmatchentity.getMatchId(), false);
        b.a(parcel, 3, turnbasedmatchentity.getCreatorId(), false);
        b.a(parcel, 4, turnbasedmatchentity.getCreationTimestamp());
        b.a(parcel, 5, turnbasedmatchentity.getLastUpdaterId(), false);
        b.a(parcel, 6, turnbasedmatchentity.getLastUpdatedTimestamp());
        b.a(parcel, 7, turnbasedmatchentity.getPendingParticipantId(), false);
        b.c(parcel, 8, turnbasedmatchentity.getStatus());
        b.c(parcel, 10, turnbasedmatchentity.getVariant());
        b.c(parcel, 11, turnbasedmatchentity.getVersion());
        b.a(parcel, 12, turnbasedmatchentity.getData(), false);
        b.b(parcel, 13, turnbasedmatchentity.getParticipants(), false);
        b.a(parcel, 14, turnbasedmatchentity.getRematchId(), false);
        b.a(parcel, 15, turnbasedmatchentity.getPreviousMatchData(), false);
        b.a(parcel, 17, turnbasedmatchentity.getAutoMatchCriteria(), false);
        b.c(parcel, 16, turnbasedmatchentity.getMatchNumber());
        b.c(parcel, 1000, turnbasedmatchentity.getVersionCode());
        b.a(parcel, 19, turnbasedmatchentity.isLocallyModified());
        b.c(parcel, 18, turnbasedmatchentity.getTurnStatus());
        b.a(parcel, 21, turnbasedmatchentity.getDescriptionParticipantId(), false);
        b.a(parcel, 20, turnbasedmatchentity.getDescription(), false);
        b.G(parcel, j);
    }

    public TurnBasedMatchEntity createFromParcel(Parcel parcel)
    {
        int k1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int j1 = 0;
        GameEntity gameentity = null;
        String s6 = null;
        String s5 = null;
        long l3 = 0L;
        String s4 = null;
        long l2 = 0L;
        String s3 = null;
        int i1 = 0;
        int l = 0;
        int k = 0;
        byte abyte1[] = null;
        java.util.ArrayList arraylist = null;
        String s2 = null;
        byte abyte0[] = null;
        int j = 0;
        android.os.Bundle bundle = null;
        int i = 0;
        boolean flag = false;
        String s1 = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k1)
            {
                int l1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(l1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l1);
                    break;

                case 1: // '\001'
                    gameentity = (GameEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, GameEntity.CREATOR);
                    break;

                case 2: // '\002'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    break;

                case 4: // '\004'
                    l3 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l1);
                    break;

                case 5: // '\005'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    break;

                case 6: // '\006'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l1);
                    break;

                case 7: // '\007'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    break;

                case 8: // '\b'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 10: // '\n'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 11: // '\013'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 12: // '\f'
                    abyte1 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, l1);
                    break;

                case 13: // '\r'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1, ParticipantEntity.CREATOR);
                    break;

                case 14: // '\016'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    break;

                case 15: // '\017'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, l1);
                    break;

                case 17: // '\021'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.q(parcel, l1);
                    break;

                case 16: // '\020'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 1000: 
                    j1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 19: // '\023'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1);
                    break;

                case 18: // '\022'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l1);
                    break;

                case 21: // '\025'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    break;

                case 20: // '\024'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l1);
                    break;
                }
            } else
            if (parcel.dataPosition() != k1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k1).toString(), parcel);
            } else
            {
                return new TurnBasedMatchEntity(j1, gameentity, s6, s5, l3, s4, l2, s3, i1, l, k, abyte1, arraylist, s2, abyte0, j, bundle, i, flag, s1, s);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public TurnBasedMatchEntity[] newArray(int i)
    {
        return new TurnBasedMatchEntity[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
