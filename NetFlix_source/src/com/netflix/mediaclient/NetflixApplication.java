// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient;

import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.UserInputManager;
import com.netflix.mediaclient.event.UIEvent;
import com.netflix.mediaclient.repository.SecurityRepository;
import com.netflix.mediaclient.repository.UserLocale;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.logging.error.ErrorLoggingManager;
import com.netflix.mediaclient.ui.LaunchActivity;
import com.netflix.mediaclient.util.AndroidManifestUtils;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.gfx.BitmapLruCache;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient:
//            Log

public class NetflixApplication extends Application
{

    public static final String LOAD_TAG = "NflxLoading";
    private static final int SO_FAILED_T0_LOAD = 2000;
    private static final int SO_LOADING_CLASS_NOT_FOUND = 2003;
    private static final int SO_LOADING_GENERIC_ERROR = 2004;
    private static final int SO_LOADING_UNSATISFIED_LINK = 2002;
    private static final int SO_VERSION_MISMATCH = 2001;
    private static final String TAG = "NetflixApplication";
    private static final String TAG_LOCALE = "nf_locale";
    private final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {

        final NetflixApplication this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (Log.isLoggable("NetflixApplication", 2))
            {
                Log.v("NetflixApplication", (new StringBuilder()).append("Received intent ").append(intent).toString());
            }
            context = intent.getAction();
            if ("com.netflix.mediaclient.intent.action.NETFLIX_SERVICE_DESTROYED".equals(context))
            {
                Log.d("NetflixApplication", "Netflix service is destroyed");
                mIsNetflixServiceReady.set(false);
            } else
            {
                if ("com.netflix.mediaclient.intent.action.NETFLIX_SERVICE_INIT_COMPLETE".equals(context))
                {
                    int i = intent.getIntExtra("status_code", -1);
                    if (Log.isLoggable("NetflixApplication", 3))
                    {
                        Log.d("NetflixApplication", (new StringBuilder()).append("Netflix service is ready with status ").append(i).toString());
                    }
                    if (NetflixService.isServiceReady(i))
                    {
                        Log.d("NetflixApplication", " Netflix application is ready");
                        mIsNetflixServiceReady.set(true);
                        return;
                    } else
                    {
                        Log.d("NetflixApplication", " Netflix application is NOT ready");
                        mIsNetflixServiceReady.set(false);
                        return;
                    }
                }
                if (Log.isLoggable("NetflixApplication", 3))
                {
                    Log.d("NetflixApplication", (new StringBuilder()).append("We do not support action ").append(context).toString());
                    return;
                }
            }
        }

            
            {
                this$0 = NetflixApplication.this;
                super();
            }
    };
    private NetflixActivity currentActivity;
    private BitmapLruCache mBitmapCache;
    private final AtomicBoolean mIsNetflixServiceReady = new AtomicBoolean(false);
    private String mServiceLocale;
    private boolean mSignedUpOnce;
    private UserInputManager mUserInput;

    public NetflixApplication()
    {
        mSignedUpOnce = false;
        mUserInput = new UserInputManager();
    }

    public static Intent createShowApplicationIntent(Context context)
    {
        return (new Intent(context, com/netflix/mediaclient/ui/LaunchActivity)).setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
    }

    private void loadAndVerifyNativeLibraries()
    {
        IllegalStateException illegalstateexception = null;
        SecurityRepository.loadLibraries(this);
        if (SecurityRepository.isLoaded()) goto _L2; else goto _L1
_L1:
        illegalstateexception = new IllegalStateException("Native libraries are missing!");
        IllegalStateException illegalstateexception1 = illegalstateexception;
        illegalstateexception1 = illegalstateexception;
        illegalstateexception1 = illegalstateexception;
        Log.e("NetflixApplication", "Failed to load JNI libraries. Report", illegalstateexception);
        IllegalStateException illegalstateexception2 = illegalstateexception;
        illegalstateexception2 = illegalstateexception;
        illegalstateexception2 = illegalstateexception;
        reportFailedToLoadNativeLibraries(illegalstateexception, 2000);
_L4:
        Object obj;
        int i;
        int j;
        if (illegalstateexception != null)
        {
            Log.e("NetflixApplication", "Crash happend, re-throw", illegalstateexception);
            throw illegalstateexception;
        } else
        {
            return;
        }
_L2:
        i = SecurityRepository.getLibraryVersion();
        j = AndroidManifestUtils.getVersionCode(this);
        if (Log.isLoggable("NetflixApplication", 3))
        {
            Log.d("NetflixApplication", (new StringBuilder()).append("Expected native library version: ").append(j).append(", real: ").append(i).toString());
        }
        if (i == j) goto _L4; else goto _L3
_L3:
        Log.e("NetflixApplication", "Versions do not match!");
        illegalstateexception = new IllegalStateException("Native library mismatch");
        IllegalStateException illegalstateexception3 = illegalstateexception;
        illegalstateexception3 = illegalstateexception;
        illegalstateexception3 = illegalstateexception;
        reportFailedToLoadNativeLibraries(illegalstateexception, 2001);
          goto _L4
        obj;
_L10:
        Log.e("NetflixApplication", "Failed to load JNI libraries. Report", ((Throwable) (obj)));
        reportFailedToLoadNativeLibraries(((Throwable) (obj)), 2002);
        throw obj;
        obj;
_L8:
        Log.e("NetflixApplication", "Failed to load JNI libraries. Report", ((Throwable) (obj)));
        reportFailedToLoadNativeLibraries(((Throwable) (obj)), 2003);
        throw obj;
        obj;
_L6:
        Log.e("NetflixApplication", "Failed to load JNI libraries. Generic error. Report", ((Throwable) (obj)));
        reportFailedToLoadNativeLibraries(((Throwable) (obj)), 2004);
        throw new RuntimeException(((Throwable) (obj)));
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        if (true) goto _L8; else goto _L7
_L7:
        obj;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void registerReceiver()
    {
        Log.d("NetflixApplication", "Register receiver");
        IntentFilter intentfilter = new IntentFilter("com.netflix.mediaclient.intent.action.NETFLIX_SERVICE_INIT_COMPLETE");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.NETFLIX_SERVICE_DESTROYED");
        intentfilter.addCategory("com.netflix.mediaclient.intent.category.NETFLIX_SERVICE");
        intentfilter.setPriority(999);
        try
        {
            LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver, intentfilter);
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("NetflixApplication", "Failed to register ", throwable);
        }
    }

    private void reportFailedToLoadNativeLibraries(Throwable throwable, int i)
    {
        Log.d("NetflixApplication", "Send warning notification!");
        throwable = getString(0x7f0c019e, new Object[] {
            Integer.valueOf(i)
        });
        Object obj = getString(0x7f0c019f, new Object[] {
            Integer.valueOf(i)
        });
        String s = getString(0x7f0c01a0, new Object[] {
            Integer.valueOf(i)
        });
        throwable = (new android.support.v4.app.NotificationCompat.Builder(this)).setOngoing(false).setOnlyAlertOnce(false).setSmallIcon(0x7f0200de).setWhen(System.currentTimeMillis()).setTicker(s).setContentTitle(throwable).setContentText(((CharSequence) (obj))).setAutoCancel(true);
        throwable.setContentIntent(PendingIntent.getActivity(this, 0, new Intent("android.intent.action.UNINSTALL_PACKAGE", Uri.parse("package:com.netflix.mediaclient")), 0x8000000));
        throwable = throwable.build();
        obj = (NotificationManager)getSystemService("notification");
        if (obj != null)
        {
            Log.d("NetflixApplication", "Send warning notification done started...");
            ((NotificationManager) (obj)).notify(1, throwable);
            Log.d("NetflixApplication", "Send warning notification done.");
            return;
        } else
        {
            Log.e("NetflixApplication", "Can not send warning, notification manager is null!");
            return;
        }
    }

    public NetflixActivity getCurrentActivity()
    {
        return currentActivity;
    }

    public BitmapLruCache getImageCache()
    {
        return mBitmapCache;
    }

    public UserInputManager getUserInput()
    {
        return mUserInput;
    }

    public boolean hasSignedUpOnce()
    {
        return mSignedUpOnce;
    }

    public boolean isReady()
    {
        return mIsNetflixServiceReady.get();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (Log.isLoggable("NetflixApplication", 3))
        {
            Log.d("NetflixApplication", "onConfigurationChanged");
        }
        refreshLocale(mServiceLocale);
    }

    public void onCreate()
    {
        super.onCreate();
        Log.d("NetflixApplication", "Application started");
        Log.d("NetflixApplication", "Load native libraries ");
        loadAndVerifyNativeLibraries();
        ErrorLoggingManager.init(this);
        registerActivityLifecycleCallbacks(mUserInput);
        registerReceiver();
    }

    public void onTrimMemory(int i)
    {
        super.onTrimMemory(i);
        Log.i("NetflixApplication", (new StringBuilder()).append("onTrimMemory: ").append(i).toString());
        if (i >= 60 && mBitmapCache != null)
        {
            Log.i("NetflixApplication", "Flushing BitmapCache");
            mBitmapCache.evictAll();
        }
    }

    public void publishEvent(UIEvent uievent)
    {
        throw new IllegalStateException("TODO: Not implemented - move this to netflixService");
    }

    public void refreshLocale(String s)
    {
        if (Log.isLoggable("nf_locale", 3))
        {
            Log.d("nf_locale", (new StringBuilder()).append("refreshLocale with language = ").append(s).toString());
        }
        if (s == null)
        {
            Log.d("nf_locale", "serviceLocale = null");
        } else
        {
            mServiceLocale = s;
            Object obj = (new UserLocale(mServiceLocale)).getLocale();
            s = Locale.getDefault();
            if (((Locale) (obj)).getLanguage().equals(s.getLanguage()) && (StringUtils.isEmpty(((Locale) (obj)).getCountry()) || ((Locale) (obj)).getCountry().equals(s.getCountry())))
            {
                if (Log.isLoggable("nf_locale", 3))
                {
                    Log.d("nf_locale", (new StringBuilder()).append("No need to refreshLocale: serviceLocale=").append(obj).append(" current Locale language=").append(s).toString());
                    return;
                }
            } else
            {
                if (Log.isLoggable("nf_locale", 4))
                {
                    Log.i("nf_locale", (new StringBuilder()).append("Changing language from ").append(s).append(" to ").append(obj).toString());
                }
                Locale.setDefault(((Locale) (obj)));
                s = new Configuration();
                s.locale = ((Locale) (obj));
                obj = getResources();
                if (obj == null)
                {
                    Log.w("nf_locale", "NA::refreshLocale: Resources are NULL. It should NOT happen!");
                    return;
                }
                android.util.DisplayMetrics displaymetrics = ((Resources) (obj)).getDisplayMetrics();
                if (displaymetrics == null)
                {
                    Log.w("nf_locale", "NA::refreshLocale: DisplayMetrics is NULL. It should NOT happen!");
                    return;
                }
                try
                {
                    ((Resources) (obj)).updateConfiguration(s, displaymetrics);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    Log.e("nf_locale", "NA::refreshLocale: Failed to update configuration", s);
                }
                return;
            }
        }
    }

    public void releaseCurrentActivity(NetflixActivity netflixactivity)
    {
        if (currentActivity != null && currentActivity.equals(netflixactivity))
        {
            currentActivity = null;
        }
    }

    public void setCurrentActivity(NetflixActivity netflixactivity)
    {
    }

    public void setImageCache(BitmapLruCache bitmaplrucache)
    {
        if (mBitmapCache != null)
        {
            Log.w("NetflixApplication", "ImageCache is set more than once!");
        }
        mBitmapCache = bitmaplrucache;
    }

    public void setSignedInOnce()
    {
        mSignedUpOnce = true;
    }

}
