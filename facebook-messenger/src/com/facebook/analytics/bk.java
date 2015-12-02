// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.inject.d;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.facebook.analytics:
//            ay, az

class bk extends d
{

    final ay a;

    private bk(ay ay)
    {
        a = ay;
        super();
    }

    bk(ay ay, az az)
    {
        this(ay);
    }

    public Executor a()
    {
        return Executors.newSingleThreadScheduledExecutor();
    }

    public Object b()
    {
        return a();
    }
}
