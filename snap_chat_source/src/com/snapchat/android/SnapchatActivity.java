// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import Br;
import Bt;
import IO;
import LF;
import LG;
import LH;
import LJ;
import LK;
import LR;
import Ll;
import Ls;
import Lu;
import Lw;
import Mf;
import OH;
import PG;
import S;
import WW;
import Y;
import afH;
import afI;
import afN;
import agl;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.MotionEvent;
import ap;
import cB;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.analytics.framework.AnalyticsPlatform;
import com.snapchat.android.analytics.framework.AnalyticsPlatformRegistry;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.ErrorMetric;
import com.snapchat.android.analytics.framework.WorkerThread;
import com.snapchat.android.dev.DeveloperSettingsActivity;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kD;
import ll;
import net.hockeyapp.android.NativeCrashDetector;
import us;

// Referenced classes of package com.snapchat.android:
//            Timber, SnapchatApplication

public abstract class SnapchatActivity extends FragmentActivity
{

    public static final String EXTRA_FROM = "FROM";
    protected static final String STATE_KEY_WAITING_FOR_ACTIVITY_RESULT = "waiting_for_activity_result";
    private static final String TAG = "SnapchatActivity";
    private static boolean mIsCrittercismInitialized;
    public AnalyticsPlatformRegistry mAnalyticsPlatformRegistry;
    public LR mAnrReporter;
    private LK mCrashManager;
    public Lu mCrashSampler;
    private BlizzardEventLogger mEventLogger;
    private final ReleaseManager mReleaseManager = ReleaseManager.a();
    public LJ mShakeReporter;
    private us mThreeFingerTapDetector;
    protected Br mUser;
    protected boolean mWaitingForActivityResult;
    private boolean performPostponedTasksFromOnResume;

    public SnapchatActivity()
    {
        mCrashManager = new LK();
        performPostponedTasksFromOnResume = false;
        mShakeReporter = new LJ();
        mEventLogger = BlizzardEventLogger.a();
        mWaitingForActivityResult = false;
    }

    protected static SnapchatFragment a(S s1, int i)
    {
        return (SnapchatFragment)s1.a(s1.c(i).c());
    }

    public static void a(S s1, String s2)
    {
        s1.a(s2, 0);
        int i = s1.e() - 1;
        if (i >= 0)
        {
            s1 = a(s1, i);
            if (s1 != null)
            {
                s1.j(true);
            }
        }
    }

    private void a(Intent intent)
    {
        if (intent != null)
        {
            intent = intent.getStringExtra("FROM");
            String s1 = getClass().getSimpleName();
            Timber.c("SnapchatActivity", (new StringBuilder("logTransition ")).append(intent).append(" -> ").append(s1).toString(), new Object[0]);
            AnalyticsEvents.b(intent, s1);
        }
    }

    public static final String gatherLogsAsString()
    {
        if (ReleaseManager.f())
        {
            return Lw.a();
        } else
        {
            return "";
        }
    }

    public static boolean s()
    {
        return mIsCrittercismInitialized;
    }

