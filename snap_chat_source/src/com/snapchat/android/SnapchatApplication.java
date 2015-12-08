// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import AS;
import Ab;
import Bt;
import Cl;
import DW;
import Ei;
import IK;
import Jd;
import Jx;
import KO;
import KS;
import Kl;
import LA;
import LH;
import LL;
import Ll;
import Lm;
import Ln;
import Lx;
import PG;
import Zf;
import anK;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.media.CamcorderProfile;
import android.os.HandlerThread;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebView;
import cG;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.Constants;
import com.snapchat.android.analytics.framework.UniqueDeviceIdBuilder;
import com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.debug.ScApplicationInfo;
import com.squareup.otto.Bus;
import ds;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import kG;
import kT;
import ko;
import kp;
import kq;
import mB;
import rC;
import sX;
import uL;
import uQ;
import vJ;
import wm;

// Referenced classes of package com.snapchat.android:
//            Timber

public class SnapchatApplication extends cG
{
    public static interface a
    {

        public abstract void a(Context context, Thread thread, Throwable throwable);
    }


    private static final int RESET_TRANSCODING_VERSION_CODE = 850;
    private static final String TAG = "SnapchatApplication";
    static List sCrashables = new LinkedList();
    protected static SnapchatApplication sCurrentInstance;
    protected static boolean sTestRunning = false;
    private final Application appContext;
    public kG mAdManager;
    private final BlizzardEventLogger mAnalyticsEventLogger = BlizzardEventLogger.a();
    public ko mAppInstallLogger;
    private final kp mBatteryMonitor = kp.a();
    private final anK mBilling;
    protected Ll mDIApplicationComponent;
    private Lx mDebugCrashReporter;
    public LA mDeveloperSettings;
    public rC mDeviceVideoEncodingResolutionSet;
    public wm mDiscoverBrandIconProvider;
    public uL mDiscoverMediaManager;
    public vJ mDiscoverRepository;
    private final kq mMemoryMonitor = kq.a();
    public ReleaseManager mReleaseManager;
    public mB mScreenDimensionProvider;
    public KO mSlightlySecurePreferences;
    public Ei mSnapchatServiceManager;
    public sX mStoryLoader;
    public LL mStrictModeHelper;
    protected Jd sStartupContext;

    public SnapchatApplication(Application application)
    {
        sStartupContext = Jd.a();
        mDebugCrashReporter = new Lx();
        appContext = application;
        mBilling = new anK(appContext, new anK.c() {

            public final String a()
            {
                return (new StringBuilder()).append("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAk/YXM8bdK/SW70w9ops9DVOVNlBUWBjggIMRgS8j89dWI4wkSFfMo").append("X9gIMPMQTTXUd+6J4qgUmf4lS0PNd9ToTJVZ5IoYEta/hhSypX3SSeydxqwJQAA3SgwuARSHUT7qAHFlh1PpZtmfv20hJB7D").append("KzWBIDO5uFC5FhJHI+QoDbqOpOExZDYReOkfVQ5ck/8LkbFexvXIC5869gSUVTVVZy/wynHavnB6EtWzCIdK9zijYjEkk+mg").append("YCOWQmn0C5iM2pE3bNpD2fr5pFcuvX2tUeWtcIT0vgzOGBvO589iIVQBJdebMiPsYxa85uW1BNWThrgfpNmFB6Qk9ZsSrudH").append("wIDAQAB").toString();
            }

        });
    }

    public static void addCrashableListener(a a1)
    {
        sCrashables.add(new WeakReference(a1));
    }

    private void checkForAppVersionChange()
    {
        int i = ScApplicationInfo.c(appContext);
        int j = Bt.l();
        if (i != j)
        {
            versionChangeDetected();
            Bt.a(i);
            resetTranscodingState(i, j);
        }
    }

    public static Application get()
    {
        return sCurrentInstance.appContext;
    }

    public static anK getBilling()
    {
        return sCurrentInstance.mBilling;
    }

    public static Ll getDIComponent()
    {
        return sCurrentInstance.mDIApplicationComponent;
    }

