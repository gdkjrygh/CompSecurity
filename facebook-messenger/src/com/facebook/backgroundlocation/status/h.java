// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.backgroundlocation.status;

import com.facebook.base.broadcast.LocalBroadcast;
import com.facebook.fbservice.ops.k;
import com.facebook.inject.d;
import com.facebook.nux.status.j;

// Referenced classes of package com.facebook.backgroundlocation.status:
//            d, IsBackgroundLocationEnabled, e, f

class h extends d
{

    final e a;

    private h(e e)
    {
        a = e;
        super();
    }

    h(e e, f f)
    {
        this(e);
    }

    public com.facebook.backgroundlocation.status.d a()
    {
        return new com.facebook.backgroundlocation.status.d(b(java/lang/Boolean, com/facebook/backgroundlocation/status/IsBackgroundLocationEnabled), (j)a(com/facebook/nux/status/j), (k)a(com/facebook/fbservice/ops/k), (com.facebook.base.broadcast.j)a(com/facebook/base/broadcast/j, com/facebook/base/broadcast/LocalBroadcast));
    }

    public Object b()
    {
        return a();
    }
}
