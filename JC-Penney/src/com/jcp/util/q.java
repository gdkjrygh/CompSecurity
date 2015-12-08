// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.app.AlertDialog;
import android.content.DialogInterface;

final class q
    implements android.content.DialogInterface.OnClickListener
{

    final AlertDialog a;

    q(AlertDialog alertdialog)
    {
        a = alertdialog;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.dismiss();
    }
}
