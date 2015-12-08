// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.CheckBox;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk

final class dq
    implements android.view.View.OnClickListener
{

    final CheckBox a;
    final dk b;

    dq(dk dk, CheckBox checkbox)
    {
        b = dk;
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
