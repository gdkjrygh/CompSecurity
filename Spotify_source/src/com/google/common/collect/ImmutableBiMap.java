// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cui;
import java.util.Collection;

// Referenced classes of package com.google.common.collect:
//            ImmutableMap, SingletonImmutableBiMap, EmptyImmutableBiMap, ImmutableCollection

public abstract class ImmutableBiMap extends ImmutableMap
    implements cui
{

    ImmutableBiMap()
    {
    }

    public static ImmutableBiMap a(Object obj, Object obj1)
    {
        return new SingletonImmutableBiMap(obj, obj1);
    }

    public static ImmutableBiMap g()
    {
        return EmptyImmutableBiMap.a;
    }

    public final ImmutableCollection f()
    {
        return o_().d();
    }

    public abstract ImmutableBiMap o_();

    public Collection values()
    {
        return o_().d();
    }

    Object writeReplace()
    {
        return new SerializedForm();
    }

    private class SerializedForm extends ImmutableMap.SerializedForm
    {

        private static final long serialVersionUID = 0L;

        Object readResolve()
        {
            return a(new cun());
        }

        SerializedForm()
        {
        }
    }

}
