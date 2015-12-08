// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.analytics.utils.enums;


public final class ScreenNames extends Enum
{

    private static final ScreenNames $VALUES[];
    public static final ScreenNames ACCOUNT_LANDING_PAGE;
    public static final ScreenNames ADD_PRODUCT_TO_LIST;
    public static final ScreenNames ADD_PRODUCT_TO_REGISTRY;
    public static final ScreenNames CART;
    public static final ScreenNames CART_ADD;
    public static final ScreenNames COLLECTION;
    public static final ScreenNames CREATE_ACCOUNT;
    public static final ScreenNames CREATE_LIST;
    public static final ScreenNames CREATE_LIST_CONFIRMATION;
    public static final ScreenNames CREATE_REGISTRY_ADDRESS;
    public static final ScreenNames CREATE_REGISTRY_COMPLETED;
    public static final ScreenNames CREATE_REGISTRY_DETAILS;
    public static final ScreenNames CREATE_REGISTRY_SELECT_TYPE;
    public static final ScreenNames DEALS_AND_COUPON_LANDING_PAGE;
    public static final ScreenNames DELETE_LIST;
    public static final ScreenNames FEATURED_BRANDS;
    public static final ScreenNames FIND_IN_STORE;
    public static final ScreenNames FIND_IN_STORE_CHECKOUT;
    public static final ScreenNames FIND_IN_STORE_PDP;
    public static final ScreenNames FIND_LIST;
    public static final ScreenNames HAMBURGER_MENU;
    public static final ScreenNames HELP_CONTACT_US;
    public static final ScreenNames HOME_PAGE;
    public static final ScreenNames IN_STORE_TOOLS;
    public static final ScreenNames KOHLS_CHARGE_LANDING_PAGE;
    public static final ScreenNames KOHLS_CHARGE_OPTIONS_PAGE;
    public static final ScreenNames KOHLS_HASH_TAG;
    public static final ScreenNames LIST_DETAIL;
    public static final ScreenNames LIST_EDIT_SETTINGS;
    public static final ScreenNames LIST_LANDING_PAGE;
    public static final ScreenNames LIST_REMOVE_ITEM;
    public static final ScreenNames LIST_SET_BUDGET;
    public static final ScreenNames LIST_SET_REMINDER;
    public static final ScreenNames MY_LISTS_PAGE;
    public static final ScreenNames PDP;
    public static final ScreenNames PMP;
    public static final ScreenNames PMP_NO_RESULTS;
    public static final ScreenNames REGISTRY_BABY_LANDING;
    public static final ScreenNames REGISTRY_CELEBRATION_LANDING;
    public static final ScreenNames REGISTRY_DELETE;
    public static final ScreenNames REGISTRY_EDIT_CATEGORIES;
    public static final ScreenNames REGISTRY_EDIT_SETTINGS;
    public static final ScreenNames REGISTRY_ITEM_REMOVE;
    public static final ScreenNames REGISTRY_LANDING_PAGE;
    public static final ScreenNames REGISTRY_SEARCH;
    public static final ScreenNames REGISTRY_SEARCH_RESULTS;
    public static final ScreenNames REGISTRY_VIEW;
    public static final ScreenNames REGISTRY_WEDDING_LANDING;
    public static final ScreenNames REWARDS_ACTIVITY;
    public static final ScreenNames REWARDS_DONATE_LANDING_PAGE;
    public static final ScreenNames REWARDS_DONATE_SUCCESS;
    public static final ScreenNames REWARDS_FAQ;
    public static final ScreenNames REWARDS_INFO;
    public static final ScreenNames REWARDS_INVITE_FRIEND;
    public static final ScreenNames REWARDS_INVITE_FRIEND_SUCCESS;
    public static final ScreenNames REWARDS_LANDING_PAGE;
    public static final ScreenNames REWARDS_PROGRAM_DETAILS;
    public static final ScreenNames REWARDS_TERMS_CONDITIONS;
    public static final ScreenNames SCANNER;
    public static final ScreenNames SCAN_FAIL;
    public static final ScreenNames SEARCH_OVERLAY;
    public static final ScreenNames SHARE_LIST;
    public static final ScreenNames SHARE_REGISTRY;
    public static final ScreenNames SIGN_IN_PAGE;
    public static final ScreenNames STORE_LOCATOR_MAIN;
    public static final ScreenNames STORE_LOCATOR_RESULTS;
    public static final ScreenNames STORE_SEARCH;
    public static final ScreenNames STORE_SEARCH_CHECKOUT;
    public static final ScreenNames STORE_SEARCH_PDP;
    public static final ScreenNames UPDATE_PRODUCT_TO_BOPUS;
    public static final ScreenNames USING_YOUR_WALLET;
    public static final ScreenNames VISUAL_SEARCH_OVERLAY;
    public static final ScreenNames VISUAL_SEARCH_OVERLAY_LIVE_PHOTO;
    public static final ScreenNames VOICE_SEARCH_FAIL;
    public static final ScreenNames VOICE_SEARCH_NO_MATCHES;
    public static final ScreenNames VOICE_SEARCH_OVERLAY;
    public static final ScreenNames VOICE_SEARCH_RESULT;
    public static final ScreenNames WALLET_DISCOUNT_ADDED;
    public static final ScreenNames WALLET_GIFT_CARD_ADDED;
    public static final ScreenNames WALLET_KC_AND_REWARD;
    public static final ScreenNames WALLET_KOHLS_CASH_ADDED;
    public static final ScreenNames WALLET_KOHLS_OFFER;
    public static final ScreenNames WALLET_LANDING_PAGE;
    public static final ScreenNames WALLET_VIEW_GIFT_CARD;
    public static final ScreenNames WALLET_YES_2_YOU;
    private String pageType;
    private String trackstate;

