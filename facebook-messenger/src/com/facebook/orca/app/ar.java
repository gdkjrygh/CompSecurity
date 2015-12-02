// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.http.b.ap;
import com.facebook.http.protocol.s;
import com.facebook.inject.d;
import com.facebook.orca.images.h;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class ar extends d
{

    final com.facebook.orca.app.h a;

    private ar(com.facebook.orca.app.h h1)
    {
        a = h1;
        super();
    }

    ar(com.facebook.orca.app.h h1, i i)
    {
        this(h1);
    }

    public h a()
    {
        return new h((ap)a(com/facebook/http/b/ap), (s)a(com/facebook/http/protocol/s));
    }

    public Object b()
    {
        return a();
    }
}
