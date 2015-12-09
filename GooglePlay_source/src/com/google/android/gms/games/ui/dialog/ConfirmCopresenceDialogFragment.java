// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.dialog:
//            GamesDialogFragment, GamesDialogBuilder

public final class ConfirmCopresenceDialogFragment extends GamesDialogFragment
    implements android.view.View.OnClickListener
{
    public static interface CopresenceDialogResultListener
    {

        public abstract void onDialogClose(int i, boolean flag);
    }


    private CopresenceDialogResultListener mDialogResultListener;
    private CheckBox mDoNotShowCheckView;

    public ConfirmCopresenceDialogFragment()
    {
    }

    protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
    {
        View view;
        view = super.mActivity.getLayoutInflater().inflate(0x7f0400a1, null);
        view.setOnClickListener(this);
        mDoNotShowCheckView = (CheckBox)view.findViewById(0x7f0d01f9);
        if (bundle != null)
        {
            boolean flag = bundle.getBoolean("saveStateDoNotShow", false);
            mDoNotShowCheckView.setChecked(flag);
        }
        mDialogResultListener = null;
        if (!(super.mTarget instanceof CopresenceDialogResultListener)) goto _L2; else goto _L1
_L1:
        mDialogResultListener = (CopresenceDialogResultListener)super.mTarget;
_L4:
        return gamesdialogbuilder.setTitle(0x7f1001fc).setPositiveButton(0x104000a, this).setNegativeButton(0x1040000, this).setView(view).setCancelable(false);
_L2:
        if (super.mActivity instanceof CopresenceDialogResultListener)
        {
            mDialogResultListener = (CopresenceDialogResultListener)super.mActivity;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onClick(int i)
    {
        if (mDialogResultListener != null)
        {
            mDialogResultListener.onDialogClose(i, mDoNotShowCheckView.isChecked());
        }
        dismissInternal(false);
    }

    public final void onClick(View view)
    {
        if (view.getId() == 0x7f0d0105)
        {
            UiUtils.launchNearbyLearnMore(super.mActivity);
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("saveStateDoNotShow", mDoNotShowCheckView.isChecked());
    }
}
