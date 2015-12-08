// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.app.account.AccountProfileInfoActivity;
import com.skype.android.app.account.CallForwardingActivity;
import com.skype.android.app.account.CallForwardingNumberActivity;
import com.skype.android.app.account.EditEmailActivity;
import com.skype.android.app.account.MyInfoActivity;
import com.skype.android.app.account.UserFeedbackWebActivity;
import com.skype.android.app.account.WebActivity;
import com.skype.android.app.calling.CallActivity;
import com.skype.android.app.calling.PreCallActivity;
import com.skype.android.app.chat.AddParticipantsActivity;
import com.skype.android.app.chat.AppNotInstalledActivity;
import com.skype.android.app.chat.ChatActivity;
import com.skype.android.app.chat.OfficeNotInstalledActivity;
import com.skype.android.app.chat.OutlookNotInstalledActivity;
import com.skype.android.app.chat.ParticipantActivity;
import com.skype.android.app.chat.picker.Search.MediaPickerSearchActivity;
import com.skype.android.app.contacts.ContactAddNumberActivity;
import com.skype.android.app.contacts.ContactDirectorySearchActivity;
import com.skype.android.app.contacts.ContactEditActivity;
import com.skype.android.app.contacts.ContactListActivity;
import com.skype.android.app.contacts.ContactPickerActivity;
import com.skype.android.app.contacts.ContactProfileActivity;
import com.skype.android.app.contacts.ContactSendAuthRequestActivity;
import com.skype.android.app.contacts.OffNetworkInviteActivity;
import com.skype.android.app.contacts.PickerActivity;
import com.skype.android.app.dialer.DialpadActivity;
import com.skype.android.app.dialer.SelectCountryActivity;
import com.skype.android.app.location.ReceivedLocationActivity;
import com.skype.android.app.location.SendLocationActivity;
import com.skype.android.app.main.AbstractHubActivity;
import com.skype.android.app.main.HubActivity;
import com.skype.android.app.main.HubMaterialActivity;
import com.skype.android.app.main.SplashActivity;
import com.skype.android.app.media.MediaPhotoViewerActivity;
import com.skype.android.app.recents.RecentListActivity;
import com.skype.android.app.settings.AboutActivity;
import com.skype.android.app.settings.ManageAliasesActivity;
import com.skype.android.app.settings.SettingsActivity;
import com.skype.android.app.shortcircuit.StallNewUserActivity;
import com.skype.android.app.signin.AbstractSignInActivity;
import com.skype.android.app.signin.AuthenticateWithMsaActivity;
import com.skype.android.app.signin.LandingPageActivity;
import com.skype.android.app.signin.LinkingAbstractSignInActivity;
import com.skype.android.app.signin.LinkingAccountsAnimationActivity;
import com.skype.android.app.signin.LinkingDoneActivity;
import com.skype.android.app.signin.LinkingErrorActivity;
import com.skype.android.app.signin.LinkingPickSuggestedAccountsActivity;
import com.skype.android.app.signin.LinkingPreSignInActivity;
import com.skype.android.app.signin.LinkingSkypeNamesFoundActivity;
import com.skype.android.app.signin.LinkingSkypeNamesNotFoundActivity;
import com.skype.android.app.signin.LinkingTermsOfUseActivity;
import com.skype.android.app.signin.SelectSkypeNameActivity;
import com.skype.android.app.signin.SignInActivity;
import com.skype.android.app.signin.SignInLandingPageActivity;
import com.skype.android.app.signin.SignInLiveIdActivity;
import com.skype.android.app.signin.SignOutActivity;
import com.skype.android.app.signin.SignUpActivity;
import com.skype.android.app.signin.SignoutEducationActivity;
import com.skype.android.app.signin.SimpleLandingPageActivity;
import com.skype.android.app.signin.TermsOfUseActivity;
import com.skype.android.app.signin.UnifiedLandingPageActivity;
import com.skype.android.app.vim.VideoMessagePlayerActivity;
import com.skype.android.app.vim.VideoMessagePromotionActivity;
import com.skype.android.app.vim.VideoMessageRecorderActivity;
import com.skype.android.app.vim.VideoMessageReviewActivity;

// Referenced classes of package com.skype.android:
//            SkypeActivity

public interface SkypeActivityComponent
{

    public abstract void inject(SkypeActivity skypeactivity);

    public abstract void inject(AccountProfileInfoActivity accountprofileinfoactivity);

    public abstract void inject(CallForwardingActivity callforwardingactivity);

    public abstract void inject(CallForwardingNumberActivity callforwardingnumberactivity);

    public abstract void inject(EditEmailActivity editemailactivity);

