// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.logging;


public final class Event extends Enum
{

    public static final Event API_LANG_CHANGE;
    public static final Event API_LANG_QUERY;
    public static final Event API_WITH_INPUT_MODE;
    public static final Event APP_LOAD;
    public static final Event APP_SHARED_LINK;
    public static final Event APP_SHARED_TEXT;
    public static final Event AUTO_LANG_SWAPPED;
    public static final Event BULK_UNSTARS_TRANSLATION;
    public static final Event CACHE_HIT_INSTANT;
    public static final Event CACHE_HIT_OFFLINE;
    public static final Event CACHE_HIT_ONLINE;
    public static final Event CAMERA_ALL_TEXT_SELECTED;
    public static final Event CAMERA_BACKBTN_HOME;
    public static final Event CAMERA_BACKBTN_RESTART;
    public static final Event CAMERA_CAMERA_ERROR;
    public static final Event CAMERA_CLEAR_TEXT;
    public static final Event CAMERA_LANG_SWAPPED;
    public static final Event CAMERA_NETWORK_ERROR;
    public static final Event CAMERA_NO_RESULT;
    public static final Event CAMERA_PAUSE;
    public static final Event CAMERA_SCAN;
    public static final Event CAMERA_SESSION;
    public static final Event CAMERA_SNAP;
    public static final Event CAMERA_START;
    public static final Event CAMERA_TEXT_RETURNED;
    public static final Event CAMERA_TEXT_SELECTED;
    public static final Event CAMERA_TRANSLATE_BTN;
    public static final Event CONV_SESSION;
    public static final Event CONV_SESSION_LANG1;
    public static final Event CONV_SESSION_LANG2;
    public static final Event CONV_STARTED_USING_BTN;
    public static final Event CONV_START_LENGTH;
    public static final Event COPYDROP_INPUT_TARGET_TTS;
    public static final Event COPYDROP_LANG1_PICKED;
    public static final Event COPYDROP_LANG1_PICKER_OPEN;
    public static final Event COPYDROP_LANG2_PICKED;
    public static final Event COPYDROP_LANG2_PICKER_OPEN;
    public static final Event COPYDROP_LANG_SWAPPED;
    public static final Event FAVORITES_VIEW_ITEM_EXPANSIONS;
    public static final Event FLASH_USED;
    public static final Event FOCUS_USED;
    public static final Event GOOGLE_LOGIN_CHANGE;
    public static final Event GOOGLE_SIGNIN;
    public static final Event GOOGLE_SIGNOUT;
    public static final Event HANDWRITING_RESIZED;
    public static final Event HISTORY_CLEAR_FROM_MENU;
    public static final Event HISTORY_CLICKED_IN_EDIT_MODE;
    public static final Event HISTORY_REMOVE;
    public static final Event HISTORY_REMOVE_ALL;
    public static final Event HISTORY_SHOWN_IN_EDIT_MODE;
    public static final Event HISTORY_VIEW_ITEM_EXPANSIONS;
    public static final Event INPUT_SWITCHED_TO_HANDWRITING;
    public static final Event INPUT_SWITCHED_TO_INPUT_TOOLS;
    public static final Event INPUT_SWITCHED_TO_KEYBOARD;
    public static final Event INPUT_TTS;
    public static final Event INSTANT_TRANSLATION_CLICKED;
    public static final Event INSTANT_TRANSLATION_SHOWN;
    public static final Event LANG1_PICKED;
    public static final Event LANG1_PICKER_OPEN;
    public static final Event LANG2_PICKED;
    public static final Event LANG2_PICKER_OPEN;
    public static final Event LANGID_CLICKED_IN_EDIT_MODE;
    public static final Event LANGID_CLICKED_ON_CHIP_VIEW;
    public static final Event LANGID_SHOWN_IN_EDIT_MODE;
    public static final Event LANGID_SHOWN_ON_CHIP_VIEW;
    public static final Event LANG_SWAPPED;
    public static final Event MANUAL_SYNC_REQUESTED;
    public static final Event NATIVE_SPEECH_OUT_OF_SYNC;
    public static final Event NATIVE_SPEECH_USED;
    public static final Event NETWORK_TTS_LOAD;
    public static final Event NEW_SHORTCUT;
    public static final Event OFFLINE_DOWNLOAD_FROM_ERROR_CARD;
    public static final Event OFFLINE_DOWNLOAD_FROM_PICKER;
    public static final Event OFFLINE_DOWNLOAD_FROM_SETTINGS;
    public static final Event OFFLINE_DOWNLOAD_RETRY_FROM_SETTINGS;
    public static final Event OFFLINE_ERROR_CARD_CLICKED;
    public static final Event OFFLINE_FILE_DOWNLOAD_COMPLETE;
    public static final Event OFFLINE_FILE_DOWNLOAD_FAILED;
    public static final Event OFFLINE_FILE_INSTALL_COMPLETE;
    public static final Event OFFLINE_FILE_INSTALL_FAILED;
    public static final Event OFFLINE_PROGRESS_CARD_CLICKED;
    public static final Event OFFLINE_SETUP_WIFI_CLICKED;
    public static final Event OFFLINE_SPEECH_MANAGEMENT_OPENED;
    public static final Event OPENED_BY_LINK;
    public static final Event OPENED_BY_SHORTCUT;
    public static final Event PHOTO_IMPORT_BUTTON;
    public static final Event PHOTO_IMPORT_PICKED;
    public static final Event QUICK_INPUT_TTS;
    public static final Event QUICK_LANG1_PICKED;
    public static final Event QUICK_LANG1_PICKER_OPEN;
    public static final Event QUICK_LANG2_PICKED;
    public static final Event QUICK_LANG2_PICKER_OPEN;
    public static final Event QUICK_RESULT_TTS;
    public static final Event QUICK_TRANSLATE_CANCEL;
    public static final Event QUICK_TRANSLATE_REPLACE;
    public static final Event QUICK_TRANSLATE_RO;
    public static final Event QUICK_TRANSLATE_RW;
    public static final Event RESULT_CONV;
    public static final Event RESULT_COPY;
    public static final Event RESULT_DICTIONARY_ENTRY_LOADED;
    public static final Event RESULT_FULLSCREEN;
    public static final Event RESULT_FULLSCREEN_GESTURE;
    public static final Event RESULT_REVERSE_TRANSLATE;
    public static final Event RESULT_SHARE;
    public static final Event RESULT_TTS;
    public static final Event S3_CONNECTED;
    public static final Event S3_SUCCESS;
    public static final Event S3_TTS_DOWNLOAD;
    public static final Event SMS_PICKER;
    public static final Event SPEAKERVIEW_TTS_STOPPED;
    public static final Event SPEECH_CORRECTED;
    public static final Event SPEECH_CROSS_TO_BACK1;
    public static final Event SPEECH_CROSS_TO_BACK2;
    public static final Event SPEECH_CROSS_TO_CLEAR1;
    public static final Event SPEECH_CROSS_TO_CLEAR2;
    public static final Event SPEECH_INPUT_PAUSED;
    public static final Event SPEECH_INPUT_PAUSED1;
    public static final Event SPEECH_INPUT_PAUSED2;
    public static final Event SPEECH_INPUT_USED;
    public static final Event SPEECH_SEE_DETAILS1;
    public static final Event SPEECH_SEE_DETAILS2;
    public static final Event SPEECH_SESSION;
    public static final Event SPEECH_TTS_REPLAYED;
    public static final Event SPEECH_TTS_START;
    public static final Event SPEECH_ZOOM_USING_BTN;
    public static final Event SPEECH_ZOOM_USING_GESTURE;
    public static final Event SPELL_CORRECTION_CLICKED_IN_EDIT_MODE;
    public static final Event SPELL_CORRECTION_CLICKED_ON_CHIP_VIEW;
    public static final Event SPELL_CORRECTION_SHOWN_IN_EDIT_MODE;
    public static final Event SPELL_CORRECTION_SHOWN_ON_CHIP_VIEW;
    public static final Event STARS_TRANSLATION;
    public static final Event TOUR_COMPLETED;
    public static final Event TTS_CACHE;
    public static final Event TTS_LOCAL;
    public static final Event TTS_TWS;
    public static final Event TWS_TTS_DOWNLOAD;
    public static final Event UNSTARS_TRANSLATION;
    public static final Event WALKIE_TALKIE_USED;
    public static final Event WORDLENS_ALL_TEXT_SELECTED;
    public static final Event WORDLENS_BACKBTN_HOME;
    public static final Event WORDLENS_BACKBTN_RESTART;
    public static final Event WORDLENS_CAMERA_ERROR;
    public static final Event WORDLENS_CLEAR_TEXT;
    public static final Event WORDLENS_DOWNLOAD_ERROR_CARD_CLICKED;
    public static final Event WORDLENS_DOWNLOAD_FROM_SETTINGS;
    public static final Event WORDLENS_DOWNLOAD_LIVE_SWITCHOVER;
    public static final Event WORDLENS_DOWNLOAD_PROGRESS_CARD_CLICKED;
    public static final Event WORDLENS_DOWNLOAD_RETRY_FROM_SETTINGS;
    public static final Event WORDLENS_FLASH_USED;
    public static final Event WORDLENS_FOCUS_USED;
    public static final Event WORDLENS_IMPORT_BUTTON;
    public static final Event WORDLENS_IMPORT_PICKED;
    public static final Event WORDLENS_LANG_SWAPPED;
    public static final Event WORDLENS_NETWORK_ERROR;
    public static final Event WORDLENS_NO_RESULT;
    public static final Event WORDLENS_PAUSE;
    public static final Event WORDLENS_SCAN;
    public static final Event WORDLENS_SESSION;
    public static final Event WORDLENS_SNAP;
    public static final Event WORDLENS_START;
    public static final Event WORDLENS_TEXT_RETURNED;
    public static final Event WORDLENS_TEXT_SELECTED;
    public static final Event WORDLENS_TRANSLATE_BTN;
    private static final Event a[];
    private final String mAnalyticsCategoryName;
    private final String mAnalyticsEventName;
    private final String mTagName;

