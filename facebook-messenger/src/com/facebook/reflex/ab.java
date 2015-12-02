// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import com.facebook.inject.d;
import com.facebook.reflex.a.c;

// Referenced classes of package com.facebook.reflex:
//            z, aa

class ab extends d
{

    final z a;

    private ab(z z)
    {
        a = z;
        super();
    }

    ab(z z, aa aa)
    {
        this(z);
    }

    public c a()
    {
        return new c((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d));
    }

    public Object b()
    {
        return a();
    }
}
