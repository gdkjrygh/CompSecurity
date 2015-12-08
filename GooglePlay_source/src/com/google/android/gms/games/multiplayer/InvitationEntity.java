// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, Participant, ParticipantEntity, InvitationEntityCreator

public final class InvitationEntity extends GamesDowngradeableSafeParcel
    implements Invitation
{
    static final class InvitationEntityCreatorCompat extends InvitationEntityCreator
    {

        public final InvitationEntity createFromParcel(Parcel parcel)
        {
            if (InvitationEntity.versionSupportsSafeParcel(InvitationEntity.getUnparcelClientVersion()) || InvitationEntity.canUnparcelSafely(com/google/android/gms/games/multiplayer/InvitationEntity.getCanonicalName()))
            {
                return super.createFromParcel(parcel);
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

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        InvitationEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new InvitationEntityCreatorCompat();
    final int mAvailableAutoMatchSlots;
    final long mCreationTimestamp;
    final GameEntity mGame;
    public final String mInvitationId;
    final int mInvitationType;
    public final ParticipantEntity mInviter;
    private final ArrayList mParticipants;
    final int mVariant;
    final int mVersionCode;

    InvitationEntity(int i, GameEntity gameentity, String s, long l, int j, ParticipantEntity participantentity, 
            ArrayList arraylist, int k, int i1)
    {
        mVersionCode = i;
        mGame = gameentity;
        mInvitationId = s;
        mCreationTimestamp = l;
        mInvitationType = j;
        mInviter = participantentity;
        mParticipants = arraylist;
        mVariant = k;
        mAvailableAutoMatchSlots = i1;
    }

    InvitationEntity(Invitation invitation)
    {
        mVersionCode = 2;
        mGame = new GameEntity(invitation.getGame());
        mInvitationId = invitation.getInvitationId();
        mCreationTimestamp = invitation.getCreationTimestamp();
        mInvitationType = invitation.getInvitationType();
        mVariant = invitation.getVariant();
        mAvailableAutoMatchSlots = invitation.getAvailableAutoMatchSlots();
        String s = invitation.getInviter().getParticipantId();
        Object obj = null;
        ArrayList arraylist = invitation.getParticipants();
        int j = arraylist.size();
        mParticipants = new ArrayList(j);
        int i = 0;
        invitation = obj;
        for (; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                invitation = participant;
            }
            mParticipants.add((ParticipantEntity)participant.freeze());
        }

        Preconditions.checkNotNull(invitation, "Must have a valid inviter!");
        mInviter = (ParticipantEntity)invitation.freeze();
    }

    static boolean equals(Invitation invitation, Object obj)
    {
        if (obj instanceof Invitation)
        {
            if (invitation == obj)
            {
                return true;
            }
            obj = (Invitation)obj;
            if (Objects.equal(((Invitation) (obj)).getGame(), invitation.getGame()) && Objects.equal(((Invitation) (obj)).getInvitationId(), invitation.getInvitationId()) && Objects.equal(Long.valueOf(((Invitation) (obj)).getCreationTimestamp()), Long.valueOf(invitation.getCreationTimestamp())) && Objects.equal(Integer.valueOf(((Invitation) (obj)).getInvitationType()), Integer.valueOf(invitation.getInvitationType())) && Objects.equal(((Invitation) (obj)).getInviter(), invitation.getInviter()) && Objects.equal(((Invitation) (obj)).getParticipants(), invitation.getParticipants()) && Objects.equal(Integer.valueOf(((Invitation) (obj)).getVariant()), Integer.valueOf(invitation.getVariant())) && Objects.equal(Integer.valueOf(((Invitation) (obj)).getAvailableAutoMatchSlots()), Integer.valueOf(invitation.getAvailableAutoMatchSlots())))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(Invitation invitation)
    {
        return Arrays.hashCode(new Object[] {
            invitation.getGame(), invitation.getInvitationId(), Long.valueOf(invitation.getCreationTimestamp()), Integer.valueOf(invitation.getInvitationType()), invitation.getInviter(), invitation.getParticipants(), Integer.valueOf(invitation.getVariant()), Integer.valueOf(invitation.getAvailableAutoMatchSlots())
        });
    }

    static String toString(Invitation invitation)
    {
        return Objects.toStringHelper(invitation).add("Game", invitation.getGame()).add("InvitationId", invitation.getInvitationId()).add("CreationTimestamp", Long.valueOf(invitation.getCreationTimestamp())).add("InvitationType", Integer.valueOf(invitation.getInvitationType())).add("Inviter", invitation.getInviter()).add("Participants", invitation.getParticipants()).add("Variant", Integer.valueOf(invitation.getVariant())).add("AvailableAutoMatchSlots", Integer.valueOf(invitation.getAvailableAutoMatchSlots())).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((Invitation) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final int getAvailableAutoMatchSlots()
    {
        return mAvailableAutoMatchSlots;
    }

    public final long getCreationTimestamp()
    {
        return mCreationTimestamp;
    }

    public final Game getGame()
    {
        return mGame;
    }

    public final String getInvitationId()
    {
        return mInvitationId;
    }

    public final int getInvitationType()
    {
        return mInvitationType;
    }

    public final Participant getInviter()
    {
        return mInviter;
    }

    public final ArrayList getParticipants()
    {
        return new ArrayList(mParticipants);
    }

    public final int getVariant()
    {
        return mVariant;
    }

    public final int hashCode()
    {
        return hashCode(((Invitation) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final void setShouldDowngrade(boolean flag)
    {
        super.setShouldDowngrade(flag);
        mGame.setShouldDowngrade(flag);
        mInviter.setShouldDowngrade(flag);
        int i = 0;
        for (int j = mParticipants.size(); i < j; i++)
        {
            ((ParticipantEntity)mParticipants.get(i)).setShouldDowngrade(flag);
        }

    }

    public final String toString()
    {
        return toString(((Invitation) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (!super.mShouldDowngrade)
        {
            InvitationEntityCreator.writeToParcel(this, parcel, i);
        } else
        {
            mGame.writeToParcel(parcel, i);
            parcel.writeString(mInvitationId);
            parcel.writeLong(mCreationTimestamp);
            parcel.writeInt(mInvitationType);
            mInviter.writeToParcel(parcel, i);
            int k = mParticipants.size();
            parcel.writeInt(k);
            int j = 0;
            while (j < k) 
            {
                ((ParticipantEntity)mParticipants.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }




}
