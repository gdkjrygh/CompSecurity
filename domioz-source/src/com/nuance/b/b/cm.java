// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.e;
import com.nuance.b.b.a.h;

// Referenced classes of package com.nuance.b.b:
//            ci

final class cm
    implements Runnable
{

    final e a;
    final h b;
    final ci c;

    cm(ci ci, e e1, h h)
    {
        c = ci;
        a = e1;
        b = h;
        super();
    }

    public final void run()
    {
        a.onDisconnect(b);
    }
}
