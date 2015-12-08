// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class TokenExpiredDialogFragment extends DialogFragment
{

    public static final String TAG = "TokenExpiredDialog";

    public TokenExpiredDialogFragment()
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return (new android.support.v7.app.AlertDialog.Builder(getActivity())).setTitle(0x7f07012f).setMessage(0x7f07012e).setPositiveButton(0x7f0701a4, new _cls1()).create();
    }

    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final TokenExpiredDialogFragment this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            LogoutActivity.start(getActivity());
            dismiss();
        }

        _cls1()
        {
            this$0 = TokenExpiredDialogFragment.this;
            super();
        }
    }

}
