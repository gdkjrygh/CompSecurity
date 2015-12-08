// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            ForwardingMap, ClassToInstanceMap, ImmutableMap

public final class ImmutableClassToInstanceMap extends ForwardingMap
    implements ClassToInstanceMap, Serializable
{

    private final ImmutableMap _flddelegate;

    private ImmutableClassToInstanceMap(ImmutableMap immutablemap)
    {
        _flddelegate = immutablemap;
    }

    ImmutableClassToInstanceMap(ImmutableMap immutablemap, _cls1 _pcls1)
    {
        this(immutablemap);
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static ImmutableClassToInstanceMap copyOf(Map map)
    {
        if (map instanceof ImmutableClassToInstanceMap)
        {
            return (ImmutableClassToInstanceMap)map;
        } else
        {
            return (new Builder()).putAll(map).build();
        }
    }

    protected final volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected final Map _mthdelegate()
    {
        return _flddelegate;
    }

    public final Object getInstance(Class class1)
    {
        return _flddelegate.get(Preconditions.checkNotNull(class1));
    }

    public final Object putInstance(Class class1, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    /* member class not found */
    class Builder {}

}
