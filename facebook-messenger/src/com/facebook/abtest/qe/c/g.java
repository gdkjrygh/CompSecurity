// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.c;

import com.facebook.common.executors.a;
import com.facebook.inject.d;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.abtest.qe.c:
//            e, c

public final class g extends d
{

    public g()
    {
    }

    public e a()
    {
        return new e((a)a(com/facebook/common/executors/a), (c)a(com/facebook/abtest/qe/c/c), (com.facebook.abtest.qe.protocol.sync.full.d)a(com/facebook/abtest/qe/protocol/sync/full/d), (ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper));
    }

    public Object b()
    {
        return a();
    }

    public boolean equals(Object obj)
    {
        return obj instanceof g;
    }
}
