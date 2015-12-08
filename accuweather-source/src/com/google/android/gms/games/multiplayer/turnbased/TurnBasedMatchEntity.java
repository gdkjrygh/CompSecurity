// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.hl;
import com.google.android.gms.internal.il;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatch, TurnBasedMatchEntityCreator

public final class TurnBasedMatchEntity
    implements SafeParcelable, TurnBasedMatch
{

    public static final TurnBasedMatchEntityCreator CREATOR = new TurnBasedMatchEntityCreator();
    private final String Mm;
    private final String Of;
    private final GameEntity Rq;
    private final long SR;
    private final ArrayList SU;
    private final int SV;
    private final int TA;
    private final int TB;
    private final byte TC[];
    private final String TD;
    private final byte TE[];
    private final int TF;
    private final int TG;
    private final boolean TH;
    private final String TI;
    private final Bundle Tl;
    private final String Tp;
    private final String Tx;
    private final long Ty;
    private final String Tz;
    private final int xJ;

    TurnBasedMatchEntity(int i, GameEntity gameentity, String s, String s1, long l, String s2, 
            long l1, String s3, int j, int k, int i1, byte abyte0[], 
            ArrayList arraylist, String s4, byte abyte1[], int j1, Bundle bundle, int k1, boolean flag, 
            String s5, String s6)
    {
        xJ = i;
        Rq = gameentity;
        Of = s;
        Tp = s1;
        SR = l;
        Tx = s2;
        Ty = l1;
        Tz = s3;
        TA = j;
        TG = k1;
        SV = k;
        TB = i1;
        TC = abyte0;
        SU = arraylist;
        TD = s4;
        TE = abyte1;
        TF = j1;
        Tl = bundle;
        TH = flag;
        Mm = s5;
        TI = s6;
    }

    public TurnBasedMatchEntity(TurnBasedMatch turnbasedmatch)
    {
        xJ = 2;
        Rq = new GameEntity(turnbasedmatch.getGame());
        Of = turnbasedmatch.getMatchId();
        Tp = turnbasedmatch.getCreatorId();
        SR = turnbasedmatch.getCreationTimestamp();
        Tx = turnbasedmatch.getLastUpdaterId();
        Ty = turnbasedmatch.getLastUpdatedTimestamp();
        Tz = turnbasedmatch.getPendingParticipantId();
        TA = turnbasedmatch.getStatus();
        TG = turnbasedmatch.getTurnStatus();
        SV = turnbasedmatch.getVariant();
        TB = turnbasedmatch.getVersion();
        TD = turnbasedmatch.getRematchId();
        TF = turnbasedmatch.getMatchNumber();
        Tl = turnbasedmatch.getAutoMatchCriteria();
        TH = turnbasedmatch.isLocallyModified();
        Mm = turnbasedmatch.getDescription();
        TI = turnbasedmatch.getDescriptionParticipantId();
        byte abyte0[] = turnbasedmatch.getData();
        int j;
        if (abyte0 == null)
        {
            TC = null;
        } else
        {
            TC = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, TC, 0, abyte0.length);
        }
        abyte0 = turnbasedmatch.getPreviousMatchData();
        if (abyte0 == null)
        {
            TE = null;
        } else
        {
            TE = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, TE, 0, abyte0.length);
        }
        turnbasedmatch = turnbasedmatch.getParticipants();
        j = turnbasedmatch.size();
        SU = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            SU.add((ParticipantEntity)(ParticipantEntity)((Participant)turnbasedmatch.get(i)).freeze());
        }

    }

    static int a(TurnBasedMatch turnbasedmatch)
    {
        return hl.hashCode(new Object[] {
            turnbasedmatch.getGame(), turnbasedmatch.getMatchId(), turnbasedmatch.getCreatorId(), Long.valueOf(turnbasedmatch.getCreationTimestamp()), turnbasedmatch.getLastUpdaterId(), Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp()), turnbasedmatch.getPendingParticipantId(), Integer.valueOf(turnbasedmatch.getStatus()), Integer.valueOf(turnbasedmatch.getTurnStatus()), turnbasedmatch.getDescription(), 
            Integer.valueOf(turnbasedmatch.getVariant()), Integer.valueOf(turnbasedmatch.getVersion()), turnbasedmatch.getParticipants(), turnbasedmatch.getRematchId(), Integer.valueOf(turnbasedmatch.getMatchNumber()), turnbasedmatch.getAutoMatchCriteria(), Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots()), Boolean.valueOf(turnbasedmatch.isLocallyModified())
        });
    }

    static int a(TurnBasedMatch turnbasedmatch, String s)
    {
        ArrayList arraylist = turnbasedmatch.getParticipants();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                return participant.getStatus();
            }
        }

        throw new IllegalStateException((new StringBuilder()).append("Participant ").append(s).append(" is not in match ").append(turnbasedmatch.getMatchId()).toString());
    }

    static boolean a(TurnBasedMatch turnbasedmatch, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof TurnBasedMatch) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (turnbasedmatch == obj) goto _L4; else goto _L3
