// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.auth.e.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class cn extends d
{

    final h a;

    private cn(h h)
    {
        a = h;
        super();
    }

    cn(h h, i i)
    {
        this(h);
    }

    public Boolean a()
    {
        return Boolean.valueOf(((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d)).a(a.u, false));
    }

    public Object b()
    {
        return a();
    }
}
