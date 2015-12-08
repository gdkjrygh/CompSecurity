// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
import com.google.android.gms.internal.je;

// Referenced classes of package com.google.android.gms.games.achievement:
//            Achievement, AchievementEntity

public final class AchievementRef extends d
    implements Achievement
{

    AchievementRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public Achievement freeze()
    {
        return new AchievementEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public String getAchievementId()
    {
        return getString("external_achievement_id");
    }

    public int getCurrentSteps()
    {
        boolean flag = true;
        if (getType() != 1)
        {
            flag = false;
        }
        je.K(flag);
        return getInteger("current_steps");
    }

    public String getDescription()
    {
        return getString("description");
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        a("description", chararraybuffer);
    }

    public String getFormattedCurrentSteps()
    {
        boolean flag = true;
        if (getType() != 1)
        {
            flag = false;
        }
        je.K(flag);
        return getString("formatted_current_steps");
    }

    public void getFormattedCurrentSteps(CharArrayBuffer chararraybuffer)
    {
        boolean flag = true;
        if (getType() != 1)
        {
            flag = false;
        }
        je.K(flag);
        a("formatted_current_steps", chararraybuffer);
    }

    public String getFormattedTotalSteps()
    {
        boolean flag = true;
        if (getType() != 1)
        {
            flag = false;
        }
        je.K(flag);
        return getString("formatted_total_steps");
    }

    public void getFormattedTotalSteps(CharArrayBuffer chararraybuffer)
    {
        boolean flag = true;
        if (getType() != 1)
        {
            flag = false;
        }
        je.K(flag);
        a("formatted_total_steps", chararraybuffer);
    }

    public long getLastUpdatedTimestamp()
    {
        return getLong("last_updated_timestamp");
    }

    public String getName()
    {
        return getString("name");
    }

    public void getName(CharArrayBuffer chararraybuffer)
    {
        a("name", chararraybuffer);
    }

    public Player getPlayer()
    {
        return new PlayerRef(JG, KZ);
    }

    public Uri getRevealedImageUri()
    {
        return aR("revealed_icon_image_uri");
    }

    public String getRevealedImageUrl()
    {
        return getString("revealed_icon_image_url");
    }

    public int getState()
    {
        return getInteger("state");
    }

    public int getTotalSteps()
    {
        boolean flag = true;
        if (getType() != 1)
        {
            flag = false;
        }
        je.K(flag);
        return getInteger("total_steps");
    }

    public int getType()
    {
        return getInteger("type");
    }

    public Uri getUnlockedImageUri()
    {
        return aR("unlocked_icon_image_uri");
    }

    public String getUnlockedImageUrl()
    {
        return getString("unlocked_icon_image_url");
    }

    public long getXpValue()
    {
        if (!aQ("instance_xp_value") || aS("instance_xp_value"))
        {
            return getLong("definition_xp_value");
        } else
        {
            return getLong("instance_xp_value");
        }
    }

    public String toString()
    {
        return AchievementEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((AchievementEntity)freeze()).writeToParcel(parcel, i);
    }
}
