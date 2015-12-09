// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.signin;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.signin.SignInClient;

// Referenced classes of package com.google.android.gms.games.ui.signin:
//            SignInActivity

public abstract class GamesSignInFragment extends Fragment
{

    private boolean mActivityLaunched;
    private boolean mHasTransitioned;
    private SignInActivity mParentActivity;

    public GamesSignInFragment()
    {
    }

    protected static int getActivityResultForStatus(int i)
    {
        switch (i)
        {
        default:
            return 10002;

        case 1003: 
            return 20000;

        case 3: // '\003'
        case 4: // '\004'
            return 10006;

        case 9: // '\t'
            return 10004;
        }
    }

    protected final boolean canContinueAfterOobException()
    {
        SignInActivity signinactivity = getParent();
        int i = signinactivity.mOobExceptionCount + 1;
        signinactivity.mOobExceptionCount = i;
        return i < 5;
    }

    protected final void doneLoading()
    {
        if (isActivityOk())
        {
            getParent().mLoadingView.setVisibility(4);
        }
    }

    protected final void failSignIn(int i)
    {
        if (isActivityOk())
        {
            getParent().setFailure(i, null);
        }
    }

    protected final void failSignIn(int i, int j)
    {
        if (isActivityOk())
        {
            getParent().setFailure(i, GamesStatusCodes.create(j));
        }
    }

    public abstract int getAssociatedSignInState();

    public abstract int getLoggingEvent();

    final SignInActivity getParent()
    {
        this;
        JVM INSTR monitorenter ;
        SignInActivity signinactivity;
        if (mParentActivity == null)
        {
            mParentActivity = (SignInActivity)super.mActivity;
        }
        signinactivity = mParentActivity;
        this;
        JVM INSTR monitorexit ;
        return signinactivity;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final Account getRequestedAccount()
    {
        if (getParent().mUseDesiredAccount)
        {
            return getParent().mAccount;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    protected final boolean inAssociatedSignInState()
    {
        return getParent().isInState(getAssociatedSignInState());
    }

    final boolean isActivityOk()
    {
        return getParent() != null && !super.mDetached && !super.mRemoving;
    }

    protected final boolean isPlayGamesApp()
    {
        SignInActivity signinactivity = getParent();
        return "593950602418".equals(signinactivity.mGameId) || signinactivity.isLegacyPlayGamesPackage();
    }

    public final void logState(int i)
    {
        SignInActivity signinactivity = getParent();
        if (signinactivity != null)
        {
            signinactivity.logState(i, 0);
        }
    }

    public final void logState(int i, int j)
    {
        SignInActivity signinactivity = getParent();
        if (signinactivity != null)
        {
            signinactivity.logState(i, j);
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        mActivityLaunched = false;
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            mActivityLaunched = bundle.getBoolean("activity_launched");
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("activity_launched", mActivityLaunched);
    }

    public final void onStart()
    {
        super.onStart();
        SignInActivity signinactivity = getParent();
        if (inAssociatedSignInState())
        {
            signinactivity.logState(getLoggingEvent(), 0);
            performTransition(signinactivity.getSignInClient());
        }
    }

    protected abstract void onTransition(SignInClient signinclient);

    public final void performTransition(SignInClient signinclient)
    {
        if (!mHasTransitioned)
        {
            mHasTransitioned = true;
            onTransition(signinclient);
            return;
        } else
        {
            GamesLog.w("GamesSignIn", "Attempting to transition multiple times.");
            return;
        }
    }

    protected final void setChosenAccount(Account account)
    {
        if (isActivityOk())
        {
            getParent().mAccount = account;
        }
    }

    public final void startActivity(Intent intent)
    {
        throw new IllegalStateException("Not supported for sign-in fragments; use startActivityForResult.");
    }

    public final void startActivityForResult(Intent intent, int i)
    {
        if (!mActivityLaunched)
        {
            mActivityLaunched = true;
            super.startActivityForResult(intent, i);
            return;
        } else
        {
            GamesLog.w("GamesSignIn", "Attempting to launch more than one activity.");
            return;
        }
    }

    protected final void transitionTo(int i)
    {
        if (i == getAssociatedSignInState())
        {
            mHasTransitioned = false;
        }
        if (isActivityOk())
        {
            getParent().setDesiredState(i);
        }
    }
}
