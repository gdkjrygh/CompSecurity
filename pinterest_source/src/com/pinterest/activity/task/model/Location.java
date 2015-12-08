// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.board.BoardCollaboratorInviteFragment;
import com.pinterest.activity.board.fragment.BoardChooseCoverFragment;
import com.pinterest.activity.board.fragment.BoardCropCoverFragment;
import com.pinterest.activity.board.fragment.BoardEditFragment;
import com.pinterest.activity.board.fragment.BoardFragment;
import com.pinterest.activity.board.fragment.BoardRelatedBoardsFragment;
import com.pinterest.activity.category.fragment.CategoryFragment;
import com.pinterest.activity.commerce.CheckoutConfirmationFragment;
import com.pinterest.activity.commerce.CheckoutFragment;
import com.pinterest.activity.commerce.CommerceOrderDetailFragment;
import com.pinterest.activity.commerce.CommerceSearchFragment;
import com.pinterest.activity.commerce.CommerceSettingsFragment;
import com.pinterest.activity.commerce.PriceFilterFragment;
import com.pinterest.activity.commerce.ShopSpaceBoardFragment;
import com.pinterest.activity.commerce.ShopSpaceFragment;
import com.pinterest.activity.commerce.ShopSpaceSectionFragment;
import com.pinterest.activity.contacts.UploadContactsFragment;
import com.pinterest.activity.conversation.ConversationCreateFragment;
import com.pinterest.activity.conversation.ConversationFragment;
import com.pinterest.activity.create.fragment.FastRepinFragment;
import com.pinterest.activity.create.fragment.PinEditFragment;
import com.pinterest.activity.domain.DomainFragment;
import com.pinterest.activity.dynamicgrid.DynamicGridFragment;
import com.pinterest.activity.explore.ContextualExploreFragment;
import com.pinterest.activity.explore.ExploreFragment;
import com.pinterest.activity.findfriend.FindFriendsFragment;
import com.pinterest.activity.findfriend.FindFriendsInviteAllFragment;
import com.pinterest.activity.flashlight.FlashlightResultsFragment;
import com.pinterest.activity.home.HomeFragment;
import com.pinterest.activity.home.HomefeedBuilderFragment;
import com.pinterest.activity.home.HomefeedBuilderListFragment;
import com.pinterest.activity.home.HomefeedBuilderMyTopicsFragment;
import com.pinterest.activity.home.events.HomeControlEvent;
import com.pinterest.activity.interest.InterestCollectionFragment;
import com.pinterest.activity.interest.InterestFragment;
import com.pinterest.activity.interest.MyInterestsFragment;
import com.pinterest.activity.library.fragment.BoardSortFragment;
import com.pinterest.activity.library.fragment.LibraryAllPinsFragment;
import com.pinterest.activity.library.fragment.LibraryFollowedFragment;
import com.pinterest.activity.library.fragment.LibraryFollowersFragment;
import com.pinterest.activity.library.fragment.LibraryFragment;
import com.pinterest.activity.library.fragment.LibraryLikesFragment;
import com.pinterest.activity.notifications.ConversationPinnersFragment;
import com.pinterest.activity.notifications.NotificationsFragment;
import com.pinterest.activity.notifications.StoryBoardsFragment;
import com.pinterest.activity.notifications.StoryPinnersFragment;
import com.pinterest.activity.notifications.StoryPinsFragment;
import com.pinterest.activity.nux.fragment.NUXInterestsPickerFragment;
import com.pinterest.activity.nux.fragment.NUXStartScreenFragment;
import com.pinterest.activity.pin.fragment.CsrPickerFragment;
import com.pinterest.activity.pin.fragment.PinActivityFragment;
import com.pinterest.activity.pin.fragment.PinCommentsFragment;
import com.pinterest.activity.pin.fragment.PinFragment;
import com.pinterest.activity.pin.fragment.PinLikesFragment;
import com.pinterest.activity.pin.fragment.PinPlaceFragment;
import com.pinterest.activity.pin.fragment.PinRepinsFragment;
import com.pinterest.activity.pin.fragment.PinSwipeFragment;
import com.pinterest.activity.place.fragment.PlaceImagePickerFragment;
import com.pinterest.activity.place.fragment.PlacePickerFragment;
import com.pinterest.activity.report.ReportPinAgainstPoliciesFragment;
import com.pinterest.activity.report.ReportPinFragment;
import com.pinterest.activity.report.ReportPinHurtfulContentFragment;
import com.pinterest.activity.report.ReportPinIncorrectLocation;
import com.pinterest.activity.report.ReportPinIntellectualPropertyFragment;
import com.pinterest.activity.report.ReportPinNotUsefulFragment;
import com.pinterest.activity.report.ReportPinSpamFragment;
import com.pinterest.activity.report.ReportPinUnfollowFragment;
import com.pinterest.activity.search.GuidedSearchFragment;
import com.pinterest.activity.search.fragment.GuidedPinSearchFragment;
import com.pinterest.activity.sendshare.SendShareFragment;
import com.pinterest.activity.sendshare.SendShareSearchFragment;
import com.pinterest.activity.settings.UpdatedAccountSettingsFragment;
import com.pinterest.activity.settings.fragment.EmailNotificationsSettingsFragment;
import com.pinterest.activity.settings.fragment.OfflineBoardsSettingsFragment;
import com.pinterest.activity.settings.fragment.UpdatedDeactivateAccountSettingsFragment;
import com.pinterest.activity.settings.model.AppPermissionSettingsGuideFragment;
import com.pinterest.activity.task.event.CommandEvent;
import com.pinterest.activity.unauth.fragment.NewLoginFragment;
import com.pinterest.activity.user.UserBoardsFragment;
import com.pinterest.activity.user.UserFragment;
import com.pinterest.activity.user.fragment.AddUserPinTapFragment;
import com.pinterest.activity.user.fragment.BrandPinsFragment;
import com.pinterest.activity.user.fragment.UserAboutFragment;
import com.pinterest.activity.user.fragment.UserFollowedBoardsFragment;
import com.pinterest.activity.user.fragment.UserFollowedFragment;
import com.pinterest.activity.user.fragment.UserFollowedInterestsFragment;
import com.pinterest.activity.user.fragment.UserFollowedPinnersFragment;
import com.pinterest.activity.user.fragment.UserFollowersFragment;
import com.pinterest.activity.user.fragment.UserLikesFragment;
import com.pinterest.activity.user.fragment.UserPinsFragment;
import com.pinterest.activity.web.fragment.WebViewFragment;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.Model;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.fragment.PinPicksFragment;
import com.pinterest.fragment.StaticPinGridFragment;
import com.pinterest.fragment.StaticPinMapFragment;
import com.pinterest.ui.actionsheet.ShareExtensionFragment;
import java.util.HashMap;
import java.util.Set;

