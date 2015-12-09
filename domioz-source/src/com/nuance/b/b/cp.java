// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ag;
import com.nuance.b.b.a.ai;

// Referenced classes of package com.nuance.b.b:
//            co

final class cp
    implements Runnable
{

    final ag a;
    final ai b;
    final co c;

    cp(co co, ag ag1, ai ai)
    {
        c = co;
        a = ag1;
        b = ai;
        super();
    }

    public final void run()
    {
        a.a(b);
    }
}
