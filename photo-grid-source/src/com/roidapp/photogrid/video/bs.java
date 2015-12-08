// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.CheckBox;

// Referenced classes of package com.roidapp.photogrid.video:
//            bp

final class bs
    implements android.content.DialogInterface.OnClickListener
{

    final SharedPreferences a;
    final CheckBox b;
    final bp c;

    bs(bp bp, SharedPreferences sharedpreferences, CheckBox checkbox)
    {
        c = bp;
        a = sharedpreferences;
        b = checkbox;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        boolean flag;
        if (!b.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        editor.putBoolean("video_exit_tip", flag).apply();
        dialoginterface.dismiss();
    }
}
