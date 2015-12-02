// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.c.s;
import com.facebook.inject.d;
import com.facebook.orca.activity.n;

// Referenced classes of package com.facebook.orca.app:
//            dv, dw

class eo extends d
{

    final dv a;

    private eo(dv dv)
    {
        a = dv;
        super();
    }

    eo(dv dv, dw dw)
    {
        this(dv);
    }

    public n a()
    {
        return new n((Context)a(android/content/Context), (s)a(com/facebook/c/s));
    }

    public Object b()
    {
        return a();
    }
}
