// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;


public final class GamesContract
{
    public static interface AchievementDefinitionsColumns
    {

        public static final String ALL_COLUMNS[] = {
            "game_id", "external_achievement_id", "type", "name", "description", "unlocked_icon_image_id", "unlocked_icon_image_uri", "unlocked_icon_image_url", "revealed_icon_image_id", "revealed_icon_image_uri", 
            "revealed_icon_image_url", "total_steps", "formatted_total_steps", "initial_state", "sorting_rank", "definition_xp_value"
        };

    }

    public static interface AchievementInstancesColumns
    {

        public static final String ALL_COLUMNS[] = {
            "definition_id", "player_id", "state", "current_steps", "formatted_current_steps", "last_updated_timestamp", "instance_xp_value"
        };

    }

    public static interface AchievementPendingOpsColumns
    {

        public static final String ALL_COLUMNS[] = {
            "client_context_id", "external_achievement_id", "achievement_type", "new_state", "steps_to_increment", "min_steps_to_set", "external_game_id", "external_player_id"
        };

    }

    public static interface AclsColumns
    {

        public static final String ALL_COLUMNS[] = {
            "specified_by_user", "pacl"
        };

    }

    public static interface AppContentColumns
    {

        public static final String ALL_COLUMNS[] = {
            "experiments", "json", "page_token", "screen_name", "server_cookie"
        };

    }

    public static interface ApplicationSessionColumns
    {

        public static final String ALL_COLUMNS[] = {
            "client_context_id", "end_time", "external_game_id", "session_id", "start_time", "ad_id", "limit_ad_tracking"
        };

    }

    public static interface ClientContextsColumns
    {

        public static final String ALL_COLUMNS[] = {
            "package_name", "package_uid", "account_name"
        };

    }

    public static interface EventDefinitionColumns
    {

        public static final String ALL_COLUMNS[] = {
            "event_definitions_game_id", "external_event_id", "name", "description", "visibility", "icon_image_id", "icon_image_uri", "icon_image_url", "sorting_rank"
        };

    }

    public static interface EventInstancesColumns
    {

        public static final String ALL_COLUMNS[] = {
            "definition_id", "player_id", "formatted_value", "last_updated_timestamp"
        };

    }

    public static interface EventPendingOpsColumns
    {

        public static final String ALL_COLUMNS[] = {
            "client_context_id", "instance_id", "window_start_time", "window_end_time", "increment", "request_id"
        };

    }

    public static interface ExperienceEventColumns
    {

        public static final String ALL_COLUMNS[] = {
            "external_experience_id", "game_id", "created_timestamp", "current_xp", "xp_earned", "display_title", "display_description", "display_string", "type", "icon_id", 
            "icon_url", "icon_uri", "newLevel"
        };

    }

    public static interface GameBadgesColumns
    {

        public static final String ALL_COLUMNS[] = {
            "badge_game_id", "badge_type", "badge_title", "badge_description", "badge_icon_image_id", "badge_icon_image_uri"
        };

    }

    public static interface GameInstancesColumns
    {

        public static final String ALL_COLUMNS[] = {
            "instance_game_id", "real_time_support", "turn_based_support", "platform_type", "instance_display_name", "package_name", "piracy_check", "installed", "preferred", "gamepad_support"
        };
        public static final String JOIN_COLUMNS[] = {
            "installed", "package_name", "real_time_support", "turn_based_support", "gamepad_support"
        };

    }

    public static interface GameSearchSuggestionsColumns
    {

        public static final String ALL_COLUMNS[] = {
            "suggestion"
        };

    }

    public static interface GamesColumns
    {

        public static final String ALL_COLUMNS[] = {
            "external_game_id", "display_name", "primary_category", "secondary_category", "developer_name", "game_description", "game_icon_image_id", "game_icon_image_uri", "game_icon_image_url", "game_hi_res_image_id", 
            "game_hi_res_image_uri", "game_hi_res_image_url", "featured_image_id", "featured_image_uri", "featured_image_url", "screenshot_image_ids", "video_url", "play_enabled_game", "last_played_server_time", "last_connection_local_time", 
            "last_synced_local_time", "metadata_version", "sync_token", "target_instance", "gameplay_acl_status", "achievement_total_count", "leaderboard_count", "muted", "identity_sharing_confirmed", "snapshots_enabled", 
            "theme_color"
        };

    }

    public static interface ImagesColumns
    {

        public static final String ALL_COLUMNS[] = {
            "url", "local", "filesize", "download_timestamp"
        };

    }

    public static interface InvitationsColumns
    {

        public static final String ALL_COLUMNS[] = {
            "game_id", "external_invitation_id", "external_inviter_id", "creation_timestamp", "last_modified_timestamp", "description", "type", "variant", "has_automatch_criteria", "automatch_min_players", 
            "automatch_max_players", "inviter_in_circles"
        };

    }

    public static interface LeaderboardInstancesColumns
    {

        public static final String ALL_COLUMNS[] = {
            "leaderboard_id", "timespan", "collection", "player_raw_score", "player_display_score", "player_rank", "player_display_rank", "player_score_tag", "total_scores", "top_page_token_next", 
            "window_page_token_prev", "window_page_token_next"
        };

    }

    public static interface LeaderboardScoresColumns
    {

        public static final String ALL_COLUMNS[] = {
            "instance_id", "page_type", "player_id", "default_display_name", "default_display_image_id", "default_display_image_uri", "default_display_image_url", "rank", "display_rank", "raw_score", 
            "display_score", "achieved_timestamp", "score_tag"
        };

    }

