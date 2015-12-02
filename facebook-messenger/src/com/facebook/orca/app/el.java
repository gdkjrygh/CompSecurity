// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.notify.MessengerForegroundProvider;

// Referenced classes of package com.facebook.orca.app:
//            dv, dw

class el extends d
{

    final dv a;

    private el(dv dv)
    {
        a = dv;
        super();
    }

    el(dv dv, dw dw)
    {
        this(dv);
    }

    public MessengerForegroundProvider a()
    {
        return new MessengerForegroundProvider();
    }

    public Object b()
    {
        return a();
    }
}
