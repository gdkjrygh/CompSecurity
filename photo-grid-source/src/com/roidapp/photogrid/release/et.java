// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

// Referenced classes of package com.roidapp.photogrid.release:
//            el

final class et
    implements android.content.DialogInterface.OnClickListener
{

    final el a;

    et(el el1)
    {
        a = el1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = a.getActivity();
        if (fragmentactivity == null)
        {
            return;
        } else
        {
            PreferenceManager.getDefaultSharedPreferences(fragmentactivity).edit().putBoolean("music_policy", false).apply();
            dialoginterface.dismiss();
            el.m(a);
            el.l(a);
            return;
        }
    }
}
