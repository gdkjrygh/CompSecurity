// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.cheat;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.ui.cheat.popup.CodeListenerAchievementPopup;
import com.google.android.gms.games.ui.cheat.popup.CodeListenerPopupManager;

public final class CodeListener
    implements android.view.View.OnClickListener, com.google.android.gms.games.ui.cheat.popup.CodeListenerPopupManager.CodeListenerPopupManagerReadyListener
{

    private static final int STEPS[] = {
        0, 0, 1, 1, 2, 3, 4, 5, 6, 7, 
        8, 9
    };
    private final Activity mActivity;
    public View mButtonA;
    public View mButtonB;
    public View mButtonStart;
    private AlertDialog mCurrentDialog;
    public int mCurrentStep;
    public int mCurrentStepIndex;
    private final LayoutInflater mInflater;
    public boolean mIsATap;
    public boolean mIsHorizontalReversed;
    public int mPointerId;
    private final CodeListenerPopupManager mPopupManager;
    public int mStartingX;
    public int mStartingY;
    public final ViewConfiguration mViewConfiguration;

    public CodeListener(Activity activity)
    {
        mCurrentStepIndex = 0;
        mCurrentStep = STEPS[mCurrentStepIndex];
        mPointerId = -1;
        mActivity = activity;
        mViewConfiguration = ViewConfiguration.get(activity);
        mInflater = (LayoutInflater)activity.getSystemService("layout_inflater");
        mPopupManager = CodeListenerPopupManager.getPopupManager$b65fc95(mActivity, this);
    }

    private void resetCurrentStep()
    {
        mCurrentStepIndex = 0;
        mCurrentStep = STEPS[mCurrentStepIndex];
        if (mCurrentDialog != null && mCurrentDialog.isShowing())
        {
            mCurrentDialog.dismiss();
            mCurrentDialog = null;
            mButtonB = null;
            mButtonA = null;
            mButtonStart = null;
        }
    }

    public final void onClick(View view)
    {
        int j = mCurrentStepIndex;
        view.getId();
        JVM INSTR tableswitch 2131558684 2131558686: default 36
    //                   2131558684 44
    //                   2131558685 62
    //                   2131558686 80;
           goto _L1 _L2 _L3 _L4
_L1:
        int i = j;
_L6:
        updateCurrentStep(i);
        return;
_L2:
        i = j;
        if (mCurrentStep == 7)
        {
            i = j + 1;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        i = j;
        if (mCurrentStep == 6)
        {
            i = j + 1;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i = j;
        if (mCurrentStep == 8)
        {
            i = j + 1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onPopupManagerReady(com.google.android.gms.games.ui.cheat.popup.CodeListenerPopupManager.CodeListenerPopupLocationInfo codelistenerpopuplocationinfo)
    {
        boolean flag1 = true;
        Bundle bundle = new Bundle();
        Object obj = mActivity.getResources().getConfiguration();
        boolean flag;
        if (((Configuration) (obj)).orientation == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!PlatformVersion.checkVersion(13) || ((Configuration) (obj)).smallestScreenWidthDp < 600)
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            obj = "All your game are belong to us";
        } else
        {
            obj = "All your game\nare belong to us";
        }
        bundle.putString("com.google.android.gms.games.extra.name", ((String) (obj)));
        CodeListenerAchievementPopup.show(mActivity, codelistenerpopuplocationinfo, bundle);
    }

    public final void updateCurrentStep(int i)
    {
        if (i == mCurrentStepIndex)
        {
            resetCurrentStep();
            return;
        }
        mCurrentStepIndex = i;
        mCurrentStep = STEPS[mCurrentStepIndex];
        switch (mCurrentStep)
        {
        case 7: // '\007'
        case 8: // '\b'
        default:
            return;

        case 6: // '\006'
            View view = mInflater.inflate(0x7f04004b, null);
            mButtonB = view.findViewById(0x7f0d011d);
            mButtonB.setOnClickListener(this);
            mButtonA = view.findViewById(0x7f0d011c);
            mButtonA.setOnClickListener(this);
            mButtonStart = view.findViewById(0x7f0d011e);
            mButtonStart.setOnClickListener(this);
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(mActivity);
            builder.setView(view);
            if (!PlatformVersion.checkVersion(11))
            {
                builder.setInverseBackgroundForced(true);
            }
            mCurrentDialog = builder.create();
            mCurrentDialog.show();
            return;

        case 9: // '\t'
            mPopupManager.preparePopupManager();
            resetCurrentStep();
            return;
        }
    }

}
