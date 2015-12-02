// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.common.e.h;
import com.facebook.inject.d;
import com.facebook.orca.f.k;
import com.facebook.orca.f.r;
import com.facebook.orca.threads.i;
import com.facebook.orca.threads.l;
import com.facebook.orca.threadview.ci;
import com.facebook.orca.threadview.z;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class df extends d
{

    final com.facebook.orca.app.h a;

    private df(com.facebook.orca.app.h h1)
    {
        a = h1;
        super();
    }

    df(com.facebook.orca.app.h h1, com.facebook.orca.app.i j)
    {
        this(h1);
    }

    public ci a()
    {
        return new ci((k)a(com/facebook/orca/f/k), (com.facebook.fbservice.ops.k)a(com/facebook/fbservice/ops/k), (l)a(com/facebook/orca/threads/l), (r)a(com/facebook/orca/f/r), (z)a(com/facebook/orca/threadview/z), (i)a(com/facebook/orca/threads/i), (h)a(com/facebook/common/e/h));
    }

    public Object b()
    {
        return a();
    }
}
