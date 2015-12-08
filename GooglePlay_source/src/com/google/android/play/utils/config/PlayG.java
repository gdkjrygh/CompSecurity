// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.utils.config;


// Referenced classes of package com.google.android.play.utils.config:
//            GservicesValue

public final class PlayG
{

    public static final String GSERVICES_KEY_PREFIXES[] = {
        "playcommon"
    };
    public static final GservicesValue androidId = GservicesValue.value("android_id", Long.valueOf(0L));
    public static final GservicesValue authTokenType = GservicesValue.value("playcommon.auth_token_type", "androidmarket");
    public static GservicesValue bitmapLoaderCacheSizeOverrideMb = GservicesValue.value("playcommon.bitmap_loader_cache_size_mb", Integer.valueOf(-1));
    public static GservicesValue bitmapLoaderCacheSizeRatioToScreen = GservicesValue.value("playcommon.bitmap_loader_cache_size_ratio_to_screen", Float.valueOf(1.5F));
    public static final GservicesValue clientId = GservicesValue.partnerSetting("market_client_id", "am-google");
    public static GservicesValue debugImageSizes = GservicesValue.value("playcommon.debug_display_image_sizes", Boolean.valueOf(false));
    public static final GservicesValue dfeBackoffMultipler = GservicesValue.value("playcommon.dfe_backoff_multiplier", Float.valueOf(1.0F));
    public static final GservicesValue dfeMaxRetries = GservicesValue.value("playcommon.dfe_max_retries", Integer.valueOf(1));
    public static final GservicesValue dfeRequestTimeoutMs = GservicesValue.value("playcommon.dfe_request_timeout_ms", Integer.valueOf(2500));
    public static final GservicesValue forceDisabledExperimentIds = GservicesValue.value("playcommon.force_disabled_experiment_ids", null);
    public static final GservicesValue forceEnabledExperimentIds = GservicesValue.value("playcommon.force_enabled_experiment_ids", null);
    public static GservicesValue imageCacheSizeMb = GservicesValue.value("playcommon.image_cache_size_mb", Integer.valueOf(4));
    public static final GservicesValue ipCountryOverride = GservicesValue.value("playcommon.ip_country_override", null);
    public static final GservicesValue loggingId = GservicesValue.partnerSetting("logging_id2", "");
    public static GservicesValue mainCacheSizeMb = GservicesValue.value("playcommon.main_cache_size_mb", Integer.valueOf(1));
    public static final GservicesValue mccMncOverride = GservicesValue.value("playcommon.mcc_mnc_override", null);
    public static final GservicesValue minImageSizeLimitInLRUCacheBytes = GservicesValue.value("playcommon.min_image_size_limit_in_lru_cache_bytes", Integer.valueOf(0x80000));
    public static final GservicesValue percentOfImageSize2G = GservicesValue.value("playcommon.percent_of_image_size_2g", Float.valueOf(0.45F));
    public static final GservicesValue percentOfImageSize3G = GservicesValue.value("playcommon.percent_of_image_size_3g", Float.valueOf(0.75F));
    public static final GservicesValue percentOfImageSize4G = GservicesValue.value("playcommon.percent_of_image_size_4g", Float.valueOf(0.9F));
    public static final GservicesValue percentOfImageSizeWifi = GservicesValue.value("playcommon.percent_of_image_size_wifi", Float.valueOf(1.0F));
    public static final GservicesValue plusProfileBgBackoffMult = GservicesValue.value("playcommon.plus_profile_bg_backoff_mult", Float.valueOf(1.0F));
    public static final GservicesValue plusProfileBgMaxRetries = GservicesValue.value("playcommon.plus_profile_bg_max_retries", Integer.valueOf(0));
    public static final GservicesValue plusProfileBgTimeoutMs = GservicesValue.value("playcommon.plus_profile_bg_timeout_ms", Integer.valueOf(8000));
    public static final GservicesValue prexDisabled = GservicesValue.value("playcommon.prex_disabled", Boolean.valueOf(false));
    public static final GservicesValue protoLogUrlRegexp = GservicesValue.value("playcommon.proto_log_url_regexp", ".*");
    public static final GservicesValue showStagingData = GservicesValue.value("playcommon.show_staging_data", Boolean.valueOf(false));
    public static final GservicesValue skipAllCaches = GservicesValue.value("playcommon.skip_all_caches", Boolean.valueOf(false));
    public static final GservicesValue tentativeGcRunnerEnabled = GservicesValue.value("playcommon.tentative_gc_runner_enabled", Boolean.valueOf(true));
    public static final GservicesValue volleyBufferPoolSizeKb = GservicesValue.value("playcommon.volley_buffer_pool_size_kb", Integer.valueOf(256));
    public static final GservicesValue webpFifeImagesEnabled = GservicesValue.value("playcommon.webp_fife_images_enabled", Boolean.valueOf(true));

}
