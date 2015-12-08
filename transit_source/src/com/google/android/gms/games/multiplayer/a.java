// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.GameEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            InvitationEntity, ParticipantEntity

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(InvitationEntity invitationentity, Parcel parcel, int i)
    {
        int j = b.k(parcel);
        b.a(parcel, 1, invitationentity.getGame(), i, false);
        b.c(parcel, 1000, invitationentity.getVersionCode());
        b.a(parcel, 2, invitationentity.getInvitationId(), false);
        b.a(parcel, 3, invitationentity.getCreationTimestamp());
        b.c(parcel, 4, invitationentity.ch());
        b.a(parcel, 5, invitationentity.getInviter(), i, false);
        b.b(parcel, 6, invitationentity.getParticipants(), false);
        b.c(parcel, 7, invitationentity.getVariant());
        b.C(parcel, j);
    }

    public InvitationEntity[] S(int i)
    {
        return new InvitationEntity[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return v(parcel);
    }

    public Object[] newArray(int i)
    {
        return S(i);
    }

    public InvitationEntity v(Parcel parcel)
    {
        int i = 0;
        java.util.ArrayList arraylist = null;
        int l = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        long l1 = 0L;
        ParticipantEntity participantentity = null;
        int j = 0;
        String s = null;
        GameEntity gameentity = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    gameentity = (GameEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, GameEntity.CREATOR);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 5: // '\005'
                    participantentity = (ParticipantEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, ParticipantEntity.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1, ParticipantEntity.CREATOR);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new InvitationEntity(k, gameentity, s, l1, j, participantentity, arraylist, i);
            }
        } while (true);
    }
}
