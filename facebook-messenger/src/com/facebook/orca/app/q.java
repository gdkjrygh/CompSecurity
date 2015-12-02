// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.f.ad;
import com.facebook.orca.f.g;
import com.facebook.orca.f.i;
import com.facebook.orca.f.j;
import com.facebook.orca.f.z;

// Referenced classes of package com.facebook.orca.app:
//            g, h, i

class q extends d
{

    final h a;

    private q(h h)
    {
        a = h;
        super();
    }

    q(h h, com.facebook.orca.app.i k)
    {
        this(h);
    }

    public j a()
    {
        return new j((ad)a(com/facebook/orca/f/ad), (z)a(com/facebook/orca/f/z), (com.facebook.orca.app.g)a(com/facebook/orca/app/g), (g)a(com/facebook/orca/f/g), (i)a(com/facebook/orca/f/i), (com.facebook.orca.threads.g)a(com/facebook/orca/threads/g));
    }

    public Object b()
    {
        return a();
    }
}