    public abstract void inject(MyInfoActivity myinfoactivity);

    public abstract void inject(UserFeedbackWebActivity userfeedbackwebactivity);

    public abstract void inject(WebActivity webactivity);

    public abstract void inject(CallActivity callactivity);

    public abstract void inject(PreCallActivity precallactivity);

    public abstract void inject(AddParticipantsActivity addparticipantsactivity);

    public abstract void inject(AppNotInstalledActivity appnotinstalledactivity);

    public abstract void inject(ChatActivity chatactivity);

    public abstract void inject(OfficeNotInstalledActivity officenotinstalledactivity);

    public abstract void inject(OutlookNotInstalledActivity outlooknotinstalledactivity);

    public abstract void inject(ParticipantActivity participantactivity);

    public abstract void inject(MediaPickerSearchActivity mediapickersearchactivity);

    public abstract void inject(ContactAddNumberActivity contactaddnumberactivity);

    public abstract void inject(ContactDirectorySearchActivity contactdirectorysearchactivity);

    public abstract void inject(ContactEditActivity contacteditactivity);

    public abstract void inject(ContactListActivity contactlistactivity);

    public abstract void inject(ContactPickerActivity contactpickeractivity);

    public abstract void inject(ContactProfileActivity contactprofileactivity);

    public abstract void inject(ContactSendAuthRequestActivity contactsendauthrequestactivity);

    public abstract void inject(OffNetworkInviteActivity offnetworkinviteactivity);

    public abstract void inject(PickerActivity pickeractivity);

    public abstract void inject(DialpadActivity dialpadactivity);

    public abstract void inject(SelectCountryActivity selectcountryactivity);

    public abstract void inject(ReceivedLocationActivity receivedlocationactivity);

    public abstract void inject(SendLocationActivity sendlocationactivity);

    public abstract void inject(AbstractHubActivity abstracthubactivity);

    public abstract void inject(HubActivity hubactivity);

    public abstract void inject(HubMaterialActivity hubmaterialactivity);

    public abstract void inject(SplashActivity splashactivity);

    public abstract void inject(MediaPhotoViewerActivity mediaphotovieweractivity);

    public abstract void inject(RecentListActivity recentlistactivity);

    public abstract void inject(AboutActivity aboutactivity);

    public abstract void inject(ManageAliasesActivity managealiasesactivity);

    public abstract void inject(SettingsActivity settingsactivity);

    public abstract void inject(StallNewUserActivity stallnewuseractivity);

    public abstract void inject(AbstractSignInActivity abstractsigninactivity);

    public abstract void inject(AuthenticateWithMsaActivity authenticatewithmsaactivity);

    public abstract void inject(LandingPageActivity landingpageactivity);

    public abstract void inject(LinkingAbstractSignInActivity linkingabstractsigninactivity);

    public abstract void inject(LinkingAccountsAnimationActivity linkingaccountsanimationactivity);

    public abstract void inject(LinkingDoneActivity linkingdoneactivity);

    public abstract void inject(LinkingErrorActivity linkingerroractivity);

    public abstract void inject(LinkingPickSuggestedAccountsActivity linkingpicksuggestedaccountsactivity);

    public abstract void inject(LinkingPreSignInActivity linkingpresigninactivity);

    public abstract void inject(LinkingSkypeNamesFoundActivity linkingskypenamesfoundactivity);

    public abstract void inject(LinkingSkypeNamesNotFoundActivity linkingskypenamesnotfoundactivity);

    public abstract void inject(LinkingTermsOfUseActivity linkingtermsofuseactivity);

    public abstract void inject(SelectSkypeNameActivity selectskypenameactivity);

    public abstract void inject(SignInActivity signinactivity);

    public abstract void inject(SignInLandingPageActivity signinlandingpageactivity);

    public abstract void inject(SignInLiveIdActivity signinliveidactivity);

    public abstract void inject(SignOutActivity signoutactivity);

    public abstract void inject(SignUpActivity signupactivity);

    public abstract void inject(SignoutEducationActivity signouteducationactivity);

    public abstract void inject(SimpleLandingPageActivity simplelandingpageactivity);

    public abstract void inject(TermsOfUseActivity termsofuseactivity);

    public abstract void inject(UnifiedLandingPageActivity unifiedlandingpageactivity);

    public abstract void inject(VideoMessagePlayerActivity videomessageplayeractivity);

    public abstract void inject(VideoMessagePromotionActivity videomessagepromotionactivity);

    public abstract void inject(VideoMessageRecorderActivity videomessagerecorderactivity);

    public abstract void inject(VideoMessageReviewActivity videomessagereviewactivity);
}
