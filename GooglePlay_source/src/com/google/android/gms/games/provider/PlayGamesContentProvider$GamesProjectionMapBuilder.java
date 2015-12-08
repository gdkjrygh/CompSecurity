// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.net.Uri;

// Referenced classes of package com.google.android.gms.games.provider:
//            PlayGamesContentProvider

private static final class mUri extends com.android.common.content.MapBuilder
{

    private final Uri mUri;

    public final volatile com.android.common.content.MapBuilder add(String s)
    {
        return add(s);
    }

    public final volatile com.android.common.content.MapBuilder add(String s, String s1)
    {
        return add(s, s1);
    }

    public final add add(String s)
    {
        return (add)super.MapBuilder(s);
    }

    public final add add(String s, String s1)
    {
        return (add)super.MapBuilder(s, s1);
    }

    public final add addAchievementDefinitionColumns()
    {
        addAll(LUMNS);
        add("unlocked_icon_image_uri", PlayGamesContentProvider.access$000(mUri, "unlocked_icon_image_id"));
        add("unlocked_icon_image_url", PlayGamesContentProvider.access$100("achievement_definitions", "unlocked_icon_image_id"));
        add("revealed_icon_image_uri", PlayGamesContentProvider.access$000(mUri, "revealed_icon_image_id"));
        add("revealed_icon_image_url", PlayGamesContentProvider.access$100("achievement_definitions", "revealed_icon_image_id"));
        return this;
    }

    public final volatile com.android.common.content.MapBuilder addAll(String as[])
    {
        return addAll(as);
    }

    public final addAll addAll(String as[])
    {
        return (addAll)super.MapBuilder(as);
    }

    public final addAll addEventDefinitionColumns()
    {
        addAll(addAll);
        add("icon_image_uri", PlayGamesContentProvider.access$000(mUri, "icon_image_id"));
        add("icon_image_url", PlayGamesContentProvider.access$100("event_definitions", "icon_image_id"));
        return this;
    }

    public final add addGameBadgesColumns()
    {
        addAll(addAll);
        add("badge_icon_image_uri", PlayGamesContentProvider.access$000(mUri, "badge_icon_image_id"));
        return this;
    }

    public final mUri addGamesColumns()
    {
        addAll(addAll);
        add("game_icon_image_uri", PlayGamesContentProvider.access$000(mUri, "game_icon_image_id"));
        add("game_icon_image_url", PlayGamesContentProvider.access$100("games", "game_icon_image_id"));
        add("game_hi_res_image_uri", PlayGamesContentProvider.access$000(mUri, "game_hi_res_image_id"));
        add("game_hi_res_image_url", PlayGamesContentProvider.access$100("games", "game_hi_res_image_id"));
        add("featured_image_uri", PlayGamesContentProvider.access$000(mUri, "featured_image_id"));
        add("featured_image_url", PlayGamesContentProvider.access$100("games", "featured_image_id"));
        add("screenshot_image_uris", PlayGamesContentProvider.access$000(mUri, "screenshot_image_ids"));
        return this;
    }

    public final mUri addLeaderboardsColumns()
    {
        addAll(addAll);
        add("board_icon_image_uri", PlayGamesContentProvider.access$000(mUri, "board_icon_image_id"));
        add("board_icon_image_url", PlayGamesContentProvider.access$100("leaderboards", "board_icon_image_id"));
        return this;
    }

    public final add addPlayersColumns()
    {
        addAll(addAll);
        add("profile_icon_image_uri", PlayGamesContentProvider.access$000(mUri, "profile_icon_image_id"));
        add("profile_icon_image_url", PlayGamesContentProvider.access$100("players", "profile_icon_image_id"));
        add("profile_hi_res_image_uri", PlayGamesContentProvider.access$000(mUri, "profile_hi_res_image_id"));
        add("profile_hi_res_image_url", PlayGamesContentProvider.access$100("players", "profile_hi_res_image_id"));
        add("most_recent_game_icon_uri", PlayGamesContentProvider.access$000(mUri, "most_recent_game_icon_id"));
        add("most_recent_game_hi_res_uri", PlayGamesContentProvider.access$000(mUri, "most_recent_game_hi_res_id"));
        add("most_recent_game_featured_uri", PlayGamesContentProvider.access$000(mUri, "most_recent_game_featured_id"));
        add("banner_image_landscape_uri", PlayGamesContentProvider.access$000(mUri, "banner_image_landscape_id"));
        add("banner_image_landscape_url", PlayGamesContentProvider.access$100("players", "banner_image_landscape_id"));
        add("banner_image_portrait_uri", PlayGamesContentProvider.access$000(mUri, "banner_image_portrait_id"));
        add("banner_image_portrait_url", PlayGamesContentProvider.access$100("players", "banner_image_portrait_id"));
        return this;
    }

    public final add addQuestsColumns()
    {
        addAll(addAll);
        add("quest_icon_image_uri", PlayGamesContentProvider.access$000(mUri, "quest_icon_image_id"));
        add("quest_icon_image_url", PlayGamesContentProvider.access$100("quests", "quest_icon_image_id"));
        add("quest_banner_image_uri", PlayGamesContentProvider.access$000(mUri, "quest_banner_image_id"));
        add("quest_banner_image_url", PlayGamesContentProvider.access$100("quests", "quest_banner_image_id"));
        return this;
    }

    (Uri uri)
    {
        mUri = uri;
    }
}
