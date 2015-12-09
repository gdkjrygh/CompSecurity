// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;
import com.google.android.gms.games.logging.GamesLogflowLogger;
import com.google.android.gms.games.logging.LogflowGamesUiElementNode;
import com.google.android.gms.games.ui.GamesFragmentActivity;

// Referenced classes of package com.google.android.gms.games.ui.dialog:
//            PrebuiltDialogs, GamesDialogBuilder

public abstract class GamesDialogFragment extends DialogFragment
    implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnClickListener, LogflowGamesUiElementNode
{
    public static interface GamesDialogFragmentCallbacks
    {

        public abstract void onDialogCancel(GamesDialogFragment gamesdialogfragment);

        public abstract void onDialogNegativeClicked(GamesDialogFragment gamesdialogfragment);

        public abstract void onDialogNeutralClicked(GamesDialogFragment gamesdialogfragment);

        public abstract void onDialogPositiveClicked(GamesDialogFragment gamesdialogfragment);
    }


    protected GamesDialogFragmentCallbacks mCallbacks;
    protected GamesFragmentActivity mParent;
    private com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement mUiElement;

    public GamesDialogFragment()
    {
    }

    private View getRootView()
    {
        Object obj = super.mDialog;
        if (obj != null)
        {
            obj = ((Dialog) (obj)).getWindow();
            if (obj != null)
            {
                return ((Window) (obj)).getDecorView();
            }
        }
        return null;
    }

    private void logClick(int i)
    {
        if (mUiElement != null)
        {
            mParent.logClickEvent(i, getRootView());
        }
    }

    public abstract android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle);

    public final com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement getFauxParentLogflowUiElement()
    {
        return null;
    }

    protected int getPlaylogElementType()
    {
        return 0;
    }

    public final com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement getPlaylogGamesUiElement()
    {
        return mUiElement;
    }

    public final boolean isAttachedToParent()
    {
        return super.mActivity != null && !super.mDetached && !super.mRemoving;
    }

    public final boolean isLeaf()
    {
        return true;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (mUiElement != null)
        {
            bundle = getRootView();
            if (bundle == null)
            {
                throw new IllegalStateException("The dialog should have a view.");
            }
            bundle.setTag(0x7f0d0061, this);
            mParent.startNewImpression(bundle);
        }
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        mParent = (GamesFragmentActivity)activity;
        int i = getPlaylogElementType();
        if (i != 0)
        {
            mUiElement = GamesLogflowLogger.obtainPlaylogGamesUiElement(i);
        }
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        logClick(901);
        if (mCallbacks != null)
        {
            mCallbacks.onDialogCancel(this);
        }
    }

    public void onClick(int i)
    {
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        i;
        JVM INSTR tableswitch -3 -1: default 28
    //                   -3 61
    //                   -2 34
    //                   -1 88;
           goto _L1 _L2 _L3 _L4
_L1:
        onClick(i);
        return;
_L3:
        logClick(511);
        if (mCallbacks != null)
        {
            mCallbacks.onDialogNegativeClicked(this);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        logClick(512);
        if (mCallbacks != null)
        {
            mCallbacks.onDialogNeutralClicked(this);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        logClick(513);
        if (mCallbacks != null)
        {
            mCallbacks.onDialogPositiveClicked(this);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        GamesDialogBuilder gamesdialogbuilder = PrebuiltDialogs.getGamesThemedBuilder(mParent);
        gamesdialogbuilder.setOnCancelListener(this);
        bundle = createDialog(gamesdialogbuilder, bundle).create();
        onPostCreateDialog(bundle);
        return bundle;
    }

    public void onPostCreateDialog(AlertDialog alertdialog)
    {
    }

    public final void setCallbacks(GamesDialogFragmentCallbacks gamesdialogfragmentcallbacks)
    {
        mCallbacks = gamesdialogfragmentcallbacks;
    }
}
