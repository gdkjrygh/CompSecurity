// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog.changeaccount;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;

public abstract class ChangeAccountDialogFragment extends GamesDialogFragment
{

    public ChangeAccountDialogFragment()
    {
    }

    public static Bundle createArgs(String s, String s1, String s2)
    {
        Bundle bundle = new Bundle();
        bundle.putString("gameName", s);
        bundle.putString("signedInAccountName", s1);
        bundle.putString("newAccountName", s2);
        return bundle;
    }

    protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
    {
        int i;
        int j;
        if (super.mArguments.getString("signedInAccountName") == null)
        {
            j = 0x7f1000a7;
            i = 0x7f1000a5;
        } else
        {
            j = 0x7f1000a6;
            i = 0x7f1000a4;
        }
        bundle = super.mActivity.getString(i, new Object[] {
            super.mArguments.getString("gameName"), super.mArguments.getString("signedInAccountName"), super.mArguments.getString("newAccountName")
        });
        return gamesdialogbuilder.setTitle(j).setMessage(bundle).setPositiveButton(0x104000a, this).setNegativeButton(0x1040000, null);
    }

    public final void onClick(int i)
    {
        i;
        JVM INSTR tableswitch -1 -1: default 20
    //                   -1 26;
           goto _L1 _L2
_L1:
        dismissInternal(false);
        return;
_L2:
        switchAccount();
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected abstract void switchAccount();
}
