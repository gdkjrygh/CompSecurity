// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            InvitationEntityCreator, InvitationEntity, ParticipantEntity

static final class  extends InvitationEntityCreator
{

    public InvitationEntity bl(Parcel parcel)
    {
        if (InvitationEntity.b(InvitationEntity.gR()) || InvitationEntity.aQ(com/google/android/gms/games/multiplayer/InvitationEntity.getCanonicalName()))
        {
            return super.bl(parcel);
        }
        GameEntity gameentity = (GameEntity)GameEntity.CREATOR.bl(parcel);
        String s = parcel.readString();
        long l = parcel.readLong();
        int j = parcel.readInt();
        ParticipantEntity participantentity = (ParticipantEntity)ParticipantEntity.CREATOR.CREATOR(parcel);
        int k = parcel.readInt();
        ArrayList arraylist = new ArrayList(k);
        for (int i = 0; i < k; i++)
        {
            arraylist.add(ParticipantEntity.CREATOR.CREATOR(parcel));
        }

        return new InvitationEntity(2, gameentity, s, l, j, participantentity, arraylist, -1, 0);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bl(parcel);
    }

    ()
    {
    }
}
