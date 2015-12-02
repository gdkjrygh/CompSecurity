// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.app.Activity;
import com.facebook.inject.d;
import com.facebook.ui.f.a;
import com.facebook.ui.f.b;

// Referenced classes of package com.facebook.base.c:
//            a, b

class j extends d
{

    final com.facebook.base.c.a a;

    private j(com.facebook.base.c.a a1)
    {
        a = a1;
        super();
    }

    j(com.facebook.base.c.a a1, com.facebook.base.c.b b1)
    {
        this(a1);
    }

    public b a()
    {
        return new b((Activity)a(android/app/Activity), (a)a(com/facebook/ui/f/a));
    }

    public Object b()
    {
        return a();
    }
}
