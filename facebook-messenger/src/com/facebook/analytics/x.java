// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            y, f, g, ak

class x extends d
{

    final f a;

    private x(f f)
    {
        a = f;
        super();
    }

    x(f f, g g)
    {
        this(f);
    }

    public ak a()
    {
        return new y(this);
    }

    public Object b()
    {
        return a();
    }
}
