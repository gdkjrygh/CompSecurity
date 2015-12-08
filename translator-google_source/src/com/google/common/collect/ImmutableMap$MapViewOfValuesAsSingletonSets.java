// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMap, ImmutableSet

final class delegate extends ImmutableMap
{

    private final ImmutableMap _flddelegate;

    public final boolean containsKey(Object obj)
    {
        return _flddelegate.containsKey(obj);
    }

    final ImmutableSet createEntrySet()
    {
        class _cls1 extends ImmutableMapEntrySet
        {

            final ImmutableMap.MapViewOfValuesAsSingletonSets this$0;

            public ej iterator()
            {
                return new ax(this, _flddelegate.entrySet().iterator());
            }

            public volatile Iterator iterator()
            {
                return iterator();
            }

            ImmutableMap map()
            {
                return ImmutableMap.MapViewOfValuesAsSingletonSets.this;
            }

            _cls1()
            {
                this$0 = ImmutableMap.MapViewOfValuesAsSingletonSets.this;
                super();
            }
        }

        return new _cls1();
    }

    public final volatile Set entrySet()
    {
        return super.entrySet();
    }

    public final ImmutableSet get(Object obj)
    {
        obj = _flddelegate.get(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return ImmutableSet.of(obj);
        }
    }

    public final volatile Object get(Object obj)
    {
        return get(obj);
    }

    final boolean isPartialView()
    {
        return false;
    }

    public final volatile Set keySet()
    {
        return super.keySet();
    }

    public final int size()
    {
        return _flddelegate.size();
    }

    public final volatile Collection values()
    {
        return super.values();
    }


    _cls1(ImmutableMap immutablemap)
    {
        _flddelegate = (ImmutableMap)p.a(immutablemap);
    }
}
