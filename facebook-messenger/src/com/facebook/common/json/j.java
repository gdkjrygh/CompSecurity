// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.json;

import com.facebook.inject.d;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.smile.SmileFactory;

// Referenced classes of package com.facebook.common.json:
//            f

class j extends d
{

    private j()
    {
    }

    j(f f)
    {
        this();
    }

    public SmileFactory a()
    {
        return new SmileFactory((ObjectCodec)a(com/fasterxml/jackson/databind/ObjectMapper));
    }

    public Object b()
    {
        return a();
    }
}
