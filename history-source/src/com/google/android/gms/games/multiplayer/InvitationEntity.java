// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, Participant, ParticipantEntity, InvitationEntityCreator

public final class InvitationEntity extends GamesDowngradeableSafeParcel
    implements Invitation
{
    static final class InvitationEntityCreatorCompat extends InvitationEntityCreator
    {

        public Object createFromParcel(Parcel parcel)
        {
            return cz(parcel);
        }

        public InvitationEntity cz(Parcel parcel)
        {
            if (InvitationEntity.b(InvitationEntity.kD()) || InvitationEntity.bz(com/google/android/gms/games/multiplayer/InvitationEntity.getCanonicalName()))
            {
                return super.cz(parcel);
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

        InvitationEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new InvitationEntityCreatorCompat();
    private final int CK;
    private final String YG;
    private final GameEntity acs;
    private final long adS;
    private final int adT;
    private final ParticipantEntity adU;
    private final ArrayList adV;
    private final int adW;
    private final int adX;

    InvitationEntity(int i, GameEntity gameentity, String s, long l, int j, ParticipantEntity participantentity, 
            ArrayList arraylist, int k, int i1)
    {
        CK = i;
        acs = gameentity;
        YG = s;
        adS = l;
        adT = j;
        adU = participantentity;
        adV = arraylist;
        adW = k;
        adX = i1;
    }

    InvitationEntity(Invitation invitation)
    {
        CK = 2;
        acs = new GameEntity(invitation.getGame());
        YG = invitation.getInvitationId();
        adS = invitation.getCreationTimestamp();
        adT = invitation.getInvitationType();
        adW = invitation.getVariant();
        adX = invitation.getAvailableAutoMatchSlots();
        String s = invitation.getInviter().getParticipantId();
        Object obj = null;
        ArrayList arraylist = invitation.getParticipants();
        int j = arraylist.size();
        adV = new ArrayList(j);
        int i = 0;
        invitation = obj;
        for (; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                invitation = participant;
            }
            adV.add((ParticipantEntity)participant.freeze());
        }

        jx.b(invitation, "Must have a valid inviter!");
        adU = (ParticipantEntity)invitation.freeze();
    }

    static int a(Invitation invitation)
    {
        return jv.hashCode(new Object[] {
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
        if (!jv.equal(((Invitation) (obj)).getGame(), invitation.getGame()) || !jv.equal(((Invitation) (obj)).getInvitationId(), invitation.getInvitationId()) || !jv.equal(Long.valueOf(((Invitation) (obj)).getCreationTimestamp()), Long.valueOf(invitation.getCreationTimestamp())) || !jv.equal(Integer.valueOf(((Invitation) (obj)).getInvitationType()), Integer.valueOf(invitation.getInvitationType())) || !jv.equal(((Invitation) (obj)).getInviter(), invitation.getInviter()) || !jv.equal(((Invitation) (obj)).getParticipants(), invitation.getParticipants()) || !jv.equal(Integer.valueOf(((Invitation) (obj)).getVariant()), Integer.valueOf(invitation.getVariant())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(Integer.valueOf(((Invitation) (obj)).getAvailableAutoMatchSlots()), Integer.valueOf(invitation.getAvailableAutoMatchSlots()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Invitation invitation)
    {
        return jv.h(invitation).a("Game", invitation.getGame()).a("InvitationId", invitation.getInvitationId()).a("CreationTimestamp", Long.valueOf(invitation.getCreationTimestamp())).a("InvitationType", Integer.valueOf(invitation.getInvitationType())).a("Inviter", invitation.getInviter()).a("Participants", invitation.getParticipants()).a("Variant", Integer.valueOf(invitation.getVariant())).a("AvailableAutoMatchSlots", Integer.valueOf(invitation.getAvailableAutoMatchSlots())).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static boolean bz(String s)
    {
        return aW(s);
    }

    static Integer kD()
    {
        return ht();
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
        return adX;
    }

    public long getCreationTimestamp()
    {
        return adS;
    }

    public Game getGame()
    {
        return acs;
    }

    public String getInvitationId()
    {
        return YG;
    }

    public int getInvitationType()
    {
        return adT;
    }

    public Participant getInviter()
    {
        return adU;
    }

    public ArrayList getParticipants()
    {
        return new ArrayList(adV);
    }

    public int getVariant()
    {
        return adW;
    }

    public int getVersionCode()
    {
        return CK;
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
        if (!hu())
        {
            InvitationEntityCreator.a(this, parcel, i);
        } else
        {
            acs.writeToParcel(parcel, i);
            parcel.writeString(YG);
            parcel.writeLong(adS);
            parcel.writeInt(adT);
            adU.writeToParcel(parcel, i);
            int k = adV.size();
            parcel.writeInt(k);
            int j = 0;
            while (j < k) 
            {
                ((ParticipantEntity)adV.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

}
