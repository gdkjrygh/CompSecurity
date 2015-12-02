// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.breakpad;

import android.content.Context;
import com.facebook.analytics.av;
import com.facebook.common.e.h;
import com.facebook.inject.ab;

// Referenced classes of package com.facebook.breakpad:
//            BreakpadManager, b, c

class d extends com.facebook.inject.d
{

    final b a;

    private d(b b1)
    {
        a = b1;
        super();
    }

    d(b b1, c c)
    {
        this(b1);
    }

    public BreakpadManager a()
    {
        return new BreakpadManager(((Context)e().a(android/content/Context)).getDir("minidumps", 0), (av)a(com/facebook/analytics/av), (h)a(com/facebook/common/e/h));
    }

    public Object b()
    {
        return a();
    }
}
