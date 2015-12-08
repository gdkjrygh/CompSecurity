// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.v4.app.DialogFragment;

public class DividerlessDialogFragment extends DialogFragment
{

    private Context mContext;

    public DividerlessDialogFragment()
    {
    }

    public void onStart()
    {
        super.onStart();
        super.mDialog.isShowing();
    }

    public final void onStop()
    {
        super.onStop();
        mContext = null;
    }
}
