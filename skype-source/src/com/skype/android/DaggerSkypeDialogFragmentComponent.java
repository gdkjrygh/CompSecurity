// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.app.ActionBarCustomizer_Factory;
import com.skype.android.app.NavigationUrl_Factory;
import com.skype.android.app.Navigation_Factory;
import com.skype.android.app.ObjectInterfaceMenuDialog;
import com.skype.android.app.ObjectInterfaceMenuDialog_MembersInjector;
import com.skype.android.app.ProgressSpinnerDialogFragment;
import com.skype.android.app.ProgressSpinnerDialogFragment_MembersInjector;
import com.skype.android.app.account.BuyCallForwardingDialog;
import com.skype.android.app.account.BuyCallForwardingDialog_MembersInjector;
import com.skype.android.app.account.BuyCreditDialog;
import com.skype.android.app.account.BuyCreditDialog_MembersInjector;
import com.skype.android.app.account.BuyOnlineNumberDialog;
import com.skype.android.app.account.BuyOnlineNumberDialog_MembersInjector;
import com.skype.android.app.account.ChangeAvatarDialog;
import com.skype.android.app.account.ChangeAvatarDialog_MembersInjector;
import com.skype.android.app.account.ChangeBirthdayDialog;
import com.skype.android.app.account.ChangeBirthdayDialog_MembersInjector;
import com.skype.android.app.account.ChangeGenderDialog;
import com.skype.android.app.account.ChangeGenderDialog_MembersInjector;
import com.skype.android.app.account.ChangeLanguageDialog;
import com.skype.android.app.account.ChangeLanguageDialog_MembersInjector;
import com.skype.android.app.account.CustomizeRingtoneDialog;
import com.skype.android.app.account.CustomizeRingtoneDialog_MembersInjector;
import com.skype.android.app.account.DeleteCallForwardingNumberDialog;
import com.skype.android.app.account.DeleteCallForwardingNumberDialog_MembersInjector;
import com.skype.android.app.account.DeletePhoneNumberDialog;
import com.skype.android.app.account.DeletePhoneNumberDialog_MembersInjector;
import com.skype.android.app.chat.AnnotationUtil_Factory;
import com.skype.android.app.chat.CancelTransferDialog;
import com.skype.android.app.chat.CancelTransferDialog_MembersInjector;
import com.skype.android.app.chat.ChangeGroupPictureDialog;
import com.skype.android.app.chat.ChangeGroupPictureDialog_MembersInjector;
import com.skype.android.app.chat.HeartsDialog;
import com.skype.android.app.chat.HeartsDialog_MembersInjector;
import com.skype.android.app.chat.ParticipantRemoveDialog;
import com.skype.android.app.chat.ParticipantRemoveDialog_MembersInjector;
import com.skype.android.app.chat.PlayVoicemailDialog;
import com.skype.android.app.chat.PlayVoicemailDialog_MembersInjector;
import com.skype.android.app.chat.RemoveMessageDialog;
import com.skype.android.app.chat.RemoveMessageDialog_MembersInjector;
import com.skype.android.app.chat.SmsFailedNoCreditDialog;
import com.skype.android.app.chat.SmsFailedNoCreditDialog_MembersInjector;
import com.skype.android.app.chat.TransferDetailsDialog;
import com.skype.android.app.chat.TransferDetailsDialog_MembersInjector;
import com.skype.android.app.chat.TranslatorSettingDialog;
import com.skype.android.app.chat.TranslatorSettingDialog_MembersInjector;
import com.skype.android.app.chat.picker.ExtensiblePickerDialogFragment;
import com.skype.android.app.chat.picker.ExtensiblePickerDialogFragment_MembersInjector;
import com.skype.android.app.chat.picker.MojiPreviewDialogFragment;
import com.skype.android.app.chat.picker.MojiPreviewDialogFragment_MembersInjector;
import com.skype.android.app.chat.picker.PickerDialogFragment;
import com.skype.android.app.chat.picker.PickerDialogFragment_MembersInjector;
import com.skype.android.app.contacts.ContactBlockConfirmDialog;
import com.skype.android.app.contacts.ContactBlockConfirmDialog_MembersInjector;
import com.skype.android.app.contacts.ContactBlockDialog;
import com.skype.android.app.contacts.ContactBlockDialog_MembersInjector;
import com.skype.android.app.contacts.ContactBlockedDialog;
import com.skype.android.app.contacts.ContactBlockedDialog_MembersInjector;
import com.skype.android.app.contacts.ContactRemoveConfirmDialog;
import com.skype.android.app.contacts.ContactRemoveConfirmDialog_MembersInjector;
import com.skype.android.app.contacts.ContactRequestDeclineDialog;
import com.skype.android.app.contacts.ContactRequestDeclineDialog_MembersInjector;
import com.skype.android.app.main.EditPropertyFragment;
import com.skype.android.app.main.EditPropertyFragment_MembersInjector;
import com.skype.android.app.recents.RecentItemMenuDialog;
import com.skype.android.app.recents.RecentItemMenuDialog_MembersInjector;
import com.skype.android.app.recents.RecentRemoveHistoryDialog;
import com.skype.android.app.recents.RecentRemoveHistoryDialog_MembersInjector;
import com.skype.android.app.signin.AccountBlockedDialogFragment;
import com.skype.android.app.signin.AccountBlockedDialogFragment_MembersInjector;
import com.skype.android.app.signin.AlreadyMergedDialog;
import com.skype.android.app.signin.AlreadyMergedDialog_MembersInjector;
import com.skype.android.app.signin.PotentiallyMSACredentialsDialog;
import com.skype.android.app.signin.PotentiallyMSACredentialsDialog_MembersInjector;
import com.skype.android.app.signin.SignInNavigation_Factory;
import com.skype.android.app.signin.UpdateMandatoryDialog;
import com.skype.android.app.signin.UpdateMandatoryDialog_MembersInjector;
import com.skype.android.app.signin.UpdateOptionalDialog;
import com.skype.android.app.signin.UpdateOptionalDialog_MembersInjector;
import com.skype.android.app.transfer.TransferUtil_Factory;
import com.skype.android.inject.ActivityModule;
import com.skype.android.inject.ActivityModule_ActivityFactory;
import com.skype.android.inject.ObjectInterfaceFinder_Factory;
import com.skype.android.util.ContactUtil_Factory;
import com.skype.android.util.ConversationUtil_Factory;
import com.skype.android.util.SkypeCredit_Factory;
import com.skype.android.util.SkypeNumber_Factory;
import com.skype.android.util.TimeUtil_Factory;
import com.skype.android.util.accessibility.AccessibilityUtil_Factory;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeDialogFragmentComponent, SkypeDialogFragment_MembersInjector, SkypeDialogFragment, SkypeApplicationComponent

