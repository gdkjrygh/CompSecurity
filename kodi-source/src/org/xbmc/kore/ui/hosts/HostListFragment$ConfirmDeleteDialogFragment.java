// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            HostListFragment

public static class _cls2.this._cls0 extends DialogFragment
{
    public static interface ConfirmDeleteDialogListener
    {

        public abstract void onDialogNegativeClick();

        public abstract void onDialogPositiveClick();
    }


    private ConfirmDeleteDialogListener mListener;

    public static ConfirmDeleteDialogListener getInstance(ConfirmDeleteDialogListener confirmdeletedialoglistener)
    {
        ConfirmDeleteDialogListener confirmdeletedialoglistener1 = new <init>();
        confirmdeletedialoglistener1.mListener = confirmdeletedialoglistener;
        return confirmdeletedialoglistener1;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.ogFragment(getActivity());
        bundle.getActivity(0x7f07002f).getActivity(0x7f070030).getActivity(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final HostListFragment.ConfirmDeleteDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                mListener.onDialogPositiveClick();
            }

            
            {
                this$0 = HostListFragment.ConfirmDeleteDialogFragment.this;
                super();
            }
        }).ogFragment(0x1040000, new android.content.DialogInterface.OnClickListener() {

            final HostListFragment.ConfirmDeleteDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                mListener.onDialogNegativeClick();
            }

            
            {
                this$0 = HostListFragment.ConfirmDeleteDialogFragment.this;
                super();
            }
        });
        return bundle.ogFragment();
    }


    public _cls2.this._cls0()
    {
    }
}