// Referenced classes of package com.pinterest.activity.task.model:
//            Navigation

public class Location extends Enum
{

    private static final Location $VALUES[];
    public static final Location ACCOUNT_SETTINGS;
    public static final Location APP_PERMISSION_SETTINGS_GUIDE;
    public static final Location AUTH;
    public static final Location BOARD;
    public static final Location BOARD_CHOOSE_COVER;
    public static final Location BOARD_CROP_COVER;
    public static final Location BOARD_EDIT;
    public static final Location BOARD_SORT;
    public static final Location BRAND_PINS;
    public static final Location BROWSER;
    public static final Location CATEGORY;
    public static final Location COMMERCE_CHECKOUT;
    public static final Location COMMERCE_CONFIRMATION_CHECKOUT;
    public static final Location COMMERCE_ORDER_DETAIL;
    public static final Location COMMERCE_SETTINGS;
    public static final Location COMMERCE_SHOP_SPACE;
    public static final Location COMMERCE_SHOP_SPACE_BOARD;
    public static final Location COMMERCE_SHOP_SPACE_SECTION;
    public static final Location CONTEXTUAL_EXPLORE;
    public static final Location CONVERSATION;
    public static final Location CONVERSATION_CREATE;
    public static final Location CONVERSATION_USERS;
    public static final Location CSR_PICKER;
    public static final Location DEACTIVATE_ACCOUNT_SETTINGS;
    public static final Location DOMAIN;
    public static final Location DYNAMIC_GRID;
    public static final Location EMAIL_NOTIFICATIONS_SETTINGS;
    public static final Location EXPLORE;
    public static final Location FIND_FRIENDS;
    public static final Location FLASHLIGHT;
    public static final Location HOME;
    public static final Location HOMEFEED_BUILDER;
    public static final Location HOMEFEED_BUILDER_LIST;
    public static final Location HOMEFEED_BUILDER_MY_TOPICS;
    public static final Location INTEREST;
    public static final Location INTEREST_COLLECTION;
    public static final Location INVITE_ALL_FRIENDS;
    public static final Location INVITE_BOARD_COLLAB;
    public static final Location INVITE_FRIENDS;
    public static final Location MY_INTERESTS;
    public static final Location NONE;
    public static final Location NOTIFICATIONS;
    public static final Location NUX_INTEREST;
    public static final Location NUX_START_SCREEN;
    public static final Location OFFLINE_BOARDS_SETTINGS;
    public static final Location PIN;
    public static final Location PIN_ACTIVITY_FEED;
    public static final Location PIN_COMMENTS;
    public static final Location PIN_LIKES;
    public static final Location PIN_PAGER;
    public static final Location PIN_PICKS;
    public static final Location PIN_PLACE;
    public static final Location PIN_REPINS;
    public static final Location PLACE_IMAGE_PICKER;
    public static final Location PLACE_PICKER;
    public static final String PREFIX = "pinterest://";
    public static final Location PRICE_FILTER;
    public static final Location RELATED_BOARDS;
    public static final Location REPIN;
    public static final Location REPIN_CSR;
    public static final Location REPORT_PIN;
    public static final Location REPORT_PIN_AGAINST_POLICIES;
    public static final Location REPORT_PIN_HURTFUL_CONTENT;
    public static final Location REPORT_PIN_INCORRECT_LOCATION;
    public static final Location REPORT_PIN_IP;
    public static final Location REPORT_PIN_NOT_USEFUL;
    public static final Location REPORT_PIN_SPAM;
    public static final Location REPORT_PIN_UNFOLLOW;
    public static final Location SEARCH;
    public static final Location SEARCH_PIN;
    public static final Location SEARCH_PIN_COMMERCE;
    public static final Location SEND_SHARE;
    public static final Location SEND_SHARE_SEARCH;
    public static final Location SHARE_EXTENSION;
    public static final Location SIGNUP_EXPERIMENT;
    public static final Location STATIC_PIN_GRID;
    public static final Location STATIC_PIN_MAP;
    public static final Location STORY_BOARDS;
    public static final Location STORY_PINS;
    public static final Location STORY_USERS;
    public static final Location UPLOAD_CONTACTS;
    public static final Location USER;
    public static final Location USER_ABOUT;
    public static final Location USER_BOARDS;
    public static final Location USER_FOLLOWED_BOARDS;
    public static final Location USER_FOLLOWED_INTERESTS;
    public static final Location USER_FOLLOWED_PINNERS;
    public static final Location USER_FOLLOWERS;
    public static final Location USER_FOLLOWING;
    public static final Location USER_LIBRARY_FOLLOWERS;
    public static final Location USER_LIBRARY_FOLLOWING;
    public static final Location USER_LIBRARY_LIKE;
    public static final Location USER_LIBRARY_PINS;
    public static final Location USER_LIBRARY_PROFILE;
    public static final Location USER_LIKES;
    public static final Location USER_PINS;
    public static final Location USER_PINS_SELECT;
    private static final HashMap _siteMap;
    private static final Set _unauthLocations = new _cls4();
    private static Location values[];
    private Class _displayClass;
    protected boolean _rootLocation;

