// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.achievement:
//            Achievement, AchievementEntity

public final class AchievementRef extends DataBufferRef
    implements Achievement
{

    AchievementRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    private Achievement freeze()
    {
        return new AchievementEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final String getAchievementId()
    {
        return getString("external_achievement_id");
    }

    public final int getCurrentSteps()
    {
        boolean flag = true;
        if (getInteger("type") != 1)
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return getInteger("current_steps");
    }

    public final String getDescription()
    {
        return getString("description");
    }

    public final void getDescription(CharArrayBuffer chararraybuffer)
    {
        copyToBuffer("description", chararraybuffer);
    }

    public final String getFormattedCurrentSteps()
    {
        boolean flag = true;
        if (getInteger("type") != 1)
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return getString("formatted_current_steps");
    }

    public final String getFormattedTotalSteps()
    {
        boolean flag = true;
        if (getInteger("type") != 1)
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return getString("formatted_total_steps");
    }

    public final long getLastUpdatedTimestamp()
    {
        return getLong("last_updated_timestamp");
    }

    public final String getName()
    {
        return getString("name");
    }

    public final void getName(CharArrayBuffer chararraybuffer)
    {
        copyToBuffer("name", chararraybuffer);
    }

    public final Player getPlayer()
    {
        return new PlayerRef(mDataHolder, mDataRow);
    }

    public final Uri getRevealedImageUri()
    {
        return parseUri("revealed_icon_image_uri");
    }

    public final String getRevealedImageUrl()
    {
        return getString("revealed_icon_image_url");
    }

    public final int getState()
    {
        return getInteger("state");
    }

    public final int getTotalSteps()
    {
        boolean flag = true;
        if (getInteger("type") != 1)
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return getInteger("total_steps");
    }

    public final int getType()
    {
        return getInteger("type");
    }

    public final Uri getUnlockedImageUri()
    {
        return parseUri("unlocked_icon_image_uri");
    }

    public final String getUnlockedImageUrl()
    {
        return getString("unlocked_icon_image_url");
    }

    public final long getXpValue()
    {
        if (!hasColumn("instance_xp_value") || hasNull("instance_xp_value"))
        {
            return getLong("definition_xp_value");
        } else
        {
            return getLong("instance_xp_value");
        }
    }

    public final String toString()
    {
        return AchievementEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((AchievementEntity)freeze()).writeToParcel(parcel, i);
    }
}
