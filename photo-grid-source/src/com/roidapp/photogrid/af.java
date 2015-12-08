// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

final class af
    implements android.content.DialogInterface.OnClickListener
{

    final MainPage a;

    af(MainPage mainpage)
    {
        a = mainpage;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (!a.isFinishing())
        {
            PreferenceManager.getDefaultSharedPreferences(a.getApplicationContext()).edit().putBoolean("hideVideo", true).apply();
            dialoginterface.dismiss();
        }
    }
}