    private Location(String s, int i, Class class1)
    {
        super(s, i);
        _displayClass = class1;
    }

    Location(String s, int i, Class class1, _cls1 _pcls1)
    {
        this(s, i, class1);
    }

    public static boolean allowUnauthAccess(Location location)
    {
        return _unauthLocations.contains(location);
    }

    public static Location from(int i)
    {
        if (values == null)
        {
            values = values();
        }
        if (i < 0 || i >= values.length)
        {
            return NONE;
        } else
        {
            return values[i];
        }
    }

    public static CommandEvent getSiteEvent(String s)
    {
        if (s.startsWith("pinterest://"))
        {
            s = s.substring(12);
            return (CommandEvent)_siteMap.get(s);
        } else
        {
            return null;
        }
    }

    public static boolean isRootLocation(Navigation navigation)
    {
        Location location = navigation.getLocation();
        if (location == USER)
        {
            return MyUser.isUserMe(navigation.getId());
        } else
        {
            return location._rootLocation;
        }
    }

    public static void navigateToModel(Model model)
    {
        if (model != null)
        {
            if (model instanceof Interest)
            {
                Events.post(new Navigation(INTEREST, model));
                return;
            }
            if (model instanceof User)
            {
                Events.post(new Navigation(USER, model));
                return;
            }
            if (model instanceof Board)
            {
                Events.post(new Navigation(BOARD, model));
                return;
            }
            if (model instanceof Pin)
            {
                Events.post(new Navigation(PIN, model));
                return;
            }
        }
    }

