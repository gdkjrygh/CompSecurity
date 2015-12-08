// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.view.View;
import android.widget.CheckBox;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            SelfieCamImageShowActivity

final class g
    implements android.view.View.OnClickListener
{

    final CheckBox a;
    final SelfieCamImageShowActivity b;

    g(SelfieCamImageShowActivity selfiecamimageshowactivity, CheckBox checkbox)
    {
        b = selfiecamimageshowactivity;
        a = checkbox;
        super();
    }

    public final void onClick(View view)
    {
        view = a;
        boolean flag;
        if (!a.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setChecked(flag);
    }
}
