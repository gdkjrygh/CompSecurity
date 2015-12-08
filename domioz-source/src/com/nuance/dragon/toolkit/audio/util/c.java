// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.util;


// Referenced classes of package com.nuance.dragon.toolkit.audio.util:
//            e, a, b

public final class c
{

    final a a;
    private final b b;
    private int c;

    c(a a1, b b1, int i)
    {
        a = a1;
        super();
        b = b1;
        c = i;
    }

    public final Object a()
    {
        e e1;
        Object obj;
        obj = null;
        e1 = ((e) (b)).c;
_L3:
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        if (e1.a != 0) goto _L2; else goto _L1
_L1:
        if (e1 != null)
        {
            obj = e.b(e1);
            if (com.nuance.dragon.toolkit.audio.util.a.a(a) == b)
            {
                com.nuance.dragon.toolkit.audio.util.a.a(a, b.c);
            }
            b.a();
            e1.a(b);
            if (b.c == null)
            {
                com.nuance.dragon.toolkit.audio.util.a.b(a, b);
            }
            com.nuance.dragon.toolkit.audio.util.a.b(a);
            c = c + 1;
        }
        return obj;
_L2:
        e1 = e1.c;
          goto _L3
        e1 = null;
          goto _L1
    }

    public final int b()
    {
        return com.nuance.dragon.toolkit.audio.util.a.c(a) - c;
    }

    public final void c()
    {
        if (com.nuance.dragon.toolkit.audio.util.a.a(a) == b)
        {
            com.nuance.dragon.toolkit.audio.util.a.a(a, b.c);
        }
        if (com.nuance.dragon.toolkit.audio.util.a.d(a) == b)
        {
            com.nuance.dragon.toolkit.audio.util.a.b(a, b.b);
        }
        b.a();
        com.nuance.dragon.toolkit.audio.util.a.b(a);
    }
}
