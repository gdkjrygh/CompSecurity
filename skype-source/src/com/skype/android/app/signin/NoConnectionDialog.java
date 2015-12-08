// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.skype.android.app.InfoDialogFragment;

public class NoConnectionDialog extends InfoDialogFragment
{

    public NoConnectionDialog()
    {
    }

    public static NoConnectionDialog create(String s, String s1, String s2, String s3)
    {
        NoConnectionDialog noconnectiondialog = new NoConnectionDialog();
        Bundle bundle = new Bundle();
        bundle.putString("android.intent.extra.TITLE", s);
        bundle.putString("android.intent.extra.TEXT", s1);
        bundle.putString("neutralButton", s2);
        bundle.putString("positiveButton", s3);
        noconnectiondialog.setArguments(bundle);
        return noconnectiondialog;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -3)
        {
            startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
        }
    }
}
