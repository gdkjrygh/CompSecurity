// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.quest:
//            Quest, QuestEntity, Milestone, MilestoneRef

public final class QuestRef extends DataBufferRef
    implements Quest
{

    private final Game mGame;
    private final int mNumChildren;

    QuestRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        mGame = new GameRef(dataholder, i);
        mNumChildren = j;
    }

    private Quest freeze()
    {
        return new QuestEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return QuestEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final long getAcceptedTimestamp()
    {
        return getLong("accepted_ts");
    }

    public final Uri getBannerImageUri()
    {
        return parseUri("quest_banner_image_uri");
    }

    public final String getBannerImageUrl()
    {
        return getString("quest_banner_image_url");
    }

    public final Milestone getCurrentMilestone()
    {
        return (Milestone)getMilestones().get(0);
    }

    public final String getDescription()
    {
        return getString("quest_description");
    }

    public final void getDescription(CharArrayBuffer chararraybuffer)
    {
        copyToBuffer("quest_description", chararraybuffer);
    }

    public final long getEndTimestamp()
    {
        return getLong("quest_end_ts");
    }

    public final Game getGame()
    {
        return mGame;
    }

    public final Uri getIconImageUri()
    {
        return parseUri("quest_icon_image_uri");
    }

    public final String getIconImageUrl()
    {
        return getString("quest_icon_image_url");
    }

    public final long getLastUpdatedTimestamp()
    {
        return getLong("quest_last_updated_ts");
    }

    public final List getMilestones()
    {
        ArrayList arraylist = new ArrayList(mNumChildren);
        for (int i = 0; i < mNumChildren; i++)
        {
            arraylist.add(new MilestoneRef(mDataHolder, mDataRow + i));
        }

        return arraylist;
    }

    public final String getName()
    {
        return getString("quest_name");
    }

    public final void getName(CharArrayBuffer chararraybuffer)
    {
        copyToBuffer("quest_name", chararraybuffer);
    }

    public final long getNotifyTimestamp()
    {
        return getLong("notification_ts");
    }

    public final String getQuestId()
    {
        return getString("external_quest_id");
    }

    public final long getStartTimestamp()
    {
        return getLong("quest_start_ts");
    }

    public final int getState()
    {
        return getInteger("quest_state");
    }

    public final int getType()
    {
        return getInteger("quest_type");
    }

    public final int hashCode()
    {
        return QuestEntity.hashCode(this);
    }

    public final String toString()
    {
        return QuestEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((QuestEntity)freeze()).writeToParcel(parcel, i);
    }
}
