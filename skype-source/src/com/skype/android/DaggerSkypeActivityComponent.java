// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.analytics.AnalyticsLifecycleObserver_Factory;
import com.skype.android.app.ActionBarCustomizer_Factory;
import com.skype.android.app.NavigationUrl_Factory;
import com.skype.android.app.Navigation_Factory;
import com.skype.android.app.account.AccountProfileInfoActivity;
import com.skype.android.app.account.AccountProfileInfoActivity_MembersInjector;
import com.skype.android.app.account.CallForwardingActivity;
import com.skype.android.app.account.CallForwardingActivity_MembersInjector;
import com.skype.android.app.account.CallForwardingNumberActivity;
import com.skype.android.app.account.CallForwardingNumberActivity_MembersInjector;
import com.skype.android.app.account.EditEmailActivity;
import com.skype.android.app.account.EditEmailActivity_MembersInjector;
import com.skype.android.app.account.MyInfoActivity;
import com.skype.android.app.account.MyInfoActivity_MembersInjector;
import com.skype.android.app.account.UserFeedbackWebActivity;
import com.skype.android.app.account.UserFeedbackWebActivity_MembersInjector;
import com.skype.android.app.account.WebActivity;
import com.skype.android.app.account.WebActivity_MembersInjector;
import com.skype.android.app.calling.CallActivity;
import com.skype.android.app.calling.CallActivity_MembersInjector;
import com.skype.android.app.calling.CallEndOverlay_Factory;
import com.skype.android.app.calling.PreCallActivity;
import com.skype.android.app.calling.PreCallActivity_MembersInjector;
import com.skype.android.app.chat.AddParticipantsActivity;
import com.skype.android.app.chat.AddParticipantsActivity_MembersInjector;
import com.skype.android.app.chat.AnnotationUtil_Factory;
import com.skype.android.app.chat.AppNotInstalledActivity;
import com.skype.android.app.chat.AppNotInstalledActivity_MembersInjector;
import com.skype.android.app.chat.ChatActivity;
import com.skype.android.app.chat.ChatActivity_MembersInjector;
import com.skype.android.app.chat.OfficeNotInstalledActivity;
import com.skype.android.app.chat.OfficeNotInstalledActivity_MembersInjector;
import com.skype.android.app.chat.OutlookNotInstalledActivity;
import com.skype.android.app.chat.OutlookNotInstalledActivity_MembersInjector;
import com.skype.android.app.chat.ParticipantActivity;
import com.skype.android.app.chat.ParticipantActivity_MembersInjector;
import com.skype.android.app.chat.picker.Search.MediaPickerSearchActivity;
import com.skype.android.app.chat.picker.Search.MediaPickerSearchActivity_MembersInjector;
import com.skype.android.app.contacts.ContactAdapterViewBuilder_Factory;
import com.skype.android.app.contacts.ContactAdapter_Factory;
import com.skype.android.app.contacts.ContactAddNumberActivity;
import com.skype.android.app.contacts.ContactAddNumberActivity_MembersInjector;
import com.skype.android.app.contacts.ContactDirectorySearchActivity;
import com.skype.android.app.contacts.ContactDirectorySearchActivity_MembersInjector;
import com.skype.android.app.contacts.ContactEditActivity;
import com.skype.android.app.contacts.ContactEditActivity_MembersInjector;
import com.skype.android.app.contacts.ContactListActivity;
import com.skype.android.app.contacts.ContactListActivity_MembersInjector;
import com.skype.android.app.contacts.ContactPickerActivity;
import com.skype.android.app.contacts.ContactPickerActivity_MembersInjector;
import com.skype.android.app.contacts.ContactProfileActivity;
import com.skype.android.app.contacts.ContactProfileActivity_MembersInjector;
import com.skype.android.app.contacts.ContactSearchAdapter_Factory;
import com.skype.android.app.contacts.ContactSendAuthRequestActivity;
import com.skype.android.app.contacts.ContactSendAuthRequestActivity_MembersInjector;
import com.skype.android.app.contacts.ConversationAdapter_Factory;
import com.skype.android.app.contacts.JoinRequestHelper_Factory;
import com.skype.android.app.contacts.OffNetworkInviteActivity;
import com.skype.android.app.contacts.OffNetworkInviteActivity_MembersInjector;
import com.skype.android.app.contacts.PickerActivity;
import com.skype.android.app.contacts.PickerActivity_MembersInjector;
import com.skype.android.app.dialer.CountriesAdapter_Factory;
import com.skype.android.app.dialer.DialpadActivity;
import com.skype.android.app.dialer.DialpadActivity_MembersInjector;
import com.skype.android.app.dialer.SelectCountryActivity;
import com.skype.android.app.dialer.SelectCountryActivity_MembersInjector;
import com.skype.android.app.location.ReceivedLocationActivity;
import com.skype.android.app.location.ReceivedLocationActivity_MembersInjector;
import com.skype.android.app.location.SendLocationActivity;
import com.skype.android.app.location.SendLocationActivity_MembersInjector;
import com.skype.android.app.main.AbstractHubActivity;
import com.skype.android.app.main.AbstractHubActivity_MembersInjector;
import com.skype.android.app.main.HubActivity;
import com.skype.android.app.main.HubActivity_MembersInjector;
import com.skype.android.app.main.HubMaterialActivity;
import com.skype.android.app.main.HubMaterialActivity_MembersInjector;
import com.skype.android.app.main.SplashActivity;
import com.skype.android.app.main.SplashActivity_MembersInjector;
import com.skype.android.app.media.MediaDocumentDownloadUtil_Factory;
import com.skype.android.app.media.MediaDocumentUploadUtil_Factory;
import com.skype.android.app.media.MediaPhotoViewerActivity;
import com.skype.android.app.media.MediaPhotoViewerActivity_MembersInjector;
import com.skype.android.app.mnv.MnvAnalytics_Factory;
import com.skype.android.app.mnv.MnvCases_Factory;
import com.skype.android.app.mnv.MnvUtil_Factory;
import com.skype.android.app.recents.RecentAdapter_Factory;
import com.skype.android.app.recents.RecentAdapter_MembersInjector;
import com.skype.android.app.recents.RecentListActivity;
import com.skype.android.app.recents.RecentListActivity_MembersInjector;
import com.skype.android.app.search.AgentProvisioningServiceClient_Factory;
import com.skype.android.app.search.AgentSyncWaiter_Factory;
import com.skype.android.app.search.ContactSearchResultAdapter_Factory;
import com.skype.android.app.search.ConversationsSearchResultAdapter_Factory;
import com.skype.android.app.search.MessagesSearchResultAdapter_Factory;
import com.skype.android.app.search.SearchMultipleSourceAdapter_Factory;
import com.skype.android.app.search.SuggestedAgentsAdapter_Factory;
import com.skype.android.app.settings.AboutActivity;
import com.skype.android.app.settings.AboutActivity_MembersInjector;
import com.skype.android.app.settings.ManageAliasesActivity;
import com.skype.android.app.settings.ManageAliasesActivity_MembersInjector;
import com.skype.android.app.settings.SettingsActivity;
import com.skype.android.app.settings.SettingsActivity_MembersInjector;
import com.skype.android.app.settings.UserPreferences_Factory;
import com.skype.android.app.settings.UserPreferences_MembersInjector;
import com.skype.android.app.shortcircuit.AutoBuddyManager_Factory;
import com.skype.android.app.shortcircuit.StallNewUserActivity;
import com.skype.android.app.shortcircuit.StallNewUserActivity_MembersInjector;
import com.skype.android.app.signin.AbstractSignInActivity;
import com.skype.android.app.signin.AbstractSignInActivity_MembersInjector;
import com.skype.android.app.signin.AccountStatusNotifier_Factory;
import com.skype.android.app.signin.AuthenticateWithMsaActivity;
import com.skype.android.app.signin.AuthenticateWithMsaActivity_MembersInjector;
import com.skype.android.app.signin.LandingPageActivity;
import com.skype.android.app.signin.LandingPageActivity_MembersInjector;
import com.skype.android.app.signin.LinkingAbstractSignInActivity;
import com.skype.android.app.signin.LinkingAbstractSignInActivity_MembersInjector;
import com.skype.android.app.signin.LinkingAccountsAnimationActivity;
import com.skype.android.app.signin.LinkingAccountsAnimationActivity_MembersInjector;
import com.skype.android.app.signin.LinkingDoneActivity;
import com.skype.android.app.signin.LinkingDoneActivity_MembersInjector;
import com.skype.android.app.signin.LinkingErrorActivity;
import com.skype.android.app.signin.LinkingErrorActivity_MembersInjector;
import com.skype.android.app.signin.LinkingGetAccounts_Factory;
import com.skype.android.app.signin.LinkingPickSuggestedAccountsActivity;
import com.skype.android.app.signin.LinkingPickSuggestedAccountsActivity_MembersInjector;
import com.skype.android.app.signin.LinkingPreSignInActivity;
import com.skype.android.app.signin.LinkingPreSignInActivity_MembersInjector;
import com.skype.android.app.signin.LinkingSkypeNamesFoundActivity;
import com.skype.android.app.signin.LinkingSkypeNamesFoundActivity_MembersInjector;
import com.skype.android.app.signin.LinkingSkypeNamesNotFoundActivity;
import com.skype.android.app.signin.LinkingSkypeNamesNotFoundActivity_MembersInjector;
import com.skype.android.app.signin.LinkingTermsOfUseActivity;
import com.skype.android.app.signin.LinkingTermsOfUseActivity_MembersInjector;
import com.skype.android.app.signin.LinkingUtil_Factory;
import com.skype.android.app.signin.SelectSkypeNameActivity;
import com.skype.android.app.signin.SelectSkypeNameActivity_MembersInjector;
import com.skype.android.app.signin.SignInActivity;
import com.skype.android.app.signin.SignInActivity_MembersInjector;
import com.skype.android.app.signin.SignInLandingPageActivity;
import com.skype.android.app.signin.SignInLandingPageActivity_MembersInjector;
import com.skype.android.app.signin.SignInLiveIdActivity;
import com.skype.android.app.signin.SignInLiveIdActivity_MembersInjector;
import com.skype.android.app.signin.SignInNavigation_Factory;
import com.skype.android.app.signin.SignOutActivity;
import com.skype.android.app.signin.SignOutActivity_MembersInjector;
import com.skype.android.app.signin.SignUpActivity;
import com.skype.android.app.signin.SignUpActivity_MembersInjector;
import com.skype.android.app.signin.SignoutEducationActivity;
import com.skype.android.app.signin.SignoutEducationActivity_MembersInjector;
import com.skype.android.app.signin.SimpleLandingPageActivity;
import com.skype.android.app.signin.SimpleLandingPageActivity_MembersInjector;
import com.skype.android.app.signin.TermsOfUseActivity;
import com.skype.android.app.signin.TermsOfUseActivity_MembersInjector;
import com.skype.android.app.signin.UnifiedLandingPageActivity;
import com.skype.android.app.signin.UnifiedLandingPageActivity_MembersInjector;
import com.skype.android.app.transfer.TransferUtil_Factory;
import com.skype.android.app.vim.VideoMessagePlayerActivity;
import com.skype.android.app.vim.VideoMessagePlayerActivity_MembersInjector;
import com.skype.android.app.vim.VideoMessagePromotionActivity;
import com.skype.android.app.vim.VideoMessagePromotionActivity_MembersInjector;
import com.skype.android.app.vim.VideoMessageRecorderActivity;
import com.skype.android.app.vim.VideoMessageRecorderActivity_MembersInjector;
import com.skype.android.app.vim.VideoMessageReviewActivity;
import com.skype.android.app.vim.VideoMessageReviewActivity_MembersInjector;
import com.skype.android.inject.ActivityAccountStateObserver_Factory;
import com.skype.android.inject.ActivityModule;
import com.skype.android.inject.ActivityModule_ActivityFactory;
import com.skype.android.inject.LoginManager_Factory;
import com.skype.android.inject.ObjectInterfaceFinder_Factory;
import com.skype.android.inject.ShakeBugReportObserver_Factory;
import com.skype.android.inject.UpActionObserver_Factory;
import com.skype.android.telemetry.TelemetryHelper_Factory;
import com.skype.android.util.ContactUtil_Factory;
import com.skype.android.util.ConversationUtil_Factory;
import com.skype.android.util.GroupAvatarUtil_Factory;
import com.skype.android.util.TimeUtil_Factory;
import com.skype.android.util.accessibility.AccessibilityUtil_Factory;
import com.skype.android.util.permission.PermissionRequest_Factory;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeActivityComponent, SkypeIntentHandler_Factory, SkypeActivity_MembersInjector, SkypeActivity, 
//            SkypeApplicationComponent

