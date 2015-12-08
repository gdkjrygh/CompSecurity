// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import org.json.JSONArray;

// Referenced classes of package com.snapchat.android.analytics.framework:
//            BlizzardEventLogger

class c
    implements Runnable
{

    private JSONArray a;
    private long b;
    private long c;
    private BlizzardEventLogger d;

    public void run()
    {
        BlizzardEventLogger.a(d, a, b, c);
    }

    (BlizzardEventLogger blizzardeventlogger, JSONArray jsonarray, long l, long l1)
    {
        d = blizzardeventlogger;
        a = jsonarray;
        b = l;
        c = l1;
        super();
    }
}
