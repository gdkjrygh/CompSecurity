// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.signin;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.signin.SignInClient;
import com.google.android.gms.games.ui.dialog.DividerlessDialogFragment;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.signin:
//            GamesSignInFragment, SignInActivity

public class GamesConnectingFragment extends GamesSignInFragment
    implements android.view.View.OnClickListener
{
    public static final class ConnectingDialogFragment extends DividerlessDialogFragment
        implements android.content.DialogInterface.OnKeyListener, android.view.View.OnClickListener, android.view.animation.Animation.AnimationListener
    {

        private Animation mAppInfoScrollUpAnimation;
        private Animation mConnectingFadeOutAnimation;
        private GamesConnectingFragment mParentFragment;
        private View mPopupView;
        private Animation mPopupWaitAnimation;

        private Animation loadAnimation(int i)
        {
            Animation animation;
            synchronized (mParentFragment.mLock)
            {
                animation = AnimationUtils.loadAnimation(super.mActivity, i);
                animation.setFillAfter(true);
                animation.setAnimationListener(this);
                mParentFragment.mLoadedAnimations.add(animation);
            }
            return animation;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void onAnimationEnd(Animation animation)
        {
            Object obj = mParentFragment.mLock;
            obj;
            JVM INSTR monitorenter ;
            if (mParentFragment.mSkipping) goto _L2; else goto _L1
_L1:
            if (animation != mAppInfoScrollUpAnimation) goto _L4; else goto _L3
_L3:
            mPopupWaitAnimation = loadAnimation(0x7f05000e);
            mPopupView.startAnimation(mPopupWaitAnimation);
_L2:
            return;
_L4:
            if (animation == mPopupWaitAnimation)
            {
                mParentFragment.proceedToNextStep();
            }
            if (true) goto _L2; else goto _L5
_L5:
            animation;
            obj;
            JVM INSTR monitorexit ;
            throw animation;
        }

        public final void onAnimationRepeat(Animation animation)
        {
        }

        public final void onAnimationStart(Animation animation)
        {
        }

        public final void onClick(View view)
        {
            dismissInternal(false);
        }

        public final Dialog onCreateDialog(Bundle bundle)
        {
            Dialog dialog;
            String s;
            mParentFragment = (GamesConnectingFragment)super.mTarget;
            dialog = new Dialog(super.mActivity, 0x7f1100b9);
            dialog.getWindow().requestFeature(1);
            mPopupView = super.mActivity.getLayoutInflater().inflate(0x7f040055, null);
            mPopupView.setOnClickListener(this);
            dialog.setContentView(mPopupView);
            dialog.setOnKeyListener(this);
            if (mParentFragment == null)
            {
                GamesLog.w("GamesConnectingFrag", "bindViewData: mParentFragment not set; bailing out...");
                return dialog;
            }
            bundle = super.mActivity;
            if (bundle == null)
            {
                GamesLog.w("GamesConnectingFrag", "bindViewData: no Activity; bailing out");
                return dialog;
            }
            bundle = bundle.getPackageManager();
            s = mParentFragment.getParent().mGamePackageName;
            Object obj;
            android.content.pm.ApplicationInfo applicationinfo;
            obj = bundle.getApplicationIcon(s);
            ((ImageView)mPopupView.findViewById(0x7f0d0140)).setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
            obj = (TextView)mPopupView.findViewById(0x7f0d0146);
            applicationinfo = bundle.getApplicationInfo(s, 128);
            if (applicationinfo != null)
            {
                break MISSING_BLOCK_LABEL_258;
            }
            bundle = "";
_L1:
            try
            {
                ((TextView) (obj)).setText(bundle);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                GamesLog.e("GamesConnectingFrag", (new StringBuilder("Couldn't find icon for package ")).append(s).toString());
            }
            mAppInfoScrollUpAnimation = loadAnimation(0x7f05000d);
            mConnectingFadeOutAnimation = loadAnimation(0x7f05000c);
            mAppInfoScrollUpAnimation.setStartOffset(1500L);
            mConnectingFadeOutAnimation.setStartOffset(1500L);
            mPopupView.findViewById(0x7f0d0145).startAnimation(mAppInfoScrollUpAnimation);
            mPopupView.findViewById(0x7f0d0141).startAnimation(mConnectingFadeOutAnimation);
            return dialog;
            bundle = String.valueOf(bundle.getApplicationLabel(applicationinfo));
              goto _L1
        }

        public final void onDismiss(DialogInterface dialoginterface)
        {
            super.onDismiss(dialoginterface);
            if (mParentFragment != null)
            {
                mParentFragment.proceedToNextStep();
                return;
            } else
            {
                GamesLog.w("GamesConnectingFrag", "ConnectingDialogFragment.onDismiss: null mParentFragment");
                return;
            }
        }

        public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
        {
            boolean flag = false;
            if (i == 96 || i == 66)
            {
                dismissInternal(false);
                flag = true;
            }
            return flag;
        }

        public final void onStart()
        {
            super.onStart();
            if (mParentFragment != null)
            {
                Window window = super.mDialog.getWindow();
                android.view.WindowManager.LayoutParams layoutparams = window.getAttributes();
                layoutparams.gravity = mParentFragment.getParent().mConnectingPopupGravity;
                window.setAttributes(layoutparams);
                return;
            } else
            {
                GamesLog.w("GamesConnectingFrag", "ConnectingDialogFragment.onStart: null mParentFragment");
                return;
            }
        }

        public ConnectingDialogFragment()
        {
        }
    }


    ArrayList mLoadedAnimations;
    final Object mLock = new Object();
    boolean mSkipping;
    private boolean mTransitioned;

    public GamesConnectingFragment()
    {
        mLoadedAnimations = new ArrayList();
        mTransitioned = false;
    }

    public final int getAssociatedSignInState()
    {
        return 0;
    }

    public final int getLoggingEvent()
    {
        return 1;
    }

    public void onClick(View view)
    {
        view = ((View) (mLock));
        view;
        JVM INSTR monitorenter ;
        mSkipping = true;
        int i = 0;
        int j = mLoadedAnimations.size();
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        Animation animation = (Animation)mLoadedAnimations.get(i);
        if (animation.hasStarted())
        {
            animation.cancel();
        }
        break MISSING_BLOCK_LABEL_67;
        view;
        JVM INSTR monitorexit ;
        proceedToNextStep();
        return;
        Exception exception;
        exception;
        view;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void onPause()
    {
        super.onPause();
        synchronized (mLock)
        {
            mSkipping = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void onTransition(SignInClient signinclient)
    {
        doneLoading();
        ((ViewGroup)super.getParent().findViewById(0x7f0d0295)).setOnClickListener(this);
        signinclient = new ConnectingDialogFragment();
        signinclient._mth4b1b893a(this);
        DialogFragmentUtil.show(super.mActivity, signinclient, "connectingDialog");
    }

    final void proceedToNextStep()
    {
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        FragmentActivity fragmentactivity = super.mActivity;
        if (fragmentactivity != null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!mTransitioned)
        {
            mTransitioned = true;
            if (super.isActivityOk())
            {
                super.getParent().mSuppressNextLoadingViewDisplay = true;
            }
            DialogFragmentUtil.dismiss(fragmentactivity, "connectingDialog");
            if (inAssociatedSignInState())
            {
                transitionTo(1);
            }
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
