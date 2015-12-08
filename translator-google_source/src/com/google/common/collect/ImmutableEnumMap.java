// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.EnumMap;

// Referenced classes of package com.google.common.collect:
//            ImmutableMap, bk, ImmutableSet

final class ImmutableEnumMap extends ImmutableMap
{

    private final transient EnumMap a;

    private ImmutableEnumMap(EnumMap enummap)
    {
        a = enummap;
        boolean flag;
        if (!enummap.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
    }

    ImmutableEnumMap(EnumMap enummap, _cls1 _pcls1)
    {
        this(enummap);
    }

    static ImmutableMap asImmutable(EnumMap enummap)
    {
        switch (enummap.size())
        {
        default:
            return new ImmutableEnumMap(enummap);

        case 0: // '\0'
            return ImmutableMap.of();

        case 1: // '\001'
            enummap = (java.util.Map.Entry)bk.a(enummap.entrySet());
            break;
        }
        return ImmutableMap.of(enummap.getKey(), enummap.getValue());
    }

    public final boolean containsKey(Object obj)
    {
        return a.containsKey(obj);
    }

    final ImmutableSet createEntrySet()
    {
        return new _cls2();
    }

    final ImmutableSet createKeySet()
    {
        return new _cls1();
    }

    public final Object get(Object obj)
    {
        return a.get(obj);
    }

    final boolean isPartialView()
    {
        return false;
    }

    public final int size()
    {
        return a.size();
    }

    final Object writeReplace()
    {
        return new EnumSerializedForm(a);
    }


    private class _cls2 extends ImmutableMapEntrySet
    {

        final ImmutableEnumMap this$0;

        public ej iterator()
        {
            return new ar(this);
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        ImmutableMap map()
        {
            return ImmutableEnumMap.this;
        }

        _cls2()
        {
            this$0 = ImmutableEnumMap.this;
            super();
        }
    }


    private class _cls1 extends ImmutableSet
    {

        final ImmutableEnumMap this$0;

        public boolean contains(Object obj)
        {
            return a.containsKey(obj);
        }

        boolean isPartialView()
        {
            return true;
        }

        public ej iterator()
        {
            return bl.a(a.keySet().iterator());
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            return ImmutableEnumMap.this.size();
        }

        _cls1()
        {
            this$0 = ImmutableEnumMap.this;
            super();
        }
    }


    private class EnumSerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final EnumMap _flddelegate;

        Object readResolve()
        {
            return new ImmutableEnumMap(_flddelegate, null);
        }

        EnumSerializedForm(EnumMap enummap)
        {
            _flddelegate = enummap;
        }
    }

}
