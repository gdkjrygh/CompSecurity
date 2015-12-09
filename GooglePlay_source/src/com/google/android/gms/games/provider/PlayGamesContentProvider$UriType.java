// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;


// Referenced classes of package com.google.android.gms.games.provider:
//            PlayGamesContentProvider

private static final class mMatchPath extends Enum
{

    private static final CLEAR_DATA_FOR_LOCALE_CHANGE $VALUES[];
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE ACCOUNT_METADATA;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE ACCOUNT_METADATA_COVER_IMAGE;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE ACHIEVEMENT_DEFINITIONS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE ACHIEVEMENT_DEFINITIONS_EXT_ACHIEVEMENT_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE ACHIEVEMENT_DEFINITIONS_EXT_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE ACHIEVEMENT_DEFINITIONS_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE ACHIEVEMENT_DEFINITIONS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE ACHIEVEMENT_DEFINITIONS_ID_REVEALED_IMAGE;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE ACHIEVEMENT_DEFINITIONS_ID_UNLOCKED_IMAGE;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE ACHIEVEMENT_INSTANCES;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE ACHIEVEMENT_INSTANCES_EXT_PLAYER_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE ACHIEVEMENT_INSTANCES_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE ACHIEVEMENT_INSTANCES_PLAYER_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE ACHIEVEMENT_PENDING_OPS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE ACHIEVEMENT_PENDING_OPS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE APPLICATION_SESSIONS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE APPLICATION_SESSIONS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE APP_CONTENT;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE CLEAR_DATA_FOR_LOCALE_CHANGE;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE CLIENT_CONTEXT;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE CLIENT_CONTEXT_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EVENT_DEFINITIONS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EVENT_DEFINITIONS_EXT_EVENT_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EVENT_DEFINITIONS_EXT_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EVENT_DEFINITIONS_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EVENT_DEFINITIONS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EVENT_DEFINITIONS_ID_ICON_IMAGE;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EVENT_INSTANCES;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EVENT_INSTANCES_EXT_EVENT_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EVENT_INSTANCES_EXT_PLAYER_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EVENT_INSTANCES_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EVENT_INSTANCES_PLAYER_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EVENT_PENDING_OPS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EVENT_PENDING_OPS_EXT_EVENT_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EVENT_PENDING_OPS_EXT_PLAYER_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EVENT_PENDING_OPS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EXPERIENCE_EVENTS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EXPERIENCE_EVENTS_EXT_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE EXPERIENCE_EVENTS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAMES;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAMES_EXT_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAMES_EXT_GAME_ID_FEATURED_IMAGE;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAMES_EXT_GAME_ID_ICON_IMAGE;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAMES_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAMES_ID_FEATURED_IMAGE;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAMES_ID_HI_RES_IMAGE;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAMES_ID_ICON_IMAGE;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAME_BADGES;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAME_BADGES_EXT_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAME_BADGES_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAME_BADGES_ICON_IMAGE;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAME_BADGES_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAME_INSTANCES;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAME_INSTANCES_EXT_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAME_INSTANCES_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE GAME_INSTANCES_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE IMAGES;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE IMAGES_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE INVITATIONS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE INVITATIONS_EXT_INVITATION_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE INVITATIONS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE INVITATIONS_RAW_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE LEADERBOARDS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE LEADERBOARDS_EXT_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE LEADERBOARDS_EXT_LEADERBOARD_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE LEADERBOARDS_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE LEADERBOARDS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE LEADERBOARD_INSTANCES;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE LEADERBOARD_INSTANCES_EXT_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE LEADERBOARD_INSTANCES_EXT_LEADERBOARD_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE LEADERBOARD_INSTANCES_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE LEADERBOARD_PENDING_SCORES;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE LEADERBOARD_PENDING_SCORES_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE LEADERBOARD_SCORES;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE LEADERBOARD_SCORES_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE LEADERBOARD_SCORES_INSTANCE_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE MATCHES;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE MATCHES_EXT_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE MATCHES_EXT_MATCH_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE MATCHES_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE MATCHES_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE MATCHES_PENDING_OPS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE MATCHES_PENDING_OPS_EXT_MATCH_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE MATCHES_PENDING_OPS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE MATCHES_RAW_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE MATCH_ENTITIES;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE MATCH_ENTITIES_EXT_MATCH_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE MATCH_ENTITIES_MATCH_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE NOTIFICATIONS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE NOTIFICATIONS_EXT_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE NOTIFICATIONS_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE NOTIFICATIONS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE PARTICIPANTS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE PARTICIPANTS_EXT_PARTICIPANT_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE PARTICIPANTS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE PARTICIPANTS_INVITATION_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE PARTICIPANTS_MATCH_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE PLAYERS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE PLAYERS_EXT_PLAYER_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE PLAYERS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE PLAYERS_ID_PROFILE_HI_RES_IMAGE;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE PLAYERS_ID_PROFILE_ICON_IMAGE;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE PLAYER_LEVELS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE PLAYER_LEVELS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE PLAYER_LEVELS_LVL_NUM;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE PLAYER_STATS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE PLAYER_STATS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE PLAYER_STATS_PLAYER_AND_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUESTS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUESTS_ENTITIES;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUESTS_ENTITIES_EXT_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUESTS_ENTITIES_EXT_MILESTONE_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUESTS_ENTITIES_EXT_QUEST_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUESTS_ENTITIES_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUESTS_ENTITIES_QUEST_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUESTS_EXT_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUESTS_EXT_PLAYER_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUESTS_EXT_QUEST_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUESTS_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUESTS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUESTS_ID_ICON_IMAGE;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUESTS_ID_PROMOTIONAL_IMAGE;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUESTS_PLAYER_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUEST_MILESTONES;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUEST_MILESTONES_EXT_MILESTONE_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUEST_MILESTONES_EXT_QUEST_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUEST_MILESTONES_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE QUEST_MILESTONES_QUEST_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE REQUESTS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE REQUESTS_ENTITIES;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE REQUESTS_ENTITIES_EXT_REQUEST_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE REQUESTS_ENTITIES_REQUEST_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE REQUESTS_EXT_REQ_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE REQUESTS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE REQUESTS_RAW_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE REQUEST_PENDING_OPS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE REQUEST_PENDING_OPS_EXT_REQ_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE REQUEST_PENDING_OPS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE REQUEST_RECIPIENTS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE REQUEST_RECIPIENTS_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE REQUEST_RECIPIENTS_REQ_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE SNAPSHOTS;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE SNAPSHOTS_EXT_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE SNAPSHOTS_EXT_SNAPSHOT_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE SNAPSHOTS_GAME_ID;
    public static final CLEAR_DATA_FOR_LOCALE_CHANGE SNAPSHOTS_ID;
    final String mMatchPath;

