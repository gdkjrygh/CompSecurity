// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.app:
//            fk, dv, dw

class es extends d
{

    final dv a;

    private es(dv dv1)
    {
        a = dv1;
        super();
    }

    es(dv dv1, dw dw)
    {
        this(dv1);
    }

    public fk a()
    {
        return new fk(dv.a(a), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d));
    }

    public Object b()
    {
        return a();
    }
}
