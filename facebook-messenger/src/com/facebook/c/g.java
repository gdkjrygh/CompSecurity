// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c;

import android.content.Context;
import com.facebook.common.e.h;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.c:
//            s, t, o, d, 
//            e

class g extends d
{

    final com.facebook.c.d a;

    private g(com.facebook.c.d d1)
    {
        a = d1;
        super();
    }

    g(com.facebook.c.d d1, e e)
    {
        this(d1);
    }

    public s a()
    {
        return new s(((Context)e().a(android/content/Context)).getPackageName(), (t)a(com/facebook/c/t), (h)a(com/facebook/common/e/h), c(com/facebook/c/o));
    }

    public Object b()
    {
        return a();
    }
}
