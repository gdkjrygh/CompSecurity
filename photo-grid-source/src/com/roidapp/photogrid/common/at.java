// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.view.View;
import com.roidapp.photogrid.release.PhotoGridActivity;

// Referenced classes of package com.roidapp.photogrid.common:
//            o, ap

final class at
    implements android.view.View.OnClickListener
{

    final Activity a;
    final AlertDialog b;
    final ap c;

    at(ap ap, Activity activity, AlertDialog alertdialog)
    {
        c = ap;
        a = activity;
        b = alertdialog;
        super();
    }

    public final void onClick(View view)
    {
        ((PhotoGridActivity)a).i = false;
        a.getSharedPreferences(a.getPackageName(), 0).edit().putInt("REGISTER_COUNT", 5).putBoolean("IS_RATE", true).apply();
        b.dismiss();
        (new o(a)).b();
    }
}
