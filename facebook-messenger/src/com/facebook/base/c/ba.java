// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import com.facebook.auth.annotations.IsMeUserAnEmployee;
import com.facebook.common.e.o;
import com.facebook.common.w.q;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class ba extends d
{

    final a a;

    private ba(a a1)
    {
        a = a1;
        super();
    }

    ba(a a1, b b1)
    {
        this(a1);
    }

    public o a()
    {
        return new o(b(com/facebook/common/w/q, com/facebook/auth/annotations/IsMeUserAnEmployee));
    }

    public Object b()
    {
        return a();
    }
}
