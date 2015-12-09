// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatch, TurnBasedMatchEntityCreator

public final class TurnBasedMatchEntity
    implements SafeParcelable, TurnBasedMatch
{

    public static final android.os.Parcelable.Creator CREATOR = new TurnBasedMatchEntityCreator();
    final Bundle mAutoMatchCriteria;
    final long mCreationTimestamp;
    final String mCreatorId;
    final byte mData[];
    final String mDescription;
    final String mDescriptionParticipantId;
    final GameEntity mGame;
    final boolean mIsLocallyModified;
    final long mLastUpdatedTimestamp;
    final String mLastUpdaterId;
    final String mMatchId;
    final int mMatchNumber;
    final int mMatchStatus;
    private final ArrayList mParticipants;
    final String mPendingParticipantId;
    final byte mPreviousData[];
    final String mRematchId;
    final int mTurnStatus;
    final int mVariant;
    final int mVersion;
    final int mVersionCode;

    TurnBasedMatchEntity(int i, GameEntity gameentity, String s, String s1, long l, String s2, 
            long l1, String s3, int j, int k, int i1, byte abyte0[], 
            ArrayList arraylist, String s4, byte abyte1[], int j1, Bundle bundle, int k1, boolean flag, 
            String s5, String s6)
    {
        mVersionCode = i;
        mGame = gameentity;
        mMatchId = s;
        mCreatorId = s1;
        mCreationTimestamp = l;
        mLastUpdaterId = s2;
        mLastUpdatedTimestamp = l1;
        mPendingParticipantId = s3;
        mMatchStatus = j;
        mTurnStatus = k1;
        mVariant = k;
        mVersion = i1;
        mData = abyte0;
        mParticipants = arraylist;
        mRematchId = s4;
        mPreviousData = abyte1;
        mMatchNumber = j1;
        mAutoMatchCriteria = bundle;
        mIsLocallyModified = flag;
        mDescription = s5;
        mDescriptionParticipantId = s6;
    }

    public TurnBasedMatchEntity(TurnBasedMatch turnbasedmatch)
    {
        mVersionCode = 2;
        mGame = new GameEntity(turnbasedmatch.getGame());
        mMatchId = turnbasedmatch.getMatchId();
        mCreatorId = turnbasedmatch.getCreatorId();
        mCreationTimestamp = turnbasedmatch.getCreationTimestamp();
        mLastUpdaterId = turnbasedmatch.getLastUpdaterId();
        mLastUpdatedTimestamp = turnbasedmatch.getLastUpdatedTimestamp();
        mPendingParticipantId = turnbasedmatch.getPendingParticipantId();
        mMatchStatus = turnbasedmatch.getStatus();
        mTurnStatus = turnbasedmatch.getTurnStatus();
        mVariant = turnbasedmatch.getVariant();
        mVersion = turnbasedmatch.getVersion();
        mRematchId = turnbasedmatch.getRematchId();
        mMatchNumber = turnbasedmatch.getMatchNumber();
        mAutoMatchCriteria = turnbasedmatch.getAutoMatchCriteria();
        mIsLocallyModified = turnbasedmatch.isLocallyModified();
        mDescription = turnbasedmatch.getDescription();
        mDescriptionParticipantId = turnbasedmatch.getDescriptionParticipantId();
        byte abyte0[] = turnbasedmatch.getData();
        int j;
        if (abyte0 == null)
        {
            mData = null;
        } else
        {
            mData = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, mData, 0, abyte0.length);
        }
        abyte0 = turnbasedmatch.getPreviousMatchData();
        if (abyte0 == null)
        {
            mPreviousData = null;
        } else
        {
            mPreviousData = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, mPreviousData, 0, abyte0.length);
        }
        turnbasedmatch = turnbasedmatch.getParticipants();
        j = turnbasedmatch.size();
        mParticipants = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            mParticipants.add((ParticipantEntity)((Participant)turnbasedmatch.get(i)).freeze());
        }

    }

    static boolean equals(TurnBasedMatch turnbasedmatch, Object obj)
    {
        if (obj instanceof TurnBasedMatch)
        {
            if (turnbasedmatch == obj)
            {
                return true;
            }
            obj = (TurnBasedMatch)obj;
            if (Objects.equal(((TurnBasedMatch) (obj)).getGame(), turnbasedmatch.getGame()) && Objects.equal(((TurnBasedMatch) (obj)).getMatchId(), turnbasedmatch.getMatchId()) && Objects.equal(((TurnBasedMatch) (obj)).getCreatorId(), turnbasedmatch.getCreatorId()) && Objects.equal(Long.valueOf(((TurnBasedMatch) (obj)).getCreationTimestamp()), Long.valueOf(turnbasedmatch.getCreationTimestamp())) && Objects.equal(((TurnBasedMatch) (obj)).getLastUpdaterId(), turnbasedmatch.getLastUpdaterId()) && Objects.equal(Long.valueOf(((TurnBasedMatch) (obj)).getLastUpdatedTimestamp()), Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp())) && Objects.equal(((TurnBasedMatch) (obj)).getPendingParticipantId(), turnbasedmatch.getPendingParticipantId()) && Objects.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getStatus()), Integer.valueOf(turnbasedmatch.getStatus())) && Objects.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getTurnStatus()), Integer.valueOf(turnbasedmatch.getTurnStatus())) && Objects.equal(((TurnBasedMatch) (obj)).getDescription(), turnbasedmatch.getDescription()) && Objects.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getVariant()), Integer.valueOf(turnbasedmatch.getVariant())) && Objects.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getVersion()), Integer.valueOf(turnbasedmatch.getVersion())) && Objects.equal(((TurnBasedMatch) (obj)).getParticipants(), turnbasedmatch.getParticipants()) && Objects.equal(((TurnBasedMatch) (obj)).getRematchId(), turnbasedmatch.getRematchId()) && Objects.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getMatchNumber()), Integer.valueOf(turnbasedmatch.getMatchNumber())) && Objects.equal(((TurnBasedMatch) (obj)).getAutoMatchCriteria(), turnbasedmatch.getAutoMatchCriteria()) && Objects.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getAvailableAutoMatchSlots()), Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots())) && Objects.equal(Boolean.valueOf(((TurnBasedMatch) (obj)).isLocallyModified()), Boolean.valueOf(turnbasedmatch.isLocallyModified())))
            {
                return true;
            }
        }
        return false;
    }

    static Participant getParticipant(TurnBasedMatch turnbasedmatch, String s)
    {
        ArrayList arraylist = turnbasedmatch.getParticipants();
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                return participant;
            }
        }

        throw new IllegalStateException((new StringBuilder("Participant ")).append(s).append(" is not in match ").append(turnbasedmatch.getMatchId()).toString());
    }

    static String getParticipantId(TurnBasedMatch turnbasedmatch, String s)
    {
        Object obj = null;
        ArrayList arraylist = turnbasedmatch.getParticipants();
        int i = 0;
        int j = arraylist.size();
        do
        {
label0:
            {
                turnbasedmatch = obj;
                if (i < j)
                {
                    turnbasedmatch = (Participant)arraylist.get(i);
                    Player player = turnbasedmatch.getPlayer();
                    if (player == null || !player.getPlayerId().equals(s))
                    {
                        break label0;
                    }
                    turnbasedmatch = turnbasedmatch.getParticipantId();
                }
                return turnbasedmatch;
            }
            i++;
        } while (true);
    }

    static int hashCode(TurnBasedMatch turnbasedmatch)
    {
        return Arrays.hashCode(new Object[] {
            turnbasedmatch.getGame(), turnbasedmatch.getMatchId(), turnbasedmatch.getCreatorId(), Long.valueOf(turnbasedmatch.getCreationTimestamp()), turnbasedmatch.getLastUpdaterId(), Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp()), turnbasedmatch.getPendingParticipantId(), Integer.valueOf(turnbasedmatch.getStatus()), Integer.valueOf(turnbasedmatch.getTurnStatus()), turnbasedmatch.getDescription(), 
            Integer.valueOf(turnbasedmatch.getVariant()), Integer.valueOf(turnbasedmatch.getVersion()), turnbasedmatch.getParticipants(), turnbasedmatch.getRematchId(), Integer.valueOf(turnbasedmatch.getMatchNumber()), turnbasedmatch.getAutoMatchCriteria(), Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots()), Boolean.valueOf(turnbasedmatch.isLocallyModified())
        });
    }

    static String toString(TurnBasedMatch turnbasedmatch)
    {
        return Objects.toStringHelper(turnbasedmatch).add("Game", turnbasedmatch.getGame()).add("MatchId", turnbasedmatch.getMatchId()).add("CreatorId", turnbasedmatch.getCreatorId()).add("CreationTimestamp", Long.valueOf(turnbasedmatch.getCreationTimestamp())).add("LastUpdaterId", turnbasedmatch.getLastUpdaterId()).add("LastUpdatedTimestamp", Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp())).add("PendingParticipantId", turnbasedmatch.getPendingParticipantId()).add("MatchStatus", Integer.valueOf(turnbasedmatch.getStatus())).add("TurnStatus", Integer.valueOf(turnbasedmatch.getTurnStatus())).add("Description", turnbasedmatch.getDescription()).add("Variant", Integer.valueOf(turnbasedmatch.getVariant())).add("Data", turnbasedmatch.getData()).add("Version", Integer.valueOf(turnbasedmatch.getVersion())).add("Participants", turnbasedmatch.getParticipants()).add("RematchId", turnbasedmatch.getRematchId()).add("PreviousData", turnbasedmatch.getPreviousMatchData()).add("MatchNumber", Integer.valueOf(turnbasedmatch.getMatchNumber())).add("AutoMatchCriteria", turnbasedmatch.getAutoMatchCriteria()).add("AvailableAutoMatchSlots", Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots())).add("LocallyModified", Boolean.valueOf(turnbasedmatch.isLocallyModified())).add("DescriptionParticipantId", turnbasedmatch.getDescriptionParticipantId()).toString();
    }

    public final boolean canRematch()
    {
        return mMatchStatus == 2 && mRematchId == null;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((TurnBasedMatch) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final Bundle getAutoMatchCriteria()
    {
        return mAutoMatchCriteria;
    }

    public final int getAvailableAutoMatchSlots()
    {
        if (mAutoMatchCriteria == null)
        {
            return 0;
        } else
        {
            return mAutoMatchCriteria.getInt("max_automatch_players");
        }
    }

    public final long getCreationTimestamp()
    {
        return mCreationTimestamp;
    }

    public final String getCreatorId()
    {
        return mCreatorId;
    }

    public final byte[] getData()
    {
        return mData;
    }

    public final String getDescription()
    {
        return mDescription;
    }

    public final Participant getDescriptionParticipant()
    {
        String s = mDescriptionParticipantId;
        if (s == null)
        {
            return null;
        } else
        {
            return getParticipant(this, s);
        }
    }

    public final String getDescriptionParticipantId()
    {
        return mDescriptionParticipantId;
    }

    public final Game getGame()
    {
        return mGame;
    }

    public final long getLastUpdatedTimestamp()
    {
        return mLastUpdatedTimestamp;
    }

    public final String getLastUpdaterId()
    {
        return mLastUpdaterId;
    }

    public final String getMatchId()
    {
        return mMatchId;
    }

    public final int getMatchNumber()
    {
        return mMatchNumber;
    }

    public final String getParticipantId(String s)
    {
        return getParticipantId(((TurnBasedMatch) (this)), s);
    }

    public final ArrayList getParticipants()
    {
        return new ArrayList(mParticipants);
    }

    public final String getPendingParticipantId()
    {
        return mPendingParticipantId;
    }

    public final byte[] getPreviousMatchData()
    {
        return mPreviousData;
    }

    public final String getRematchId()
    {
        return mRematchId;
    }

    public final int getStatus()
    {
        return mMatchStatus;
    }

    public final int getTurnStatus()
    {
        return mTurnStatus;
    }

    public final int getVariant()
    {
        return mVariant;
    }

    public final int getVersion()
    {
        return mVersion;
    }

    public final int hashCode()
    {
        return hashCode(((TurnBasedMatch) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final boolean isLocallyModified()
    {
        return mIsLocallyModified;
    }

    public final String toString()
    {
        return toString(((TurnBasedMatch) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        TurnBasedMatchEntityCreator.writeToParcel(this, parcel, i);
    }

}
