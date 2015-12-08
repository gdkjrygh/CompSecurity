// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;


public final class GamesContract
{
    public static interface AccountMetadataColumns
    {

        public static final String EL[] = {
            "account_name", "external_player_id", "match_sync_token", "last_package_scan_timestamp", "request_sync_token", "cover_photo_image_id", "cover_photo_image_uri", "cover_photo_image_url"
        };

    }

    public static interface AchievementDefinitionsColumns
    {

        public static final String EL[] = {
            "game_id", "external_achievement_id", "type", "name", "description", "unlocked_icon_image_id", "unlocked_icon_image_uri", "unlocked_icon_image_url", "revealed_icon_image_id", "revealed_icon_image_uri", 
            "revealed_icon_image_url", "total_steps", "formatted_total_steps", "initial_state", "sorting_rank"
        };

    }

    public static interface AchievementInstancesColumns
    {

        public static final String EL[] = {
            "definition_id", "player_id", "state", "current_steps", "formatted_current_steps", "last_updated_timestamp"
        };

    }

    public static interface AchievementPendingOpsColumns
    {

        public static final String EL[] = {
            "client_context_id", "external_achievement_id", "achievement_type", "new_state", "steps_to_increment", "min_steps_to_set", "external_game_id", "external_player_id"
        };

    }

    public static interface AclsColumns
    {

        public static final String EL[] = {
            "specified_by_user", "pacl"
        };

    }

    public static interface ApplicationSessionColumns
    {

        public static final String EL[] = {
            "client_context_id", "end_time", "external_game_id", "session_id", "start_time"
        };

    }

    public static interface ClientContextsColumns
    {

        public static final String EL[] = {
            "package_name", "package_uid", "account_name"
        };

    }

    public static interface ContactSettingsColumns
    {

        public static final String EL[] = {
            "mobile_notifications_enabled", "match_notifications_enabled", "request_notifications_enabled"
        };

    }

    public static interface GameBadgesColumns
    {

        public static final String EL[] = {
            "badge_game_id", "badge_type", "badge_title", "badge_description", "badge_icon_image_id", "badge_icon_image_uri"
        };

    }

    public static interface GameInstancesColumns
    {

        public static final String EL[] = {
            "instance_game_id", "real_time_support", "turn_based_support", "platform_type", "instance_display_name", "package_name", "piracy_check", "installed", "preferred"
        };

    }

    public static interface GameSearchSuggestionsColumns
    {

        public static final String EL[] = {
            "suggestion"
        };

    }

    public static interface GamesColumns
    {

        public static final String EL[] = {
            "external_game_id", "display_name", "primary_category", "secondary_category", "developer_name", "game_description", "game_icon_image_id", "game_icon_image_uri", "game_icon_image_url", "game_hi_res_image_id", 
            "game_hi_res_image_uri", "game_hi_res_image_url", "featured_image_id", "featured_image_uri", "featured_image_url", "play_enabled_game", "last_played_server_time", "last_connection_local_time", "last_synced_local_time", "metadata_version", 
            "target_instance", "gameplay_acl_status", "achievement_total_count", "leaderboard_count", "muted", "identity_sharing_confirmed"
        };

    }

    public static interface ImagesColumns
    {

        public static final String EL[] = {
            "url", "local", "filesize", "download_timestamp"
        };

    }

    public static interface InvitationsColumns
    {

        public static final String EL[] = {
            "game_id", "external_invitation_id", "external_inviter_id", "creation_timestamp", "last_modified_timestamp", "description", "type", "variant", "has_automatch_criteria", "automatch_min_players", 
            "automatch_max_players", "inviter_in_circles"
        };

    }

    public static interface LeaderboardInstancesColumns
    {

        public static final String EL[] = {
            "leaderboard_id", "timespan", "collection", "player_raw_score", "player_display_score", "player_rank", "player_display_rank", "player_score_tag", "total_scores", "top_page_token_next", 
            "window_page_token_prev", "window_page_token_next"
        };

    }

    public static interface LeaderboardScoresColumns
    {

        public static final String EL[] = {
            "instance_id", "page_type", "player_id", "default_display_name", "default_display_image_id", "default_display_image_uri", "default_display_image_url", "rank", "display_rank", "raw_score", 
            "display_score", "achieved_timestamp", "score_tag"
        };

    }

    public static interface LeaderboardsColumns
    {

        public static final String EL[] = {
            "game_id", "external_leaderboard_id", "name", "board_icon_image_id", "board_icon_image_uri", "board_icon_image_url", "sorting_rank", "score_order"
        };

    }

    public static interface MatchesColumns
    {

        public static final String EL[] = {
            "game_id", "external_match_id", "creator_external", "creation_timestamp", "last_updater_external", "last_updated_timestamp", "pending_participant_external", "data", "status", "description", 
            "version", "variant", "notification_text", "user_match_status", "has_automatch_criteria", "automatch_min_players", "automatch_max_players", "automatch_bit_mask", "automatch_wait_estimate_sec", "rematch_id", 
            "match_number", "previous_match_data", "upsync_required", "description_participant_id"
        };

    }

    public static interface MatchesPendingOpsColumns
    {

        public static final String EL[] = {
            "client_context_id", "type", "external_game_id", "external_match_id", "pending_participant_id", "version", "is_turn", "results"
        };

    }

    public static interface NotificationsColumns
    {

        public static final String EL[] = {
            "notification_id", "game_id", "external_sub_id", "type", "image_id", "ticker", "title", "text", "coalesced_text", "timestamp", 
            "acknowledged", "alert_level"
        };

    }

    public static interface PageType
    {
    }

    public static interface ParticipantsColumns
    {

        public static final String EL[] = {
            "match_id", "invitation_id", "external_participant_id", "player_id", "default_display_image_id", "default_display_image_url", "default_display_hi_res_image_id", "default_display_hi_res_image_url", "default_display_name", "player_status", 
            "client_address", "result_type", "placing", "connected", "capabilities"
        };

    }

    public static interface PlayersColumns
    {

        public static final String EL[] = {
            "external_player_id", "profile_icon_image_id", "profile_hi_res_image_id", "profile_icon_image_uri", "profile_icon_image_url", "profile_hi_res_image_uri", "profile_hi_res_image_url", "profile_name", "last_updated", "is_in_circles"
        };

    }

    public static interface RequestRecipientsColumns
    {

        public static final String EL[] = {
            "request_id", "player_id", "recipient_status"
        };

    }

    public static interface RequestSummaryColumns
    {

        public static final String EL[] = {
            "wish_count", "gift_count", "player_count"
        };

    }

    public static interface RequestsColumns
    {

        public static final String EL[] = {
            "external_request_id", "game_id", "sender_id", "data", "type", "creation_timestamp", "expiration_timestamp", "status"
        };

    }


    public GamesContract()
    {
    }
}
