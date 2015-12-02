// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.protocol.sync.full;

import com.facebook.inject.d;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.abtest.qe.protocol.sync.full:
//            d

public final class e extends d
{

    public e()
    {
    }

    public com.facebook.abtest.qe.protocol.sync.full.d a()
    {
        return new com.facebook.abtest.qe.protocol.sync.full.d((ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper));
    }

    public Object b()
    {
        return a();
    }

    public boolean equals(Object obj)
    {
        return obj instanceof e;
    }
}
