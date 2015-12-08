// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.common.value;

import com.kohls.mcommerce.opal.modules.lnr.common.util.LnRUtility;

public interface LnRConstantValues
{
    public static final class ShareFeatureHostScreen extends Enum
    {

        private static final ShareFeatureHostScreen $VALUES[];
        public static final ShareFeatureHostScreen LIST_DETAILS_SCREEN;
        public static final ShareFeatureHostScreen PRODUCT_DETAILS_SCREEN;

        public static ShareFeatureHostScreen valueOf(String s)
        {
            return (ShareFeatureHostScreen)Enum.valueOf(com/kohls/mcommerce/opal/modules/lnr/common/value/LnRConstantValues$ShareFeatureHostScreen, s);
        }

        public static ShareFeatureHostScreen[] values()
        {
            return (ShareFeatureHostScreen[])$VALUES.clone();
        }

        static 
        {
            PRODUCT_DETAILS_SCREEN = new ShareFeatureHostScreen("PRODUCT_DETAILS_SCREEN", 0);
            LIST_DETAILS_SCREEN = new ShareFeatureHostScreen("LIST_DETAILS_SCREEN", 1);
            $VALUES = (new ShareFeatureHostScreen[] {
                PRODUCT_DETAILS_SCREEN, LIST_DETAILS_SCREEN
            });
        }