    private void initializeCrashHandlers()
    {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler()) {

            private Thread.UncaughtExceptionHandler a;
            private SnapchatApplication b;

            public final void uncaughtException(Thread thread, Throwable throwable)
            {
                Iterator iterator = SnapchatApplication.sCrashables.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    a a1 = (a)((WeakReference)iterator.next()).get();
                    if (a1 != null)
                    {
                        a1.a(b.appContext, thread, throwable);
                    }
                } while (true);
                a.uncaughtException(thread, throwable);
            }

            
            {
                b = SnapchatApplication.this;
                a = uncaughtexceptionhandler;
                super();
            }
        });
    }

    private void initializeDeviceId()
    {
        if (Bt.bG() == null)
        {
            new UniqueDeviceIdBuilder();
            Bt.a(UniqueDeviceIdBuilder.a(appContext));
        }
    }

    public static boolean isTestRunning()
    {
        return sTestRunning;
    }

    private void resetTranscodingState(int i, int j)
    {
        if (j < 850 && i >= 850)
        {
            TranscodingPreferencesWrapper transcodingpreferenceswrapper = TranscodingPreferencesWrapper.a();
            if (TranscodingPreferencesWrapper.e() == com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper.TranscodingEnabled.DISABLED)
            {
                transcodingpreferenceswrapper.a(com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper.TranscodingEnabled.UNKNOWN);
            }
        }
    }

    private void versionChangeDetected()
    {
        Timber.c("SnapchatApplication", "app upgrade detected", new Object[0]);
        new LH();
        Bt.r(false);
    }

    public void buildComponentAndInject()
    {
        Lm.a a1 = Lm.c();
        a1.androidModule = new KS(appContext);
        if (a1.androidModule == null)
        {
            throw new IllegalStateException("androidModule must be set");
        }
        if (a1.discoverModule == null)
        {
            a1.discoverModule = new Ln();
        }
        mDIApplicationComponent = new Lm(a1, (byte)0);
        mDIApplicationComponent.a(this);
    }

    public void onCreate()
    {
        Object obj;
        Object obj1;
        Object obj3;
        int i;
        System.setProperty("org.joda.time.DateTimeZone.Provider", "com.snapchat.android.util.DateTimeZoneProvider");
        obj = ReleaseManager.a();
        obj1 = ScApplicationInfo.b(appContext);
        if (((String) (obj1)).equals("") || isTestRunning())
        {
            obj.mReleaseMode = com.snapchat.android.util.debug.ReleaseManager.ReleaseMode.PRODUCTION;
        } else
        {
            obj1 = ((String) (obj1)).toUpperCase(Locale.US);
            if (((String) (obj1)).contains("DEBUG") || ((String) (obj1)).contains("PROFILE"))
            {
                obj.mReleaseMode = com.snapchat.android.util.debug.ReleaseManager.ReleaseMode.DEBUG;
            } else
            if (((String) (obj1)).contains("PERF"))
            {
                obj.mReleaseMode = com.snapchat.android.util.debug.ReleaseManager.ReleaseMode.PERF;
            } else
            if (((String) (obj1)).contains("ALPHA") || ((String) (obj1)).contains("UIAUTOMATION") || ((String) (obj1)).contains("MASTER") || ((String) (obj1)).contains("WILDCARD"))
            {
                obj.mReleaseMode = com.snapchat.android.util.debug.ReleaseManager.ReleaseMode.ALPHA;
            } else
            if (((String) (obj1)).contains("BETA"))
            {
                obj.mReleaseMode = com.snapchat.android.util.debug.ReleaseManager.ReleaseMode.BETA;
            } else
            {
                obj.mReleaseMode = com.snapchat.android.util.debug.ReleaseManager.ReleaseMode.PRODUCTION;
            }
        }
        obj = kT.a();
        obj.mContext = appContext;
        PG.b(new kT._cls1(((kT) (obj))));
        sStartupContext.a(Jd.a.APPLICATION_CREATE_CHECKPOINT$6dad94c5);
        super.onCreate();
        sCurrentInstance = this;
        buildComponentAndInject();
        Ab.a(appContext);
        mDiscoverBrandIconProvider.a = new Jx(appContext);
        obj = mDiscoverRepository;
        obj.f = appContext;
        ((vJ) (obj)).c.start();
        ((vJ) (obj)).d.c(obj);
        obj.e = new vJ._cls1(((vJ) (obj)), ((vJ) (obj)).c.getLooper());
        obj = mDiscoverMediaManager;
        ((uL) (obj)).e.a(((AR) (obj)));
        for (obj = ((uL) (obj)).b.iterator(); ((Iterator) (obj)).hasNext(); ((uQ)((Iterator) (obj)).next()).a()) { }
        obj1 = mScreenDimensionProvider;
        Object obj2 = appContext;
        int j;
        long l;
        if (CamcorderProfile.hasProfile(1))
        {
            obj = CamcorderProfile.get(1);
        } else
        if (CamcorderProfile.hasProfile(0))
        {
            obj = CamcorderProfile.get(0);
        } else
        {
            obj = null;
        }
        obj3 = ((Context) (obj2)).getResources().getDisplayMetrics();
        if (((DisplayMetrics) (obj3)).heightPixels > ((DisplayMetrics) (obj3)).widthPixels)
        {
            obj1.mDisplayMetricsHeight = ((DisplayMetrics) (obj3)).heightPixels;
            obj1.mDisplayMetricsWidth = ((DisplayMetrics) (obj3)).widthPixels;
        } else
        {
            obj1.mDisplayMetricsHeight = ((DisplayMetrics) (obj3)).widthPixels;
            obj1.mDisplayMetricsWidth = ((DisplayMetrics) (obj3)).heightPixels;
        }
        if (obj != null)
        {
            if (((CamcorderProfile) (obj)).videoFrameHeight > ((CamcorderProfile) (obj)).videoFrameWidth)
            {
                i = ((CamcorderProfile) (obj)).videoFrameHeight;
                j = ((CamcorderProfile) (obj)).videoFrameWidth;
            } else
            {
                i = ((CamcorderProfile) (obj)).videoFrameWidth;
                j = ((CamcorderProfile) (obj)).videoFrameHeight;
            }
        } else
        {
            i = 0x7fffffff;
            j = 0x7fffffff;
        }
        obj1.mResolution = new IK(((mB) (obj1)).mDisplayMetricsWidth, ((mB) (obj1)).mDisplayMetricsHeight);
        obj1.mMaxVideoHeight = Math.min(((mB) (obj1)).mDisplayMetricsHeight, i);
        obj1.mMaxVideoWidth = Math.min(((mB) (obj1)).mDisplayMetricsWidth, j);
        obj = ((Context) (obj2)).getResources().getDisplayMetrics();
        obj2 = ((WindowManager)((Context) (obj2)).getSystemService("window")).getDefaultDisplay();
        if (android.os.Build.VERSION.SDK_INT >= 14 && android.os.Build.VERSION.SDK_INT < 17)
        {
            try
            {
                obj1.mScreenFullWidthPx = ((Integer)android/view/Display.getMethod("getRawWidth", new Class[0]).invoke(obj2, new Object[0])).intValue();
                obj1.mScreenFullHeightPx = ((Integer)android/view/Display.getMethod("getRawHeight", new Class[0]).invoke(obj2, new Object[0])).intValue();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj3)
            {
                Timber.c("ScreenParameterProvider", "Exception in getRawWidth function in Display.class", new Object[0]);
            }
        }
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            break MISSING_BLOCK_LABEL_666;
        }
        obj3 = new Point();
        android/view/Display.getMethod("getRealSize", new Class[] {
            android/graphics/Point
        }).invoke(obj2, new Object[] {
            obj3
        });
        if (((Point) (obj3)).x >= ((Point) (obj3)).y)
        {
            break MISSING_BLOCK_LABEL_1293;
        }
        obj1.mScreenFullWidthPx = ((Point) (obj3)).x;
        obj1.mScreenFullHeightPx = ((Point) (obj3)).y;
