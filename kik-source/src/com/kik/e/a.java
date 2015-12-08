// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.e;

import com.kik.cards.browser.CaptchaWindowFragment;
import com.kik.cards.web.CardsWebViewFragment;
import com.kik.view.adapters.ar;
import kik.android.KikNotificationHandler;
import kik.android.chat.KikApplication;
import kik.android.chat.activity.FragmentWrapperActivity;
import kik.android.chat.activity.IntroActivity;
import kik.android.chat.activity.KikActivityBase;
import kik.android.chat.activity.KikApiLandingActivity;
import kik.android.chat.activity.KikIqActivityBase;
import kik.android.chat.activity.KikPlatformLanding;
import kik.android.chat.fragment.AbTestsFragment;
import kik.android.chat.fragment.BaseChatInfoFragment;
import kik.android.chat.fragment.CameraFragment;
import kik.android.chat.fragment.ChatBubbleSelectionFragment;
import kik.android.chat.fragment.ConversationsBaseFragment;
import kik.android.chat.fragment.KikAddContactFragment;
import kik.android.chat.fragment.KikCardBrowserFragment;
import kik.android.chat.fragment.KikChangeGroupNameFragment;
import kik.android.chat.fragment.KikChatFragment;
import kik.android.chat.fragment.KikChatInfoFragment;
import kik.android.chat.fragment.KikCodeFragment;
import kik.android.chat.fragment.KikContactsListFragment;
import kik.android.chat.fragment.KikConversationsFragment;
import kik.android.chat.fragment.KikDefaultContactsListFragment;
import kik.android.chat.fragment.KikDisplayOnlyChatInfoFragment;
import kik.android.chat.fragment.KikFindPeopleFragment;
import kik.android.chat.fragment.KikGroupMembersListFragment;
import kik.android.chat.fragment.KikIqFragmentBase;
import kik.android.chat.fragment.KikLoginFragment;
import kik.android.chat.fragment.KikMultiselectContactsListFragment;
import kik.android.chat.fragment.KikPermissionsFragment;
import kik.android.chat.fragment.KikPickContactFragment;
import kik.android.chat.fragment.KikPickUsersFragment;
import kik.android.chat.fragment.KikPreferenceLaunchpad;
import kik.android.chat.fragment.KikPromotedChatsFragment;
import kik.android.chat.fragment.KikRegistrationFragment;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.chat.fragment.KikSponsoredBaseFragment;
import kik.android.chat.fragment.KikStartGroupFragment;
import kik.android.chat.fragment.KikWelcomeFragment;
import kik.android.chat.fragment.MissedConversationsFragment;
import kik.android.chat.fragment.ScanCodeTabFragment;
import kik.android.chat.fragment.SendToFragment;
import kik.android.chat.fragment.SimpleFragmentWrapperActivity;
import kik.android.chat.fragment.VideoTrimmingFragment;
import kik.android.chat.fragment.ViewPictureFragment;
import kik.android.chat.fragment.settings.KikPreferenceFragment;
import kik.android.i.i;
import kik.android.net.communicator.CommunicatorService;
import kik.android.scan.fragment.ScanFragment;
import kik.android.widget.GalleryWidget;
import kik.android.widget.GifWidget;
import kik.android.widget.GifWidgetFragment;
import kik.android.widget.WebTrayWidget;
import kik.android.widget.preferences.AutoplayVideoPreference;
import kik.android.widget.preferences.HelpPreference;
import kik.android.widget.preferences.KikCheckBoxPreference;
import kik.android.widget.preferences.KikEditTextPreference;
import kik.android.widget.preferences.KikEmailPreference;
import kik.android.widget.preferences.KikModalPreference;
import kik.android.widget.preferences.KikPreference;
import kik.android.widget.preferences.KikPreferenceScreen;
import kik.android.widget.preferences.KikProfilePicPreference;
import kik.android.widget.preferences.KikVideoPrefetchPreference;
import kik.android.widget.preferences.LEDNotificationPreference;
import kik.android.widget.preferences.MatchingPreference;
import kik.android.widget.preferences.NamePreference;
import kik.android.widget.preferences.NotifyNewPeoplePreference;
import kik.android.widget.preferences.OptOutPreference;
import kik.android.widget.preferences.PasswordPreference;
import kik.android.widget.preferences.ResetKikPreference;
import kik.android.widget.preferences.ShareEmailPreference;
import kik.android.widget.preferences.ShareOtherPreference;
import kik.android.widget.preferences.ShareProfilePreference;
import kik.android.widget.preferences.ShareSmsPreference;
import kik.android.widget.preferences.ShareSocialPreference;
import kik.android.widget.preferences.ShowKikCodePreference;
import kik.android.widget.preferences.UsernamePreference;

public interface a
{

    public abstract void a(CaptchaWindowFragment captchawindowfragment);

    public abstract void a(CardsWebViewFragment cardswebviewfragment);

    public abstract void a(ar ar);

    public abstract void a(KikNotificationHandler kiknotificationhandler);

    public abstract void a(KikApplication kikapplication);

    public abstract void a(FragmentWrapperActivity fragmentwrapperactivity);

