// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.h;

import com.facebook.common.annotations.IsDebugLogsEnabled;
import com.facebook.config.a.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.h:
//            a, d, e

class f extends d
{

    final com.facebook.h.d a;

    private f(com.facebook.h.d d1)
    {
        a = d1;
        super();
    }

    f(com.facebook.h.d d1, e e)
    {
        this(d1);
    }

    public com.facebook.h.a a()
    {
        return new com.facebook.h.a((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (a)a(com/facebook/config/a/a), b(java/lang/Boolean, com/facebook/common/annotations/IsDebugLogsEnabled));
    }

    public Object b()
    {
        return a();
    }
}
