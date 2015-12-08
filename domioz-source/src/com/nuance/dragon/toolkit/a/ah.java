// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import com.nuance.dragon.toolkit.b.e;
import com.nuance.dragon.toolkit.d.b.c;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            ai, e

public final class ah extends ai
{

    protected final e a;

    public ah(String s, e e1)
    {
        this(s, e1, (byte)0);
    }

    private ah(String s, e e1, byte byte0)
    {
        super(6, s);
        c.a("dict", e1);
        a = e1;
    }

    final void a(com.nuance.dragon.toolkit.a.e e1)
    {
        e1.a(b, a);
    }
}
