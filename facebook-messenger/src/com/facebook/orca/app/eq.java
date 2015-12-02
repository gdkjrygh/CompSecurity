// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.orca.n.a;
import com.facebook.orca.notify.av;

// Referenced classes of package com.facebook.orca.app:
//            dv, dw

class eq extends d
{

    final dv a;

    private eq(dv dv)
    {
        a = dv;
        super();
    }

    eq(dv dv, dw dw)
    {
        this(dv);
    }

    public a a()
    {
        return new a((Context)e().a(android/content/Context), (av)a(com/facebook/orca/notify/av));
    }

    public Object b()
    {
        return a();
    }
}
