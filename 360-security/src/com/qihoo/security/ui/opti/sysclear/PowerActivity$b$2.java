// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.view.View;
import android.widget.CheckBox;
import com.qihoo.security.support.b;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            PowerActivity

class a
    implements android.view.er
{

    final a a;
    final a b;

    public void onClick(View view)
    {
        int i;
        boolean flag;
        flag = ((CheckBox)view).isChecked();
        i = PowerActivity.f(b.b);
        if (!flag) goto _L2; else goto _L1
_L1:
        PowerActivity.e(b.b, a.a);
        a.a = true;
        if (a.a)
        {
            com.qihoo.security.support.b.c(11308);
        }
_L4:
        if (a.a)
        {
            a.a = false;
        }
        ((CheckBox)view).setChecked(flag);
        PowerActivity.a(b.b, false, PowerActivity.f(b.b), i);
        b.tifyDataSetChanged();
        return;
_L2:
        PowerActivity.f(b.b, a.a);
        a.a = false;
        if (!a.a)
        {
            com.qihoo.security.support.b.c(11307);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ( ,  1)
    {
        b = ;
        a = 1;
        super();
    }
}
