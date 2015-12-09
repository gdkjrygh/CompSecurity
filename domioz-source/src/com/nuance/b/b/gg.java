// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.os.Handler;

// Referenced classes of package com.nuance.b.b:
//            bk, bc

final class gg
    implements Runnable
{

    final bk a;

    gg(bk bk1)
    {
        a = bk1;
        super();
    }

    public final void run()
    {
        if (!bk.a(a))
        {
            com.nuance.dragon.toolkit.audio.g g = bk.b(a);
            if (g != null)
            {
                bc.a(a.a, g);
            }
            if (!bk.a(a))
            {
                bk.d(a).postDelayed(this, bk.c(a));
                return;
            }
        }
    }
}
