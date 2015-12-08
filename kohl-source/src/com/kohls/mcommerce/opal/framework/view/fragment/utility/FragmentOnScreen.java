// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.fragment.utility;


public final class FragmentOnScreen extends Enum
{

    private static final FragmentOnScreen $VALUES[];
    public static final FragmentOnScreen ABOUT_REGISTRY_FRAGMENT;
    public static final FragmentOnScreen ACCOUNT;
    public static final FragmentOnScreen ADDRESS_FRAGMENT;
    public static final FragmentOnScreen ADD_ADDRESS_FRAGMENT;
    public static final FragmentOnScreen BABY_REGISTRY;
    public static final FragmentOnScreen BABY_REG_CONFIRMATION;
    public static final FragmentOnScreen BIG_DATA;
    public static final FragmentOnScreen CELEBRATION_REGISTRY;
    public static final FragmentOnScreen CREATE_LIST;
    public static final FragmentOnScreen CREATE_LIST_CONFIRMATION;
    public static final FragmentOnScreen CREATE_REGISTRY;
    public static final FragmentOnScreen FILTER;
    public static final FragmentOnScreen GUEST_REWARD_FRAGMENT;
    public static final FragmentOnScreen HELP_AND_CONTACT_US;
    public static final FragmentOnScreen HOME;
    public static final FragmentOnScreen LISTS;
    public static final FragmentOnScreen LIST_BUDGET;
    public static final FragmentOnScreen LIST_DETAIL;
    public static final FragmentOnScreen LIST_EDIT;
    public static final FragmentOnScreen LIST_FILTER;
    public static final FragmentOnScreen LIST_PRODUCT_SEARCH;
    public static final FragmentOnScreen LIST_REMINDER;
    public static final FragmentOnScreen LIST_SEARCH;
    public static final FragmentOnScreen LIST_SEARCH_RESULT;
    public static final FragmentOnScreen LIST_SEARCH_USER_LISTS;
    public static final FragmentOnScreen LOYALTY;
    public static final FragmentOnScreen MANAGE_REGISTRY;
    public static final FragmentOnScreen MY_LISTS;
    public static final FragmentOnScreen PRODUCT_DETAIL;
    public static final FragmentOnScreen PRODUCT_MATRIX;
    public static final FragmentOnScreen RATING_REVIEW_DETAILS;
    public static final FragmentOnScreen RATING_REVIEW_LIST;
    public static final FragmentOnScreen REGISTRY;
    public static final FragmentOnScreen REGISTRY_ADD_CATEGORY_FRAGMENT;
    public static final FragmentOnScreen REGISTRY_ADVANCE_SEARCH;
    public static final FragmentOnScreen REGISTRY_CATEGORY_DETAIL;
    public static final FragmentOnScreen REGISTRY_CATEGORY_FRAGMENT;
    public static final FragmentOnScreen REGISTRY_CONFIRMATION;
    public static final FragmentOnScreen REGISTRY_DETAIL;
    public static final FragmentOnScreen REGISTRY_FILTER;
    public static final FragmentOnScreen REGISTRY_LANDING;
    public static final FragmentOnScreen REGISTRY_PRODUCT_SCAN;
    public static final FragmentOnScreen REGISTRY_PRODUCT_SEARCH;
    public static final FragmentOnScreen REGISTRY_SEARCH;
    public static final FragmentOnScreen REGISTRY_SEARCH_RESULT;
    public static final FragmentOnScreen REGISTRY_SEARCH_USER_RESULT;
    public static final FragmentOnScreen REGISTRY_SETTING_FRAGMENT;
    public static final FragmentOnScreen REGISTRY_SETTING_MSG_PROMOCODE_FRAGMENT;
    public static final FragmentOnScreen REGISTRY_SETTING_REGISTRANTS_FRAGMENT;
    public static final FragmentOnScreen REGISTRY_SETTING_SPECIAL_DAY_FRAGMENT;
    public static final FragmentOnScreen REWARDS_NOT_ENROLLED;
    public static final FragmentOnScreen REWARD_CONFIRMATION;
    public static final FragmentOnScreen SEARCH;
    public static final FragmentOnScreen STORE_LOCATOR;
    public static final FragmentOnScreen VISUAL_SEARCH;
    public static final FragmentOnScreen WALLET;
    public static final FragmentOnScreen WEB_PRODUCT_MODULE_FRAGMENT;
    public static final FragmentOnScreen WEDDING_REGISTRY;
    public static final FragmentOnScreen WEDDING_REG_ABOUT;
    public static final FragmentOnScreen WRITE_REVIEW;

    private FragmentOnScreen(String s, int i)
    {
        super(s, i);
    }

