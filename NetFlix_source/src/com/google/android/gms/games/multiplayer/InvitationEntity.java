// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.fo;
import com.google.android.gms.internal.fq;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, Participant, ParticipantEntity, InvitationEntityCreator

public final class InvitationEntity extends GamesDowngradeableSafeParcel
    implements Invitation
{
    static final class InvitationEntityCreatorCompat extends InvitationEntityCreator
    {

        public InvitationEntity au(Parcel parcel)
        {
            if (InvitationEntity.b(InvitationEntity.gg()) || InvitationEntity.az(com/google/android/gms/games/multiplayer/InvitationEntity.getCanonicalName()))
            {
                return super.au(parcel);
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
            return au(parcel);
        }

        InvitationEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new InvitationEntityCreatorCompat();
    private final String IV;
    private final GameEntity Lt;
    private final long Mu;
    private final int Mv;
    private final ParticipantEntity Mw;
    private final ArrayList Mx;
    private final int My;
    private final int Mz;
    private final int xH;

    InvitationEntity(int i, GameEntity gameentity, String s, long l, int j, ParticipantEntity participantentity, 
            ArrayList arraylist, int k, int i1)
    {
        xH = i;
        Lt = gameentity;
        IV = s;
        Mu = l;
        Mv = j;
        Mw = participantentity;
        Mx = arraylist;
        My = k;
        Mz = i1;
    }

    InvitationEntity(Invitation invitation)
    {
        xH = 2;
        Lt = new GameEntity(invitation.getGame());
        IV = invitation.getInvitationId();
        Mu = invitation.getCreationTimestamp();
        Mv = invitation.getInvitationType();
        My = invitation.getVariant();
        Mz = invitation.getAvailableAutoMatchSlots();
        String s = invitation.getInviter().getParticipantId();
        Object obj = null;
        ArrayList arraylist = invitation.getParticipants();
        int j = arraylist.size();
        Mx = new ArrayList(j);
        int i = 0;
        invitation = obj;
        for (; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                invitation = participant;
            }
            Mx.add((ParticipantEntity)participant.freeze());
        }

        fq.b(invitation, "Must have a valid inviter!");
        Mw = (ParticipantEntity)invitation.freeze();
    }

    static int a(Invitation invitation)
    {
        return fo.hashCode(new Object[] {
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
        if (!fo.equal(((Invitation) (obj)).getGame(), invitation.getGame()) || !fo.equal(((Invitation) (obj)).getInvitationId(), invitation.getInvitationId()) || !fo.equal(Long.valueOf(((Invitation) (obj)).getCreationTimestamp()), Long.valueOf(invitation.getCreationTimestamp())) || !fo.equal(Integer.valueOf(((Invitation) (obj)).getInvitationType()), Integer.valueOf(invitation.getInvitationType())) || !fo.equal(((Invitation) (obj)).getInviter(), invitation.getInviter()) || !fo.equal(((Invitation) (obj)).getParticipants(), invitation.getParticipants()) || !fo.equal(Integer.valueOf(((Invitation) (obj)).getVariant()), Integer.valueOf(invitation.getVariant())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (fo.equal(Integer.valueOf(((Invitation) (obj)).getAvailableAutoMatchSlots()), Integer.valueOf(invitation.getAvailableAutoMatchSlots()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static boolean az(String s)
    {
        return al(s);
    }

    static String b(Invitation invitation)
    {
        return fo.e(invitation).a("Game", invitation.getGame()).a("InvitationId", invitation.getInvitationId()).a("CreationTimestamp", Long.valueOf(invitation.getCreationTimestamp())).a("InvitationType", Integer.valueOf(invitation.getInvitationType())).a("Inviter", invitation.getInviter()).a("Participants", invitation.getParticipants()).a("Variant", Integer.valueOf(invitation.getVariant())).a("AvailableAutoMatchSlots", Integer.valueOf(invitation.getAvailableAutoMatchSlots())).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer gg()
    {
        return eJ();
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
        return Mz;
    }

    public long getCreationTimestamp()
    {
        return Mu;
    }

    public Game getGame()
    {
        return Lt;
    }

    public String getInvitationId()
    {
        return IV;
    }

    public int getInvitationType()
    {
        return Mv;
    }

    public Participant getInviter()
    {
        return Mw;
    }

    public ArrayList getParticipants()
    {
        return new ArrayList(Mx);
    }

    public int getVariant()
    {
        return My;
    }

    public int getVersionCode()
    {
        return xH;
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
        if (!eK())
        {
            InvitationEntityCreator.a(this, parcel, i);
        } else
        {
            Lt.writeToParcel(parcel, i);
            parcel.writeString(IV);
            parcel.writeLong(Mu);
            parcel.writeInt(Mv);
            Mw.writeToParcel(parcel, i);
            int k = Mx.size();
            parcel.writeInt(k);
            int j = 0;
            while (j < k) 
            {
                ((ParticipantEntity)Mx.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

}
