// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            SetMultimap, Multimaps, Maps, Multimap

private static class it> extends it>
    implements SetMultimap
{

    private static final long serialVersionUID = 0L;

    public volatile Multimap _mthdelegate()
    {
        return _mthdelegate();
    }

    public SetMultimap _mthdelegate()
    {
        return (SetMultimap)super.egate();
    }

    public volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    public volatile Collection entries()
    {
        return entries();
    }

    public Set entries()
    {
        return Maps.unmodifiableEntrySet(_mthdelegate().entries());
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public Set get(Object obj)
    {
        return Collections.unmodifiableSet(_mthdelegate().get(obj));
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public Set removeAll(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public Set replaceValues(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    A(SetMultimap setmultimap)
    {
        super(setmultimap);
    }
}
