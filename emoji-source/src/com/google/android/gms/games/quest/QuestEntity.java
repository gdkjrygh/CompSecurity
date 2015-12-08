// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.ik;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.quest:
//            Quest, QuestEntityCreator, Milestone, MilestoneEntity

public final class QuestEntity
    implements SafeParcelable, Quest
{

    public static final QuestEntityCreator CREATOR = new QuestEntityCreator();
    private final int AT;
    private final String Mp;
    private final GameEntity Rt;
    private final long TB;
    private final String TP;
    private final long TQ;
    private final Uri TR;
    private final String TS;
    private final long TT;
    private final Uri TU;
    private final String TV;
    private final long TW;
    private final long TX;
    private final ArrayList TY;
    private final String mName;
    private final int mState;
    private final int xM;

    QuestEntity(int i, GameEntity gameentity, String s, long l, Uri uri, String s1, 
            String s2, long l1, long l2, Uri uri1, String s3, 
            String s4, long l3, long l4, int j, int k, 
            ArrayList arraylist)
    {
        xM = i;
        Rt = gameentity;
        TP = s;
        TQ = l;
        TR = uri;
        TS = s1;
        Mp = s2;
        TT = l1;
        TB = l2;
        TU = uri1;
        TV = s3;
        mName = s4;
        TW = l3;
        TX = l4;
        mState = j;
        AT = k;
        TY = arraylist;
    }

    public QuestEntity(Quest quest)
    {
        xM = 2;
        Rt = new GameEntity(quest.getGame());
        TP = quest.getQuestId();
        TQ = quest.getAcceptedTimestamp();
        Mp = quest.getDescription();
        TR = quest.getBannerImageUri();
        TS = quest.getBannerImageUrl();
        TT = quest.getEndTimestamp();
        TU = quest.getIconImageUri();
        TV = quest.getIconImageUrl();
        TB = quest.getLastUpdatedTimestamp();
        mName = quest.getName();
        TW = quest.iK();
        TX = quest.getStartTimestamp();
        mState = quest.getState();
        AT = quest.getType();
        quest = quest.iJ();
        int j = quest.size();
        TY = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            TY.add((MilestoneEntity)(MilestoneEntity)((Milestone)quest.get(i)).freeze());
        }

    }

    static int a(Quest quest)
    {
        return hk.hashCode(new Object[] {
            quest.getGame(), quest.getQuestId(), Long.valueOf(quest.getAcceptedTimestamp()), quest.getBannerImageUri(), quest.getDescription(), Long.valueOf(quest.getEndTimestamp()), quest.getIconImageUri(), Long.valueOf(quest.getLastUpdatedTimestamp()), quest.iJ(), quest.getName(), 
            Long.valueOf(quest.iK()), Long.valueOf(quest.getStartTimestamp()), Integer.valueOf(quest.getState())
        });
    }

    static boolean a(Quest quest, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Quest) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (quest == obj) goto _L4; else goto _L3
_L3:
        obj = (Quest)obj;
        if (!hk.equal(((Quest) (obj)).getGame(), quest.getGame()) || !hk.equal(((Quest) (obj)).getQuestId(), quest.getQuestId()) || !hk.equal(Long.valueOf(((Quest) (obj)).getAcceptedTimestamp()), Long.valueOf(quest.getAcceptedTimestamp())) || !hk.equal(((Quest) (obj)).getBannerImageUri(), quest.getBannerImageUri()) || !hk.equal(((Quest) (obj)).getDescription(), quest.getDescription()) || !hk.equal(Long.valueOf(((Quest) (obj)).getEndTimestamp()), Long.valueOf(quest.getEndTimestamp())) || !hk.equal(((Quest) (obj)).getIconImageUri(), quest.getIconImageUri()) || !hk.equal(Long.valueOf(((Quest) (obj)).getLastUpdatedTimestamp()), Long.valueOf(quest.getLastUpdatedTimestamp())) || !hk.equal(((Quest) (obj)).iJ(), quest.iJ()) || !hk.equal(((Quest) (obj)).getName(), quest.getName()) || !hk.equal(Long.valueOf(((Quest) (obj)).iK()), Long.valueOf(quest.iK())) || !hk.equal(Long.valueOf(((Quest) (obj)).getStartTimestamp()), Long.valueOf(quest.getStartTimestamp())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(Integer.valueOf(((Quest) (obj)).getState()), Integer.valueOf(quest.getState()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Quest quest)
    {
        return hk.e(quest).a("Game", quest.getGame()).a("QuestId", quest.getQuestId()).a("AcceptedTimestamp", Long.valueOf(quest.getAcceptedTimestamp())).a("BannerImageUri", quest.getBannerImageUri()).a("BannerImageUrl", quest.getBannerImageUrl()).a("Description", quest.getDescription()).a("EndTimestamp", Long.valueOf(quest.getEndTimestamp())).a("IconImageUri", quest.getIconImageUri()).a("IconImageUrl", quest.getIconImageUrl()).a("LastUpdatedTimestamp", Long.valueOf(quest.getLastUpdatedTimestamp())).a("Milestones", quest.iJ()).a("Name", quest.getName()).a("NotifyTimestamp", Long.valueOf(quest.iK())).a("StartTimestamp", Long.valueOf(quest.getStartTimestamp())).a("State", Integer.valueOf(quest.getState())).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Quest freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public long getAcceptedTimestamp()
    {
        return TQ;
    }

    public Uri getBannerImageUri()
    {
        return TR;
    }

    public String getBannerImageUrl()
    {
        return TS;
    }

    public Milestone getCurrentMilestone()
    {
        return (Milestone)iJ().get(0);
    }

    public String getDescription()
    {
        return Mp;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        ik.b(Mp, chararraybuffer);
    }

    public long getEndTimestamp()
    {
        return TT;
    }

    public Game getGame()
    {
        return Rt;
    }

    public Uri getIconImageUri()
    {
        return TU;
    }

    public String getIconImageUrl()
    {
        return TV;
    }

    public long getLastUpdatedTimestamp()
    {
        return TB;
    }

    public String getName()
    {
        return mName;
    }

    public void getName(CharArrayBuffer chararraybuffer)
    {
        ik.b(mName, chararraybuffer);
    }

    public String getQuestId()
    {
        return TP;
    }

    public long getStartTimestamp()
    {
        return TX;
    }

    public int getState()
    {
        return mState;
    }

    public int getType()
    {
        return AT;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public int hashCode()
    {
        return a(this);
    }

    public List iJ()
    {
        return new ArrayList(TY);
    }

    public long iK()
    {
        return TW;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public boolean isEndingSoon()
    {
        return TW <= System.currentTimeMillis() + 0x1b7740L;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        QuestEntityCreator.a(this, parcel, i);
    }

}
