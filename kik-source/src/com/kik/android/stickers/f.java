// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.stickers;

import com.kik.g.r;
import kik.a.d.x;
import org.c.b;

// Referenced classes of package com.kik.android.stickers:
//            c

final class f extends r
{

    final x a;
    final c b;

    f(c c1, x x1)
    {
        b = c1;
        a = x1;
        super();
    }

    public final void a(Object obj)
    {
        com.kik.android.stickers.c.b(a);
    }

    public final void a(Throwable throwable)
    {
        c.c().c("Failed to save sticker pack: %s, reason: %s", a.d(), throwable);
    }
}
