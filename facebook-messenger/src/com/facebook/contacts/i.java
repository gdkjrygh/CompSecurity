// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import com.facebook.contacts.g.c;
import com.facebook.inject.d;
import com.fasterxml.jackson.core.JsonFactory;

// Referenced classes of package com.facebook.contacts:
//            a, b

class i extends d
{

    final a a;

    private i(a a1)
    {
        a = a1;
        super();
    }

    i(a a1, b b1)
    {
        this(a1);
    }

    public c a()
    {
        return new c((JsonFactory)a(com/fasterxml/jackson/core/JsonFactory));
    }

    public Object b()
    {
        return a();
    }
}
