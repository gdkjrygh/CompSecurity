// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.material;

import android.view.View;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.b;

// Referenced classes of package com.qihoo.security.widget.material:
//            a

class a extends b
{

    final Runnable a;
    final com.qihoo.security.widget.material.a b;

    public void b(a a1)
    {
        if (!com.qihoo.security.widget.material.a.b(b))
        {
            b.a(0.0F);
            b.a(Integer.valueOf(com.qihoo.security.widget.material.a.c(b)));
        }
        if (a != null && com.qihoo.security.widget.material.a.d(b))
        {
            a.run();
        }
        com.qihoo.security.widget.material.a.a(b).setPressed(false);
    }

    (com.qihoo.security.widget.material.a a1, Runnable runnable)
    {
        b = a1;
        a = runnable;
        super();
    }
}
