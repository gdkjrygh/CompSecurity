// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import com.skype.android.SkypeDialogFragment;

public class ProgressDialogFragment extends SkypeDialogFragment
{

    public ProgressDialogFragment()
    {
    }

    public static ProgressDialogFragment create(String s)
    {
        ProgressDialogFragment progressdialogfragment = new ProgressDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("android.intent.extra.TEXT", s);
        progressdialogfragment.setArguments(bundle);
        return progressdialogfragment;
    }

    protected String getMessage()
    {
        return getArguments().getString("android.intent.extra.TEXT");
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new ProgressDialog(getActivity(), 2);
        bundle.setCanceledOnTouchOutside(false);
        bundle.setCancelable(false);
        bundle.setMessage(getMessage());
        return bundle;
    }
}
