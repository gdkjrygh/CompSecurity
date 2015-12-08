// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import com.snapchat.android.Timber;
import com.snapchat.android.fragments.cash.CashSettingsFragment;
import com.snapchat.android.fragments.chat.ChatWithFragment;
import com.snapchat.android.fragments.settings.AddCollaboratorFragment;
import com.snapchat.android.fragments.settings.AdditionalServicesFragment;
import com.snapchat.android.fragments.settings.BetaSettingsFragment;
import com.snapchat.android.fragments.settings.BlockedUsersFragment;
import com.snapchat.android.fragments.settings.ClearConversationsFragment;
import com.snapchat.android.fragments.settings.CustomStoryPrivacyFragment;
import com.snapchat.android.fragments.settings.DeveloperSettingsFragment;
import com.snapchat.android.fragments.settings.NotificationSettingsFragment;
import com.snapchat.android.fragments.settings.OfficialStoriesFragment;
import com.snapchat.android.fragments.settings.SettingsFragment;
import com.snapchat.android.fragments.settings.WebFragment;
import com.snapchat.android.fragments.settings.displayname.DisplayNameSettingsFragment;
import com.snapchat.android.fragments.settings.email.EmailSettingsFragment;
import com.snapchat.android.fragments.settings.email.EmailVerificationSentFragment;
import com.snapchat.android.fragments.settings.password.PasswordValidationFragment;
import com.snapchat.android.fragments.settings.twofa.ForgetDeviceFragment;
import com.snapchat.android.fragments.settings.twofa.RecoveryCodeFragment;
import com.snapchat.android.fragments.settings.twofa.TwoFactorSettingsDisabledFragment;
import com.snapchat.android.fragments.settings.twofa.TwoFactorSettingsEnabledFragment;
import com.snapchat.android.fragments.verification.SettingsPhoneVerificationFragment;
import com.snapchat.android.trophies.TrophyCaseFragment;
import com.snapchat.android.util.fragment.SnapchatFragment;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddFriendsByUsernameFragment, AddFriendsFromCameraRollFragment, AddFriendsMenuFragment, AddNearbyFriendsFragment, 
//            AddedMeFragment, AddressBookFragment, AddressBookSearchViewFragment, FriendsContactsToggleFragment, 
//            MyFriendsSearchViewFragment

public final class LeftSwipeContentFragment extends Enum
{

    private static final LeftSwipeContentFragment $VALUES[];
    public static final LeftSwipeContentFragment ADDED_ME_FRAGMENT;
    public static final LeftSwipeContentFragment ADDITIONAL_SERVICES_FRAGMENT;
    public static final LeftSwipeContentFragment ADDRESS_BOOK_FRAGMENT;
    public static final LeftSwipeContentFragment ADDRESS_BOOK_SEARCH_VIEW_FRAGMENT;
    public static final LeftSwipeContentFragment ADD_COLLABORATOR_FRAGMENT;
    public static final LeftSwipeContentFragment ADD_FRIENDS_BY_USERNAME_FRAGMENT;
    public static final LeftSwipeContentFragment ADD_FRIENDS_FROM_CAMERAROLL_FRAGMENT;
    public static final LeftSwipeContentFragment ADD_FRIENDS_MENU_FRAGMENT;
    public static final LeftSwipeContentFragment ADD_NEARBY_FRIENDS_FRAGMENT;
    public static final LeftSwipeContentFragment BETA_SETTINGS_FRAGMENT;
    public static final LeftSwipeContentFragment BLOCKED_USERS_FRAGMENT;
    public static final LeftSwipeContentFragment CASH_SETTINGS_FRAGMENT;
    public static final LeftSwipeContentFragment CHAT_WITH_FRAGMENT;
    public static final LeftSwipeContentFragment CLEAR_CONVERSATIONS_FRAGMENT;
    public static final LeftSwipeContentFragment CUSTOM_STORY_PRIVACY_FRAGMENT;
    public static final LeftSwipeContentFragment DEVELOPER_SETTINGS_FRAGMENT;
    public static final LeftSwipeContentFragment DISPLAY_NAME_SETTING;
    public static final LeftSwipeContentFragment EMAIL_SETTINGS_FRAGMENT;
    public static final LeftSwipeContentFragment EMAIL_VERIFICATION_SENT_FRAGMENT;
    public static final LeftSwipeContentFragment FORGET_DEVICE_FRAGMENT;
    public static final LeftSwipeContentFragment FRIENDS_CONTACTS_TOGGLE_FRAGMENT;
    public static final LeftSwipeContentFragment MY_FRIENDS_SEARCH_VIEW_FRAGMENT;
    public static final LeftSwipeContentFragment NOTIFICATION_SETTINGS_FRAGMENT;
    public static final LeftSwipeContentFragment OFFICIAL_STORIES_FRAGMENT;
    public static final LeftSwipeContentFragment PASSWORD_VALIDATION_FRAGMENT;
    public static final LeftSwipeContentFragment RECOVERY_CODE_FRAGMENT;
    public static final LeftSwipeContentFragment SETTINGS_FRAGMENT;
    public static final LeftSwipeContentFragment SETTINGS_PHONE_VERIFICATION_FRAGMENT;
    public static final LeftSwipeContentFragment TROPHYCASE_FRAGMENT;
    public static final LeftSwipeContentFragment TWO_FACTOR_SETTINGS_DISABLED_FRAGMENT;
    public static final LeftSwipeContentFragment TWO_FACTOR_SETTINGS_ENABLED_FRAGMENT;
    public static final LeftSwipeContentFragment WEB_FRAGMENT;
    private final Class a;

