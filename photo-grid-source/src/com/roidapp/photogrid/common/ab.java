// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.roidapp.photogrid.MainPage;

final class ab
    implements android.content.DialogInterface.OnClickListener
{

    final Context a;

    ab(Context context)
    {
        a = context;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent(a, com/roidapp/photogrid/MainPage);
        a.startActivity(dialoginterface);
        ((Activity)a).finish();
    }
}
