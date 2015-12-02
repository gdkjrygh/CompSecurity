// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.reflex.e;

// Referenced classes of package com.facebook.orca.app:
//            dv, dw

class ew extends d
{

    final dv a;

    private ew(dv dv)
    {
        a = dv;
        super();
    }

    ew(dv dv, dw dw)
    {
        this(dv);
    }

    public e a()
    {
        return new e((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (com.facebook.abtest.qe.d.e)a(com/facebook/abtest/qe/d/e));
    }

    public Object b()
    {
        return a();
    }
}
