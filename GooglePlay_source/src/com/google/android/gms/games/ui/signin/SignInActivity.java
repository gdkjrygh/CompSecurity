// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.signin;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.signin.SignInClient;
import com.google.android.gms.games.ui.GamesSettingsDebugActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

// Referenced classes of package com.google.android.gms.games.ui.signin:
//            GamesConnectingFragment, CheckAccountFragment, AccountSelectorFragment, ValidateAccountFragment, 
//            PlusCheckFragment, CheckConsentFragment, CheckGameplayAclFragment, LoadSelfFragment, 
//            RecordSignInFragment, GamesSignInFragment

public final class SignInActivity extends FragmentActivity
    implements com.google.android.gms.games.signin.SignInClient.OnConnectedListener, com.google.android.gms.games.signin.SignInClient.OnConnectionFailedListener
{

    static final ArrayList sIndeterminateOrientations;
    static final SparseArray sValidTransitions = new SparseArray();
    Account mAccount;
    private String mCallingPackageName;
    private boolean mCheckAccountFirstPass;
    int mConnectingPopupGravity;
    private int mCurrentState;
    private int mDesiredState;
    private int mFailureResultCode;
    private Status mFailureStatus;
    String mGameId;
    String mGamePackageName;
    private boolean mHasPendingTransition;
    private boolean mInForeground;
    View mLoadingView;
    int mOobExceptionCount;
    String mPlayerId;
    private boolean mRetryingSignIn;
    String mScopes[];
    private long mSessionId;
    private long mSessionStartTimeMillis;
    private boolean mShowConnectingPopup;
    private SignInClient mSignInClient;
    boolean mSuppressAccountSelector;
    boolean mSuppressNextLoadingViewDisplay;
    boolean mUseDesiredAccount;

    public SignInActivity()
    {
        mUseDesiredAccount = false;
        mSuppressAccountSelector = false;
        mCheckAccountFirstPass = true;
        mShowConnectingPopup = false;
        mRetryingSignIn = false;
        mConnectingPopupGravity = 17;
        mFailureResultCode = 10002;
        mOobExceptionCount = 0;
    }

    private void executeTransition()
    {
        GamesLog.d("SignInActivity", (new StringBuilder("Transition from ")).append(mCurrentState).append(" to ").append(mDesiredState).toString());
        mCurrentState = mDesiredState;
        mCurrentState;
        JVM INSTR tableswitch 0 10: default 108
    //                   0 135
    //                   1 167
    //                   2 249
    //                   3 258
    //                   4 267
    //                   5 276
    //                   6 285
    //                   7 294
    //                   8 303
    //                   9 312
    //                   10 331;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        throw new IllegalStateException((new StringBuilder("Unknown state to be transitioning to: ")).append(mDesiredState).toString());
_L2:
        if (!mShowConnectingPopup)
        {
            setDesiredState(1);
        } else
        {
            mSuppressNextLoadingViewDisplay = true;
            showFragment(com/google/android/gms/games/ui/signin/GamesConnectingFragment);
        }
_L14:
        mHasPendingTransition = false;
        return;
_L3:
        if (mCheckAccountFirstPass)
        {
            mCheckAccountFirstPass = false;
            if (mAccount != null)
            {
                setDesiredState(4);
            } else
            if (mRetryingSignIn)
            {
                setDesiredState(2);
            } else
            {
                showFragment(com/google/android/gms/games/ui/signin/CheckAccountFragment);
            }
        } else
        if (mSuppressAccountSelector || mUseDesiredAccount)
        {
            setFailure(0, null);
        } else
        {
            setDesiredState(2);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        showFragment(com/google/android/gms/games/ui/signin/AccountSelectorFragment);
        continue; /* Loop/switch isn't completed */
_L5:
        showFragment(com/google/android/gms/games/ui/signin/ValidateAccountFragment);
        continue; /* Loop/switch isn't completed */
_L6:
        showFragment(com/google/android/gms/games/ui/signin/PlusCheckFragment);
        continue; /* Loop/switch isn't completed */
_L7:
        showFragment(com/google/android/gms/games/ui/signin/CheckConsentFragment);
        continue; /* Loop/switch isn't completed */
_L8:
        showFragment(com/google/android/gms/games/ui/signin/CheckGameplayAclFragment);
        continue; /* Loop/switch isn't completed */
_L9:
        showFragment(com/google/android/gms/games/ui/signin/LoadSelfFragment);
        continue; /* Loop/switch isn't completed */
_L10:
        showFragment(com/google/android/gms/games/ui/signin/RecordSignInFragment);
        continue; /* Loop/switch isn't completed */
_L11:
        logState(13, 0);
        setResult(-1);
        finish();
        continue; /* Loop/switch isn't completed */
_L12:
        onSignInFailed();
        if (true) goto _L14; else goto _L13
_L13:
    }

    private void onSignInFailed()
    {
        GamesLog.w("SignInActivity", "onSignInFailed()...");
        GamesLog.w("SignInActivity", (new StringBuilder("==> Returning non-OK result: ")).append(mFailureResultCode).toString());
        logState(14, 0);
        String s = GamesSettingsDebugActivity.getSelectedServerFromG();
        if (!GamesSettingsDebugActivity.isProdServer())
        {
            Toast.makeText(this, (new StringBuilder("Failed to connect to server (")).append(s).append(")").toString(), 1).show();
        }
        int j = mFailureResultCode;
        int i = j;
        if (j == 20000)
        {
            Toast.makeText(this, 0x7f10009d, 1).show();
            GamesLog.w("SignInActivity", "No account on this device can access the Games APIs");
            i = 10002;
        }
        mFailureResultCode = i;
        boolean flag;
        if (mFailureResultCode != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (mFailureStatus == null)
        {
            setResult(mFailureResultCode);
        } else
        {
            Intent intent = new Intent();
            intent.putExtra("status", mFailureStatus);
            setResult(mFailureResultCode, intent);
        }
        finish();
    }

    private static transient void registerTransitions(Integer integer, Integer ainteger[])
    {
        sValidTransitions.put(integer.intValue(), new ArrayList(Arrays.asList(ainteger)));
    }

    private void showFragment(Class class1)
    {
        Object obj = super.mFragments;
        Object obj1 = ((FragmentManager) (obj)).findFragmentById(0x7f0d0295);
        if (obj1 != null && (obj1 instanceof GamesSignInFragment))
        {
            obj1 = (GamesSignInFragment)obj1;
            if (((GamesSignInFragment) (obj1)).getAssociatedSignInState() == mCurrentState)
            {
                ((GamesSignInFragment) (obj1)).performTransition(mSignInClient);
                return;
            }
        }
        showLoading();
        try
        {
            obj = ((FragmentManager) (obj)).beginTransaction();
            ((FragmentTransaction) (obj)).replace(0x7f0d0295, (Fragment)class1.newInstance());
            ((FragmentTransaction) (obj)).commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new IllegalStateException(class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new IllegalStateException(class1);
        }
    }

    public final SignInClient getSignInClient()
    {
        if (!mSignInClient.isConnected())
        {
            throw new IllegalStateException("Sign-in client not connected!");
        } else
        {
            return mSignInClient;
        }
    }

    public final boolean isInState(int i)
    {
        while (!mSignInClient.isConnected() || mCurrentState != i || mHasPendingTransition) 
        {
            return false;
        }
        return true;
    }

    final boolean isLegacyPlayGamesPackage()
    {
        return "com.google.android.play.games".equals(mCallingPackageName) && TextUtils.isEmpty(mGameId);
    }

    public final void logState(int i, int j)
    {
        long l = SystemClock.elapsedRealtime();
        long l1 = mSessionStartTimeMillis;
        String s;
        if (mAccount == null)
        {
            s = null;
        } else
        {
            s = mAccount.name;
        }
        GamesPlayLogger.logSignInStep(this, mGamePackageName, mGameId, s, mSessionId, i, j, l - l1);
    }

    public final void onBackPressed()
    {
        if (mCurrentState != 2 && mCurrentState != 1) goto _L2; else goto _L1
_L1:
        super.onBackPressed();
_L4:
        return;
_L2:
        boolean flag;
        switch (mCurrentState)
        {
        default:
            flag = false;
            break;

        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
            break; /* Loop/switch isn't completed */
        }
_L5:
        if (!flag)
        {
            setDesiredState(1);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        flag = true;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final void onConnected()
    {
        if (!isInState(mDesiredState) && mInForeground)
        {
            executeTransition();
        }
    }

    public final void onConnectionFailed()
    {
        GamesLog.e("SignInActivity", "Failed to connect to sign-in service");
        onSignInFailed();
    }

    public final void onCreate(Bundle bundle)
    {
        Intent intent;
        boolean flag1;
        flag1 = true;
        super.onCreate(bundle);
        setContentView(0x7f0400d4);
        mLoadingView = findViewById(0x7f0d0296);
        intent = getIntent();
        String s = AndroidUtils.getCallingPackage(this);
        mCallingPackageName = s;
        mGamePackageName = s;
        if (mGamePackageName == null)
        {
            GamesLog.e("SignInActivity", "SignInActivity must be started with startActivityForResult");
            finish();
            return;
        }
        mGameId = intent.getStringExtra("com.google.android.gms.games.GAME_ID");
        if (mGameId == null)
        {
            GamesLog.e("SignInActivity", "You must pass a game ID in the GamesIntents.EXTRA_GAME_ID extra.");
            finish();
            return;
        }
        if (!PlatformVersion.checkVersion(18)) goto _L2; else goto _L1
_L1:
        setRequestedOrientation(14);
_L18:
        if (mGameId.length() != 0) goto _L4; else goto _L3
_L3:
        if (!GooglePlayServicesUtil.isPackageGoogleSigned(getPackageManager(), mGamePackageName)) goto _L6; else goto _L5
_L5:
        byte byte0;
        byte byte1;
        Display display;
        DisplayMetrics displaymetrics;
        boolean flag;
        int i;
        int j;
        int k;
        int l;
        if ("593950602418".equals(mGameId) || "232243143311".equals(mGameId))
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        byte1 = flag1;
        if (byte0 != 0) goto _L8; else goto _L7
_L7:
        if (!isLegacyPlayGamesPackage()) goto _L6; else goto _L9
_L9:
        byte1 = flag1;
_L8:
        if (byte1 == 0)
        {
            GamesLog.e("SignInActivity", "Invalid (empty) game ID found in the EXTRA_GAME_ID extra.");
            finish();
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        i = getRequestedOrientation();
        if (!sIndeterminateOrientations.contains(Integer.valueOf(i)))
        {
            continue; /* Loop/switch isn't completed */
        }
        display = ((WindowManager)getSystemService("window")).getDefaultDisplay();
        displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        j = display.getRotation();
        k = displaymetrics.heightPixels;
        l = displaymetrics.widthPixels;
        if (!PlatformVersion.checkVersion(9))
        {
            byte0 = 1;
            byte1 = 0;
        } else
        {
            byte1 = 8;
            byte0 = 9;
        }
        if (j == 0 || j == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && k > l || !flag && l > k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j;
        JVM INSTR tableswitch 0 3: default 360
    //                   0 391
    //                   1 408
    //                   2 419
    //                   3 431;
           goto _L10 _L11 _L12 _L13 _L14
_L10:
        byte0 = 5;
_L15:
        if (i != byte0)
        {
            setRequestedOrientation(byte0);
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (flag)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (flag)
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        if (!flag)
        {
            byte0 = byte1;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        if (!flag)
        {
            byte1 = 1;
        }
        byte0 = byte1;
        if (true) goto _L15; else goto _L6
_L6:
        byte1 = 0;
        if (true) goto _L8; else goto _L16
_L16:
        mGamePackageName = "com.google.android.gms";
_L4:
        mUseDesiredAccount = intent.getBooleanExtra("com.google.android.gms.games.USE_DESIRED_ACCOUNT_NAME", false);
        mHasPendingTransition = false;
        mCurrentState = -1;
        mDesiredState = 0;
        if (bundle != null)
        {
            mAccount = (Account)bundle.getParcelable("account");
            mPlayerId = bundle.getString("player_id");
            mDesiredState = bundle.getInt("desired_state");
            mCheckAccountFirstPass = bundle.getBoolean("account_selector_bypassed");
            mFailureResultCode = bundle.getInt("failure_result_code");
        }
        mScopes = intent.getStringArrayExtra("com.google.android.gms.games.SCOPES");
        if (mScopes == null || mScopes.length == 0)
        {
            GamesLog.e("SignInActivity", "Must specify at least one scope in order to sign in!");
            finish();
            return;
        }
        mShowConnectingPopup = intent.getBooleanExtra("com.google.android.gms.games.SHOW_CONNECTING_POPUP", false);
        mConnectingPopupGravity = intent.getIntExtra("com.google.android.gms.games.CONNECTING_POPUP_GRAVITY", 17);
        mRetryingSignIn = intent.getBooleanExtra("com.google.android.gms.games.RETRYING_SIGN_IN", false);
        bundle = intent.getBundleExtra("com.google.android.gms.games.EXTRA_SIGNIN_OPTIONS");
        mSignInClient = new SignInClient(this, mGamePackageName, mScopes, bundle, this, this);
        mSessionId = (new Random(System.currentTimeMillis())).nextLong();
        mSessionStartTimeMillis = SystemClock.elapsedRealtime();
        return;
        if (true) goto _L18; else goto _L17
_L17:
    }

    protected final void onPause()
    {
        super.onPause();
        mInForeground = false;
    }

    protected final void onResume()
    {
        super.onResume();
        mInForeground = true;
        if (mSignInClient != null && mSignInClient.isConnected() && !isInState(mDesiredState) && mHasPendingTransition)
        {
            executeTransition();
        }
    }

    protected final void onSaveInstanceState(Bundle bundle)
    {
        bundle.putParcelable("account", mAccount);
        bundle.putString("player_id", mPlayerId);
        bundle.putInt("desired_state", mDesiredState);
        bundle.putBoolean("account_selector_bypassed", mCheckAccountFirstPass);
        bundle.putInt("failure_result_code", mFailureResultCode);
        super.onSaveInstanceState(bundle);
    }

    public final void onStart()
    {
        super.onStart();
        if (mSignInClient != null)
        {
            mSignInClient.connect();
        }
    }

    public final void onStop()
    {
        super.onStop();
        if (mSignInClient != null)
        {
            SignInClient signinclient = mSignInClient;
            signinclient.mService = null;
            if (signinclient.mConnection != null)
            {
                ConnectionTracker.getInstance().unbindService(signinclient.mContext, signinclient.mConnection);
                signinclient.mConnection = null;
            }
        }
    }

    public final void setDesiredState(int i)
    {
        if (mCurrentState != -1 && !((ArrayList)sValidTransitions.get(mCurrentState)).contains(Integer.valueOf(i)))
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid transition: ")).append(mCurrentState).append(" -> ").append(i).toString());
        }
        mDesiredState = i;
        mHasPendingTransition = true;
        if (!mInForeground || mSignInClient == null)
        {
            return;
        }
        if (!mSignInClient.isConnected())
        {
            mSignInClient.connect();
            return;
        } else
        {
            executeTransition();
            return;
        }
    }

    public final void setFailure(int i, Status status)
    {
        mFailureResultCode = i;
        mFailureStatus = status;
        setDesiredState(10);
    }

    public final void showLoading()
    {
        if (mSuppressNextLoadingViewDisplay)
        {
            mSuppressNextLoadingViewDisplay = false;
            return;
        } else
        {
            mLoadingView.setVisibility(0);
            return;
        }
    }

    static 
    {
        registerTransitions(Integer.valueOf(0), new Integer[] {
            Integer.valueOf(1)
        });
        registerTransitions(Integer.valueOf(1), new Integer[] {
            Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(10)
        });
        registerTransitions(Integer.valueOf(2), new Integer[] {
            Integer.valueOf(3), Integer.valueOf(10), Integer.valueOf(9)
        });
        registerTransitions(Integer.valueOf(3), new Integer[] {
            Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(10)
        });
        registerTransitions(Integer.valueOf(4), new Integer[] {
            Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(7), Integer.valueOf(1), Integer.valueOf(10)
        });
        registerTransitions(Integer.valueOf(5), new Integer[] {
            Integer.valueOf(6), Integer.valueOf(5), Integer.valueOf(1), Integer.valueOf(10)
        });
        registerTransitions(Integer.valueOf(6), new Integer[] {
            Integer.valueOf(7), Integer.valueOf(1), Integer.valueOf(6), Integer.valueOf(10)
        });
        registerTransitions(Integer.valueOf(7), new Integer[] {
            Integer.valueOf(8), Integer.valueOf(1), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(10)
        });
        registerTransitions(Integer.valueOf(8), new Integer[] {
            Integer.valueOf(9), Integer.valueOf(10)
        });
        registerTransitions(Integer.valueOf(9), new Integer[0]);
        registerTransitions(Integer.valueOf(10), new Integer[0]);
        ArrayList arraylist = new ArrayList();
        sIndeterminateOrientations = arraylist;
        arraylist.add(Integer.valueOf(-1));
        sIndeterminateOrientations.add(Integer.valueOf(2));
        sIndeterminateOrientations.add(Integer.valueOf(10));
        sIndeterminateOrientations.add(Integer.valueOf(4));
        sIndeterminateOrientations.add(Integer.valueOf(6));
        sIndeterminateOrientations.add(Integer.valueOf(7));
    }
}