    private Event(String s, int i, String s1, String s2, String s3)
    {
        super(s, i);
        mTagName = s1;
        mAnalyticsEventName = s2;
        mAnalyticsCategoryName = s3;
    }

    public static Event valueOf(String s)
    {
        return (Event)Enum.valueOf(com/google/android/libraries/translate/logging/Event, s);
    }

    public static Event[] values()
    {
        return (Event[])a.clone();
    }

    public final String analyticsCategoryName()
    {
        return mAnalyticsCategoryName;
    }

    public final String analyticsEventName()
    {
        return mAnalyticsEventName;
    }

    public final String tagName()
    {
        return mTagName;
    }

    static 
    {
        FAVORITES_VIEW_ITEM_EXPANSIONS = new Event("FAVORITES_VIEW_ITEM_EXPANSIONS", 0, "fvrie", "expand", "phrasebook");
        STARS_TRANSLATION = new Event("STARS_TRANSLATION", 1, "star", "star", "phrasebook");
        UNSTARS_TRANSLATION = new Event("UNSTARS_TRANSLATION", 2, "unstar", "unstar", "phrasebook");
        BULK_UNSTARS_TRANSLATION = new Event("BULK_UNSTARS_TRANSLATION", 3, "bunstar", "bulk_unstar", "phrasebook");
        MANUAL_SYNC_REQUESTED = new Event("MANUAL_SYNC_REQUESTED", 4, "msync", "manual_sync", "phrasebook");
        OFFLINE_DOWNLOAD_FROM_ERROR_CARD = new Event("OFFLINE_DOWNLOAD_FROM_ERROR_CARD", 5, "oldnec", "download_error", "offline_package");
        OFFLINE_DOWNLOAD_FROM_PICKER = new Event("OFFLINE_DOWNLOAD_FROM_PICKER", 6, "oldnpk", "download_picker", "offline_package");
        OFFLINE_DOWNLOAD_FROM_SETTINGS = new Event("OFFLINE_DOWNLOAD_FROM_SETTINGS", 7, "oldnst", "download_settings", "offline_package");
        OFFLINE_DOWNLOAD_RETRY_FROM_SETTINGS = new Event("OFFLINE_DOWNLOAD_RETRY_FROM_SETTINGS", 8, "oldrnst", "download_retry_settings", "offline_package");
        OFFLINE_FILE_DOWNLOAD_COMPLETE = new Event("OFFLINE_FILE_DOWNLOAD_COMPLETE", 9, "offdc", "file_download_complete", "offline_package");
        OFFLINE_FILE_DOWNLOAD_FAILED = new Event("OFFLINE_FILE_DOWNLOAD_FAILED", 10, "offdf", "file_download_failed", "offline_package");
        OFFLINE_FILE_INSTALL_COMPLETE = new Event("OFFLINE_FILE_INSTALL_COMPLETE", 11, "ofinc", "file_install_complete", "offline_package");
        OFFLINE_FILE_INSTALL_FAILED = new Event("OFFLINE_FILE_INSTALL_FAILED", 12, "ofinf", "file_install_failed", "offline_package");
        OFFLINE_ERROR_CARD_CLICKED = new Event("OFFLINE_ERROR_CARD_CLICKED", 13, "ofecc", "error_card_clicked", "offline_package");
        OFFLINE_PROGRESS_CARD_CLICKED = new Event("OFFLINE_PROGRESS_CARD_CLICKED", 14, "ofpcc", "progress_card_clicked", "offline_package");
        OFFLINE_SPEECH_MANAGEMENT_OPENED = new Event("OFFLINE_SPEECH_MANAGEMENT_OPENED", 15, "ofsmo", "speech_management_opened", "offline_package");
        OFFLINE_SETUP_WIFI_CLICKED = new Event("OFFLINE_SETUP_WIFI_CLICKED", 16, "ofswc", "setup_wifi_clicked", "offline_package");
        WORDLENS_DOWNLOAD_FROM_SETTINGS = new Event("WORDLENS_DOWNLOAD_FROM_SETTINGS", 17, "wldnst", "wl_download_settings", "wordlens_package");
        WORDLENS_DOWNLOAD_RETRY_FROM_SETTINGS = new Event("WORDLENS_DOWNLOAD_RETRY_FROM_SETTINGS", 18, "wldrnst", "wl_download_retry_settings", "wordlens_package");
        WORDLENS_DOWNLOAD_LIVE_SWITCHOVER = new Event("WORDLENS_DOWNLOAD_LIVE_SWITCHOVER", 19, "ofwlsw", "wl_live_switchover", "wordlens_package");
        WORDLENS_DOWNLOAD_ERROR_CARD_CLICKED = new Event("WORDLENS_DOWNLOAD_ERROR_CARD_CLICKED", 20, "ofwlecc", "wl_error_card_clicked", "wordlens_package");
        WORDLENS_DOWNLOAD_PROGRESS_CARD_CLICKED = new Event("WORDLENS_DOWNLOAD_PROGRESS_CARD_CLICKED", 21, "ofwlprcc", "wl_progress_card_clicked", "wordlens_package");
        HISTORY_VIEW_ITEM_EXPANSIONS = new Event("HISTORY_VIEW_ITEM_EXPANSIONS", 22, "hsrie", "expand", "history");
        HISTORY_REMOVE = new Event("HISTORY_REMOVE", 23, "hrem", "remove", "history");
        HISTORY_REMOVE_ALL = new Event("HISTORY_REMOVE_ALL", 24, "hremall", "remove_all", "history");
        HISTORY_CLEAR_FROM_MENU = new Event("HISTORY_CLEAR_FROM_MENU", 25, "hclmnu", "history_clear_from_menu", "history");
        GOOGLE_SIGNIN = new Event("GOOGLE_SIGNIN", 26, "glogin", "glogin", "account");
        GOOGLE_SIGNOUT = new Event("GOOGLE_SIGNOUT", 27, "glogout", "glogout", "account");
        GOOGLE_LOGIN_CHANGE = new Event("GOOGLE_LOGIN_CHANGE", 28, "gchange", "glogin_change", "account");
        RESULT_COPY = new Event("RESULT_COPY", 29, "cvtcp", "copy_trg", "result");
        RESULT_SHARE = new Event("RESULT_SHARE", 30, "cvtshr", "share_trg", "result");
        RESULT_FULLSCREEN = new Event("RESULT_FULLSCREEN", 31, "cvtspsz", "supersize", "result");
        RESULT_FULLSCREEN_GESTURE = new Event("RESULT_FULLSCREEN_GESTURE", 32, "fsges", "supersize_auto", "result");
        RESULT_TTS = new Event("RESULT_TTS", 33, "cvttts", "tts_trg", "result");
        RESULT_REVERSE_TRANSLATE = new Event("RESULT_REVERSE_TRANSLATE", 34, "revtrs", "reverse_translate", "result");
        RESULT_CONV = new Event("RESULT_CONV", 35, "resconv", "result_conv", "result");
        RESULT_DICTIONARY_ENTRY_LOADED = new Event("RESULT_DICTIONARY_ENTRY_LOADED", 36, "rediel", "dictionary_entry_loaded", "result");
        INPUT_TTS = new Event("INPUT_TTS", 37, "inptts", "tts_src", "result");
        TTS_TWS = new Event("TTS_TWS", 38, "ttsplaytws", "tts_play_tws", "tts");
        TTS_LOCAL = new Event("TTS_LOCAL", 39, "ttsplaylocal", "tts_play_local", "tts");
        TTS_CACHE = new Event("TTS_CACHE", 40, "ttsplaycache", "tts_play_cache", "tts");
        APP_LOAD = new Event("APP_LOAD", 41, "appcr", "app", "loading");
        APP_SHARED_TEXT = new Event("APP_SHARED_TEXT", 42, "shtxt", "share_text", "app_usage");
        APP_SHARED_LINK = new Event("APP_SHARED_LINK", 43, "wbtr", "share_link", "app_usage");
        OPENED_BY_LINK = new Event("OPENED_BY_LINK", 44, "oplnk", "opened_by_link", "app_usage");
        SMS_PICKER = new Event("SMS_PICKER", 45, "sms", "sms_picker", "app_usage");
        NEW_SHORTCUT = new Event("NEW_SHORTCUT", 46, "nwshrt", "new_shortcut", "app_usage");
        OPENED_BY_SHORTCUT = new Event("OPENED_BY_SHORTCUT", 47, "opshrt", "opened_by_shortcut", "app_usage");
        API_WITH_INPUT_MODE = new Event("API_WITH_INPUT_MODE", 48, "apiopen", "opened_by_api_intent", "app_usage");
        API_LANG_QUERY = new Event("API_LANG_QUERY", 49, "apiqrylang", "api_intent_lang_support_query", "app_usage");
        API_LANG_CHANGE = new Event("API_LANG_CHANGE", 50, "apisetlang", "api_intent_set_lang_pair", "app_usage");
        LANG1_PICKER_OPEN = new Event("LANG1_PICKER_OPEN", 51, "l1pio", "lang1_picker_open", "app_usage");
        LANG2_PICKER_OPEN = new Event("LANG2_PICKER_OPEN", 52, "l2pio", "lang2_picker_open", "app_usage");
        LANG1_PICKED = new Event("LANG1_PICKED", 53, "l1pck", "lang1_picked", "app_usage");
        LANG2_PICKED = new Event("LANG2_PICKED", 54, "l2pck", "lang2_picked", "app_usage");
        AUTO_LANG_SWAPPED = new Event("AUTO_LANG_SWAPPED", 55, "autoswap", "auto_lang_swapped", "app_usage");
        LANG_SWAPPED = new Event("LANG_SWAPPED", 56, "langswap", "lang_swapped", "app_usage");
        CAMERA_LANG_SWAPPED = new Event("CAMERA_LANG_SWAPPED", 57, "cmrlangswap", "camera_lang_swapped", "app_usage");
        WORDLENS_LANG_SWAPPED = new Event("WORDLENS_LANG_SWAPPED", 58, "wllangswap", "wordlens_lang_swapped", "app_usage");
        HANDWRITING_RESIZED = new Event("HANDWRITING_RESIZED", 59, "hdres", "handwriting_resized", "app_usage");
        TOUR_COMPLETED = new Event("TOUR_COMPLETED", 60, "trcmp", "tour_completed", "app_usage");
        QUICK_TRANSLATE_RO = new Event("QUICK_TRANSLATE_RO", 61, "qtro", "quick_translate_ro", "quick");
        QUICK_TRANSLATE_RW = new Event("QUICK_TRANSLATE_RW", 62, "qtrw", "quick_translate_rw", "quick");
        QUICK_TRANSLATE_REPLACE = new Event("QUICK_TRANSLATE_REPLACE", 63, "qtrep", "quick_translate_replaced", "quick");
        QUICK_TRANSLATE_CANCEL = new Event("QUICK_TRANSLATE_CANCEL", 64, "qtcancel", "quick_translate_cancelled", "quick");
        QUICK_LANG1_PICKER_OPEN = new Event("QUICK_LANG1_PICKER_OPEN", 65, "qtl1pio", "quick_lang1_picker_open", "quick");
        QUICK_LANG2_PICKER_OPEN = new Event("QUICK_LANG2_PICKER_OPEN", 66, "qtl2pio", "quick_lang2_picker_open", "quick");
        QUICK_LANG1_PICKED = new Event("QUICK_LANG1_PICKED", 67, "qtl1pck", "quick_lang1_picked", "quick");
        QUICK_LANG2_PICKED = new Event("QUICK_LANG2_PICKED", 68, "qtl2pck", "quick_lang2_picked", "quick");
        QUICK_RESULT_TTS = new Event("QUICK_RESULT_TTS", 69, "qtttstrg", "tts_trg_quick", "quick");
        QUICK_INPUT_TTS = new Event("QUICK_INPUT_TTS", 70, "qtttssrc", "tts_src_quick", "quick");
        CACHE_HIT_ONLINE = new Event("CACHE_HIT_ONLINE", 71, "chehit", "cache_online", "translation");
        CACHE_HIT_INSTANT = new Event("CACHE_HIT_INSTANT", 72, "inchehit", "cache_instant", "translation");
        CACHE_HIT_OFFLINE = new Event("CACHE_HIT_OFFLINE", 73, "ofchehit", "cache_offline", "translation");
        CAMERA_SESSION = new Event("CAMERA_SESSION", 74, "camse", "camera_session", "translation");
        WORDLENS_SESSION = new Event("WORDLENS_SESSION", 75, "wlse", "wordlens_session", "translation");
        SPEECH_SESSION = new Event("SPEECH_SESSION", 76, "spse", "speech_session", "translation");
        CONV_SESSION = new Event("CONV_SESSION", 77, "cvse", "conv_session", "translation");
        CONV_SESSION_LANG1 = new Event("CONV_SESSION_LANG1", 78, "cvsel1", "conv_session_lang1", "translation");
        CONV_SESSION_LANG2 = new Event("CONV_SESSION_LANG2", 79, "cvsel2", "conv_session_lang2", "translation");
        COPYDROP_LANG1_PICKER_OPEN = new Event("COPYDROP_LANG1_PICKER_OPEN", 80, "cdl1pio", "copydrop_lang1_picker_open", "copydrop");
        COPYDROP_LANG2_PICKER_OPEN = new Event("COPYDROP_LANG2_PICKER_OPEN", 81, "cdl2pio", "copydrop_lang2_picker_open", "copydrop");
        COPYDROP_LANG1_PICKED = new Event("COPYDROP_LANG1_PICKED", 82, "cdl1pck", "copydrop_lang1_picked", "copydrop");
        COPYDROP_LANG2_PICKED = new Event("COPYDROP_LANG2_PICKED", 83, "cdl2pck", "copydrop_lang2_picked", "copydrop");
        COPYDROP_LANG_SWAPPED = new Event("COPYDROP_LANG_SWAPPED", 84, "cdlangsw", "copydrop_lang_swapped", "copydrop");
        COPYDROP_INPUT_TARGET_TTS = new Event("COPYDROP_INPUT_TARGET_TTS", 85, "cdittssrc", "copydrop_input_target_tts", "copydrop");
        SPELL_CORRECTION_SHOWN_IN_EDIT_MODE = new Event("SPELL_CORRECTION_SHOWN_IN_EDIT_MODE", 86, "iescs", "suggest_shown_in_edit", "suggest");
        LANGID_SHOWN_IN_EDIT_MODE = new Event("LANGID_SHOWN_IN_EDIT_MODE", 87, "ielid", "langid_shown_in_edit", "suggest");
        SPELL_CORRECTION_SHOWN_ON_CHIP_VIEW = new Event("SPELL_CORRECTION_SHOWN_ON_CHIP_VIEW", 88, "icscs", "suggest_shown_in_result", "suggest");
        LANGID_SHOWN_ON_CHIP_VIEW = new Event("LANGID_SHOWN_ON_CHIP_VIEW", 89, "iclid", "langid_shown_in_result", "suggest");
        HISTORY_SHOWN_IN_EDIT_MODE = new Event("HISTORY_SHOWN_IN_EDIT_MODE", 90, "iehst", "history_shown_in_edit", "suggest");
        INSTANT_TRANSLATION_SHOWN = new Event("INSTANT_TRANSLATION_SHOWN", 91, "ipit", "instant_shown_in_edit", "suggest");
        SPELL_CORRECTION_CLICKED_IN_EDIT_MODE = new Event("SPELL_CORRECTION_CLICKED_IN_EDIT_MODE", 92, "cescs", "suggest_clicked_in_edit", "suggest");
        LANGID_CLICKED_IN_EDIT_MODE = new Event("LANGID_CLICKED_IN_EDIT_MODE", 93, "celid", "langid_clicked_in_edit", "suggest");
        SPELL_CORRECTION_CLICKED_ON_CHIP_VIEW = new Event("SPELL_CORRECTION_CLICKED_ON_CHIP_VIEW", 94, "ccscs", "suggest_clicked_in_result", "suggest");
        LANGID_CLICKED_ON_CHIP_VIEW = new Event("LANGID_CLICKED_ON_CHIP_VIEW", 95, "cclid", "langid_clicked_in_result", "suggest");
        HISTORY_CLICKED_IN_EDIT_MODE = new Event("HISTORY_CLICKED_IN_EDIT_MODE", 96, "cehst", "history_clicked_in_edit", "suggest");
        INSTANT_TRANSLATION_CLICKED = new Event("INSTANT_TRANSLATION_CLICKED", 97, "epit", "instant_clicked_in_edit", "suggest");
        CAMERA_SNAP = new Event("CAMERA_SNAP", 98, "cmrsnap", "camera_snap", "camera");
        CAMERA_SCAN = new Event("CAMERA_SCAN", 99, "cmrscan", "camera_scan", "camera");
        CAMERA_PAUSE = new Event("CAMERA_PAUSE", 100, "cmrpause", "camera_pause", "camera");
        CAMERA_START = new Event("CAMERA_START", 101, "cmrstart", "camera_start", "camera");
        CAMERA_TEXT_RETURNED = new Event("CAMERA_TEXT_RETURNED", 102, "cmrtxtret", "camera_text_returned", "camera");
        CAMERA_TEXT_SELECTED = new Event("CAMERA_TEXT_SELECTED", 103, "cmrtxtsel", "camera_text_selected", "camera");
        CAMERA_ALL_TEXT_SELECTED = new Event("CAMERA_ALL_TEXT_SELECTED", 104, "cmrtxtallsel", "camera_all_text_selected", "camera");
        CAMERA_NO_RESULT = new Event("CAMERA_NO_RESULT", 105, "cmrnoresult", "camera_no_result", "camera");
        PHOTO_IMPORT_BUTTON = new Event("PHOTO_IMPORT_BUTTON", 106, "cmimptb", "camera_importbtn", "camera");
        PHOTO_IMPORT_PICKED = new Event("PHOTO_IMPORT_PICKED", 107, "cmphimptp", "camera_import_picked", "camera");
        FLASH_USED = new Event("FLASH_USED", 108, "cmflud", "flash_used", "camera");
        FOCUS_USED = new Event("FOCUS_USED", 109, "cmfocus", "camera_focus_used", "camera");
        CAMERA_CLEAR_TEXT = new Event("CAMERA_CLEAR_TEXT", 110, "cmcltxt", "camera_clear_text", "camera");
        CAMERA_TRANSLATE_BTN = new Event("CAMERA_TRANSLATE_BTN", 111, "cmtrnbtn", "camera_translate_btn", "camera");
        CAMERA_CAMERA_ERROR = new Event("CAMERA_CAMERA_ERROR", 112, "cmerr", "camera_error", "camera");
        CAMERA_NETWORK_ERROR = new Event("CAMERA_NETWORK_ERROR", 113, "cmntwkerr", "camera_network_error", "camera");
        CAMERA_BACKBTN_RESTART = new Event("CAMERA_BACKBTN_RESTART", 114, "cmnbkrst", "camera_backbtn_restart", "camera");
        CAMERA_BACKBTN_HOME = new Event("CAMERA_BACKBTN_HOME", 115, "cmnbkhome", "camera_backbtn_home", "camera");
        WORDLENS_SNAP = new Event("WORDLENS_SNAP", 116, "wlsnap", "camera_wl_cloudhance", "wordlens");
        WORDLENS_SCAN = new Event("WORDLENS_SCAN", 117, "wlscan", "camera_wl_scan", "wordlens");
        WORDLENS_PAUSE = new Event("WORDLENS_PAUSE", 118, "wlpause", "camera_wl_pause", "wordlens");
        WORDLENS_START = new Event("WORDLENS_START", 119, "wlstart", "camera_wl_start", "wordlens");
        WORDLENS_TEXT_RETURNED = new Event("WORDLENS_TEXT_RETURNED", 120, "wltxtret", "camera_wl_text_returned", "wordlens");
        WORDLENS_TEXT_SELECTED = new Event("WORDLENS_TEXT_SELECTED", 121, "wltxtsel", "camera_wl_text_selected", "wordlens");
        WORDLENS_ALL_TEXT_SELECTED = new Event("WORDLENS_ALL_TEXT_SELECTED", 122, "wltxtallsel", "camera_wl_all_text_selected", "wordlens");
        WORDLENS_NO_RESULT = new Event("WORDLENS_NO_RESULT", 123, "wlnoresult", "camera_wl_no_result", "wordlens");
        WORDLENS_IMPORT_BUTTON = new Event("WORDLENS_IMPORT_BUTTON", 124, "wlphimptb", "camera_wl_importbtn", "wordlens");
        WORDLENS_IMPORT_PICKED = new Event("WORDLENS_IMPORT_PICKED", 125, "wlphimptp", "camera_wl_import_picked", "wordlens");
        WORDLENS_FLASH_USED = new Event("WORDLENS_FLASH_USED", 126, "wlflud", "flash_wl_used", "wordlens");
        WORDLENS_FOCUS_USED = new Event("WORDLENS_FOCUS_USED", 127, "wlfocus", "camera_wl_focus_used", "camera");
        WORDLENS_CLEAR_TEXT = new Event("WORDLENS_CLEAR_TEXT", 128, "wlcltxt", "camera_wl_clear_text", "camera");
        WORDLENS_TRANSLATE_BTN = new Event("WORDLENS_TRANSLATE_BTN", 129, "wltrnbtn", "camera_wl_translate_btn", "camera");
        WORDLENS_CAMERA_ERROR = new Event("WORDLENS_CAMERA_ERROR", 130, "wlerror", "camera_wl_error", "camera");
        WORDLENS_NETWORK_ERROR = new Event("WORDLENS_NETWORK_ERROR", 131, "wlntwkerror", "camera_wl_network_error", "camera");
        WORDLENS_BACKBTN_RESTART = new Event("WORDLENS_BACKBTN_RESTART", 132, "wlnbkrst", "camera_wl_backbtn_restart", "camera");
        WORDLENS_BACKBTN_HOME = new Event("WORDLENS_BACKBTN_HOME", 133, "wlnbkhome", "camera_wl_backbtn_home", "camera");
        SPEECH_INPUT_USED = new Event("SPEECH_INPUT_USED", 134, "spinus", "speech_input_used", "speech");
        WALKIE_TALKIE_USED = new Event("WALKIE_TALKIE_USED", 135, "wktkus", "walkie_talkie_used", "speech");
        S3_CONNECTED = new Event("S3_CONNECTED", 136, "s3cnt", "s3_connected", "speech");
        S3_SUCCESS = new Event("S3_SUCCESS", 137, "s3scs", "s3_success", "speech");
        NATIVE_SPEECH_OUT_OF_SYNC = new Event("NATIVE_SPEECH_OUT_OF_SYNC", 138, "nsoos", "native_speech_out_of_sync", "speech");
        SPEECH_ZOOM_USING_BTN = new Event("SPEECH_ZOOM_USING_BTN", 139, "szbtn", "speech_zoom_btn", "speech");
        SPEECH_ZOOM_USING_GESTURE = new Event("SPEECH_ZOOM_USING_GESTURE", 140, "szges", "speech_zoom_gesture", "speech");
        SPEECH_CORRECTED = new Event("SPEECH_CORRECTED", 141, "spcrr", "speech_corrected", "speech");
        SPEECH_TTS_REPLAYED = new Event("SPEECH_TTS_REPLAYED", 142, "sttrp", "speech_tts_replayed", "speech");
        SPEECH_INPUT_PAUSED = new Event("SPEECH_INPUT_PAUSED", 143, "spipsd", "speech_input_paused", "speech");
        SPEECH_INPUT_PAUSED1 = new Event("SPEECH_INPUT_PAUSED1", 144, "spipsd1", "speech_input_paused1", "speech");
        SPEECH_INPUT_PAUSED2 = new Event("SPEECH_INPUT_PAUSED2", 145, "spipsd2", "speech_input_paused2", "speech");
        CONV_STARTED_USING_BTN = new Event("CONV_STARTED_USING_BTN", 146, "cvstbt", "conv_started_using_btn", "speech");
        CONV_START_LENGTH = new Event("CONV_START_LENGTH", 147, "cvstln", "conv_start_length", "speech");
        NATIVE_SPEECH_USED = new Event("NATIVE_SPEECH_USED", 148, "nasud", "native_speech_used", "speech");
        SPEECH_CROSS_TO_BACK1 = new Event("SPEECH_CROSS_TO_BACK1", 149, "spxbk1", "speech_x_back1", "speech");
        SPEECH_CROSS_TO_BACK2 = new Event("SPEECH_CROSS_TO_BACK2", 150, "spxbk2", "speech_x_back2", "speech");
        SPEECH_CROSS_TO_CLEAR1 = new Event("SPEECH_CROSS_TO_CLEAR1", 151, "spxcl1", "speech_x_clear1", "speech");
        SPEECH_CROSS_TO_CLEAR2 = new Event("SPEECH_CROSS_TO_CLEAR2", 152, "spxcl2", "speech_x_clear2", "speech");
        SPEECH_SEE_DETAILS1 = new Event("SPEECH_SEE_DETAILS1", 153, "spdetails1", "speech_see_details1", "speech");
        SPEECH_SEE_DETAILS2 = new Event("SPEECH_SEE_DETAILS2", 154, "spdetails2", "speech_see_details2", "speech");
        SPEECH_TTS_START = new Event("SPEECH_TTS_START", 155, "convttsstart", "conv_tts_started", "speech");
        INPUT_SWITCHED_TO_KEYBOARD = new Event("INPUT_SWITCHED_TO_KEYBOARD", 156, "inskey", "input_switch_keyboard", "keyboard_handwriting");
        INPUT_SWITCHED_TO_INPUT_TOOLS = new Event("INPUT_SWITCHED_TO_INPUT_TOOLS", 157, "insint", "input_switch_inputtools", "keyboard_handwriting");
        INPUT_SWITCHED_TO_HANDWRITING = new Event("INPUT_SWITCHED_TO_HANDWRITING", 158, "inshan", "input_switch_handwriting", "keyboard_handwriting");
        NETWORK_TTS_LOAD = new Event("NETWORK_TTS_LOAD", 159, "nwttsl", "network_tts_load", "tts");
        SPEAKERVIEW_TTS_STOPPED = new Event("SPEAKERVIEW_TTS_STOPPED", 160, "sttst", "speakerview_tts_stopped", "tts");
        S3_TTS_DOWNLOAD = new Event("S3_TTS_DOWNLOAD", 161, "s3ttsdl", "s3_tts_download", "tts");
        TWS_TTS_DOWNLOAD = new Event("TWS_TTS_DOWNLOAD", 162, "twsttsdl", "tws_tts_download", "tts");
        a = (new Event[] {
            FAVORITES_VIEW_ITEM_EXPANSIONS, STARS_TRANSLATION, UNSTARS_TRANSLATION, BULK_UNSTARS_TRANSLATION, MANUAL_SYNC_REQUESTED, OFFLINE_DOWNLOAD_FROM_ERROR_CARD, OFFLINE_DOWNLOAD_FROM_PICKER, OFFLINE_DOWNLOAD_FROM_SETTINGS, OFFLINE_DOWNLOAD_RETRY_FROM_SETTINGS, OFFLINE_FILE_DOWNLOAD_COMPLETE, 
            OFFLINE_FILE_DOWNLOAD_FAILED, OFFLINE_FILE_INSTALL_COMPLETE, OFFLINE_FILE_INSTALL_FAILED, OFFLINE_ERROR_CARD_CLICKED, OFFLINE_PROGRESS_CARD_CLICKED, OFFLINE_SPEECH_MANAGEMENT_OPENED, OFFLINE_SETUP_WIFI_CLICKED, WORDLENS_DOWNLOAD_FROM_SETTINGS, WORDLENS_DOWNLOAD_RETRY_FROM_SETTINGS, WORDLENS_DOWNLOAD_LIVE_SWITCHOVER, 
            WORDLENS_DOWNLOAD_ERROR_CARD_CLICKED, WORDLENS_DOWNLOAD_PROGRESS_CARD_CLICKED, HISTORY_VIEW_ITEM_EXPANSIONS, HISTORY_REMOVE, HISTORY_REMOVE_ALL, HISTORY_CLEAR_FROM_MENU, GOOGLE_SIGNIN, GOOGLE_SIGNOUT, GOOGLE_LOGIN_CHANGE, RESULT_COPY, 
            RESULT_SHARE, RESULT_FULLSCREEN, RESULT_FULLSCREEN_GESTURE, RESULT_TTS, RESULT_REVERSE_TRANSLATE, RESULT_CONV, RESULT_DICTIONARY_ENTRY_LOADED, INPUT_TTS, TTS_TWS, TTS_LOCAL, 
            TTS_CACHE, APP_LOAD, APP_SHARED_TEXT, APP_SHARED_LINK, OPENED_BY_LINK, SMS_PICKER, NEW_SHORTCUT, OPENED_BY_SHORTCUT, API_WITH_INPUT_MODE, API_LANG_QUERY, 
            API_LANG_CHANGE, LANG1_PICKER_OPEN, LANG2_PICKER_OPEN, LANG1_PICKED, LANG2_PICKED, AUTO_LANG_SWAPPED, LANG_SWAPPED, CAMERA_LANG_SWAPPED, WORDLENS_LANG_SWAPPED, HANDWRITING_RESIZED, 
            TOUR_COMPLETED, QUICK_TRANSLATE_RO, QUICK_TRANSLATE_RW, QUICK_TRANSLATE_REPLACE, QUICK_TRANSLATE_CANCEL, QUICK_LANG1_PICKER_OPEN, QUICK_LANG2_PICKER_OPEN, QUICK_LANG1_PICKED, QUICK_LANG2_PICKED, QUICK_RESULT_TTS, 
            QUICK_INPUT_TTS, CACHE_HIT_ONLINE, CACHE_HIT_INSTANT, CACHE_HIT_OFFLINE, CAMERA_SESSION, WORDLENS_SESSION, SPEECH_SESSION, CONV_SESSION, CONV_SESSION_LANG1, CONV_SESSION_LANG2, 
            COPYDROP_LANG1_PICKER_OPEN, COPYDROP_LANG2_PICKER_OPEN, COPYDROP_LANG1_PICKED, COPYDROP_LANG2_PICKED, COPYDROP_LANG_SWAPPED, COPYDROP_INPUT_TARGET_TTS, SPELL_CORRECTION_SHOWN_IN_EDIT_MODE, LANGID_SHOWN_IN_EDIT_MODE, SPELL_CORRECTION_SHOWN_ON_CHIP_VIEW, LANGID_SHOWN_ON_CHIP_VIEW, 
            HISTORY_SHOWN_IN_EDIT_MODE, INSTANT_TRANSLATION_SHOWN, SPELL_CORRECTION_CLICKED_IN_EDIT_MODE, LANGID_CLICKED_IN_EDIT_MODE, SPELL_CORRECTION_CLICKED_ON_CHIP_VIEW, LANGID_CLICKED_ON_CHIP_VIEW, HISTORY_CLICKED_IN_EDIT_MODE, INSTANT_TRANSLATION_CLICKED, CAMERA_SNAP, CAMERA_SCAN, 
            CAMERA_PAUSE, CAMERA_START, CAMERA_TEXT_RETURNED, CAMERA_TEXT_SELECTED, CAMERA_ALL_TEXT_SELECTED, CAMERA_NO_RESULT, PHOTO_IMPORT_BUTTON, PHOTO_IMPORT_PICKED, FLASH_USED, FOCUS_USED, 
            CAMERA_CLEAR_TEXT, CAMERA_TRANSLATE_BTN, CAMERA_CAMERA_ERROR, CAMERA_NETWORK_ERROR, CAMERA_BACKBTN_RESTART, CAMERA_BACKBTN_HOME, WORDLENS_SNAP, WORDLENS_SCAN, WORDLENS_PAUSE, WORDLENS_START, 
            WORDLENS_TEXT_RETURNED, WORDLENS_TEXT_SELECTED, WORDLENS_ALL_TEXT_SELECTED, WORDLENS_NO_RESULT, WORDLENS_IMPORT_BUTTON, WORDLENS_IMPORT_PICKED, WORDLENS_FLASH_USED, WORDLENS_FOCUS_USED, WORDLENS_CLEAR_TEXT, WORDLENS_TRANSLATE_BTN, 
            WORDLENS_CAMERA_ERROR, WORDLENS_NETWORK_ERROR, WORDLENS_BACKBTN_RESTART, WORDLENS_BACKBTN_HOME, SPEECH_INPUT_USED, WALKIE_TALKIE_USED, S3_CONNECTED, S3_SUCCESS, NATIVE_SPEECH_OUT_OF_SYNC, SPEECH_ZOOM_USING_BTN, 
            SPEECH_ZOOM_USING_GESTURE, SPEECH_CORRECTED, SPEECH_TTS_REPLAYED, SPEECH_INPUT_PAUSED, SPEECH_INPUT_PAUSED1, SPEECH_INPUT_PAUSED2, CONV_STARTED_USING_BTN, CONV_START_LENGTH, NATIVE_SPEECH_USED, SPEECH_CROSS_TO_BACK1, 
            SPEECH_CROSS_TO_BACK2, SPEECH_CROSS_TO_CLEAR1, SPEECH_CROSS_TO_CLEAR2, SPEECH_SEE_DETAILS1, SPEECH_SEE_DETAILS2, SPEECH_TTS_START, INPUT_SWITCHED_TO_KEYBOARD, INPUT_SWITCHED_TO_INPUT_TOOLS, INPUT_SWITCHED_TO_HANDWRITING, NETWORK_TTS_LOAD, 
            SPEAKERVIEW_TTS_STOPPED, S3_TTS_DOWNLOAD, TWS_TTS_DOWNLOAD
        });
    }
}
