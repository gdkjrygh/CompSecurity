// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.viewercontext;

import com.facebook.auth.e.a;

// Referenced classes of package com.facebook.auth.viewercontext:
//            ViewerContext, c

public class d
{

    private final com.facebook.prefs.shared.d a;

    public d(com.facebook.prefs.shared.d d1)
    {
        a = d1;
    }

    public ViewerContext a()
    {
        if (a.a())
        {
            String s = a.a(a.c, null);
            String s1 = a.a(a.d, null);
            long l = a.a(a.e, -1L);
            String s2 = a.a(a.f, null);
            String s3 = a.a(a.j, null);
            String s4 = a.a(a.k, null);
            String s5 = a.a(a.m, null);
            if (s1 != null && l != -1L && s != null)
            {
                return ViewerContext.newBuilder().a(s).b(s1).c(s2).d(s3).e(s4).f(s5).h();
            }
        }
        return null;
    }
}
