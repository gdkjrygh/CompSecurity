// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.skype.android.SkypeDialogFragment;
import java.util.List;

public class EmergencyCallDialog extends SkypeDialogFragment
{

    public EmergencyCallDialog()
    {
    }

    public Dialog onCreateDialog(final Bundle number)
    {
        number = getArguments();
        android.support.v7.app.AlertDialog.a a;
        if (number == null)
        {
            number = null;
        } else
        {
            number = number.getString("com.skype.identitiy");
        }
        a = getMaterialDialogBuilder(getActivity());
        a.b(0x7f080481);
        a.a(0x7f0802f6, new android.content.DialogInterface.OnClickListener() {

            final EmergencyCallDialog this$0;
            final String val$number;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (!TextUtils.isEmpty(number))
                {
                    dialoginterface = getActivity().getPackageManager();
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder("tel:")).append(number).toString()));
                    intent.addFlags(0x10000000);
                    if (dialoginterface.queryIntentActivities(intent, 0).size() > 0)
                    {
                        startActivity(intent);
                    }
                }
            }

            
            {
                this$0 = EmergencyCallDialog.this;
                number = s;
                super();
            }
        });
        return a.c();
    }
}
