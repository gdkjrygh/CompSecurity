// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.hl;
import com.google.android.gms.internal.hn;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, Participant, ParticipantEntity, InvitationEntityCreator

public final class InvitationEntity extends GamesDowngradeableSafeParcel
    implements Invitation
{
    static final class InvitationEntityCreatorCompat extends InvitationEntityCreator
    {

        public InvitationEntity bl(Parcel parcel)
        {
            if (InvitationEntity.b(InvitationEntity.gM()) || InvitationEntity.aQ(com/google/android/gms/games/multiplayer/InvitationEntity.getCanonicalName()))
            {
                return super.bl(parcel);
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
            return bl(parcel);
        }

        InvitationEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new InvitationEntityCreatorCompat();
    private final String NN;
    private final GameEntity Rq;
    private final long SR;
    private final int SS;
    private final ParticipantEntity ST;
    private final ArrayList SU;
    private final int SV;
    private final int SW;
    private final int xJ;

    InvitationEntity(int i, GameEntity gameentity, String s, long l, int j, ParticipantEntity participantentity, 
            ArrayList arraylist, int k, int i1)
    {
        xJ = i;
        Rq = gameentity;
        NN = s;
        SR = l;
        SS = j;
        ST = participantentity;
        SU = arraylist;
        SV = k;
        SW = i1;
    }

    InvitationEntity(Invitation invitation)
    {
        xJ = 2;
        Rq = new GameEntity(invitation.getGame());
        NN = invitation.getInvitationId();
        SR = invitation.getCreationTimestamp();
        SS = invitation.getInvitationType();
        SV = invitation.getVariant();
        SW = invitation.getAvailableAutoMatchSlots();
        String s = invitation.getInviter().getParticipantId();
        Object obj = null;
        ArrayList arraylist = invitation.getParticipants();
        int j = arraylist.size();
        SU = new ArrayList(j);
        int i = 0;
        invitation = obj;
        for (; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                invitation = participant;
            }
            SU.add((ParticipantEntity)participant.freeze());
        }

        hn.b(invitation, "Must have a valid inviter!");
        ST = (ParticipantEntity)invitation.freeze();
    }

    static int a(Invitation invitation)
    {
        return hl.hashCode(new Object[] {
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
        if (!hl.equal(((Invitation) (obj)).getGame(), invitation.getGame()) || !hl.equal(((Invitation) (obj)).getInvitationId(), invitation.getInvitationId()) || !hl.equal(Long.valueOf(((Invitation) (obj)).getCreationTimestamp()), Long.valueOf(invitation.getCreationTimestamp())) || !hl.equal(Integer.valueOf(((Invitation) (obj)).getInvitationType()), Integer.valueOf(invitation.getInvitationType())) || !hl.equal(((Invitation) (obj)).getInviter(), invitation.getInviter()) || !hl.equal(((Invitation) (obj)).getParticipants(), invitation.getParticipants()) || !hl.equal(Integer.valueOf(((Invitation) (obj)).getVariant()), Integer.valueOf(invitation.getVariant())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hl.equal(Integer.valueOf(((Invitation) (obj)).getAvailableAutoMatchSlots()), Integer.valueOf(invitation.getAvailableAutoMatchSlots()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean aQ(String s)
    {
        return aA(s);
    }

    static String b(Invitation invitation)
    {
        return hl.e(invitation).a("Game", invitation.getGame()).a("InvitationId", invitation.getInvitationId()).a("CreationTimestamp", Long.valueOf(invitation.getCreationTimestamp())).a("InvitationType", Integer.valueOf(invitation.getInvitationType())).a("Inviter", invitation.getInviter()).a("Participants", invitation.getParticipants()).a("Variant", Integer.valueOf(invitation.getVariant())).a("AvailableAutoMatchSlots", Integer.valueOf(invitation.getAvailableAutoMatchSlots())).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer gM()
    {
        return fl();
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
        return SW;
    }

    public long getCreationTimestamp()
    {
        return SR;
    }

    public Game getGame()
    {
        return Rq;
    }

    public String getInvitationId()
    {
        return NN;
    }

    public int getInvitationType()
    {
        return SS;
    }

    public Participant getInviter()
    {
        return ST;
    }

    public ArrayList getParticipants()
    {
        return new ArrayList(SU);
    }

    public int getVariant()
    {
        return SV;
    }

    public int getVersionCode()
    {
        return xJ;
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
        if (!fm())
        {
            InvitationEntityCreator.a(this, parcel, i);
        } else
        {
            Rq.writeToParcel(parcel, i);
            parcel.writeString(NN);
            parcel.writeLong(SR);
            parcel.writeInt(SS);
            ST.writeToParcel(parcel, i);
            int k = SU.size();
            parcel.writeInt(k);
            int j = 0;
            while (j < k) 
            {
                ((ParticipantEntity)SU.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

}
