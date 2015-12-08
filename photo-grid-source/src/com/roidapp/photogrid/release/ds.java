// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.CheckBox;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk

final class ds
    implements android.content.DialogInterface.OnClickListener
{

    final CheckBox a;
    final SharedPreferences b;
    final dk c;

    ds(dk dk1, CheckBox checkbox, SharedPreferences sharedpreferences)
    {
        c = dk1;
        a = checkbox;
        b = sharedpreferences;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (a != null && a.isChecked())
        {
            b.edit().putBoolean("video_single_edit_tip", false).commit();
        }
        dialoginterface.dismiss();
        dk.h(c);
    }
}
