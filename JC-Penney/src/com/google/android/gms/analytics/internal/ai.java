// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            ah, af, e

class ai
    implements Runnable
{

    final e a;
    final ah b;

    ai(ah ah1, e e)
    {
        b = ah1;
        a = e;
        super();
    }

    public void run()
    {
        if (!b.a.b())
        {
            b.a.c("Connected to service after a timeout");
            af.a(b.a, a);
        }
    }
}
