// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

final class ba
    implements android.content.DialogInterface.OnClickListener
{

    final AlertDialog a;
    final Activity b;

    ba(AlertDialog alertdialog, Activity activity)
    {
        a = alertdialog;
        b = activity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.dismiss();
        b.finish();
    }
}
