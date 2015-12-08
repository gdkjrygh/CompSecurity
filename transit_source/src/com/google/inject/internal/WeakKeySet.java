// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Key;
import com.google.inject.internal.util.$Maps;
import com.google.inject.internal.util.$Sets;
import com.google.inject.internal.util.$SourceProvider;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            Errors

final class WeakKeySet
{

    private Map backingSet;

    WeakKeySet()
    {
    }

    public void add(Key key, Object obj)
    {
        Object obj1;
label0:
        {
            if (backingSet == null)
            {
                backingSet = $Maps.newHashMap();
            }
            if (!(obj instanceof Class))
            {
                obj1 = obj;
                if (obj != $SourceProvider.UNKNOWN_SOURCE)
                {
                    break label0;
                }
            }
            obj1 = null;
        }
        String s = key.toString();
        obj = (Set)backingSet.get(s);
        key = ((Key) (obj));
        if (obj == null)
        {
            key = $Sets.newLinkedHashSet();
            backingSet.put(s, key);
        }
        key.add(Errors.convert(obj1));
    }

    public boolean contains(Key key)
    {
        return backingSet != null && backingSet.containsKey(key.toString());
    }

    public Set getSources(Key key)
    {
        return (Set)backingSet.get(key.toString());
    }
}
