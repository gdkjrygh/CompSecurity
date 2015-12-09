// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.config;

import com.google.android.gms.common.util.PlatformVersion;

// Referenced classes of package com.google.android.gms.common.config:
//            GservicesValue

public final class G
{
    public static final class analytics
    {

        public static GservicesValue periodicMonitoringInterval = GservicesValue.value("gms:playlog:service:monitoring_interval", Long.valueOf(0x5265c00L));
        public static GservicesValue systemHealthLogDelayAfterBoot = GservicesValue.value("gms:common:system_health_log_delay_after_boot_millis", Long.valueOf(0x1b7740L));
        public static GservicesValue systemHealthLogDelayAfterInstall = GservicesValue.value("gms:common:system_health_log_delay_after_install_millis", Long.valueOf(60000L));
        public static GservicesValue uploadInternalStatsInterval = GservicesValue.value("gms:common:upload_internal_stats_interval", Long.valueOf(0L));
        public static GservicesValue uploadNetworkStatsInterval = GservicesValue.value("gms:common:upload_network_stats_interval", Long.valueOf(0L));

    }


    public static GservicesValue allowPIILogging = GservicesValue.value("gms:common:allow_pii_logging", false);
    public static final GservicesValue authenticatingWebViewWhitelistPattern = GservicesValue.value("gms:common:authenticating_webview_whitelist_pattern", "https://accounts\\.google(\\.co(m?))?(\\.\\w{2})?/.*");
    public static GservicesValue collectGmsStats = GservicesValue.value("gms:common:collect_gms_stats", true);
    public static GservicesValue credentialsManagementUrl = GservicesValue.value("gms:credentials:management_url", "https://passwords.google.com");
    public static GservicesValue enableAuthProxyVersion = GservicesValue.value("gms:common:enable_auth_proxy_version", Long.valueOf(0x4dd1e0L));
    public static GservicesValue enableDumpSys = GservicesValue.value("enable_dumpsys", false);
    public static GservicesValue enableLeakCanary = GservicesValue.value("gms:common:enable_leak_canary", false);
    public static GservicesValue enableNativeLibInstallerInGmsApplication = GservicesValue.value("gms:common:enable_native_library_in_gms_application", true);
    public static GservicesValue fakeApiaryBatchRequestServerUrl = GservicesValue.value("gms:common:fake_apiary_batch_request_server_url", "");
    public static final GservicesValue googleSettingsHelpUrl = GservicesValue.value("gms:app:google_settings_help_url", "https://support.google.com/?p=google_settings");
    public static GservicesValue ignoredPackagesForLogging = GservicesValue.value("gms:common:ignored_packages_for_logging", "com.google.android.gms");
    public static GservicesValue lsoBackendOverride = GservicesValue.value("gms:common:lso_backend_override", "");
    public static GservicesValue lsoServerApiPath = GservicesValue.value("gms:common:lso_server_api_path", "/oauth2/v3/");
    public static GservicesValue lsoServerUrl = GservicesValue.value("gms:common:lso_server_url", "https://www.googleapis.com");
    public static final GservicesValue networkingSettingsPackage = GservicesValue.value("gms:common:networking_settings_package", "com.google.android.apps.gcs");
    public static GservicesValue showCredentialsSettings = GservicesValue.value("gms:credentials:show_settings", false);
    public static GservicesValue showDownloadSettings = GservicesValue.value("gms:common:show_download_settings", false);
    public static GservicesValue showGrpcSettings = GservicesValue.value("gms:common:show_grpc_settings", false);
    public static final GservicesValue showNetworkingSettings = GservicesValue.value("gms:common:show_networking_settings", true);
    public static GservicesValue showPeopleSettings = GservicesValue.value("gms:common:show_people_settings", false);
    public static GservicesValue showSetUpNearbyDeviceSettings = GservicesValue.value("gms:common:show_set_up_nearby_device_settings", PlatformVersion.checkVersion(14));
    public static GservicesValue showTapAndPaySettings = GservicesValue.value("gms:common:show_tap_and_pay_settings", false);
    public static GservicesValue sidewinderWhitelistByAccount = GservicesValue.value("gms:sidewinder:whitelist_by_account", "");
    public static GservicesValue sidewinderWhitelistByDevice = GservicesValue.value("gms:sidewinder:whitelist_by_device", "14,25,44,64");

}
