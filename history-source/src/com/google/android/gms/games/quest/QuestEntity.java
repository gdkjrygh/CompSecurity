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
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.le;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.quest:
//            Quest, QuestEntityCreator, Milestone, MilestoneEntity

public final class QuestEntity
    implements SafeParcelable, Quest
{

    public static final QuestEntityCreator CREATOR = new QuestEntityCreator();
    private final int CK;
    private final int Gt;
    private final String UO;
    private final long XH;
    private final GameEntity acs;
    private final String aeK;
    private final long aeL;
    private final Uri aeM;
    private final String aeN;
    private final long aeO;
    private final Uri aeP;
    private final String aeQ;
    private final long aeR;
    private final long aeS;
    private final ArrayList aeT;
    private final String mName;
    private final int mState;

    QuestEntity(int i, GameEntity gameentity, String s, long l, Uri uri, String s1, 
            String s2, long l1, long l2, Uri uri1, String s3, 
            String s4, long l3, long l4, int j, int k, 
            ArrayList arraylist)
    {
        CK = i;
        acs = gameentity;
        aeK = s;
        aeL = l;
        aeM = uri;
        aeN = s1;
        UO = s2;
        aeO = l1;
        XH = l2;
        aeP = uri1;
        aeQ = s3;
        mName = s4;
        aeR = l3;
        aeS = l4;
        mState = j;
        Gt = k;
        aeT = arraylist;
    }

    public QuestEntity(Quest quest)
    {
        CK = 2;
        acs = new GameEntity(quest.getGame());
        aeK = quest.getQuestId();
        aeL = quest.getAcceptedTimestamp();
        UO = quest.getDescription();
        aeM = quest.getBannerImageUri();
        aeN = quest.getBannerImageUrl();
        aeO = quest.getEndTimestamp();
        aeP = quest.getIconImageUri();
        aeQ = quest.getIconImageUrl();
        XH = quest.getLastUpdatedTimestamp();
        mName = quest.getName();
        aeR = quest.mR();
        aeS = quest.getStartTimestamp();
        mState = quest.getState();
        Gt = quest.getType();
        quest = quest.mQ();
        int j = quest.size();
        aeT = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            aeT.add((MilestoneEntity)(MilestoneEntity)((Milestone)quest.get(i)).freeze());
        }

    }

    static int a(Quest quest)
    {
        return jv.hashCode(new Object[] {
            quest.getGame(), quest.getQuestId(), Long.valueOf(quest.getAcceptedTimestamp()), quest.getBannerImageUri(), quest.getDescription(), Long.valueOf(quest.getEndTimestamp()), quest.getIconImageUri(), Long.valueOf(quest.getLastUpdatedTimestamp()), quest.mQ(), quest.getName(), 
            Long.valueOf(quest.mR()), Long.valueOf(quest.getStartTimestamp()), Integer.valueOf(quest.getState())
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
        if (!jv.equal(((Quest) (obj)).getGame(), quest.getGame()) || !jv.equal(((Quest) (obj)).getQuestId(), quest.getQuestId()) || !jv.equal(Long.valueOf(((Quest) (obj)).getAcceptedTimestamp()), Long.valueOf(quest.getAcceptedTimestamp())) || !jv.equal(((Quest) (obj)).getBannerImageUri(), quest.getBannerImageUri()) || !jv.equal(((Quest) (obj)).getDescription(), quest.getDescription()) || !jv.equal(Long.valueOf(((Quest) (obj)).getEndTimestamp()), Long.valueOf(quest.getEndTimestamp())) || !jv.equal(((Quest) (obj)).getIconImageUri(), quest.getIconImageUri()) || !jv.equal(Long.valueOf(((Quest) (obj)).getLastUpdatedTimestamp()), Long.valueOf(quest.getLastUpdatedTimestamp())) || !jv.equal(((Quest) (obj)).mQ(), quest.mQ()) || !jv.equal(((Quest) (obj)).getName(), quest.getName()) || !jv.equal(Long.valueOf(((Quest) (obj)).mR()), Long.valueOf(quest.mR())) || !jv.equal(Long.valueOf(((Quest) (obj)).getStartTimestamp()), Long.valueOf(quest.getStartTimestamp())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(Integer.valueOf(((Quest) (obj)).getState()), Integer.valueOf(quest.getState()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Quest quest)
    {
        return jv.h(quest).a("Game", quest.getGame()).a("QuestId", quest.getQuestId()).a("AcceptedTimestamp", Long.valueOf(quest.getAcceptedTimestamp())).a("BannerImageUri", quest.getBannerImageUri()).a("BannerImageUrl", quest.getBannerImageUrl()).a("Description", quest.getDescription()).a("EndTimestamp", Long.valueOf(quest.getEndTimestamp())).a("IconImageUri", quest.getIconImageUri()).a("IconImageUrl", quest.getIconImageUrl()).a("LastUpdatedTimestamp", Long.valueOf(quest.getLastUpdatedTimestamp())).a("Milestones", quest.mQ()).a("Name", quest.getName()).a("NotifyTimestamp", Long.valueOf(quest.mR())).a("StartTimestamp", Long.valueOf(quest.getStartTimestamp())).a("State", Integer.valueOf(quest.getState())).toString();
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
        return aeL;
    }

    public Uri getBannerImageUri()
    {
        return aeM;
    }

    public String getBannerImageUrl()
    {
        return aeN;
    }

    public Milestone getCurrentMilestone()
    {
        return (Milestone)mQ().get(0);
    }

    public String getDescription()
    {
        return UO;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        le.b(UO, chararraybuffer);
    }

    public long getEndTimestamp()
    {
        return aeO;
    }

    public Game getGame()
    {
        return acs;
    }

    public Uri getIconImageUri()
    {
        return aeP;
    }

    public String getIconImageUrl()
    {
        return aeQ;
    }

    public long getLastUpdatedTimestamp()
    {
        return XH;
    }

    public String getName()
    {
        return mName;
    }

    public void getName(CharArrayBuffer chararraybuffer)
    {
        le.b(mName, chararraybuffer);
    }

    public String getQuestId()
    {
        return aeK;
    }

    public long getStartTimestamp()
    {
        return aeS;
    }

    public int getState()
    {
        return mState;
    }

    public int getType()
    {
        return Gt;
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

    public boolean isEndingSoon()
    {
        return aeR <= System.currentTimeMillis() + 0x1b7740L;
    }

    public List mQ()
    {
        return new ArrayList(aeT);
    }

    public long mR()
    {
        return aeR;
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