    public static interface LeaderboardsColumns
    {

        public static final String ALL_COLUMNS[] = {
            "game_id", "external_leaderboard_id", "name", "board_icon_image_id", "board_icon_image_uri", "board_icon_image_url", "sorting_rank", "score_order"
        };

    }

    public static interface MatchesColumns
    {

        public static final String ALL_COLUMNS[] = {
            "game_id", "external_match_id", "creator_external", "creation_timestamp", "last_updater_external", "last_updated_timestamp", "pending_participant_external", "data", "status", "description", 
            "version", "variant", "notification_text", "user_match_status", "has_automatch_criteria", "automatch_min_players", "automatch_max_players", "automatch_bit_mask", "automatch_wait_estimate_sec", "rematch_id", 
            "match_number", "previous_match_data", "upsync_required", "description_participant_id"
        };

    }

    public static interface MatchesPendingOpsColumns
    {

        public static final String ALL_COLUMNS[] = {
            "client_context_id", "type", "external_game_id", "external_match_id", "pending_participant_id", "version", "is_turn", "results"
        };

    }

    public static interface MilestoneColumns
    {

        public static final String ALL_COLUMNS[] = {
            "completion_reward_data", "event_instance_id", "external_milestone_id", "initial_value", "quest_id", "milestones_sorting_rank", "milestone_state", "target_value"
        };

    }

    public static interface NotificationsColumns
    {

        public static final String ALL_COLUMNS[] = {
            "notification_id", "game_id", "external_sub_id", "type", "image_id", "ticker", "title", "text", "coalesced_text", "timestamp", 
            "acknowledged", "alert_level"
        };

    }

    public static interface ParticipantsColumns
    {

        public static final String ALL_COLUMNS[] = {
            "match_id", "invitation_id", "external_participant_id", "player_id", "default_display_image_id", "default_display_image_url", "default_display_hi_res_image_id", "default_display_hi_res_image_url", "default_display_name", "player_status", 
            "client_address", "result_type", "placing", "connected", "capabilities"
        };

    }

    public static interface PlayerLevelColumns
    {

        public static final String ALL_COLUMNS[] = {
            "level_value", "level_min_xp", "level_max_xp", "version"
        };

    }

    public static interface PlayerStatsColumns
    {

        public static final String ALL_COLUMNS[] = {
            "ave_session_length_minutes", "churn_probability", "days_since_last_played", "game_id", "num_purchases", "num_sessions", "num_sessions_percentile", "player_id", "unknown_raw_keys", "unknown_raw_values", 
            "spend_percentile"
        };

    }

    public static interface PlayersColumns
    {

        public static final String ALL_COLUMNS[] = {
            "external_player_id", "profile_icon_image_id", "profile_hi_res_image_id", "profile_icon_image_uri", "profile_icon_image_url", "profile_hi_res_image_uri", "profile_hi_res_image_url", "profile_name", "last_updated", "is_in_circles", 
            "has_all_public_acls", "has_debug_access", "is_profile_visible", "current_xp_total", "current_level", "current_level_min_xp", "current_level_max_xp", "next_level", "next_level_max_xp", "last_level_up_timestamp", 
            "player_title", "most_recent_external_game_id", "most_recent_game_name", "most_recent_activity_timestamp", "most_recent_game_icon_id", "most_recent_game_icon_uri", "most_recent_game_hi_res_id", "most_recent_game_hi_res_uri", "most_recent_game_featured_id", "most_recent_game_featured_uri", 
            "gamer_tag", "real_name", "banner_image_landscape_id", "banner_image_landscape_uri", "banner_image_landscape_url", "banner_image_portrait_id", "banner_image_portrait_uri", "banner_image_portrait_url"
        };

    }

    public static interface QuestsColumns
    {

        public static final String ALL_COLUMNS[] = {
            "accepted_ts", "quest_banner_image_id", "quest_banner_image_uri", "quest_banner_image_url", "quest_description", "quest_end_ts", "external_quest_id", "game_id", "quest_icon_image_id", "quest_icon_image_uri", 
            "quest_icon_image_url", "quest_last_updated_ts", "quest_name", "notified", "notification_ts", "quest_start_ts", "quest_state", "quest_type"
        };

    }

    public static interface RequestPendingOpsColumns
    {

        public static final String ALL_COLUMNS[] = {
            "client_context_id", "external_request_id", "external_game_id"
        };

    }

    public static interface RequestRecipientsColumns
    {

        public static final String ALL_COLUMNS[] = {
            "request_id", "player_id", "recipient_status"
        };

    }

    public static interface RequestSummaryColumns
    {

        public static final String ALL_COLUMNS[] = {
            "wish_count", "gift_count", "player_count"
        };

    }

    public static interface RequestsColumns
    {

        public static final String ALL_COLUMNS[] = {
            "external_request_id", "game_id", "sender_id", "data", "type", "creation_timestamp", "expiration_timestamp", "status"
        };

    }

    public static interface SnapshotColumns
    {

        public static final String ALL_COLUMNS[] = {
            "game_id", "owner_id", "external_snapshot_id", "drive_resolved_id_string", "drive_resource_id_string", "cover_icon_image_id", "cover_icon_image_uri", "cover_icon_image_url", "cover_icon_image_width", "cover_icon_image_height", 
            "title", "description", "last_modified_timestamp", "duration", "unique_name", "visible", "pending_change_count", "progress_value", "device_name"
        };

    }

    public static interface VideoColumns
    {

        public static final String ALL_COLUMNS[] = {
            "duration", "filepath", "filesize", "package", "start_time"
        };

    }

}
