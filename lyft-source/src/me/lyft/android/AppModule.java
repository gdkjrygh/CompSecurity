// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import android.accounts.AccountManager;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.google.gson.Gson;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.lyft.android.analytics.NetworkAnalyticsInterceptor;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.data.ContactsDatabaseHelper;
import me.lyft.android.development.StethoSupport;
import me.lyft.android.flows.ProfileFlow;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.googlenow.GoogleNowAuthenticationApi;
import me.lyft.android.jobs.JobManager;
import me.lyft.android.managers.DeepLinkManager;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.providers.ContactsProvider;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.utils.Navigator;
import me.lyft.android.utils.Telephony;
import me.lyft.android.utils.TextToSpeech;
import me.lyft.android.utils.Vibrator;

// Referenced classes of package me.lyft.android:
//            ILyftPreferences, AppStateHandler, UserSession, LyftApplication, 
//            LyftPreferences, IUserSession, IAppStateHandler

public class AppModule
{

    private static final String HTTP_CACHE_DIR = "okhttp";
    private static final long HTTP_CACHE_SIZE = 0x1400000L;
    private static final long HTTP_CONNECTION_TIMEOUT = 15L;
    private static final long HTTP_READ_TIMEOUT = 30L;
    private final Context appContext;

    AppModule(Context context)
    {
        appContext = context;
    }

    Cache getOkHttpClientCache()
    {
        return new Cache(new File(appContext.getCacheDir(), "okhttp"), 0x1400000L);
    }

    OkHttpClient okHttpClient(ILyftPreferences ilyftpreferences, IConstantsProvider iconstantsprovider, IDevice idevice)
    {
        OkHttpClient okhttpclient = new OkHttpClient();
        okhttpclient.setConnectTimeout(15L, TimeUnit.SECONDS);
        okhttpclient.setReadTimeout(30L, TimeUnit.SECONDS);
        okhttpclient.setProtocols(Arrays.asList(new Protocol[] {
            Protocol.HTTP_1_1, Protocol.HTTP_2
        }));
        okhttpclient.setCache(getOkHttpClientCache());
        StethoSupport.addStethoInterceptor(okhttpclient);
        okhttpclient.interceptors().add(new NetworkAnalyticsInterceptor(iconstantsprovider, idevice));
        if (ilyftpreferences.isProxyEnabled())
        {
            okhttpclient.setProxy(new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(ilyftpreferences.getProxyIpAddress(), 8888)));
        }
        return okhttpclient;
    }

    AccountManager provideAccountManager()
    {
        return AccountManager.get(appContext);
    }

    AlarmManager provideAlarmManager()
    {
        return (AlarmManager)appContext.getSystemService("alarm");
    }

    IAppStateHandler provideAppStateHandler(IUserSession iusersession)
    {
        return new AppStateHandler(iusersession);
    }

    AudioManager provideAudioManager()
    {
        return (AudioManager)appContext.getSystemService("audio");
    }

    ConnectivityManager provideConnectivityManager()
    {
        return (ConnectivityManager)appContext.getSystemService("connectivity");
    }

    ContactsDatabaseHelper provideContactsDatabaseHelper()
    {
        return new ContactsDatabaseHelper(appContext);
    }

    ContactsProvider provideContactsProvider(ContentResolver contentresolver)
    {
        return new ContactsProvider(contentresolver);
    }

    ContentResolver provideContentResolver()
    {
        return appContext.getContentResolver();
    }

    DeepLinkManager provideDeepLinkManager(AppFlow appflow, IUserSession iusersession, JobManager jobmanager, ProfileFlow profileflow, DialogFlow dialogflow)
    {
        return new DeepLinkManager(appflow, iusersession, jobmanager, profileflow, dialogflow);
    }

    com.google.android.gms.common.api.GoogleApiClient.Builder provideGoogleApiClientBuilder()
    {
        return new com.google.android.gms.common.api.GoogleApiClient.Builder(appContext);
    }

    GoogleNowAuthenticationApi provideGoogleNowAuthenticationApi(OkHttpClient okhttpclient, Gson gson)
    {
        return new GoogleNowAuthenticationApi(okhttpclient, gson);
    }

    Gson provideGson()
    {
        return new Gson();
    }

    Handler provideHandler()
    {
        return new Handler(Looper.getMainLooper());
    }

    IUserSession provideIUserSession(MessageBus messagebus, ILyftPreferences ilyftpreferences, JobManager jobmanager)
    {
        return new UserSession(messagebus, ilyftpreferences, jobmanager);
    }

    ImageLoader provideImageLoader(OkHttpClient okhttpclient)
    {
        okhttpclient = (new com.squareup.picasso.Picasso.Builder(appContext)).downloader(new OkHttpDownloader(okhttpclient)).build();
        okhttpclient.setIndicatorsEnabled(false);
        return new ImageLoader(okhttpclient);
    }

    InputMethodManager provideInputMethodManager()
    {
        return (InputMethodManager)appContext.getSystemService("input_method");
    }

    LyftApplication provideLyftApplication()
    {
        return (LyftApplication)appContext;
    }

    MessageBus provideMessageBus()
    {
        return new MessageBus();
    }

    NotificationManager provideNotificationManager()
    {
        return (NotificationManager)appContext.getSystemService("notification");
    }

    PackageManager providePackageManager()
    {
        return appContext.getPackageManager();
    }

    ILyftPreferences providePreferences(LyftApplication lyftapplication, Gson gson)
    {
        return new LyftPreferences(lyftapplication, gson);
    }

    Resources provideResources()
    {
        return appContext.getResources();
    }

    TelephonyManager provideTelephonyManager()
    {
        return (TelephonyManager)appContext.getSystemService("phone");
    }

    TextToSpeech provideTextToSpeech()
    {
        return new TextToSpeech(appContext);
    }

    Vibrator provideVibrator()
    {
        return new Vibrator(appContext);
    }

    WindowManager provideWindowManager()
    {
        return (WindowManager)appContext.getSystemService("window");
    }

    Navigator providesNavigator(ILyftPreferences ilyftpreferences)
    {
        return new Navigator(appContext, ilyftpreferences);
    }

    Telephony providesNewTelephony()
    {
        return new Telephony(appContext);
    }
}
