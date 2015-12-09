// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.quest:
//            Quest, QuestEntityCreator, Milestone, MilestoneEntity

public final class QuestEntity
    implements SafeParcelable, Quest
{

    public static final android.os.Parcelable.Creator CREATOR = new QuestEntityCreator();
    final long mAcceptedTimestamp;
    final Uri mBannerUri;
    final String mBannerUrl;
    final String mDescription;
    final long mEndTimestamp;
    final GameEntity mGame;
    final Uri mIconUri;
    final String mIconUrl;
    final long mLastUpdatedTimestamp;
    private final ArrayList mMilestones;
    final String mName;
    final long mNotifyTimestamp;
    final String mQuestId;
    final long mStartTimestamp;
    final int mState;
    final int mType;
    final int mVersionCode;

    QuestEntity(int i, GameEntity gameentity, String s, long l, Uri uri, String s1, 
            String s2, long l1, long l2, Uri uri1, String s3, 
            String s4, long l3, long l4, int j, int k, 
            ArrayList arraylist)
    {
        mVersionCode = i;
        mGame = gameentity;
        mQuestId = s;
        mAcceptedTimestamp = l;
        mBannerUri = uri;
        mBannerUrl = s1;
        mDescription = s2;
        mEndTimestamp = l1;
        mLastUpdatedTimestamp = l2;
        mIconUri = uri1;
        mIconUrl = s3;
        mName = s4;
        mNotifyTimestamp = l3;
        mStartTimestamp = l4;
        mState = j;
        mType = k;
        mMilestones = arraylist;
    }

    public QuestEntity(Quest quest)
    {
        mVersionCode = 2;
        mGame = new GameEntity(quest.getGame());
        mQuestId = quest.getQuestId();
        mAcceptedTimestamp = quest.getAcceptedTimestamp();
        mDescription = quest.getDescription();
        mBannerUri = quest.getBannerImageUri();
        mBannerUrl = quest.getBannerImageUrl();
        mEndTimestamp = quest.getEndTimestamp();
        mIconUri = quest.getIconImageUri();
        mIconUrl = quest.getIconImageUrl();
        mLastUpdatedTimestamp = quest.getLastUpdatedTimestamp();
        mName = quest.getName();
        mNotifyTimestamp = quest.getNotifyTimestamp();
        mStartTimestamp = quest.getStartTimestamp();
        mState = quest.getState();
        mType = quest.getType();
        quest = quest.getMilestones();
        int j = quest.size();
        mMilestones = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            mMilestones.add((MilestoneEntity)((Milestone)quest.get(i)).freeze());
        }

    }

    static boolean equals(Quest quest, Object obj)
    {
        if (obj instanceof Quest)
        {
            if (quest == obj)
            {
                return true;
            }
            obj = (Quest)obj;
            if (Objects.equal(((Quest) (obj)).getGame(), quest.getGame()) && Objects.equal(((Quest) (obj)).getQuestId(), quest.getQuestId()) && Objects.equal(Long.valueOf(((Quest) (obj)).getAcceptedTimestamp()), Long.valueOf(quest.getAcceptedTimestamp())) && Objects.equal(((Quest) (obj)).getBannerImageUri(), quest.getBannerImageUri()) && Objects.equal(((Quest) (obj)).getDescription(), quest.getDescription()) && Objects.equal(Long.valueOf(((Quest) (obj)).getEndTimestamp()), Long.valueOf(quest.getEndTimestamp())) && Objects.equal(((Quest) (obj)).getIconImageUri(), quest.getIconImageUri()) && Objects.equal(Long.valueOf(((Quest) (obj)).getLastUpdatedTimestamp()), Long.valueOf(quest.getLastUpdatedTimestamp())) && Objects.equal(((Quest) (obj)).getMilestones(), quest.getMilestones()) && Objects.equal(((Quest) (obj)).getName(), quest.getName()) && Objects.equal(Long.valueOf(((Quest) (obj)).getNotifyTimestamp()), Long.valueOf(quest.getNotifyTimestamp())) && Objects.equal(Long.valueOf(((Quest) (obj)).getStartTimestamp()), Long.valueOf(quest.getStartTimestamp())) && Objects.equal(Integer.valueOf(((Quest) (obj)).getState()), Integer.valueOf(quest.getState())))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(Quest quest)
    {
        return Arrays.hashCode(new Object[] {
            quest.getGame(), quest.getQuestId(), Long.valueOf(quest.getAcceptedTimestamp()), quest.getBannerImageUri(), quest.getDescription(), Long.valueOf(quest.getEndTimestamp()), quest.getIconImageUri(), Long.valueOf(quest.getLastUpdatedTimestamp()), quest.getMilestones(), quest.getName(), 
            Long.valueOf(quest.getNotifyTimestamp()), Long.valueOf(quest.getStartTimestamp()), Integer.valueOf(quest.getState())
        });
    }

    static String toString(Quest quest)
    {
        return Objects.toStringHelper(quest).add("Game", quest.getGame()).add("QuestId", quest.getQuestId()).add("AcceptedTimestamp", Long.valueOf(quest.getAcceptedTimestamp())).add("BannerImageUri", quest.getBannerImageUri()).add("BannerImageUrl", quest.getBannerImageUrl()).add("Description", quest.getDescription()).add("EndTimestamp", Long.valueOf(quest.getEndTimestamp())).add("IconImageUri", quest.getIconImageUri()).add("IconImageUrl", quest.getIconImageUrl()).add("LastUpdatedTimestamp", Long.valueOf(quest.getLastUpdatedTimestamp())).add("Milestones", quest.getMilestones()).add("Name", quest.getName()).add("NotifyTimestamp", Long.valueOf(quest.getNotifyTimestamp())).add("StartTimestamp", Long.valueOf(quest.getStartTimestamp())).add("State", Integer.valueOf(quest.getState())).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((Quest) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final long getAcceptedTimestamp()
    {
        return mAcceptedTimestamp;
    }

    public final Uri getBannerImageUri()
    {
        return mBannerUri;
    }

    public final String getBannerImageUrl()
    {
        return mBannerUrl;
    }

    public final Milestone getCurrentMilestone()
    {
        return (Milestone)getMilestones().get(0);
    }

    public final String getDescription()
    {
        return mDescription;
    }

    public final void getDescription(CharArrayBuffer chararraybuffer)
    {
        DataUtils.copyStringToBuffer(mDescription, chararraybuffer);
    }

    public final long getEndTimestamp()
    {
        return mEndTimestamp;
    }

    public final Game getGame()
    {
        return mGame;
    }

    public final Uri getIconImageUri()
    {
        return mIconUri;
    }

    public final String getIconImageUrl()
    {
        return mIconUrl;
    }

    public final long getLastUpdatedTimestamp()
    {
        return mLastUpdatedTimestamp;
    }

    public final List getMilestones()
    {
        return new ArrayList(mMilestones);
    }

    public final String getName()
    {
        return mName;
    }

    public final void getName(CharArrayBuffer chararraybuffer)
    {
        DataUtils.copyStringToBuffer(mName, chararraybuffer);
    }

    public final long getNotifyTimestamp()
    {
        return mNotifyTimestamp;
    }

    public final String getQuestId()
    {
        return mQuestId;
    }

    public final long getStartTimestamp()
    {
        return mStartTimestamp;
    }

    public final int getState()
    {
        return mState;
    }

    public final int getType()
    {
        return mType;
    }

    public final int hashCode()
    {
        return hashCode(((Quest) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((Quest) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        QuestEntityCreator.writeToParcel(this, parcel, i);
    }

}