public final class DaggerSkypeActivityComponent
    implements SkypeActivityComponent
{
    public static final class Builder
    {

        private ActivityModule a;
        private SkypeApplicationComponent b;

        static ActivityModule a(Builder builder1)
        {
            return builder1.a;
        }

        static SkypeApplicationComponent b(Builder builder1)
        {
            return builder1.b;
        }

        public final Builder a(SkypeApplicationComponent skypeapplicationcomponent)
        {
            if (skypeapplicationcomponent == null)
            {
                throw new NullPointerException();
            } else
            {
                b = skypeapplicationcomponent;
                return this;
            }
        }

        public final Builder a(ActivityModule activitymodule)
        {
            a = activitymodule;
            return this;
        }

        public final SkypeActivityComponent a()
        {
            if (a == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/inject/ActivityModule.getCanonicalName()).append(" must be set").toString());
            }
            if (b == null)
            {
                throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
            } else
            {
                return new DaggerSkypeActivityComponent(this);
            }
        }

        private Builder()
        {
        }

        Builder(byte byte0)
        {
            this();
        }
    }


    static final boolean $assertionsDisabled;
    private MembersInjector aboutActivityMembersInjector;
    private MembersInjector abstractHubActivityMembersInjector;
    private MembersInjector abstractSignInActivityMembersInjector;
    private Provider accessibilityUtilProvider;
    private Provider accountManagerProvider;
    private MembersInjector accountProfileInfoActivityMembersInjector;
    private Provider accountProvider;
    private Provider accountProvider1;
    private Provider accountStatusNotifierProvider;
    private Provider actionBarCustomizerProvider;
    private Provider activityAccountStateObserverProvider;
    private Provider activityProvider;
    private Provider adManagerProvider;
    private Provider adPlacerProvider;
    private MembersInjector addParticipantsActivityMembersInjector;
    private Provider agentProvisioningServiceClientProvider;
    private Provider agentSyncWaiterProvider;
    private Provider analyticsInAppObserverProvider;
    private Provider analyticsLifecycleObserverProvider;
    private Provider analyticsProvider;
    private Provider annotationUtilProvider;
    private MembersInjector appNotInstalledActivityMembersInjector;
    private Provider applicationConfigProvider;
    private Provider applicationProvider;
    private Provider asyncServiceProvider;
    private Provider audioManagerProvider;
    private MembersInjector authenticateWithMsaActivityMembersInjector;
    private Provider autoBuddyManagerProvider;
    private MembersInjector callActivityMembersInjector;
    private Provider callEndOverlayProvider;
    private MembersInjector callForwardingActivityMembersInjector;
    private MembersInjector callForwardingNumberActivityMembersInjector;
    private Provider callQualityFeedbackManagerProvider;
    private MembersInjector chatActivityMembersInjector;
    private Provider chatServiceMonitorProvider;
    private Provider chatTextProvider;
    private Provider contactAdapterProvider;
    private Provider contactAdapterViewBuilderProvider;
    private MembersInjector contactAddNumberActivityMembersInjector;
    private MembersInjector contactDirectorySearchActivityMembersInjector;
    private MembersInjector contactEditActivityMembersInjector;
    private MembersInjector contactListActivityMembersInjector;
    private Provider contactMoodCacheProvider;
    private MembersInjector contactPickerActivityMembersInjector;
    private MembersInjector contactProfileActivityMembersInjector;
    private Provider contactSearchAdapterProvider;
    private Provider contactSearchResultAdapterProvider;
    private MembersInjector contactSendAuthRequestActivityMembersInjector;
    private Provider contactUtilProvider;
    private Provider contactsIngestManagerProvider;
    private Provider contextProvider;
    private Provider conversationAdapterProvider;
    private Provider conversationUtilProvider;
    private Provider conversationsSearchResultAdapterProvider;
    private Provider countriesAdapterProvider;
    private Provider crashReporterProvider;
    private Provider defaultAvatarsProvider;
    private MembersInjector dialpadActivityMembersInjector;
    private Provider dreamKeeperProvider;
    private Provider ecsClientProvider;
    private Provider ecsConfigurationProvider;
    private MembersInjector editEmailActivityMembersInjector;
    private Provider eventBusProvider;
    private Provider formattedMessageCacheProvider;
    private Provider getAnalyticsPersistentStorageProvider;
    private Provider getPermissionRequestStorageProvider;
    private Provider getRingtoneStorageProvider;
    private Provider getTranslatorProvider;
    private Provider groupAvatarUtilProvider;
    private Provider httpUtilProvider;
    private MembersInjector hubActivityMembersInjector;
    private MembersInjector hubMaterialActivityMembersInjector;
    private Provider imageCacheProvider;
    private Provider inputMethodManagerProvider;
    private Provider joinRequestHelperProvider;
    private MembersInjector landingPageActivityMembersInjector;
    private Provider layoutExperienceProvider;
    private MembersInjector linkingAbstractSignInActivityMembersInjector;
    private MembersInjector linkingAccountsAnimationActivityMembersInjector;
    private MembersInjector linkingDoneActivityMembersInjector;
    private MembersInjector linkingErrorActivityMembersInjector;
    private Provider linkingGetAccountsProvider;
    private MembersInjector linkingPickSuggestedAccountsActivityMembersInjector;
    private MembersInjector linkingPreSignInActivityMembersInjector;
    private MembersInjector linkingSkypeNamesFoundActivityMembersInjector;
    private MembersInjector linkingSkypeNamesNotFoundActivityMembersInjector;
    private MembersInjector linkingTermsOfUseActivityMembersInjector;
    private Provider linkingUtilProvider;
    private Provider loginManagerProvider;
    private MembersInjector manageAliasesActivityMembersInjector;
    private Provider mediaContentRosterProvider;
    private Provider mediaDocumentDownloadUtilProvider;
    private Provider mediaDocumentUploadUtilProvider;
    private MembersInjector mediaPhotoViewerActivityMembersInjector;
    private MembersInjector mediaPickerSearchActivityMembersInjector;
    private Provider messagesSearchResultAdapterProvider;
    private Provider mnvAnalyticsProvider;
    private Provider mnvCasesProvider;
    private Provider mnvManagerProvider;
    private Provider mnvUtilProvider;
    private MembersInjector myInfoActivityMembersInjector;
    private Provider navigationProvider;
    private Provider navigationUrlProvider;
    private Provider networkUtilProvider;
    private Provider objectIdMapProvider;
    private Provider objectInterfaceFinderProvider;
    private MembersInjector offNetworkInviteActivityMembersInjector;
    private MembersInjector officeNotInstalledActivityMembersInjector;
    private MembersInjector outlookNotInstalledActivityMembersInjector;
    private MembersInjector participantActivityMembersInjector;
    private Provider pcmHostProvider;
    private Provider permissionRequestProvider;
    private MembersInjector pickerActivityMembersInjector;
    private MembersInjector preCallActivityMembersInjector;
    private Provider promotedSCDContactsManagerProvider;
    private MembersInjector receivedLocationActivityMembersInjector;
    private MembersInjector recentAdapterMembersInjector;
    private Provider recentAdapterProvider;
    private MembersInjector recentListActivityMembersInjector;
    private Provider sctManagerProvider;
    private Provider searchMultipleSourceAdapterProvider;
    private MembersInjector selectCountryActivityMembersInjector;
    private MembersInjector selectSkypeNameActivityMembersInjector;
    private MembersInjector sendLocationActivityMembersInjector;
    private Provider serverClockProvider;
    private Provider sessionReporterProvider;
    private MembersInjector settingsActivityMembersInjector;
    private Provider shakeBugReportObserverProvider;
    private MembersInjector signInActivityMembersInjector;
    private Provider signInDurationReporterProvider;
    private MembersInjector signInLandingPageActivityMembersInjector;
    private MembersInjector signInLiveIdActivityMembersInjector;
    private Provider signInNavigationProvider;
    private MembersInjector signOutActivityMembersInjector;
    private MembersInjector signUpActivityMembersInjector;
    private MembersInjector signoutEducationActivityMembersInjector;
    private MembersInjector simpleLandingPageActivityMembersInjector;
    private Provider skyLibProvider;
    private MembersInjector skypeActivityMembersInjector;
    private Provider skypeIntentHandlerProvider;
    private Provider skypePushListenerProvider;
    private Provider skypeTokenAccessProvider;
    private Provider soundsProvider;
    private MembersInjector splashActivityMembersInjector;
    private MembersInjector stallNewUserActivityMembersInjector;
    private Provider suggestedAgentsAdapterProvider;
    private Provider telemetryHelperProvider;
    private Provider telephonyManagerProvider;
    private MembersInjector termsOfUseActivityMembersInjector;
    private Provider timeAnomalyTelemetryProvider;
    private Provider timeUtilProvider;
    private Provider transferUtilProvider;
    private Provider typeFaceFactoryProvider;
    private Provider typeFaceStyleCallbackProvider;
    private MembersInjector unifiedLandingPageActivityMembersInjector;
    private Provider upActionObserverProvider;
    private Provider updateManagerProvider;
    private Provider urlPreviewMediaAgentProvider;
    private Provider urlsProvider;
    private MembersInjector userFeedbackWebActivityMembersInjector;
    private MembersInjector userPreferencesMembersInjector;
    private Provider userPreferencesProvider;
    private Provider vibratorProvider;
    private MembersInjector videoMessagePlayerActivityMembersInjector;
    private MembersInjector videoMessagePromotionActivityMembersInjector;
    private MembersInjector videoMessageRecorderActivityMembersInjector;
    private MembersInjector videoMessageReviewActivityMembersInjector;
    private Provider viewStateManagerProvider;
    private MembersInjector webActivityMembersInjector;

    private DaggerSkypeActivityComponent(Builder builder1)
    {
        if (!$assertionsDisabled && builder1 == null)
        {
            throw new AssertionError();
        } else
        {
            initialize(builder1);
            initialize1(builder1);
            return;
        }
    }


    public static Builder builder()
    {
        return new Builder((byte)0);
    }

    private void initialize(Builder builder1)
    {
        activityProvider = ActivityModule_ActivityFactory.create(Builder.a(builder1));
        upActionObserverProvider = UpActionObserver_Factory.create(MembersInjectors.a(), activityProvider);
        contextProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                android.content.Context context = c.context();
                if (context == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return context;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        sessionReporterProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.analytics.SessionReporter sessionreporter = c.sessionReporter();
                if (sessionreporter == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return sessionreporter;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        analyticsLifecycleObserverProvider = AnalyticsLifecycleObserver_Factory.create(MembersInjectors.a(), contextProvider, sessionReporterProvider);
        analyticsInAppObserverProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.analytics.AnalyticsInAppObserver analyticsinappobserver = c.analyticsInAppObserver();
                if (analyticsinappobserver == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return analyticsinappobserver;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        skyLibProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.SkyLib skylib = c.skyLib();
                if (skylib == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return skylib;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        accountProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.Account account = c.account();
                if (account == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return account;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        getAnalyticsPersistentStorageProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.analytics.AnalyticsPersistentStorage analyticspersistentstorage = c.getAnalyticsPersistentStorage();
                if (analyticspersistentstorage == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return analyticspersistentstorage;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        shakeBugReportObserverProvider = ShakeBugReportObserver_Factory.create(MembersInjectors.a(), activityProvider, skyLibProvider, accountProvider, getAnalyticsPersistentStorageProvider);
        crashReporterProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.crash.CrashReporter crashreporter = c.crashReporter();
                if (crashreporter == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return crashreporter;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        typeFaceStyleCallbackProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.text.TypeFaceTextStyleCallback typefacetextstylecallback = c.typeFaceStyleCallback();
                if (typefacetextstylecallback == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return typefacetextstylecallback;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        objectIdMapProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.skylib.ObjectIdMap objectidmap = c.objectIdMap();
                if (objectidmap == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return objectidmap;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        objectInterfaceFinderProvider = ObjectInterfaceFinder_Factory.create(objectIdMapProvider);
        applicationProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                android.app.Application application = c.application();
                if (application == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return application;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        loginManagerProvider = LoginManager_Factory.create(applicationProvider, accountProvider, skyLibProvider);
        accountProvider1 = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.inject.AccountProvider accountprovider = c.accountProvider();
                if (accountprovider == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return accountprovider;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        activityAccountStateObserverProvider = ActivityAccountStateObserver_Factory.create(MembersInjectors.a(), activityProvider, loginManagerProvider, accountProvider1, getAnalyticsPersistentStorageProvider);
        dreamKeeperProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.wakeup.DreamKeeper dreamkeeper = c.dreamKeeper();
                if (dreamkeeper == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return dreamkeeper;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        asyncServiceProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.concurrent.AsyncService asyncservice = c.asyncService();
                if (asyncservice == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return asyncservice;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        formattedMessageCacheProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.cache.FormattedMessageCache formattedmessagecache = c.formattedMessageCache();
                if (formattedmessagecache == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return formattedmessagecache;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        contactMoodCacheProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.cache.ContactMoodCache contactmoodcache = c.contactMoodCache();
                if (contactmoodcache == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return contactmoodcache;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        ecsConfigurationProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.config.ecs.EcsConfiguration ecsconfiguration = c.ecsConfiguration();
                if (ecsconfiguration == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return ecsconfiguration;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        imageCacheProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.ImageCache imagecache = c.imageCache();
                if (imagecache == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return imagecache;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        defaultAvatarsProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.res.DefaultAvatars defaultavatars = c.defaultAvatars();
                if (defaultavatars == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return defaultavatars;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        contactUtilProvider = ContactUtil_Factory.create(applicationProvider, accountProvider, skyLibProvider, objectIdMapProvider, contactMoodCacheProvider, ecsConfigurationProvider, imageCacheProvider, defaultAvatarsProvider);
        chatTextProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.res.ChatText chattext = c.chatText();
                if (chattext == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return chattext;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        conversationUtilProvider = ConversationUtil_Factory.create(applicationProvider, asyncServiceProvider, skyLibProvider, objectIdMapProvider, formattedMessageCacheProvider, accountProvider, contactUtilProvider, ecsConfigurationProvider, chatTextProvider);
        analyticsProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.analytics.Analytics analytics = c.analytics();
                if (analytics == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return analytics;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        networkUtilProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.NetworkUtil networkutil = c.networkUtil();
                if (networkutil == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return networkutil;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        signInDurationReporterProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.SignInDurationReporter signindurationreporter = c.signInDurationReporter();
                if (signindurationreporter == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return signindurationreporter;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        layoutExperienceProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.app.LayoutExperience layoutexperience = c.layoutExperience();
                if (layoutexperience == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return layoutexperience;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        timeUtilProvider = TimeUtil_Factory.create(applicationProvider);
        navigationProvider = Navigation_Factory.create(activityProvider, accountProvider1, skyLibProvider, dreamKeeperProvider, conversationUtilProvider, analyticsProvider, networkUtilProvider, ecsConfigurationProvider, signInDurationReporterProvider, getAnalyticsPersistentStorageProvider, layoutExperienceProvider, timeUtilProvider);
        callQualityFeedbackManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.app.calling.CallQualityFeedbackManager callqualityfeedbackmanager = c.callQualityFeedbackManager();
                if (callqualityfeedbackmanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return callqualityfeedbackmanager;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        vibratorProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                android.os.Vibrator vibrator = c.vibrator();
                if (vibrator == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return vibrator;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        userPreferencesMembersInjector = UserPreferences_MembersInjector.create(vibratorProvider);
        userPreferencesProvider = UserPreferences_Factory.create(userPreferencesMembersInjector, accountProvider, applicationProvider);
        skypePushListenerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.push.SkypePushListener skypepushlistener = c.skypePushListener();
                if (skypepushlistener == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return skypepushlistener;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        accountStatusNotifierProvider = AccountStatusNotifier_Factory.create(contextProvider);
        mediaContentRosterProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.mediacontent.MediaContentRoster mediacontentroster = c.mediaContentRoster();
                if (mediacontentroster == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return mediacontentroster;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        signOutActivityMembersInjector = SignOutActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, accountProvider, navigationProvider, callQualityFeedbackManagerProvider, userPreferencesProvider, skypePushListenerProvider, accountStatusNotifierProvider, ecsConfigurationProvider, mediaContentRosterProvider);
        eventBusProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.event.EventBus eventbus = c.eventBus();
                if (eventbus == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return eventbus;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        timeAnomalyTelemetryProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.TimeAnomalyTelemetry timeanomalytelemetry = c.timeAnomalyTelemetry();
                if (timeanomalytelemetry == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return timeanomalytelemetry;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        actionBarCustomizerProvider = ActionBarCustomizer_Factory.create(MembersInjectors.a(), activityProvider, skyLibProvider, contactUtilProvider, conversationUtilProvider, timeUtilProvider, navigationProvider, eventBusProvider, layoutExperienceProvider, timeAnomalyTelemetryProvider);
        contactEditActivityMembersInjector = ContactEditActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, layoutExperienceProvider, actionBarCustomizerProvider);
        signInLandingPageActivityMembersInjector = SignInLandingPageActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, analyticsProvider, getAnalyticsPersistentStorageProvider);
        receivedLocationActivityMembersInjector = ReceivedLocationActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, objectIdMapProvider, actionBarCustomizerProvider);
        viewStateManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.ViewStateManager viewstatemanager = c.viewStateManager();
                if (viewstatemanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return viewstatemanager;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        httpUtilProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.HttpUtil httputil = c.httpUtil();
                if (httputil == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return httputil;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        unifiedLandingPageActivityMembersInjector = UnifiedLandingPageActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, analyticsProvider, getAnalyticsPersistentStorageProvider, accountProvider1, skyLibProvider, viewStateManagerProvider, httpUtilProvider, asyncServiceProvider, eventBusProvider, ecsConfigurationProvider, contactUtilProvider);
        urlsProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.res.Urls urls = c.urls();
                if (urls == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return urls;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        navigationUrlProvider = NavigationUrl_Factory.create(contextProvider, urlsProvider);
        soundsProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.res.Sounds sounds = c.sounds();
                if (sounds == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return sounds;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        mnvManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.app.mnv.MnvManager mnvmanager = c.mnvManager();
                if (mnvmanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return mnvmanager;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        contactsIngestManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.sync.ContactsIngestManager contactsingestmanager = c.contactsIngestManager();
                if (contactsingestmanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return contactsingestmanager;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        skypeTokenAccessProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.app.token.SkypeTokenAccess skypetokenaccess = c.skypeTokenAccess();
                if (skypetokenaccess == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return skypetokenaccess;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        autoBuddyManagerProvider = AutoBuddyManager_Factory.create(contactsIngestManagerProvider, userPreferencesProvider, skypeTokenAccessProvider, httpUtilProvider, eventBusProvider, ecsConfigurationProvider);
        getPermissionRequestStorageProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.permission.PermissionRequestStorage permissionrequeststorage = c.getPermissionRequestStorage();
                if (permissionrequeststorage == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return permissionrequeststorage;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        permissionRequestProvider = PermissionRequest_Factory.create(MembersInjectors.a(), activityProvider, getPermissionRequestStorageProvider);
        skypeIntentHandlerProvider = SkypeIntentHandler_Factory.create(activityProvider, navigationProvider, accountProvider1, contactUtilProvider, permissionRequestProvider, conversationUtilProvider);
        accessibilityUtilProvider = AccessibilityUtil_Factory.create(contextProvider);
        linkingUtilProvider = LinkingUtil_Factory.create(activityProvider, imageCacheProvider, defaultAvatarsProvider);
        linkingAbstractSignInActivityMembersInjector = LinkingAbstractSignInActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, skyLibProvider, accountProvider1, analyticsProvider, soundsProvider, mnvManagerProvider, autoBuddyManagerProvider, viewStateManagerProvider, ecsConfigurationProvider, getAnalyticsPersistentStorageProvider, skypeIntentHandlerProvider, accountStatusNotifierProvider, accessibilityUtilProvider, linkingUtilProvider, signInDurationReporterProvider);
        outlookNotInstalledActivityMembersInjector = OutlookNotInstalledActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, analyticsProvider, ecsConfigurationProvider, navigationProvider);
        mediaDocumentUploadUtilProvider = MediaDocumentUploadUtil_Factory.create(applicationProvider, asyncServiceProvider, skyLibProvider, conversationUtilProvider, imageCacheProvider, ecsConfigurationProvider, eventBusProvider);
        videoMessageReviewActivityMembersInjector = VideoMessageReviewActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, objectIdMapProvider, accessibilityUtilProvider, analyticsProvider, skyLibProvider, navigationProvider, imageCacheProvider, timeUtilProvider, timeAnomalyTelemetryProvider, conversationUtilProvider, mediaDocumentUploadUtilProvider, ecsConfigurationProvider);
        contactAddNumberActivityMembersInjector = ContactAddNumberActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, skyLibProvider, contactUtilProvider, navigationProvider, layoutExperienceProvider, actionBarCustomizerProvider);
        manageAliasesActivityMembersInjector = ManageAliasesActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, actionBarCustomizerProvider);
        mediaPickerSearchActivityMembersInjector = MediaPickerSearchActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, actionBarCustomizerProvider);
        participantActivityMembersInjector = ParticipantActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, conversationUtilProvider, timeUtilProvider, navigationProvider, layoutExperienceProvider, actionBarCustomizerProvider, skyLibProvider);
        adPlacerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.ads.AdPlacer adplacer = c.adPlacer();
                if (adplacer == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return adplacer;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        updateManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.update.UpdateManager updatemanager = c.updateManager();
                if (updatemanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return updatemanager;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        applicationConfigProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.config.ApplicationConfig applicationconfig = c.applicationConfig();
                if (applicationconfig == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return applicationconfig;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        sctManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.telemetry.SCTManager sctmanager = c.sctManager();
                if (sctmanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return sctmanager;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        ecsClientProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.config.ecs.EcsClient ecsclient = c.ecsClient();
                if (ecsclient == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return ecsclient;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        telemetryHelperProvider = TelemetryHelper_Factory.create(applicationProvider, sctManagerProvider, ecsClientProvider, networkUtilProvider, getAnalyticsPersistentStorageProvider);
        hubActivityMembersInjector = HubActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, skyLibProvider, accountProvider1, analyticsProvider, soundsProvider, mnvManagerProvider, autoBuddyManagerProvider, viewStateManagerProvider, ecsConfigurationProvider, getAnalyticsPersistentStorageProvider, skypeIntentHandlerProvider, accountStatusNotifierProvider, contactUtilProvider, imageCacheProvider, contactMoodCacheProvider, adPlacerProvider, updateManagerProvider, applicationConfigProvider, accessibilityUtilProvider, userPreferencesProvider, telemetryHelperProvider, signInDurationReporterProvider, permissionRequestProvider);
        contactProfileActivityMembersInjector = ContactProfileActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, actionBarCustomizerProvider, contactUtilProvider, timeUtilProvider, conversationUtilProvider, layoutExperienceProvider, navigationProvider, skyLibProvider);
        termsOfUseActivityMembersInjector = TermsOfUseActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, accessibilityUtilProvider, analyticsProvider);
        sendLocationActivityMembersInjector = SendLocationActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, objectIdMapProvider, actionBarCustomizerProvider, analyticsProvider, eventBusProvider, conversationUtilProvider);
        linkingSkypeNamesNotFoundActivityMembersInjector = LinkingSkypeNamesNotFoundActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, skyLibProvider, accountProvider1, analyticsProvider, soundsProvider, mnvManagerProvider, autoBuddyManagerProvider, viewStateManagerProvider, ecsConfigurationProvider, getAnalyticsPersistentStorageProvider, skypeIntentHandlerProvider, accountStatusNotifierProvider, userPreferencesProvider, signInDurationReporterProvider);
        dialpadActivityMembersInjector = DialpadActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, contactUtilProvider, layoutExperienceProvider, navigationProvider, skyLibProvider, vibratorProvider, analyticsProvider, asyncServiceProvider, permissionRequestProvider);
        signoutEducationActivityMembersInjector = SignoutEducationActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, userPreferencesProvider, analyticsProvider, accessibilityUtilProvider, layoutExperienceProvider);
        linkingErrorActivityMembersInjector = LinkingErrorActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, layoutExperienceProvider, accessibilityUtilProvider);
        videoMessagePromotionActivityMembersInjector = VideoMessagePromotionActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, conversationUtilProvider, contactUtilProvider, analyticsProvider);
        landingPageActivityMembersInjector = LandingPageActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, accountProvider1, asyncServiceProvider, analyticsProvider, userPreferencesProvider, accountStatusNotifierProvider, getAnalyticsPersistentStorageProvider);
        transferUtilProvider = TransferUtil_Factory.create(contextProvider, accountProvider1, objectIdMapProvider, timeUtilProvider, timeAnomalyTelemetryProvider, analyticsProvider);
        officeNotInstalledActivityMembersInjector = OfficeNotInstalledActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, analyticsProvider, transferUtilProvider);
        linkingGetAccountsProvider = LinkingGetAccounts_Factory.create(httpUtilProvider);
        authenticateWithMsaActivityMembersInjector = AuthenticateWithMsaActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, skyLibProvider, accountProvider1, analyticsProvider, soundsProvider, mnvManagerProvider, autoBuddyManagerProvider, viewStateManagerProvider, ecsConfigurationProvider, getAnalyticsPersistentStorageProvider, skypeIntentHandlerProvider, accountStatusNotifierProvider, linkingGetAccountsProvider, signInDurationReporterProvider, telemetryHelperProvider);
        inputMethodManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                android.view.inputmethod.InputMethodManager inputmethodmanager = c.inputMethodManager();
                if (inputmethodmanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return inputmethodmanager;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        contactSendAuthRequestActivityMembersInjector = ContactSendAuthRequestActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, actionBarCustomizerProvider, contactUtilProvider, inputMethodManagerProvider, analyticsProvider, layoutExperienceProvider);
        abstractHubActivityMembersInjector = AbstractHubActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, skyLibProvider, accountProvider1, analyticsProvider, soundsProvider, mnvManagerProvider, autoBuddyManagerProvider, viewStateManagerProvider, ecsConfigurationProvider, getAnalyticsPersistentStorageProvider, skypeIntentHandlerProvider, accountStatusNotifierProvider, contactUtilProvider, imageCacheProvider, contactMoodCacheProvider, adPlacerProvider, updateManagerProvider, applicationConfigProvider, accessibilityUtilProvider, userPreferencesProvider, telemetryHelperProvider, signInDurationReporterProvider, permissionRequestProvider);
    }

    private void initialize1(Builder builder1)
    {
        pickerActivityMembersInjector = PickerActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, actionBarCustomizerProvider);
        callForwardingActivityMembersInjector = CallForwardingActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, actionBarCustomizerProvider, accountProvider, navigationProvider, skyLibProvider, analyticsProvider);
        adManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.ads.AdManager admanager = c.adManager();
                if (admanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return admanager;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        signInNavigationProvider = SignInNavigation_Factory.create(activityProvider, ecsConfigurationProvider, analyticsProvider, getAnalyticsPersistentStorageProvider);
        simpleLandingPageActivityMembersInjector = SimpleLandingPageActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, analyticsProvider, getAnalyticsPersistentStorageProvider, navigationProvider, accountProvider1, asyncServiceProvider, adManagerProvider, signInNavigationProvider, ecsConfigurationProvider);
        contactAdapterViewBuilderProvider = ContactAdapterViewBuilder_Factory.create(contactUtilProvider, imageCacheProvider, accessibilityUtilProvider);
        contactAdapterProvider = ContactAdapter_Factory.create(MembersInjectors.a(), activityProvider, contactUtilProvider, contactAdapterViewBuilderProvider);
        promotedSCDContactsManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.app.shortcircuit.PromotedSCDContactsManager promotedscdcontactsmanager = c.promotedSCDContactsManager();
                if (promotedscdcontactsmanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return promotedscdcontactsmanager;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        mnvAnalyticsProvider = MnvAnalytics_Factory.create(analyticsProvider, ecsConfigurationProvider);
        mnvUtilProvider = MnvUtil_Factory.create(accountProvider1, networkUtilProvider, ecsConfigurationProvider, contactUtilProvider);
        mnvCasesProvider = MnvCases_Factory.create(ecsConfigurationProvider, mnvAnalyticsProvider, userPreferencesProvider, mnvUtilProvider, autoBuddyManagerProvider, accountProvider1);
        contactDirectorySearchActivityMembersInjector = ContactDirectorySearchActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, accountProvider, actionBarCustomizerProvider, skyLibProvider, objectIdMapProvider, navigationProvider, layoutExperienceProvider, contactAdapterProvider, inputMethodManagerProvider, accessibilityUtilProvider, promotedSCDContactsManagerProvider, contactUtilProvider, userPreferencesProvider, mnvCasesProvider, mnvAnalyticsProvider, imageCacheProvider, analyticsProvider, ecsConfigurationProvider);
        contactPickerActivityMembersInjector = ContactPickerActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, actionBarCustomizerProvider);
        countriesAdapterProvider = CountriesAdapter_Factory.create(MembersInjectors.a(), activityProvider, skyLibProvider, contactUtilProvider);
        selectCountryActivityMembersInjector = SelectCountryActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, actionBarCustomizerProvider, countriesAdapterProvider, userPreferencesProvider);
        audioManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                android.media.AudioManager audiomanager = c.audioManager();
                if (audiomanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return audiomanager;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        chatActivityMembersInjector = ChatActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, actionBarCustomizerProvider, conversationUtilProvider, objectIdMapProvider, navigationProvider, layoutExperienceProvider, contactUtilProvider, analyticsProvider, accessibilityUtilProvider, audioManagerProvider, callQualityFeedbackManagerProvider, telemetryHelperProvider, ecsConfigurationProvider, permissionRequestProvider, userPreferencesProvider);
        videoMessagePlayerActivityMembersInjector = VideoMessagePlayerActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, objectIdMapProvider, accessibilityUtilProvider);
        linkingPreSignInActivityMembersInjector = LinkingPreSignInActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, skyLibProvider, accountProvider1, analyticsProvider, soundsProvider, mnvManagerProvider, autoBuddyManagerProvider, viewStateManagerProvider, ecsConfigurationProvider, getAnalyticsPersistentStorageProvider, skypeIntentHandlerProvider, accountStatusNotifierProvider, accessibilityUtilProvider, linkingUtilProvider, signInDurationReporterProvider);
        signInLiveIdActivityMembersInjector = SignInLiveIdActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, skyLibProvider, accountProvider1, analyticsProvider, soundsProvider, mnvManagerProvider, autoBuddyManagerProvider, viewStateManagerProvider, ecsConfigurationProvider, getAnalyticsPersistentStorageProvider, skypeIntentHandlerProvider, accountStatusNotifierProvider, urlsProvider, actionBarCustomizerProvider, linkingGetAccountsProvider, signInDurationReporterProvider);
        callForwardingNumberActivityMembersInjector = CallForwardingNumberActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, accountProvider, skyLibProvider, actionBarCustomizerProvider);
        splashActivityMembersInjector = SplashActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, accountProvider, analyticsProvider, getAnalyticsPersistentStorageProvider, skyLibProvider, viewStateManagerProvider, navigationProvider, ecsConfigurationProvider, skypeIntentHandlerProvider, userPreferencesProvider);
        urlPreviewMediaAgentProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.app.media.UrlPreviewMediaAgent urlpreviewmediaagent = c.urlPreviewMediaAgent();
                if (urlpreviewmediaagent == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return urlpreviewmediaagent;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        mediaDocumentDownloadUtilProvider = MediaDocumentDownloadUtil_Factory.create(applicationProvider, asyncServiceProvider, httpUtilProvider, imageCacheProvider, objectIdMapProvider, skyLibProvider, urlPreviewMediaAgentProvider);
        mediaPhotoViewerActivityMembersInjector = MediaPhotoViewerActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, accessibilityUtilProvider, mediaDocumentDownloadUtilProvider, analyticsProvider, networkUtilProvider, eventBusProvider);
        groupAvatarUtilProvider = GroupAvatarUtil_Factory.create(imageCacheProvider, mediaDocumentDownloadUtilProvider);
        typeFaceFactoryProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.text.TypeFaceFactory typefacefactory = c.typeFaceFactory();
                if (typefacefactory == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return typefacefactory;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        conversationAdapterProvider = ConversationAdapter_Factory.create(MembersInjectors.a(), activityProvider, imageCacheProvider, contactUtilProvider, groupAvatarUtilProvider, defaultAvatarsProvider, skyLibProvider, objectIdMapProvider, typeFaceFactoryProvider);
        chatServiceMonitorProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.app.chat.ChatServiceMonitor chatservicemonitor = c.chatServiceMonitor();
                if (chatservicemonitor == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return chatservicemonitor;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        searchMultipleSourceAdapterProvider = SearchMultipleSourceAdapter_Factory.create(MembersInjectors.a());
        conversationsSearchResultAdapterProvider = ConversationsSearchResultAdapter_Factory.create(MembersInjectors.a(), activityProvider, imageCacheProvider, contactUtilProvider, groupAvatarUtilProvider, defaultAvatarsProvider, skyLibProvider, objectIdMapProvider, typeFaceFactoryProvider);
        contactSearchResultAdapterProvider = ContactSearchResultAdapter_Factory.create(MembersInjectors.a(), activityProvider, imageCacheProvider, contactUtilProvider, groupAvatarUtilProvider, defaultAvatarsProvider, skyLibProvider, typeFaceFactoryProvider);
        messagesSearchResultAdapterProvider = MessagesSearchResultAdapter_Factory.create(MembersInjectors.a(), activityProvider, imageCacheProvider, contactUtilProvider, groupAvatarUtilProvider, defaultAvatarsProvider, skyLibProvider, typeFaceFactoryProvider);
        agentProvisioningServiceClientProvider = AgentProvisioningServiceClient_Factory.create(httpUtilProvider, asyncServiceProvider, skypeTokenAccessProvider, ecsConfigurationProvider);
        suggestedAgentsAdapterProvider = SuggestedAgentsAdapter_Factory.create(MembersInjectors.a(), activityProvider, imageCacheProvider, contactUtilProvider, defaultAvatarsProvider, typeFaceFactoryProvider, httpUtilProvider);
        agentSyncWaiterProvider = AgentSyncWaiter_Factory.create(eventBusProvider, agentProvisioningServiceClientProvider, skyLibProvider, navigationProvider);
        hubMaterialActivityMembersInjector = HubMaterialActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, skyLibProvider, accountProvider1, analyticsProvider, soundsProvider, mnvManagerProvider, autoBuddyManagerProvider, viewStateManagerProvider, ecsConfigurationProvider, getAnalyticsPersistentStorageProvider, skypeIntentHandlerProvider, accountStatusNotifierProvider, contactUtilProvider, imageCacheProvider, contactMoodCacheProvider, adPlacerProvider, updateManagerProvider, applicationConfigProvider, accessibilityUtilProvider, userPreferencesProvider, telemetryHelperProvider, signInDurationReporterProvider, permissionRequestProvider, objectIdMapProvider, conversationAdapterProvider, asyncServiceProvider, inputMethodManagerProvider, promotedSCDContactsManagerProvider, eventBusProvider, chatServiceMonitorProvider, searchMultipleSourceAdapterProvider, conversationsSearchResultAdapterProvider, contactSearchResultAdapterProvider, messagesSearchResultAdapterProvider, agentProvisioningServiceClientProvider, suggestedAgentsAdapterProvider, agentSyncWaiterProvider);
        linkingTermsOfUseActivityMembersInjector = LinkingTermsOfUseActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, accessibilityUtilProvider, linkingUtilProvider, layoutExperienceProvider, httpUtilProvider, signInDurationReporterProvider, ecsConfigurationProvider);
        contactListActivityMembersInjector = ContactListActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, actionBarCustomizerProvider);
        aboutActivityMembersInjector = AboutActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, actionBarCustomizerProvider);
        accountProfileInfoActivityMembersInjector = AccountProfileInfoActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, accountProvider, actionBarCustomizerProvider, timeUtilProvider, contactUtilProvider);
        userFeedbackWebActivityMembersInjector = UserFeedbackWebActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, skyLibProvider, urlsProvider, actionBarCustomizerProvider, navigationUrlProvider, analyticsProvider);
        joinRequestHelperProvider = JoinRequestHelper_Factory.create(httpUtilProvider, skypeTokenAccessProvider, skyLibProvider, objectIdMapProvider, asyncServiceProvider, applicationProvider);
        offNetworkInviteActivityMembersInjector = OffNetworkInviteActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, asyncServiceProvider, contactUtilProvider, defaultAvatarsProvider, joinRequestHelperProvider, ecsConfigurationProvider);
        linkingSkypeNamesFoundActivityMembersInjector = LinkingSkypeNamesFoundActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, skyLibProvider, accountProvider1, analyticsProvider, soundsProvider, mnvManagerProvider, autoBuddyManagerProvider, viewStateManagerProvider, ecsConfigurationProvider, getAnalyticsPersistentStorageProvider, skypeIntentHandlerProvider, accountStatusNotifierProvider, linkingUtilProvider, accessibilityUtilProvider, userPreferencesProvider, signInDurationReporterProvider);
        linkingPickSuggestedAccountsActivityMembersInjector = LinkingPickSuggestedAccountsActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, skyLibProvider, accountProvider1, analyticsProvider, soundsProvider, mnvManagerProvider, autoBuddyManagerProvider, viewStateManagerProvider, ecsConfigurationProvider, getAnalyticsPersistentStorageProvider, skypeIntentHandlerProvider, accountStatusNotifierProvider, linkingUtilProvider);
        selectSkypeNameActivityMembersInjector = SelectSkypeNameActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, actionBarCustomizerProvider, skyLibProvider);
        signInActivityMembersInjector = SignInActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, skyLibProvider, accountProvider1, analyticsProvider, soundsProvider, mnvManagerProvider, autoBuddyManagerProvider, viewStateManagerProvider, ecsConfigurationProvider, getAnalyticsPersistentStorageProvider, skypeIntentHandlerProvider, accountStatusNotifierProvider, accessibilityUtilProvider, actionBarCustomizerProvider, signInDurationReporterProvider);
        telephonyManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                android.telephony.TelephonyManager telephonymanager = c.telephonyManager();
                if (telephonymanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return telephonymanager;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        videoMessageRecorderActivityMembersInjector = VideoMessageRecorderActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, skyLibProvider, accessibilityUtilProvider, timeUtilProvider, audioManagerProvider, telephonyManagerProvider, conversationUtilProvider, timeAnomalyTelemetryProvider, analyticsProvider);
        myInfoActivityMembersInjector = MyInfoActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, actionBarCustomizerProvider);
        pcmHostProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.pcmhost.PcmHost pcmhost = c.pcmHost();
                if (pcmhost == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return pcmhost;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        callEndOverlayProvider = CallEndOverlay_Factory.create(activityProvider);
        getRingtoneStorageProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.ringtone.RingtoneStorage ringtonestorage = c.getRingtoneStorage();
                if (ringtonestorage == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return ringtonestorage;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        getTranslatorProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.Translator translator = c.getTranslator();
                if (translator == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return translator;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        preCallActivityMembersInjector = PreCallActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, skyLibProvider, pcmHostProvider, objectIdMapProvider, navigationProvider, imageCacheProvider, soundsProvider, conversationUtilProvider, contactUtilProvider, audioManagerProvider, analyticsProvider, viewStateManagerProvider, telephonyManagerProvider, callEndOverlayProvider, networkUtilProvider, accessibilityUtilProvider, getRingtoneStorageProvider, telemetryHelperProvider, defaultAvatarsProvider, getTranslatorProvider, ecsConfigurationProvider);
        appNotInstalledActivityMembersInjector = AppNotInstalledActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, analyticsProvider);
        linkingDoneActivityMembersInjector = LinkingDoneActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, skyLibProvider, accountProvider1, analyticsProvider, soundsProvider, mnvManagerProvider, autoBuddyManagerProvider, viewStateManagerProvider, ecsConfigurationProvider, getAnalyticsPersistentStorageProvider, skypeIntentHandlerProvider, accountStatusNotifierProvider, httpUtilProvider, linkingUtilProvider, signInDurationReporterProvider);
        stallNewUserActivityMembersInjector = StallNewUserActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider);
        abstractSignInActivityMembersInjector = AbstractSignInActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, skyLibProvider, accountProvider1, analyticsProvider, soundsProvider, mnvManagerProvider, autoBuddyManagerProvider, viewStateManagerProvider, ecsConfigurationProvider, getAnalyticsPersistentStorageProvider, skypeIntentHandlerProvider, accountStatusNotifierProvider);
        skypeActivityMembersInjector = SkypeActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider);
        recentListActivityMembersInjector = RecentListActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, actionBarCustomizerProvider);
        serverClockProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.ServerClock serverclock = c.serverClock();
                if (serverclock == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return serverclock;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        annotationUtilProvider = AnnotationUtil_Factory.create(objectIdMapProvider);
        recentAdapterMembersInjector = RecentAdapter_MembersInjector.create(accountProvider, contactUtilProvider, conversationUtilProvider, timeUtilProvider, serverClockProvider, transferUtilProvider, formattedMessageCacheProvider, chatTextProvider, imageCacheProvider, skyLibProvider, objectIdMapProvider, mediaDocumentDownloadUtilProvider, groupAvatarUtilProvider, analyticsProvider, ecsConfigurationProvider, timeAnomalyTelemetryProvider, defaultAvatarsProvider, layoutExperienceProvider, annotationUtilProvider);
        recentAdapterProvider = RecentAdapter_Factory.create(recentAdapterMembersInjector, activityProvider);
        contactSearchAdapterProvider = ContactSearchAdapter_Factory.create(MembersInjectors.a(), activityProvider, skyLibProvider, objectIdMapProvider, accountProvider, contactUtilProvider, contactAdapterViewBuilderProvider);
        addParticipantsActivityMembersInjector = AddParticipantsActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, asyncServiceProvider, conversationUtilProvider, contactUtilProvider, objectIdMapProvider, navigationProvider, layoutExperienceProvider, viewStateManagerProvider, recentAdapterProvider, inputMethodManagerProvider, contactSearchAdapterProvider, chatTextProvider);
        linkingAccountsAnimationActivityMembersInjector = LinkingAccountsAnimationActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, skyLibProvider, accountProvider1, analyticsProvider, soundsProvider, mnvManagerProvider, autoBuddyManagerProvider, viewStateManagerProvider, ecsConfigurationProvider, getAnalyticsPersistentStorageProvider, skypeIntentHandlerProvider, accountStatusNotifierProvider, httpUtilProvider, linkingUtilProvider);
        accountManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeActivityComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                android.accounts.AccountManager accountmanager = c.accountManager();
                if (accountmanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return accountmanager;
                }
            }

            
            {
                b = DaggerSkypeActivityComponent.this;
                a = builder1;
                super();
                c = Builder.b(a);
            }
        };
        signUpActivityMembersInjector = SignUpActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, skyLibProvider, accountProvider1, analyticsProvider, soundsProvider, mnvManagerProvider, autoBuddyManagerProvider, viewStateManagerProvider, ecsConfigurationProvider, getAnalyticsPersistentStorageProvider, skypeIntentHandlerProvider, accountStatusNotifierProvider, accountManagerProvider, actionBarCustomizerProvider, userPreferencesProvider, asyncServiceProvider);
        webActivityMembersInjector = WebActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, skyLibProvider, urlsProvider, actionBarCustomizerProvider, navigationUrlProvider);
        settingsActivityMembersInjector = SettingsActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, actionBarCustomizerProvider);
        editEmailActivityMembersInjector = EditEmailActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, skyLibProvider, objectIdMapProvider, accountProvider, actionBarCustomizerProvider);
        callActivityMembersInjector = CallActivity_MembersInjector.create(upActionObserverProvider, analyticsLifecycleObserverProvider, analyticsInAppObserverProvider, shakeBugReportObserverProvider, crashReporterProvider, typeFaceStyleCallbackProvider, objectInterfaceFinderProvider, activityAccountStateObserverProvider, objectIdMapProvider, conversationUtilProvider, contactUtilProvider, timeUtilProvider, navigationProvider, layoutExperienceProvider, inputMethodManagerProvider, actionBarCustomizerProvider, contactMoodCacheProvider, callEndOverlayProvider, accessibilityUtilProvider, eventBusProvider, skyLibProvider, userPreferencesProvider);
    }

    public final void inject(SkypeActivity skypeactivity)
    {
        skypeActivityMembersInjector.injectMembers(skypeactivity);
    }

    public final void inject(AccountProfileInfoActivity accountprofileinfoactivity)
    {
        accountProfileInfoActivityMembersInjector.injectMembers(accountprofileinfoactivity);
    }

    public final void inject(CallForwardingActivity callforwardingactivity)
    {
        callForwardingActivityMembersInjector.injectMembers(callforwardingactivity);
    }

    public final void inject(CallForwardingNumberActivity callforwardingnumberactivity)
    {
        callForwardingNumberActivityMembersInjector.injectMembers(callforwardingnumberactivity);
    }

    public final void inject(EditEmailActivity editemailactivity)
    {
        editEmailActivityMembersInjector.injectMembers(editemailactivity);
    }

    public final void inject(MyInfoActivity myinfoactivity)
    {
        myInfoActivityMembersInjector.injectMembers(myinfoactivity);
    }

    public final void inject(UserFeedbackWebActivity userfeedbackwebactivity)
    {
        userFeedbackWebActivityMembersInjector.injectMembers(userfeedbackwebactivity);
    }

    public final void inject(WebActivity webactivity)
    {
        webActivityMembersInjector.injectMembers(webactivity);
    }

    public final void inject(CallActivity callactivity)
    {
        callActivityMembersInjector.injectMembers(callactivity);
    }

    public final void inject(PreCallActivity precallactivity)
    {
        preCallActivityMembersInjector.injectMembers(precallactivity);
    }

    public final void inject(AddParticipantsActivity addparticipantsactivity)
    {
        addParticipantsActivityMembersInjector.injectMembers(addparticipantsactivity);
    }

    public final void inject(AppNotInstalledActivity appnotinstalledactivity)
    {
        appNotInstalledActivityMembersInjector.injectMembers(appnotinstalledactivity);
    }

    public final void inject(ChatActivity chatactivity)
    {
        chatActivityMembersInjector.injectMembers(chatactivity);
    }

    public final void inject(OfficeNotInstalledActivity officenotinstalledactivity)
    {
        officeNotInstalledActivityMembersInjector.injectMembers(officenotinstalledactivity);
    }

    public final void inject(OutlookNotInstalledActivity outlooknotinstalledactivity)
    {
        outlookNotInstalledActivityMembersInjector.injectMembers(outlooknotinstalledactivity);
    }

    public final void inject(ParticipantActivity participantactivity)
    {
        participantActivityMembersInjector.injectMembers(participantactivity);
    }

    public final void inject(MediaPickerSearchActivity mediapickersearchactivity)
    {
        mediaPickerSearchActivityMembersInjector.injectMembers(mediapickersearchactivity);
    }

    public final void inject(ContactAddNumberActivity contactaddnumberactivity)
    {
        contactAddNumberActivityMembersInjector.injectMembers(contactaddnumberactivity);
    }

    public final void inject(ContactDirectorySearchActivity contactdirectorysearchactivity)
    {
        contactDirectorySearchActivityMembersInjector.injectMembers(contactdirectorysearchactivity);
    }

    public final void inject(ContactEditActivity contacteditactivity)
    {
        contactEditActivityMembersInjector.injectMembers(contacteditactivity);
    }

    public final void inject(ContactListActivity contactlistactivity)
    {
        contactListActivityMembersInjector.injectMembers(contactlistactivity);
    }

    public final void inject(ContactPickerActivity contactpickeractivity)
    {
        contactPickerActivityMembersInjector.injectMembers(contactpickeractivity);
    }

    public final void inject(ContactProfileActivity contactprofileactivity)
    {
        contactProfileActivityMembersInjector.injectMembers(contactprofileactivity);
    }

    public final void inject(ContactSendAuthRequestActivity contactsendauthrequestactivity)
    {
        contactSendAuthRequestActivityMembersInjector.injectMembers(contactsendauthrequestactivity);
    }

    public final void inject(OffNetworkInviteActivity offnetworkinviteactivity)
    {
        offNetworkInviteActivityMembersInjector.injectMembers(offnetworkinviteactivity);
    }

    public final void inject(PickerActivity pickeractivity)
    {
        pickerActivityMembersInjector.injectMembers(pickeractivity);
    }

    public final void inject(DialpadActivity dialpadactivity)
    {
        dialpadActivityMembersInjector.injectMembers(dialpadactivity);
    }

    public final void inject(SelectCountryActivity selectcountryactivity)
    {
        selectCountryActivityMembersInjector.injectMembers(selectcountryactivity);
    }

    public final void inject(ReceivedLocationActivity receivedlocationactivity)
    {
        receivedLocationActivityMembersInjector.injectMembers(receivedlocationactivity);
    }

    public final void inject(SendLocationActivity sendlocationactivity)
    {
        sendLocationActivityMembersInjector.injectMembers(sendlocationactivity);
    }

    public final void inject(AbstractHubActivity abstracthubactivity)
    {
        abstractHubActivityMembersInjector.injectMembers(abstracthubactivity);
    }

    public final void inject(HubActivity hubactivity)
    {
        hubActivityMembersInjector.injectMembers(hubactivity);
    }

    public final void inject(HubMaterialActivity hubmaterialactivity)
    {
        hubMaterialActivityMembersInjector.injectMembers(hubmaterialactivity);
    }

    public final void inject(SplashActivity splashactivity)
    {
        splashActivityMembersInjector.injectMembers(splashactivity);
    }

    public final void inject(MediaPhotoViewerActivity mediaphotovieweractivity)
    {
        mediaPhotoViewerActivityMembersInjector.injectMembers(mediaphotovieweractivity);
    }

    public final void inject(RecentListActivity recentlistactivity)
    {
        recentListActivityMembersInjector.injectMembers(recentlistactivity);
    }

    public final void inject(AboutActivity aboutactivity)
    {
        aboutActivityMembersInjector.injectMembers(aboutactivity);
    }

    public final void inject(ManageAliasesActivity managealiasesactivity)
    {
        manageAliasesActivityMembersInjector.injectMembers(managealiasesactivity);
    }

    public final void inject(SettingsActivity settingsactivity)
    {
        settingsActivityMembersInjector.injectMembers(settingsactivity);
    }

    public final void inject(StallNewUserActivity stallnewuseractivity)
    {
        stallNewUserActivityMembersInjector.injectMembers(stallnewuseractivity);
    }

    public final void inject(AbstractSignInActivity abstractsigninactivity)
    {
        abstractSignInActivityMembersInjector.injectMembers(abstractsigninactivity);
    }

    public final void inject(AuthenticateWithMsaActivity authenticatewithmsaactivity)
    {
        authenticateWithMsaActivityMembersInjector.injectMembers(authenticatewithmsaactivity);
    }

    public final void inject(LandingPageActivity landingpageactivity)
    {
        landingPageActivityMembersInjector.injectMembers(landingpageactivity);
    }

    public final void inject(LinkingAbstractSignInActivity linkingabstractsigninactivity)
    {
        linkingAbstractSignInActivityMembersInjector.injectMembers(linkingabstractsigninactivity);
    }

    public final void inject(LinkingAccountsAnimationActivity linkingaccountsanimationactivity)
    {
        linkingAccountsAnimationActivityMembersInjector.injectMembers(linkingaccountsanimationactivity);
    }

    public final void inject(LinkingDoneActivity linkingdoneactivity)
    {
        linkingDoneActivityMembersInjector.injectMembers(linkingdoneactivity);
    }

    public final void inject(LinkingErrorActivity linkingerroractivity)
    {
        linkingErrorActivityMembersInjector.injectMembers(linkingerroractivity);
    }

    public final void inject(LinkingPickSuggestedAccountsActivity linkingpicksuggestedaccountsactivity)
    {
        linkingPickSuggestedAccountsActivityMembersInjector.injectMembers(linkingpicksuggestedaccountsactivity);
    }

    public final void inject(LinkingPreSignInActivity linkingpresigninactivity)
    {
        linkingPreSignInActivityMembersInjector.injectMembers(linkingpresigninactivity);
    }

    public final void inject(LinkingSkypeNamesFoundActivity linkingskypenamesfoundactivity)
    {
        linkingSkypeNamesFoundActivityMembersInjector.injectMembers(linkingskypenamesfoundactivity);
    }

    public final void inject(LinkingSkypeNamesNotFoundActivity linkingskypenamesnotfoundactivity)
    {
        linkingSkypeNamesNotFoundActivityMembersInjector.injectMembers(linkingskypenamesnotfoundactivity);
    }

    public final void inject(LinkingTermsOfUseActivity linkingtermsofuseactivity)
    {
        linkingTermsOfUseActivityMembersInjector.injectMembers(linkingtermsofuseactivity);
    }

    public final void inject(SelectSkypeNameActivity selectskypenameactivity)
    {
        selectSkypeNameActivityMembersInjector.injectMembers(selectskypenameactivity);
    }

    public final void inject(SignInActivity signinactivity)
    {
        signInActivityMembersInjector.injectMembers(signinactivity);
    }

    public final void inject(SignInLandingPageActivity signinlandingpageactivity)
    {
        signInLandingPageActivityMembersInjector.injectMembers(signinlandingpageactivity);
    }

    public final void inject(SignInLiveIdActivity signinliveidactivity)
    {
        signInLiveIdActivityMembersInjector.injectMembers(signinliveidactivity);
    }

    public final void inject(SignOutActivity signoutactivity)
    {
        signOutActivityMembersInjector.injectMembers(signoutactivity);
    }

    public final void inject(SignUpActivity signupactivity)
    {
        signUpActivityMembersInjector.injectMembers(signupactivity);
    }

    public final void inject(SignoutEducationActivity signouteducationactivity)
    {
        signoutEducationActivityMembersInjector.injectMembers(signouteducationactivity);
    }

    public final void inject(SimpleLandingPageActivity simplelandingpageactivity)
    {
        simpleLandingPageActivityMembersInjector.injectMembers(simplelandingpageactivity);
    }

    public final void inject(TermsOfUseActivity termsofuseactivity)
    {
        termsOfUseActivityMembersInjector.injectMembers(termsofuseactivity);
    }

    public final void inject(UnifiedLandingPageActivity unifiedlandingpageactivity)
    {
        unifiedLandingPageActivityMembersInjector.injectMembers(unifiedlandingpageactivity);
    }

    public final void inject(VideoMessagePlayerActivity videomessageplayeractivity)
    {
        videoMessagePlayerActivityMembersInjector.injectMembers(videomessageplayeractivity);
    }

    public final void inject(VideoMessagePromotionActivity videomessagepromotionactivity)
    {
        videoMessagePromotionActivityMembersInjector.injectMembers(videomessagepromotionactivity);
    }

    public final void inject(VideoMessageRecorderActivity videomessagerecorderactivity)
    {
        videoMessageRecorderActivityMembersInjector.injectMembers(videomessagerecorderactivity);
    }

    public final void inject(VideoMessageReviewActivity videomessagereviewactivity)
    {
        videoMessageReviewActivityMembersInjector.injectMembers(videomessagereviewactivity);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/DaggerSkypeActivityComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
