// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;

final class t
    implements android.content.DialogInterface.OnClickListener
{

    final Activity a;

    t(Activity activity)
    {
        a = activity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.settings.WIFI_SETTINGS");
        a.startActivityForResult(dialoginterface, 1);
    }
}
