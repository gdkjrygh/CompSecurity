// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ag;
import com.nuance.b.b.a.aj;

// Referenced classes of package com.nuance.b.b:
//            co

final class cr
    implements Runnable
{

    final ag a;
    final aj b;
    final co c;

    cr(co co, ag ag1, aj aj)
    {
        c = co;
        a = ag1;
        b = aj;
        super();
    }

    public final void run()
    {
        a.a(b);
    }
}
