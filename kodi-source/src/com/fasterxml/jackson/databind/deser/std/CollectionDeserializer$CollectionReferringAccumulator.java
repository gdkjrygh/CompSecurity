// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            CollectionDeserializer

public static final class _result
{

    private List _accumulator;
    private final Class _elementType;
    private final Collection _result;

    public void add(Object obj)
    {
        if (_accumulator.isEmpty())
        {
            _result.add(obj);
            return;
        } else
        {
            ((_result)_accumulator.get(_accumulator.size() - 1))._accumulator.add(obj);
            return;
        }
    }

    public com.fasterxml.jackson.databind.deser.impl.accumulator handleUnresolvedReference(UnresolvedForwardReference unresolvedforwardreference)
    {
        unresolvedforwardreference = new _accumulator(this, unresolvedforwardreference, _elementType);
        _accumulator.add(unresolvedforwardreference);
        return unresolvedforwardreference;
    }

    public void resolveForwardReference(Object obj, Object obj1)
        throws IOException
    {
        Iterator iterator = _accumulator.iterator();
        _accumulator _laccumulator;
        for (Object obj2 = _result; iterator.hasNext(); obj2 = _laccumulator._result)
        {
            _laccumulator = (_result)iterator.next();
            if (_laccumulator._result(obj))
            {
                iterator.remove();
                ((Collection) (obj2)).add(obj1);
                ((Collection) (obj2)).addAll(_laccumulator._result);
                return;
            }
        }

        throw new IllegalArgumentException((new StringBuilder()).append("Trying to resolve a forward reference with id [").append(obj).append("] that wasn't previously seen as unresolved.").toString());
    }

    public (Class class1, Collection collection)
    {
        _accumulator = new ArrayList();
        _elementType = class1;
        _result = collection;
    }
}
