// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.hm;
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
            if (InvitationEntity.b(InvitationEntity.gR()) || InvitationEntity.aQ(com/google/android/gms/games/multiplayer/InvitationEntity.getCanonicalName()))
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
    private final String NQ;
    private final GameEntity Rt;
    private final long SU;
    private final int SV;
    private final ParticipantEntity SW;
    private final ArrayList SX;
    private final int SY;
    private final int SZ;
    private final int xM;

    InvitationEntity(int i, GameEntity gameentity, String s, long l, int j, ParticipantEntity participantentity, 
            ArrayList arraylist, int k, int i1)
    {
        xM = i;
        Rt = gameentity;
        NQ = s;
        SU = l;
        SV = j;
        SW = participantentity;
        SX = arraylist;
        SY = k;
        SZ = i1;
    }

    InvitationEntity(Invitation invitation)
    {
        xM = 2;
        Rt = new GameEntity(invitation.getGame());
        NQ = invitation.getInvitationId();
        SU = invitation.getCreationTimestamp();
        SV = invitation.getInvitationType();
        SY = invitation.getVariant();
        SZ = invitation.getAvailableAutoMatchSlots();
        String s = invitation.getInviter().getParticipantId();
        Object obj = null;
        ArrayList arraylist = invitation.getParticipants();
        int j = arraylist.size();
        SX = new ArrayList(j);
        int i = 0;
        invitation = obj;
        for (; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                invitation = participant;
            }
            SX.add((ParticipantEntity)participant.freeze());
        }

        hm.b(invitation, "Must have a valid inviter!");
        SW = (ParticipantEntity)invitation.freeze();
    }

    static int a(Invitation invitation)
    {
        return hk.hashCode(new Object[] {
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
        if (!hk.equal(((Invitation) (obj)).getGame(), invitation.getGame()) || !hk.equal(((Invitation) (obj)).getInvitationId(), invitation.getInvitationId()) || !hk.equal(Long.valueOf(((Invitation) (obj)).getCreationTimestamp()), Long.valueOf(invitation.getCreationTimestamp())) || !hk.equal(Integer.valueOf(((Invitation) (obj)).getInvitationType()), Integer.valueOf(invitation.getInvitationType())) || !hk.equal(((Invitation) (obj)).getInviter(), invitation.getInviter()) || !hk.equal(((Invitation) (obj)).getParticipants(), invitation.getParticipants()) || !hk.equal(Integer.valueOf(((Invitation) (obj)).getVariant()), Integer.valueOf(invitation.getVariant())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(Integer.valueOf(((Invitation) (obj)).getAvailableAutoMatchSlots()), Integer.valueOf(invitation.getAvailableAutoMatchSlots()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean aQ(String s)
    {
        return aA(s);
    }

    static String b(Invitation invitation)
    {
        return hk.e(invitation).a("Game", invitation.getGame()).a("InvitationId", invitation.getInvitationId()).a("CreationTimestamp", Long.valueOf(invitation.getCreationTimestamp())).a("InvitationType", Integer.valueOf(invitation.getInvitationType())).a("Inviter", invitation.getInviter()).a("Participants", invitation.getParticipants()).a("Variant", Integer.valueOf(invitation.getVariant())).a("AvailableAutoMatchSlots", Integer.valueOf(invitation.getAvailableAutoMatchSlots())).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer gR()
    {
        return fq();
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
        return SZ;
    }

    public long getCreationTimestamp()
    {
        return SU;
    }

    public Game getGame()
    {
        return Rt;
    }

    public String getInvitationId()
    {
        return NQ;
    }

    public int getInvitationType()
    {
        return SV;
    }

    public Participant getInviter()
    {
        return SW;
    }

    public ArrayList getParticipants()
    {
        return new ArrayList(SX);
    }

    public int getVariant()
    {
        return SY;
    }

    public int getVersionCode()
    {
        return xM;
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
        if (!fr())
        {
            InvitationEntityCreator.a(this, parcel, i);
        } else
        {
            Rt.writeToParcel(parcel, i);
            parcel.writeString(NQ);
            parcel.writeLong(SU);
            parcel.writeInt(SV);
            SW.writeToParcel(parcel, i);
            int k = SX.size();
            parcel.writeInt(k);
            int j = 0;
            while (j < k) 
            {
                ((ParticipantEntity)SX.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

}