        private ShareFeatureHostScreen(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String ABT_BABY_MODULE_NAMES[] = {
        "Baby_Block_2_Text", "Baby_Block_4_Catalog", "Baby_Block_5_Checklist", "Baby_Block_6_Gift_Card", "Baby_Block_6_Gift_Card_Shop", "Baby_Block_7_Features", "Baby_Block_8_Completion", "Baby_Block_9_Announcement", "Baby_Block_10_Share", "Baby_Block_11_Easy_Returns", 
        "Baby_Block_12_Partnership", null, null, null, "Baby_Block_1_Top_Buttons"
    };
    public static final String ABT_CELB_MODULE_NAMES[] = {
        "Celebration_Block_2_Text", "Celebration_Block_3_Gift_Card", "Celebration_Block_3_Gift_Card_Shop", "Celebration_Block_4_Gift_Wrapping", "Celebration_Block_5_Features", "Celebration_Block_6_Easy", "Celebration_Block_7_Kohls_Store", null, null, null, 
        null, null, null, null, "Celebration_Block_1_Top_Buttons"
    };
    public static final String ABT_SCREEN_BABY_CMS_SEC_0 = "Baby_Block_2_Text";
    public static final String ABT_SCREEN_BABY_CMS_SEC_1 = "Baby_Block_4_Catalog";
    public static final String ABT_SCREEN_BABY_CMS_SEC_2 = "Baby_Block_5_Checklist";
    public static final String ABT_SCREEN_BABY_CMS_SEC_3 = "Baby_Block_6_Gift_Card";
    public static final String ABT_SCREEN_BABY_CMS_SEC_4 = "Baby_Block_7_Features";
    public static final String ABT_SCREEN_BABY_CMS_SEC_5 = "Baby_Block_8_Completion";
    public static final String ABT_SCREEN_BABY_CMS_SEC_6 = "Baby_Block_9_Announcement";
    public static final String ABT_SCREEN_BABY_CMS_SEC_7 = "Baby_Block_10_Share";
    public static final String ABT_SCREEN_BABY_CMS_SEC_8 = "Baby_Block_11_Easy_Returns";
    public static final String ABT_SCREEN_BABY_CMS_SEC_9 = "Baby_Block_12_Partnership";
    public static final String ABT_SCREEN_BABY_CMS_SHOP_NOW = "Baby_Block_6_Gift_Card_Shop";
    public static final String ABT_SCREEN_BABY_CMS_TOP_VIEW = "Baby_Block_1_Top_Buttons";
    public static final String ABT_SCREEN_CELB_CMS_SEC_0 = "Celebration_Block_2_Text";
    public static final String ABT_SCREEN_CELB_CMS_SEC_1 = "Celebration_Block_3_Gift_Card";
    public static final String ABT_SCREEN_CELB_CMS_SEC_2 = "Celebration_Block_6_Easy";
    public static final String ABT_SCREEN_CELB_CMS_SEC_3 = "Celebration_Block_7_Kohls_Store";
    public static final String ABT_SCREEN_CELB_CMS_SEC_4 = "Celebration_Block_4_Gift_Wrapping";
    public static final String ABT_SCREEN_CELB_CMS_SEC_5 = "Celebration_Block_5_Features";
    public static final String ABT_SCREEN_CELB_CMS_SHOP_NOW = "Celebration_Block_3_Gift_Card_Shop";
    public static final String ABT_SCREEN_CELB_CMS_TOP_VIEW = "Celebration_Block_1_Top_Buttons";
    public static final String ABT_SCREEN_WED_CMS_TOP_VIEW = "Wedding_Block_1_Top_Buttons";
    public static final String ABT_WED_MODULE_NAMES[] = {
        "Wedding_Block_2_Text", "Wedding_Block_4_Catalog", "Wedding_Block_6_Wedding_Checklist", "Wedding_Block_5_Love_Story", "Wedding_Block_7_GiftCard", "Wedding_Block_7_GiftCard_Shop", "Wedding_Block_8_Features", "Wedding_Block_9_Earn_Rewards", "Wedding_Block_10_Completion", "Wedding_Block_11_Announcement", 
        "Wedding_Block_12_Free_Gift", "Wedding_Block_13_Share", "Wedding_Block_14_Easy_Returns", "Wedding_Block_15_Partnership", "Wedding_Block_1_Top_Buttons"
    };
    public static final String ACTION_LIST_DATA_UPDATED = "list_data_updated";
    public static final String ADD_ITEMS_API = "addItemsToList";
    public static final String BABY_REGISTRY_NAME = "'s Baby Registry";
    public static final int BLANK_RESPONSE_ERR_CODE = -400;
    public static final String BLANK_RESPONSE_ERR_MESSAGE = "Error retrieving information from server. Please try again after sometime.";
    public static final String CATEGORY_DETAIL_TITLE = "category_detail_title";
    public static final String CATEGORY_OBJ = "category obj";
    public static final String CELEBRATION_REGISTRY_APOSTROPHE = "'s ";
    public static final String CELEBRATION_REGISTRY_NAME = "'s Special Days Registry";
    public static final String CELEBRATION_REGISTRY_POSTNAME = " Registry";
    public static final String CHECKSUNM = "checkSum";
    public static final String CREATE_LIST_API = "createList";
    public static final String CREATE_NOTIFICATION_API_CALLBACK = "createNotificationCbk";
    public static final String CREATE_OR_GET_USER = "createOrGetUser";
    public static final String CREATE_OR_GET_USER_PREF_KEY = "ListUserProfile";
    public static final String CREATE_REGISTRYPO = "registry po";
    public static final String CREATE_REGISTRY_API = "createRegistry";
    public static final String CREATE_REMINDER_NOTIFICATION_API = "createNotification";
    public static final String DELETE_LIST_API = "deleteList";
    public static final String DELETE_LIST_API_CALLBACK = "deleteListCbk";
    public static final String DELETE_LIST_ITEM_API = "removeItem";
    public static final String DELETE_LIST_ITEM_API_CALLBACK = "deletelistitemCbk";
    public static final String DELETE_NOTIFICATION_API_CALLBACK = "deleteNotificationCbk";
    public static final String DELETE_REMINDER_NOTIFICATION_API = "deleteNotification";
    public static final boolean DUMP_NETWORK_LOGS = false;
    public static final String EMAIL = "email";
    public static final String ENTRIES_OBJ = "entry object";
    public static final String FAQ_BABY_URL = "http://mobileapp.kohls.com/skavastream/studio/reader/prod-Phone/NativeAppRegistry/faqbaby";
    public static final String FAQ_CELEBRATION_URL = "http://mobileapp.kohls.com/skavastream/studio/reader/prod-Phone/NativeAppRegistry/faqcelebration";
    public static final String FAQ_WEDDING_URL = "http://mobileapp.kohls.com/skavastream/studio/reader/prod-Phone/NativeAppRegistry/faqwedding";
    public static final String FIRST_NAME = "firstName";
    public static final float FIXED_LENGTH_CREATE_LNR_DIALOG = 124F;
    public static final String FULFILLMENT_ACTIVITY = "fulfillmentActivity";
    public static final String GET_REGISTRY_API = "getRegistry";
    public static final String GET_REGISTRY_CATEGORIES_URL = "http://kohls.skavaone.com/social/entry/getSimplePoolEntries?campaignId=1&channelId=1&offset=0&limit=500&poolName=categorycards";
    public static final String GET_REMINDER_NOTIFICATION_LIST_API = "getNotificationsForList";
    public static final String GOOGLE_SHORTEN_URL_API = "https://www.googleapis.com/urlshortener/v1/url";
    public static final String IS_PURCHASED_STATUS_ON = "is_purchased_status_on";
    public static final String ITEM_IMAGE_URL = "http://simages.kohls.com/is/image/kohls/";
    public static final String JSESSION_KEY = ";jsessionId=";
    public static final String JSESSION_KEY_PREF_KEY = "ListJsessionId";
    public static final String JSESSION_PREF_KEY_REGISTRY = "RegistryJsessionId";
    public static final String KEY_FRAGMENT_TRANSACTION = "key fragment transac ";
    public static final String LAST_NAME = "lastName";
    public static final String LAST_VISITED_FRAGMENT = "last_visited_fragment";
    public static final String LAST_VISITED_FRAGMENT_BUDGET = "budget_fragment";
    public static final String LAST_VISITED_FRAGMENT_REMINDER = "reminder_fragment";
    public static final String LDF_IS_DATA_UPDATED_EXTRA = "is data updated";
    public static final String LDP_LIST_OWNER_EMAIL = "list_owner_email";
    public static final String LDP_ORIGINATED_FROM_FRAGMENT = "origin of ldp";
    public static final String LIST_AUTOGENRATED_PROPERTIES = "list_autogenrated_properties";
    public static final String LIST_BUDGET_CONFIRMATION_PAGE = "list_budget_confirm";
    public static final String LIST_BUDGET_STRING_CONFIRMATION_PAGE = "list_budget_string_confirm";
    public static final String LIST_DETSIL_FRG_TAG = "list_detail_tag";
    public static final String LIST_EMAIL_OPT_CONFIRMATION_PAGE = "list_emailoptin_confirm";
    public static final String LIST_FILTER_COMPLETE_RESULTS = "filter_complete_results";
    public static final String LIST_FILTER_EMAIL = "email";
    public static final String LIST_FILTER_IS_CLEAR_FILTER = "is_clear_filter";
    public static final int LIST_FILTER_MIN_NAME_LENGTH = 1;
    public static final String LIST_FILTER_NAME = "name";
    public static final String LIST_ID_CONFIRMATION_PAGE = "list_id_confirm";
    public static final String LIST_ID_FULFILLMENT_ACTIVITY = "listId";
    public static final String LIST_ITEMS_OBJ = "list items object";
    public static final String LIST_LANDING_CMS_SEC = "Misc_Block_1_Top_Buttons";
    public static final String LIST_NAME_CONFIRMATION_PAGE = "list_name_confirm";
    public static final String LIST_NAME_EDITED_CONFIRMATION_PAGE = "list_name_edited_confirm";
    public static final String LIST_PUBLIC_CONFIRMATION_PAGE = "list_public_confirm";
    public static final String LIST_PUBLIC_EDITED_CONFIRMATION_PAGE = "list_public_edited_confirm";
    public static final String LIST_REMINDER_DATE_CONFIRMATION_PAGE = "list_reminder_date_confirm";
    public static final String LIST_REMINDER_UPDATED = "list_reminder_updated";
    public static final String LIST_SEARCH_API = "searchLists";
    public static final String LIST_TYPE_CONFIRMATION_PAGE = "list_type_confirm";
    public static final String LOG_FILE_NAME = "kohlslog.txt";
    public static final String LOG_FILE_NAME_TOKEN = "kohlslog_token.txt";
    public static final String LnR_SHARE_ORIGINATED_FROM_LIST = "share_originated_from_list";
    public static final String LnR_SHARE_ORIGINATED_FROM_REGISTRY = "share_originated_from_registry";
    public static final int MAXIMUM_YEARS_REMINDER_DATE_PICKER = 2;
    public static final float MAX_LENGTH_CREATE_LNR_DIALOG = 428F;
    public static final float MIN_LENGTH_CREATE_LNR_DIALOG = 208F;
    public static final String MY_LIST_EVENT_DATE_FORMAT = "yyyy-MM-dd";
    public static final String NOTIFICATION_DAY_BEFORE_ID = "notification_day_before_id";
    public static final String NOTIFICATION_WEEK_BEFORE_ID = "notification_week_before_id";
    public static final String NO_VALUE_CHANGE_MESSAGE = "You didn't make any change.";
    public static final String OPEN_PMP = "open pmp";
    public static final String ORIGINATED_FROM = "originated from";
    public static final String ORIGINATED_FROM_FRAGMENT = "origin_of_fragment";
    public static final String ORIGINATED_FROM_FRAGMENT_EDIT_LIST = "origin_of_fragment_edit_list";
    public static final String ORIGINATED_FROM_FRAGMENT_FILTER_LIST = "origin_from_fragment_filter_list";
    public static final String ORIGINATED_FROM_FRAGMENT_FIND_REGISTRY_USER = "origin_from_fragment_find_registry_user";
    public static final String ORIGINATED_FROM_FRAGMENT_LDP = "origin_of_fragment_ldp";
    public static final String ORIGINATED_FROM_FRAGMENT_LIST_DETAIL = "origin_of_fragment_list_detail";
    public static final String ORIGINATED_FROM_FRAGMENT_MANAGE_REGISTRY = "origin_of_fragment_manage_registry";
    public static final String ORIGINATED_FROM_FRAGMENT_MY_LIST = "origin_from_fragment_my_list";
    public static final String ORIGINATED_FROM_FRAGMENT_REGISTRY_SEARCH = "origin_from_fragment_registry_search";
    public static final String ORIGINATED_FROM_FRAGMENT_REGISTRY_SEARCH_RESULT_OR_LANDING = "origin_from_fragment_registry_search_result_or_landing";
    public static final String ORIGINATED_FROM_FRAGMENT_SEARCH_USER_LIST = "origin_of_fragment_search_user_list";
    public static final String RDP_REGISTRY_OWNER_USERID = "registry_owner_userid";
    public static final int RECENT_SEARCH_KEYWORD_FOR_LIST = 1;
    public static final int RECENT_SEARCH_KEYWORD_FOR_REGISTRY = 2;
    public static final String REGISTRY_ADVANCE_SEARCH_FIRST_NAME = "registry_advance_search_first_name";
    public static final String REGISTRY_ADVANCE_SEARCH_LAST_NAME = "registry_advance_search_last_name";
    public static final String REGISTRY_ADVANCE_SEARCH_REGISTRY_TYPE = "registry_advance_search_registry_type";
    public static final String REGISTRY_ADVANCE_SEARCH_STATE = "registry_advance_search_state";
    public static final String REGISTRY_ADVANCE_SEARCH_STATE_NAME = "registry_advance_search_state_name";
    public static final double REGISTRY_BUDGET_IN_REQUEST = 0D;
    public static final String REGISTRY_CHANNEL = "mobile";
    public static final String REGISTRY_CREATE_OR_GET_USER_PREF_KEY = "RegistryUserProfile";
    public static final String REGISTRY_DASHBOARD_ADDED_VALUES = "registry_dashboard_added_values";
    public static final String REGISTRY_DASHBOARD_REMOVED_VALUES = "registry_dashboard_removed_values";
    public static final String REGISTRY_ID = "registry_id";
    public static final String REGISTRY_NAME = "registry_name";
    public static final String REGISTRY_OBJ = "registry object";
    public static final String REGISTRY_SEARCH_API = "searchRegistry";
    public static final String REGISTRY_SEARCH_CURRENT_ITEM_POSITION = "registry_search_current_item_position";
    public static final String REGISTRY_SEARCH_NO_RESULT_REGISTRY_TYPE_MESSAGE = "registry_search_no_result_reg_type_msg";
    public static final String REGISTRY_TYPE_BABY = "baby";
    public static final String REGISTRY_TYPE_CELEBRATION = "splday";
    public static final String REGISTRY_TYPE_WEDDING = "wedding";
    public static final int REGISTRY_VIEW_DASHBOARD = 0;
    public static final int REGISTRY_VIEW_GRID = 2;
    public static final int REGISTRY_VIEW_LIST = 1;
    public static final String REGTYPE_BABY = "registry.baby";
    public static final String REGTYPE_CELEBRATION = "registry.splday";
    public static final int REGTYPE_ID_BABY = 1;
    public static final int REGTYPE_ID_CELEBRATION = 2;
    public static final int REGTYPE_ID_WEDDING = 0;
    public static final String REGTYPE_WEDDING = "registry.wedding";
    public static final String REG_CMS_ABT_SCREEN_WED_SEC_0 = "Wedding_Block_2_Text";
    public static final String REG_CMS_ABT_SCREEN_WED_SEC_1 = "Wedding_Block_4_Catalog";
    public static final String REG_CMS_ABT_SCREEN_WED_SEC_10 = "Wedding_Block_14_Easy_Returns";
    public static final String REG_CMS_ABT_SCREEN_WED_SEC_11 = "Wedding_Block_15_Partnership";
    public static final String REG_CMS_ABT_SCREEN_WED_SEC_12 = "Wedding_Block_12_Free_Gift";
    public static final String REG_CMS_ABT_SCREEN_WED_SEC_2 = "Wedding_Block_6_Wedding_Checklist";
    public static final String REG_CMS_ABT_SCREEN_WED_SEC_3 = "Wedding_Block_5_Love_Story";
    public static final String REG_CMS_ABT_SCREEN_WED_SEC_4 = "Wedding_Block_7_GiftCard";
    public static final String REG_CMS_ABT_SCREEN_WED_SEC_5 = "Wedding_Block_8_Features";
    public static final String REG_CMS_ABT_SCREEN_WED_SEC_6 = "Wedding_Block_9_Earn_Rewards";
    public static final String REG_CMS_ABT_SCREEN_WED_SEC_7 = "Wedding_Block_10_Completion";
    public static final String REG_CMS_ABT_SCREEN_WED_SEC_8 = "Wedding_Block_11_Announcement";
    public static final String REG_CMS_ABT_SCREEN_WED_SEC_9 = "Wedding_Block_13_Share";
    public static final String REG_CMS_ABT_SCREEN_WED_SHOP_NOW = "Wedding_Block_7_GiftCard_Shop";
    public static final String REG_CMS_SEC_0 = "LP_Block_3_Text";
    public static final String REG_CMS_SEC_1 = "LP_Block_5_Wedding_Catalog";
    public static final String REG_CMS_SEC_2 = "LP_Block_6_Gift_Card";
    public static final String REG_CMS_SEC_3 = "LP_Block_6_Gift_Card_shop";
    public static final String REG_CMS_SEC_4 = "LP_Block_7_Baby_Catalog";
    public static final String REG_CMS_SEC_5 = "LP_Block_8_FAQ";
    public static final String REG_CMS_SEC_6 = "LP_Block_9_Wedding_Checklist";
    public static final String REG_CMS_SEC_7 = "LP_Block_10_Baby_Checklist";
    public static final String REG_CMS_SEC_8 = "LP_Block_11_Love_Story";
    public static final String REG_DASHBOARD_VALUE_NO = "N";
    public static final String REG_DASHBOARD_VALUE_YES = "Y";
    public static final String REG_FILTER_IS_BABY_SELECTED = "is_baby_filter_selected";
    public static final String REG_FILTER_IS_CELEBRATION_SELECTED = "is_celebration_filter_selected";
    public static final String REG_FILTER_IS_WEDDING_SELECTED = "is_wedding_filter_selected";
    public static final String REG_SETTINGS_TARGET_FRAGMENT = "reg_settings_target_fragment";
    public static final String REG_SETTINGS_TARGET_FRAGMENT_MSG_TO_GUEST = "reg_settings_target_fragmemt_msg";
    public static final String REG_SETTINGS_TARGET_FRAGMENT_PROMO_CODE = "reg_settings_target_fragment_promocode";
    public static final String REMINDER_API_DATE_FORMAT = "yyyy-MM-dd";
    public static final int REMINDER_API_SAME_VALUE_RESPONSE_CODE = 100;
    public static final int REMINDER_API_SUCCESS_RESPONSE_CODE = 0;
    public static final int REMINDER_DAY_BEFORE_NOTIFICATION_SELECTED = 1;
    public static final String REMINDER_DISPLAY_DATE_FORMAT = "MMMM dd, yyyy";
    public static final String REMINDER_NOTIFICATION_DAY_BEFORE_VALUE = "86400";
    public static final String REMINDER_NOTIFICATION_WEEK_BEFORE_VALUE = "604800";
    public static final int REMINDER_WEEK_BEFORE_NOTIFICATION_SELECTED = 2;
    public static final int REQUEST_CODE_ADD_NEW_LIST_PDP = 8001;
    public static final int REQUEST_CODE_ADD_NEW_REGISTRY_PDP = 8002;
    public static final int REQUEST_CODE_AUTH_LNR_PDP = 8003;
    public static final int REQUEST_CODE_PDP = 1001;
    public static final int REQUEST_CODE_REG_SETTINGS = 8004;
    public static final int RESULT_CODE_LDF_OK = 1002;
    public static final String RETAILER_USER_ID = "retailerUserId";
    public static final float ROW_HEIGHT_CREATE_LNR_DIALOG = 45F;
    public static final String SCREEN_TO_OPEN = "ScreenToOpen";
    public static final String SEARCH_LIST_API_CALLBACK = "searchListsCbk";
    public static final String SEARCH_REGISTRY_API_CALLBACK = "searchRegistryCbk";
    public static final String SEARCH_RESULT_USER_KEY = "searchresultuserkey";
    public static final String SEARCH_RESULT_USER_MAP = "searchresultusermap";
    public static final String SEARCH_SELECTED_USER_LIST_POSITION = "selecteduserlistposition";
    public static final String SELECTED_SORT_OPTION = "SelectedSortOption";
    public static final String SERVER_COOKIES = "Set-Cookie";
    public static final String SERVER_ERROR_PAGE_KEYWORD = "<html>";
    public static final String SERVER_JSESSIONID = "JSESSIONID";
    public static final String SET_LOGIN_STATUS_API = "setLoginStatus";
    public static final String SHARE_LIST_FB_IMAGE_LINK = "https://lh3.ggpht.com/k4WTkpHN-1aUxSgyQxiYa5y66ZEJVOCo0uSh25Opg4oQx9ChcBUUyGGqFb4HnAlM4Q=w300";
    public static final String SHARE_LIST_GUEST_VIEW_MSG = "found";
    public static final String SHARE_LIST_ON_FB_Caption = "My Kohl's List:";
    public static final String SHARE_LIST_ON_FB_Description = "Check it out! I %s a List at Kohls.com! It's called %s";
    public static final String SHARE_LIST_ON_MSG1 = "I %s a List at Kohls.com! It's called ";
    public static final String SHARE_LIST_ON_MSG2 = ". Check it out! : ";
    public static final String SHARE_LIST_ON_TWITTER = "Check it out! I am sharing a Kohl's list with you.";
    public static final String SHARE_LIST_OWNER_VIEW_MSG = "just created";
    public static final String SHARE_LIST_URL = "http://www.kohls.com/upgrade/giftinglisting/wishlist.jsp?section=list&listid=";
    public static final String SHARE_REGISTRY_ON_FB_CAPTION = "A Kohl's Registry:";
    public static final String SHARE_REGISTRY_ON_FB_DESCRIPTION = "Check out %s online or visit a Kohl's store near you. Enjoy gift-giving conveniences like gift wrapping, shipping and more!";
    public static final String SHARE_REGISTRY_ON_MAIL_MSG_GUEST = "A Kohl's Registry: <br/> Check out %s! Take a look at our Kohl's Registry online or visit at Kohl's store near you. Enjoy gift-giving conveniences like gift wrapping, shipping and more!";
    public static final String SHARE_REGISTRY_ON_MAIL_MSG_OWNER = "My Kohl's Registry: <br/> Check out %s! Take a look at our Kohl's Registry online or visit at Kohl's store near you. Enjoy gift-giving conveniences like gift wrapping, shipping and more!";
    public static final String SHARE_REGISTRY_ON_MSG = "A Kohl's Registry: Check out %s online or visit a Kohl's store near you. Enjoy gift-giving conveniences like gift wrapping, shipping and more!";
    public static final String SHARE_REGISTRY_ON_TWITTER_MSG = "Check it out! I am sharing a Kohl's registry with you.";
    public static final String SHARE_REGISTRY_URL = "http://www.kohls.com/upgrade/gift_registry/kohlsgrw_home.jsp?section=list&listid=";
    public static final String SHOW_ITEMS_API = "showItemsInList";
    public static final String SHOW_MY_LISTS_METHOD = "showListsWithItems";
    public static final String SHOW_PUBLIC_ITEMS_API = "showItemsInPublicList";
    public static final String SHOW_SCREEN_ON_RESULT = "show_screen_on_result";
    public static final String SKAVA_API_URL_LIST = LnRUtility.getListBaseUrl();
    public static final String SKAVA_API_URL_REGISTRY = LnRUtility.getRegistryBaseUrl();
    public static final String SKAVA_BASE_LIST_URL = "https://kregistry5.skavaone.com/kohls/";
    public static final String SKAVA_BASE_REG_URL = "https://kregistry5.skavaone.com/registry/";
    public static final String TAG_GIFT_CARD_VIEW = "tag gift card view";
    public static final String TAG_SHOP_VIEW = "tag shop now view";
    public static final String UPDATE_LIST_API = "updateListSettings";
    public static final String UPDATE_LIST_ITEM_QTY = "updateItemQtyInList";
    public static final String UPDATE_LIST_SETTINGS_API_CALLBACK = "updateListSettingsCbk";
    public static final String UPDATE_REGISTRY_API = "updateRegistrySettings";
    public static final int VALID_MIN_NAME_LENGTH_2 = 2;
    public static final String WEDDING_REGISTRY_NAME = "'s Wedding Registry";
    public static final String isCreateNewListPDP = "isCreateNewListPDP";
    public static final String isCreateNewRegistryPDP = "isCreateNewRegistryPDP";
    public static final boolean isRunningInQA = true;
    public static final int lnr_registry_message_max_char = 100;


    // Unreferenced inner class com/kohls/mcommerce/opal/modules/lnr/common/value/LnRConstantValues$MyListSortOption
    /* block-local class not found */
    class MyListSortOption {}

}
