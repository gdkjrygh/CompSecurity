// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingMap, MapConstraints, MapConstraint

static class constraint extends ForwardingMap
{

    final MapConstraint constraint;
    private final Map _flddelegate;
    private transient Set entrySet;

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Map _mthdelegate()
    {
        return _flddelegate;
    }

    public Set entrySet()
    {
        Set set1 = entrySet;
        Set set = set1;
        if (set1 == null)
        {
            set = MapConstraints.access$000(_flddelegate.entrySet(), constraint);
            entrySet = set;
        }
        return set;
    }

    public Object put(Object obj, Object obj1)
    {
        constraint.checkKeyValue(obj, obj1);
        return _flddelegate.put(obj, obj1);
    }

    public void putAll(Map map)
    {
        _flddelegate.putAll(MapConstraints.access$100(map, constraint));
    }

    (Map map, MapConstraint mapconstraint)
    {
        _flddelegate = (Map)Preconditions.checkNotNull(map);
        constraint = (MapConstraint)Preconditions.checkNotNull(mapconstraint);
    }
}
