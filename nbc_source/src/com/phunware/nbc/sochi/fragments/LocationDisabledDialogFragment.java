// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.phunware.nbc.sochi.system.NBCSystem;

public class LocationDisabledDialogFragment extends DialogFragment
{

    public LocationDisabledDialogFragment()
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setMessage(0x7f07015e).setPositiveButton("Settings", new android.content.DialogInterface.OnClickListener() {

            final LocationDisabledDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (getActivity() == null || getActivity().isFinishing())
                {
                    dismiss();
                    return;
                } else
                {
                    ((MainNavigationContentActivity)getActivity()).showNationalAlertsWizard();
                    dialoginterface = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                    getActivity().startActivity(dialoginterface);
                    NBCSystem.GEO_LOCATION_RETRY = true;
                    dismiss();
                    return;
                }
            }

            
            {
                this$0 = LocationDisabledDialogFragment.this;
                super();
            }
        }).setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() {

            final LocationDisabledDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                ((MainNavigationContentActivity)getActivity()).showNationalAlertsWizard();
            }

            
            {
                this$0 = LocationDisabledDialogFragment.this;
                super();
            }
        });
        return bundle.create();
    }
}
