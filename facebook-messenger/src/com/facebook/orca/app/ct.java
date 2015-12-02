// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.attachments.a;
import com.facebook.orca.f.k;
import com.facebook.orca.f.z;
import com.facebook.orca.threads.q;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class ct extends d
{

    final h a;

    private ct(h h)
    {
        a = h;
        super();
    }

    ct(h h, i i)
    {
        this(h);
    }

    public z a()
    {
        return new z((k)a(com/facebook/orca/f/k), (a)a(com/facebook/orca/attachments/a), (q)a(com/facebook/orca/threads/q));
    }

    public Object b()
    {
        return a();
    }
}
