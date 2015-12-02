// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.c;

import android.content.Context;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.ui.images.a.a;

// Referenced classes of package com.facebook.ui.images.c:
//            a, b

class h extends d
{

    final com.facebook.ui.images.c.a a;

    private h(com.facebook.ui.images.c.a a1)
    {
        a = a1;
        super();
    }

    h(com.facebook.ui.images.c.a a1, b b1)
    {
        this(a1);
    }

    public a a()
    {
        return new a((Context)e().a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}
