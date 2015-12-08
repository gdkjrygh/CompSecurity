// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.common.SharedPreferencesCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.feedback.Feedback;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.cheat.CodeListener;
import com.google.android.gms.games.ui.destination.onboarding.GamesOnboardHostActivity;
import com.google.android.gms.games.ui.destination.sharedprefs.SharedPrefsConfig;
import com.google.android.gms.games.util.PackageUtils;
import com.google.android.gms.nearby.Nearby;
import java.util.ArrayList;

public abstract class DestinationFragmentActivityBase extends GamesFragmentActivity
    implements com.google.android.gms.games.app.PowerUpPlayLogger.PowerUpPlayLoggerProvider
{

    public String mAccountName;
    private CodeListener mCodeListener;
    protected boolean mOnboardingInProgress;
    public PowerUpPlayLogger mPlayLogger;
    protected boolean mResetHomePage;
    public boolean mRetryingSignIn;
    private boolean mShowSpecificScreen;
    private Dialog mUnknownFailureDialog;

    public DestinationFragmentActivityBase(int i)
    {
        this(i, 0);
    }

    public DestinationFragmentActivityBase(int i, int j)
    {
        this(i, j, false);
    }

    public DestinationFragmentActivityBase(int i, int j, boolean flag)
    {
        this(i, j, flag, true);
    }

    public DestinationFragmentActivityBase(int i, int j, boolean flag, boolean flag1)
    {
        super(3, 0, i, j, flag, flag1);
        mRetryingSignIn = false;
        mShowSpecificScreen = false;
        mOnboardingInProgress = false;
    }

    protected void addApisToGoogleApiClient(com.google.android.gms.common.api.GoogleApiClient.Builder builder)
    {
        super.addApisToGoogleApiClient(builder);
        Object obj = com.google.android.gms.games.Games.GamesOptions.builder();
        ((com.google.android.gms.games.Games.GamesOptions.Builder) (obj)).setShowConnectingPopup$371b5ca1();
        obj.retryingSignIn = mRetryingSignIn;
        Intent intent = getIntent();
        String s = intent.getStringExtra("com.google.android.gms.games.ACCOUNT_KEY");
        if (s != null && intent.getBooleanExtra("com.google.android.gms.games.FORCE_RESOLVE_ACCOUNT_KEY", false))
        {
            obj.forceResolveAccountKey = (String)Preconditions.checkNotNull(s);
            intent.removeExtra("com.google.android.gms.games.FORCE_RESOLVE_ACCOUNT_KEY");
        }
        intent.removeExtra("com.google.android.gms.games.ACCOUNT_KEY");
        obj = ((com.google.android.gms.games.Games.GamesOptions.Builder) (obj)).build();
        builder.addApi(Games.API_1P, ((com.google.android.gms.common.api.Api.ApiOptions.HasOptions) (obj)));
        builder.addApi(Nearby.CONNECTIONS_API);
        builder.addApi(PlayGames.API, com.google.android.gms.games.client.PlayGames.PlayGamesOptions.builder(((com.google.android.gms.games.Games.GamesOptions) (obj))).build());
    }

    public final boolean canContinueWithStatus(int i)
    {
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (mCodeListener == null) goto _L2; else goto _L1
_L1:
        Object obj = mCodeListener;
        int i = keyevent.getAction();
        i;
        JVM INSTR tableswitch 0 1: default 40
    //                   0 46
    //                   1 169;
           goto _L2 _L3 _L4
_L2:
        return super.dispatchKeyEvent(keyevent);
_L3:
        ((CodeListener) (obj)).mCurrentStep;
        JVM INSTR tableswitch 6 8: default 313
    //                   6 76
    //                   7 115
    //                   8 142;
           goto _L2 _L5 _L6 _L7
_L5:
        if (keyevent.getKeyCode() == 30 && ((CodeListener) (obj)).mButtonB != null)
        {
            ((CodeListener) (obj)).mButtonB.setPressed(true);
        }
          goto _L2
        obj;
        GamesLog.w("CodeListener", "Exception in code listener", ((Throwable) (obj)));
          goto _L2
_L6:
        if (keyevent.getKeyCode() != 29 || ((CodeListener) (obj)).mButtonA == null) goto _L2; else goto _L8
_L8:
        ((CodeListener) (obj)).mButtonA.setPressed(true);
          goto _L2
_L7:
        if (keyevent.getKeyCode() != 108 || ((CodeListener) (obj)).mButtonStart == null) goto _L2; else goto _L9
_L9:
        ((CodeListener) (obj)).mButtonStart.setPressed(true);
          goto _L2
_L4:
        int j = ((CodeListener) (obj)).mCurrentStepIndex;
        ((CodeListener) (obj)).mCurrentStep;
        JVM INSTR tableswitch 0 5: default 316
    //                   0 224
    //                   1 244
    //                   2 264
    //                   3 289
    //                   4 264
    //                   5 289;
           goto _L10 _L11 _L12 _L13 _L14 _L13 _L14
_L16:
        ((CodeListener) (obj)).updateCurrentStep(i);
          goto _L2
_L11:
        i = j;
        if (keyevent.getKeyCode() != 19) goto _L16; else goto _L15
_L15:
        i = j + 1;
          goto _L16
_L12:
        i = j;
        if (keyevent.getKeyCode() != 20) goto _L16; else goto _L17
_L17:
        i = j + 1;
          goto _L16
_L13:
        i = j;
        if (keyevent.getKeyCode() != 21) goto _L16; else goto _L18
_L18:
        i = j + 1;
        obj.mIsHorizontalReversed = false;
          goto _L16
_L14:
        int k = keyevent.getKeyCode();
        i = j;
        if (k == 22)
        {
            i = j + 1;
        }
          goto _L16
_L10:
        i = j;
          goto _L16
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (mCodeListener == null) goto _L2; else goto _L1
_L1:
        Object obj = mCodeListener;
        int k = motionevent.getPointerId(motionevent.getActionIndex());
        if (((CodeListener) (obj)).mPointerId != -1) goto _L4; else goto _L3
_L3:
        obj.mPointerId = k;
_L8:
        float f;
        int i;
        int j;
        i = motionevent.getActionMasked();
        j = (int)motionevent.getX(k);
        f = motionevent.getY(k);
        int l = (int)f;
        i;
        JVM INSTR tableswitch 0 5: default 104
    //                   0 122
    //                   1 213
    //                   2 154
    //                   3 213
    //                   4 104
    //                   5 122;
           goto _L2 _L5 _L6 _L7 _L6 _L2 _L5
_L2:
        return super.dispatchTouchEvent(motionevent);
_L4:
        if (((CodeListener) (obj)).mPointerId != k) goto _L2; else goto _L8
_L5:
        try
        {
            obj.mStartingX = j;
            obj.mStartingY = l;
            obj.mIsATap = true;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            GamesLog.w("CodeListener", "Exception in code listener", ((Throwable) (obj)));
        }
          goto _L2
_L7:
        if (!((CodeListener) (obj)).mIsATap || Math.sqrt(Math.pow(((CodeListener) (obj)).mStartingX - j, 2D) + Math.pow(((CodeListener) (obj)).mStartingY - l, 2D)) <= (double)((CodeListener) (obj)).mViewConfiguration.getScaledTouchSlop()) goto _L2; else goto _L9
_L9:
        obj.mIsATap = false;
          goto _L2
_L6:
        if (((CodeListener) (obj)).mIsATap) goto _L2; else goto _L10
_L10:
        k = ((CodeListener) (obj)).mStartingX - j;
        l = ((CodeListener) (obj)).mStartingY - l;
        j = ((CodeListener) (obj)).mCurrentStepIndex;
        ((CodeListener) (obj)).mCurrentStep;
        JVM INSTR tableswitch 0 5: default 543
    //                   0 297
    //                   1 332
    //                   2 367
    //                   3 481
    //                   4 423
    //                   5 481;
           goto _L11 _L12 _L13 _L14 _L15 _L16 _L15
_L18:
        ((CodeListener) (obj)).updateCurrentStep(i);
          goto _L2
_L12:
        i = j;
        if ((float)Math.abs(l) <= Math.abs((float)k * 1.5F)) goto _L18; else goto _L17
_L17:
        i = j;
        if (l <= 0) goto _L18; else goto _L19
_L13:
        i = j;
        if ((float)Math.abs(l) <= Math.abs((float)k * 1.5F)) goto _L18; else goto _L20
_L20:
        i = j;
        if (l >= 0) goto _L18; else goto _L19
_L14:
        i = j;
        if ((float)Math.abs(k) <= Math.abs((float)l * 1.5F)) goto _L18; else goto _L21
_L21:
        if (k <= 0) goto _L23; else goto _L22
_L22:
        i = j + 1;
        obj.mIsHorizontalReversed = false;
          goto _L18
_L23:
        i = j + 1;
        obj.mIsHorizontalReversed = true;
          goto _L18
_L16:
        i = j;
        if ((float)Math.abs(k) <= Math.abs((float)l * 1.5F)) goto _L18; else goto _L24
_L24:
        if (!((CodeListener) (obj)).mIsHorizontalReversed && k > 0) goto _L26; else goto _L25
_L25:
        i = j;
        if (!((CodeListener) (obj)).mIsHorizontalReversed) goto _L18; else goto _L27
_L27:
        i = j;
        if (k >= 0) goto _L18; else goto _L26
_L15:
        i = j;
        if ((float)Math.abs(k) <= Math.abs((float)l * 1.5F)) goto _L18; else goto _L28
_L28:
        if (!((CodeListener) (obj)).mIsHorizontalReversed && k < 0) goto _L19; else goto _L29
_L29:
        boolean flag = ((CodeListener) (obj)).mIsHorizontalReversed;
        i = j;
        if (!flag) goto _L18; else goto _L30
_L30:
        i = j;
        if (k <= 0) goto _L18; else goto _L19
_L11:
        i = j;
          goto _L18
_L19:
        i = j + 1;
          goto _L18
_L26:
        i = j + 1;
          goto _L18
    }

    public final PowerUpPlayLogger getLogger()
    {
        return mPlayLogger;
    }

    protected final GoogleApiClient instantiateGoogleApiClient()
    {
        com.google.android.gms.common.api.GoogleApiClient.Builder builder = (new com.google.android.gms.common.api.GoogleApiClient.Builder(this, this, this)).addApi(Feedback.API);
        if (!mRetryingSignIn) goto _L2; else goto _L1
_L1:
        mAccountName = null;
_L4:
        if (!TextUtils.isEmpty(mAccountName))
        {
            builder.setAccountName(mAccountName);
        }
        addApisToGoogleApiClient(builder);
        return builder.build();
_L2:
        if (getIntent().getStringExtra("com.google.android.gms.games.ACCOUNT_NAME") != null)
        {
            mShowSpecificScreen = true;
            mAccountName = getIntent().getStringExtra("com.google.android.gms.games.ACCOUNT_NAME");
        } else
        if (getIntent().getStringExtra("com.google.android.gms.games.ACCOUNT_KEY") != null)
        {
            mShowSpecificScreen = true;
            mAccountName = null;
        } else
        if (TextUtils.isEmpty(mAccountName))
        {
            mAccountName = null;
            mShowSpecificScreen = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 2001)
        {
            if (j == -1)
            {
                mOnboardingInProgress = false;
                mPlayLogger.logOnboardAction(9);
                intent = intent.getStringExtra("com.google.android.gms.games.ON_BOARDING_ACCOUNT");
                if (!TextUtils.isEmpty(intent))
                {
                    mAccountName = intent;
                    createGoogleApiClient();
                }
                getGoogleApiClient().connect();
                return;
            }
            mPlayLogger.logOnboardAction(10);
            GamesLog.w("DestFragActivityBase", "User has backed out of on-boarding flow, finishing.");
            finish();
        }
        super.onActivityResult(i, j, intent);
    }

    public void onConnected(Bundle bundle)
    {
        Object obj1;
        PowerUpPlayLogger powerupplaylogger;
        obj1 = Games.getCurrentAccountName(getGoogleApiClient());
        if (obj1 == null)
        {
            GamesLog.w("DestFragActivityBase", "We don't have a current account name, something went wrong. Finishing the activity");
            finish();
            return;
        }
        android.content.SharedPreferences.Editor editor = SharedPrefsConfig.getEditor(this);
        editor.putString("lastSignedInAccount", ((String) (obj1)));
        SharedPreferencesCompat.apply(editor);
        mRetryingSignIn = false;
        powerupplaylogger = mPlayLogger;
        Object obj = PowerUpPlayLogger.LOGGING_QUEUE_LOCK;
        obj;
        JVM INSTR monitorenter ;
        powerupplaylogger.mAccountName = ((String) (obj1));
        obj1 = PowerUpPlayLogger.LOGGING_QUEUE_LOCK;
        obj1;
        JVM INSTR monitorenter ;
        int j = powerupplaylogger.mEventQueue.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        powerupplaylogger.logEventInternalImmediate((com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension)powerupplaylogger.mEventQueue.get(i));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        powerupplaylogger.clearPendingEvents();
        obj1;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
        super.onConnected(bundle);
        return;
        bundle;
        obj1;
        JVM INSTR monitorexit ;
        throw bundle;
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        int i;
        boolean flag;
        flag = true;
        i = connectionresult.mStatusCode;
        GamesLog.i("DestFragActivityBase", (new StringBuilder("Connection to service apk failed with error ")).append(i).toString());
        if (!mOnboardingInProgress) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!connectionresult.hasResolution())
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (mShowSpecificScreen)
        {
            flag = false;
        }
        mResetHomePage = flag;
        mResolutionInProgress = true;
        if (!isFinishing())
        {
            connectionresult.startResolutionForResult(this, 901);
            return;
        }
        continue; /* Loop/switch isn't completed */
        connectionresult;
        GamesLog.e("DestFragActivityBase", "Unable to recover from a connection failure.");
        finish();
        return;
        if (i == 5)
        {
            mRetryingSignIn = true;
            mResetHomePage = true;
            createGoogleApiClient();
            getGoogleApiClient().connect();
            return;
        }
        mUnknownFailureDialog = GooglePlayServicesUtil.getErrorDialog$7b9fd7d3(i, this);
        if (mUnknownFailureDialog == null)
        {
            GamesLog.e("DestFragActivityBase", "Unable to recover from a connection failure.");
            finish();
            return;
        }
        if (!isFinishing())
        {
            mUnknownFailureDialog.show();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onCreate(Bundle bundle)
    {
        getIntent();
        super.onCreate(bundle);
        if (((Boolean)G.activateCheatCode.get()).booleanValue())
        {
            mCodeListener = new CodeListener(this);
        }
        mPlayLogger = new PowerUpPlayLogger(this);
    }

    public final void onShowSettings()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (googleapiclient.isConnected())
        {
            mPlayLogger.logBasicAction(7, PowerUpUtils.getExperimentIdsForLogging());
            Intent intent = new Intent("com.google.android.gms.games.SHOW_GOOGLE_SETTINGS");
            intent.setPackage(getPackageName());
            intent.putExtra("com.google.android.gms.games.ACCOUNT_NAME", Games.getCurrentAccountName(googleapiclient));
            intent.putExtra("com.google.android.gms.games.DEST_APP_VERSION", PackageUtils.getVersionName(this, "com.google.android.play.games"));
            startActivity(intent);
            return;
        } else
        {
            GamesLog.w("DestFragActivityBase", "onShowSettings: googleApiClient not connected; ignoring menu click");
            return;
        }
    }

    public void onStart()
    {
        super.onStart();
        PowerUpPlayLogger.start();
    }

    public void onStop()
    {
        super.onStop();
        mPlayLogger.clearPendingEvents();
        if (mUnknownFailureDialog != null)
        {
            mUnknownFailureDialog.dismiss();
        }
    }

    public final void shareGame(String s, String s1)
    {
        mPlayLogger.logBasicAction(11, PowerUpUtils.getExperimentIdsForLogging());
        super.shareGame(s, s1);
    }

    public final void startOnboardingFlow()
    {
        if (((Boolean)G.enableWarmWelcomeFlow.get()).booleanValue())
        {
            boolean flag1 = SharedPrefsConfig.getBoolean(this, "showWarmWelcome", true);
            boolean flag;
            if (SharedPrefsConfig.getBoolean(this, "showOnBoardingFlow", true) && flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && !mOnboardingInProgress)
            {
                SharedPrefsConfig.setInt(this, "lastVersionWhatsNewShown", PowerUpUtils.getPlayGamesVersionCode(this));
                SharedPrefsConfig.setBoolean(this, "showWarmWelcome", false);
                mPlayLogger.logOnboardAction(1);
                mOnboardingInProgress = true;
                startActivityForResult(new Intent(this, com/google/android/gms/games/ui/destination/onboarding/GamesOnboardHostActivity), 2001);
                return;
            }
        }
    }
}