public final class DaggerSkypeDialogFragmentComponent
    implements SkypeDialogFragmentComponent
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

        public final SkypeDialogFragmentComponent a()
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
                return new DaggerSkypeDialogFragmentComponent(this);
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
    private Provider accessibilityUtilProvider;
    private MembersInjector accountBlockedDialogFragmentMembersInjector;
    private Provider accountProvider;
    private Provider accountProvider1;
    private Provider actionBarCustomizerProvider;
    private Provider activityProvider;
    private MembersInjector alreadyMergedDialogMembersInjector;
    private Provider analyticsProvider;
    private Provider annotationUtilProvider;
    private Provider applicationConfigProvider;
    private Provider applicationProvider;
    private Provider asyncServiceProvider;
    private Provider audioManagerProvider;
    private MembersInjector buyCallForwardingDialogMembersInjector;
    private MembersInjector buyCreditDialogMembersInjector;
    private MembersInjector buyOnlineNumberDialogMembersInjector;
    private MembersInjector cancelTransferDialogMembersInjector;
    private MembersInjector changeAvatarDialogMembersInjector;
    private MembersInjector changeBirthdayDialogMembersInjector;
    private MembersInjector changeGenderDialogMembersInjector;
    private MembersInjector changeGroupPictureDialogMembersInjector;
    private MembersInjector changeLanguageDialogMembersInjector;
    private Provider chatTextProvider;
    private MembersInjector contactBlockConfirmDialogMembersInjector;
    private MembersInjector contactBlockDialogMembersInjector;
    private MembersInjector contactBlockedDialogMembersInjector;
    private Provider contactMoodCacheProvider;
    private MembersInjector contactRemoveConfirmDialogMembersInjector;
    private MembersInjector contactRequestDeclineDialogMembersInjector;
    private Provider contactUtilProvider;
    private Provider contextProvider;
    private Provider conversationUtilProvider;
    private MembersInjector customizeRingtoneDialogMembersInjector;
    private Provider defaultAvatarsProvider;
    private MembersInjector deleteCallForwardingNumberDialogMembersInjector;
    private MembersInjector deletePhoneNumberDialogMembersInjector;
    private Provider dreamKeeperProvider;
    private Provider ecsConfigurationProvider;
    private MembersInjector editPropertyFragmentMembersInjector;
    private Provider eventBusProvider;
    private MembersInjector extensiblePickerDialogFragmentMembersInjector;
    private Provider formattedMessageCacheProvider;
    private Provider getAnalyticsPersistentStorageProvider;
    private Provider getRingtoneStorageProvider;
    private Provider getTranslatorProvider;
    private MembersInjector heartsDialogMembersInjector;
    private Provider imageCacheProvider;
    private Provider inputMethodManagerProvider;
    private Provider layoutExperienceProvider;
    private Provider mediaContentRosterProvider;
    private MembersInjector mojiPreviewDialogFragmentMembersInjector;
    private Provider navigationProvider;
    private Provider navigationUrlProvider;
    private Provider networkUtilProvider;
    private Provider notificationManagerProvider;
    private Provider objectIdMapProvider;
    private Provider objectInterfaceFinderProvider;
    private MembersInjector objectInterfaceMenuDialogMembersInjector;
    private MembersInjector participantRemoveDialogMembersInjector;
    private Provider pcmHostProvider;
    private MembersInjector pickerDialogFragmentMembersInjector;
    private MembersInjector playVoicemailDialogMembersInjector;
    private MembersInjector potentiallyMSACredentialsDialogMembersInjector;
    private MembersInjector progressSpinnerDialogFragmentMembersInjector;
    private MembersInjector recentItemMenuDialogMembersInjector;
    private MembersInjector recentRemoveHistoryDialogMembersInjector;
    private MembersInjector removeMessageDialogMembersInjector;
    private Provider signInDurationReporterProvider;
    private Provider signInNavigationProvider;
    private Provider skyLibProvider;
    private Provider skypeCreditProvider;
    private MembersInjector skypeDialogFragmentMembersInjector;
    private Provider skypeNumberProvider;
    private MembersInjector smsFailedNoCreditDialogMembersInjector;
    private Provider timeAnomalyTelemetryProvider;
    private Provider timeUtilProvider;
    private MembersInjector transferDetailsDialogMembersInjector;
    private Provider transferUtilProvider;
    private MembersInjector translatorSettingDialogMembersInjector;
    private MembersInjector updateMandatoryDialogMembersInjector;
    private MembersInjector updateOptionalDialogMembersInjector;
    private Provider urlsProvider;

    private DaggerSkypeDialogFragmentComponent(Builder builder1)
    {
        if (!$assertionsDisabled && builder1 == null)
        {
            throw new AssertionError();
        } else
        {
            initialize(builder1);
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
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        objectInterfaceFinderProvider = ObjectInterfaceFinder_Factory.create(objectIdMapProvider);
        skyLibProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        cancelTransferDialogMembersInjector = CancelTransferDialog_MembersInjector.create(objectInterfaceFinderProvider, skyLibProvider);
        accountProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        skypeNumberProvider = SkypeNumber_Factory.create(accountProvider);
        skypeCreditProvider = SkypeCredit_Factory.create(accountProvider);
        contextProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        urlsProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        navigationUrlProvider = NavigationUrl_Factory.create(contextProvider, urlsProvider);
        buyOnlineNumberDialogMembersInjector = BuyOnlineNumberDialog_MembersInjector.create(objectInterfaceFinderProvider, accountProvider, skypeNumberProvider, skypeCreditProvider, navigationUrlProvider);
        audioManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        pcmHostProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        playVoicemailDialogMembersInjector = PlayVoicemailDialog_MembersInjector.create(objectInterfaceFinderProvider, audioManagerProvider, pcmHostProvider);
        applicationProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        contactMoodCacheProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        ecsConfigurationProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        imageCacheProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        defaultAvatarsProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        contactUtilProvider = ContactUtil_Factory.create(applicationProvider, accountProvider, skyLibProvider, objectIdMapProvider, contactMoodCacheProvider, ecsConfigurationProvider, imageCacheProvider, defaultAvatarsProvider);
        eventBusProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        contactBlockConfirmDialogMembersInjector = ContactBlockConfirmDialog_MembersInjector.create(objectInterfaceFinderProvider, skyLibProvider, contactUtilProvider, eventBusProvider);
        skypeDialogFragmentMembersInjector = SkypeDialogFragment_MembersInjector.create(objectInterfaceFinderProvider);
        changeGenderDialogMembersInjector = ChangeGenderDialog_MembersInjector.create(objectInterfaceFinderProvider, accountProvider);
        asyncServiceProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        changeGroupPictureDialogMembersInjector = ChangeGroupPictureDialog_MembersInjector.create(objectInterfaceFinderProvider, imageCacheProvider, asyncServiceProvider);
        timeUtilProvider = TimeUtil_Factory.create(applicationProvider);
        changeBirthdayDialogMembersInjector = ChangeBirthdayDialog_MembersInjector.create(objectInterfaceFinderProvider, accountProvider, timeUtilProvider);
        activityProvider = ActivityModule_ActivityFactory.create(Builder.b(builder1));
        formattedMessageCacheProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        chatTextProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        conversationUtilProvider = ConversationUtil_Factory.create(applicationProvider, asyncServiceProvider, skyLibProvider, objectIdMapProvider, formattedMessageCacheProvider, accountProvider, contactUtilProvider, ecsConfigurationProvider, chatTextProvider);
        accountProvider1 = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        dreamKeeperProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        analyticsProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        networkUtilProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        signInDurationReporterProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        getAnalyticsPersistentStorageProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        layoutExperienceProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        navigationProvider = Navigation_Factory.create(activityProvider, accountProvider1, skyLibProvider, dreamKeeperProvider, conversationUtilProvider, analyticsProvider, networkUtilProvider, ecsConfigurationProvider, signInDurationReporterProvider, getAnalyticsPersistentStorageProvider, layoutExperienceProvider, timeUtilProvider);
        timeAnomalyTelemetryProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        actionBarCustomizerProvider = ActionBarCustomizer_Factory.create(MembersInjectors.a(), activityProvider, skyLibProvider, contactUtilProvider, conversationUtilProvider, timeUtilProvider, navigationProvider, eventBusProvider, layoutExperienceProvider, timeAnomalyTelemetryProvider);
        inputMethodManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        accessibilityUtilProvider = AccessibilityUtil_Factory.create(contextProvider);
        getTranslatorProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        editPropertyFragmentMembersInjector = EditPropertyFragment_MembersInjector.create(objectInterfaceFinderProvider, accountProvider, skyLibProvider, objectIdMapProvider, actionBarCustomizerProvider, contactUtilProvider, contactMoodCacheProvider, inputMethodManagerProvider, accessibilityUtilProvider, layoutExperienceProvider, chatTextProvider, analyticsProvider, formattedMessageCacheProvider, getTranslatorProvider, ecsConfigurationProvider, conversationUtilProvider);
        signInNavigationProvider = SignInNavigation_Factory.create(activityProvider, ecsConfigurationProvider, analyticsProvider, getAnalyticsPersistentStorageProvider);
        alreadyMergedDialogMembersInjector = AlreadyMergedDialog_MembersInjector.create(objectInterfaceFinderProvider, signInNavigationProvider);
        contactRemoveConfirmDialogMembersInjector = ContactRemoveConfirmDialog_MembersInjector.create(objectInterfaceFinderProvider, contactUtilProvider, eventBusProvider);
        recentItemMenuDialogMembersInjector = RecentItemMenuDialog_MembersInjector.create(objectInterfaceFinderProvider, objectIdMapProvider);
        contactBlockedDialogMembersInjector = ContactBlockedDialog_MembersInjector.create(objectInterfaceFinderProvider, contactUtilProvider, navigationProvider);
        changeLanguageDialogMembersInjector = ChangeLanguageDialog_MembersInjector.create(objectInterfaceFinderProvider, accountProvider, contactUtilProvider);
        mediaContentRosterProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        mojiPreviewDialogFragmentMembersInjector = MojiPreviewDialogFragment_MembersInjector.create(objectInterfaceFinderProvider, mediaContentRosterProvider, analyticsProvider, objectIdMapProvider);
        translatorSettingDialogMembersInjector = TranslatorSettingDialog_MembersInjector.create(objectInterfaceFinderProvider, getTranslatorProvider, conversationUtilProvider, imageCacheProvider, accountProvider, contactUtilProvider, defaultAvatarsProvider, eventBusProvider, analyticsProvider);
        smsFailedNoCreditDialogMembersInjector = SmsFailedNoCreditDialog_MembersInjector.create(objectInterfaceFinderProvider, navigationUrlProvider);
        extensiblePickerDialogFragmentMembersInjector = ExtensiblePickerDialogFragment_MembersInjector.create(objectInterfaceFinderProvider, mediaContentRosterProvider, analyticsProvider, ecsConfigurationProvider);
        notificationManagerProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        contactRequestDeclineDialogMembersInjector = ContactRequestDeclineDialog_MembersInjector.create(objectInterfaceFinderProvider, skyLibProvider, contactUtilProvider, eventBusProvider, notificationManagerProvider);
        progressSpinnerDialogFragmentMembersInjector = ProgressSpinnerDialogFragment_MembersInjector.create(objectInterfaceFinderProvider);
        potentiallyMSACredentialsDialogMembersInjector = PotentiallyMSACredentialsDialog_MembersInjector.create(objectInterfaceFinderProvider, signInNavigationProvider);
        transferUtilProvider = TransferUtil_Factory.create(contextProvider, accountProvider1, objectIdMapProvider, timeUtilProvider, timeAnomalyTelemetryProvider, analyticsProvider);
        transferDetailsDialogMembersInjector = TransferDetailsDialog_MembersInjector.create(objectInterfaceFinderProvider, transferUtilProvider);
        accountBlockedDialogFragmentMembersInjector = AccountBlockedDialogFragment_MembersInjector.create(objectInterfaceFinderProvider, navigationUrlProvider);
        getRingtoneStorageProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        customizeRingtoneDialogMembersInjector = CustomizeRingtoneDialog_MembersInjector.create(objectInterfaceFinderProvider, getRingtoneStorageProvider, conversationUtilProvider);
        pickerDialogFragmentMembersInjector = PickerDialogFragment_MembersInjector.create(objectInterfaceFinderProvider, mediaContentRosterProvider);
        participantRemoveDialogMembersInjector = ParticipantRemoveDialog_MembersInjector.create(objectInterfaceFinderProvider, contactUtilProvider, skyLibProvider);
        buyCallForwardingDialogMembersInjector = BuyCallForwardingDialog_MembersInjector.create(objectInterfaceFinderProvider, navigationUrlProvider);
        applicationConfigProvider = new Factory(builder1) {

            final Builder a;
            final DaggerSkypeDialogFragmentComponent b;
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
                b = DaggerSkypeDialogFragmentComponent.this;
                a = builder1;
                super();
                c = Builder.a(a);
            }
        };
        updateOptionalDialogMembersInjector = UpdateOptionalDialog_MembersInjector.create(objectInterfaceFinderProvider, urlsProvider, applicationConfigProvider, analyticsProvider);
        changeAvatarDialogMembersInjector = ChangeAvatarDialog_MembersInjector.create(objectInterfaceFinderProvider, accountProvider, imageCacheProvider);
        buyCreditDialogMembersInjector = BuyCreditDialog_MembersInjector.create(objectInterfaceFinderProvider, skypeCreditProvider, navigationUrlProvider);
        updateMandatoryDialogMembersInjector = UpdateMandatoryDialog_MembersInjector.create(objectInterfaceFinderProvider, urlsProvider);
        annotationUtilProvider = AnnotationUtil_Factory.create(objectIdMapProvider);
        heartsDialogMembersInjector = HeartsDialog_MembersInjector.create(objectInterfaceFinderProvider, annotationUtilProvider, skyLibProvider, contactUtilProvider, imageCacheProvider);
        deletePhoneNumberDialogMembersInjector = DeletePhoneNumberDialog_MembersInjector.create(objectInterfaceFinderProvider, accountProvider);
        objectInterfaceMenuDialogMembersInjector = ObjectInterfaceMenuDialog_MembersInjector.create(objectInterfaceFinderProvider, objectIdMapProvider);
        deleteCallForwardingNumberDialogMembersInjector = DeleteCallForwardingNumberDialog_MembersInjector.create(objectInterfaceFinderProvider, skyLibProvider, accountProvider, analyticsProvider);
        removeMessageDialogMembersInjector = RemoveMessageDialog_MembersInjector.create(objectInterfaceFinderProvider, analyticsProvider);
        contactBlockDialogMembersInjector = ContactBlockDialog_MembersInjector.create(objectInterfaceFinderProvider, skyLibProvider, contactUtilProvider, eventBusProvider);
        recentRemoveHistoryDialogMembersInjector = RecentRemoveHistoryDialog_MembersInjector.create(objectInterfaceFinderProvider, analyticsProvider, objectIdMapProvider);
    }

    public final void inject(SkypeDialogFragment skypedialogfragment)
    {
        skypeDialogFragmentMembersInjector.injectMembers(skypedialogfragment);
    }

    public final void inject(ObjectInterfaceMenuDialog objectinterfacemenudialog)
    {
        objectInterfaceMenuDialogMembersInjector.injectMembers(objectinterfacemenudialog);
    }

    public final void inject(ProgressSpinnerDialogFragment progressspinnerdialogfragment)
    {
        progressSpinnerDialogFragmentMembersInjector.injectMembers(progressspinnerdialogfragment);
    }

    public final void inject(BuyCallForwardingDialog buycallforwardingdialog)
    {
        buyCallForwardingDialogMembersInjector.injectMembers(buycallforwardingdialog);
    }

    public final void inject(BuyCreditDialog buycreditdialog)
    {
        buyCreditDialogMembersInjector.injectMembers(buycreditdialog);
    }

    public final void inject(BuyOnlineNumberDialog buyonlinenumberdialog)
    {
        buyOnlineNumberDialogMembersInjector.injectMembers(buyonlinenumberdialog);
    }

    public final void inject(ChangeAvatarDialog changeavatardialog)
    {
        changeAvatarDialogMembersInjector.injectMembers(changeavatardialog);
    }

    public final void inject(ChangeBirthdayDialog changebirthdaydialog)
    {
        changeBirthdayDialogMembersInjector.injectMembers(changebirthdaydialog);
    }

    public final void inject(ChangeGenderDialog changegenderdialog)
    {
        changeGenderDialogMembersInjector.injectMembers(changegenderdialog);
    }

    public final void inject(ChangeLanguageDialog changelanguagedialog)
    {
        changeLanguageDialogMembersInjector.injectMembers(changelanguagedialog);
    }

    public final void inject(CustomizeRingtoneDialog customizeringtonedialog)
    {
        customizeRingtoneDialogMembersInjector.injectMembers(customizeringtonedialog);
    }

    public final void inject(DeleteCallForwardingNumberDialog deletecallforwardingnumberdialog)
    {
        deleteCallForwardingNumberDialogMembersInjector.injectMembers(deletecallforwardingnumberdialog);
    }

    public final void inject(DeletePhoneNumberDialog deletephonenumberdialog)
    {
        deletePhoneNumberDialogMembersInjector.injectMembers(deletephonenumberdialog);
    }

    public final void inject(CancelTransferDialog canceltransferdialog)
    {
        cancelTransferDialogMembersInjector.injectMembers(canceltransferdialog);
    }

    public final void inject(ChangeGroupPictureDialog changegrouppicturedialog)
    {
        changeGroupPictureDialogMembersInjector.injectMembers(changegrouppicturedialog);
    }

    public final void inject(HeartsDialog heartsdialog)
    {
        heartsDialogMembersInjector.injectMembers(heartsdialog);
    }

    public final void inject(ParticipantRemoveDialog participantremovedialog)
    {
        participantRemoveDialogMembersInjector.injectMembers(participantremovedialog);
    }

    public final void inject(PlayVoicemailDialog playvoicemaildialog)
    {
        playVoicemailDialogMembersInjector.injectMembers(playvoicemaildialog);
    }

    public final void inject(RemoveMessageDialog removemessagedialog)
    {
        removeMessageDialogMembersInjector.injectMembers(removemessagedialog);
    }

    public final void inject(SmsFailedNoCreditDialog smsfailednocreditdialog)
    {
        smsFailedNoCreditDialogMembersInjector.injectMembers(smsfailednocreditdialog);
    }

    public final void inject(TransferDetailsDialog transferdetailsdialog)
    {
        transferDetailsDialogMembersInjector.injectMembers(transferdetailsdialog);
    }

    public final void inject(TranslatorSettingDialog translatorsettingdialog)
    {
        translatorSettingDialogMembersInjector.injectMembers(translatorsettingdialog);
    }

    public final void inject(ExtensiblePickerDialogFragment extensiblepickerdialogfragment)
    {
        extensiblePickerDialogFragmentMembersInjector.injectMembers(extensiblepickerdialogfragment);
    }

    public final void inject(MojiPreviewDialogFragment mojipreviewdialogfragment)
    {
        mojiPreviewDialogFragmentMembersInjector.injectMembers(mojipreviewdialogfragment);
    }

    public final void inject(PickerDialogFragment pickerdialogfragment)
    {
        pickerDialogFragmentMembersInjector.injectMembers(pickerdialogfragment);
    }

    public final void inject(ContactBlockConfirmDialog contactblockconfirmdialog)
    {
        contactBlockConfirmDialogMembersInjector.injectMembers(contactblockconfirmdialog);
    }

    public final void inject(ContactBlockDialog contactblockdialog)
    {
        contactBlockDialogMembersInjector.injectMembers(contactblockdialog);
    }

    public final void inject(ContactBlockedDialog contactblockeddialog)
    {
        contactBlockedDialogMembersInjector.injectMembers(contactblockeddialog);
    }

    public final void inject(ContactRemoveConfirmDialog contactremoveconfirmdialog)
    {
        contactRemoveConfirmDialogMembersInjector.injectMembers(contactremoveconfirmdialog);
    }

    public final void inject(ContactRequestDeclineDialog contactrequestdeclinedialog)
    {
        contactRequestDeclineDialogMembersInjector.injectMembers(contactrequestdeclinedialog);
    }

    public final void inject(EditPropertyFragment editpropertyfragment)
    {
        editPropertyFragmentMembersInjector.injectMembers(editpropertyfragment);
    }

    public final void inject(RecentItemMenuDialog recentitemmenudialog)
    {
        recentItemMenuDialogMembersInjector.injectMembers(recentitemmenudialog);
    }

    public final void inject(RecentRemoveHistoryDialog recentremovehistorydialog)
    {
        recentRemoveHistoryDialogMembersInjector.injectMembers(recentremovehistorydialog);
    }

    public final void inject(AccountBlockedDialogFragment accountblockeddialogfragment)
    {
        accountBlockedDialogFragmentMembersInjector.injectMembers(accountblockeddialogfragment);
    }

    public final void inject(AlreadyMergedDialog alreadymergeddialog)
    {
        alreadyMergedDialogMembersInjector.injectMembers(alreadymergeddialog);
    }

    public final void inject(PotentiallyMSACredentialsDialog potentiallymsacredentialsdialog)
    {
        potentiallyMSACredentialsDialogMembersInjector.injectMembers(potentiallymsacredentialsdialog);
    }

    public final void inject(UpdateMandatoryDialog updatemandatorydialog)
    {
        updateMandatoryDialogMembersInjector.injectMembers(updatemandatorydialog);
    }

    public final void inject(UpdateOptionalDialog updateoptionaldialog)
    {
        updateOptionalDialogMembersInjector.injectMembers(updateoptionaldialog);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/DaggerSkypeDialogFragmentComponent.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
