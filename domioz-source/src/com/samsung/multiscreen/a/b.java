// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.a;


// Referenced classes of package com.samsung.multiscreen.a:
//            d, c, a, e

final class b
    implements d
{

    final d a;
    final a b;

    b(a a1, d d1)
    {
        b = a1;
        a = d1;
        super();
    }

    public final void onError(e e)
    {
        a.onError(e);
    }

    public final void onResult(Object obj)
    {
        obj = (Boolean)obj;
        if (!((Boolean) (obj)).booleanValue()) goto _L2; else goto _L1
_L1:
        com.samsung.multiscreen.a.a.a(b, c.b);
_L4:
        a.onResult(obj);
        return;
_L2:
        if (com.samsung.multiscreen.a.a.a(b) != c.c)
        {
            com.samsung.multiscreen.a.a.a(b, c.a);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
