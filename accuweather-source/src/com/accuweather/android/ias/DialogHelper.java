// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.ias;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class DialogHelper
{

    public DialogHelper()
    {
    }

    public static void showDialog(Context context, String s, String s1)
    {
        context = (new android.app.AlertDialog.Builder(context)).setTitle(s).setMessage(s1).setCancelable(false).setNegativeButton("Close", new android.content.DialogInterface.OnClickListener(context) {

            final Context val$context;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
                ((Activity)context).finish();
            }

            
            {
                context = context1;
                super();
            }
        }).create();
        try
        {
            context.show();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }
}
