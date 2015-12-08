// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.io.IOException;

// Referenced classes of package com.google.api.client.util:
//            BackOff, Sleeper

public final class BackOffUtils
{

    private BackOffUtils()
    {
    }

    public static boolean next(Sleeper sleeper, BackOff backoff)
        throws InterruptedException, IOException
    {
        long l = backoff.nextBackOffMillis();
        if (l == -1L)
        {
            return false;
        } else
        {
            sleeper.sleep(l);
            return true;
        }
    }
}
