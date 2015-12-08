// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.common:
//            ap

final class ax
    implements android.view.View.OnClickListener
{

    final Activity a;
    final AlertDialog b;
    final ap c;

    ax(ap ap, Activity activity, AlertDialog alertdialog)
    {
        c = ap;
        a = activity;
        b = alertdialog;
        super();
    }

    public final void onClick(View view)
    {
        a.getSharedPreferences(a.getPackageName(), 0).edit().putInt("REGISTER_COUNT", 5).putBoolean("IS_RATE", true).apply();
        b.dismiss();
        view = Uri.parse("https://market.android.com/details?id=com.roidapp.photogrid");
        try
        {
            Intent intent = new Intent("android.intent.action.VIEW", view);
            intent.setFlags(0x10000000);
            intent.setPackage("com.android.vending");
            a.startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            view = new Intent("android.intent.action.VIEW", view);
            view.setFlags(0x10000000);
            a.startActivity(view);
            activitynotfoundexception.printStackTrace();
            return;
        }
    }
}
