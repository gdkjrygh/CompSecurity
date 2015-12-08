// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.jv;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.quest:
//            Quest, QuestEntityCreator, Milestone, MilestoneEntity

public final class QuestEntity
    implements SafeParcelable, Quest
{

    public static final QuestEntityCreator CREATOR = new QuestEntityCreator();
    private final int BR;
    private final int FD;
    private final String Tr;
    private final long Wk;
    private final GameEntity aay;
    private final String acR;
    private final long acS;
    private final Uri acT;
    private final String acU;
    private final long acV;
    private final Uri acW;
    private final String acX;
    private final long acY;
    private final long acZ;
    private final ArrayList ada;
    private final String mName;
    private final int mState;

    QuestEntity(int i, GameEntity gameentity, String s, long l, Uri uri, String s1, 
            String s2, long l1, long l2, Uri uri1, String s3, 
            String s4, long l3, long l4, int j, int k, 
            ArrayList arraylist)
    {
        BR = i;
        aay = gameentity;
        acR = s;
        acS = l;
        acT = uri;
        acU = s1;
        Tr = s2;
        acV = l1;
        Wk = l2;
        acW = uri1;
        acX = s3;
        mName = s4;
        acY = l3;
        acZ = l4;
        mState = j;
        FD = k;
        ada = arraylist;
    }

    public QuestEntity(Quest quest)
    {
        BR = 2;
        aay = new GameEntity(quest.getGame());
        acR = quest.getQuestId();
        acS = quest.getAcceptedTimestamp();
        Tr = quest.getDescription();
        acT = quest.getBannerImageUri();
        acU = quest.getBannerImageUrl();
        acV = quest.getEndTimestamp();
        acW = quest.getIconImageUri();
        acX = quest.getIconImageUrl();
        Wk = quest.getLastUpdatedTimestamp();
        mName = quest.getName();
        acY = quest.lK();
        acZ = quest.getStartTimestamp();
        mState = quest.getState();
        FD = quest.getType();
        quest = quest.lJ();
        int j = quest.size();
        ada = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            ada.add((MilestoneEntity)(MilestoneEntity)((Milestone)quest.get(i)).freeze());
        }

    }

    static int a(Quest quest)
    {
        return n.hashCode(new Object[] {
            quest.getGame(), quest.getQuestId(), Long.valueOf(quest.getAcceptedTimestamp()), quest.getBannerImageUri(), quest.getDescription(), Long.valueOf(quest.getEndTimestamp()), quest.getIconImageUri(), Long.valueOf(quest.getLastUpdatedTimestamp()), quest.lJ(), quest.getName(), 
            Long.valueOf(quest.lK()), Long.valueOf(quest.getStartTimestamp()), Integer.valueOf(quest.getState())
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
        if (!n.equal(((Quest) (obj)).getGame(), quest.getGame()) || !n.equal(((Quest) (obj)).getQuestId(), quest.getQuestId()) || !n.equal(Long.valueOf(((Quest) (obj)).getAcceptedTimestamp()), Long.valueOf(quest.getAcceptedTimestamp())) || !n.equal(((Quest) (obj)).getBannerImageUri(), quest.getBannerImageUri()) || !n.equal(((Quest) (obj)).getDescription(), quest.getDescription()) || !n.equal(Long.valueOf(((Quest) (obj)).getEndTimestamp()), Long.valueOf(quest.getEndTimestamp())) || !n.equal(((Quest) (obj)).getIconImageUri(), quest.getIconImageUri()) || !n.equal(Long.valueOf(((Quest) (obj)).getLastUpdatedTimestamp()), Long.valueOf(quest.getLastUpdatedTimestamp())) || !n.equal(((Quest) (obj)).lJ(), quest.lJ()) || !n.equal(((Quest) (obj)).getName(), quest.getName()) || !n.equal(Long.valueOf(((Quest) (obj)).lK()), Long.valueOf(quest.lK())) || !n.equal(Long.valueOf(((Quest) (obj)).getStartTimestamp()), Long.valueOf(quest.getStartTimestamp())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(Integer.valueOf(((Quest) (obj)).getState()), Integer.valueOf(quest.getState()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Quest quest)
    {
        return n.h(quest).a("Game", quest.getGame()).a("QuestId", quest.getQuestId()).a("AcceptedTimestamp", Long.valueOf(quest.getAcceptedTimestamp())).a("BannerImageUri", quest.getBannerImageUri()).a("BannerImageUrl", quest.getBannerImageUrl()).a("Description", quest.getDescription()).a("EndTimestamp", Long.valueOf(quest.getEndTimestamp())).a("IconImageUri", quest.getIconImageUri()).a("IconImageUrl", quest.getIconImageUrl()).a("LastUpdatedTimestamp", Long.valueOf(quest.getLastUpdatedTimestamp())).a("Milestones", quest.lJ()).a("Name", quest.getName()).a("NotifyTimestamp", Long.valueOf(quest.lK())).a("StartTimestamp", Long.valueOf(quest.getStartTimestamp())).a("State", Integer.valueOf(quest.getState())).toString();
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
        return acS;
    }

    public Uri getBannerImageUri()
    {
        return acT;
    }

    public String getBannerImageUrl()
    {
        return acU;
    }

    public Milestone getCurrentMilestone()
    {
        return (Milestone)lJ().get(0);
    }

    public String getDescription()
    {
        return Tr;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        jv.b(Tr, chararraybuffer);
    }

    public long getEndTimestamp()
    {
        return acV;
    }

    public Game getGame()
    {
        return aay;
    }

    public Uri getIconImageUri()
    {
        return acW;
    }

    public String getIconImageUrl()
    {
        return acX;
    }

    public long getLastUpdatedTimestamp()
    {
        return Wk;
    }

    public String getName()
    {
        return mName;
    }

    public void getName(CharArrayBuffer chararraybuffer)
    {
        jv.b(mName, chararraybuffer);
    }

    public String getQuestId()
    {
        return acR;
    }

    public long getStartTimestamp()
    {
        return acZ;
    }

    public int getState()
    {
        return mState;
    }

    public int getType()
    {
        return FD;
    }

    public int getVersionCode()
    {
        return BR;
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
        return acY <= System.currentTimeMillis() + 0x1b7740L;
    }

    public List lJ()
    {
        return new ArrayList(ada);
    }

    public long lK()
    {
        return acY;
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
