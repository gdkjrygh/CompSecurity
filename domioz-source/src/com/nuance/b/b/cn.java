// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.e;
import com.nuance.b.b.a.i;

// Referenced classes of package com.nuance.b.b:
//            ci

final class cn
    implements Runnable
{

    final e a;
    final i b;
    final ci c;

    cn(ci ci, e e1, i i)
    {
        c = ci;
        a = e1;
        b = i;
        super();
    }

    public final void run()
    {
        a.onDisconnectError(b);
    }
}
