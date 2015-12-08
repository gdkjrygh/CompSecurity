// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.util.ArrayList;
import java.util.List;

final class ccumulator extends com.fasterxml.jackson.databind.deser.impl.cumulator
{

    private final ccumulator _parent;
    public final List next;

    public final void handleResolvedForwardReference(Object obj, Object obj1)
    {
        _parent.resolveForwardReference(obj, obj1);
    }

    private ccumulator(ccumulator ccumulator, UnresolvedForwardReference unresolvedforwardreference, Class class1)
    {
        super(unresolvedforwardreference, class1);
        next = new ArrayList();
        _parent = ccumulator;
    }

    ccumulator(ccumulator ccumulator, UnresolvedForwardReference unresolvedforwardreference, Class class1, ccumulator ccumulator1)
    {
        this(ccumulator, unresolvedforwardreference, class1);
    }
}
