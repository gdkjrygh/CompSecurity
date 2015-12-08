// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games:
//            Game, GameEntity

public final class GameRef extends DataBufferRef
    implements Game
{

    public GameRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    private Game freeze()
    {
        return new GameEntity(this);
    }

    public static ContentValues toContentValues(Game game)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("external_game_id", game.getApplicationId());
        contentvalues.put("display_name", game.getDisplayName());
        contentvalues.put("primary_category", game.getPrimaryCategory());
        contentvalues.put("secondary_category", game.getSecondaryCategory());
        contentvalues.put("game_description", game.getDescription());
        contentvalues.put("developer_name", game.getDeveloperName());
        contentvalues.put("play_enabled_game", Boolean.valueOf(game.isPlayEnabledGame()));
        contentvalues.put("gameplay_acl_status", Integer.valueOf(game.getGameplayAclStatus()));
        contentvalues.put("achievement_total_count", Integer.valueOf(game.getAchievementTotalCount()));
        contentvalues.put("leaderboard_count", Integer.valueOf(game.getLeaderboardCount()));
        contentvalues.put("muted", Boolean.valueOf(game.isMuted()));
        contentvalues.put("identity_sharing_confirmed", Boolean.valueOf(game.isIdentitySharingConfirmed()));
        contentvalues.put("snapshots_enabled", Boolean.valueOf(game.areSnapshotsEnabled()));
        contentvalues.put("theme_color", game.getThemeColor());
        contentvalues.put("installed", Boolean.valueOf(game.isInstanceInstalled()));
        contentvalues.put("package_name", game.getInstancePackageName());
        contentvalues.put("real_time_support", Boolean.valueOf(game.isRealTimeMultiplayerEnabled()));
        contentvalues.put("turn_based_support", Boolean.valueOf(game.isTurnBasedMultiplayerEnabled()));
        contentvalues.put("gamepad_support", Boolean.valueOf(game.hasGamepadSupport()));
        Uri uri = game.getIconImageUri();
        if (uri == null)
        {
            contentvalues.putNull("game_icon_image_uri");
        } else
        {
            contentvalues.put("game_icon_image_uri", uri.toString());
        }
        contentvalues.put("game_icon_image_url", game.getIconImageUrl());
        uri = game.getHiResImageUri();
        if (uri == null)
        {
            contentvalues.putNull("game_hi_res_image_uri");
        } else
        {
            contentvalues.put("game_hi_res_image_uri", uri.toString());
        }
        contentvalues.put("game_hi_res_image_url", game.getHiResImageUrl());
        uri = game.getFeaturedImageUri();
        if (uri == null)
        {
            contentvalues.putNull("featured_image_uri");
        } else
        {
            contentvalues.put("featured_image_uri", uri.toString());
        }
        contentvalues.put("featured_image_url", game.getFeaturedImageUrl());
        return contentvalues;
    }

    public final boolean areSnapshotsEnabled()
    {
        return getInteger("snapshots_enabled") > 0;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return GameEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final int getAchievementTotalCount()
    {
        return getInteger("achievement_total_count");
    }

    public final String getApplicationId()
    {
        return getString("external_game_id");
    }

    public final String getDescription()
    {
        return getString("game_description");
    }

    public final String getDeveloperName()
    {
        return getString("developer_name");
    }

    public final void getDeveloperName(CharArrayBuffer chararraybuffer)
    {
        copyToBuffer("developer_name", chararraybuffer);
    }

    public final String getDisplayName()
    {
        return getString("display_name");
    }

    public final void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        copyToBuffer("display_name", chararraybuffer);
    }

    public final Uri getFeaturedImageUri()
    {
        return parseUri("featured_image_uri");
    }

    public final String getFeaturedImageUrl()
    {
        return getString("featured_image_url");
    }

    public final int getGameplayAclStatus()
    {
        return getInteger("gameplay_acl_status");
    }

    public final Uri getHiResImageUri()
    {
        return parseUri("game_hi_res_image_uri");
    }

    public final String getHiResImageUrl()
    {
        return getString("game_hi_res_image_url");
    }

    public final Uri getIconImageUri()
    {
        return parseUri("game_icon_image_uri");
    }

    public final String getIconImageUrl()
    {
        return getString("game_icon_image_url");
    }

    public final String getInstancePackageName()
    {
        return getString("package_name");
    }

    public final int getLeaderboardCount()
    {
        return getInteger("leaderboard_count");
    }

    public final String getPrimaryCategory()
    {
        return getString("primary_category");
    }

    public final String getSecondaryCategory()
    {
        return getString("secondary_category");
    }

    public final String getThemeColor()
    {
        return getString("theme_color");
    }

    public final boolean hasGamepadSupport()
    {
        return getInteger("gamepad_support") > 0;
    }

    public final int hashCode()
    {
        return GameEntity.hashCode(this);
    }

    public final boolean isIdentitySharingConfirmed()
    {
        return getBoolean("identity_sharing_confirmed");
    }

    public final boolean isInstanceInstalled()
    {
        return getInteger("installed") > 0;
    }

    public final boolean isMuted()
    {
        return getBoolean("muted");
    }

    public final boolean isPlayEnabledGame()
    {
        return getBoolean("play_enabled_game");
    }

    public final boolean isRealTimeMultiplayerEnabled()
    {
        return getInteger("real_time_support") > 0;
    }

    public final boolean isTurnBasedMultiplayerEnabled()
    {
        return getInteger("turn_based_support") > 0;
    }

    public final String toString()
    {
        return GameEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((GameEntity)freeze()).writeToParcel(parcel, i);
    }
}
