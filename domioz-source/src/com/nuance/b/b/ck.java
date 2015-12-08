// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.b;
import com.nuance.b.b.a.e;

// Referenced classes of package com.nuance.b.b:
//            ci

final class ck
    implements Runnable
{

    final e a;
    final b b;
    final ci c;

    ck(ci ci, e e1, b b1)
    {
        c = ci;
        a = e1;
        b = b1;
        super();
    }

    public final void run()
    {
        a.onConnect(b);
    }
}
