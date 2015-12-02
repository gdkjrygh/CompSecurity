// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.v;

import com.facebook.base.broadcast.a;
import com.facebook.common.hardware.q;
import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.common.v:
//            e

public class d
{

    public static final String a = (new StringBuilder()).append(com/facebook/common/v/d.getCanonicalName()).append(".ACTIVITY_MAYBE_CHANGED").toString();
    public static final String b = (new StringBuilder()).append(com/facebook/common/v/d.getCanonicalName()).append(".USER_ENTERED_DEVICE").toString();
    public static final String c = (new StringBuilder()).append(com/facebook/common/v/d.getCanonicalName()).append(".USER_LEFT_DEVICE").toString();
    private static final Class d = com/facebook/common/v/d;
    private final a e;
    private final q f;
    private final com.facebook.common.time.a g;
    private volatile long h;

    public d(a a1, q q1, com.facebook.common.time.a a2)
    {
        e = a1;
        f = q1;
        g = a2;
        f.a(new e(this));
    }

    static void a(d d1)
    {
        d1.c();
    }

    static void b(d d1)
    {
        d1.d();
    }

    private void c()
    {
        com.facebook.debug.log.b.a(d, "onScreenOn");
        e.a(b);
        e.a(a);
    }

    private void d()
    {
        com.facebook.debug.log.b.a(d, "onScreenOff");
        h = g.a();
        e.a(c);
        e.a(a);
    }

    public long a()
    {
        return h;
    }

    public boolean a(long l)
    {
        return f.a() || g.a() - h <= l;
    }

    public boolean b()
    {
        return f.a();
    }

}
