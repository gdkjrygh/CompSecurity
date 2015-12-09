// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.pin;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.ApplicationStateListener;
import com.netflix.mediaclient.android.app.UserInputManager;

// Referenced classes of package com.netflix.mediaclient.ui.pin:
//            PinDialog, PinDialogVault

public class PinVerifier
    implements ApplicationStateListener
{
    public static interface PinVerificationCallback
    {

        public abstract void onPinVerified(PinDialogVault pindialogvault);
    }


    private static final long DEFAULT_PIN_SESSION_TIMEOUT_MS = 0x1b7740L;
    private static final long DIALOG_TIMEOUT_IN_BACKGROUND = 0x2bf20L;
    private static final boolean FORCE_PIN_VERIFY = false;
    public static final boolean PIN_VERIFY_REQUIRED = true;
    public static final String TAG = "nf_pin";
    private static final String TAG_SESSION = "nf_pin_session";
    private static boolean mAppInBackground;
    private static long mBackgroundTime;
    private static PinDialog mPinDialog;
    private static long mPinSessionExpiryTime;
    private static PinVerifier mPinVeriyInstance = new PinVerifier();

    private PinVerifier()
    {
    }

    public static PinVerifier getInstance()
    {
        return mPinVeriyInstance;
    }

    public static boolean isPinSessionActive()
    {
        return mPinSessionExpiryTime > System.currentTimeMillis();
    }

    public static void lastUserInteractionTime(long l)
    {
        registerUserInteractionEvent(l);
    }

    private static void registerUserInteractionEvent(long l)
    {
        if (isPinSessionActive())
        {
            Log.d("nf_pin_session", String.format("isActive: %b lastInteractionTime:%d - registerUserInteractionEvent", new Object[] {
                Boolean.valueOf(isPinSessionActive()), Long.valueOf(l)
            }));
            updatePinSessionExpiryTime((System.currentTimeMillis() - l) + 0x1b7740L);
        }
    }

    private static void setPinSessionToInactive()
    {
        mPinSessionExpiryTime = 0L;
    }

    private boolean shouldVerifyPin(boolean flag)
    {
        Log.d("nf_pin_session", String.format("Active:%b isPlayablePinProtected:%b - shouldVerifyPin", new Object[] {
            Boolean.valueOf(isPinSessionActive()), Boolean.valueOf(flag)
        }));
        if (flag)
        {
            return !isPinSessionActive();
        } else
        {
            return false;
        }
    }

    private static void updatePinSessionExpiryTime(long l)
    {
        if (l > mPinSessionExpiryTime)
        {
            Log.d("nf_pin_session", String.format("isActive: %b, current:%d, newEpiry:%d - updatePinSessionExpiryTime", new Object[] {
                Boolean.valueOf(isPinSessionActive()), Long.valueOf(System.currentTimeMillis()), Long.valueOf(l)
            }));
            mPinSessionExpiryTime = l;
        }
    }

    public void clearState()
    {
        setPinSessionToInactive();
    }

    public void dismissPinVerification()
    {
        boolean flag = false;
        boolean flag1 = mAppInBackground;
        if (mPinDialog != null)
        {
            flag = true;
        }
        Log.d("nf_pin", String.format("dismissPinVerification appInBackground:%b, pinDialogValid:%b", new Object[] {
            Boolean.valueOf(flag1), Boolean.valueOf(flag)
        }));
        if (mPinDialog != null)
        {
            mPinDialog.dismissDialog();
        }
    }

    public void onBackground(UserInputManager userinputmanager)
    {
        Log.d("nf_pin", "app in background");
        mBackgroundTime = System.currentTimeMillis();
        mAppInBackground = true;
    }

    public void onForeground(UserInputManager userinputmanager)
    {
        mAppInBackground = false;
        Log.d("nf_pin", String.format("app in foreground ", new Object[0]));
    }

    public void onUiGone(UserInputManager userinputmanager)
    {
    }

    public void onUiStarted(UserInputManager userinputmanager)
    {
    }

    protected void pinDialogDismissed()
    {
        mPinDialog = null;
    }

    public void registerPinVerifyEvent()
    {
        Log.d("nf_pin_session", String.format("isActive: %b to: true - registerPinVerifyEvent", new Object[] {
            Boolean.valueOf(isPinSessionActive())
        }));
        updatePinSessionExpiryTime(System.currentTimeMillis() + 0x1b7740L);
    }

    public void registerPlayEvent(boolean flag)
    {
        boolean flag1 = false;
        boolean flag2 = isPinSessionActive();
        if (isPinSessionActive() || flag)
        {
            flag1 = true;
        }
        Log.d("nf_pin_session", String.format("isActive: %b, wasPinProtectedPlayback: %b, extendSession ? %b- registerPlayStopEvent", new Object[] {
            Boolean.valueOf(flag2), Boolean.valueOf(flag), Boolean.valueOf(flag1)
        }));
        if (isPinSessionActive() || flag)
        {
            updatePinSessionExpiryTime(System.currentTimeMillis() + 0x1b7740L);
        }
    }

    protected boolean toDismissDialog()
    {
        return mAppInBackground && System.currentTimeMillis() - mBackgroundTime > 0x2bf20L;
    }

    public void verify(NetflixActivity netflixactivity, boolean flag, PinDialogVault pindialogvault)
    {
        if (!flag)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!shouldVerifyPin(flag))
        {
            PinDialog.notifyCallerPinVerified(netflixactivity, pindialogvault);
            return;
        } else
        {
            ((NetflixApplication)netflixactivity.getApplication()).getUserInput().addListener(this);
            mPinDialog = PinDialog.createPinDialog(netflixactivity, pindialogvault);
            netflixactivity.showDialog(mPinDialog);
            return;
        }
    }

}
