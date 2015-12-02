// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import android.view.View;
import com.nineoldandroids.a.b;
import com.nineoldandroids.b.a;
import com.qihoo.security.opti.trashclear.ui.i;

// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            a

class c extends b
{

    final View a;
    final int b;
    final i c;
    final com.qihoo.security.ui.antivirus.list.a d;

    public void b(com.nineoldandroids.a.a a1)
    {
        com.nineoldandroids.b.a.a(a, 1.0F);
        com.nineoldandroids.b.a.d(a, 0.0F);
        a1 = a.getLayoutParams();
        a1.height = b;
        a.setLayoutParams(a1);
        if (com.qihoo.security.ui.antivirus.list.a.a(d) != null)
        {
            com.qihoo.security.ui.antivirus.list.a.a(d).a(c);
        }
    }

    (com.qihoo.security.ui.antivirus.list.a a1, View view, int i, i j)
    {
        d = a1;
        a = view;
        b = i;
        c = j;
        super();
    }
}
