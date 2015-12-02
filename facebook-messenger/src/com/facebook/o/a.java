// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.o;

import com.b.a.a.c;
import com.b.a.a.g;
import com.b.a.d;
import com.b.a.e;
import com.facebook.common.e.h;
import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.o:
//            b

public class a
{

    private static boolean a = true;
    private static boolean b = false;
    private h c;

    public a(h h)
    {
        c = h;
    }

    public boolean a()
    {
        if (!a)
        {
            com.facebook.debug.log.b.b(com/facebook/o/a, "Strict mode disabled. Not starting.");
            return false;
        }
        if (b)
        {
            com.facebook.debug.log.b.b(com/facebook/o/a, "Strict mode already running but was asked to run again.");
            return true;
        }
        e.setStrictMode(new g[] {
            c.DetectAll, c.PenaltyDropBox
        });
        com.facebook.o.b b1 = new com.facebook.o.b(c);
        try
        {
            e.enableUniqueViolations(true, b1);
            b = true;
        }
        catch (d d1)
        {
            com.facebook.debug.log.b.e(com/facebook/o/a, "Failed to start StrictModeAggregator");
            return false;
        }
        return true;
    }

}
