// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e;

import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.e:
//            b, h, i

class j extends d
{

    final h a;

    private j(h h)
    {
        a = h;
        super();
    }

    j(h h, i i)
    {
        this(h);
    }

    public b a()
    {
        return new b((com.facebook.prefs.shared.d)e().a(com/facebook/prefs/shared/d));
    }

    public Object b()
    {
        return a();
    }
}
