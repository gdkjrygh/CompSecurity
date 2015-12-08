// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.app.ActionBarCustomizer_Factory;
import com.skype.android.app.NavigationUrl_Factory;
import com.skype.android.app.Navigation_Factory;
import com.skype.android.app.account.MyInfoFragment;
import com.skype.android.app.account.MyInfoFragment_MembersInjector;
import com.skype.android.app.calling.CallRosterFragment;
import com.skype.android.app.calling.CallRosterFragment_MembersInjector;
import com.skype.android.app.calling.InCallFragment;
import com.skype.android.app.calling.InCallFragment_MembersInjector;
import com.skype.android.app.chat.AddParticipantsAccessibilityFragment;
import com.skype.android.app.chat.AddParticipantsAccessibilityFragment_MembersInjector;
import com.skype.android.app.chat.AnnotationUtil_Factory;
import com.skype.android.app.chat.ChatFragment;
import com.skype.android.app.chat.ChatFragment_MembersInjector;
import com.skype.android.app.chat.MessageHolderUtil_Factory;
import com.skype.android.app.chat.ParticipantAdapter_Factory;
import com.skype.android.app.chat.ParticipantAdapter_MembersInjector;
import com.skype.android.app.chat.ParticipantListFragment;
import com.skype.android.app.chat.ParticipantListFragment_MembersInjector;
import com.skype.android.app.chat.SideBarFragment;
import com.skype.android.app.chat.SideBarFragment_MembersInjector;
import com.skype.android.app.chat.picker.Search.MediaPickerSearchFragment;
import com.skype.android.app.chat.picker.Search.MediaPickerSearchFragment_MembersInjector;
import com.skype.android.app.contacts.ContactAdapterViewBuilder_Factory;
import com.skype.android.app.contacts.ContactAdapter_Factory;
import com.skype.android.app.contacts.ContactListFragment;
import com.skype.android.app.contacts.ContactListFragment_MembersInjector;
import com.skype.android.app.contacts.ContactMoodMessageFragment;
import com.skype.android.app.contacts.ContactMoodMessageFragment_MembersInjector;
import com.skype.android.app.contacts.ContactPickerFragment;
import com.skype.android.app.contacts.ContactPickerFragment_MembersInjector;
import com.skype.android.app.contacts.ContactProfileFragment;
import com.skype.android.app.contacts.ContactProfileFragment_MembersInjector;
import com.skype.android.app.contacts.ContactSuggestedInvitesPickerFragment;
import com.skype.android.app.contacts.ContactSuggestedInvitesPickerFragment_MembersInjector;
import com.skype.android.app.contacts.ContactTopPicksFragment;
import com.skype.android.app.contacts.ContactTopPicksFragment_MembersInjector;
import com.skype.android.app.contacts.ContactTopPicksGridListAdapter_Factory;
import com.skype.android.app.contacts.ConversationAdapter_Factory;
import com.skype.android.app.contacts.PickerFragment;
import com.skype.android.app.contacts.PickerFragment_MembersInjector;
import com.skype.android.app.dialer.CallHistoryAdapter_Factory;
import com.skype.android.app.dialer.CallHistoryAdapter_MembersInjector;
import com.skype.android.app.dialer.CallHistoryFragment;
import com.skype.android.app.dialer.CallHistoryFragment_MembersInjector;
import com.skype.android.app.dialer.CallHistoryMaterialAdapter_Factory;
import com.skype.android.app.dialer.CallHistoryMaterialAdapter_MembersInjector;
import com.skype.android.app.dialer.CallHistoryMaterialFragment;
import com.skype.android.app.dialer.CallHistoryMaterialFragment_MembersInjector;
import com.skype.android.app.favorites.FavoriteGridListAdapter_Factory;
import com.skype.android.app.favorites.FavoritesFragment;
import com.skype.android.app.favorites.FavoritesFragment_MembersInjector;
import com.skype.android.app.favorites.FavoritesPickContactsFragment;
import com.skype.android.app.favorites.FavoritesPickContactsFragment_MembersInjector;
import com.skype.android.app.favorites.FavoritesQuery_Factory;
import com.skype.android.app.media.MediaDocumentDownloadUtil_Factory;
import com.skype.android.app.media.MediaDocumentUploadUtil_Factory;
import com.skype.android.app.mnv.MnvAddFriendsFragment;
import com.skype.android.app.mnv.MnvAddFriendsFragment_MembersInjector;
import com.skype.android.app.mnv.MnvAddNumberFragment;
import com.skype.android.app.mnv.MnvAddNumberFragment_MembersInjector;
import com.skype.android.app.mnv.MnvAnalytics_Factory;
import com.skype.android.app.mnv.MnvBaseFragment;
import com.skype.android.app.mnv.MnvBaseFragment_MembersInjector;
import com.skype.android.app.mnv.MnvCases_Factory;
import com.skype.android.app.mnv.MnvCheckingAccountFragment;
import com.skype.android.app.mnv.MnvCheckingAccountFragment_MembersInjector;
import com.skype.android.app.mnv.MnvEnterPinFragment;
import com.skype.android.app.mnv.MnvEnterPinFragment_MembersInjector;
import com.skype.android.app.mnv.MnvErrorFragment;
import com.skype.android.app.mnv.MnvErrorFragment_MembersInjector;
import com.skype.android.app.mnv.MnvLearnMoreFragment;
import com.skype.android.app.mnv.MnvLearnMoreFragment_MembersInjector;
import com.skype.android.app.mnv.MnvRequestFragment;
import com.skype.android.app.mnv.MnvRequestFragment_MembersInjector;
import com.skype.android.app.mnv.MnvUtil_Factory;
import com.skype.android.app.mnv.MnvVerifiedFragment;
import com.skype.android.app.mnv.MnvVerifiedFragment_MembersInjector;
import com.skype.android.app.recents.RecentAdapter_Factory;
import com.skype.android.app.recents.RecentAdapter_MembersInjector;
import com.skype.android.app.recents.RecentListFragment;
import com.skype.android.app.recents.RecentListFragment_MembersInjector;
import com.skype.android.app.settings.AboutFragment;
import com.skype.android.app.settings.AboutFragment_MembersInjector;
import com.skype.android.app.settings.AttributionsFragment;
import com.skype.android.app.settings.AttributionsFragment_MembersInjector;
import com.skype.android.app.settings.DebugSettingsFragment;
import com.skype.android.app.settings.DebugSettingsFragment_MembersInjector;
import com.skype.android.app.settings.ManageAliasesAdapter_Factory;
import com.skype.android.app.settings.ManageAliasesAdapter_MembersInjector;
import com.skype.android.app.settings.ManageAliasesFragment;
import com.skype.android.app.settings.ManageAliasesFragment_MembersInjector;
import com.skype.android.app.settings.NotificationSettingsFragment;
import com.skype.android.app.settings.NotificationSettingsFragment_MembersInjector;
import com.skype.android.app.settings.SettingsCategoriesFragment;
import com.skype.android.app.settings.SettingsCategoriesFragment_MembersInjector;
import com.skype.android.app.settings.SettingsFragment;
import com.skype.android.app.settings.SettingsFragment_MembersInjector;
import com.skype.android.app.settings.UserPreferences_Factory;
import com.skype.android.app.settings.UserPreferences_MembersInjector;
import com.skype.android.app.shortcircuit.AutoBuddyManager_Factory;
import com.skype.android.app.shortcircuit.ProfileServiceTokenRequest_Factory;
import com.skype.android.app.signin.UnifiedSignInFragment;
import com.skype.android.app.signin.UnifiedSignInFragment_MembersInjector;
import com.skype.android.app.signin.UnifiedSignInPickAccountFragment;
import com.skype.android.app.signin.UnifiedSignInPickAccountFragment_MembersInjector;
import com.skype.android.app.token.MsaTokenRequest_Factory;
import com.skype.android.app.transfer.TransferPickConversationFragment;
import com.skype.android.app.transfer.TransferPickConversationFragment_MembersInjector;
import com.skype.android.app.transfer.TransferUtil_Factory;
import com.skype.android.app.vim.VideoCaptureFragment;
import com.skype.android.app.vim.VideoCaptureFragment_MembersInjector;
import com.skype.android.config.ConfigUpdater_Factory;
import com.skype.android.inject.ActivityModule;
import com.skype.android.inject.ActivityModule_ActivityFactory;
import com.skype.android.inject.ObjectInterfaceFinder_Factory;
import com.skype.android.telemetry.TelemetryHelper_Factory;
import com.skype.android.util.ContactUtil_Factory;
import com.skype.android.util.ConversationUtil_Factory;
import com.skype.android.util.GroupAvatarUtil_Factory;
import com.skype.android.util.PropertyAnimationUtil_Factory;
import com.skype.android.util.SkypeCredit_Factory;
import com.skype.android.util.TimeUtil_Factory;
import com.skype.android.util.accessibility.AccessibilityUtil_Factory;
import com.skype.android.util.permission.PermissionRequest_Factory;
import com.skype.android.widget.GridListAdapterViewBuilder_Factory;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeFragmentComponent, SkypeFragment_MembersInjector, SkypeListFragment_MembersInjector, SkypeFragment, 
//            SkypeListFragment, SkypeApplicationComponent

