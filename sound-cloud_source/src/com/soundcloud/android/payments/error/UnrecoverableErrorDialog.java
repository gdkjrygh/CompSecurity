// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments.error;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;

abstract class UnrecoverableErrorDialog extends DialogFragment
{

    UnrecoverableErrorDialog()
    {
    }

    private void finishParent()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            fragmentactivity.finish();
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        finishParent();
    }
}
