// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.lrc;

import android.os.Handler;

// Referenced classes of package com.arist.model.lrc:
//            a, DeskLrcView

final class b
    implements Runnable
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        a.a = true;
        com.arist.model.lrc.a.a(a).invalidate();
        com.arist.model.lrc.a.b(a).postDelayed(com.arist.model.lrc.a.c(a), 3000L);
    }
}