public final class DaggerSkypeFragmentComponent
    implements SkypeFragmentComponent
{
    public static final class Builder
    {

        private ActivityModule a;
        private SkypeApplicationComponent b;

        static SkypeApplicationComponent a(Builder builder1)
        {
            return builder1.b;
        }

        static ActivityModule b(Builder builder1)
        {
            return builder1.a;
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

        public final SkypeFragmentComponent a()
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
                return new DaggerSkypeFragmentComponent(this);
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
    private MembersInjector aboutFragmentMembersInjector;
    private Provider accessibilityUtilProvider;
    private Provider accountProvider;
    private Provider accountProvider1;
    private Provider actionBarCustomizerProvider;
    private Provider activityProvider;
    private Provider adManagerProvider;
    private Provider adPlacerProvider;
    private MembersInjector addParticipantsAccessibilityFragmentMembersInjector;
    private Provider analyticsProvider;
    private Provider annotationUtilProvider;
    private Provider applicationConfigProvider;
    private Provider applicationProvider;
    private Provider asyncServiceProvider;
    private MembersInjector attributionsFragmentMembersInjector;
    private Provider audioManagerProvider;
    private Provider autoBuddyManagerProvider;
    private Provider callAgentProvider;
    private MembersInjector callHistoryAdapterMembersInjector;
    private Provider callHistoryAdapterProvider;
    private MembersInjector callHistoryFragmentMembersInjector;
    private MembersInjector callHistoryMaterialAdapterMembersInjector;
    private Provider callHistoryMaterialAdapterProvider;
    private MembersInjector callHistoryMaterialFragmentMembersInjector;
    private MembersInjector callRosterFragmentMembersInjector;
    private MembersInjector chatFragmentMembersInjector;
    private Provider chatServiceMonitorProvider;
    private Provider chatTextProvider;
    private Provider configUpdaterProvider;
    private Provider contactAdapterProvider;
    private Provider contactAdapterViewBuilderProvider;
    private MembersInjector contactListFragmentMembersInjector;
    private Provider contactMoodCacheProvider;
    private MembersInjector contactMoodMessageFragmentMembersInjector;
    private MembersInjector contactPickerFragmentMembersInjector;
    private MembersInjector contactProfileFragmentMembersInjector;
    private MembersInjector contactSuggestedInvitesPickerFragmentMembersInjector;
    private MembersInjector contactTopPicksFragmentMembersInjector;
    private Provider contactTopPicksGridListAdapterProvider;
    private Provider contactUtilProvider;
    private Provider contactsIngestManagerProvider;
    private Provider contextProvider;
    private Provider conversationAdapterProvider;
    private Provider conversationUtilProvider;
    private MembersInjector debugSettingsFragmentMembersInjector;
    private Provider defaultAvatarsProvider;
    private Provider dreamKeeperProvider;
    private Provider ecsClientProvider;
    private Provider ecsConfigurationProvider;
    private Provider eventBusProvider;
    private Provider favoriteGridListAdapterProvider;
    private MembersInjector favoritesFragmentMembersInjector;
    private MembersInjector favoritesPickContactsFragmentMembersInjector;
    private Provider favoritesQueryProvider;
    private Provider formattedMessageCacheProvider;
    private Provider getAnalyticsPersistentStorageProvider;
    private Provider getPermissionRequestStorageProvider;
    private Provider getTranslatorProvider;
    private Provider gridListAdapterViewBuilderProvider;
    private Provider groupAvatarUtilProvider;
    private Provider httpUtilProvider;
    private Provider imageCacheProvider;
    private MembersInjector inCallFragmentMembersInjector;
    private Provider inputMethodManagerProvider;
    private Provider layoutExperienceProvider;
    private MembersInjector manageAliasesAdapterMembersInjector;
    private Provider manageAliasesAdapterProvider;
    private MembersInjector manageAliasesFragmentMembersInjector;
    private Provider mediaContentRosterProvider;
    private Provider mediaDocumentDownloadUtilProvider;
    private Provider mediaDocumentUploadUtilProvider;
    private MembersInjector mediaPickerSearchFragmentMembersInjector;
    private Provider messageHolderUtilProvider;
    private MembersInjector mnvAddFriendsFragmentMembersInjector;
    private MembersInjector mnvAddNumberFragmentMembersInjector;
    private Provider mnvAnalyticsProvider;
    private MembersInjector mnvBaseFragmentMembersInjector;
    private Provider mnvCasesProvider;
    private MembersInjector mnvCheckingAccountFragmentMembersInjector;
    private MembersInjector mnvEnterPinFragmentMembersInjector;
    private MembersInjector mnvErrorFragmentMembersInjector;
    private MembersInjector mnvLearnMoreFragmentMembersInjector;
    private Provider mnvManagerProvider;
    private MembersInjector mnvRequestFragmentMembersInjector;
    private Provider mnvUtilProvider;
    private MembersInjector mnvVerifiedFragmentMembersInjector;
    private Provider mruManagerProvider;
    private Provider msaTokenRequestProvider;
    private MembersInjector myInfoFragmentMembersInjector;
    private Provider navigationProvider;
    private Provider navigationUrlProvider;
    private Provider networkUtilProvider;
    private Provider notificationManagerProvider;
    private MembersInjector notificationSettingsFragmentMembersInjector;
    private Provider objectIdMapProvider;
    private Provider objectInterfaceFinderProvider;
    private MembersInjector participantAdapterMembersInjector;
    private Provider participantAdapterProvider;
    private MembersInjector participantListFragmentMembersInjector;
    private Provider permissionRequestProvider;
    private MembersInjector pickerFragmentMembersInjector;
    private Provider powerManagerProvider;
    private Provider profileServiceTokenRequestProvider;
    private Provider promotedSCDContactsManagerProvider;
    private Provider pushMessageRepositoryProvider;
    private MembersInjector recentAdapterMembersInjector;
    private Provider recentAdapterProvider;
    private MembersInjector recentListFragmentMembersInjector;
    private Provider sctManagerProvider;
    private Provider sensorManagerProvider;
    private Provider serverClockProvider;
    private MembersInjector settingsCategoriesFragmentMembersInjector;
    private MembersInjector settingsFragmentMembersInjector;
    private Provider shortCircuitProfileWebClientProvider;
    private MembersInjector sideBarFragmentMembersInjector;
    private Provider signInDurationReporterProvider;
    private Provider skyLibProvider;
    private Provider skypeCreditProvider;
    private MembersInjector skypeFragmentMembersInjector;
    private MembersInjector skypeListFragmentMembersInjector;
    private Provider skypeTokenAccessProvider;
    private Provider soundsProvider;
    private Provider spanUtilProvider;
    private Provider spannedStringCacheProvider;
    private Provider telemetryHelperProvider;
    private Provider telephonyManagerProvider;
    private Provider timeAnomalyTelemetryProvider;
    private Provider timeUtilProvider;
    private MembersInjector transferPickConversationFragmentMembersInjector;
    private Provider transferUtilProvider;
    private Provider typeFaceFactoryProvider;
    private MembersInjector unifiedSignInFragmentMembersInjector;
    private MembersInjector unifiedSignInPickAccountFragmentMembersInjector;
    private Provider urlPreviewMediaAgentProvider;
    private Provider urlsProvider;
    private MembersInjector userPreferencesMembersInjector;
    private Provider userPreferencesProvider;
    private Provider vibrationProvider;
    private Provider vibratorProvider;
    private MembersInjector videoCaptureFragmentMembersInjector;
    private Provider viewStateManagerProvider;

    private DaggerSkypeFragmentComponent(Builder builder1)
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
        objectIdMapProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        objectInterfaceFinderProvider = ObjectInterfaceFinder_Factory.create(objectIdMapProvider);
        skyLibProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        activityProvider = ActivityModule_ActivityFactory.create(Builder.b(builder1));
        applicationProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        accountProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        contactMoodCacheProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        ecsConfigurationProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        imageCacheProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        defaultAvatarsProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        contactUtilProvider = ContactUtil_Factory.create(applicationProvider, accountProvider, skyLibProvider, objectIdMapProvider, contactMoodCacheProvider, ecsConfigurationProvider, imageCacheProvider, defaultAvatarsProvider);
        asyncServiceProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        formattedMessageCacheProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        chatTextProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        conversationUtilProvider = ConversationUtil_Factory.create(applicationProvider, asyncServiceProvider, skyLibProvider, objectIdMapProvider, formattedMessageCacheProvider, accountProvider, contactUtilProvider, ecsConfigurationProvider, chatTextProvider);
        timeUtilProvider = TimeUtil_Factory.create(applicationProvider);
        accountProvider1 = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        dreamKeeperProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        analyticsProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        networkUtilProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        signInDurationReporterProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        getAnalyticsPersistentStorageProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        layoutExperienceProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        navigationProvider = Navigation_Factory.create(activityProvider, accountProvider1, skyLibProvider, dreamKeeperProvider, conversationUtilProvider, analyticsProvider, networkUtilProvider, ecsConfigurationProvider, signInDurationReporterProvider, getAnalyticsPersistentStorageProvider, layoutExperienceProvider, timeUtilProvider);
        eventBusProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        timeAnomalyTelemetryProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        actionBarCustomizerProvider = ActionBarCustomizer_Factory.create(MembersInjectors.a(), activityProvider, skyLibProvider, contactUtilProvider, conversationUtilProvider, timeUtilProvider, navigationProvider, eventBusProvider, layoutExperienceProvider, timeAnomalyTelemetryProvider);
        skypeCreditProvider = SkypeCredit_Factory.create(accountProvider);
        inputMethodManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        contextProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        urlsProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        navigationUrlProvider = NavigationUrl_Factory.create(contextProvider, urlsProvider);
        viewStateManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        notificationManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                android.app.NotificationManager notificationmanager = c.notificationManager();
                if (notificationmanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return notificationmanager;
                }
            }

            
            {
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        transferUtilProvider = TransferUtil_Factory.create(contextProvider, accountProvider1, objectIdMapProvider, timeUtilProvider, timeAnomalyTelemetryProvider, analyticsProvider);
        pushMessageRepositoryProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.push.PushMessageRepository pushmessagerepository = c.pushMessageRepository();
                if (pushmessagerepository == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return pushmessagerepository;
                }
            }

            
            {
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        accessibilityUtilProvider = AccessibilityUtil_Factory.create(contextProvider);
        mediaDocumentUploadUtilProvider = MediaDocumentUploadUtil_Factory.create(applicationProvider, asyncServiceProvider, skyLibProvider, conversationUtilProvider, imageCacheProvider, ecsConfigurationProvider, eventBusProvider);
        httpUtilProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        urlPreviewMediaAgentProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        mediaDocumentDownloadUtilProvider = MediaDocumentDownloadUtil_Factory.create(applicationProvider, asyncServiceProvider, httpUtilProvider, imageCacheProvider, objectIdMapProvider, skyLibProvider, urlPreviewMediaAgentProvider);
        vibratorProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        userPreferencesMembersInjector = UserPreferences_MembersInjector.create(vibratorProvider);
        userPreferencesProvider = UserPreferences_Factory.create(userPreferencesMembersInjector, accountProvider, applicationProvider);
        messageHolderUtilProvider = MessageHolderUtil_Factory.create(accountProvider, objectIdMapProvider);
        mruManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.app.chat.picker.MRUManager mrumanager = c.mruManager();
                if (mrumanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return mrumanager;
                }
            }

            
            {
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        getPermissionRequestStorageProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        permissionRequestProvider = PermissionRequest_Factory.create(MembersInjectors.a(), activityProvider, getPermissionRequestStorageProvider);
        getTranslatorProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        mediaContentRosterProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        annotationUtilProvider = AnnotationUtil_Factory.create(objectIdMapProvider);
        chatFragmentMembersInjector = ChatFragment_MembersInjector.create(objectInterfaceFinderProvider, skyLibProvider, actionBarCustomizerProvider, asyncServiceProvider, accountProvider, objectIdMapProvider, skypeCreditProvider, inputMethodManagerProvider, contactUtilProvider, timeUtilProvider, conversationUtilProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, formattedMessageCacheProvider, viewStateManagerProvider, analyticsProvider, notificationManagerProvider, transferUtilProvider, imageCacheProvider, pushMessageRepositoryProvider, accessibilityUtilProvider, mediaDocumentUploadUtilProvider, mediaDocumentDownloadUtilProvider, userPreferencesProvider, chatTextProvider, messageHolderUtilProvider, mruManagerProvider, ecsConfigurationProvider, permissionRequestProvider, timeAnomalyTelemetryProvider, getTranslatorProvider, mediaContentRosterProvider, eventBusProvider, networkUtilProvider, annotationUtilProvider);
        mnvManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        mnvAnalyticsProvider = MnvAnalytics_Factory.create(analyticsProvider, ecsConfigurationProvider);
        mnvUtilProvider = MnvUtil_Factory.create(accountProvider1, networkUtilProvider, ecsConfigurationProvider, contactUtilProvider);
        contactsIngestManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        skypeTokenAccessProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        autoBuddyManagerProvider = AutoBuddyManager_Factory.create(contactsIngestManagerProvider, userPreferencesProvider, skypeTokenAccessProvider, httpUtilProvider, eventBusProvider, ecsConfigurationProvider);
        mnvCasesProvider = MnvCases_Factory.create(ecsConfigurationProvider, mnvAnalyticsProvider, userPreferencesProvider, mnvUtilProvider, autoBuddyManagerProvider, accountProvider1);
        msaTokenRequestProvider = MsaTokenRequest_Factory.create(eventBusProvider, skyLibProvider);
        profileServiceTokenRequestProvider = ProfileServiceTokenRequest_Factory.create(MembersInjectors.a(), accountProvider1, msaTokenRequestProvider, skypeTokenAccessProvider);
        mnvRequestFragmentMembersInjector = MnvRequestFragment_MembersInjector.create(objectInterfaceFinderProvider, userPreferencesProvider, navigationProvider, mnvManagerProvider, mnvAnalyticsProvider, mnvCasesProvider, inputMethodManagerProvider, profileServiceTokenRequestProvider);
        typeFaceFactoryProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        chatServiceMonitorProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        myInfoFragmentMembersInjector = MyInfoFragment_MembersInjector.create(objectInterfaceFinderProvider, analyticsProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, skyLibProvider, contactUtilProvider, imageCacheProvider, accountProvider, skypeCreditProvider, typeFaceFactoryProvider, contactMoodCacheProvider, chatTextProvider, userPreferencesProvider, defaultAvatarsProvider, chatServiceMonitorProvider, objectIdMapProvider, ecsConfigurationProvider);
        mnvLearnMoreFragmentMembersInjector = MnvLearnMoreFragment_MembersInjector.create(objectInterfaceFinderProvider, navigationUrlProvider, mnvManagerProvider, mnvAnalyticsProvider, userPreferencesProvider);
        mnvAddFriendsFragmentMembersInjector = MnvAddFriendsFragment_MembersInjector.create(objectInterfaceFinderProvider, userPreferencesProvider, navigationProvider, mnvManagerProvider, mnvAnalyticsProvider, mnvCasesProvider, chatTextProvider, mnvUtilProvider, ecsConfigurationProvider, permissionRequestProvider);
        settingsCategoriesFragmentMembersInjector = SettingsCategoriesFragment_MembersInjector.create(objectInterfaceFinderProvider, ecsConfigurationProvider);
        adManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        sctManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        shortCircuitProfileWebClientProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient shortcircuitprofilewebclient = c.shortCircuitProfileWebClient();
                if (shortcircuitprofilewebclient == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return shortcircuitprofilewebclient;
                }
            }

            
            {
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        spannedStringCacheProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.cache.SpannedStringCache spannedstringcache = c.spannedStringCache();
                if (spannedstringcache == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return spannedstringcache;
                }
            }

            
            {
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        settingsFragmentMembersInjector = SettingsFragment_MembersInjector.create(objectInterfaceFinderProvider, skyLibProvider, accountProvider, userPreferencesProvider, navigationUrlProvider, layoutExperienceProvider, analyticsProvider, adManagerProvider, urlsProvider, ecsConfigurationProvider, sctManagerProvider, autoBuddyManagerProvider, shortCircuitProfileWebClientProvider, spannedStringCacheProvider, timeUtilProvider, permissionRequestProvider);
        notificationSettingsFragmentMembersInjector = NotificationSettingsFragment_MembersInjector.create(objectInterfaceFinderProvider, accountProvider, analyticsProvider, vibratorProvider, ecsConfigurationProvider);
        applicationConfigProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        configUpdaterProvider = ConfigUpdater_Factory.create(applicationProvider);
        debugSettingsFragmentMembersInjector = DebugSettingsFragment_MembersInjector.create(objectInterfaceFinderProvider, skyLibProvider, accountProvider, applicationConfigProvider, configUpdaterProvider, contactsIngestManagerProvider, userPreferencesProvider, navigationProvider);
        participantAdapterMembersInjector = ParticipantAdapter_MembersInjector.create(contactUtilProvider, conversationUtilProvider, imageCacheProvider);
        participantAdapterProvider = ParticipantAdapter_Factory.create(participantAdapterMembersInjector);
        groupAvatarUtilProvider = GroupAvatarUtil_Factory.create(imageCacheProvider, mediaDocumentDownloadUtilProvider);
        participantListFragmentMembersInjector = ParticipantListFragment_MembersInjector.create(objectInterfaceFinderProvider, accessibilityUtilProvider, participantAdapterProvider, conversationUtilProvider, imageCacheProvider, navigationProvider, layoutExperienceProvider, defaultAvatarsProvider, groupAvatarUtilProvider);
        contactAdapterViewBuilderProvider = ContactAdapterViewBuilder_Factory.create(contactUtilProvider, imageCacheProvider, accessibilityUtilProvider);
        contactAdapterProvider = ContactAdapter_Factory.create(MembersInjectors.a(), activityProvider, contactUtilProvider, contactAdapterViewBuilderProvider);
        ecsClientProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        telemetryHelperProvider = TelemetryHelper_Factory.create(applicationProvider, sctManagerProvider, ecsClientProvider, networkUtilProvider, getAnalyticsPersistentStorageProvider);
        addParticipantsAccessibilityFragmentMembersInjector = AddParticipantsAccessibilityFragment_MembersInjector.create(objectInterfaceFinderProvider, accessibilityUtilProvider, asyncServiceProvider, contactUtilProvider, conversationUtilProvider, layoutExperienceProvider, skyLibProvider, userPreferencesProvider, objectIdMapProvider, mediaDocumentUploadUtilProvider, navigationProvider, typeFaceFactoryProvider, transferUtilProvider, accountProvider, contactAdapterProvider, contactAdapterViewBuilderProvider, telemetryHelperProvider, ecsConfigurationProvider, viewStateManagerProvider);
        serverClockProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        callHistoryMaterialAdapterMembersInjector = CallHistoryMaterialAdapter_MembersInjector.create(accountProvider, contactUtilProvider, conversationUtilProvider, timeUtilProvider, serverClockProvider, transferUtilProvider, formattedMessageCacheProvider, chatTextProvider, imageCacheProvider, skyLibProvider, objectIdMapProvider, mediaDocumentDownloadUtilProvider, groupAvatarUtilProvider, analyticsProvider, ecsConfigurationProvider, timeAnomalyTelemetryProvider, defaultAvatarsProvider, layoutExperienceProvider, annotationUtilProvider, navigationProvider);
        callHistoryMaterialAdapterProvider = CallHistoryMaterialAdapter_Factory.create(callHistoryMaterialAdapterMembersInjector, activityProvider);
        callHistoryMaterialFragmentMembersInjector = CallHistoryMaterialFragment_MembersInjector.create(objectInterfaceFinderProvider, accessibilityUtilProvider, skyLibProvider, asyncServiceProvider, callHistoryMaterialAdapterProvider, navigationProvider, objectIdMapProvider, imageCacheProvider, conversationUtilProvider, contactUtilProvider);
        soundsProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        audioManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        adPlacerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        telephonyManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        powerManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                android.os.PowerManager powermanager = c.powerManager();
                if (powermanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return powermanager;
                }
            }

            
            {
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
    }

    private void initialize1(Builder builder1)
    {
        sensorManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                android.hardware.SensorManager sensormanager = c.sensorManager();
                if (sensormanager == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return sensormanager;
                }
            }

            
            {
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        vibrationProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.res.Vibration vibration = c.vibration();
                if (vibration == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return vibration;
                }
            }

            
            {
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        callAgentProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.app.calling.CallAgent callagent = c.callAgent();
                if (callagent == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return callagent;
                }
            }

            
            {
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        inCallFragmentMembersInjector = InCallFragment_MembersInjector.create(objectInterfaceFinderProvider, skyLibProvider, imageCacheProvider, conversationUtilProvider, contactUtilProvider, soundsProvider, viewStateManagerProvider, audioManagerProvider, adPlacerProvider, PropertyAnimationUtil_Factory.create(), telephonyManagerProvider, powerManagerProvider, analyticsProvider, userPreferencesProvider, objectIdMapProvider, sensorManagerProvider, vibrationProvider, accountProvider, layoutExperienceProvider, navigationProvider, accessibilityUtilProvider, callAgentProvider, defaultAvatarsProvider, ecsConfigurationProvider);
        contactMoodMessageFragmentMembersInjector = ContactMoodMessageFragment_MembersInjector.create(objectInterfaceFinderProvider, contactUtilProvider);
        favoritesPickContactsFragmentMembersInjector = FavoritesPickContactsFragment_MembersInjector.create(objectInterfaceFinderProvider, accessibilityUtilProvider, asyncServiceProvider, contactUtilProvider, conversationUtilProvider, layoutExperienceProvider, skyLibProvider, userPreferencesProvider, objectIdMapProvider, mediaDocumentUploadUtilProvider, navigationProvider, typeFaceFactoryProvider, transferUtilProvider, accountProvider, contactAdapterProvider, contactAdapterViewBuilderProvider, telemetryHelperProvider, ecsConfigurationProvider);
        mediaPickerSearchFragmentMembersInjector = MediaPickerSearchFragment_MembersInjector.create(objectInterfaceFinderProvider, mediaContentRosterProvider, objectIdMapProvider, mruManagerProvider, analyticsProvider);
        aboutFragmentMembersInjector = AboutFragment_MembersInjector.create(objectInterfaceFinderProvider, navigationUrlProvider);
        sideBarFragmentMembersInjector = SideBarFragment_MembersInjector.create(objectInterfaceFinderProvider, imageCacheProvider, contactUtilProvider, conversationUtilProvider, navigationProvider, accessibilityUtilProvider, defaultAvatarsProvider, groupAvatarUtilProvider);
        unifiedSignInFragmentMembersInjector = UnifiedSignInFragment_MembersInjector.create(objectInterfaceFinderProvider, navigationProvider, analyticsProvider, signInDurationReporterProvider, getAnalyticsPersistentStorageProvider, ecsConfigurationProvider);
        skypeFragmentMembersInjector = SkypeFragment_MembersInjector.create(objectInterfaceFinderProvider);
        contactListFragmentMembersInjector = ContactListFragment_MembersInjector.create(objectInterfaceFinderProvider, accessibilityUtilProvider, asyncServiceProvider, navigationProvider, skyLibProvider, objectIdMapProvider, contactUtilProvider, conversationUtilProvider, layoutExperienceProvider, contactAdapterProvider, adPlacerProvider, accountProvider, userPreferencesProvider, contactsIngestManagerProvider, mnvCasesProvider, mnvAnalyticsProvider, analyticsProvider, ecsConfigurationProvider);
        mnvBaseFragmentMembersInjector = MnvBaseFragment_MembersInjector.create(objectInterfaceFinderProvider, userPreferencesProvider, navigationProvider, mnvManagerProvider, mnvAnalyticsProvider, mnvCasesProvider);
        unifiedSignInPickAccountFragmentMembersInjector = UnifiedSignInPickAccountFragment_MembersInjector.create(objectInterfaceFinderProvider, imageCacheProvider, accessibilityUtilProvider, analyticsProvider, signInDurationReporterProvider, getAnalyticsPersistentStorageProvider);
        mnvVerifiedFragmentMembersInjector = MnvVerifiedFragment_MembersInjector.create(objectInterfaceFinderProvider, userPreferencesProvider, navigationProvider, mnvManagerProvider, mnvAnalyticsProvider, mnvCasesProvider, accessibilityUtilProvider);
        pickerFragmentMembersInjector = PickerFragment_MembersInjector.create(objectInterfaceFinderProvider, accessibilityUtilProvider, asyncServiceProvider, contactUtilProvider, conversationUtilProvider, layoutExperienceProvider, skyLibProvider, userPreferencesProvider, objectIdMapProvider, mediaDocumentUploadUtilProvider, navigationProvider, typeFaceFactoryProvider, transferUtilProvider);
        skypeListFragmentMembersInjector = SkypeListFragment_MembersInjector.create(objectInterfaceFinderProvider, accessibilityUtilProvider);
        callRosterFragmentMembersInjector = CallRosterFragment_MembersInjector.create(objectInterfaceFinderProvider, navigationProvider, imageCacheProvider, conversationUtilProvider, contactUtilProvider, defaultAvatarsProvider);
        mnvCheckingAccountFragmentMembersInjector = MnvCheckingAccountFragment_MembersInjector.create(objectInterfaceFinderProvider, userPreferencesProvider, navigationProvider, mnvManagerProvider, mnvAnalyticsProvider, mnvCasesProvider, inputMethodManagerProvider, profileServiceTokenRequestProvider, mnvUtilProvider);
        attributionsFragmentMembersInjector = AttributionsFragment_MembersInjector.create(objectInterfaceFinderProvider, asyncServiceProvider, ecsConfigurationProvider);
        mnvErrorFragmentMembersInjector = MnvErrorFragment_MembersInjector.create(objectInterfaceFinderProvider, userPreferencesProvider, navigationProvider, mnvManagerProvider, mnvAnalyticsProvider, mnvCasesProvider);
        spanUtilProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
            private final SkypeApplicationComponent c;

            public final Object get()
            {
                com.skype.android.util.SpanUtil spanutil = c.spanUtil();
                if (spanutil == null)
                {
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                } else
                {
                    return spanutil;
                }
            }

            
            {
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        contactProfileFragmentMembersInjector = ContactProfileFragment_MembersInjector.create(objectInterfaceFinderProvider, timeUtilProvider, imageCacheProvider, contactUtilProvider, conversationUtilProvider, navigationProvider, layoutExperienceProvider, skyLibProvider, analyticsProvider, notificationManagerProvider, spanUtilProvider, permissionRequestProvider);
        gridListAdapterViewBuilderProvider = GridListAdapterViewBuilder_Factory.create(activityProvider, contactUtilProvider, imageCacheProvider, objectIdMapProvider, defaultAvatarsProvider, groupAvatarUtilProvider);
        favoriteGridListAdapterProvider = FavoriteGridListAdapter_Factory.create(MembersInjectors.a(), activityProvider, contactUtilProvider, imageCacheProvider, conversationUtilProvider, gridListAdapterViewBuilderProvider);
        favoritesQueryProvider = FavoritesQuery_Factory.create(skyLibProvider);
        favoritesFragmentMembersInjector = FavoritesFragment_MembersInjector.create(objectInterfaceFinderProvider, accessibilityUtilProvider, accountProvider, asyncServiceProvider, navigationProvider, layoutExperienceProvider, conversationUtilProvider, favoriteGridListAdapterProvider, favoritesQueryProvider, skyLibProvider, objectIdMapProvider);
        contactTopPicksGridListAdapterProvider = ContactTopPicksGridListAdapter_Factory.create(MembersInjectors.a(), activityProvider, contactUtilProvider, imageCacheProvider, conversationUtilProvider, gridListAdapterViewBuilderProvider, objectIdMapProvider);
        contactTopPicksFragmentMembersInjector = ContactTopPicksFragment_MembersInjector.create(objectInterfaceFinderProvider, accessibilityUtilProvider, asyncServiceProvider, skyLibProvider, objectIdMapProvider, accountProvider, navigationProvider, contactUtilProvider, contactTopPicksGridListAdapterProvider, conversationUtilProvider);
        videoCaptureFragmentMembersInjector = VideoCaptureFragment_MembersInjector.create(objectInterfaceFinderProvider, ecsConfigurationProvider, userPreferencesProvider, analyticsProvider);
        mnvAddNumberFragmentMembersInjector = MnvAddNumberFragment_MembersInjector.create(objectInterfaceFinderProvider, userPreferencesProvider, navigationProvider, mnvManagerProvider, mnvAnalyticsProvider, mnvCasesProvider, inputMethodManagerProvider, profileServiceTokenRequestProvider, ecsConfigurationProvider, mnvUtilProvider, contactUtilProvider, accessibilityUtilProvider, skyLibProvider);
        recentAdapterMembersInjector = RecentAdapter_MembersInjector.create(accountProvider, contactUtilProvider, conversationUtilProvider, timeUtilProvider, serverClockProvider, transferUtilProvider, formattedMessageCacheProvider, chatTextProvider, imageCacheProvider, skyLibProvider, objectIdMapProvider, mediaDocumentDownloadUtilProvider, groupAvatarUtilProvider, analyticsProvider, ecsConfigurationProvider, timeAnomalyTelemetryProvider, defaultAvatarsProvider, layoutExperienceProvider, annotationUtilProvider);
        recentAdapterProvider = RecentAdapter_Factory.create(recentAdapterMembersInjector, activityProvider);
        recentListFragmentMembersInjector = RecentListFragment_MembersInjector.create(objectInterfaceFinderProvider, accessibilityUtilProvider, navigationProvider, layoutExperienceProvider, asyncServiceProvider, skyLibProvider, objectIdMapProvider, conversationUtilProvider, contactUtilProvider, recentAdapterProvider, adPlacerProvider, analyticsProvider, imageCacheProvider, ecsConfigurationProvider);
        conversationAdapterProvider = ConversationAdapter_Factory.create(MembersInjectors.a(), activityProvider, imageCacheProvider, contactUtilProvider, groupAvatarUtilProvider, defaultAvatarsProvider, skyLibProvider, objectIdMapProvider, typeFaceFactoryProvider);
        transferPickConversationFragmentMembersInjector = TransferPickConversationFragment_MembersInjector.create(objectInterfaceFinderProvider, accessibilityUtilProvider, asyncServiceProvider, contactUtilProvider, conversationUtilProvider, layoutExperienceProvider, skyLibProvider, userPreferencesProvider, objectIdMapProvider, mediaDocumentUploadUtilProvider, navigationProvider, typeFaceFactoryProvider, transferUtilProvider, conversationAdapterProvider, analyticsProvider, ecsConfigurationProvider);
        manageAliasesAdapterMembersInjector = ManageAliasesAdapter_MembersInjector.create(shortCircuitProfileWebClientProvider);
        manageAliasesAdapterProvider = ManageAliasesAdapter_Factory.create(manageAliasesAdapterMembersInjector, accessibilityUtilProvider);
        manageAliasesFragmentMembersInjector = ManageAliasesFragment_MembersInjector.create(objectInterfaceFinderProvider, shortCircuitProfileWebClientProvider, manageAliasesAdapterProvider, navigationProvider, navigationUrlProvider, layoutExperienceProvider, accountProvider1, mnvCasesProvider, mnvAnalyticsProvider);
        promotedSCDContactsManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeFragmentComponent b;
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
                b = DaggerSkypeFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        contactSuggestedInvitesPickerFragmentMembersInjector = ContactSuggestedInvitesPickerFragment_MembersInjector.create(objectInterfaceFinderProvider, accessibilityUtilProvider, asyncServiceProvider, contactUtilProvider, conversationUtilProvider, layoutExperienceProvider, skyLibProvider, userPreferencesProvider, objectIdMapProvider, mediaDocumentUploadUtilProvider, navigationProvider, typeFaceFactoryProvider, transferUtilProvider, accountProvider, contactAdapterProvider, contactAdapterViewBuilderProvider, telemetryHelperProvider, ecsConfigurationProvider, analyticsProvider, promotedSCDContactsManagerProvider);
        callHistoryAdapterMembersInjector = CallHistoryAdapter_MembersInjector.create(accountProvider, contactUtilProvider, conversationUtilProvider, timeUtilProvider, serverClockProvider, transferUtilProvider, formattedMessageCacheProvider, chatTextProvider, imageCacheProvider, skyLibProvider, objectIdMapProvider, mediaDocumentDownloadUtilProvider, groupAvatarUtilProvider, analyticsProvider, ecsConfigurationProvider, timeAnomalyTelemetryProvider, defaultAvatarsProvider, layoutExperienceProvider, annotationUtilProvider, navigationProvider);
        callHistoryAdapterProvider = CallHistoryAdapter_Factory.create(callHistoryAdapterMembersInjector, activityProvider);
        callHistoryFragmentMembersInjector = CallHistoryFragment_MembersInjector.create(objectInterfaceFinderProvider, accessibilityUtilProvider, skyLibProvider, asyncServiceProvider, callHistoryAdapterProvider, navigationProvider, objectIdMapProvider);
        contactPickerFragmentMembersInjector = ContactPickerFragment_MembersInjector.create(objectInterfaceFinderProvider, accessibilityUtilProvider, asyncServiceProvider, contactUtilProvider, conversationUtilProvider, layoutExperienceProvider, skyLibProvider, userPreferencesProvider, objectIdMapProvider, mediaDocumentUploadUtilProvider, navigationProvider, typeFaceFactoryProvider, transferUtilProvider, accountProvider, contactAdapterProvider, contactAdapterViewBuilderProvider, telemetryHelperProvider, ecsConfigurationProvider);
        mnvEnterPinFragmentMembersInjector = MnvEnterPinFragment_MembersInjector.create(objectInterfaceFinderProvider, userPreferencesProvider, navigationProvider, mnvManagerProvider, mnvAnalyticsProvider, mnvCasesProvider, inputMethodManagerProvider, profileServiceTokenRequestProvider, accessibilityUtilProvider, mnvUtilProvider);
    }

    public final void inject(SkypeFragment skypefragment)
    {
        skypeFragmentMembersInjector.injectMembers(skypefragment);
    }

    public final void inject(SkypeListFragment skypelistfragment)
    {
        skypeListFragmentMembersInjector.injectMembers(skypelistfragment);
    }

    public final void inject(MyInfoFragment myinfofragment)
    {
        myInfoFragmentMembersInjector.injectMembers(myinfofragment);
    }

    public final void inject(CallRosterFragment callrosterfragment)
    {
        callRosterFragmentMembersInjector.injectMembers(callrosterfragment);
    }

    public final void inject(InCallFragment incallfragment)
    {
        inCallFragmentMembersInjector.injectMembers(incallfragment);
    }

    public final void inject(AddParticipantsAccessibilityFragment addparticipantsaccessibilityfragment)
    {
        addParticipantsAccessibilityFragmentMembersInjector.injectMembers(addparticipantsaccessibilityfragment);
    }

    public final void inject(ChatFragment chatfragment)
    {
        chatFragmentMembersInjector.injectMembers(chatfragment);
    }

    public final void inject(ParticipantListFragment participantlistfragment)
    {
        participantListFragmentMembersInjector.injectMembers(participantlistfragment);
    }

    public final void inject(SideBarFragment sidebarfragment)
    {
        sideBarFragmentMembersInjector.injectMembers(sidebarfragment);
    }

    public final void inject(MediaPickerSearchFragment mediapickersearchfragment)
    {
        mediaPickerSearchFragmentMembersInjector.injectMembers(mediapickersearchfragment);
    }

    public final void inject(ContactListFragment contactlistfragment)
    {
        contactListFragmentMembersInjector.injectMembers(contactlistfragment);
    }

    public final void inject(ContactMoodMessageFragment contactmoodmessagefragment)
    {
        contactMoodMessageFragmentMembersInjector.injectMembers(contactmoodmessagefragment);
    }

    public final void inject(ContactPickerFragment contactpickerfragment)
    {
        contactPickerFragmentMembersInjector.injectMembers(contactpickerfragment);
    }

    public final void inject(ContactProfileFragment contactprofilefragment)
    {
        contactProfileFragmentMembersInjector.injectMembers(contactprofilefragment);
    }

    public final void inject(ContactSuggestedInvitesPickerFragment contactsuggestedinvitespickerfragment)
    {
        contactSuggestedInvitesPickerFragmentMembersInjector.injectMembers(contactsuggestedinvitespickerfragment);
    }

    public final void inject(ContactTopPicksFragment contacttoppicksfragment)
    {
        contactTopPicksFragmentMembersInjector.injectMembers(contacttoppicksfragment);
    }

    public final void inject(PickerFragment pickerfragment)
    {
        pickerFragmentMembersInjector.injectMembers(pickerfragment);
    }

    public final void inject(CallHistoryFragment callhistoryfragment)
    {
        callHistoryFragmentMembersInjector.injectMembers(callhistoryfragment);
    }

    public final void inject(CallHistoryMaterialFragment callhistorymaterialfragment)
    {
        callHistoryMaterialFragmentMembersInjector.injectMembers(callhistorymaterialfragment);
    }

    public final void inject(FavoritesFragment favoritesfragment)
    {
        favoritesFragmentMembersInjector.injectMembers(favoritesfragment);
    }

    public final void inject(FavoritesPickContactsFragment favoritespickcontactsfragment)
    {
        favoritesPickContactsFragmentMembersInjector.injectMembers(favoritespickcontactsfragment);
    }

    public final void inject(MnvAddFriendsFragment mnvaddfriendsfragment)
    {
        mnvAddFriendsFragmentMembersInjector.injectMembers(mnvaddfriendsfragment);
    }

    public final void inject(MnvAddNumberFragment mnvaddnumberfragment)
    {
        mnvAddNumberFragmentMembersInjector.injectMembers(mnvaddnumberfragment);
    }

    public final void inject(MnvBaseFragment mnvbasefragment)
    {
        mnvBaseFragmentMembersInjector.injectMembers(mnvbasefragment);
    }

    public final void inject(MnvCheckingAccountFragment mnvcheckingaccountfragment)
    {
        mnvCheckingAccountFragmentMembersInjector.injectMembers(mnvcheckingaccountfragment);
    }

    public final void inject(MnvEnterPinFragment mnventerpinfragment)
    {
        mnvEnterPinFragmentMembersInjector.injectMembers(mnventerpinfragment);
    }

    public final void inject(MnvErrorFragment mnverrorfragment)
    {
        mnvErrorFragmentMembersInjector.injectMembers(mnverrorfragment);
    }

    public final void inject(MnvLearnMoreFragment mnvlearnmorefragment)
    {
        mnvLearnMoreFragmentMembersInjector.injectMembers(mnvlearnmorefragment);
    }

    public final void inject(MnvRequestFragment mnvrequestfragment)
    {
        mnvRequestFragmentMembersInjector.injectMembers(mnvrequestfragment);
    }

    public final void inject(MnvVerifiedFragment mnvverifiedfragment)
    {
        mnvVerifiedFragmentMembersInjector.injectMembers(mnvverifiedfragment);
    }

    public final void inject(RecentListFragment recentlistfragment)
    {
        recentListFragmentMembersInjector.injectMembers(recentlistfragment);
    }

    public final void inject(AboutFragment aboutfragment)
    {
        aboutFragmentMembersInjector.injectMembers(aboutfragment);
    }

    public final void inject(AttributionsFragment attributionsfragment)
    {
        attributionsFragmentMembersInjector.injectMembers(attributionsfragment);
    }

    public final void inject(DebugSettingsFragment debugsettingsfragment)
    {
        debugSettingsFragmentMembersInjector.injectMembers(debugsettingsfragment);
    }

    public final void inject(ManageAliasesFragment managealiasesfragment)
    {
        manageAliasesFragmentMembersInjector.injectMembers(managealiasesfragment);
    }

    public final void inject(NotificationSettingsFragment notificationsettingsfragment)
    {
        notificationSettingsFragmentMembersInjector.injectMembers(notificationsettingsfragment);
    }

    public final void inject(SettingsCategoriesFragment settingscategoriesfragment)
    {
        settingsCategoriesFragmentMembersInjector.injectMembers(settingscategoriesfragment);
    }

    public final void inject(SettingsFragment settingsfragment)
    {
        settingsFragmentMembersInjector.injectMembers(settingsfragment);
    }

    public final void inject(UnifiedSignInFragment unifiedsigninfragment)
    {
        unifiedSignInFragmentMembersInjector.injectMembers(unifiedsigninfragment);
    }

    public final void inject(UnifiedSignInPickAccountFragment unifiedsigninpickaccountfragment)
    {
        unifiedSignInPickAccountFragmentMembersInjector.injectMembers(unifiedsigninpickaccountfragment);
    }

    public final void inject(TransferPickConversationFragment transferpickconversationfragment)
    {
        transferPickConversationFragmentMembersInjector.injectMembers(transferpickconversationfragment);
    }

    public final void inject(VideoCaptureFragment videocapturefragment)
    {
        videoCaptureFragmentMembersInjector.injectMembers(videocapturefragment);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/DaggerSkypeFragmentComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
