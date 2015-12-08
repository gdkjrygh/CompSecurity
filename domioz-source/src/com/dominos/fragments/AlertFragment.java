// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.dominos.utils.ViewUtil;

// Referenced classes of package com.dominos.fragments:
//            ContractDialogFragment

public class AlertFragment extends ContractDialogFragment
{

    boolean cancelable;
    String message;
    String title;

    public AlertFragment()
    {
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(getActivity())).setTitle(title).setMessage(message).setCancelable(cancelable).setIcon(0x7f020144).setNegativeButton(getActivity().getString(0x7f0801c4), new _cls1()).create();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (getContract() != null)
        {
            ((OnAlertDismissListener)getContract()).onAlertDismiss();
        }
    }

    public void onStart()
    {
        super.onStart();
        ViewUtil.setDialogStyle(getActivity(), getDialog());
    }

    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final AlertFragment this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface.dismiss();
        }

        _cls1()
        {
            this$0 = AlertFragment.this;
            super();
        }
    }


    private class OnAlertDismissListener
    {

        public abstract void onAlertDismiss();
    }

}
