// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

public class DialogUtil
{

    public DialogUtil()
    {
    }

    public static void showForcedUpdateDialog(Activity activity)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setMessage(activity.getString(0x7f070114));
        builder.setCancelable(false);
        builder.setPositiveButton("Ok", new android.content.DialogInterface.OnClickListener(activity) {

            final Activity val$context;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=air.com.nbcuni.com.nbcsports.liveextra")));
                context.finish();
            }

            
            {
                context = activity;
                super();
            }
        });
        builder.create().show();
    }

    public static void showNetworkNotAvailableDialog(Activity activity)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setMessage(activity.getString(0x7f070136));
        builder.setCancelable(false);
        builder.setPositiveButton("Ok", new android.content.DialogInterface.OnClickListener(activity) {

            final Activity val$context;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                context.finish();
            }

            
            {
                context = activity;
                super();
            }
        });
        builder.create().show();
    }
}
