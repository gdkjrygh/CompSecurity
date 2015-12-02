// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c;

import android.content.Context;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.c:
//            j, d, e

class f extends d
{

    final com.facebook.c.d a;

    private f(com.facebook.c.d d1)
    {
        a = d1;
        super();
    }

    f(com.facebook.c.d d1, e e)
    {
        this(d1);
    }

    public j a()
    {
        return new j((Context)e().a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}
