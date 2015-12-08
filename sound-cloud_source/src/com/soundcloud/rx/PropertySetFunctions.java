// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.rx;

import com.soundcloud.java.collections.PropertySet;
import rx.b.f;
import rx.b.g;

public final class PropertySetFunctions
{

    private PropertySetFunctions()
    {
    }

    public static f mergeInto(final PropertySet sourceSet)
    {
        return new _cls3();
    }

    public static g mergeLeft()
    {
        return new _cls1();
    }

    public static g mergeRight()
    {
        return new _cls2();
    }

    public static f mergeWith(final PropertySet sourceSet)
    {
        return new _cls4();
    }

    private class _cls3
        implements f
    {

        final PropertySet val$sourceSet;

        public final PropertySet call(PropertySet propertyset)
        {
            return sourceSet.merge(propertyset);
        }

        public final volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls3()
        {
            sourceSet = propertyset;
            super();
        }
    }


    private class _cls1
        implements g
    {

        public final PropertySet call(PropertySet propertyset, PropertySet propertyset1)
        {
            return propertyset.merge(propertyset1);
        }

        public final volatile Object call(Object obj, Object obj1)
        {
            return call((PropertySet)obj, (PropertySet)obj1);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements g
    {

        public final PropertySet call(PropertySet propertyset, PropertySet propertyset1)
        {
            return propertyset1.merge(propertyset);
        }

        public final volatile Object call(Object obj, Object obj1)
        {
            return call((PropertySet)obj, (PropertySet)obj1);
        }

        _cls2()
        {
        }
    }


    private class _cls4
        implements f
    {

        final PropertySet val$sourceSet;

        public final PropertySet call(PropertySet propertyset)
        {
            return propertyset.merge(sourceSet);
        }

        public final volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls4()
        {
            sourceSet = propertyset;
            super();
        }
    }

}
