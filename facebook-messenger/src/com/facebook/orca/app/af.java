// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.fbservice.ops.k;
import com.facebook.inject.d;
import com.facebook.orca.f.l;
import com.facebook.push.mqtt.v;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class af extends d
{

    final h a;

    private af(h h)
    {
        a = h;
        super();
    }

    af(h h, i i)
    {
        this(h);
    }

    public l a()
    {
        return new l((k)a(com/facebook/fbservice/ops/k), (com.facebook.orca.f.k)a(com/facebook/orca/f/k), (v)a(com/facebook/push/mqtt/v));
    }

    public Object b()
    {
        return a();
    }
}