    private LeftSwipeContentFragment(String s, int i, Class class1)
    {
        super(s, i);
        a = class1;
    }

    public static LeftSwipeContentFragment valueOf(String s)
    {
        return (LeftSwipeContentFragment)Enum.valueOf(com/snapchat/android/fragments/addfriends/LeftSwipeContentFragment, s);
    }

    public static LeftSwipeContentFragment[] values()
    {
        return (LeftSwipeContentFragment[])$VALUES.clone();
    }

    public final SnapchatFragment newInstance()
    {
        SnapchatFragment snapchatfragment;
        try
        {
            snapchatfragment = (SnapchatFragment)a.newInstance();
        }
        catch (Exception exception)
        {
            Timber.e("LeftSwipeContentFragment", (new StringBuilder("Failed to create a new instance of LeftSwipeContentFragment ")).append(exception).toString(), new Object[0]);
            return null;
        }
        return snapchatfragment;
    }

    public final String tag()
    {
        return (new StringBuilder("LEFT_SWIPE_")).append(name()).toString();
    }

    static 
    {
        ADD_FRIENDS_BY_USERNAME_FRAGMENT = new LeftSwipeContentFragment("ADD_FRIENDS_BY_USERNAME_FRAGMENT", 0, com/snapchat/android/fragments/addfriends/AddFriendsByUsernameFragment);
        ADD_FRIENDS_FROM_CAMERAROLL_FRAGMENT = new LeftSwipeContentFragment("ADD_FRIENDS_FROM_CAMERAROLL_FRAGMENT", 1, com/snapchat/android/fragments/addfriends/AddFriendsFromCameraRollFragment);
        ADD_FRIENDS_MENU_FRAGMENT = new LeftSwipeContentFragment("ADD_FRIENDS_MENU_FRAGMENT", 2, com/snapchat/android/fragments/addfriends/AddFriendsMenuFragment);
        ADD_NEARBY_FRIENDS_FRAGMENT = new LeftSwipeContentFragment("ADD_NEARBY_FRIENDS_FRAGMENT", 3, com/snapchat/android/fragments/addfriends/AddNearbyFriendsFragment);
        ADDED_ME_FRAGMENT = new LeftSwipeContentFragment("ADDED_ME_FRAGMENT", 4, com/snapchat/android/fragments/addfriends/AddedMeFragment);
        ADDRESS_BOOK_FRAGMENT = new LeftSwipeContentFragment("ADDRESS_BOOK_FRAGMENT", 5, com/snapchat/android/fragments/addfriends/AddressBookFragment);
        ADDRESS_BOOK_SEARCH_VIEW_FRAGMENT = new LeftSwipeContentFragment("ADDRESS_BOOK_SEARCH_VIEW_FRAGMENT", 6, com/snapchat/android/fragments/addfriends/AddressBookSearchViewFragment);
        CHAT_WITH_FRAGMENT = new LeftSwipeContentFragment("CHAT_WITH_FRAGMENT", 7, com/snapchat/android/fragments/chat/ChatWithFragment);
        FRIENDS_CONTACTS_TOGGLE_FRAGMENT = new LeftSwipeContentFragment("FRIENDS_CONTACTS_TOGGLE_FRAGMENT", 8, com/snapchat/android/fragments/addfriends/FriendsContactsToggleFragment);
        MY_FRIENDS_SEARCH_VIEW_FRAGMENT = new LeftSwipeContentFragment("MY_FRIENDS_SEARCH_VIEW_FRAGMENT", 9, com/snapchat/android/fragments/addfriends/MyFriendsSearchViewFragment);
        SETTINGS_FRAGMENT = new LeftSwipeContentFragment("SETTINGS_FRAGMENT", 10, com/snapchat/android/fragments/settings/SettingsFragment);
        ADDITIONAL_SERVICES_FRAGMENT = new LeftSwipeContentFragment("ADDITIONAL_SERVICES_FRAGMENT", 11, com/snapchat/android/fragments/settings/AdditionalServicesFragment);
        OFFICIAL_STORIES_FRAGMENT = new LeftSwipeContentFragment("OFFICIAL_STORIES_FRAGMENT", 12, com/snapchat/android/fragments/settings/OfficialStoriesFragment);
        ADD_COLLABORATOR_FRAGMENT = new LeftSwipeContentFragment("ADD_COLLABORATOR_FRAGMENT", 13, com/snapchat/android/fragments/settings/AddCollaboratorFragment);
        BETA_SETTINGS_FRAGMENT = new LeftSwipeContentFragment("BETA_SETTINGS_FRAGMENT", 14, com/snapchat/android/fragments/settings/BetaSettingsFragment);
        BLOCKED_USERS_FRAGMENT = new LeftSwipeContentFragment("BLOCKED_USERS_FRAGMENT", 15, com/snapchat/android/fragments/settings/BlockedUsersFragment);
        CASH_SETTINGS_FRAGMENT = new LeftSwipeContentFragment("CASH_SETTINGS_FRAGMENT", 16, com/snapchat/android/fragments/cash/CashSettingsFragment);
        CLEAR_CONVERSATIONS_FRAGMENT = new LeftSwipeContentFragment("CLEAR_CONVERSATIONS_FRAGMENT", 17, com/snapchat/android/fragments/settings/ClearConversationsFragment);
        CUSTOM_STORY_PRIVACY_FRAGMENT = new LeftSwipeContentFragment("CUSTOM_STORY_PRIVACY_FRAGMENT", 18, com/snapchat/android/fragments/settings/CustomStoryPrivacyFragment);
        DEVELOPER_SETTINGS_FRAGMENT = new LeftSwipeContentFragment("DEVELOPER_SETTINGS_FRAGMENT", 19, com/snapchat/android/fragments/settings/DeveloperSettingsFragment);
        DISPLAY_NAME_SETTING = new LeftSwipeContentFragment("DISPLAY_NAME_SETTING", 20, com/snapchat/android/fragments/settings/displayname/DisplayNameSettingsFragment);
        EMAIL_SETTINGS_FRAGMENT = new LeftSwipeContentFragment("EMAIL_SETTINGS_FRAGMENT", 21, com/snapchat/android/fragments/settings/email/EmailSettingsFragment);
        EMAIL_VERIFICATION_SENT_FRAGMENT = new LeftSwipeContentFragment("EMAIL_VERIFICATION_SENT_FRAGMENT", 22, com/snapchat/android/fragments/settings/email/EmailVerificationSentFragment);
        FORGET_DEVICE_FRAGMENT = new LeftSwipeContentFragment("FORGET_DEVICE_FRAGMENT", 23, com/snapchat/android/fragments/settings/twofa/ForgetDeviceFragment);
        NOTIFICATION_SETTINGS_FRAGMENT = new LeftSwipeContentFragment("NOTIFICATION_SETTINGS_FRAGMENT", 24, com/snapchat/android/fragments/settings/NotificationSettingsFragment);
        PASSWORD_VALIDATION_FRAGMENT = new LeftSwipeContentFragment("PASSWORD_VALIDATION_FRAGMENT", 25, com/snapchat/android/fragments/settings/password/PasswordValidationFragment);
        RECOVERY_CODE_FRAGMENT = new LeftSwipeContentFragment("RECOVERY_CODE_FRAGMENT", 26, com/snapchat/android/fragments/settings/twofa/RecoveryCodeFragment);
        SETTINGS_PHONE_VERIFICATION_FRAGMENT = new LeftSwipeContentFragment("SETTINGS_PHONE_VERIFICATION_FRAGMENT", 27, com/snapchat/android/fragments/verification/SettingsPhoneVerificationFragment);
        TROPHYCASE_FRAGMENT = new LeftSwipeContentFragment("TROPHYCASE_FRAGMENT", 28, com/snapchat/android/trophies/TrophyCaseFragment);
        TWO_FACTOR_SETTINGS_ENABLED_FRAGMENT = new LeftSwipeContentFragment("TWO_FACTOR_SETTINGS_ENABLED_FRAGMENT", 29, com/snapchat/android/fragments/settings/twofa/TwoFactorSettingsEnabledFragment);
        TWO_FACTOR_SETTINGS_DISABLED_FRAGMENT = new LeftSwipeContentFragment("TWO_FACTOR_SETTINGS_DISABLED_FRAGMENT", 30, com/snapchat/android/fragments/settings/twofa/TwoFactorSettingsDisabledFragment);
        WEB_FRAGMENT = new LeftSwipeContentFragment("WEB_FRAGMENT", 31, com/snapchat/android/fragments/settings/WebFragment);
        $VALUES = (new LeftSwipeContentFragment[] {
            ADD_FRIENDS_BY_USERNAME_FRAGMENT, ADD_FRIENDS_FROM_CAMERAROLL_FRAGMENT, ADD_FRIENDS_MENU_FRAGMENT, ADD_NEARBY_FRIENDS_FRAGMENT, ADDED_ME_FRAGMENT, ADDRESS_BOOK_FRAGMENT, ADDRESS_BOOK_SEARCH_VIEW_FRAGMENT, CHAT_WITH_FRAGMENT, FRIENDS_CONTACTS_TOGGLE_FRAGMENT, MY_FRIENDS_SEARCH_VIEW_FRAGMENT, 
            SETTINGS_FRAGMENT, ADDITIONAL_SERVICES_FRAGMENT, OFFICIAL_STORIES_FRAGMENT, ADD_COLLABORATOR_FRAGMENT, BETA_SETTINGS_FRAGMENT, BLOCKED_USERS_FRAGMENT, CASH_SETTINGS_FRAGMENT, CLEAR_CONVERSATIONS_FRAGMENT, CUSTOM_STORY_PRIVACY_FRAGMENT, DEVELOPER_SETTINGS_FRAGMENT, 
            DISPLAY_NAME_SETTING, EMAIL_SETTINGS_FRAGMENT, EMAIL_VERIFICATION_SENT_FRAGMENT, FORGET_DEVICE_FRAGMENT, NOTIFICATION_SETTINGS_FRAGMENT, PASSWORD_VALIDATION_FRAGMENT, RECOVERY_CODE_FRAGMENT, SETTINGS_PHONE_VERIFICATION_FRAGMENT, TROPHYCASE_FRAGMENT, TWO_FACTOR_SETTINGS_ENABLED_FRAGMENT, 
            TWO_FACTOR_SETTINGS_DISABLED_FRAGMENT, WEB_FRAGMENT
        });
    }
}
