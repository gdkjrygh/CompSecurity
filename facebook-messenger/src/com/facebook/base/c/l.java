// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.content.Context;
import com.facebook.common.hardware.a;
import com.facebook.common.hardware.u;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class l extends d
{

    final com.facebook.base.c.a a;

    private l(com.facebook.base.c.a a1)
    {
        a = a1;
        super();
    }

    l(com.facebook.base.c.a a1, b b1)
    {
        this(a1);
    }

    public a a()
    {
        return new u((Context)e().a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}
