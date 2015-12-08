// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

final class x
    implements android.view.View.OnClickListener
{

    final AlertDialog a;
    final MainPage b;

    x(MainPage mainpage, AlertDialog alertdialog)
    {
        b = mainpage;
        a = alertdialog;
        super();
    }

    public final void onClick(View view)
    {
        b.a(null, null);
        PreferenceManager.getDefaultSharedPreferences(b.getApplicationContext()).edit().putBoolean("hideVideo", true).apply();
        a.dismiss();
    }
}
