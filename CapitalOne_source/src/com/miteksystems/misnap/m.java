// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.os.Handler;

// Referenced classes of package com.miteksystems.misnap:
//            l

final class m
    implements Runnable
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public final void run()
    {
        if (l.a(a) != null && !l.b(a))
        {
            a.c();
        }
        if (!l.c(a))
        {
            l.d(a).postDelayed(a.e, 1500L);
        }
    }
}
