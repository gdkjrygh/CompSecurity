// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.common.v.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.orca.server.aj;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class bh extends d
{

    final h a;

    private bh(h h)
    {
        a = h;
        super();
    }

    bh(h h, i i)
    {
        this(h);
    }

    public aj a()
    {
        return new aj((Context)e().a(android/content/Context), (a)a(com/facebook/common/v/a));
    }

    public Object b()
    {
        return a();
    }
}
