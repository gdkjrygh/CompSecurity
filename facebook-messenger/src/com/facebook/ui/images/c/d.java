// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.c;

import com.facebook.common.executors.a;
import com.facebook.ui.images.b.c;

// Referenced classes of package com.facebook.ui.images.c:
//            a, b

class d extends com.facebook.inject.d
{

    final com.facebook.ui.images.c.a a;

    private d(com.facebook.ui.images.c.a a1)
    {
        a = a1;
        super();
    }

    d(com.facebook.ui.images.c.a a1, b b1)
    {
        this(a1);
    }

    public c a()
    {
        return new c((a)a(com/facebook/common/executors/a));
    }

    public Object b()
    {
        return a();
    }
}
