// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.reflex.e;
import com.facebook.orca.reflex.h;

// Referenced classes of package com.facebook.orca.app:
//            dv, dw

class ev extends d
{

    final dv a;

    private ev(dv dv)
    {
        a = dv;
        super();
    }

    ev(dv dv, dw dw)
    {
        this(dv);
    }

    public h a()
    {
        return new h((e)a(com/facebook/orca/reflex/e));
    }

    public Object b()
    {
        return a();
    }
}
