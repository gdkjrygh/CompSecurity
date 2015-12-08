// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;


// Referenced classes of package com.snapchat.android.analytics.framework:
//            BlizzardEventLogger

public class b
    implements Runnable
{

    private long a;
    private long b;
    private BlizzardEventLogger c;

    public void run()
    {
        if (BlizzardEventLogger.b(c))
        {
            return;
        }
        BlizzardEventLogger.a(c, true);
        BlizzardEventLogger.a(c, a);
        if (BlizzardEventLogger.b(c, a))
        {
            BlizzardEventLogger.a(c, b, a);
            return;
        } else
        {
            BlizzardEventLogger.c(c);
            return;
        }
    }

    public (BlizzardEventLogger blizzardeventlogger, long l, long l1)
    {
        c = blizzardeventlogger;
        a = l;
        b = l1;
        super();
    }
}
