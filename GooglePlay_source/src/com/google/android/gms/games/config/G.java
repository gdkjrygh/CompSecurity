// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.config;

import com.google.android.gms.common.config.GservicesValue;

public final class G
{

    public static GservicesValue achievementCacheStaleThresholdMillis = GservicesValue.value("games.achievement_cache_stale_threshold_millis", Long.valueOf(0x1b7740L));
    public static GservicesValue allowPeriodicSyncs = GservicesValue.value("games.allow_periodic_syncs", true);
    public static GservicesValue alwaysShowAchievements = GservicesValue.value("games.always_show_achievements", false);
    public static GservicesValue apiaryTraceToken = GservicesValue.value("games.apiary_trace_token", "");
    public static GservicesValue appContentInMemoryCacheTimeout = GservicesValue.value("games.app_content_in_memory_cache_timeout", Long.valueOf(0x493e0L));
    public static GservicesValue arrayMapThreshold = GservicesValue.value("games.array_map_threshold", Integer.valueOf(50));
    public static GservicesValue baseFinskyUrl = GservicesValue.value("games.finsky_service_url", "https://market.android.com");
    public static GservicesValue baseServerUrl = GservicesValue.value("games.base_service_url", "https://www.googleapis.com");
    public static GservicesValue cacheEnabled = GservicesValue.value("games.cache_enabled", true);
    public static GservicesValue capturingNetwork = GservicesValue.value("games.capturing", false);
    public static GservicesValue destAppSkipPlusVerification = GservicesValue.value("games.games_core_skip_gplus_verification", false);
    public static GservicesValue disableBackgroundSync = GservicesValue.value("games.disable_background_sync", false);
    public static GservicesValue enableBuzzbotSubscription = GservicesValue.value("games.enable_buzzbot_subscription", true);
    public static GservicesValue enableClickableToasts = GservicesValue.value("games.enable_clickable_toasts", true);
    public static GservicesValue enableExperiments = GservicesValue.value("games.enable_experiments", true);
    public static GservicesValue enablePanoRecommendationNotifications = GservicesValue.value("games.enable_pano_recommendation_notifications", true);
    public static GservicesValue enableVerboseRealtimeMultiplayerLogging = GservicesValue.value("games.enable_verbose_realtime_multiplayer_logging", false);
    public static GservicesValue eventWindowSizeMillis = GservicesValue.value("games.event_window_size_millis", Long.valueOf(0xdbba0L));
    public static GservicesValue experienceEventCacheStaleThresholdMillis = GservicesValue.value("games.experience_event_cache_stale_threshold_millis", Long.valueOf(0x36ee80L));
    public static GservicesValue forceGamesAccountInDestApp = GservicesValue.value("games.force_games_account_in_dest_app", false);
    public static GservicesValue forceGamesAccountInGames = GservicesValue.value("games.force_games_account_in_games", false);
    public static GservicesValue forceServerVersion = GservicesValue.value("games.force_server_version", false);
    public static GservicesValue forcedAgentVersion = GservicesValue.value("games.forced_agent_version", null);
    public static GservicesValue forcedDeviceType = GservicesValue.value("games.forced_device_type", null);
    public static GservicesValue ignoreRateLimitChecks = GservicesValue.value("games.ignore_rate_limit_checks", false);
    public static GservicesValue ignoreSyncRecentActivityCheck = GservicesValue.value("games.ignore_sync_activity_recent_check", false);
    public static GservicesValue includeSidewinderAccounts = GservicesValue.value("games.include_sidewinder_accounts", false);
    public static GservicesValue internalServerVersion = GservicesValue.value("games.internal_server_version", "v1whitelisted");
    public static GservicesValue leaderboardCacheStaleThresholdMillis = GservicesValue.value("games.leaderboard_cache_stale_threshold_millis", Long.valueOf(0x1b7740L));
    public static GservicesValue maxAcceptedOutboundRequests = GservicesValue.value("games.max_accepted_outbound_requests", Integer.valueOf(10));
    public static GservicesValue maxCompletedMatches = GservicesValue.value("games.max_completed_matches", Integer.valueOf(10));
    public static GservicesValue maxExperienceEventsCached = GservicesValue.value("games.max_experience_events_cached", Integer.valueOf(30));
    public static GservicesValue maxRequestLifetimeDays = GservicesValue.value("games.max_request_lifetime_days", Integer.valueOf(14));
    public static GservicesValue maxRequestPayloadBytes = GservicesValue.value("games.max_request_payload_bytes", Integer.valueOf(2048));
    public static GservicesValue maxScoresPerPage = GservicesValue.value("games.max_scores_per_page", Integer.valueOf(30));
    public static GservicesValue maxSnapshotBytes = GservicesValue.value("games.max_snapshot_bytes", Integer.valueOf(0x300000));
    public static GservicesValue maxSnapshotCoverImageBytes = GservicesValue.value("games.max_snapshot_cover_image_bytes", Integer.valueOf(0xc8000));
    public static GservicesValue maxSnapshotPropertyLength = GservicesValue.value("games.max_snapshot_property_length", Integer.valueOf(113));
    public static GservicesValue maxTurnBasedMatchDataBytes = GservicesValue.value("games.max_turn_based_match_data_bytes", Integer.valueOf(0x20000));
    public static GservicesValue mostRecentConnectionThresholdMillis = GservicesValue.value("games.most_recent_connection_threshold_millis", Long.valueOf(0x240c8400L));
    public static GservicesValue nearbyPlayerLifetimeMillis = GservicesValue.value("games.nearby_player_lifetime_millis", Long.valueOf(0x927c0L));
    public static GservicesValue odysseyServerUrl = GservicesValue.value("games.odyssey_server_url", "https://play.googleapis.com/play/log");
    public static GservicesValue peopleChangedBroadcastThresholdMillis = GservicesValue.value("games.people_changed_broadcast_threshold_millis", Long.valueOf(5000L));
    public static GservicesValue periodicFineSyncPeriodSeconds = GservicesValue.value("games.periodic_fine_sync_period_seconds", Long.valueOf(3600L));
    public static GservicesValue periodicSyncFlexSeconds = GservicesValue.value("games.periodic_sync_flex_seconds", Long.valueOf(3600L));
    public static GservicesValue periodicSyncPeriodSecondsV2 = GservicesValue.value("games.periodic_sync_period_seconds_v2", Long.valueOf(0x15f90L));
    public static GservicesValue playLogImpressionSettleTimeMs = GservicesValue.value("games.playlog_impression_settle_time_ms", Integer.valueOf(250));
    public static GservicesValue recentQuestThresholdMillis = GservicesValue.value("games.recent_quest_threshold_millis", Long.valueOf(0x240c8400L));
    public static GservicesValue revisionCheckIntervalMs = GservicesValue.value("games.revision_check_interval_ms", Long.valueOf(0x5265c00L));
    public static GservicesValue rtmpBuzzEmailAddress = GservicesValue.value("games.rtmp_buzz_email_address", "games@ob.talk.google.com");
    public static GservicesValue rtmpLibjingleConnectTimeoutSeconds = GservicesValue.value("games.rtmp_libjingle_connect_timeout_seconds", Integer.valueOf(30));
    public static GservicesValue rtmpMaxReconnectAttempts = GservicesValue.value("games.rtmp_max_reconnect_attempts", Integer.valueOf(0));
    public static GservicesValue rtmpReuseXmppConnections = GservicesValue.value("games.rtmp_reuse_xmpp_connections", false);
    public static GservicesValue serverVersion = GservicesValue.value("games.server_version", "v1");
    public static GservicesValue signLeaderboardScoresPercent = GservicesValue.value("games.sign_leaderboard_scores", Double.valueOf(1.0D));
    public static GservicesValue snapshotCommittedMimeType = GservicesValue.value("games.snapshot_committed_mime_type", "application/vnd.google-play-games.snapshot");
    public static GservicesValue snapshotConflictMimeType = GservicesValue.value("games.snapshot_conflict_mime_type", "application/vnd.google-play-games.snapshot-conflict");
    public static GservicesValue snapshotFolder = GservicesValue.value("games.snapshot_folder", "play_games");
    public static GservicesValue snapshotInitialMimeType = GservicesValue.value("games.snapshot_initial_mime_type", "application/vnd.google-play-games.snapshot-initial");
    public static GservicesValue syncBufferMaxMillis = GservicesValue.value("games.sync_buffer_max_millis", Long.valueOf(0x493e0L));
    public static GservicesValue syncBufferMillis = GservicesValue.value("games.sync_buffer_millis", Long.valueOf(30000L));
    public static GservicesValue tickleSyncThresholdMillis = GservicesValue.value("games.tickle_sync_threshold_millis", Long.valueOf(60000L));
    public static GservicesValue useEventLogger = GservicesValue.value("games.use_event_logger", true);
    public static GservicesValue useSeparateIdForPlayGamesAndGmsCore = GservicesValue.value("games.use_separate_id_for_play_games_and_gms_core", true);
    public static GservicesValue verboseCacheLogging = GservicesValue.value("games.verbose_cache_logging", false);
    public static GservicesValue verboseGamesPlaylogLogging = GservicesValue.value("games.verbose_games_playlog_logging", false);
    public static GservicesValue verboseVolleyLogging = GservicesValue.value("games.verbose_volley_logging", false);
    public static GservicesValue videoCheckTimeRemainingIntervalMillis = GservicesValue.value("games.video_check_time_remaining_interval_millis", Integer.valueOf(30000));
    public static GservicesValue videoOutputDirectory = GservicesValue.value("games.video_output_directory", "Screencasts");
    public static GservicesValue videoProcessingThreadDelayMillis = GservicesValue.value("games.video_processing_thread_delay_millis", Long.valueOf(5000L));
    public static GservicesValue videoStoppingIntervalMillis = GservicesValue.value("games.video_stopping_interval_millis", Long.valueOf(200L));
    public static GservicesValue videoStoppingTimeoutMillis = GservicesValue.value("games.video_stopping_timeout_millis", Long.valueOf(5000L));
    public static GservicesValue videoWarnAtTimeRemainingSeconds = GservicesValue.value("games.video_warn_at_time_remaining_seconds", Integer.valueOf(90));

}
