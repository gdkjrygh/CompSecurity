// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.roidapp.baselib.view.FlowLayout;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            ch

final class cl
    implements android.content.DialogInterface.OnClickListener
{

    final ch a;

    cl(ch ch1)
    {
        a = ch1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        PreferenceManager.getDefaultSharedPreferences(a.getActivity()).edit().putString("history_tag", "").apply();
        ch.f(a).removeAllViews();
    }
}