_L1:
        if (((mB) (obj1)).mScreenFullHeightPx == -1 || ((mB) (obj1)).mScreenFullWidthPx == -1)
        {
            obj1.mScreenFullHeightPx = ((mB) (obj1)).mDisplayMetricsHeight;
            obj1.mScreenFullWidthPx = ((mB) (obj1)).mDisplayMetricsWidth;
        }
        obj1.mScreenFullWidthIn = (float)((mB) (obj1)).mScreenFullWidthPx / ((DisplayMetrics) (obj)).xdpi;
        obj1.mScreenFullHeightIn = (float)((mB) (obj1)).mScreenFullHeightPx / ((DisplayMetrics) (obj)).ydpi;
        Timber.c("ScreenParameterProvider", (new StringBuilder("Sending screen parameters to server: ")).append(ds.a(obj1).a("mScreenFullHeightPx", ((mB) (obj1)).mScreenFullHeightPx).a("mScreenFullWidthPx", ((mB) (obj1)).mScreenFullWidthPx).a("mScreenFullHeightIn", ((mB) (obj1)).mScreenFullHeightIn).a("mScreenFullWidthIn", ((mB) (obj1)).mScreenFullWidthIn).toString()).toString(), new Object[0]);
        Timber.b("ScreenParameterProvider", "Computed screen parameter values: height=%d, width=%d, maxVideoHeight=%d, maxVideoWidth=%d", new Object[] {
            Integer.valueOf(((mB) (obj1)).mResolution.b()), Integer.valueOf(((mB) (obj1)).mResolution.a()), Integer.valueOf(((mB) (obj1)).mMaxVideoHeight), Integer.valueOf(((mB) (obj1)).mMaxVideoWidth)
        });
        if (!isTestRunning())
        {
            mAdManager.a(appContext, mScreenDimensionProvider.mMaxVideoHeight, mScreenDimensionProvider.mMaxVideoWidth);
        }
        mDeviceVideoEncodingResolutionSet.a(appContext);
        obj = mMemoryMonitor;
        appContext.registerComponentCallbacks(((kq) (obj)).c);
        obj = mBatteryMonitor;
        obj1 = appContext;
        Timber.c("ApplicationBatteryMonitor", "Monitoring application", new Object[0]);
        obj.d = ((Application) (obj1)).getApplicationContext();
        ((kp) (obj)).a(((kp) (obj)).d.registerReceiver(((kp) (obj)).b, kp.a));
        obj1 = Cl.a();
        ((Cl) (obj1)).a(new kp._cls2(((kp) (obj)), ((Cl) (obj1))));
        ((kp) (obj)).a(((Cl) (obj1)));
        mDeveloperSettings.mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(appContext);
        mSnapchatServiceManager.c = appContext;
        obj = mAnalyticsEventLogger;
        obj1 = appContext;
        Exception exception;
        if (obj1 == null)
        {
            Timber.e("com.snapchat.android.analaytics.framework.BlizzardEventLogger", "Argument context cannot be null in initialize()", new Object[0]);
        } else
        {
            obj.c = ((Context) (obj1)).getApplicationContext();
            obj.d = ((BlizzardEventLogger) (obj)).c.getSharedPreferences((new StringBuilder()).append(Constants.b).append(".").append(((BlizzardEventLogger) (obj)).c.getPackageName()).toString(), 0);
        }
        obj = appContext;
        if (!DW.a())
        {
            Zf.a(DW.a(((Context) (obj))));
        }
        obj = mAppInstallLogger;
        obj1 = appContext;
        if (Bt.ce())
        {
            break MISSING_BLOCK_LABEL_1172;
        }
        obj1 = ((Context) (obj1)).getPackageManager().getPackageInfo(((Context) (obj1)).getPackageName(), 0);
        Timber.b("AppInstallLogger", "First install: %d, last update: %d, current time: %d", new Object[] {
            Long.valueOf(((PackageInfo) (obj1)).firstInstallTime), Long.valueOf(((PackageInfo) (obj1)).lastUpdateTime), Long.valueOf(System.currentTimeMillis())
        });
        if (((PackageInfo) (obj1)).firstInstallTime != ((PackageInfo) (obj1)).lastUpdateTime)
        {
            break MISSING_BLOCK_LABEL_1172;
        }
        l = ((PackageInfo) (obj1)).firstInstallTime;
        if (System.currentTimeMillis() <= l + 0x1b7740L)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            try
            {
                obj.b = true;
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                Timber.e("AppInstallLogger", "Failed to retrieve package information.", new Object[0]);
            }
        }
        checkForAppVersionChange();
        onCreateHelper();
        PG.b(new Jd._cls1(sStartupContext));
        mStoryLoader.a = appContext;
        return;
        try
        {
            obj1.mScreenFullWidthPx = ((Point) (obj3)).y;
            obj1.mScreenFullHeightPx = ((Point) (obj3)).x;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            Timber.c("ScreenParameterProvider", "Exception in getRealSize function in Display.class", new Object[0]);
        }
          goto _L1
    }

    protected void onCreateHelper()
    {
        if (!isTestRunning())
        {
            initializeCrashHandlers();
        }
        try
        {
            Class.forName("android.os.AsyncTask");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            Timber.a("SnapchatApplication", classnotfoundexception);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21 && !isTestRunning())
        {
            WebView.enableSlowWholeDocumentDraw();
        }
        if (mStrictModeHelper.mReleaseManager.c())
        {
            StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder()).detectAll().penaltyLog().penaltyDropBox().build());
            StrictMode.setVmPolicy((new android.os.StrictMode.VmPolicy.Builder()).detectAll().penaltyLog().penaltyDropBox().build());
        }
        Kl.a(appContext.getCacheDir(), appContext.getExternalCacheDir());
        Kl.sInternalFilesDirectory = appContext.getFilesDir();
        initializeDeviceId();
        (new Thread(new Runnable() {

            private SnapchatApplication a;

            public final void run()
            {
                Thread.currentThread().setName("SlightlySecurePreferences.initialize");
                a.mSlightlySecurePreferences.a();
            }

            
            {
                a = SnapchatApplication.this;
                super();
            }
        })).start();
        if (mReleaseManager.b())
        {
            addCrashableListener(mDebugCrashReporter);
        }
    }


}
