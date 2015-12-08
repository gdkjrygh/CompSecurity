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
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.le;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatch, TurnBasedMatchEntityCreator

public final class TurnBasedMatchEntity
    implements SafeParcelable, TurnBasedMatch
{

    public static final TurnBasedMatchEntityCreator CREATOR = new TurnBasedMatchEntityCreator();
    private final int CK;
    private final int Ef;
    private final String UO;
    private final long XH;
    private final String Zb;
    private final GameEntity acs;
    private final long adS;
    private final ArrayList adV;
    private final int adW;
    private final byte aeA[];
    private final String aeB;
    private final byte aeC[];
    private final int aeD;
    private final int aeE;
    private final boolean aeF;
    private final String aeG;
    private final Bundle aem;
    private final String aep;
    private final String aex;
    private final String aey;
    private final int aez;

    TurnBasedMatchEntity(int i, GameEntity gameentity, String s, String s1, long l, String s2, 
            long l1, String s3, int j, int k, int i1, byte abyte0[], 
            ArrayList arraylist, String s4, byte abyte1[], int j1, Bundle bundle, int k1, boolean flag, 
            String s5, String s6)
    {
        CK = i;
        acs = gameentity;
        Zb = s;
        aep = s1;
        adS = l;
        aex = s2;
        XH = l1;
        aey = s3;
        aez = j;
        aeE = k1;
        adW = k;
        Ef = i1;
        aeA = abyte0;
        adV = arraylist;
        aeB = s4;
        aeC = abyte1;
        aeD = j1;
        aem = bundle;
        aeF = flag;
        UO = s5;
        aeG = s6;
    }

    public TurnBasedMatchEntity(TurnBasedMatch turnbasedmatch)
    {
        CK = 2;
        acs = new GameEntity(turnbasedmatch.getGame());
        Zb = turnbasedmatch.getMatchId();
        aep = turnbasedmatch.getCreatorId();
        adS = turnbasedmatch.getCreationTimestamp();
        aex = turnbasedmatch.getLastUpdaterId();
        XH = turnbasedmatch.getLastUpdatedTimestamp();
        aey = turnbasedmatch.getPendingParticipantId();
        aez = turnbasedmatch.getStatus();
        aeE = turnbasedmatch.getTurnStatus();
        adW = turnbasedmatch.getVariant();
        Ef = turnbasedmatch.getVersion();
        aeB = turnbasedmatch.getRematchId();
        aeD = turnbasedmatch.getMatchNumber();
        aem = turnbasedmatch.getAutoMatchCriteria();
        aeF = turnbasedmatch.isLocallyModified();
        UO = turnbasedmatch.getDescription();
        aeG = turnbasedmatch.getDescriptionParticipantId();
        byte abyte0[] = turnbasedmatch.getData();
        int j;
        if (abyte0 == null)
        {
            aeA = null;
        } else
        {
            aeA = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, aeA, 0, abyte0.length);
        }
        abyte0 = turnbasedmatch.getPreviousMatchData();
        if (abyte0 == null)
        {
            aeC = null;
        } else
        {
            aeC = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, aeC, 0, abyte0.length);
        }
        turnbasedmatch = turnbasedmatch.getParticipants();
        j = turnbasedmatch.size();
        adV = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            adV.add((ParticipantEntity)(ParticipantEntity)((Participant)turnbasedmatch.get(i)).freeze());
        }

    }

    static int a(TurnBasedMatch turnbasedmatch)
    {
        return jv.hashCode(new Object[] {
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
        if (!jv.equal(((TurnBasedMatch) (obj)).getGame(), turnbasedmatch.getGame()) || !jv.equal(((TurnBasedMatch) (obj)).getMatchId(), turnbasedmatch.getMatchId()) || !jv.equal(((TurnBasedMatch) (obj)).getCreatorId(), turnbasedmatch.getCreatorId()) || !jv.equal(Long.valueOf(((TurnBasedMatch) (obj)).getCreationTimestamp()), Long.valueOf(turnbasedmatch.getCreationTimestamp())) || !jv.equal(((TurnBasedMatch) (obj)).getLastUpdaterId(), turnbasedmatch.getLastUpdaterId()) || !jv.equal(Long.valueOf(((TurnBasedMatch) (obj)).getLastUpdatedTimestamp()), Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp())) || !jv.equal(((TurnBasedMatch) (obj)).getPendingParticipantId(), turnbasedmatch.getPendingParticipantId()) || !jv.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getStatus()), Integer.valueOf(turnbasedmatch.getStatus())) || !jv.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getTurnStatus()), Integer.valueOf(turnbasedmatch.getTurnStatus())) || !jv.equal(((TurnBasedMatch) (obj)).getDescription(), turnbasedmatch.getDescription()) || !jv.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getVariant()), Integer.valueOf(turnbasedmatch.getVariant())) || !jv.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getVersion()), Integer.valueOf(turnbasedmatch.getVersion())) || !jv.equal(((TurnBasedMatch) (obj)).getParticipants(), turnbasedmatch.getParticipants()) || !jv.equal(((TurnBasedMatch) (obj)).getRematchId(), turnbasedmatch.getRematchId()) || !jv.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getMatchNumber()), Integer.valueOf(turnbasedmatch.getMatchNumber())) || !jv.equal(((TurnBasedMatch) (obj)).getAutoMatchCriteria(), turnbasedmatch.getAutoMatchCriteria()) || !jv.equal(Integer.valueOf(((TurnBasedMatch) (obj)).getAvailableAutoMatchSlots()), Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(Boolean.valueOf(((TurnBasedMatch) (obj)).isLocallyModified()), Boolean.valueOf(turnbasedmatch.isLocallyModified()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(TurnBasedMatch turnbasedmatch)
    {
        return jv.h(turnbasedmatch).a("Game", turnbasedmatch.getGame()).a("MatchId", turnbasedmatch.getMatchId()).a("CreatorId", turnbasedmatch.getCreatorId()).a("CreationTimestamp", Long.valueOf(turnbasedmatch.getCreationTimestamp())).a("LastUpdaterId", turnbasedmatch.getLastUpdaterId()).a("LastUpdatedTimestamp", Long.valueOf(turnbasedmatch.getLastUpdatedTimestamp())).a("PendingParticipantId", turnbasedmatch.getPendingParticipantId()).a("MatchStatus", Integer.valueOf(turnbasedmatch.getStatus())).a("TurnStatus", Integer.valueOf(turnbasedmatch.getTurnStatus())).a("Description", turnbasedmatch.getDescription()).a("Variant", Integer.valueOf(turnbasedmatch.getVariant())).a("Data", turnbasedmatch.getData()).a("Version", Integer.valueOf(turnbasedmatch.getVersion())).a("Participants", turnbasedmatch.getParticipants()).a("RematchId", turnbasedmatch.getRematchId()).a("PreviousData", turnbasedmatch.getPreviousMatchData()).a("MatchNumber", Integer.valueOf(turnbasedmatch.getMatchNumber())).a("AutoMatchCriteria", turnbasedmatch.getAutoMatchCriteria()).a("AvailableAutoMatchSlots", Integer.valueOf(turnbasedmatch.getAvailableAutoMatchSlots())).a("LocallyModified", Boolean.valueOf(turnbasedmatch.isLocallyModified())).a("DescriptionParticipantId", turnbasedmatch.getDescriptionParticipantId()).toString();
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
        return aez == 2 && aeB == null;
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
        return aem;
    }

    public int getAvailableAutoMatchSlots()
    {
        if (aem == null)
        {
            return 0;
        } else
        {
            return aem.getInt("max_automatch_players");
        }
    }

    public long getCreationTimestamp()
    {
        return adS;
    }

    public String getCreatorId()
    {
        return aep;
    }

    public byte[] getData()
    {
        return aeA;
    }

    public String getDescription()
    {
        return UO;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        le.b(UO, chararraybuffer);
    }

    public Participant getDescriptionParticipant()
    {
        String s = getDescriptionParticipantId();
        if (s == null)
        {
            return null;
        } else
        {
            return getParticipant(s);
        }
    }

    public String getDescriptionParticipantId()
    {
        return aeG;
    }

    public Game getGame()
    {
        return acs;
    }

    public long getLastUpdatedTimestamp()
    {
        return XH;
    }

    public String getLastUpdaterId()
    {
        return aex;
    }

    public String getMatchId()
    {
        return Zb;
    }

    public int getMatchNumber()
    {
        return aeD;
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
        return new ArrayList(adV);
    }

    public String getPendingParticipantId()
    {
        return aey;
    }

    public byte[] getPreviousMatchData()
    {
        return aeC;
    }

    public String getRematchId()
    {
        return aeB;
    }

    public int getStatus()
    {
        return aez;
    }

    public int getTurnStatus()
    {
        return aeE;
    }

    public int getVariant()
    {
        return adW;
    }

    public int getVersion()
    {
        return Ef;
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

    public boolean isLocallyModified()
    {
        return aeF;
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
