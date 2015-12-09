// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctz;
import cuv;
import cuw;
import cvh;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMap, ImmutableBiMap, ImmutableSet, ImmutableMapEntrySet, 
//            Maps

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
        ctz.a(flag);
    }

    ImmutableEnumMap(EnumMap enummap, byte byte0)
    {
        this(enummap);
    }

    static ImmutableMap a(EnumMap enummap)
    {
        switch (enummap.size())
        {
        default:
            return new ImmutableEnumMap(enummap);

        case 0: // '\0'
            return ImmutableBiMap.g();

        case 1: // '\001'
            enummap = (java.util.Map.Entry)cuv.a(enummap.entrySet());
            break;
        }
        return ImmutableBiMap.a(enummap.getKey(), enummap.getValue());
    }

    static EnumMap a(ImmutableEnumMap immutableenummap)
    {
        return immutableenummap.a;
    }

    final ImmutableSet a()
    {
        return new ImmutableSet() {

            final ImmutableEnumMap this$0;

            public final cvh a()
            {
                return cuw.a(ImmutableEnumMap.a(ImmutableEnumMap.this).keySet().iterator());
            }

            public boolean contains(Object obj)
            {
                return ImmutableEnumMap.a(ImmutableEnumMap.this).containsKey(obj);
            }

            final boolean e()
            {
                return true;
            }

            public Iterator iterator()
            {
                return a();
            }

            public int size()
            {
                return ImmutableEnumMap.this.size();
            }

            
            {
                this$0 = ImmutableEnumMap.this;
                super();
            }
        };
    }

    final ImmutableSet c()
    {
        return new ImmutableMapEntrySet() {

            final ImmutableEnumMap this$0;

            public final cvh a()
            {
                return new cvh(this) {

                    private final Iterator a;
                    private _cls2 b;

                    public final boolean hasNext()
                    {
                        return a.hasNext();
                    }

                    public final Object next()
                    {
                        java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
                        return Maps.a(entry.getKey(), entry.getValue());
                    }

            
            {
                b = _pcls2;
                super();
                a = ImmutableEnumMap.a(b._fld0).entrySet().iterator();
            }
                };
            }

            final ImmutableMap d()
            {
                return ImmutableEnumMap.this;
            }

            public Iterator iterator()
            {
                return a();
            }

            
            {
                this$0 = ImmutableEnumMap.this;
                super();
            }
        };
    }

    public final boolean containsKey(Object obj)
    {
        return a.containsKey(obj);
    }

    final boolean e()
    {
        return false;
    }

    public final Object get(Object obj)
    {
        return a.get(obj);
    }

    public final int size()
    {
        return a.size();
    }

    final Object writeReplace()
    {
        return new EnumSerializedForm(a);
    }

    private class EnumSerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final EnumMap _flddelegate;

        Object readResolve()
        {
            return new ImmutableEnumMap(_flddelegate, (byte)0);
        }

        EnumSerializedForm(EnumMap enummap)
        {
            _flddelegate = enummap;
        }
    }

}
