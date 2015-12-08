// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.en;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, Participant, ParticipantEntity, a

public final class InvitationEntity extends en
    implements Invitation
{
    static final class a extends com.google.android.gms.games.multiplayer.a
    {

        public Object createFromParcel(Parcel parcel)
        {
            return v(parcel);
        }

        public InvitationEntity v(Parcel parcel)
        {
            if (InvitationEntity.b(InvitationEntity.bQ()) || InvitationEntity.J(com/google/android/gms/games/multiplayer/InvitationEntity.getCanonicalName()))
            {
                return super.v(parcel);
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

            return new InvitationEntity(1, gameentity, s, l, j, participantentity, arraylist, -1);
        }

        a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int iM;
    private final GameEntity nL;
    private final String nM;
    private final long nN;
    private final int nO;
    private final ParticipantEntity nP;
    private final ArrayList nQ;
    private final int nR;

    InvitationEntity(int i, GameEntity gameentity, String s, long l, int j, ParticipantEntity participantentity, 
            ArrayList arraylist, int k)
    {
        iM = i;
        nL = gameentity;
        nM = s;
        nN = l;
        nO = j;
        nP = participantentity;
        nQ = arraylist;
        nR = k;
    }

    InvitationEntity(Invitation invitation)
    {
        iM = 1;
        nL = new GameEntity(invitation.getGame());
        nM = invitation.getInvitationId();
        nN = invitation.getCreationTimestamp();
        nO = invitation.ch();
        nR = invitation.getVariant();
        String s = invitation.getInviter().getParticipantId();
        Object obj = null;
        ArrayList arraylist = invitation.getParticipants();
        int j = arraylist.size();
        nQ = new ArrayList(j);
        int i = 0;
        invitation = obj;
        for (; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                invitation = participant;
            }
            nQ.add((ParticipantEntity)participant.freeze());
        }

        dm.a(invitation, "Must have a valid inviter!");
        nP = (ParticipantEntity)invitation.freeze();
    }

    static boolean J(String s)
    {
        return y(s);
    }

    static int a(Invitation invitation)
    {
        return dl.hashCode(new Object[] {
            invitation.getGame(), invitation.getInvitationId(), Long.valueOf(invitation.getCreationTimestamp()), Integer.valueOf(invitation.ch()), invitation.getInviter(), invitation.getParticipants(), Integer.valueOf(invitation.getVariant())
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
        if (!dl.equal(((Invitation) (obj)).getGame(), invitation.getGame()) || !dl.equal(((Invitation) (obj)).getInvitationId(), invitation.getInvitationId()) || !dl.equal(Long.valueOf(((Invitation) (obj)).getCreationTimestamp()), Long.valueOf(invitation.getCreationTimestamp())) || !dl.equal(Integer.valueOf(((Invitation) (obj)).ch()), Integer.valueOf(invitation.ch())) || !dl.equal(((Invitation) (obj)).getInviter(), invitation.getInviter()) || !dl.equal(((Invitation) (obj)).getParticipants(), invitation.getParticipants()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (dl.equal(Integer.valueOf(((Invitation) (obj)).getVariant()), Integer.valueOf(invitation.getVariant()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Invitation invitation)
    {
        return dl.d(invitation).a("Game", invitation.getGame()).a("InvitationId", invitation.getInvitationId()).a("CreationTimestamp", Long.valueOf(invitation.getCreationTimestamp())).a("InvitationType", Integer.valueOf(invitation.ch())).a("Inviter", invitation.getInviter()).a("Participants", invitation.getParticipants()).a("Variant", Integer.valueOf(invitation.getVariant())).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer bQ()
    {
        return aW();
    }

    public int ch()
    {
        return nO;
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

    public long getCreationTimestamp()
    {
        return nN;
    }

    public Game getGame()
    {
        return nL;
    }

    public String getInvitationId()
    {
        return nM;
    }

    public Participant getInviter()
    {
        return nP;
    }

    public ArrayList getParticipants()
    {
        return new ArrayList(nQ);
    }

    public int getVariant()
    {
        return nR;
    }

    public int getVersionCode()
    {
        return iM;
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
        if (!aX())
        {
            com.google.android.gms.games.multiplayer.a.a(this, parcel, i);
        } else
        {
            nL.writeToParcel(parcel, i);
            parcel.writeString(nM);
            parcel.writeLong(nN);
            parcel.writeInt(nO);
            nP.writeToParcel(parcel, i);
            int k = nQ.size();
            parcel.writeInt(k);
            int j = 0;
            while (j < k) 
            {
                ((ParticipantEntity)nQ.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }

}
