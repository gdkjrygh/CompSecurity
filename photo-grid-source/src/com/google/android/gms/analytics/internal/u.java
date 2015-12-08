// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            s, am

final class u
    implements Runnable
{

    final String a;
    final Runnable b;
    final s c;

    u(s s1, String s2, Runnable runnable)
    {
        c = s1;
        a = s2;
        b = runnable;
        super();
    }

    public final void run()
    {
        s.a(c).a(a);
        if (b != null)
        {
            b.run();
        }
    }
}
