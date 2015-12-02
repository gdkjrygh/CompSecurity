// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.f.ad;
import com.facebook.orca.f.z;
import com.facebook.orca.g.aa;
import com.facebook.orca.g.p;

// Referenced classes of package com.facebook.orca.app:
//            dt, h, i

class bg extends d
{

    final h a;

    private bg(h h)
    {
        a = h;
        super();
    }

    bg(h h, i i)
    {
        this(h);
    }

    public dt a()
    {
        return new dt((aa)a(com/facebook/orca/g/aa), (p)a(com/facebook/orca/g/p), (ad)a(com/facebook/orca/f/ad), (z)a(com/facebook/orca/f/z));
    }

    public Object b()
    {
        return a();
    }
}
