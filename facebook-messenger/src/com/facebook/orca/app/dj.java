// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.common.time.a;
import com.facebook.inject.d;
import com.facebook.orca.f.ad;
import com.facebook.orca.f.af;
import com.facebook.push.mqtt.v;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class dj extends d
{

    final h a;

    private dj(h h)
    {
        a = h;
        super();
    }

    dj(h h, i i)
    {
        this(h);
    }

    public af a()
    {
        return new af((ad)a(com/facebook/orca/f/ad), (v)a(com/facebook/push/mqtt/v), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
