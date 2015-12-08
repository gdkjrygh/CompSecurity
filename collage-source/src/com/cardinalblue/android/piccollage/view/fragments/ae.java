// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class ae extends DialogFragment
{

    public ae()
    {
    }

    public static ae a(int i, boolean flag, int j)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("message", i);
        bundle.putBoolean("cancelable", flag);
        bundle.putInt("progress_style", j);
        ae ae1 = new ae();
        ae1.setArguments(bundle);
        return ae1;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new ProgressDialog(getActivity());
        Bundle bundle1 = getArguments();
        int i = bundle1.getInt("message");
        if (i != 0)
        {
            bundle.setMessage(getString(i));
        }
        bundle.setCancelable(bundle1.getBoolean("cancelable"));
        bundle.setProgressStyle(bundle1.getInt("progress_style"));
        return bundle;
    }
}
