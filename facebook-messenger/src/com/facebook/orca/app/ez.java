// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.common.b.a;
import com.facebook.orca.prefs.o;

// Referenced classes of package com.facebook.orca.app:
//            dv, dw

class ez extends d
{

    final dv a;

    private ez(dv dv)
    {
        a = dv;
        super();
    }

    ez(dv dv, dw dw)
    {
        this(dv);
    }

    public a a()
    {
        if (((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d)).a(o.x, false))
        {
            return a.FB4A;
        } else
        {
            return a.ORCA;
        }
    }

    public Object b()
    {
        return a();
    }
}
