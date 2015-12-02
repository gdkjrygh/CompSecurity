// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero;

import android.content.Context;
import com.facebook.analytics.av;
import com.facebook.c.s;
import com.facebook.common.w.q;
import com.facebook.inject.d;
import com.facebook.zero.annotations.IsUserCurrentlyZeroRated;
import com.facebook.zero.d.a;
import com.facebook.zero.ui.o;

// Referenced classes of package com.facebook.zero:
//            c, d

class f extends d
{

    final c a;

    private f(c c)
    {
        a = c;
        super();
    }

    f(c c, com.facebook.zero.d d1)
    {
        this(c);
    }

    public com.facebook.zero.ui.d a()
    {
        return new com.facebook.zero.ui.d((Context)a(android/content/Context), (a)a(com/facebook/zero/d/a), (o)a(com/facebook/zero/ui/o), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (s)a(com/facebook/c/s), (av)a(com/facebook/analytics/av), b(com/facebook/common/w/q, com/facebook/zero/annotations/IsUserCurrentlyZeroRated));
    }

    public Object b()
    {
        return a();
    }
}