    private ScreenNames(String s, int i, String s1)
    {
        super(s, i);
        trackstate = s1;
    }

    private ScreenNames(String s, int i, String s1, String s2)
    {
        super(s, i);
        trackstate = s1;
        pageType = s2;
    }

    public static boolean contains(String s)
    {
        Object aobj[] = com/analytics/utils/enums/ScreenNames.getEnumConstants();
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            if (((Enum)aobj[i]).name().equals(s))
            {
                return true;
            }
        }

        return false;
    }

    public static ScreenNames valueOf(String s)
    {
        return (ScreenNames)Enum.valueOf(com/analytics/utils/enums/ScreenNames, s);
    }

    public static ScreenNames[] values()
    {
        return (ScreenNames[])$VALUES.clone();
    }

    public String getPageType()
    {
        if (pageType != null)
        {
            return (new StringBuilder()).append("a|").append(pageType).toString();
        } else
        {
            return (new StringBuilder()).append("a|").append(trackstate).toString();
        }
    }

    public String getTrackState()
    {
        return (new StringBuilder()).append("a>").append(trackstate).toString();
    }

    static 
    {
        HOME_PAGE = new ScreenNames("HOME_PAGE", 0, "homepage");
        HAMBURGER_MENU = new ScreenNames("HAMBURGER_MENU", 1, "shopmenu");
        PMP = new ScreenNames("PMP", 2, "pmp");
        PDP = new ScreenNames("PDP", 3, "pdp");
        FIND_IN_STORE = new ScreenNames("FIND_IN_STORE", 4, "find in store");
        STORE_SEARCH = new ScreenNames("STORE_SEARCH", 5, "store search", "find in store");
        SIGN_IN_PAGE = new ScreenNames("SIGN_IN_PAGE", 6, "sign in or sign up", "account");
        SCANNER = new ScreenNames("SCANNER", 7, "scanner");
        SCAN_FAIL = new ScreenNames("SCAN_FAIL", 8, "unsuccessful scan");
        HELP_CONTACT_US = new ScreenNames("HELP_CONTACT_US", 9, "help:main", "help");
        WALLET_LANDING_PAGE = new ScreenNames("WALLET_LANDING_PAGE", 10, "my account:wallet:main", "my account");
        WALLET_DISCOUNT_ADDED = new ScreenNames("WALLET_DISCOUNT_ADDED", 11, "my account:wallet:discount added", "my account");
        WALLET_KOHLS_CASH_ADDED = new ScreenNames("WALLET_KOHLS_CASH_ADDED", 12, "my account:wallet:kc added", "my account");
        WALLET_GIFT_CARD_ADDED = new ScreenNames("WALLET_GIFT_CARD_ADDED", 13, "my account:wallet:gift card added", "my account");
        USING_YOUR_WALLET = new ScreenNames("USING_YOUR_WALLET", 14, "my account:wallet:using wallet", "my account");
        WALLET_YES_2_YOU = new ScreenNames("WALLET_YES_2_YOU", 15, "my account:wallet:yes2you card", "my account");
        WALLET_KC_AND_REWARD = new ScreenNames("WALLET_KC_AND_REWARD", 16, "my account:wallet:kc and rewards", "my account");
        WALLET_KOHLS_OFFER = new ScreenNames("WALLET_KOHLS_OFFER", 17, "my account:wallet:your offers", "my account");
        WALLET_VIEW_GIFT_CARD = new ScreenNames("WALLET_VIEW_GIFT_CARD", 18, "my account:wallet:view gift cards", "my account");
        PMP_NO_RESULTS = new ScreenNames("PMP_NO_RESULTS", 19, "search results:no matches", "pmp");
        ACCOUNT_LANDING_PAGE = new ScreenNames("ACCOUNT_LANDING_PAGE", 20, "my account:main", "my account");
        REWARDS_TERMS_CONDITIONS = new ScreenNames("REWARDS_TERMS_CONDITIONS", 21, "my account:rewards:terms", "my account");
        REWARDS_FAQ = new ScreenNames("REWARDS_FAQ", 22, "my account:rewards:faq", "my account");
        REWARDS_PROGRAM_DETAILS = new ScreenNames("REWARDS_PROGRAM_DETAILS", 23, "my account:rewards:program details", "my account");
        REWARDS_INFO = new ScreenNames("REWARDS_INFO", 24, "my account:rewards:info", "my account");
        REWARDS_ACTIVITY = new ScreenNames("REWARDS_ACTIVITY", 25, "my account:rewards:activity", "my account");
        CREATE_ACCOUNT = new ScreenNames("CREATE_ACCOUNT", 26, "create account", "my account");
        FEATURED_BRANDS = new ScreenNames("FEATURED_BRANDS", 27, "featured brands");
        IN_STORE_TOOLS = new ScreenNames("IN_STORE_TOOLS", 28, "in store tools:main", "in store tools");
        STORE_LOCATOR_MAIN = new ScreenNames("STORE_LOCATOR_MAIN", 29, "store locator:main", "store locator");
        STORE_LOCATOR_RESULTS = new ScreenNames("STORE_LOCATOR_RESULTS", 30, "store locator:results", "store locator");
        CART = new ScreenNames("CART", 31, "cart");
        CART_ADD = new ScreenNames("CART_ADD", 32, "cart:add item", "cart add");
        REWARDS_LANDING_PAGE = new ScreenNames("REWARDS_LANDING_PAGE", 33, "my account:rewards:main", "my account");
        REWARDS_DONATE_LANDING_PAGE = new ScreenNames("REWARDS_DONATE_LANDING_PAGE", 34, "my account:rewards:donate landing page", "my account");
        REWARDS_DONATE_SUCCESS = new ScreenNames("REWARDS_DONATE_SUCCESS", 35, "my account:rewards:donate successful", "my account");
        REWARDS_INVITE_FRIEND = new ScreenNames("REWARDS_INVITE_FRIEND", 36, "my account:rewards:invite", "my account");
        REWARDS_INVITE_FRIEND_SUCCESS = new ScreenNames("REWARDS_INVITE_FRIEND_SUCCESS", 37, "my account:rewards:invitesuccess", "my account");
        COLLECTION = new ScreenNames("COLLECTION", 38, "collection");
        KOHLS_CHARGE_LANDING_PAGE = new ScreenNames("KOHLS_CHARGE_LANDING_PAGE", 39, "my kohls charge:main", "my kohls charge");
        KOHLS_HASH_TAG = new ScreenNames("KOHLS_HASH_TAG", 40, "my account:hashtag kohls", "my account");
        DEALS_AND_COUPON_LANDING_PAGE = new ScreenNames("DEALS_AND_COUPON_LANDING_PAGE", 41, "deals and coupons:main", "deals and coupons");
        KOHLS_CHARGE_OPTIONS_PAGE = new ScreenNames("KOHLS_CHARGE_OPTIONS_PAGE", 42, "my kohls charge:options", "my kohls charge");
        SEARCH_OVERLAY = new ScreenNames("SEARCH_OVERLAY", 43, "search overlay - main", "search");
        VOICE_SEARCH_OVERLAY = new ScreenNames("VOICE_SEARCH_OVERLAY", 44, "voice search overlay", "search");
        VOICE_SEARCH_RESULT = new ScreenNames("VOICE_SEARCH_RESULT", 45, "voice search results", "search");
        VOICE_SEARCH_FAIL = new ScreenNames("VOICE_SEARCH_FAIL", 46, "voice search fail", "search");
        VOICE_SEARCH_NO_MATCHES = new ScreenNames("VOICE_SEARCH_NO_MATCHES", 47, "search results:no matches", "search");
        VISUAL_SEARCH_OVERLAY = new ScreenNames("VISUAL_SEARCH_OVERLAY", 48, "visual search overlay", "search");
        VISUAL_SEARCH_OVERLAY_LIVE_PHOTO = new ScreenNames("VISUAL_SEARCH_OVERLAY_LIVE_PHOTO", 49, "visual search:take photo", "search");
        LIST_LANDING_PAGE = new ScreenNames("LIST_LANDING_PAGE", 50, "list:list landing", "list");
        MY_LISTS_PAGE = new ScreenNames("MY_LISTS_PAGE", 51, "list:my lists", "list");
        CREATE_LIST = new ScreenNames("CREATE_LIST", 52, "list:list create", "list");
        CREATE_LIST_CONFIRMATION = new ScreenNames("CREATE_LIST_CONFIRMATION", 53, "list:list create confirm", "list");
        FIND_LIST = new ScreenNames("FIND_LIST", 54, "list:list search", "list");
        LIST_DETAIL = new ScreenNames("LIST_DETAIL", 55, "list:", "list");
        LIST_REMOVE_ITEM = new ScreenNames("LIST_REMOVE_ITEM", 56, "list");
        DELETE_LIST = new ScreenNames("DELETE_LIST", 57, "list:delete list", "list");
        LIST_EDIT_SETTINGS = new ScreenNames("LIST_EDIT_SETTINGS", 58, "list:edit settings", "list");
        SHARE_LIST = new ScreenNames("SHARE_LIST", 59, "list:share", "list");
        CREATE_REGISTRY_SELECT_TYPE = new ScreenNames("CREATE_REGISTRY_SELECT_TYPE", 60, "registry create:type", "registry");
        CREATE_REGISTRY_DETAILS = new ScreenNames("CREATE_REGISTRY_DETAILS", 61, "registry create:details", "registry");
        CREATE_REGISTRY_ADDRESS = new ScreenNames("CREATE_REGISTRY_ADDRESS", 62, "registry create:address", "registry");
        CREATE_REGISTRY_COMPLETED = new ScreenNames("CREATE_REGISTRY_COMPLETED", 63, "registry create:confirm", "registry");
        SHARE_REGISTRY = new ScreenNames("SHARE_REGISTRY", 64, "registry");
        REGISTRY_VIEW = new ScreenNames("REGISTRY_VIEW", 65, "registry");
        REGISTRY_EDIT_SETTINGS = new ScreenNames("REGISTRY_EDIT_SETTINGS", 66, "registry");
        REGISTRY_EDIT_CATEGORIES = new ScreenNames("REGISTRY_EDIT_CATEGORIES", 67, "registry");
        REGISTRY_LANDING_PAGE = new ScreenNames("REGISTRY_LANDING_PAGE", 68, "registry:landing page", "registry");
        REGISTRY_WEDDING_LANDING = new ScreenNames("REGISTRY_WEDDING_LANDING", 69, "registry:wedding:landing page", "registry");
        REGISTRY_CELEBRATION_LANDING = new ScreenNames("REGISTRY_CELEBRATION_LANDING", 70, "registry:celebration:landing page", "registry");
        REGISTRY_BABY_LANDING = new ScreenNames("REGISTRY_BABY_LANDING", 71, "registry:baby:landing page", "registry");
        REGISTRY_SEARCH = new ScreenNames("REGISTRY_SEARCH", 72, "registry:registry search modal", "registry");
        REGISTRY_SEARCH_RESULTS = new ScreenNames("REGISTRY_SEARCH_RESULTS", 73, "registry:registry search complete", "registry");
        REGISTRY_ITEM_REMOVE = new ScreenNames("REGISTRY_ITEM_REMOVE", 74, "registry:remove item", "registry");
        REGISTRY_DELETE = new ScreenNames("REGISTRY_DELETE", 75, "registry:delete registry", "registry");
        ADD_PRODUCT_TO_REGISTRY = new ScreenNames("ADD_PRODUCT_TO_REGISTRY", 76, "registry:add item", "registry");
        ADD_PRODUCT_TO_LIST = new ScreenNames("ADD_PRODUCT_TO_LIST", 77, "list:add item", "list");
        LIST_SET_REMINDER = new ScreenNames("LIST_SET_REMINDER", 78, "list:set reminders", "list");
        LIST_SET_BUDGET = new ScreenNames("LIST_SET_BUDGET", 79, "list:set budget", "list");
        FIND_IN_STORE_PDP = new ScreenNames("FIND_IN_STORE_PDP", 80, "pdp:find in store", "find in store");
        STORE_SEARCH_PDP = new ScreenNames("STORE_SEARCH_PDP", 81, "pdp:store search", "find in store");
        FIND_IN_STORE_CHECKOUT = new ScreenNames("FIND_IN_STORE_CHECKOUT", 82, "checkout:find in store", "find in store");
        STORE_SEARCH_CHECKOUT = new ScreenNames("STORE_SEARCH_CHECKOUT", 83, "checkout:store search", "find in store");
        UPDATE_PRODUCT_TO_BOPUS = new ScreenNames("UPDATE_PRODUCT_TO_BOPUS", 84, "checkout:update product to bopus", "find in store");
        $VALUES = (new ScreenNames[] {
            HOME_PAGE, HAMBURGER_MENU, PMP, PDP, FIND_IN_STORE, STORE_SEARCH, SIGN_IN_PAGE, SCANNER, SCAN_FAIL, HELP_CONTACT_US, 
            WALLET_LANDING_PAGE, WALLET_DISCOUNT_ADDED, WALLET_KOHLS_CASH_ADDED, WALLET_GIFT_CARD_ADDED, USING_YOUR_WALLET, WALLET_YES_2_YOU, WALLET_KC_AND_REWARD, WALLET_KOHLS_OFFER, WALLET_VIEW_GIFT_CARD, PMP_NO_RESULTS, 
            ACCOUNT_LANDING_PAGE, REWARDS_TERMS_CONDITIONS, REWARDS_FAQ, REWARDS_PROGRAM_DETAILS, REWARDS_INFO, REWARDS_ACTIVITY, CREATE_ACCOUNT, FEATURED_BRANDS, IN_STORE_TOOLS, STORE_LOCATOR_MAIN, 
            STORE_LOCATOR_RESULTS, CART, CART_ADD, REWARDS_LANDING_PAGE, REWARDS_DONATE_LANDING_PAGE, REWARDS_DONATE_SUCCESS, REWARDS_INVITE_FRIEND, REWARDS_INVITE_FRIEND_SUCCESS, COLLECTION, KOHLS_CHARGE_LANDING_PAGE, 
            KOHLS_HASH_TAG, DEALS_AND_COUPON_LANDING_PAGE, KOHLS_CHARGE_OPTIONS_PAGE, SEARCH_OVERLAY, VOICE_SEARCH_OVERLAY, VOICE_SEARCH_RESULT, VOICE_SEARCH_FAIL, VOICE_SEARCH_NO_MATCHES, VISUAL_SEARCH_OVERLAY, VISUAL_SEARCH_OVERLAY_LIVE_PHOTO, 
            LIST_LANDING_PAGE, MY_LISTS_PAGE, CREATE_LIST, CREATE_LIST_CONFIRMATION, FIND_LIST, LIST_DETAIL, LIST_REMOVE_ITEM, DELETE_LIST, LIST_EDIT_SETTINGS, SHARE_LIST, 
            CREATE_REGISTRY_SELECT_TYPE, CREATE_REGISTRY_DETAILS, CREATE_REGISTRY_ADDRESS, CREATE_REGISTRY_COMPLETED, SHARE_REGISTRY, REGISTRY_VIEW, REGISTRY_EDIT_SETTINGS, REGISTRY_EDIT_CATEGORIES, REGISTRY_LANDING_PAGE, REGISTRY_WEDDING_LANDING, 
            REGISTRY_CELEBRATION_LANDING, REGISTRY_BABY_LANDING, REGISTRY_SEARCH, REGISTRY_SEARCH_RESULTS, REGISTRY_ITEM_REMOVE, REGISTRY_DELETE, ADD_PRODUCT_TO_REGISTRY, ADD_PRODUCT_TO_LIST, LIST_SET_REMINDER, LIST_SET_BUDGET, 
            FIND_IN_STORE_PDP, STORE_SEARCH_PDP, FIND_IN_STORE_CHECKOUT, STORE_SEARCH_CHECKOUT, UPDATE_PRODUCT_TO_BOPUS
        });
    }
}
