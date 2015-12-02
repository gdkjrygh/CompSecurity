// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.prefs.az;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class dl extends d
{

    final h a;

    private dl(h h)
    {
        a = h;
        super();
    }

    dl(h h, i i)
    {
        this(h);
    }

    public az a()
    {
        return new az((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d));
    }

    public Object b()
    {
        return a();
    }
}
