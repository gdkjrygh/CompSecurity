// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.analytics:
//            aq, at

final class av extends TimerTask
{

    final aq a;

    private av(aq aq1)
    {
        a = aq1;
        super();
    }

    av(aq aq1, byte byte0)
    {
        this(aq1);
    }

    public final void run()
    {
        if (aq.b(a) == at.a)
        {
            aq.c(a);
        }
    }
}
