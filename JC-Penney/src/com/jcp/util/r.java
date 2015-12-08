// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

final class r
    implements android.view.View.OnClickListener
{

    final Activity a;
    final String b;
    final Dialog c;

    r(Activity activity, String s, Dialog dialog)
    {
        a = activity;
        b = s;
        c = dialog;
        super();
    }

    public void onClick(View view)
    {
        a.startActivity(new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder()).append("tel:").append(b).toString())));
        c.dismiss();
    }
}
