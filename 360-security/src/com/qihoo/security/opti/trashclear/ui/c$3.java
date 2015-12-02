// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.CheckBox;
import com.qihoo.security.locale.d;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            c

class a
    implements android.view..OnClickListener
{

    final c a;

    public void onClick(View view)
    {
        boolean flag1 = a.h;
        if (a.i != null)
        {
            c c1 = a;
            boolean flag;
            if (!a.h)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c1.h = flag;
            if (!a.h)
            {
                c.a(a, a.o.getResources().getColor(0x7f080077));
            } else
            {
                c.a(a, a.o.getResources().getColor(0x7f080025));
            }
            a.g.setText(d.a().a(0x7f0c0238));
            a.i.a(a, flag1, c.a(a), view);
        }
    }

    (c c1)
    {
        a = c1;
        super();
    }
}
