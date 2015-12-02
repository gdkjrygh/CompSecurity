// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.b;

import android.content.Context;
import com.facebook.fbservice.service.o;
import com.facebook.fbservice.service.p;
import com.facebook.inject.ab;

// Referenced classes of package com.facebook.fbservice.b:
//            a, b

class d extends com.facebook.inject.d
{

    final a a;

    private d(a a1)
    {
        a = a1;
        super();
    }

    d(a a1, b b1)
    {
        this(a1);
    }

    public o a()
    {
        return new o((Context)e().a(android/content/Context), (p)a(com/facebook/fbservice/service/p));
    }

    public Object b()
    {
        return a();
    }
}
