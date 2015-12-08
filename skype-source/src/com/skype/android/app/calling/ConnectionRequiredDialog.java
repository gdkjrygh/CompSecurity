// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.skype.android.app.InfoDialogFragment;

public class ConnectionRequiredDialog extends InfoDialogFragment
{

    public ConnectionRequiredDialog()
    {
    }

    public static ConnectionRequiredDialog create(String s, String s1, String s2, String s3)
    {
        ConnectionRequiredDialog connectionrequireddialog = new ConnectionRequiredDialog();
        Bundle bundle = new Bundle();
        bundle.putString("android.intent.extra.TITLE", s);
        bundle.putString("android.intent.extra.TEXT", s1);
        bundle.putString("neutralButton", s2);
        bundle.putString("positiveButton", s3);
        connectionrequireddialog.setArguments(bundle);
        return connectionrequireddialog;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            startActivity(new Intent("android.settings.WIFI_SETTINGS"));
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null && (fragmentactivity instanceof android.content.DialogInterface.OnDismissListener))
        {
            ((android.content.DialogInterface.OnDismissListener)fragmentactivity).onDismiss(dialoginterface);
        }
    }
}
