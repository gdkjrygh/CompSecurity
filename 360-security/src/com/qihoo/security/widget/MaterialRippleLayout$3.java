// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.view.View;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.b;

// Referenced classes of package com.qihoo.security.widget:
//            MaterialRippleLayout

class a extends b
{

    final Runnable a;
    final MaterialRippleLayout b;

    public void b(a a1)
    {
        if (!com.qihoo.security.widget.MaterialRippleLayout.b(b))
        {
            b.setRadius(0.0F);
            b.setRippleAlpha(Integer.valueOf(MaterialRippleLayout.c(b)));
        }
        if (a != null && MaterialRippleLayout.d(b))
        {
            a.run();
        }
        com.qihoo.security.widget.MaterialRippleLayout.a(b).setPressed(false);
    }

    (MaterialRippleLayout materialripplelayout, Runnable runnable)
    {
        b = materialripplelayout;
        a = runnable;
        super();
    }
}
