// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe;

import com.facebook.inject.d;
import com.facebook.prefs.provider.a;

// Referenced classes of package com.facebook.abtest.qe:
//            o, l, m

class n extends d
{

    final l a;

    private n(l l)
    {
        a = l;
        super();
    }

    n(l l, m m)
    {
        this(l);
    }

    public a a()
    {
        return new o(this);
    }

    public Object b()
    {
        return a();
    }
}
