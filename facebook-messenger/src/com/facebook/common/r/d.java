// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.r;

import android.content.Context;
import com.facebook.common.time.a;
import com.facebook.common.time.c;
import com.facebook.inject.ab;

// Referenced classes of package com.facebook.common.r:
//            a, b, c, e

class d extends com.facebook.inject.d
{

    final b a;

    private d(b b1)
    {
        a = b1;
        super();
    }

    d(b b1, com.facebook.common.r.c c1)
    {
        this(b1);
    }

    public e a()
    {
        return new com.facebook.common.r.a((Context)e().a(android/content/Context), (a)a(com/facebook/common/time/c));
    }

    public Object b()
    {
        return a();
    }
}
