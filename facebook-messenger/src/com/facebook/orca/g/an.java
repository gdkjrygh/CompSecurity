// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import android.content.Context;
import com.facebook.common.executors.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.g:
//            aa, ap, ab, ac

class an extends d
{

    final com.facebook.orca.g.ab a;

    private an(com.facebook.orca.g.ab ab1)
    {
        a = ab1;
        super();
    }

    an(com.facebook.orca.g.ab ab1, ac ac)
    {
        this(ab1);
    }

    public aa a()
    {
        return new aa((Context)e().a(android/content/Context), (a)a(com/facebook/common/executors/a), (com.facebook.d.b.a)a(com/facebook/d/b/a), (ap)a(com/facebook/orca/g/ap));
    }

    public Object b()
    {
        return a();
    }
}
