// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.text.TextUtils;

public final class PlayerColumnNames
{

    public final String bannerLandscapeUri;
    public final String bannerLandscapeUrl;
    public final String bannerPortraitUri;
    public final String bannerPortraitUrl;
    public final String currentLevel;
    public final String currentLevelMaxXp;
    public final String currentLevelMinXp;
    public final String currentXpTotal;
    public final String externalPlayerId;
    public final String gamerTag;
    public final String hasAllPublicAclsDeprecated;
    public final String hasDebugAccess;
    public final String isInCircles;
    public final String isProfileVisible;
    public final String lastLevelUpTimestamp;
    public final String mostRecentActivityTimestamp;
    public final String mostRecentGameFeaturedUri;
    public final String mostRecentGameHiResUri;
    public final String mostRecentGameIconUri;
    public final String mostRecentGameId;
    public final String mostRecentGameName;
    public final String name;
    public final String nextLevel;
    public final String nextLevelMaxXp;
    public final String playedWithTimestamp;
    public final String profileHiResImageUri;
    public final String profileHiResImageUrl;
    public final String profileIconImageUri;
    public final String profileIconImageUrl;
    public final String profileName;
    public final String retrievedTimestamp;
    public final String title;

    public PlayerColumnNames(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            externalPlayerId = "external_player_id";
            profileName = "profile_name";
            profileIconImageUri = "profile_icon_image_uri";
            profileIconImageUrl = "profile_icon_image_url";
            profileHiResImageUri = "profile_hi_res_image_uri";
            profileHiResImageUrl = "profile_hi_res_image_url";
            retrievedTimestamp = "last_updated";
            isInCircles = "is_in_circles";
            playedWithTimestamp = "played_with_timestamp";
            currentXpTotal = "current_xp_total";
            currentLevel = "current_level";
            currentLevelMinXp = "current_level_min_xp";
            currentLevelMaxXp = "current_level_max_xp";
            nextLevel = "next_level";
            nextLevelMaxXp = "next_level_max_xp";
            lastLevelUpTimestamp = "last_level_up_timestamp";
            title = "player_title";
            hasAllPublicAclsDeprecated = "has_all_public_acls";
            isProfileVisible = "is_profile_visible";
            mostRecentGameId = "most_recent_external_game_id";
            mostRecentGameName = "most_recent_game_name";
            mostRecentActivityTimestamp = "most_recent_activity_timestamp";
            mostRecentGameIconUri = "most_recent_game_icon_uri";
            mostRecentGameHiResUri = "most_recent_game_hi_res_uri";
            mostRecentGameFeaturedUri = "most_recent_game_featured_uri";
            hasDebugAccess = "has_debug_access";
            gamerTag = "gamer_tag";
            name = "real_name";
            bannerLandscapeUri = "banner_image_landscape_uri";
            bannerLandscapeUrl = "banner_image_landscape_url";
            bannerPortraitUri = "banner_image_portrait_uri";
            bannerPortraitUrl = "banner_image_portrait_url";
            return;
        } else
        {
            externalPlayerId = (new StringBuilder()).append(s).append("external_player_id").toString();
            profileName = (new StringBuilder()).append(s).append("profile_name").toString();
            profileIconImageUri = (new StringBuilder()).append(s).append("profile_icon_image_uri").toString();
            profileIconImageUrl = (new StringBuilder()).append(s).append("profile_icon_image_url").toString();
            profileHiResImageUri = (new StringBuilder()).append(s).append("profile_hi_res_image_uri").toString();
            profileHiResImageUrl = (new StringBuilder()).append(s).append("profile_hi_res_image_url").toString();
            retrievedTimestamp = (new StringBuilder()).append(s).append("last_updated").toString();
            isInCircles = (new StringBuilder()).append(s).append("is_in_circles").toString();
            playedWithTimestamp = (new StringBuilder()).append(s).append("played_with_timestamp").toString();
            currentXpTotal = (new StringBuilder()).append(s).append("current_xp_total").toString();
            currentLevel = (new StringBuilder()).append(s).append("current_level").toString();
            currentLevelMinXp = (new StringBuilder()).append(s).append("current_level_min_xp").toString();
            currentLevelMaxXp = (new StringBuilder()).append(s).append("current_level_max_xp").toString();
            nextLevel = (new StringBuilder()).append(s).append("next_level").toString();
            nextLevelMaxXp = (new StringBuilder()).append(s).append("next_level_max_xp").toString();
            lastLevelUpTimestamp = (new StringBuilder()).append(s).append("last_level_up_timestamp").toString();
            title = (new StringBuilder()).append(s).append("player_title").toString();
            hasAllPublicAclsDeprecated = (new StringBuilder()).append(s).append("has_all_public_acls").toString();
            isProfileVisible = (new StringBuilder()).append(s).append("is_profile_visible").toString();
            mostRecentGameId = (new StringBuilder()).append(s).append("most_recent_external_game_id").toString();
            mostRecentGameName = (new StringBuilder()).append(s).append("most_recent_game_name").toString();
            mostRecentActivityTimestamp = (new StringBuilder()).append(s).append("most_recent_activity_timestamp").toString();
            mostRecentGameIconUri = (new StringBuilder()).append(s).append("most_recent_game_icon_uri").toString();
            mostRecentGameHiResUri = (new StringBuilder()).append(s).append("most_recent_game_hi_res_uri").toString();
            mostRecentGameFeaturedUri = (new StringBuilder()).append(s).append("most_recent_game_featured_uri").toString();
            hasDebugAccess = (new StringBuilder()).append(s).append("has_debug_access").toString();
            gamerTag = (new StringBuilder()).append(s).append("gamer_tag").toString();
            name = (new StringBuilder()).append(s).append("real_name").toString();
            bannerLandscapeUri = (new StringBuilder()).append(s).append("banner_image_landscape_uri").toString();
            bannerLandscapeUrl = (new StringBuilder()).append(s).append("banner_image_landscape_url").toString();
            bannerPortraitUri = (new StringBuilder()).append(s).append("banner_image_portrait_uri").toString();
            bannerPortraitUrl = (new StringBuilder()).append(s).append("banner_image_portrait_url").toString();
            return;
        }
    }
}
