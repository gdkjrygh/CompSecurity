// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.view.View;
import android.widget.CheckBox;

// Referenced classes of package com.fitbit.device.ui:
//            c

class a
    implements android.view..OnClickListener
{

    final c a;

    public void onClick(View view)
    {
        view = c.a(a);
        boolean flag;
        if (!c.a(a).isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setChecked(flag);
    }

    Listener(c c1)
    {
        a = c1;
        super();
    }
}
