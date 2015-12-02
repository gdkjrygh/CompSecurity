// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push.b;

import com.facebook.config.server.j;
import com.facebook.mqtt.t;

// Referenced classes of package com.facebook.orca.push.b:
//            b, c

class d extends com.facebook.inject.d
{

    final b a;

    private d(b b1)
    {
        a = b1;
        super();
    }

    d(b b1, c c)
    {
        this(b1);
    }

    public t a()
    {
        return ((j)a(com/facebook/config/server/j)).d();
    }

    public Object b()
    {
        return a();
    }
}
