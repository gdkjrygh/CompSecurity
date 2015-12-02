// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import com.facebook.inject.d;
import com.facebook.user.a.h;
import java.util.Locale;

// Referenced classes of package com.facebook.user:
//            x, y

class z extends d
{

    final x a;

    private z(x x)
    {
        a = x;
        super();
    }

    z(x x, y y)
    {
        this(x);
    }

    public h a()
    {
        return new h(b(java/util/Locale));
    }

    public Object b()
    {
        return a();
    }
}
