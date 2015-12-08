// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ag;
import com.nuance.b.b.a.ah;

// Referenced classes of package com.nuance.b.b:
//            co

final class cs
    implements Runnable
{

    final ag a;
    final ah b;
    final co c;

    cs(co co, ag ag1, ah ah)
    {
        c = co;
        a = ag1;
        b = ah;
        super();
    }

    public final void run()
    {
        a.a(b);
    }
}
