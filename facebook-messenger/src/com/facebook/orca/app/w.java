// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.g.f;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class w extends d
{

    final h a;

    private w(h h)
    {
        a = h;
        super();
    }

    w(h h, i i)
    {
        this(h);
    }

    public f a()
    {
        return new f((ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper));
    }

    public Object b()
    {
        return a();
    }
}
