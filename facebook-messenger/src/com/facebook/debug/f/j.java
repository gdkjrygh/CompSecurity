// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.f;

import android.support.v4.a.e;
import com.facebook.common.v.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.debug.f:
//            a, h, i

class j extends d
{

    final h a;

    private j(h h)
    {
        a = h;
        super();
    }

    j(h h, i i)
    {
        this(h);
    }

    public com.facebook.debug.f.a a()
    {
        return new com.facebook.debug.f.a((a)a(com/facebook/common/v/a), (e)a(android/support/v4/a/e), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (com.facebook.common.time.a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
