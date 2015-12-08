// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.view.View;
import android.widget.CheckBox;

// Referenced classes of package com.roidapp.photogrid.video:
//            bp

final class bu
    implements android.view.View.OnClickListener
{

    final CheckBox a;
    final bp b;

    bu(bp bp, CheckBox checkbox)
    {
        b = bp;
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
