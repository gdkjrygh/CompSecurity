// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.annotation:
//            ObjectIdResolver

public class SimpleObjectIdResolver
    implements ObjectIdResolver
{

    private Map _items;

    public SimpleObjectIdResolver()
    {
        _items = new HashMap();
    }

    public void bindItem(ObjectIdGenerator.IdKey idkey, Object obj)
    {
        if (_items.containsKey(idkey))
        {
            throw new IllegalStateException((new StringBuilder("Already had POJO for id (")).append(idkey.key.getClass().getName()).append(") [").append(idkey).append("]").toString());
        } else
        {
            _items.put(idkey, obj);
            return;
        }
    }

    public boolean canUseFor(ObjectIdResolver objectidresolver)
    {
        return objectidresolver.getClass() == getClass();
    }

    public ObjectIdResolver newForDeserialization(Object obj)
    {
        return this;
    }

    public Object resolveId(ObjectIdGenerator.IdKey idkey)
    {
        return _items.get(idkey);
    }
}
