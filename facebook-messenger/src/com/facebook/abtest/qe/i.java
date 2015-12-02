// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe;

import com.facebook.abtest.qe.f.b;
import com.facebook.common.time.a;
import com.facebook.common.time.c;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.abtest.qe:
//            b, g, h

class i extends d
{

    final g a;

    private i(g g)
    {
        a = g;
        super();
    }

    i(g g, h h)
    {
        this(g);
    }

    public com.facebook.abtest.qe.b a()
    {
        return new com.facebook.abtest.qe.b((a)a(com/facebook/common/time/c), (com.facebook.common.l.a)a(com/facebook/common/l/a), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), c(com/facebook/abtest/qe/f/b));
    }

    public Object b()
    {
        return a();
    }
}