    public static FragmentOnScreen valueOf(String s)
    {
        return (FragmentOnScreen)Enum.valueOf(com/kohls/mcommerce/opal/framework/view/fragment/utility/FragmentOnScreen, s);
    }

    public static FragmentOnScreen[] values()
    {
        return (FragmentOnScreen[])$VALUES.clone();
    }

    static 
    {
        HOME = new FragmentOnScreen("HOME", 0);
        PRODUCT_MATRIX = new FragmentOnScreen("PRODUCT_MATRIX", 1);
        FILTER = new FragmentOnScreen("FILTER", 2);
        PRODUCT_DETAIL = new FragmentOnScreen("PRODUCT_DETAIL", 3);
        STORE_LOCATOR = new FragmentOnScreen("STORE_LOCATOR", 4);
        ACCOUNT = new FragmentOnScreen("ACCOUNT", 5);
        SEARCH = new FragmentOnScreen("SEARCH", 6);
        HELP_AND_CONTACT_US = new FragmentOnScreen("HELP_AND_CONTACT_US", 7);
        RATING_REVIEW_LIST = new FragmentOnScreen("RATING_REVIEW_LIST", 8);
        RATING_REVIEW_DETAILS = new FragmentOnScreen("RATING_REVIEW_DETAILS", 9);
        WRITE_REVIEW = new FragmentOnScreen("WRITE_REVIEW", 10);
        LISTS = new FragmentOnScreen("LISTS", 11);
        REGISTRY = new FragmentOnScreen("REGISTRY", 12);
        BIG_DATA = new FragmentOnScreen("BIG_DATA", 13);
        WALLET = new FragmentOnScreen("WALLET", 14);
        REWARDS_NOT_ENROLLED = new FragmentOnScreen("REWARDS_NOT_ENROLLED", 15);
        GUEST_REWARD_FRAGMENT = new FragmentOnScreen("GUEST_REWARD_FRAGMENT", 16);
        LOYALTY = new FragmentOnScreen("LOYALTY", 17);
        REWARD_CONFIRMATION = new FragmentOnScreen("REWARD_CONFIRMATION", 18);
        WEB_PRODUCT_MODULE_FRAGMENT = new FragmentOnScreen("WEB_PRODUCT_MODULE_FRAGMENT", 19);
        VISUAL_SEARCH = new FragmentOnScreen("VISUAL_SEARCH", 20);
        MY_LISTS = new FragmentOnScreen("MY_LISTS", 21);
        CREATE_LIST = new FragmentOnScreen("CREATE_LIST", 22);
        CREATE_LIST_CONFIRMATION = new FragmentOnScreen("CREATE_LIST_CONFIRMATION", 23);
        LIST_REMINDER = new FragmentOnScreen("LIST_REMINDER", 24);
        LIST_BUDGET = new FragmentOnScreen("LIST_BUDGET", 25);
        LIST_SEARCH = new FragmentOnScreen("LIST_SEARCH", 26);
        LIST_SEARCH_RESULT = new FragmentOnScreen("LIST_SEARCH_RESULT", 27);
        LIST_SEARCH_USER_LISTS = new FragmentOnScreen("LIST_SEARCH_USER_LISTS", 28);
        LIST_EDIT = new FragmentOnScreen("LIST_EDIT", 29);
        LIST_DETAIL = new FragmentOnScreen("LIST_DETAIL", 30);
        LIST_PRODUCT_SEARCH = new FragmentOnScreen("LIST_PRODUCT_SEARCH", 31);
        REGISTRY_PRODUCT_SEARCH = new FragmentOnScreen("REGISTRY_PRODUCT_SEARCH", 32);
        REGISTRY_PRODUCT_SCAN = new FragmentOnScreen("REGISTRY_PRODUCT_SCAN", 33);
        LIST_FILTER = new FragmentOnScreen("LIST_FILTER", 34);
        REGISTRY_LANDING = new FragmentOnScreen("REGISTRY_LANDING", 35);
        CREATE_REGISTRY = new FragmentOnScreen("CREATE_REGISTRY", 36);
        WEDDING_REGISTRY = new FragmentOnScreen("WEDDING_REGISTRY", 37);
        BABY_REGISTRY = new FragmentOnScreen("BABY_REGISTRY", 38);
        CELEBRATION_REGISTRY = new FragmentOnScreen("CELEBRATION_REGISTRY", 39);
        ADDRESS_FRAGMENT = new FragmentOnScreen("ADDRESS_FRAGMENT", 40);
        BABY_REG_CONFIRMATION = new FragmentOnScreen("BABY_REG_CONFIRMATION", 41);
        ADD_ADDRESS_FRAGMENT = new FragmentOnScreen("ADD_ADDRESS_FRAGMENT", 42);
        REGISTRY_CONFIRMATION = new FragmentOnScreen("REGISTRY_CONFIRMATION", 43);
        MANAGE_REGISTRY = new FragmentOnScreen("MANAGE_REGISTRY", 44);
        REGISTRY_DETAIL = new FragmentOnScreen("REGISTRY_DETAIL", 45);
        REGISTRY_CATEGORY_DETAIL = new FragmentOnScreen("REGISTRY_CATEGORY_DETAIL", 46);
        WEDDING_REG_ABOUT = new FragmentOnScreen("WEDDING_REG_ABOUT", 47);
        REGISTRY_SEARCH = new FragmentOnScreen("REGISTRY_SEARCH", 48);
        REGISTRY_SEARCH_RESULT = new FragmentOnScreen("REGISTRY_SEARCH_RESULT", 49);
        REGISTRY_SEARCH_USER_RESULT = new FragmentOnScreen("REGISTRY_SEARCH_USER_RESULT", 50);
        REGISTRY_FILTER = new FragmentOnScreen("REGISTRY_FILTER", 51);
        ABOUT_REGISTRY_FRAGMENT = new FragmentOnScreen("ABOUT_REGISTRY_FRAGMENT", 52);
        REGISTRY_SETTING_FRAGMENT = new FragmentOnScreen("REGISTRY_SETTING_FRAGMENT", 53);
        REGISTRY_ADVANCE_SEARCH = new FragmentOnScreen("REGISTRY_ADVANCE_SEARCH", 54);
        REGISTRY_CATEGORY_FRAGMENT = new FragmentOnScreen("REGISTRY_CATEGORY_FRAGMENT", 55);
        REGISTRY_ADD_CATEGORY_FRAGMENT = new FragmentOnScreen("REGISTRY_ADD_CATEGORY_FRAGMENT", 56);
        REGISTRY_SETTING_REGISTRANTS_FRAGMENT = new FragmentOnScreen("REGISTRY_SETTING_REGISTRANTS_FRAGMENT", 57);
        REGISTRY_SETTING_MSG_PROMOCODE_FRAGMENT = new FragmentOnScreen("REGISTRY_SETTING_MSG_PROMOCODE_FRAGMENT", 58);
        REGISTRY_SETTING_SPECIAL_DAY_FRAGMENT = new FragmentOnScreen("REGISTRY_SETTING_SPECIAL_DAY_FRAGMENT", 59);
        $VALUES = (new FragmentOnScreen[] {
            HOME, PRODUCT_MATRIX, FILTER, PRODUCT_DETAIL, STORE_LOCATOR, ACCOUNT, SEARCH, HELP_AND_CONTACT_US, RATING_REVIEW_LIST, RATING_REVIEW_DETAILS, 
            WRITE_REVIEW, LISTS, REGISTRY, BIG_DATA, WALLET, REWARDS_NOT_ENROLLED, GUEST_REWARD_FRAGMENT, LOYALTY, REWARD_CONFIRMATION, WEB_PRODUCT_MODULE_FRAGMENT, 
            VISUAL_SEARCH, MY_LISTS, CREATE_LIST, CREATE_LIST_CONFIRMATION, LIST_REMINDER, LIST_BUDGET, LIST_SEARCH, LIST_SEARCH_RESULT, LIST_SEARCH_USER_LISTS, LIST_EDIT, 
            LIST_DETAIL, LIST_PRODUCT_SEARCH, REGISTRY_PRODUCT_SEARCH, REGISTRY_PRODUCT_SCAN, LIST_FILTER, REGISTRY_LANDING, CREATE_REGISTRY, WEDDING_REGISTRY, BABY_REGISTRY, CELEBRATION_REGISTRY, 
            ADDRESS_FRAGMENT, BABY_REG_CONFIRMATION, ADD_ADDRESS_FRAGMENT, REGISTRY_CONFIRMATION, MANAGE_REGISTRY, REGISTRY_DETAIL, REGISTRY_CATEGORY_DETAIL, WEDDING_REG_ABOUT, REGISTRY_SEARCH, REGISTRY_SEARCH_RESULT, 
            REGISTRY_SEARCH_USER_RESULT, REGISTRY_FILTER, ABOUT_REGISTRY_FRAGMENT, REGISTRY_SETTING_FRAGMENT, REGISTRY_ADVANCE_SEARCH, REGISTRY_CATEGORY_FRAGMENT, REGISTRY_ADD_CATEGORY_FRAGMENT, REGISTRY_SETTING_REGISTRANTS_FRAGMENT, REGISTRY_SETTING_MSG_PROMOCODE_FRAGMENT, REGISTRY_SETTING_SPECIAL_DAY_FRAGMENT
        });
    }
}
