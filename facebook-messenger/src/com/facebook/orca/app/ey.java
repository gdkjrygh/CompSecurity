// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.inject.d;
import com.facebook.orca.j.b;

// Referenced classes of package com.facebook.orca.app:
//            dv, dw

class ey extends d
{

    final dv a;

    private ey(dv dv)
    {
        a = dv;
        super();
    }

    ey(dv dv, dw dw)
    {
        this(dv);
    }

    public b a()
    {
        return new b((Context)a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}
