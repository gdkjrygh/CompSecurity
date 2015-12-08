// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, Participant, ParticipantEntity, InvitationEntityCreator

public final class InvitationEntity extends GamesDowngradeableSafeParcel
    implements Invitation
{
    static final class InvitationEntityCreatorCompat extends InvitationEntityCreator
    {

        public InvitationEntity cl(Parcel parcel)
        {
            if (InvitationEntity.b(InvitationEntity.jT()) || InvitationEntity.bw(com/google/android/gms/games/multiplayer/InvitationEntity.getCanonicalName()))
            {
                return super.cl(parcel);
            }
            GameEntity gameentity = (GameEntity)GameEntity.CREATOR.createFromParcel(parcel);
            String s = parcel.readString();
            long l = parcel.readLong();
            int j = parcel.readInt();
            ParticipantEntity participantentity = (ParticipantEntity)ParticipantEntity.CREATOR.createFromParcel(parcel);
            int k = parcel.readInt();
            ArrayList arraylist = new ArrayList(k);
            for (int i = 0; i < k; i++)
            {
                arraylist.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
            }

            return new InvitationEntity(2, gameentity, s, l, j, participantentity, arraylist, -1, 0);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return cl(parcel);
        }

        InvitationEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new InvitationEntityCreatorCompat();
    private final int BR;
    private final String WO;
    private final GameEntity aay;
    private final long abZ;
    private final int aca;
    private final ParticipantEntity acb;
    private final ArrayList acc;
    private final int acd;
    private final int ace;

    InvitationEntity(int i, GameEntity gameentity, String s, long l, int j, ParticipantEntity participantentity, 
            ArrayList arraylist, int k, int i1)
    {
        BR = i;
        aay = gameentity;
        WO = s;
        abZ = l;
        aca = j;
        acb = participantentity;
        acc = arraylist;
        acd = k;
        ace = i1;
    }

    InvitationEntity(Invitation invitation)
    {
        BR = 2;
        aay = new GameEntity(invitation.getGame());
        WO = invitation.getInvitationId();
        abZ = invitation.getCreationTimestamp();
        aca = invitation.getInvitationType();
        acd = invitation.getVariant();
        ace = invitation.getAvailableAutoMatchSlots();
        String s = invitation.getInviter().getParticipantId();
        Object obj = null;
        ArrayList arraylist = invitation.getParticipants();
        int j = arraylist.size();
        acc = new ArrayList(j);
        int i = 0;
        invitation = obj;
        for (; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                invitation = participant;
            }
            acc.add((ParticipantEntity)participant.freeze());
        }

        o.b(invitation, "Must have a valid inviter!");
        acb = (ParticipantEntity)invitation.freeze();
    }

    static int a(Invitation invitation)
    {
        return n.hashCode(new Object[] {
            invitation.getGame(), invitation.getInvitationId(), Long.valueOf(invitation.getCreationTimestamp()), Integer.valueOf(invitation.getInvitationType()), invitation.getInviter(), invitation.getParticipants(), Integer.valueOf(invitation.getVariant()), Integer.valueOf(invitation.getAvailableAutoMatchSlots())
        });
    }

    static boolean a(Invitation invitation, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Invitation) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (invitation == obj) goto _L4; else goto _L3
_L3:
        obj = (Invitation)obj;
        if (!n.equal(((Invitation) (obj)).getGame(), invitation.getGame()) || !n.equal(((Invitation) (obj)).getInvitationId(), invitation.getInvitationId()) || !n.equal(Long.valueOf(((Invitation) (obj)).getCreationTimestamp()), Long.valueOf(invitation.getCreationTimestamp())) || !n.equal(Integer.valueOf(((Invitation) (obj)).getInvitationType()), Integer.valueOf(invitation.getInvitationType())) || !n.equal(((Invitation) (obj)).getInviter(), invitation.getInviter()) || !n.equal(((Invitation) (obj)).getParticipants(), invitation.getParticipants()) || !n.equal(Integer.valueOf(((Invitation) (obj)).getVariant()), Integer.valueOf(invitation.getVariant())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(Integer.valueOf(((Invitation) (obj)).getAvailableAutoMatchSlots()), Integer.valueOf(invitation.getAvailableAutoMatchSlots()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Invitation invitation)
    {
        return n.h(invitation).a("Game", invitation.getGame()).a("InvitationId", invitation.getInvitationId()).a("CreationTimestamp", Long.valueOf(invitation.getCreationTimestamp())).a("InvitationType", Integer.valueOf(invitation.getInvitationType())).a("Inviter", invitation.getInviter()).a("Participants", invitation.getParticipants()).a("Variant", Integer.valueOf(invitation.getVariant())).a("AvailableAutoMatchSlots", Integer.valueOf(invitation.getAvailableAutoMatchSlots())).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static boolean bw(String s)
    {
        return aV(s);
    }

    static Integer jT()
    {
        return gP();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Invitation freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int getAvailableAutoMatchSlots()
    {
        return ace;
    }

    public long getCreationTimestamp()
    {
        return abZ;
    }

    public Game getGame()
    {
        return aay;
    }

    public String getInvitationId()
    {
        return WO;
    }

    public int getInvitationType()
    {
        return aca;
    }

    public Participant getInviter()
    {
        return acb;
    }

    public ArrayList getParticipants()
    {
        return new ArrayList(acc);
    }

    public int getVariant()
    {
        return acd;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (!gQ())
        {
            InvitationEntityCreator.a(this, parcel, i);
        } else
        {
            aay.writeToParcel(parcel, i);
            parcel.writeString(WO);
            parcel.writeLong(abZ);
            parcel.writeInt(aca);
            acb.writeToParcel(parcel, i);
            int k = acc.size();
            parcel.writeInt(k);
            int j = 0;
            while (j < k) 
            {
                ((ParticipantEntity)acc.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

}