_L3:
        obj = (TurnBasedMatch)obj;
        if (!hl.equal(((TurnBasedMatch) (obj)).getGame(), turnbasedmatch.getGame()) || !hl.equal(((TurnBasedMatch) (obj)).getMatchId(), turnbasedmatch.getMatchId()) || !hl.equal(((TurnBasedMatch) (obj)).getCreatorId(), turnbasedmatch.getCreatorId()) || !hl.equal(Long.valueOf(((TurnBasedMatch) (obj)).getCreationTimestamp()), Long.valueOf(turnbasedmatch.getCreationTimestamp())) || !hl.equal(((TurnBasedMatch) (obj)).getLastUpdaterId(), turnbasedmatch.getLastUpdaterId()) || !hl.equal(Long.valueOf(((TurnBasedMatch) (obj)).getLastUpdatedTimestamp()), Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp())) || !hl.equal(((TurnBasedMatch) (obj)).getPendingParticipantId(), turnbasedmatch.getPendingParticipantId()) || !hl.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getStatus()), Integer.valueOf(turnbasedmatch.getStatus())) || !hl.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getTurnStatus()), Integer.valueOf(turnbasedmatch.getTurnStatus())) || !hl.equal(((TurnBasedMatch) (obj)).getDescription(), turnbasedmatch.getDescription()) || !hl.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getVariant()), Integer.valueOf(turnbasedmatch.getVariant())) || !hl.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getVersion()), Integer.valueOf(turnbasedmatch.getVersion())) || !hl.equal(((TurnBasedMatch) (obj)).getParticipants(), turnbasedmatch.getParticipants()) || !hl.equal(((TurnBasedMatch) (obj)).getRematchId(), turnbasedmatch.getRematchId()) || !hl.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getMatchNumber()), Integer.valueOf(turnbasedmatch.getMatchNumber())) || !hl.equal(((TurnBasedMatch) (obj)).getAutoMatchCriteria(), turnbasedmatch.getAutoMatchCriteria()) || !hl.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getAvailableAutoMatchSlots()), Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hl.equal(Boolean.valueOf(((TurnBasedMatch) (obj)).isLocallyModified()), Boolean.valueOf(turnbasedmatch.isLocallyModified()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(TurnBasedMatch turnbasedmatch)
    {
        return hl.e(turnbasedmatch).a("Game", turnbasedmatch.getGame()).a("MatchId", turnbasedmatch.getMatchId()).a("CreatorId", turnbasedmatch.getCreatorId()).a("CreationTimestamp", Long.valueOf(turnbasedmatch.getCreationTimestamp())).a("LastUpdaterId", turnbasedmatch.getLastUpdaterId()).a("LastUpdatedTimestamp", Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp())).a("PendingParticipantId", turnbasedmatch.getPendingParticipantId()).a("MatchStatus", Integer.valueOf(turnbasedmatch.getStatus())).a("TurnStatus", Integer.valueOf(turnbasedmatch.getTurnStatus())).a("Description", turnbasedmatch.getDescription()).a("Variant", Integer.valueOf(turnbasedmatch.getVariant())).a("Data", turnbasedmatch.getData()).a("Version", Integer.valueOf(turnbasedmatch.getVersion())).a("Participants", turnbasedmatch.getParticipants()).a("RematchId", turnbasedmatch.getRematchId()).a("PreviousData", turnbasedmatch.getPreviousMatchData()).a("MatchNumber", Integer.valueOf(turnbasedmatch.getMatchNumber())).a("AutoMatchCriteria", turnbasedmatch.getAutoMatchCriteria()).a("AvailableAutoMatchSlots", Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots())).a("LocallyModified", Boolean.valueOf(turnbasedmatch.isLocallyModified())).a("DescriptionParticipantId", turnbasedmatch.getDescriptionParticipantId()).toString();
    }

    static String b(TurnBasedMatch turnbasedmatch, String s)
    {
        turnbasedmatch = turnbasedmatch.getParticipants();
        int j = turnbasedmatch.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)turnbasedmatch.get(i);
            Player player = participant.getPlayer();
            if (player != null && player.getPlayerId().equals(s))
            {
                return participant.getParticipantId();
            }
        }

        return null;
    }

    static Participant c(TurnBasedMatch turnbasedmatch, String s)
    {
        ArrayList arraylist = turnbasedmatch.getParticipants();
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Participant participant = (Participant)arraylist.get(i);
            if (participant.getParticipantId().equals(s))
            {
                return participant;
            }
        }

        throw new IllegalStateException((new StringBuilder()).append("Participant ").append(s).append(" is not in match ").append(turnbasedmatch.getMatchId()).toString());
    }

    static ArrayList c(TurnBasedMatch turnbasedmatch)
    {
        turnbasedmatch = turnbasedmatch.getParticipants();
        int j = turnbasedmatch.size();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(((Participant)turnbasedmatch.get(i)).getParticipantId());
        }

        return arraylist;
    }

    public boolean canRematch()
    {
        return TA == 2 && TD == null;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public TurnBasedMatch freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public Bundle getAutoMatchCriteria()
    {
        return Tl;
    }

    public int getAvailableAutoMatchSlots()
    {
        if (Tl == null)
        {
            return 0;
        } else
        {
            return Tl.getInt("max_automatch_players");
        }
    }

    public long getCreationTimestamp()
    {
        return SR;
    }

    public String getCreatorId()
    {
        return Tp;
    }

    public byte[] getData()
    {
        return TC;
    }

    public String getDescription()
    {
        return Mm;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        il.b(Mm, chararraybuffer);
    }

    public Participant getDescriptionParticipant()
    {
        return getParticipant(getDescriptionParticipantId());
    }

    public String getDescriptionParticipantId()
    {
        return TI;
    }

    public Game getGame()
    {
        return Rq;
    }

    public long getLastUpdatedTimestamp()
    {
        return Ty;
    }

    public String getLastUpdaterId()
    {
        return Tx;
    }

    public String getMatchId()
    {
        return Of;
    }

    public int getMatchNumber()
    {
        return TF;
    }

    public Participant getParticipant(String s)
    {
        return c(this, s);
    }

    public String getParticipantId(String s)
    {
        return b(this, s);
    }

    public ArrayList getParticipantIds()
    {
        return c(this);
    }

    public int getParticipantStatus(String s)
    {
        return a(this, s);
    }

    public ArrayList getParticipants()
    {
        return new ArrayList(SU);
    }

    public String getPendingParticipantId()
    {
        return Tz;
    }

    public byte[] getPreviousMatchData()
    {
        return TE;
    }

    public String getRematchId()
    {
        return TD;
    }

    public int getStatus()
    {
        return TA;
    }

    public int getTurnStatus()
    {
        return TG;
    }

    public int getVariant()
    {
        return SV;
    }

    public int getVersion()
    {
        return TB;
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

    public boolean isLocallyModified()
    {
        return TH;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        TurnBasedMatchEntityCreator.a(this, parcel, i);
    }

}
