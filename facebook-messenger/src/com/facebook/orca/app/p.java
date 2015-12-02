// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.f.ad;
import com.facebook.orca.f.i;
import com.facebook.orca.f.z;
import com.facebook.orca.prefs.av;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class p extends d
{

    final h a;

    private p(h h)
    {
        a = h;
        super();
    }

    p(h h, com.facebook.orca.app.i j)
    {
        this(h);
    }

    public i a()
    {
        return new i((ad)a(com/facebook/orca/f/ad), (z)a(com/facebook/orca/f/z), (av)a(com/facebook/orca/prefs/av));
    }

    public Object b()
    {
        return a();
    }
}
