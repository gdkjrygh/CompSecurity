// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.messages.ipc.k;
import com.facebook.orca.intents.f;

// Referenced classes of package com.facebook.orca.app:
//            dv, dw

class eg extends d
{

    final dv a;

    private eg(dv dv)
    {
        a = dv;
        super();
    }

    eg(dv dv, dw dw)
    {
        this(dv);
    }

    public k a()
    {
        return new f();
    }

    public Object b()
    {
        return a();
    }
}
