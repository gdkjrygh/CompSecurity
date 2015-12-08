// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.accounts.AccountManager;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.util.LruCache;
import android.telephony.TelephonyManager;
import com.appboy.a;
import com.facebook.s;
import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.api.legacy.model.ScModelManager;
import com.soundcloud.android.cast.CastConnectionHelper;
import com.soundcloud.android.cast.CastPlayer;
import com.soundcloud.android.cast.DefaultCastConnectionHelper;
import com.soundcloud.android.cast.NoOpCastConnectionHelper;
import com.soundcloud.android.collections.CollectionNavigationTarget;
import com.soundcloud.android.creators.record.SoundRecorder;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.image.ImageProcessor;
import com.soundcloud.android.image.ImageProcessorCompat;
import com.soundcloud.android.image.ImageProcessorJB;
import com.soundcloud.android.main.MainActivity;
import com.soundcloud.android.main.NavigationModel;
import com.soundcloud.android.offline.OfflinePlaybackOperations;
import com.soundcloud.android.playback.CastPlaybackStrategy;
import com.soundcloud.android.playback.DefaultPlaybackStrategy;
import com.soundcloud.android.playback.FallbackRemoteAudioManager;
import com.soundcloud.android.playback.IRemoteAudioManager;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.playback.PlaySessionStateProvider;
import com.soundcloud.android.playback.PlaybackStrategy;
import com.soundcloud.android.playback.RemoteAudioManager;
import com.soundcloud.android.playback.notification.BigNotificationBuilder;
import com.soundcloud.android.playback.notification.MediaStyleNotificationBuilder;
import com.soundcloud.android.playback.notification.NotificationBuilder;
import com.soundcloud.android.playback.notification.RichNotificationBuilder;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.rx.ScSchedulers;
import com.soundcloud.android.search.DiscoveryNavigationTarget;
import com.soundcloud.android.stream.StreamNavigationTarget;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.you.YouNavigationTarget;
import com.soundcloud.rx.eventbus.DefaultEventBus;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.Lazy;
import java.util.Locale;
import rx.R;

// Referenced classes of package com.soundcloud.android:
//            SoundCloudApplication, SmoothNavigator, Navigator, ServiceInitiator

public class ApplicationModule
{

    public static final String HIGH_PRIORITY = "HighPriority";
    public static final String LOW_PRIORITY = "LowPriority";
    public static final String MAIN_LOOPER = "MainLooper";
    private final SoundCloudApplication application;

    public ApplicationModule(SoundCloudApplication soundcloudapplication)
    {
        application = soundcloudapplication;
    }

    public NavigationModel navigationModel()
    {
        return new NavigationModel(new com.soundcloud.android.main.NavigationModel.Target[] {
            new StreamNavigationTarget(), new DiscoveryNavigationTarget(), new CollectionNavigationTarget(), new YouNavigationTarget()
        });
    }

    public AccountManager provideAccountManager()
    {
        return AccountManager.get(application);
    }

    public AlarmManager provideAlarmManager()
    {
        return (AlarmManager)application.getSystemService("alarm");
    }

    public AppWidgetManager provideAppWidgetManager(Context context)
    {
        return AppWidgetManager.getInstance(context);
    }

    public a provideAppboy(Context context)
    {
        return a.a(context);
    }

    public SoundCloudApplication provideApplication()
    {
        return application;
    }

    public CastConnectionHelper provideCastConnectionHelper(Context context, FeatureFlags featureflags, ApplicationProperties applicationproperties)
    {
        if ("Dalvik".equals(System.getProperty("java.vm.name")))
        {
            return new DefaultCastConnectionHelper(provideVideoCastManager(context, applicationproperties));
        } else
        {
            return new NoOpCastConnectionHelper();
        }
    }

    public ConnectivityManager provideConnectivityManager()
    {
        return (ConnectivityManager)application.getSystemService("connectivity");
    }

    public Context provideContext()
    {
        return application;
    }

