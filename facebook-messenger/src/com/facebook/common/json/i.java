// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.json;

import com.facebook.inject.d;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.common.json:
//            e, f

class i extends d
{

    private i()
    {
    }

    i(f f)
    {
        this();
    }

    public ObjectMapper a()
    {
        return e.a(new ObjectMapper((JsonFactory)a(com/fasterxml/jackson/core/JsonFactory)));
    }

    public Object b()
    {
        return a();
    }
}
