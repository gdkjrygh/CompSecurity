// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            CollectionDeserializer

private static final class _parent extends com.fasterxml.jackson.databind.deser.impl.parent
{

    private final ccumulator _parent;
    public final List next = new ArrayList();

    public void handleResolvedForwardReference(Object obj, Object obj1)
        throws IOException
    {
        _parent.resolveForwardReference(obj, obj1);
    }

    ccumulator(ccumulator ccumulator, UnresolvedForwardReference unresolvedforwardreference, Class class1)
    {
        super(unresolvedforwardreference, class1);
        _parent = ccumulator;
    }
}
