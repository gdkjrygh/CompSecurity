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

    protected Map _items;

    public SimpleObjectIdResolver()
    {
    }

    public void bindItem(ObjectIdGenerator.IdKey idkey, Object obj)
    {
        if (_items == null)
        {
            _items = new HashMap();
        } else
        if (_items.containsKey(idkey))
        {
            throw new IllegalStateException((new StringBuilder()).append("Already had POJO for id (").append(idkey.key.getClass().getName()).append(") [").append(idkey).append("]").toString());
        }
        _items.put(idkey, obj);
    }

    public boolean canUseFor(ObjectIdResolver objectidresolver)
    {
        return objectidresolver.getClass() == getClass();
    }

    public ObjectIdResolver newForDeserialization(Object obj)
    {
        return new SimpleObjectIdResolver();
    }

    public Object resolveId(ObjectIdGenerator.IdKey idkey)
    {
        if (_items == null)
        {
            return null;
        } else
        {
            return _items.get(idkey);
        }
    }
}
