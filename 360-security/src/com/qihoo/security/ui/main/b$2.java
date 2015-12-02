// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.view.View;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.k;

// Referenced classes of package com.qihoo.security.ui.main:
//            b

class b
    implements com.nineoldandroids.a..b._cls2
{

    final View a;
    final com.nineoldandroids.a.d b;
    final b c;

    public void a(a a1)
    {
        a.setVisibility(0);
        if (b != null)
        {
            b.a(a1);
        }
    }

    public void b(a a1)
    {
        a.setVisibility(8);
        if (b != null)
        {
            b.b(a1);
        }
        if (com.qihoo.security.ui.main.b.a(c) != null)
        {
            com.qihoo.security.ui.main.b.a(c).a();
        }
    }

    public void c(a a1)
    {
        if (b != null)
        {
            b.c(a1);
        }
    }

    public void d(a a1)
    {
        if (b != null)
        {
            b.d(a1);
        }
    }

    (b b1, View view, com.nineoldandroids.a..b b2)
    {
        c = b1;
        a = view;
        b = b2;
        super();
    }
}
