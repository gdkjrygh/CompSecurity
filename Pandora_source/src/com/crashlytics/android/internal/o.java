// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.util.Collections;

// Referenced classes of package com.crashlytics.android.internal:
//            n, v, u, t, 
//            ba

final class o
    implements Runnable
{

    private String a;
    private n b;

    o(n n1, String s)
    {
        b = n1;
        a = s;
        super();
    }

    public final void run()
    {
        try
        {
            t t1 = b.a;
            String s = n.a(b);
            String s1 = n.b(b);
            String s2 = n.c(b);
            String s3 = n.d(b);
            String s4 = n.e(b);
            String s5 = n.f(b);
            String s6 = n.g(b);
            String s7 = n.h(b);
            java.util.Map map = Collections.singletonMap("sessionId", a);
            t1.a(u.a(s, s1, s2, s3, s4, s5, s6, s7, v.i, map));
            return;
        }
        catch (Exception exception)
        {
            ba.d("Crashlytics failed to record crash event");
        }
    }
}
