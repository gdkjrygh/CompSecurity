// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.e;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

final class q
    implements android.content.DialogInterface.OnClickListener
{

    final Context a;

    q(Context context)
    {
        a = context;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.settings.WIFI_SETTINGS");
        a.startActivity(dialoginterface);
    }
}
