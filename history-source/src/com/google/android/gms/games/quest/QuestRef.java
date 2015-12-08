// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.quest:
//            Quest, QuestEntity, Milestone, MilestoneRef

public final class QuestRef extends d
    implements Quest
{

    private final int Ya;
    private final Game adq;

    QuestRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        adq = new GameRef(dataholder, i);
        Ya = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return QuestEntity.a(this, obj);
    }

    public Quest freeze()
    {
        return new QuestEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public long getAcceptedTimestamp()
    {
        return getLong("accepted_ts");
    }

    public Uri getBannerImageUri()
    {
        return aR("quest_banner_image_uri");
    }

    public String getBannerImageUrl()
    {
        return getString("quest_banner_image_url");
    }

    public Milestone getCurrentMilestone()
    {
        return (Milestone)mQ().get(0);
    }

    public String getDescription()
    {
        return getString("quest_description");
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        a("quest_description", chararraybuffer);
    }

    public long getEndTimestamp()
    {
        return getLong("quest_end_ts");
    }

    public Game getGame()
    {
        return adq;
    }

    public Uri getIconImageUri()
    {
        return aR("quest_icon_image_uri");
    }

    public String getIconImageUrl()
    {
        return getString("quest_icon_image_url");
    }

    public long getLastUpdatedTimestamp()
    {
        return getLong("quest_last_updated_ts");
    }

    public String getName()
    {
        return getString("quest_name");
    }

    public void getName(CharArrayBuffer chararraybuffer)
    {
        a("quest_name", chararraybuffer);
    }

    public String getQuestId()
    {
        return getString("external_quest_id");
    }

    public long getStartTimestamp()
    {
        return getLong("quest_start_ts");
    }

    public int getState()
    {
        return getInteger("quest_state");
    }

    public int getType()
    {
        return getInteger("quest_type");
    }

    public int hashCode()
    {
        return QuestEntity.a(this);
    }

    public boolean isEndingSoon()
    {
        return mR() <= System.currentTimeMillis() + 0x1b7740L;
    }

    public List mQ()
    {
        ArrayList arraylist = new ArrayList(Ya);
        for (int i = 0; i < Ya; i++)
        {
            arraylist.add(new MilestoneRef(JG, KZ + i));
        }

        return arraylist;
    }

    public long mR()
    {
        return getLong("notification_ts");
    }

    public String toString()
    {
        return QuestEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((QuestEntity)freeze()).writeToParcel(parcel, i);
    }
}