    public static void navigateUri(Context context, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        Object obj = getSiteEvent(s);
        if (obj == null)
        {
            obj = ActivityHelper.getWebhook(context);
            ((Intent) (obj)).setData(Uri.parse(s));
            context.startActivity(((Intent) (obj)));
            return;
        }
        switch (((CommandEvent) (obj)).getType())
        {
        default:
            return;

        case 0: // '\0'
            Events.post(new CommandEvent(((CommandEvent) (obj)).getType(), ((CommandEvent) (obj)).getId()));
            return;

        case 1: // '\001'
            Events.post(new Navigation(from(((CommandEvent) (obj)).getId())));
            return;

        case 2: // '\002'
            Events.post(new HomeControlEvent(((CommandEvent) (obj)).getId()));
            break;
        }
    }

    public static Location valueOf(String s)
    {
        return (Location)Enum.valueOf(com/pinterest/activity/task/model/Location, s);
    }

    public static Location[] values()
    {
        return (Location[])$VALUES.clone();
    }

    public Class getDisplayClass()
    {
        return _displayClass;
    }

    public void setDisplayClass(Class class1)
    {
        _displayClass = class1;
    }

    static 
    {
        NONE = new Location("NONE", 0, null);
        AUTH = new Location("AUTH", 1, null);
        HOME = new _cls1("HOME", 2, com/pinterest/activity/home/HomeFragment);
        DYNAMIC_GRID = new _cls2("DYNAMIC_GRID", 3, com/pinterest/activity/dynamicgrid/DynamicGridFragment);
        NUX_START_SCREEN = new Location("NUX_START_SCREEN", 4, com/pinterest/activity/nux/fragment/NUXStartScreenFragment);
        NUX_INTEREST = new Location("NUX_INTEREST", 5, com/pinterest/activity/nux/fragment/NUXInterestsPickerFragment);
        PIN = new Location("PIN", 6, com/pinterest/activity/pin/fragment/PinFragment);
        PIN_PAGER = new Location("PIN_PAGER", 7, com/pinterest/activity/pin/fragment/PinSwipeFragment);
        PIN_LIKES = new Location("PIN_LIKES", 8, com/pinterest/activity/pin/fragment/PinLikesFragment);
        PIN_REPINS = new Location("PIN_REPINS", 9, com/pinterest/activity/pin/fragment/PinRepinsFragment);
        PIN_COMMENTS = new Location("PIN_COMMENTS", 10, com/pinterest/activity/pin/fragment/PinCommentsFragment);
        PIN_PLACE = new Location("PIN_PLACE", 11, com/pinterest/activity/pin/fragment/PinPlaceFragment);
        REPIN = new Location("REPIN", 12, com/pinterest/activity/create/fragment/FastRepinFragment);
        REPIN_CSR = new Location("REPIN_CSR", 13, com/pinterest/activity/create/fragment/PinEditFragment);
        PIN_ACTIVITY_FEED = new Location("PIN_ACTIVITY_FEED", 14, com/pinterest/activity/pin/fragment/PinActivityFragment);
        BOARD = new Location("BOARD", 15, com/pinterest/activity/board/fragment/BoardFragment);
        BOARD_EDIT = new Location("BOARD_EDIT", 16, com/pinterest/activity/board/fragment/BoardEditFragment);
        BOARD_CHOOSE_COVER = new Location("BOARD_CHOOSE_COVER", 17, com/pinterest/activity/board/fragment/BoardChooseCoverFragment);
        BOARD_CROP_COVER = new Location("BOARD_CROP_COVER", 18, com/pinterest/activity/board/fragment/BoardCropCoverFragment);
        HOMEFEED_BUILDER = new Location("HOMEFEED_BUILDER", 19, com/pinterest/activity/home/HomefeedBuilderFragment);
        HOMEFEED_BUILDER_LIST = new Location("HOMEFEED_BUILDER_LIST", 20, com/pinterest/activity/home/HomefeedBuilderListFragment);
        HOMEFEED_BUILDER_MY_TOPICS = new Location("HOMEFEED_BUILDER_MY_TOPICS", 21, com/pinterest/activity/home/HomefeedBuilderMyTopicsFragment);
        RELATED_BOARDS = new Location("RELATED_BOARDS", 22, com/pinterest/activity/board/fragment/BoardRelatedBoardsFragment);
        INVITE_BOARD_COLLAB = new Location("INVITE_BOARD_COLLAB", 23, com/pinterest/activity/board/BoardCollaboratorInviteFragment);
        USER = new Location("USER", 24, com/pinterest/activity/user/UserFragment);
        USER_BOARDS = new Location("USER_BOARDS", 25, com/pinterest/activity/user/UserBoardsFragment);
        USER_PINS = new Location("USER_PINS", 26, com/pinterest/activity/user/fragment/UserPinsFragment);
        BRAND_PINS = new Location("BRAND_PINS", 27, com/pinterest/activity/user/fragment/BrandPinsFragment);
        USER_LIKES = new Location("USER_LIKES", 28, com/pinterest/activity/user/fragment/UserLikesFragment);
        USER_ABOUT = new Location("USER_ABOUT", 29, com/pinterest/activity/user/fragment/UserAboutFragment);
        USER_FOLLOWERS = new Location("USER_FOLLOWERS", 30, com/pinterest/activity/user/fragment/UserFollowersFragment);
        USER_FOLLOWING = new Location("USER_FOLLOWING", 31, com/pinterest/activity/user/fragment/UserFollowedFragment);
        USER_LIBRARY_PROFILE = new Location("USER_LIBRARY_PROFILE", 32, com/pinterest/activity/library/fragment/LibraryFragment);
        USER_LIBRARY_LIKE = new Location("USER_LIBRARY_LIKE", 33, com/pinterest/activity/library/fragment/LibraryLikesFragment);
        USER_LIBRARY_PINS = new Location("USER_LIBRARY_PINS", 34, com/pinterest/activity/library/fragment/LibraryAllPinsFragment);
        USER_LIBRARY_FOLLOWERS = new Location("USER_LIBRARY_FOLLOWERS", 35, com/pinterest/activity/library/fragment/LibraryFollowersFragment);
        USER_LIBRARY_FOLLOWING = new Location("USER_LIBRARY_FOLLOWING", 36, com/pinterest/activity/library/fragment/LibraryFollowedFragment);
        BOARD_SORT = new Location("BOARD_SORT", 37, com/pinterest/activity/library/fragment/BoardSortFragment);
        USER_FOLLOWED_PINNERS = new Location("USER_FOLLOWED_PINNERS", 38, com/pinterest/activity/user/fragment/UserFollowedPinnersFragment);
        USER_FOLLOWED_INTERESTS = new Location("USER_FOLLOWED_INTERESTS", 39, com/pinterest/activity/user/fragment/UserFollowedInterestsFragment);
        USER_FOLLOWED_BOARDS = new Location("USER_FOLLOWED_BOARDS", 40, com/pinterest/activity/user/fragment/UserFollowedBoardsFragment);
        CATEGORY = new Location("CATEGORY", 41, com/pinterest/activity/category/fragment/CategoryFragment);
        DOMAIN = new Location("DOMAIN", 42, com/pinterest/activity/domain/DomainFragment);
        EXPLORE = new Location("EXPLORE", 43, com/pinterest/activity/explore/ExploreFragment);
        CONTEXTUAL_EXPLORE = new Location("CONTEXTUAL_EXPLORE", 44, com/pinterest/activity/explore/ContextualExploreFragment);
        SEARCH = new _cls3("SEARCH", 45, com/pinterest/activity/search/GuidedSearchFragment);
        BROWSER = new Location("BROWSER", 46, com/pinterest/activity/web/fragment/WebViewFragment);
        ACCOUNT_SETTINGS = new Location("ACCOUNT_SETTINGS", 47, com/pinterest/activity/settings/UpdatedAccountSettingsFragment);
        PLACE_PICKER = new Location("PLACE_PICKER", 48, com/pinterest/activity/place/fragment/PlacePickerFragment);
        PLACE_IMAGE_PICKER = new Location("PLACE_IMAGE_PICKER", 49, com/pinterest/activity/place/fragment/PlaceImagePickerFragment);
        STATIC_PIN_GRID = new Location("STATIC_PIN_GRID", 50, com/pinterest/fragment/StaticPinGridFragment);
        STATIC_PIN_MAP = new Location("STATIC_PIN_MAP", 51, com/pinterest/fragment/StaticPinMapFragment);
        SHARE_EXTENSION = new Location("SHARE_EXTENSION", 52, com/pinterest/ui/actionsheet/ShareExtensionFragment);
        INTEREST = new Location("INTEREST", 53, com/pinterest/activity/interest/InterestFragment);
        INTEREST_COLLECTION = new Location("INTEREST_COLLECTION", 54, com/pinterest/activity/interest/InterestCollectionFragment);
        MY_INTERESTS = new Location("MY_INTERESTS", 55, com/pinterest/activity/interest/MyInterestsFragment);
        NOTIFICATIONS = new Location("NOTIFICATIONS", 56, com/pinterest/activity/notifications/NotificationsFragment);
        INVITE_FRIENDS = new Location("INVITE_FRIENDS", 57, com/pinterest/activity/findfriend/FindFriendsFragment);
        INVITE_ALL_FRIENDS = new Location("INVITE_ALL_FRIENDS", 58, com/pinterest/activity/findfriend/FindFriendsInviteAllFragment);
        FIND_FRIENDS = new Location("FIND_FRIENDS", 59, com/pinterest/activity/findfriend/FindFriendsFragment);
        EMAIL_NOTIFICATIONS_SETTINGS = new Location("EMAIL_NOTIFICATIONS_SETTINGS", 60, com/pinterest/activity/settings/fragment/EmailNotificationsSettingsFragment);
        OFFLINE_BOARDS_SETTINGS = new Location("OFFLINE_BOARDS_SETTINGS", 61, com/pinterest/activity/settings/fragment/OfflineBoardsSettingsFragment);
        DEACTIVATE_ACCOUNT_SETTINGS = new Location("DEACTIVATE_ACCOUNT_SETTINGS", 62, com/pinterest/activity/settings/fragment/UpdatedDeactivateAccountSettingsFragment);
        CONVERSATION = new Location("CONVERSATION", 63, com/pinterest/activity/conversation/ConversationFragment);
        CONVERSATION_CREATE = new Location("CONVERSATION_CREATE", 64, com/pinterest/activity/conversation/ConversationCreateFragment);
        STORY_PINS = new Location("STORY_PINS", 65, com/pinterest/activity/notifications/StoryPinsFragment);
        STORY_BOARDS = new Location("STORY_BOARDS", 66, com/pinterest/activity/notifications/StoryBoardsFragment);
        STORY_USERS = new Location("STORY_USERS", 67, com/pinterest/activity/notifications/StoryPinnersFragment);
        CONVERSATION_USERS = new Location("CONVERSATION_USERS", 68, com/pinterest/activity/notifications/ConversationPinnersFragment);
        SIGNUP_EXPERIMENT = new Location("SIGNUP_EXPERIMENT", 69, com/pinterest/activity/unauth/fragment/NewLoginFragment);
        USER_PINS_SELECT = new Location("USER_PINS_SELECT", 70, com/pinterest/activity/user/fragment/AddUserPinTapFragment);
        SEARCH_PIN = new Location("SEARCH_PIN", 71, com/pinterest/activity/search/fragment/GuidedPinSearchFragment);
        SEARCH_PIN_COMMERCE = new Location("SEARCH_PIN_COMMERCE", 72, com/pinterest/activity/commerce/CommerceSearchFragment);
        PIN_PICKS = new Location("PIN_PICKS", 73, com/pinterest/fragment/PinPicksFragment);
        REPORT_PIN = new Location("REPORT_PIN", 74, com/pinterest/activity/report/ReportPinFragment);
        PRICE_FILTER = new Location("PRICE_FILTER", 75, com/pinterest/activity/commerce/PriceFilterFragment);
        REPORT_PIN_UNFOLLOW = new Location("REPORT_PIN_UNFOLLOW", 76, com/pinterest/activity/report/ReportPinUnfollowFragment);
        REPORT_PIN_SPAM = new Location("REPORT_PIN_SPAM", 77, com/pinterest/activity/report/ReportPinSpamFragment);
        REPORT_PIN_AGAINST_POLICIES = new Location("REPORT_PIN_AGAINST_POLICIES", 78, com/pinterest/activity/report/ReportPinAgainstPoliciesFragment);
        REPORT_PIN_HURTFUL_CONTENT = new Location("REPORT_PIN_HURTFUL_CONTENT", 79, com/pinterest/activity/report/ReportPinHurtfulContentFragment);
        REPORT_PIN_NOT_USEFUL = new Location("REPORT_PIN_NOT_USEFUL", 80, com/pinterest/activity/report/ReportPinNotUsefulFragment);
        REPORT_PIN_IP = new Location("REPORT_PIN_IP", 81, com/pinterest/activity/report/ReportPinIntellectualPropertyFragment);
        REPORT_PIN_INCORRECT_LOCATION = new Location("REPORT_PIN_INCORRECT_LOCATION", 82, com/pinterest/activity/report/ReportPinIncorrectLocation);
        COMMERCE_CHECKOUT = new Location("COMMERCE_CHECKOUT", 83, com/pinterest/activity/commerce/CheckoutFragment);
        SEND_SHARE = new Location("SEND_SHARE", 84, com/pinterest/activity/sendshare/SendShareFragment);
        SEND_SHARE_SEARCH = new Location("SEND_SHARE_SEARCH", 85, com/pinterest/activity/sendshare/SendShareSearchFragment);
        UPLOAD_CONTACTS = new Location("UPLOAD_CONTACTS", 86, com/pinterest/activity/contacts/UploadContactsFragment);
        APP_PERMISSION_SETTINGS_GUIDE = new Location("APP_PERMISSION_SETTINGS_GUIDE", 87, com/pinterest/activity/settings/model/AppPermissionSettingsGuideFragment);
        COMMERCE_CONFIRMATION_CHECKOUT = new Location("COMMERCE_CONFIRMATION_CHECKOUT", 88, com/pinterest/activity/commerce/CheckoutConfirmationFragment);
        COMMERCE_SETTINGS = new Location("COMMERCE_SETTINGS", 89, com/pinterest/activity/commerce/CommerceSettingsFragment);
        COMMERCE_ORDER_DETAIL = new Location("COMMERCE_ORDER_DETAIL", 90, com/pinterest/activity/commerce/CommerceOrderDetailFragment);
        COMMERCE_SHOP_SPACE = new Location("COMMERCE_SHOP_SPACE", 91, com/pinterest/activity/commerce/ShopSpaceFragment);
        COMMERCE_SHOP_SPACE_BOARD = new Location("COMMERCE_SHOP_SPACE_BOARD", 92, com/pinterest/activity/commerce/ShopSpaceBoardFragment);
        CSR_PICKER = new Location("CSR_PICKER", 93, com/pinterest/activity/pin/fragment/CsrPickerFragment);
        FLASHLIGHT = new Location("FLASHLIGHT", 94, com/pinterest/activity/flashlight/FlashlightResultsFragment);
        COMMERCE_SHOP_SPACE_SECTION = new Location("COMMERCE_SHOP_SPACE_SECTION", 95, com/pinterest/activity/commerce/ShopSpaceSectionFragment);
        $VALUES = (new Location[] {
            NONE, AUTH, HOME, DYNAMIC_GRID, NUX_START_SCREEN, NUX_INTEREST, PIN, PIN_PAGER, PIN_LIKES, PIN_REPINS, 
            PIN_COMMENTS, PIN_PLACE, REPIN, REPIN_CSR, PIN_ACTIVITY_FEED, BOARD, BOARD_EDIT, BOARD_CHOOSE_COVER, BOARD_CROP_COVER, HOMEFEED_BUILDER, 
            HOMEFEED_BUILDER_LIST, HOMEFEED_BUILDER_MY_TOPICS, RELATED_BOARDS, INVITE_BOARD_COLLAB, USER, USER_BOARDS, USER_PINS, BRAND_PINS, USER_LIKES, USER_ABOUT, 
            USER_FOLLOWERS, USER_FOLLOWING, USER_LIBRARY_PROFILE, USER_LIBRARY_LIKE, USER_LIBRARY_PINS, USER_LIBRARY_FOLLOWERS, USER_LIBRARY_FOLLOWING, BOARD_SORT, USER_FOLLOWED_PINNERS, USER_FOLLOWED_INTERESTS, 
            USER_FOLLOWED_BOARDS, CATEGORY, DOMAIN, EXPLORE, CONTEXTUAL_EXPLORE, SEARCH, BROWSER, ACCOUNT_SETTINGS, PLACE_PICKER, PLACE_IMAGE_PICKER, 
            STATIC_PIN_GRID, STATIC_PIN_MAP, SHARE_EXTENSION, INTEREST, INTEREST_COLLECTION, MY_INTERESTS, NOTIFICATIONS, INVITE_FRIENDS, INVITE_ALL_FRIENDS, FIND_FRIENDS, 
            EMAIL_NOTIFICATIONS_SETTINGS, OFFLINE_BOARDS_SETTINGS, DEACTIVATE_ACCOUNT_SETTINGS, CONVERSATION, CONVERSATION_CREATE, STORY_PINS, STORY_BOARDS, STORY_USERS, CONVERSATION_USERS, SIGNUP_EXPERIMENT, 
            USER_PINS_SELECT, SEARCH_PIN, SEARCH_PIN_COMMERCE, PIN_PICKS, REPORT_PIN, PRICE_FILTER, REPORT_PIN_UNFOLLOW, REPORT_PIN_SPAM, REPORT_PIN_AGAINST_POLICIES, REPORT_PIN_HURTFUL_CONTENT, 
            REPORT_PIN_NOT_USEFUL, REPORT_PIN_IP, REPORT_PIN_INCORRECT_LOCATION, COMMERCE_CHECKOUT, SEND_SHARE, SEND_SHARE_SEARCH, UPLOAD_CONTACTS, APP_PERMISSION_SETTINGS_GUIDE, COMMERCE_CONFIRMATION_CHECKOUT, COMMERCE_SETTINGS, 
            COMMERCE_ORDER_DETAIL, COMMERCE_SHOP_SPACE, COMMERCE_SHOP_SPACE_BOARD, CSR_PICKER, FLASHLIGHT, COMMERCE_SHOP_SPACE_SECTION
        });
        HashMap hashmap = new HashMap();
        _siteMap = hashmap;
        hashmap.put("invite_friends", new CommandEvent(1, INVITE_FRIENDS.ordinal()));
        _siteMap.put("settings", new CommandEvent(1, ACCOUNT_SETTINGS.ordinal()));
        _siteMap.put("notifications", new CommandEvent(1, NOTIFICATIONS.ordinal()));
        _siteMap.put("homefeed_builder/recommended_topics", new CommandEvent(1, HOMEFEED_BUILDER_LIST.ordinal()));
        _siteMap.put("explore", new CommandEvent(1, EXPLORE.ordinal()));
        _siteMap.put("settings/offline_boards", new CommandEvent(1, OFFLINE_BOARDS_SETTINGS.ordinal()));
        _siteMap.put("send_verification_email", new CommandEvent(0, 1));
        _siteMap.put("settings/send_password_reset_email", new CommandEvent(0, 2));
        _siteMap.put("upload_contacts", new CommandEvent(0, 3));
        _siteMap.put("connect/facebook", new CommandEvent(0, 4));
        _siteMap.put("nux_start", new CommandEvent(0, 5));
        _siteMap.put("undo_rebuild_feed", new CommandEvent(0, 6));
    }

    private class _cls1 extends Location
    {

        _cls1(String s, int i, Class class1)
        {
            super(s, i, class1, null);
            _rootLocation = true;
        }
    }


    private class _cls2 extends Location
    {

        _cls2(String s, int i, Class class1)
        {
            super(s, i, class1, null);
            _rootLocation = true;
        }
    }


    private class _cls3 extends Location
    {

        _cls3(String s, int i, Class class1)
        {
            super(s, i, class1, null);
            _rootLocation = true;
        }
    }


    private class _cls4 extends HashSet
    {

        _cls4()
        {
            add(Location.PIN);
            add(Location.BOARD);
            add(Location.USER);
            add(Location.INTEREST);
            add(Location.CATEGORY);
            add(Location.BROWSER);
        }
    }

}
