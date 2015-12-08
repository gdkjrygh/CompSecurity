// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;

public class LiveUpcomingListMenuDialog extends DialogFragment
{
    public static interface LiveUpcomingListMenuDialogListener
    {

        public abstract void onLiveMenuSelected(String s, int i);
    }


    private LiveUpcomingListMenuDialogListener mListener;

    public LiveUpcomingListMenuDialog()
    {
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        mListener = (LiveUpcomingListMenuDialogListener)activity;
    }

    public Dialog onCreateDialog(final Bundle liveUpcomingMenuList)
    {
        liveUpcomingMenuList = getActivity().getResources().getStringArray(0x7f0d0008);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setTitle(null);
        builder.setItems(liveUpcomingMenuList, new android.content.DialogInterface.OnClickListener() {

            final LiveUpcomingListMenuDialog this$0;
            final String val$liveUpcomingMenuList[];

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = liveUpcomingMenuList[i];
                if (mListener != null)
                {
                    mListener.onLiveMenuSelected(dialoginterface, i);
                }
            }

            
            {
                this$0 = LiveUpcomingListMenuDialog.this;
                liveUpcomingMenuList = as;
                super();
            }
        });
        liveUpcomingMenuList = builder.create();
        liveUpcomingMenuList.setCanceledOnTouchOutside(true);
        return liveUpcomingMenuList;
    }

}
