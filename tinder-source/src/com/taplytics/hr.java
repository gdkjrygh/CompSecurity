// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.concurrent.TimeoutException;

// Referenced classes of package com.taplytics:
//            hq

final class hr
    implements Runnable
{

    final hq a;

    hr(hq hq1)
    {
        a = hq1;
        super();
    }

    public final void run()
    {
        a.a(new TimeoutException());
    }
}
