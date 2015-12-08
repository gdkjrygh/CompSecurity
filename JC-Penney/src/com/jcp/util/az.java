// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.app.Activity;
import android.content.DialogInterface;

final class az
    implements android.content.DialogInterface.OnClickListener
{

    final Activity a;

    az(Activity activity)
    {
        a = activity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.onBackPressed();
        dialoginterface.dismiss();
    }
}
