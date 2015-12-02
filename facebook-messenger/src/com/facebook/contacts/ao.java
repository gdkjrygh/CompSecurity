// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import com.facebook.contacts.g.k;
import com.facebook.inject.d;
import com.fasterxml.jackson.core.JsonFactory;

// Referenced classes of package com.facebook.contacts:
//            a, b

class ao extends d
{

    final a a;

    private ao(a a1)
    {
        a = a1;
        super();
    }

    ao(a a1, b b1)
    {
        this(a1);
    }

    public k a()
    {
        return new k((JsonFactory)a(com/fasterxml/jackson/core/JsonFactory));
    }

    public Object b()
    {
        return a();
    }
}
