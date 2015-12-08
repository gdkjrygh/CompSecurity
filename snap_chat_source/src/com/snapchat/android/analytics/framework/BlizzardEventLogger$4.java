// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import android.content.SharedPreferences;

// Referenced classes of package com.snapchat.android.analytics.framework:
//            BlizzardEventLogger, Constants

public class b
    implements Runnable
{

    private long a;
    private long b;
    private BlizzardEventLogger c;

    public void run()
    {
        if (!BlizzardEventLogger.b(c))
        {
            return;
        } else
        {
            long l = BlizzardEventLogger.d(c).getLong(Constants.g, 0L);
            long l1 = BlizzardEventLogger.a(a - BlizzardEventLogger.e(c));
            BlizzardEventLogger.d(c).edit().putLong(Constants.d, a).putLong(Constants.e, b).putLong(Constants.g, l + l1).putBoolean(Constants.f, true).commit();
            BlizzardEventLogger.a(c, -1L);
            BlizzardEventLogger.a(c, false);
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
