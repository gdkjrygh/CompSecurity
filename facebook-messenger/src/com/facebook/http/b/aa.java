// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import com.facebook.http.protocol.s;
import com.facebook.inject.d;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.http.b:
//            w, x

class aa extends d
{

    final w a;

    private aa(w w)
    {
        a = w;
        super();
    }

    aa(w w, x x)
    {
        this(w);
    }

    public s a()
    {
        return new s((ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper));
    }

    public Object b()
    {
        return a();
    }
}
