// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.KeyEvent;

// Referenced classes of package com.fitbit.util:
//            r

public class ProgressDialogFragment extends DialogFragment
{

    private android.content.DialogInterface.OnCancelListener a;

    public ProgressDialogFragment()
    {
    }

    protected static void a(ProgressDialogFragment progressdialogfragment, int i, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        progressdialogfragment.setArguments(r.a(i, j));
        progressdialogfragment.a(oncancellistener);
    }

    public static ProgressDialogFragment b(int i, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        ProgressDialogFragment progressdialogfragment = new ProgressDialogFragment();
        a(progressdialogfragment, i, j, oncancellistener);
        return progressdialogfragment;
    }

    public void a(android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        a = oncancellistener;
        boolean flag;
        if (oncancellistener != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setCancelable(flag);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (a != null)
        {
            a.onCancel(dialoginterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new ProgressDialog(getActivity());
        bundle.setTitle(r.a(this));
        bundle.setMessage(r.b(this));
        bundle.setCanceledOnTouchOutside(false);
        bundle.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() {

            final ProgressDialogFragment a;

            public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
            {
                return i == 84;
            }

            
            {
                a = ProgressDialogFragment.this;
                super();
            }
        });
        return bundle;
    }
}
