// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import android.support.v4.util.SimpleArrayMap;

public final class GmsNetworkClientTags
{

    private static final SimpleArrayMap CLIENT_STRING;
    private static final SimpleArrayMap SPECIAL_STRING;
    private static final SimpleArrayMap TEAM_STRING;

    public static String tagToString(int i)
    {
        String s1 = (String)TEAM_STRING.get(Integer.valueOf(3585));
        String s = s1;
        if (s1 == null)
        {
            String s2 = (String)CLIENT_STRING.get(Integer.valueOf(3584));
            s = s2;
            if (s2 == null)
            {
                s = (String)SPECIAL_STRING.get(Integer.valueOf(3585));
            }
        }
        return s;
    }

    static 
    {
        SimpleArrayMap simplearraymap = new SimpleArrayMap(28);
        CLIENT_STRING = simplearraymap;
        simplearraymap.put(Integer.valueOf(256), "Ads");
        CLIENT_STRING.put(Integer.valueOf(512), "Analytics");
        CLIENT_STRING.put(Integer.valueOf(768), "Android Auto");
        CLIENT_STRING.put(Integer.valueOf(1024), "Google Cloud");
        CLIENT_STRING.put(Integer.valueOf(1280), "Device Manager");
        CLIENT_STRING.put(Integer.valueOf(1536), "Location & Context");
        CLIENT_STRING.put(Integer.valueOf(1792), "Android Wear");
        CLIENT_STRING.put(Integer.valueOf(2048), "Android for Work");
        CLIENT_STRING.put(Integer.valueOf(2304), "Cast");
        CLIENT_STRING.put(Integer.valueOf(2560), "Core");
        CLIENT_STRING.put(Integer.valueOf(2816), "Drive");
        CLIENT_STRING.put(Integer.valueOf(3072), "Feedback");
        CLIENT_STRING.put(Integer.valueOf(3328), "Fit");
        CLIENT_STRING.put(Integer.valueOf(3584), "Games");
        CLIENT_STRING.put(Integer.valueOf(3840), "Help");
        CLIENT_STRING.put(Integer.valueOf(4096), "Identity");
        CLIENT_STRING.put(Integer.valueOf(4352), "Google Maps");
        CLIENT_STRING.put(Integer.valueOf(4608), "Metrics");
        CLIENT_STRING.put(Integer.valueOf(9728), "Nearby");
        CLIENT_STRING.put(Integer.valueOf(4864), "Nova");
        CLIENT_STRING.put(Integer.valueOf(5120), "Panorama");
        CLIENT_STRING.put(Integer.valueOf(5376), "Contacts");
        CLIENT_STRING.put(Integer.valueOf(8960), "Photos");
        CLIENT_STRING.put(Integer.valueOf(9216), "Plus");
        CLIENT_STRING.put(Integer.valueOf(5632), "Reminders");
        CLIENT_STRING.put(Integer.valueOf(5888), "Search");
        CLIENT_STRING.put(Integer.valueOf(6144), "Security");
        CLIENT_STRING.put(Integer.valueOf(6400), "Social");
        CLIENT_STRING.put(Integer.valueOf(6656), "Kids");
        CLIENT_STRING.put(Integer.valueOf(6912), "Google Wallet");
        CLIENT_STRING.put(Integer.valueOf(7168), "Android Pay");
        CLIENT_STRING.put(Integer.valueOf(7424), "App State");
        CLIENT_STRING.put(Integer.valueOf(7936), "Chrome Sync");
        CLIENT_STRING.put(Integer.valueOf(8192), "Brandmaster");
        CLIENT_STRING.put(Integer.valueOf(8448), "Subscribedfeeds");
        CLIENT_STRING.put(Integer.valueOf(8704), "Reporting");
        CLIENT_STRING.put(Integer.valueOf(9472), "Statements Service");
        CLIENT_STRING.put(Integer.valueOf(9984), "Tap and Pay");
        CLIENT_STRING.put(Integer.valueOf(10240), "Places");
        CLIENT_STRING.put(Integer.valueOf(10496), "Weave");
        simplearraymap = new SimpleArrayMap(40);
        TEAM_STRING = simplearraymap;
        simplearraymap.put(Integer.valueOf(257), "Ads preferences");
        TEAM_STRING.put(Integer.valueOf(258), "Ads clear ID");
        TEAM_STRING.put(Integer.valueOf(259), "Ads zero day fix");
        TEAM_STRING.put(Integer.valueOf(260), "Ads Jumble negotiation");
        TEAM_STRING.put(Integer.valueOf(261), "Ads ad request");
        TEAM_STRING.put(Integer.valueOf(513), "Google Tag Manager");
        TEAM_STRING.put(Integer.valueOf(1025), "Google Auth");
        TEAM_STRING.put(Integer.valueOf(1036), "CredentialSyncAdapter");
        TEAM_STRING.put(Integer.valueOf(1037), "CredentialStateSyncAdapter");
        TEAM_STRING.put(Integer.valueOf(1026), "Factory Reset Protection");
        TEAM_STRING.put(Integer.valueOf(1027), "Smart Lock");
        TEAM_STRING.put(Integer.valueOf(1028), "API proxy");
        TEAM_STRING.put(Integer.valueOf(1029), "Backup");
        TEAM_STRING.put(Integer.valueOf(1030), "Cloud Save");
        TEAM_STRING.put(Integer.valueOf(1031), "Google Cloud Messaging");
        TEAM_STRING.put(Integer.valueOf(1032), "Checkin");
        TEAM_STRING.put(Integer.valueOf(1033), "OTA");
        TEAM_STRING.put(Integer.valueOf(1034), "Smart device");
        TEAM_STRING.put(Integer.valueOf(1035), "Cloud config");
        TEAM_STRING.put(Integer.valueOf(1038), "CloudSaveSyncAdapter");
        TEAM_STRING.put(Integer.valueOf(1537), "FLP");
        TEAM_STRING.put(Integer.valueOf(1538), "ULR");
        TEAM_STRING.put(Integer.valueOf(1539), "Activity Recognition");
        TEAM_STRING.put(Integer.valueOf(1540), "Context Manager");
        TEAM_STRING.put(Integer.valueOf(1541), "Copresence");
        TEAM_STRING.put(Integer.valueOf(1542), "Places");
        TEAM_STRING.put(Integer.valueOf(1794), "Android Wear (JSON)");
        TEAM_STRING.put(Integer.valueOf(1795), "Android Wear (GET)");
        TEAM_STRING.put(Integer.valueOf(1796), "Android Wear (POST)");
        TEAM_STRING.put(Integer.valueOf(1797), "Android Wear (Backup)");
        TEAM_STRING.put(Integer.valueOf(7425), "AppStateSyncAdapter");
        TEAM_STRING.put(Integer.valueOf(7937), "Chromesync SyncAdapter");
        TEAM_STRING.put(Integer.valueOf(2817), "DriveSyncAdapter");
        TEAM_STRING.put(Integer.valueOf(3329), "FitnessSyncAdapter");
        TEAM_STRING.put(Integer.valueOf(3585), "GamesSyncAdapter");
        TEAM_STRING.put(Integer.valueOf(3586), "GamesStubSyncAdapter");
        TEAM_STRING.put(Integer.valueOf(3841), "HelpMetrics");
        TEAM_STRING.put(Integer.valueOf(4097), "User Data Controls");
        TEAM_STRING.put(Integer.valueOf(4098), "AuthZen");
        TEAM_STRING.put(Integer.valueOf(4099), "Sign-in");
        TEAM_STRING.put(Integer.valueOf(4100), "Auth Proxy Api");
        TEAM_STRING.put(Integer.valueOf(4609), "Clearcut/PlayLog");
        TEAM_STRING.put(Integer.valueOf(4610), "Lockbox");
        TEAM_STRING.put(Integer.valueOf(4611), "Phenotype");
        TEAM_STRING.put(Integer.valueOf(9729), "Nearby Messages");
        TEAM_STRING.put(Integer.valueOf(9730), "Nearby Messages heartbeat");
        TEAM_STRING.put(Integer.valueOf(4865), "Nova Network Quality Lookup)");
        TEAM_STRING.put(Integer.valueOf(4866), "Nova Android Device Manager");
        TEAM_STRING.put(Integer.valueOf(4867), "Nova Gatherer2 (Wi-Fi Cred Sync)");
        TEAM_STRING.put(Integer.valueOf(5377), "PeopleSyncAdapter");
        TEAM_STRING.put(Integer.valueOf(5378), "ContactMetadata");
        TEAM_STRING.put(Integer.valueOf(8961), "Photos InstantUploadSyncAdapter");
        TEAM_STRING.put(Integer.valueOf(9217), "Plus OfflineActionSyncAdapter");
        TEAM_STRING.put(Integer.valueOf(5633), "RemindersSyncAdapter");
        TEAM_STRING.put(Integer.valueOf(8705), "ReportingSyncAdapter");
        TEAM_STRING.put(Integer.valueOf(5889), "Action Intents");
        TEAM_STRING.put(Integer.valueOf(5890), "App Indexing");
        TEAM_STRING.put(Integer.valueOf(5891), "Icing");
        TEAM_STRING.put(Integer.valueOf(6145), "Safety Net");
        TEAM_STRING.put(Integer.valueOf(6146), "Attestation");
        TEAM_STRING.put(Integer.valueOf(6147), "DroidGuard");
        TEAM_STRING.put(Integer.valueOf(6148), "Safe Browsing Update");
        TEAM_STRING.put(Integer.valueOf(6149), "Safe Browsing Query");
        TEAM_STRING.put(Integer.valueOf(6401), "Photos");
        TEAM_STRING.put(Integer.valueOf(6402), "App Invite");
        TEAM_STRING.put(Integer.valueOf(6403), "Google Unified Notification System");
        TEAM_STRING.put(Integer.valueOf(6404), "Location (Social)");
        TEAM_STRING.put(Integer.valueOf(6405), "Smart Profile");
        TEAM_STRING.put(Integer.valueOf(8449), "subscribedfeeds SyncAdapter");
        TEAM_STRING.put(Integer.valueOf(6657), "Kids Sync");
        TEAM_STRING.put(Integer.valueOf(6913), "Wallet OCR");
        TEAM_STRING.put(Integer.valueOf(10497), "GcdSyncAdapter");
        TEAM_STRING.put(Integer.valueOf(153), "Default AbstractApiaryServer");
        TEAM_STRING.put(Integer.valueOf(152), "Default BaseApiaryServer");
        TEAM_STRING.put(Integer.valueOf(151), "Default BaseProtoServer");
        TEAM_STRING.put(Integer.valueOf(150), "Default BaseGrpcServer");
        TEAM_STRING.put(Integer.valueOf(10241), "PlacesServer addPlace");
        TEAM_STRING.put(Integer.valueOf(10242), "PlacesServer search");
        TEAM_STRING.put(Integer.valueOf(10243), "PlacesServer getPlaceById");
        TEAM_STRING.put(Integer.valueOf(10244), "PlacesServer getAliases");
        TEAM_STRING.put(Integer.valueOf(10245), "PlacesServer setAliases");
        TEAM_STRING.put(Integer.valueOf(10246), "PlacesServer getAutocompletePredictions");
        TEAM_STRING.put(Integer.valueOf(10247), "PlacesServer getAutocompletePredictions (personalized)");
        TEAM_STRING.put(Integer.valueOf(10248), "PlacesServer getPlaceInferenceData");
        TEAM_STRING.put(Integer.valueOf(10249), "Beacon getInfoForObservedBeacons");
        TEAM_STRING.put(Integer.valueOf(10250), "LMP getPlaces");
        TEAM_STRING.put(Integer.valueOf(10251), "LMP getUserData");
        TEAM_STRING.put(Integer.valueOf(10252), "LMP writeLabeledPlace");
        TEAM_STRING.put(Integer.valueOf(10253), "LMP getQuerySuggestion");
        TEAM_STRING.put(Integer.valueOf(10254), "FIFE fetchImage");
        TEAM_STRING.put(Integer.valueOf(10255), "GLS addPlace");
        TEAM_STRING.put(Integer.valueOf(10256), "GLS getAutocompletePredictions");
        TEAM_STRING.put(Integer.valueOf(10257), "GLS getByLatLng");
        TEAM_STRING.put(Integer.valueOf(10258), "GLS getModelMapToClusterIdMappings");
        TEAM_STRING.put(Integer.valueOf(10259), "GLS getModelSelector");
        TEAM_STRING.put(Integer.valueOf(10260), "GLS getPhotoMetadata");
        TEAM_STRING.put(Integer.valueOf(10261), "GLS getPlaceById");
        TEAM_STRING.put(Integer.valueOf(10262), "GLS search");
        TEAM_STRING.put(Integer.valueOf(10263), "GLS updateQuotaAccountingStatus");
        TEAM_STRING.put(Integer.valueOf(10264), "PlacesServer getNearbyAlertDataById");
        TEAM_STRING.put(Integer.valueOf(10265), "PlacesServer getPlaceByLatLng");
        TEAM_STRING.put(Integer.valueOf(10266), "PlacesServer getPhotoMetadata");
        TEAM_STRING.put(Integer.valueOf(10268), "PlacesServer countOperation");
        TEAM_STRING.put(Integer.valueOf(3073), "Feedback SendReport");
        TEAM_STRING.put(Integer.valueOf(3074), "Feedback Suggestion");
        simplearraymap = new SimpleArrayMap(3);
        SPECIAL_STRING = simplearraymap;
        simplearraymap.put(Integer.valueOf(-255), "Download Manager");
        SPECIAL_STRING.put(Integer.valueOf(-254), "Media Player");
        SPECIAL_STRING.put(Integer.valueOf(-253), "Backup Transport");
        SPECIAL_STRING.put(Integer.valueOf(0x11440001), "Create contacts gmail.com");
        SPECIAL_STRING.put(Integer.valueOf(0x11440002), "Update contacts gmail.com");
        SPECIAL_STRING.put(Integer.valueOf(0x11440003), "Delete contacts gmail.com");
        SPECIAL_STRING.put(Integer.valueOf(0x11440004), "Photos contacts gmail.com");
        SPECIAL_STRING.put(Integer.valueOf(0x12440001), "Create groups gmail.com");
        SPECIAL_STRING.put(Integer.valueOf(0x12440002), "Update groups gmail.com");
        SPECIAL_STRING.put(Integer.valueOf(0x12440003), "Delete groups gmail.com");
        SPECIAL_STRING.put(Integer.valueOf(0x12440004), "Photos groups gmail.com");
        SPECIAL_STRING.put(Integer.valueOf(0x21440001), "Create contacts dasher");
        SPECIAL_STRING.put(Integer.valueOf(0x21440002), "Update contacts dasher");
        SPECIAL_STRING.put(Integer.valueOf(0x21440003), "Delete contacts dasher");
        SPECIAL_STRING.put(Integer.valueOf(0x21440004), "Photos contacts dasher");
        SPECIAL_STRING.put(Integer.valueOf(0x22440001), "Create groups dasher");
        SPECIAL_STRING.put(Integer.valueOf(0x22440002), "Update groups dasher");
        SPECIAL_STRING.put(Integer.valueOf(0x22440003), "Delete groups dasher");
        SPECIAL_STRING.put(Integer.valueOf(0x22440004), "Photos groups dasher");
        SPECIAL_STRING.put(Integer.valueOf(0x31440001), "Create contacts google.com");
        SPECIAL_STRING.put(Integer.valueOf(0x31440002), "Update contacts google.com");
        SPECIAL_STRING.put(Integer.valueOf(0x31440003), "Delete contacts google.com");
        SPECIAL_STRING.put(Integer.valueOf(0x31440004), "Photos contacts google.com");
        SPECIAL_STRING.put(Integer.valueOf(0x32440001), "Create groups google.com");
        SPECIAL_STRING.put(Integer.valueOf(0x32440002), "Update groups google.com");
        SPECIAL_STRING.put(Integer.valueOf(0x32440003), "Delete groups google.com");
        SPECIAL_STRING.put(Integer.valueOf(0x32440004), "Photos groups google.com");
        SPECIAL_STRING.put(Integer.valueOf(0x10480001), "GAL Feed gmail.com");
        SPECIAL_STRING.put(Integer.valueOf(0x10480002), "GAL Entry gmail.com");
        SPECIAL_STRING.put(Integer.valueOf(0x10480003), "GAL File gmail.com");
        SPECIAL_STRING.put(Integer.valueOf(0x20480001), "GAL Feed dasher");
        SPECIAL_STRING.put(Integer.valueOf(0x20480002), "GAL Entry dasher");
        SPECIAL_STRING.put(Integer.valueOf(0x20480003), "GAL File dasher");
        SPECIAL_STRING.put(Integer.valueOf(0x30480001), "GAL Feed google.com");
        SPECIAL_STRING.put(Integer.valueOf(0x30480002), "GAL Entry google.com");
        SPECIAL_STRING.put(Integer.valueOf(0x30480003), "GAL File google.com");
        SPECIAL_STRING.put(Integer.valueOf(0x75706474), "OTA (Legacy)");
    }
}
