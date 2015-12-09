// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.widget.ImageButton;

// Referenced classes of package com.pandora.android.daydream:
//            b, LightshowView

class a
    implements Runnable
{

    final b a;

    public void run()
    {
        b.c(a, false);
        b.l(a).b();
        b.k(a).setOnClickListener(null);
    }

    tshowView(b b1)
    {
        a = b1;
        super();
    }
}
