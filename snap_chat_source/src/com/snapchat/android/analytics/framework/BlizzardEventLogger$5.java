// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;


// Referenced classes of package com.snapchat.android.analytics.framework:
//            BlizzardEventLogger

public class a
    implements Runnable
{

    private BlizzardEventLogger a;

    public void run()
    {
        BlizzardEventLogger.f(a);
    }

    public (BlizzardEventLogger blizzardeventlogger)
    {
        a = blizzardeventlogger;
        super();
    }
}
