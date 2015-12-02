// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.b;

import android.content.Context;
import com.facebook.common.process.c;
import com.facebook.fbservice.service.p;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.fbservice.b:
//            a, b

class e extends d
{

    final a a;

    private e(a a1)
    {
        a = a1;
        super();
    }

    e(a a1, b b1)
    {
        this(a1);
    }

    public p a()
    {
        return new p((Context)a(android/content/Context), (c)a(com/facebook/common/process/c));
    }

    public Object b()
    {
        return a();
    }
}
