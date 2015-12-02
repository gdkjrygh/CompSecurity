// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.device_id;

import com.facebook.common.time.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.device_id:
//            l, b, c

class f extends d
{

    final b a;

    private f(b b1)
    {
        a = b1;
        super();
    }

    f(b b1, c c)
    {
        this(b1);
    }

    public l a()
    {
        return new l((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
