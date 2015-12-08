// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            MapDeserializer

private static final class _result
{

    private List _accumulator;
    private Map _result;
    private final Class _valueType;

    public com.fasterxml.jackson.databind.deser.impl.result handleUnresolvedReference(UnresolvedForwardReference unresolvedforwardreference, Object obj)
    {
        unresolvedforwardreference = new _result(this, unresolvedforwardreference, _valueType, obj);
        _accumulator.add(unresolvedforwardreference);
        return unresolvedforwardreference;
    }

    public void put(Object obj, Object obj1)
    {
        if (_accumulator.isEmpty())
        {
            _result.put(obj, obj1);
            return;
        } else
        {
            ((_result)_accumulator.get(_accumulator.size() - 1))._accumulator.put(obj, obj1);
            return;
        }
    }

    public void resolveForwardReference(Object obj, Object obj1)
        throws IOException
    {
        Iterator iterator = _accumulator.iterator();
        _accumulator _laccumulator;
        for (Map map = _result; iterator.hasNext(); map = _laccumulator._result)
        {
            _laccumulator = (_result)iterator.next();
            if (_laccumulator._result(obj))
            {
                iterator.remove();
                map.put(_laccumulator._result, obj1);
                map.putAll(_laccumulator._result);
                return;
            }
        }

        throw new IllegalArgumentException((new StringBuilder()).append("Trying to resolve a forward reference with id [").append(obj).append("] that wasn't previously seen as unresolved.").toString());
    }

    public (Class class1, Map map)
    {
        _accumulator = new ArrayList();
        _valueType = class1;
        _result = map;
    }
}
