// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.CheckBox;
import com.roidapp.photogrid.release.ig;

// Referenced classes of package com.roidapp.photogrid.video:
//            bp

final class bw
    implements android.content.DialogInterface.OnClickListener
{

    final CheckBox a;
    final SharedPreferences b;
    final ig c;
    final int d;
    final bp e;

    bw(bp bp1, CheckBox checkbox, SharedPreferences sharedpreferences, ig ig, int i)
    {
        e = bp1;
        a = checkbox;
        b = sharedpreferences;
        c = ig;
        d = i;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (a != null && a.isChecked())
        {
            b.edit().putBoolean("video_single_edit_tip", false).apply();
        }
        dialoginterface.dismiss();
        bp.a(e, c, d);
    }
}
