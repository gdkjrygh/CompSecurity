// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.widget.Button;
import android.widget.ImageButton;
import p.cw.b;
import p.cw.c;

// Referenced classes of package com.pandora.android.daydream:
//            b

class a
    implements Runnable
{

    final com.pandora.android.daydream.b a;

    public void run()
    {
        com.pandora.android.daydream.b.c(a, true);
        if (b.m(a).d().u() == p.cw.c)
        {
            b.k(a).setOnClickListener(b.n(a));
            return;
        } else
        {
            b.j(a).setOnClickListener(b.n(a));
            return;
        }
    }

    (com.pandora.android.daydream.b b1)
    {
        a = b1;
        super();
    }
}
