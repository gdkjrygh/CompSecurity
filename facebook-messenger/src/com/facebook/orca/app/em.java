// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.auth.login.y;
import com.facebook.c.s;
import com.facebook.inject.d;
import com.facebook.orca.auth.StartScreenActivity;

// Referenced classes of package com.facebook.orca.app:
//            dv, dw

class em extends d
{

    final dv a;

    private em(dv dv)
    {
        a = dv;
        super();
    }

    em(dv dv, dw dw)
    {
        this(dv);
    }

    public y a()
    {
        return new y((s)a(com/facebook/c/s), com/facebook/orca/auth/StartScreenActivity);
    }

    public Object b()
    {
        return a();
    }
}
