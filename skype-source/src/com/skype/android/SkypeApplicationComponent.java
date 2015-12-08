// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.Account;
import com.skype.SkyLib;
import com.skype.Translator;
import com.skype.android.ads.AdManager;
import com.skype.android.ads.AdPlacer;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsInAppObserver;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.analytics.SessionReporter;
import com.skype.android.app.BackgroundMode;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.calling.CallAgent;
import com.skype.android.app.calling.CallQualityFeedbackManager;
import com.skype.android.app.calling.OngoingNotificationsManager;
import com.skype.android.app.chat.ChatServiceMonitor;
import com.skype.android.app.chat.NotificationRouter;
import com.skype.android.app.chat.picker.MRUManager;
import com.skype.android.app.media.UrlPreviewMediaAgent;
import com.skype.android.app.mnv.MnvManager;
import com.skype.android.app.shortcircuit.PromotedSCDContactsManager;
import com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient;
import com.skype.android.app.token.SkypeTokenAccess;
import com.skype.android.app.transfer.TransferQueue;
import com.skype.android.app.wear.WearDataRequestCache;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.crash.CrashReporter;
import com.skype.android.event.EventBus;
import com.skype.android.inject.AccountProvider;
import com.skype.android.inject.ApplicationComponent;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.push.PushHandlingHelper;
import com.skype.android.push.PushManager;
import com.skype.android.push.PushMessageRepository;
import com.skype.android.push.SkypePushListener;
import com.skype.android.res.ChatText;
import com.skype.android.res.CountryFlags;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.res.Sounds;
import com.skype.android.res.Urls;
import com.skype.android.res.Vibration;
import com.skype.android.ringtone.RingtoneStorage;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.skylib.PcmHostCallback;
import com.skype.android.skylib.SkyLibInitializer;
import com.skype.android.sync.ContactsIngestManager;
import com.skype.android.telemetry.SCTManager;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.text.TypeFaceTextStyleCallback;
import com.skype.android.update.UpdateManager;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.ServerClock;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.SpanUtil;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.ViewStateManager;
import com.skype.android.util.cache.ContactMoodCache;
import com.skype.android.util.cache.FormattedMessageCache;
import com.skype.android.util.cache.SpannedStringCache;
import com.skype.android.util.permission.PermissionRequestStorage;
import com.skype.android.wakeup.DreamKeeper;
import com.skype.android.wakeup.ForegroundState;
import com.skype.pcmhost.PcmHost;
import com.skype.telemetry.TelemetryProviderFactory;
import com.skype.telemetry.sdk.FlurryAccessInterface;

// Referenced classes of package com.skype.android:
//            SkypeApplication

public interface SkypeApplicationComponent
    extends ApplicationComponent
{
    public static interface ComponentProvider
    {

        public abstract SkypeApplicationComponent a();
    }


    public abstract Account account();

    public abstract AccountProvider accountProvider();

    public abstract AdManager adManager();

    public abstract AdPlacer adPlacer();

    public abstract Analytics analytics();

    public abstract AnalyticsInAppObserver analyticsInAppObserver();

    public abstract ApplicationConfig applicationConfig();

    public abstract AsyncService asyncService();

    public abstract BackgroundMode backgroundMode();

    public abstract CallAgent callAgent();

    public abstract CallQualityFeedbackManager callQualityFeedbackManager();

    public abstract ChatServiceMonitor chatServiceMonitor();

    public abstract ChatText chatText();

    public abstract ContactMoodCache contactMoodCache();

    public abstract ContactsIngestManager contactsIngestManager();

    public abstract CountryFlags countryFlags();

    public abstract CrashReporter crashReporter();

    public abstract DefaultAvatars defaultAvatars();

    public abstract DreamKeeper dreamKeeper();

    public abstract EcsClient ecsClient();

    public abstract EcsConfiguration ecsConfiguration();

    public abstract EventBus eventBus();

    public abstract FlurryAccessInterface flurryAccess();

    public abstract ForegroundState foregroundState();

    public abstract FormattedMessageCache formattedMessageCache();

    public abstract AnalyticsPersistentStorage getAnalyticsPersistentStorage();

    public abstract PermissionRequestStorage getPermissionRequestStorage();

    public abstract RingtoneStorage getRingtoneStorage();

    public abstract Translator getTranslator();

    public abstract HttpUtil httpUtil();

    public abstract ImageCache imageCache();

    public abstract void inject(SkypeApplication skypeapplication);

    public abstract LayoutExperience layoutExperience();

    public abstract MediaContentRoster mediaContentRoster();

    public abstract MnvManager mnvManager();

    public abstract MRUManager mruManager();

    public abstract NetworkUtil networkUtil();

    public abstract NotificationRouter notificationRendererFactory();

    public abstract ObjectIdMap objectIdMap();

    public abstract OngoingNotificationsManager ongoingNotificationsManager();

    public abstract PcmHost pcmHost();

    public abstract PcmHostCallback pcmHostCallback();

    public abstract PromotedSCDContactsManager promotedSCDContactsManager();

    public abstract PushHandlingHelper pushHandlingHelper();

    public abstract PushManager pushManager();

    public abstract PushMessageRepository pushMessageRepository();

    public abstract SCTManager sctManager();

    public abstract ServerClock serverClock();

    public abstract SessionReporter sessionReporter();

    public abstract ShortCircuitProfileWebClient shortCircuitProfileWebClient();

    public abstract SignInDurationReporter signInDurationReporter();

    public abstract SkyLib skyLib();

    public abstract SkyLibInitializer skyLibInitializer();

    public abstract SkypePushListener skypePushListener();

    public abstract SkypeTokenAccess skypeTokenAccess();

    public abstract Sounds sounds();

    public abstract SpanUtil spanUtil();

    public abstract SpannedStringCache spannedStringCache();

    public abstract TelemetryProviderFactory telemetryProviderFactory();

    public abstract TimeAnomalyTelemetry timeAnomalyTelemetry();

    public abstract TransferQueue transferQueue();

    public abstract TypeFaceFactory typeFaceFactory();

    public abstract TypeFaceTextStyleCallback typeFaceStyleCallback();

    public abstract UpdateManager updateManager();

    public abstract UrlPreviewMediaAgent urlPreviewMediaAgent();

    public abstract Urls urls();

    public abstract Vibration vibration();

    public abstract ViewStateManager viewStateManager();

    public abstract WearDataRequestCache wearDataRequestCache();
}
