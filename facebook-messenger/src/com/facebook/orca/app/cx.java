// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.common.e.h;
import com.facebook.common.time.a;
import com.facebook.inject.d;
import com.facebook.orca.f.ac;
import com.facebook.orca.f.k;
import com.facebook.orca.f.z;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class cx extends d
{

    final com.facebook.orca.app.h a;

    private cx(com.facebook.orca.app.h h1)
    {
        a = h1;
        super();
    }

    cx(com.facebook.orca.app.h h1, i i)
    {
        this(h1);
    }

    public ac a()
    {
        return new ac((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (k)a(com/facebook/orca/f/k), (z)a(com/facebook/orca/f/z), (h)a(com/facebook/common/e/h), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
