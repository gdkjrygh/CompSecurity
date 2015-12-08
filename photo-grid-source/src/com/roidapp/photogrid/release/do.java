// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk

final class do
    implements android.content.DialogInterface.OnClickListener
{

    final dk a;

    do(dk dk1)
    {
        a = dk1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        PreferenceManager.getDefaultSharedPreferences(a.getActivity()).edit().putBoolean("music_policy", false).apply();
        dialoginterface.dismiss();
        dk.a(a, false);
        dk.l(a);
    }
}
