// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e.a;

import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.e.a:
//            h, e

class j
    implements Runnable
{

    final h a;

    j(h h1)
    {
        a = h1;
        super();
    }

    public void run()
    {
        try
        {
            h.a(a).e();
            return;
        }
        catch (Exception exception)
        {
            b.e(h.a(), "updateDataUsage throws", exception);
        }
    }
}
