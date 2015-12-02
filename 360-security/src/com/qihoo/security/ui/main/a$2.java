// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.view.View;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.b;

// Referenced classes of package com.qihoo.security.ui.main:
//            a

static final class c extends b
{

    final View a;
    final b b;
    final boolean c;

    public void a(a a1)
    {
        a.setVisibility(0);
    }

    public void b(a a1)
    {
        if (b != null && c)
        {
            b.b(a1);
        }
    }

    (View view, b b1, boolean flag)
    {
        a = view;
        b = b1;
        c = flag;
        super();
    }
}
