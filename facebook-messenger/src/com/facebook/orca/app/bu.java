// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.auth.b.b;
import com.facebook.common.executors.a;
import com.facebook.inject.d;
import com.facebook.orca.g.aa;
import com.facebook.orca.prefs.az;
import com.facebook.prefs.shared.j;

// Referenced classes of package com.facebook.orca.app:
//            fg, g, dt, h, 
//            i

class bu extends d
{

    final h a;

    private bu(h h)
    {
        a = h;
        super();
    }

    bu(h h, i i)
    {
        this(h);
    }

    public fg a()
    {
        return new fg((b)a(com/facebook/auth/b/b), (aa)a(com/facebook/orca/g/aa), (j)a(com/facebook/prefs/shared/j), (az)a(com/facebook/orca/prefs/az), (a)a(com/facebook/common/executors/a), (g)a(com/facebook/orca/app/g), (com.facebook.contacts.data.b)a(com/facebook/contacts/data/b), b(com/facebook/orca/app/dt), (com.facebook.config.a.a)a(com/facebook/config/a/a));
    }

    public Object b()
    {
        return a();
    }
}
