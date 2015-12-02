// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.content.Context;
import com.facebook.analytics.i.c;
import com.facebook.inject.t;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.analytics:
//            a, cb, ch, av

public class cg
{

    private final av a;
    private final a b;

    public cg(Context context)
    {
        Preconditions.checkNotNull(context);
        a = c.a(context);
        b = (a)t.a(context).a(com/facebook/analytics/a);
    }

    public cg(av av, a a1)
    {
        a = av;
        b = a1;
    }

    public cb a(ch ch1, String s, String s1, long l)
    {
        ch1 = (new cb("content")).a("flags", ch1.getValue());
        ch1.a(l);
        if (s != null)
        {
            ch1.e(s);
        }
        if (s1 != null)
        {
            ch1.h(s1);
        }
        return ch1;
    }
}
