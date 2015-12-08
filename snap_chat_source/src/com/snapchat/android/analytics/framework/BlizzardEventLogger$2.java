// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import kl;

// Referenced classes of package com.snapchat.android.analytics.framework:
//            BlizzardEventLogger

class b
    implements Runnable
{

    private kl a;
    private long b;
    private BlizzardEventLogger c;

    public void run()
    {
        Boolean boolean1 = a.userNotTracked;
        if (boolean1 == null || !boolean1.booleanValue())
        {
            a.userId = BlizzardEventLogger.a(c).a();
        }
        BlizzardEventLogger.a(c, a, b);
    }

    erPropertiesInterface(BlizzardEventLogger blizzardeventlogger, kl kl1, long l)
    {
        c = blizzardeventlogger;
        a = kl1;
        b = l;
        super();
    }
}
