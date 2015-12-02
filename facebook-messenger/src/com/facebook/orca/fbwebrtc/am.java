// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.content.Context;
import com.facebook.c.s;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            l, bb, ai, aj

class am extends d
{

    final ai a;

    private am(ai ai)
    {
        a = ai;
        super();
    }

    am(ai ai, aj aj)
    {
        this(ai);
    }

    public l a()
    {
        return new l((Context)a(android/content/Context), (bb)a(com/facebook/orca/fbwebrtc/bb), (s)a(com/facebook/c/s));
    }

    public Object b()
    {
        return a();
    }
}
