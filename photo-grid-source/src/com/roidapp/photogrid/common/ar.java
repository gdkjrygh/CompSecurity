// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import com.roidapp.photogrid.release.PhotoGridActivity;

// Referenced classes of package com.roidapp.photogrid.common:
//            ap

final class ar
    implements android.content.DialogInterface.OnKeyListener
{

    final Activity a;
    final AlertDialog b;
    final ap c;

    ar(ap ap, Activity activity, AlertDialog alertdialog)
    {
        c = ap;
        a = activity;
        b = alertdialog;
        super();
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            ((PhotoGridActivity)a).i = false;
            a.getSharedPreferences(a.getPackageName(), 0).edit().putInt("REGISTER_COUNT", -3).apply();
            b.dismiss();
            return true;
        } else
        {
            return false;
        }
    }
}
