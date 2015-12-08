// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.CheckBox;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            SelfieCamImageShowActivity

final class i
    implements android.content.DialogInterface.OnClickListener
{

    final CheckBox a;
    final SharedPreferences b;
    final SelfieCamImageShowActivity c;

    i(SelfieCamImageShowActivity selfiecamimageshowactivity, CheckBox checkbox, SharedPreferences sharedpreferences)
    {
        c = selfiecamimageshowactivity;
        a = checkbox;
        b = sharedpreferences;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        if (a != null && a.isChecked())
        {
            b.edit().putBoolean("selfie_camera_edit_tip", false).apply();
        }
        dialoginterface.dismiss();
        SelfieCamImageShowActivity.d(c);
    }
}