    protected void a(Br br)
    {
        Timber.c("SnapchatActivity", (new StringBuilder("onUserLoaded ")).append(br).toString(), new Object[0]);
        if (performPostponedTasksFromOnResume)
        {
            mAnalyticsPlatformRegistry.a(this);
            performPostponedTasksFromOnResume = false;
        }
        Mf.a().a(new OH(br));
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (!mReleaseManager.c() || mThreeFingerTapDetector == null) goto _L2; else goto _L1
_L1:
        us us1 = mThreeFingerTapDetector;
        motionevent.getActionMasked();
        JVM INSTR tableswitch 1 5: default 60
    //                   1 239
    //                   2 60
    //                   3 239
    //                   4 60
    //                   5 69;
           goto _L3 _L4 _L3 _L4 _L3 _L5
_L3:
        if (us1.b)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L5:
        if (!us1.b && motionevent.getActionIndex() == 2)
        {
            Timber.c("ThreeFingerTapDetector", "3-finger tap!", new Object[0]);
            long l = SystemClock.elapsedRealtime();
            if (l - us1.c[0] <= 700L)
            {
                Timber.c("ThreeFingerTapDetector", "3 consecutive 3-finger taps !!!", new Object[0]);
                us1.a.vibrate(500L);
                try
                {
                    Application application = SnapchatApplication.get();
                    Intent intent = new Intent(application, com/snapchat/android/dev/DeveloperSettingsActivity);
                    intent.setFlags(0x14000000);
                    application.startActivity(intent);
                }
                catch (ActivityNotFoundException activitynotfoundexception)
                {
                    Timber.e("ActivityLauncher", (new StringBuilder("DeveloperSettingsActivity doesn't exist for this flavor of build. ")).append(activitynotfoundexception).toString(), new Object[0]);
                }
            } else
            {
                us1.a.vibrate(100L);
            }
            us1.c[0] = us1.c[1];
            us1.c[1] = l;
            us1.b = true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (us1.b)
        {
            us1.b = false;
        }
        if (true) goto _L3; else goto _L2
_L2:
        return super.dispatchTouchEvent(motionevent);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (43351 == i)
        {
            mShakeReporter.b();
        }
    }

    public void onCreate(Bundle bundle)
    {
        int i = 0;
        super.onCreate(bundle);
        SnapchatApplication.getDIComponent().a(this);
        if (bundle != null)
        {
            mWaitingForActivityResult = bundle.getBoolean("waiting_for_activity_result");
        }
        mCrashManager.mOnCreateMillis = SystemClock.elapsedRealtime();
        if (mCrashSampler.b())
        {
            if (!TextUtils.isEmpty("53b243b017878408e2000002"))
            {
                cB.a(getApplicationContext(), "53b243b017878408e2000002");
                mIsCrittercismInitialized = true;
                cB.a("initialize crittercism.");
            }
            afH.a(this);
            new LH();
            boolean flag = Bt.bo();
            Timber.c("NativeTaskFlagWatcher", (new StringBuilder("getTranscodingInProgressFlag is ")).append(flag).toString(), new Object[0]);
            if (flag)
            {
                LH.a("Transcoding flag was still set");
                Bt.r(false);
            }
            flag = Bt.cb();
            Timber.c("NativeTaskFlagWatcher", (new StringBuilder("lensesFlagEnabled = ")).append(flag).toString(), new Object[0]);
            if (flag)
            {
                LH.a((new StringBuilder("Lenses flag still set, glRenderer: ")).append(Bt.bZ()).append(", lens: ").append(Bt.ca()).toString());
                Bt.I(false);
            }
            try
            {
                NativeCrashDetector.a(afH.a);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                (new ErrorMetric("Failed to load libBreakpad")).e();
            }
            if (afH.a != null)
            {
                bundle = new File((new StringBuilder()).append(afH.a).append("/").toString());
                String s1;
                String s2;
                int j;
                if (!bundle.mkdir() && !bundle.exists())
                {
                    bundle = new String[0];
                } else
                {
                    bundle = bundle.list(new LG._cls1());
                }
            } else
            {
                Timber.c("NativeCrashReporter", "Can't search for exception as file path is null.", new Object[0]);
                bundle = new String[0];
            }
            for (j = bundle.length; i < j; i++)
            {
                s1 = bundle[i];
                s2 = LG.a();
                if (s2 != null)
                {
                    (new LG._cls2("c06b8797877eb662616000c11de0d338", s2, s1, this)).start();
                }
            }

        }
        if (ReleaseManager.i() && ReleaseManager.h())
        {
            try
            {
                ((KeyguardManager)getSystemService("keyguard")).newKeyguardLock(getLocalClassName()).disableKeyguard();
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                bundle.printStackTrace();
            }
        }
        if (ReleaseManager.f())
        {
            bundle = new LF();
            if (!LF.sCurrentlySendingReports.get())
            {
                LF.sCurrentlySendingReports.set(true);
                PG.a(IO.SERIAL_EXECUTOR_FOR_DEBUGGING, new LF._cls3(bundle));
            }
        }
        b().a(800, new Y.a() {

            private SnapchatActivity a;

            public final ap onCreateLoader(int k, Bundle bundle1)
            {
                return new kD(a, ll.a());
            }

            public final void onLoadFinished(ap ap, Object obj)
            {
                ap = (Br)obj;
                a.mUser = ap;
                a.a(ap);
            }

            public final void onLoaderReset(ap ap)
            {
            }

            
            {
                a = SnapchatActivity.this;
                super();
            }
        });
        mThreeFingerTapDetector = new us();
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        a(intent);
    }

    protected void onPause()
    {
        super.onPause();
        Object obj = mEventLogger;
        if (((BlizzardEventLogger) (obj)).a("endSession()") && ((BlizzardEventLogger) (obj)).a)
        {
            long l1 = System.currentTimeMillis();
            ((BlizzardEventLogger) (obj)).a(new com.snapchat.android.analytics.framework.BlizzardEventLogger._cls4(((BlizzardEventLogger) (obj)), SystemClock.elapsedRealtime(), l1));
            ((BlizzardEventLogger) (obj)).e.b(((BlizzardEventLogger) (obj)).b);
            obj.b = new com.snapchat.android.analytics.framework.BlizzardEventLogger._cls5(((BlizzardEventLogger) (obj)));
            ((BlizzardEventLogger) (obj)).e.a(((BlizzardEventLogger) (obj)).b, 16000L);
        }
        if (mCrashSampler.b())
        {
            long l = System.currentTimeMillis();
            if (this != null && afN.a(this))
            {
                obj = getSharedPreferences("HockeyApp", 0);
                long l2 = ((SharedPreferences) (obj)).getLong((new StringBuilder("startTime")).append(hashCode()).toString(), 0L);
                long l3 = ((SharedPreferences) (obj)).getLong((new StringBuilder("usageTime")).append(afH.b).toString(), 0L);
                if (l2 > 0L)
                {
                    obj = ((SharedPreferences) (obj)).edit();
                    ((android.content.SharedPreferences.Editor) (obj)).putLong((new StringBuilder("usageTime")).append(afH.b).toString(), (l - l2) + l3);
                    agl.a(((android.content.SharedPreferences.Editor) (obj)));
                }
            }
        }
    }

    protected void onResume()
    {
        super.onResume();
        Object obj = mCrashManager;
        obj.mOnResumeCycles = ((LK) (obj)).mOnResumeCycles + 1;
        obj.mOnResumeMillis = SystemClock.elapsedRealtime();
        obj = mEventLogger;
        if (((BlizzardEventLogger) (obj)).a("startSession()") && !((BlizzardEventLogger) (obj)).a)
        {
            long l1 = System.currentTimeMillis();
            ((BlizzardEventLogger) (obj)).a(new com.snapchat.android.analytics.framework.BlizzardEventLogger._cls3(((BlizzardEventLogger) (obj)), SystemClock.elapsedRealtime(), l1));
        }
        if (mCrashSampler.b() && !TextUtils.isEmpty("c06b8797877eb662616000c11de0d338"))
        {
            afI.a(this, "c06b8797877eb662616000c11de0d338", mCrashManager);
            long l = System.currentTimeMillis();
            if (this != null)
            {
                obj = getSharedPreferences("HockeyApp", 0).edit();
                ((android.content.SharedPreferences.Editor) (obj)).putLong((new StringBuilder("startTime")).append(hashCode()).toString(), l);
                agl.a(((android.content.SharedPreferences.Editor) (obj)));
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("waiting_for_activity_result", mWaitingForActivityResult);
    }

    public void onStart()
    {
        super.onStart();
        a(getIntent());
        mWaitingForActivityResult = false;
        Object obj;
        if (mUser == null)
        {
            performPostponedTasksFromOnResume = true;
        } else
        {
            mAnalyticsPlatformRegistry.a(this);
        }
        if (ReleaseManager.f())
        {
            LJ lj = mShakeReporter;
            lj.mActivity = this;
            lj.mSensorManager = (SensorManager)getSystemService("sensor");
            lj.mCanSendReports = true;
            lj.mBugReporter = new Ls(ReleaseManager.a());
            lj = mShakeReporter;
            lj.mSensorManager.registerListener(lj, lj.mSensorManager.getDefaultSensor(1), 1);
        }
        obj = mAnrReporter.mAnrDetector;
        if (((WW) (obj)).a.isEmpty())
        {
            throw new IllegalStateException("You must call registerListener() before detectAnrs()");
        } else
        {
            obj = new WW._cls1(((WW) (obj)), this);
            AsyncTask.THREAD_POOL_EXECUTOR.execute(((Runnable) (obj)));
            return;
        }
    }

    protected void onStop()
    {
        super.onStop();
        for (Iterator iterator = mAnalyticsPlatformRegistry.a.iterator(); iterator.hasNext(); ((AnalyticsPlatform)iterator.next()).b(this)) { }
        if (ReleaseManager.f())
        {
            mShakeReporter.a();
            LJ lj = mShakeReporter;
            lj.mActivity = null;
            lj.mBugReporter = null;
        }
    }

    public final String sendNotification(String s1)
    {
        sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(s1))));
        return s1;
    }

    public void startActivity(Intent intent)
    {
        intent.putExtra("FROM", getClass().getSimpleName());
        super.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        super.startActivityForResult(intent, i);
        if (i >= 0)
        {
            mWaitingForActivityResult = true;
        }
    }
}
