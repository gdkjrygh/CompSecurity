// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.app.account.MyInfoFragment;
import com.skype.android.app.calling.CallRosterFragment;
import com.skype.android.app.calling.InCallFragment;
import com.skype.android.app.chat.AddParticipantsAccessibilityFragment;
import com.skype.android.app.chat.ChatFragment;
import com.skype.android.app.chat.ParticipantListFragment;
import com.skype.android.app.chat.SideBarFragment;
import com.skype.android.app.chat.picker.Search.MediaPickerSearchFragment;
import com.skype.android.app.contacts.ContactListFragment;
import com.skype.android.app.contacts.ContactMoodMessageFragment;
import com.skype.android.app.contacts.ContactPickerFragment;
import com.skype.android.app.contacts.ContactProfileFragment;
import com.skype.android.app.contacts.ContactSuggestedInvitesPickerFragment;
import com.skype.android.app.contacts.ContactTopPicksFragment;
import com.skype.android.app.contacts.PickerFragment;
import com.skype.android.app.dialer.CallHistoryFragment;
import com.skype.android.app.dialer.CallHistoryMaterialFragment;
import com.skype.android.app.favorites.FavoritesFragment;
import com.skype.android.app.favorites.FavoritesPickContactsFragment;
import com.skype.android.app.mnv.MnvAddFriendsFragment;
import com.skype.android.app.mnv.MnvAddNumberFragment;
import com.skype.android.app.mnv.MnvBaseFragment;
import com.skype.android.app.mnv.MnvCheckingAccountFragment;
import com.skype.android.app.mnv.MnvEnterPinFragment;
import com.skype.android.app.mnv.MnvErrorFragment;
import com.skype.android.app.mnv.MnvLearnMoreFragment;
import com.skype.android.app.mnv.MnvRequestFragment;
import com.skype.android.app.mnv.MnvVerifiedFragment;
import com.skype.android.app.recents.RecentListFragment;
import com.skype.android.app.settings.AboutFragment;
import com.skype.android.app.settings.AttributionsFragment;
import com.skype.android.app.settings.DebugSettingsFragment;
import com.skype.android.app.settings.ManageAliasesFragment;
import com.skype.android.app.settings.NotificationSettingsFragment;
import com.skype.android.app.settings.SettingsCategoriesFragment;
import com.skype.android.app.settings.SettingsFragment;
import com.skype.android.app.signin.UnifiedSignInFragment;
import com.skype.android.app.signin.UnifiedSignInPickAccountFragment;
import com.skype.android.app.transfer.TransferPickConversationFragment;
import com.skype.android.app.vim.VideoCaptureFragment;

// Referenced classes of package com.skype.android:
//            SkypeFragment, SkypeListFragment

public interface SkypeFragmentComponent
{

    public abstract void inject(SkypeFragment skypefragment);

    public abstract void inject(SkypeListFragment skypelistfragment);

    public abstract void inject(MyInfoFragment myinfofragment);

    public abstract void inject(CallRosterFragment callrosterfragment);

    public abstract void inject(InCallFragment incallfragment);

    public abstract void inject(AddParticipantsAccessibilityFragment addparticipantsaccessibilityfragment);

    public abstract void inject(ChatFragment chatfragment);

    public abstract void inject(ParticipantListFragment participantlistfragment);

    public abstract void inject(SideBarFragment sidebarfragment);

    public abstract void inject(MediaPickerSearchFragment mediapickersearchfragment);

    public abstract void inject(ContactListFragment contactlistfragment);

    public abstract void inject(ContactMoodMessageFragment contactmoodmessagefragment);

    public abstract void inject(ContactPickerFragment contactpickerfragment);

    public abstract void inject(ContactProfileFragment contactprofilefragment);

    public abstract void inject(ContactSuggestedInvitesPickerFragment contactsuggestedinvitespickerfragment);

    public abstract void inject(ContactTopPicksFragment contacttoppicksfragment);

    public abstract void inject(PickerFragment pickerfragment);

    public abstract void inject(CallHistoryFragment callhistoryfragment);

    public abstract void inject(CallHistoryMaterialFragment callhistorymaterialfragment);

    public abstract void inject(FavoritesFragment favoritesfragment);

    public abstract void inject(FavoritesPickContactsFragment favoritespickcontactsfragment);

    public abstract void inject(MnvAddFriendsFragment mnvaddfriendsfragment);

    public abstract void inject(MnvAddNumberFragment mnvaddnumberfragment);

    public abstract void inject(MnvBaseFragment mnvbasefragment);

    public abstract void inject(MnvCheckingAccountFragment mnvcheckingaccountfragment);

    public abstract void inject(MnvEnterPinFragment mnventerpinfragment);

    public abstract void inject(MnvErrorFragment mnverrorfragment);

    public abstract void inject(MnvLearnMoreFragment mnvlearnmorefragment);

    public abstract void inject(MnvRequestFragment mnvrequestfragment);

    public abstract void inject(MnvVerifiedFragment mnvverifiedfragment);

    public abstract void inject(RecentListFragment recentlistfragment);

    public abstract void inject(AboutFragment aboutfragment);

    public abstract void inject(AttributionsFragment attributionsfragment);

    public abstract void inject(DebugSettingsFragment debugsettingsfragment);

    public abstract void inject(ManageAliasesFragment managealiasesfragment);

    public abstract void inject(NotificationSettingsFragment notificationsettingsfragment);

    public abstract void inject(SettingsCategoriesFragment settingscategoriesfragment);

    public abstract void inject(SettingsFragment settingsfragment);

    public abstract void inject(UnifiedSignInFragment unifiedsigninfragment);

    public abstract void inject(UnifiedSignInPickAccountFragment unifiedsigninpickaccountfragment);

    public abstract void inject(TransferPickConversationFragment transferpickconversationfragment);

    public abstract void inject(VideoCaptureFragment videocapturefragment);
}
