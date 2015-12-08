// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import kk;

// Referenced classes of package com.snapchat.android.analytics.framework:
//            BlizzardEventLogger

class b
    implements Runnable
{

    private kk a;
    private long b;
    private BlizzardEventLogger c;

    public void run()
    {
        BlizzardEventLogger.a(c, a, b);
    }

    (BlizzardEventLogger blizzardeventlogger, kk kk, long l)
    {
        c = blizzardeventlogger;
        a = kk;
        b = l;
        super();
    }
}
