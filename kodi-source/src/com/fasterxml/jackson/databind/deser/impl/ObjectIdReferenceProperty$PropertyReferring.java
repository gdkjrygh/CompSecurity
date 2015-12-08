// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            ObjectIdReferenceProperty

public static final class _pojo extends _pojo
{

    private final ObjectIdReferenceProperty _parent;
    public final Object _pojo;

    public void handleResolvedForwardReference(Object obj, Object obj1)
        throws IOException
    {
        if (!hasId(obj))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Trying to resolve a forward reference with id [").append(obj).append("] that wasn't previously seen as unresolved.").toString());
        } else
        {
            _parent.set(_pojo, obj1);
            return;
        }
    }

    public (ObjectIdReferenceProperty objectidreferenceproperty, UnresolvedForwardReference unresolvedforwardreference, Class class1, Object obj)
    {
        super(unresolvedforwardreference, class1);
        _parent = objectidreferenceproperty;
        _pojo = obj;
    }
}
