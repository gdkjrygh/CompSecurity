// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.p.h;
import java.util.Locale;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class cm extends d
{

    final com.facebook.orca.app.h a;

    private cm(com.facebook.orca.app.h h1)
    {
        a = h1;
        super();
    }

    cm(com.facebook.orca.app.h h1, i i)
    {
        this(h1);
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
