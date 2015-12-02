// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.service;

import com.facebook.base.broadcast.LocalBroadcast;
import com.facebook.base.broadcast.j;
import com.facebook.common.time.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.abtest.qe.service:
//            d

public final class f extends d
{

    public f()
    {
    }

    public com.facebook.abtest.qe.service.d a()
    {
        return new com.facebook.abtest.qe.service.d((j)a(com/facebook/base/broadcast/j, com/facebook/base/broadcast/LocalBroadcast), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }

    public boolean equals(Object obj)
    {
        return obj instanceof f;
    }
}