    public static mMatchPath valueOf(String s)
    {
        return (mMatchPath)Enum.valueOf(com/google/android/gms/games/provider/PlayGamesContentProvider$UriType, s);
    }

    public static mMatchPath[] values()
    {
        return (mMatchPath[])$VALUES.clone();
    }

    static 
    {
        GAMES = new <init>("GAMES", 0, "games/*");
        GAMES_ID = new <init>("GAMES_ID", 1, "games/*/#");
        GAMES_EXT_GAME_ID = new <init>("GAMES_EXT_GAME_ID", 2, "games/*/ext_game/*");
        GAMES_ID_ICON_IMAGE = new <init>("GAMES_ID_ICON_IMAGE", 3, "games/*/#/icon_image");
        GAMES_EXT_GAME_ID_ICON_IMAGE = new <init>("GAMES_EXT_GAME_ID_ICON_IMAGE", 4, "games/*/ext_game/*/icon_image");
        GAMES_ID_HI_RES_IMAGE = new <init>("GAMES_ID_HI_RES_IMAGE", 5, "games/*/#/hi_res_image");
        GAMES_ID_FEATURED_IMAGE = new <init>("GAMES_ID_FEATURED_IMAGE", 6, "games/*/#/featured_image");
        GAMES_EXT_GAME_ID_FEATURED_IMAGE = new <init>("GAMES_EXT_GAME_ID_FEATURED_IMAGE", 7, "games/*/ext_game/*/featured_image");
        GAME_BADGES = new <init>("GAME_BADGES", 8, "game_badges/*");
        GAME_BADGES_ID = new <init>("GAME_BADGES_ID", 9, "game_badges/*/#");
        GAME_BADGES_GAME_ID = new <init>("GAME_BADGES_GAME_ID", 10, "game_badges/*/game/#");
        GAME_BADGES_EXT_GAME_ID = new <init>("GAME_BADGES_EXT_GAME_ID", 11, "game_badges/*/ext_game/*");
        GAME_BADGES_ICON_IMAGE = new <init>("GAME_BADGES_ICON_IMAGE", 12, "game_badges/*/#/icon_image");
        GAME_INSTANCES = new <init>("GAME_INSTANCES", 13, "game_instances/*");
        GAME_INSTANCES_ID = new <init>("GAME_INSTANCES_ID", 14, "game_instances/*/#");
        GAME_INSTANCES_GAME_ID = new <init>("GAME_INSTANCES_GAME_ID", 15, "game_instances/*/game/#");
        GAME_INSTANCES_EXT_GAME_ID = new <init>("GAME_INSTANCES_EXT_GAME_ID", 16, "game_instances/*/ext_game/*");
        PLAYERS = new <init>("PLAYERS", 17, "players/*");
        PLAYERS_ID = new <init>("PLAYERS_ID", 18, "players/*/#");
        PLAYERS_EXT_PLAYER_ID = new <init>("PLAYERS_EXT_PLAYER_ID", 19, "players/*/ext_player/*");
        PLAYERS_ID_PROFILE_ICON_IMAGE = new <init>("PLAYERS_ID_PROFILE_ICON_IMAGE", 20, "players/*/#/profile_icon_image");
        PLAYERS_ID_PROFILE_HI_RES_IMAGE = new <init>("PLAYERS_ID_PROFILE_HI_RES_IMAGE", 21, "players/*/#/profile_hi_res_image");
        PLAYER_LEVELS = new <init>("PLAYER_LEVELS", 22, "player_levels/*");
        PLAYER_LEVELS_ID = new <init>("PLAYER_LEVELS_ID", 23, "player_levels/*/#");
        PLAYER_LEVELS_LVL_NUM = new <init>("PLAYER_LEVELS_LVL_NUM", 24, "player_levels/*/player_level/#");
        PLAYER_STATS = new <init>("PLAYER_STATS", 25, "player_stats/*");
        PLAYER_STATS_ID = new <init>("PLAYER_STATS_ID", 26, "player_stats/*/#");
        PLAYER_STATS_PLAYER_AND_GAME_ID = new <init>("PLAYER_STATS_PLAYER_AND_GAME_ID", 27, "player_stats/*/player/#/game/#");
        ACHIEVEMENT_DEFINITIONS = new <init>("ACHIEVEMENT_DEFINITIONS", 28, "achievement_definitions/*");
        ACHIEVEMENT_DEFINITIONS_ID = new <init>("ACHIEVEMENT_DEFINITIONS_ID", 29, "achievement_definitions/*/#");
        ACHIEVEMENT_DEFINITIONS_EXT_ACHIEVEMENT_ID = new <init>("ACHIEVEMENT_DEFINITIONS_EXT_ACHIEVEMENT_ID", 30, "achievement_definitions/*/ext_achievement/*");
        ACHIEVEMENT_DEFINITIONS_GAME_ID = new <init>("ACHIEVEMENT_DEFINITIONS_GAME_ID", 31, "achievement_definitions/*/game/#");
        ACHIEVEMENT_DEFINITIONS_EXT_GAME_ID = new <init>("ACHIEVEMENT_DEFINITIONS_EXT_GAME_ID", 32, "achievement_definitions/*/ext_game/*");
        ACHIEVEMENT_DEFINITIONS_ID_UNLOCKED_IMAGE = new <init>("ACHIEVEMENT_DEFINITIONS_ID_UNLOCKED_IMAGE", 33, "achievement_definitions/*/#/unlocked_icon_image");
        ACHIEVEMENT_DEFINITIONS_ID_REVEALED_IMAGE = new <init>("ACHIEVEMENT_DEFINITIONS_ID_REVEALED_IMAGE", 34, "achievement_definitions/*/#/revealed_icon_image");
        ACHIEVEMENT_PENDING_OPS = new <init>("ACHIEVEMENT_PENDING_OPS", 35, "achievement_pending_ops/*");
        ACHIEVEMENT_PENDING_OPS_ID = new <init>("ACHIEVEMENT_PENDING_OPS_ID", 36, "achievement_pending_ops/*/#");
        ACHIEVEMENT_INSTANCES = new <init>("ACHIEVEMENT_INSTANCES", 37, "achievement_instances/*");
        ACHIEVEMENT_INSTANCES_ID = new <init>("ACHIEVEMENT_INSTANCES_ID", 38, "achievement_instances/*/#");
        ACHIEVEMENT_INSTANCES_PLAYER_ID = new <init>("ACHIEVEMENT_INSTANCES_PLAYER_ID", 39, "achievement_instances/*/player/#");
        ACHIEVEMENT_INSTANCES_EXT_PLAYER_ID = new <init>("ACHIEVEMENT_INSTANCES_EXT_PLAYER_ID", 40, "achievement_instances/*/ext_player/*");
        APP_CONTENT = new <init>("APP_CONTENT", 41, "app_contents/*");
        APPLICATION_SESSIONS = new <init>("APPLICATION_SESSIONS", 42, "application_sessions/*");
        APPLICATION_SESSIONS_ID = new <init>("APPLICATION_SESSIONS_ID", 43, "application_sessions/*/#");
        CLIENT_CONTEXT = new <init>("CLIENT_CONTEXT", 44, "client_contexts/*");
        CLIENT_CONTEXT_ID = new <init>("CLIENT_CONTEXT_ID", 45, "client_contexts/*/#");
        EVENT_DEFINITIONS = new <init>("EVENT_DEFINITIONS", 46, "event_definitions/*");
        EVENT_DEFINITIONS_ID = new <init>("EVENT_DEFINITIONS_ID", 47, "event_definitions/*/#");
        EVENT_DEFINITIONS_EXT_EVENT_ID = new <init>("EVENT_DEFINITIONS_EXT_EVENT_ID", 48, "event_definitions/*/ext_event/*");
        EVENT_DEFINITIONS_GAME_ID = new <init>("EVENT_DEFINITIONS_GAME_ID", 49, "event_definitions/*/game/#");
        EVENT_DEFINITIONS_EXT_GAME_ID = new <init>("EVENT_DEFINITIONS_EXT_GAME_ID", 50, "event_definitions/*/ext_game/*");
        EVENT_DEFINITIONS_ID_ICON_IMAGE = new <init>("EVENT_DEFINITIONS_ID_ICON_IMAGE", 51, "event_definitions/*/#/icon_image");
        EVENT_INSTANCES = new <init>("EVENT_INSTANCES", 52, "event_instances/*");
        EVENT_INSTANCES_ID = new <init>("EVENT_INSTANCES_ID", 53, "event_instances/*/#");
        EVENT_INSTANCES_PLAYER_ID = new <init>("EVENT_INSTANCES_PLAYER_ID", 54, "event_instances/*/player/#");
        EVENT_INSTANCES_EXT_EVENT_ID = new <init>("EVENT_INSTANCES_EXT_EVENT_ID", 55, "event_instances/*/ext_event/*");
        EVENT_INSTANCES_EXT_PLAYER_ID = new <init>("EVENT_INSTANCES_EXT_PLAYER_ID", 56, "event_instances/*/ext_player/*");
        EVENT_PENDING_OPS = new <init>("EVENT_PENDING_OPS", 57, "event_pending_ops/*");
        EVENT_PENDING_OPS_ID = new <init>("EVENT_PENDING_OPS_ID", 58, "event_pending_ops/*/#");
        EVENT_PENDING_OPS_EXT_EVENT_ID = new <init>("EVENT_PENDING_OPS_EXT_EVENT_ID", 59, "event_pending_ops/*/ext_event/*");
        EVENT_PENDING_OPS_EXT_PLAYER_ID = new <init>("EVENT_PENDING_OPS_EXT_PLAYER_ID", 60, "event_pending_ops/*/ext_player/*");
        EXPERIENCE_EVENTS = new <init>("EXPERIENCE_EVENTS", 61, "experience_events/*");
        EXPERIENCE_EVENTS_ID = new <init>("EXPERIENCE_EVENTS_ID", 62, "experience_events/*/#");
        EXPERIENCE_EVENTS_EXT_ID = new <init>("EXPERIENCE_EVENTS_EXT_ID", 63, "experience_events/*/ext_event/*");
        LEADERBOARDS = new <init>("LEADERBOARDS", 64, "leaderboards/*");
        LEADERBOARDS_ID = new <init>("LEADERBOARDS_ID", 65, "leaderboards/*/#");
        LEADERBOARDS_EXT_LEADERBOARD_ID = new <init>("LEADERBOARDS_EXT_LEADERBOARD_ID", 66, "leaderboards/*/ext_leaderboard/*");
        LEADERBOARDS_GAME_ID = new <init>("LEADERBOARDS_GAME_ID", 67, "leaderboards/*/game/#");
        LEADERBOARDS_EXT_GAME_ID = new <init>("LEADERBOARDS_EXT_GAME_ID", 68, "leaderboards/*/ext_game/*");
        LEADERBOARD_INSTANCES = new <init>("LEADERBOARD_INSTANCES", 69, "leaderboard_instances/*");
        LEADERBOARD_INSTANCES_ID = new <init>("LEADERBOARD_INSTANCES_ID", 70, "leaderboard_instances/*/#");
        LEADERBOARD_INSTANCES_EXT_GAME_ID = new <init>("LEADERBOARD_INSTANCES_EXT_GAME_ID", 71, "leaderboard_instances/*/ext_game/*");
        LEADERBOARD_INSTANCES_EXT_LEADERBOARD_ID = new <init>("LEADERBOARD_INSTANCES_EXT_LEADERBOARD_ID", 72, "leaderboard_instances/*/ext_leaderboard/*");
        LEADERBOARD_SCORES = new <init>("LEADERBOARD_SCORES", 73, "leaderboard_scores/*");
        LEADERBOARD_SCORES_ID = new <init>("LEADERBOARD_SCORES_ID", 74, "leaderboard_scores/*/#");
        LEADERBOARD_SCORES_INSTANCE_ID = new <init>("LEADERBOARD_SCORES_INSTANCE_ID", 75, "leaderboard_scores/*/instance/#");
        LEADERBOARD_PENDING_SCORES = new <init>("LEADERBOARD_PENDING_SCORES", 76, "leaderboard_pending_scores/*");
        LEADERBOARD_PENDING_SCORES_ID = new <init>("LEADERBOARD_PENDING_SCORES_ID", 77, "leaderboard_pending_scores/*/#");
        IMAGES = new <init>("IMAGES", 78, "images/*");
        IMAGES_ID = new <init>("IMAGES_ID", 79, "images/*/#");
        INVITATIONS = new <init>("INVITATIONS", 80, "invitations/*");
        INVITATIONS_ID = new <init>("INVITATIONS_ID", 81, "invitations/*/#");
        INVITATIONS_RAW_ID = new <init>("INVITATIONS_RAW_ID", 82, "invitations/*/raw_id/#");
        INVITATIONS_EXT_INVITATION_ID = new <init>("INVITATIONS_EXT_INVITATION_ID", 83, "invitations/*/ext_invitation/*");
        MATCHES = new <init>("MATCHES", 84, "matches/*");
        MATCHES_ID = new <init>("MATCHES_ID", 85, "matches/*/#");
        MATCHES_RAW_ID = new <init>("MATCHES_RAW_ID", 86, "matches/*/raw_id/#");
        MATCHES_EXT_MATCH_ID = new <init>("MATCHES_EXT_MATCH_ID", 87, "matches/*/ext_match/*");
        MATCHES_GAME_ID = new <init>("MATCHES_GAME_ID", 88, "matches/*/game/#");
        MATCHES_EXT_GAME_ID = new <init>("MATCHES_EXT_GAME_ID", 89, "matches/*/ext_game/*");
        MATCHES_PENDING_OPS = new <init>("MATCHES_PENDING_OPS", 90, "matches_pending_ops/*");
        MATCHES_PENDING_OPS_ID = new <init>("MATCHES_PENDING_OPS_ID", 91, "matches_pending_ops/*/#");
        MATCHES_PENDING_OPS_EXT_MATCH_ID = new <init>("MATCHES_PENDING_OPS_EXT_MATCH_ID", 92, "matches_pending_ops/*/ext_match/*");
        MATCH_ENTITIES = new <init>("MATCH_ENTITIES", 93, "match_entities/*");
        MATCH_ENTITIES_MATCH_ID = new <init>("MATCH_ENTITIES_MATCH_ID", 94, "match_entities/*/#");
        MATCH_ENTITIES_EXT_MATCH_ID = new <init>("MATCH_ENTITIES_EXT_MATCH_ID", 95, "match_entities/*/ext_match/*");
        NOTIFICATIONS = new <init>("NOTIFICATIONS", 96, "notifications/*");
        NOTIFICATIONS_ID = new <init>("NOTIFICATIONS_ID", 97, "notifications/*/#");
        NOTIFICATIONS_GAME_ID = new <init>("NOTIFICATIONS_GAME_ID", 98, "notifications/*/game/#");
        NOTIFICATIONS_EXT_GAME_ID = new <init>("NOTIFICATIONS_EXT_GAME_ID", 99, "notifications/*/ext_game/*");
        PARTICIPANTS = new <init>("PARTICIPANTS", 100, "participants/*");
        PARTICIPANTS_ID = new <init>("PARTICIPANTS_ID", 101, "participants/*/#");
        PARTICIPANTS_EXT_PARTICIPANT_ID = new <init>("PARTICIPANTS_EXT_PARTICIPANT_ID", 102, "participants/*/ext_participant/*");
        PARTICIPANTS_MATCH_ID = new <init>("PARTICIPANTS_MATCH_ID", 103, "participants/*/match/#");
        PARTICIPANTS_INVITATION_ID = new <init>("PARTICIPANTS_INVITATION_ID", 104, "participants/*/invitation/#");
        QUESTS = new <init>("QUESTS", 105, "quests/*");
        QUESTS_EXT_QUEST_ID = new <init>("QUESTS_EXT_QUEST_ID", 106, "quests/*/ext_quest/*");
        QUESTS_EXT_GAME_ID = new <init>("QUESTS_EXT_GAME_ID", 107, "quests/*/ext_game/*");
        QUESTS_EXT_PLAYER_ID = new <init>("QUESTS_EXT_PLAYER_ID", 108, "quests/*/ext_player/*");
        QUESTS_GAME_ID = new <init>("QUESTS_GAME_ID", 109, "quests/*/game/#");
        QUESTS_ID = new <init>("QUESTS_ID", 110, "quests/*/#");
        QUESTS_ID_ICON_IMAGE = new <init>("QUESTS_ID_ICON_IMAGE", 111, "quests/*/#/icon_image");
        QUESTS_ID_PROMOTIONAL_IMAGE = new <init>("QUESTS_ID_PROMOTIONAL_IMAGE", 112, "quests/*/#/promo_image");
        QUESTS_PLAYER_ID = new <init>("QUESTS_PLAYER_ID", 113, "quests/*/player/#");
        QUEST_MILESTONES = new <init>("QUEST_MILESTONES", 114, "milestones/*");
        QUEST_MILESTONES_EXT_MILESTONE_ID = new <init>("QUEST_MILESTONES_EXT_MILESTONE_ID", 115, "milestones/*/ext_milestone/*");
        QUEST_MILESTONES_EXT_QUEST_ID = new <init>("QUEST_MILESTONES_EXT_QUEST_ID", 116, "milestones/*/ext_quest/*");
        QUEST_MILESTONES_ID = new <init>("QUEST_MILESTONES_ID", 117, "milestones/*/#");
        QUEST_MILESTONES_QUEST_ID = new <init>("QUEST_MILESTONES_QUEST_ID", 118, "milestones/*/quest/#");
        QUESTS_ENTITIES = new <init>("QUESTS_ENTITIES", 119, "quest_entities/*");
        QUESTS_ENTITIES_QUEST_ID = new <init>("QUESTS_ENTITIES_QUEST_ID", 120, "quest_entities/*/#");
        QUESTS_ENTITIES_EXT_QUEST_ID = new <init>("QUESTS_ENTITIES_EXT_QUEST_ID", 121, "quest_entities/*/ext_quest/*");
        QUESTS_ENTITIES_GAME_ID = new <init>("QUESTS_ENTITIES_GAME_ID", 122, "quest_entities/*/game/#");
        QUESTS_ENTITIES_EXT_GAME_ID = new <init>("QUESTS_ENTITIES_EXT_GAME_ID", 123, "quest_entities/*/ext_game/*");
        QUESTS_ENTITIES_EXT_MILESTONE_ID = new <init>("QUESTS_ENTITIES_EXT_MILESTONE_ID", 124, "quest_entities/*/ext_milestone/*");
        REQUESTS = new <init>("REQUESTS", 125, "requests/*");
        REQUESTS_ID = new <init>("REQUESTS_ID", 126, "requests/*/#");
        REQUESTS_RAW_ID = new <init>("REQUESTS_RAW_ID", 127, "requests/*/raw_id/#");
        REQUESTS_EXT_REQ_ID = new <init>("REQUESTS_EXT_REQ_ID", 128, "requests/*/ext_request/*");
        REQUEST_PENDING_OPS = new <init>("REQUEST_PENDING_OPS", 129, "request_pending_ops/*");
        REQUEST_PENDING_OPS_ID = new <init>("REQUEST_PENDING_OPS_ID", 130, "request_pending_ops/*/#");
        REQUEST_PENDING_OPS_EXT_REQ_ID = new <init>("REQUEST_PENDING_OPS_EXT_REQ_ID", 131, "request_pending_ops/*/ext_request/*");
        REQUEST_RECIPIENTS = new <init>("REQUEST_RECIPIENTS", 132, "request_recipients/*");
        REQUEST_RECIPIENTS_ID = new <init>("REQUEST_RECIPIENTS_ID", 133, "request_recipients/*/#");
        REQUEST_RECIPIENTS_REQ_ID = new <init>("REQUEST_RECIPIENTS_REQ_ID", 134, "request_recipients/*/request/#");
        REQUESTS_ENTITIES = new <init>("REQUESTS_ENTITIES", 135, "request_entities/*");
        REQUESTS_ENTITIES_REQUEST_ID = new <init>("REQUESTS_ENTITIES_REQUEST_ID", 136, "request_entities/*/#");
        REQUESTS_ENTITIES_EXT_REQUEST_ID = new <init>("REQUESTS_ENTITIES_EXT_REQUEST_ID", 137, "request_entities/*/ext_request/*");
        SNAPSHOTS = new <init>("SNAPSHOTS", 138, "snapshots/*");
        SNAPSHOTS_ID = new <init>("SNAPSHOTS_ID", 139, "snapshots/*/#");
        SNAPSHOTS_EXT_SNAPSHOT_ID = new <init>("SNAPSHOTS_EXT_SNAPSHOT_ID", 140, "snapshots/*/ext_snapshot/*");
        SNAPSHOTS_GAME_ID = new <init>("SNAPSHOTS_GAME_ID", 141, "snapshots/*/game/#");
        SNAPSHOTS_EXT_GAME_ID = new <init>("SNAPSHOTS_EXT_GAME_ID", 142, "snapshots/*/ext_game/*");
        ACCOUNT_METADATA = new <init>("ACCOUNT_METADATA", 143, "account_metadata/*");
        ACCOUNT_METADATA_COVER_IMAGE = new <init>("ACCOUNT_METADATA_COVER_IMAGE", 144, "account_metadata/*/cover_image");
        CLEAR_DATA_FOR_LOCALE_CHANGE = new <init>("CLEAR_DATA_FOR_LOCALE_CHANGE", 145, "clear_for_locale_change/*");
        $VALUES = (new .VALUES[] {
            GAMES, GAMES_ID, GAMES_EXT_GAME_ID, GAMES_ID_ICON_IMAGE, GAMES_EXT_GAME_ID_ICON_IMAGE, GAMES_ID_HI_RES_IMAGE, GAMES_ID_FEATURED_IMAGE, GAMES_EXT_GAME_ID_FEATURED_IMAGE, GAME_BADGES, GAME_BADGES_ID, 
            GAME_BADGES_GAME_ID, GAME_BADGES_EXT_GAME_ID, GAME_BADGES_ICON_IMAGE, GAME_INSTANCES, GAME_INSTANCES_ID, GAME_INSTANCES_GAME_ID, GAME_INSTANCES_EXT_GAME_ID, PLAYERS, PLAYERS_ID, PLAYERS_EXT_PLAYER_ID, 
            PLAYERS_ID_PROFILE_ICON_IMAGE, PLAYERS_ID_PROFILE_HI_RES_IMAGE, PLAYER_LEVELS, PLAYER_LEVELS_ID, PLAYER_LEVELS_LVL_NUM, PLAYER_STATS, PLAYER_STATS_ID, PLAYER_STATS_PLAYER_AND_GAME_ID, ACHIEVEMENT_DEFINITIONS, ACHIEVEMENT_DEFINITIONS_ID, 
            ACHIEVEMENT_DEFINITIONS_EXT_ACHIEVEMENT_ID, ACHIEVEMENT_DEFINITIONS_GAME_ID, ACHIEVEMENT_DEFINITIONS_EXT_GAME_ID, ACHIEVEMENT_DEFINITIONS_ID_UNLOCKED_IMAGE, ACHIEVEMENT_DEFINITIONS_ID_REVEALED_IMAGE, ACHIEVEMENT_PENDING_OPS, ACHIEVEMENT_PENDING_OPS_ID, ACHIEVEMENT_INSTANCES, ACHIEVEMENT_INSTANCES_ID, ACHIEVEMENT_INSTANCES_PLAYER_ID, 
            ACHIEVEMENT_INSTANCES_EXT_PLAYER_ID, APP_CONTENT, APPLICATION_SESSIONS, APPLICATION_SESSIONS_ID, CLIENT_CONTEXT, CLIENT_CONTEXT_ID, EVENT_DEFINITIONS, EVENT_DEFINITIONS_ID, EVENT_DEFINITIONS_EXT_EVENT_ID, EVENT_DEFINITIONS_GAME_ID, 
            EVENT_DEFINITIONS_EXT_GAME_ID, EVENT_DEFINITIONS_ID_ICON_IMAGE, EVENT_INSTANCES, EVENT_INSTANCES_ID, EVENT_INSTANCES_PLAYER_ID, EVENT_INSTANCES_EXT_EVENT_ID, EVENT_INSTANCES_EXT_PLAYER_ID, EVENT_PENDING_OPS, EVENT_PENDING_OPS_ID, EVENT_PENDING_OPS_EXT_EVENT_ID, 
            EVENT_PENDING_OPS_EXT_PLAYER_ID, EXPERIENCE_EVENTS, EXPERIENCE_EVENTS_ID, EXPERIENCE_EVENTS_EXT_ID, LEADERBOARDS, LEADERBOARDS_ID, LEADERBOARDS_EXT_LEADERBOARD_ID, LEADERBOARDS_GAME_ID, LEADERBOARDS_EXT_GAME_ID, LEADERBOARD_INSTANCES, 
            LEADERBOARD_INSTANCES_ID, LEADERBOARD_INSTANCES_EXT_GAME_ID, LEADERBOARD_INSTANCES_EXT_LEADERBOARD_ID, LEADERBOARD_SCORES, LEADERBOARD_SCORES_ID, LEADERBOARD_SCORES_INSTANCE_ID, LEADERBOARD_PENDING_SCORES, LEADERBOARD_PENDING_SCORES_ID, IMAGES, IMAGES_ID, 
            INVITATIONS, INVITATIONS_ID, INVITATIONS_RAW_ID, INVITATIONS_EXT_INVITATION_ID, MATCHES, MATCHES_ID, MATCHES_RAW_ID, MATCHES_EXT_MATCH_ID, MATCHES_GAME_ID, MATCHES_EXT_GAME_ID, 
            MATCHES_PENDING_OPS, MATCHES_PENDING_OPS_ID, MATCHES_PENDING_OPS_EXT_MATCH_ID, MATCH_ENTITIES, MATCH_ENTITIES_MATCH_ID, MATCH_ENTITIES_EXT_MATCH_ID, NOTIFICATIONS, NOTIFICATIONS_ID, NOTIFICATIONS_GAME_ID, NOTIFICATIONS_EXT_GAME_ID, 
            PARTICIPANTS, PARTICIPANTS_ID, PARTICIPANTS_EXT_PARTICIPANT_ID, PARTICIPANTS_MATCH_ID, PARTICIPANTS_INVITATION_ID, QUESTS, QUESTS_EXT_QUEST_ID, QUESTS_EXT_GAME_ID, QUESTS_EXT_PLAYER_ID, QUESTS_GAME_ID, 
            QUESTS_ID, QUESTS_ID_ICON_IMAGE, QUESTS_ID_PROMOTIONAL_IMAGE, QUESTS_PLAYER_ID, QUEST_MILESTONES, QUEST_MILESTONES_EXT_MILESTONE_ID, QUEST_MILESTONES_EXT_QUEST_ID, QUEST_MILESTONES_ID, QUEST_MILESTONES_QUEST_ID, QUESTS_ENTITIES, 
            QUESTS_ENTITIES_QUEST_ID, QUESTS_ENTITIES_EXT_QUEST_ID, QUESTS_ENTITIES_GAME_ID, QUESTS_ENTITIES_EXT_GAME_ID, QUESTS_ENTITIES_EXT_MILESTONE_ID, REQUESTS, REQUESTS_ID, REQUESTS_RAW_ID, REQUESTS_EXT_REQ_ID, REQUEST_PENDING_OPS, 
            REQUEST_PENDING_OPS_ID, REQUEST_PENDING_OPS_EXT_REQ_ID, REQUEST_RECIPIENTS, REQUEST_RECIPIENTS_ID, REQUEST_RECIPIENTS_REQ_ID, REQUESTS_ENTITIES, REQUESTS_ENTITIES_REQUEST_ID, REQUESTS_ENTITIES_EXT_REQUEST_ID, SNAPSHOTS, SNAPSHOTS_ID, 
            SNAPSHOTS_EXT_SNAPSHOT_ID, SNAPSHOTS_GAME_ID, SNAPSHOTS_EXT_GAME_ID, ACCOUNT_METADATA, ACCOUNT_METADATA_COVER_IMAGE, CLEAR_DATA_FOR_LOCALE_CHANGE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mMatchPath = s1;
    }
}
