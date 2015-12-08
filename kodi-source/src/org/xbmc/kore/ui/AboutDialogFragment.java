// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class AboutDialogFragment extends DialogFragment
{

    public AboutDialogFragment()
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getActivity();
        View view = bundle.getLayoutInflater().inflate(0x7f030021, null);
        try
        {
            bundle = bundle.getPackageManager().getPackageInfo(bundle.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle = null;
        }
        ((TextView)view.findViewById(0x7f0e005b)).setText((new StringBuilder()).append("v").append(bundle).toString());
        bundle = (TextView)view.findViewById(0x7f0e005c);
        bundle.setText(Html.fromHtml(getString(0x7f07000e)));
        bundle.setMovementMethod(LinkMovementMethod.getInstance());
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setView(view).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final AboutDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dismiss();
            }

            
            {
                this$0 = AboutDialogFragment.this;
                super();
            }
        });
        return bundle.create();
    }
}
