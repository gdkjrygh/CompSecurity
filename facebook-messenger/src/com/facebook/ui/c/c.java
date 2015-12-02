// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.c;

import android.content.Context;
import com.facebook.common.executors.a;
import com.facebook.common.f.f;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.ui.c:
//            d, a, b

class c extends d
{

    final com.facebook.ui.c.a a;

    private c(com.facebook.ui.c.a a1)
    {
        a = a1;
        super();
    }

    c(com.facebook.ui.c.a a1, b b1)
    {
        this(a1);
    }

    public com.facebook.ui.c.d a()
    {
        return new com.facebook.ui.c.d((Context)e().a(android/content/Context), (a)a(com/facebook/common/executors/a), (f)a(com/facebook/common/f/f));
    }

    public Object b()
    {
        return a();
    }
}
