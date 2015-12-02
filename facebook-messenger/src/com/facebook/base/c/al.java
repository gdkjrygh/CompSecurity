// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import com.facebook.common.c.i;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class al extends d
{

    final a a;

    private al(a a1)
    {
        a = a1;
        super();
    }

    al(a a1, b b1)
    {
        this(a1);
    }

    public i a()
    {
        return new i(Runtime.getRuntime());
    }

    public Object b()
    {
        return a();
    }
}