    public abstract void a(IntroActivity introactivity);

    public abstract void a(KikActivityBase kikactivitybase);

    public abstract void a(KikApiLandingActivity kikapilandingactivity);

    public abstract void a(KikIqActivityBase kikiqactivitybase);

    public abstract void a(KikPlatformLanding kikplatformlanding);

    public abstract void a(AbTestsFragment abtestsfragment);

    public abstract void a(BaseChatInfoFragment basechatinfofragment);

    public abstract void a(CameraFragment camerafragment);

    public abstract void a(ChatBubbleSelectionFragment chatbubbleselectionfragment);

    public abstract void a(ConversationsBaseFragment conversationsbasefragment);

    public abstract void a(KikAddContactFragment kikaddcontactfragment);

    public abstract void a(KikCardBrowserFragment kikcardbrowserfragment);

    public abstract void a(KikChangeGroupNameFragment kikchangegroupnamefragment);

    public abstract void a(KikChatFragment kikchatfragment);

    public abstract void a(KikChatInfoFragment kikchatinfofragment);

    public abstract void a(KikCodeFragment kikcodefragment);

    public abstract void a(KikContactsListFragment kikcontactslistfragment);

    public abstract void a(KikConversationsFragment kikconversationsfragment);

    public abstract void a(KikDefaultContactsListFragment kikdefaultcontactslistfragment);

    public abstract void a(KikDisplayOnlyChatInfoFragment kikdisplayonlychatinfofragment);

    public abstract void a(KikFindPeopleFragment kikfindpeoplefragment);

    public abstract void a(KikGroupMembersListFragment kikgroupmemberslistfragment);

    public abstract void a(KikIqFragmentBase kikiqfragmentbase);

    public abstract void a(KikLoginFragment kikloginfragment);

    public abstract void a(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment);

    public abstract void a(KikPermissionsFragment kikpermissionsfragment);

    public abstract void a(KikPickContactFragment kikpickcontactfragment);

    public abstract void a(KikPickUsersFragment kikpickusersfragment);

    public abstract void a(KikPreferenceLaunchpad kikpreferencelaunchpad);

    public abstract void a(KikPromotedChatsFragment kikpromotedchatsfragment);

    public abstract void a(KikRegistrationFragment kikregistrationfragment);

    public abstract void a(KikScopedDialogFragment kikscopeddialogfragment);

    public abstract void a(KikSponsoredBaseFragment kiksponsoredbasefragment);

    public abstract void a(KikStartGroupFragment kikstartgroupfragment);

    public abstract void a(KikWelcomeFragment kikwelcomefragment);

    public abstract void a(MissedConversationsFragment missedconversationsfragment);

    public abstract void a(ScanCodeTabFragment scancodetabfragment);

    public abstract void a(SendToFragment sendtofragment);

    public abstract void a(SimpleFragmentWrapperActivity simplefragmentwrapperactivity);

    public abstract void a(VideoTrimmingFragment videotrimmingfragment);

    public abstract void a(ViewPictureFragment viewpicturefragment);

    public abstract void a(KikPreferenceFragment kikpreferencefragment);

    public abstract void a(i i);

    public abstract void a(CommunicatorService communicatorservice);

    public abstract void a(ScanFragment scanfragment);

    public abstract void a(GalleryWidget gallerywidget);

    public abstract void a(GifWidget gifwidget);

    public abstract void a(GifWidgetFragment gifwidgetfragment);

    public abstract void a(WebTrayWidget webtraywidget);

    public abstract void a(AutoplayVideoPreference autoplayvideopreference);

    public abstract void a(HelpPreference helppreference);

    public abstract void a(KikCheckBoxPreference kikcheckboxpreference);

    public abstract void a(KikEditTextPreference kikedittextpreference);

    public abstract void a(KikEmailPreference kikemailpreference);

    public abstract void a(KikModalPreference kikmodalpreference);

    public abstract void a(KikPreference kikpreference);

    public abstract void a(KikPreferenceScreen kikpreferencescreen);

    public abstract void a(KikProfilePicPreference kikprofilepicpreference);

    public abstract void a(KikVideoPrefetchPreference kikvideoprefetchpreference);

    public abstract void a(LEDNotificationPreference lednotificationpreference);

    public abstract void a(MatchingPreference matchingpreference);

    public abstract void a(NamePreference namepreference);

    public abstract void a(NotifyNewPeoplePreference notifynewpeoplepreference);

    public abstract void a(OptOutPreference optoutpreference);

    public abstract void a(PasswordPreference passwordpreference);

    public abstract void a(ResetKikPreference resetkikpreference);

    public abstract void a(ShareEmailPreference shareemailpreference);

    public abstract void a(ShareOtherPreference shareotherpreference);

    public abstract void a(ShareProfilePreference shareprofilepreference);

    public abstract void a(ShareSmsPreference sharesmspreference);

    public abstract void a(ShareSocialPreference sharesocialpreference);

    public abstract void a(ShowKikCodePreference showkikcodepreference);

    public abstract void a(UsernamePreference usernamepreference);
}
