// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero;

import com.facebook.inject.d;
import com.facebook.zero.ui.p;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.zero:
//            c, d

class l extends d
{

    final c a;

    private l(c c)
    {
        a = c;
        super();
    }

    l(c c, com.facebook.zero.d d1)
    {
        this(c);
    }

    public p a()
    {
        return new p((ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper), (JsonFactory)a(com/fasterxml/jackson/core/JsonFactory));
    }

    public Object b()
    {
        return a();
    }
}
