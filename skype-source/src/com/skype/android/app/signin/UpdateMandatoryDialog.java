// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.res.Urls;

public class UpdateMandatoryDialog extends SkypeDialogFragment
    implements android.content.DialogInterface.OnClickListener
{

    Urls urls;

    public UpdateMandatoryDialog()
    {
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(urls.a(com.skype.android.res.Urls.Type.k)));
        dialoginterface.setFlags(0x10000000);
        startActivity(dialoginterface);
        getActivity().finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setTitle(0x7f080279);
        bundle.setMessage(0x7f080434);
        bundle.setCancelable(false);
        bundle.setPositiveButton(0x7f080136, this);
        return bundle.create();
    }
}