    public SharedPreferences provideDefaultSharedPreferences()
    {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

    public EventBus provideEventBus()
    {
        return new DefaultEventBus(rx.a.b.a.a());
    }

    public s provideFacebookSdk()
    {
        return new s();
    }

    public R provideHighPriorityScheduler()
    {
        return ScSchedulers.HIGH_PRIO_SCHEDULER;
    }

    public ImageProcessor provideImageProcessor(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            return new ImageProcessorJB(context);
        } else
        {
            return new ImageProcessorCompat();
        }
    }

    public LocalBroadcastManager provideLocalBroadcastManager()
    {
        return LocalBroadcastManager.getInstance(application);
    }

    public R provideLowPriorityScheduler()
    {
        return ScSchedulers.LOW_PRIO_SCHEDULER;
    }

    public ScModelManager provideModelManager()
    {
        return new ScModelManager(application);
    }

    public Navigator provideNavigator(FeatureFlags featureflags)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return new SmoothNavigator(featureflags);
        } else
        {
            return new Navigator(featureflags);
        }
    }

    public android.support.v4.app.NotificationCompat.Builder provideNotificationBuilder(Context context)
    {
        return new android.support.v4.app.NotificationCompat.Builder(context);
    }

    public NotificationManager provideNotificationManager()
    {
        return (NotificationManager)application.getSystemService("notification");
    }

    public CondensedNumberFormatter provideNumberFormatter()
    {
        return CondensedNumberFormatter.create(Locale.getDefault(), application.getResources());
    }

    public PlaybackStrategy providePlaybackStrategy(ServiceInitiator serviceinitiator, CastConnectionHelper castconnectionhelper, PlayQueueManager playqueuemanager, Lazy lazy, TrackRepository trackrepository, AdsOperations adsoperations, OfflinePlaybackOperations offlineplaybackoperations, 
            PlaySessionStateProvider playsessionstateprovider, EventBus eventbus)
    {
        if (castconnectionhelper.isCasting())
        {
            return new CastPlaybackStrategy((CastPlayer)lazy.a());
        } else
        {
            return new DefaultPlaybackStrategy(playqueuemanager, serviceinitiator, trackrepository, adsoperations, offlineplaybackoperations, playsessionstateprovider, eventbus);
        }
    }

    public PowerManager providePowerManager()
    {
        return (PowerManager)application.getSystemService("power");
    }

    public IRemoteAudioManager provideRemoteAudioManager(Context context)
    {
        RemoteAudioManager remoteaudiomanager;
        try
        {
            remoteaudiomanager = new RemoteAudioManager(context);
        }
        catch (Exception exception)
        {
            ErrorUtils.handleSilentException("Could not create remote audio manager", exception);
            return new FallbackRemoteAudioManager(context);
        }
        return remoteaudiomanager;
    }

    public Resources provideResources()
    {
        return application.getResources();
    }

    public SoundRecorder provideSoundRecorder()
    {
        return SoundRecorder.getInstance(application);
    }

    public TelephonyManager provideTelephonyManager()
    {
        return (TelephonyManager)application.getSystemService("phone");
    }

    public VideoCastManager provideVideoCastManager(Context context, ApplicationProperties applicationproperties)
    {
        context = VideoCastManager.initialize(context, applicationproperties.getCastReceiverAppId(), com/soundcloud/android/main/MainActivity, "urn:x-cast:com.soundcloud.cast.sender");
        context.enableFeatures(15);
        return context;
    }

    public LruCache provideWaveformCache()
    {
        return new LruCache(20);
    }

    public WifiManager provideWifiManager()
    {
        return (WifiManager)application.getSystemService("wifi");
    }

    public Looper providesMainLooper()
    {
        return Looper.getMainLooper();
    }

    public NotificationBuilder providesNotificationBuilderWrapper(Context context, ApplicationProperties applicationproperties, com.soundcloud.android.playback.views.NotificationPlaybackRemoteViews.Factory factory, ImageOperations imageoperations)
    {
        if (applicationproperties.shouldUseMediaStyleNotifications())
        {
            return new MediaStyleNotificationBuilder(context, imageoperations);
        }
        if (applicationproperties.shouldUseBigNotifications())
        {
            return new BigNotificationBuilder(context, factory, imageoperations);
        } else
        {
            return new RichNotificationBuilder(context, factory, imageoperations);
        }
    }
}
