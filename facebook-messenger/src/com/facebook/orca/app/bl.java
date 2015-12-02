// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.common.ui.widgets.text.a;
import com.facebook.orca.f.z;
import com.facebook.orca.threads.q;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class bl extends d
{

    final h a;

    private bl(h h)
    {
        a = h;
        super();
    }

    bl(h h, i i)
    {
        this(h);
    }

    public a a()
    {
        return new a((z)a(com/facebook/orca/f/z), (q)a(com/facebook/orca/threads/q));
    }

    public Object b()
    {
        return a();
    }
}
