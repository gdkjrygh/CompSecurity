// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.background;

import com.facebook.auth.b.b;
import com.facebook.common.v.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.orca.annotations.CurrentFolder;
import com.facebook.orca.f.k;
import com.facebook.orca.threads.FolderType;

// Referenced classes of package com.facebook.orca.background:
//            c, f, g

class i extends d
{

    final f a;

    private i(f f)
    {
        a = f;
        super();
    }

    i(f f, g g)
    {
        this(f);
    }

    public c a()
    {
        return new c((b)a(com/facebook/auth/b/b), b(com/facebook/orca/threads/FolderType, com/facebook/orca/annotations/CurrentFolder), b(com/facebook/orca/g/b), b(com/facebook/orca/f/k), (com.facebook.fbservice.ops.k)e().a(com/facebook/fbservice/ops/k), (a)a(com/facebook/common/v/a), (com.facebook.common.time.a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
