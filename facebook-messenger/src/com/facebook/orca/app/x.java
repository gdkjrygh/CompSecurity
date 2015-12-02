// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.g.g;
import com.facebook.orca.g.o;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class x extends d
{

    final h a;

    private x(h h)
    {
        a = h;
        super();
    }

    x(h h, i i)
    {
        this(h);
    }

    public g a()
    {
        return new g((o)a(com/facebook/orca/g/o), (ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper));
    }

    public Object b()
    {
        return a();
    }
}
