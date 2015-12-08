// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import com.soundcloud.android.model.EntityProperty;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.java.collections.Lists;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class PropertySets
{

    private static final Function PROP_SET_SOURCE_TO_PROP_SET = new _cls1();

    private PropertySets()
    {
    }

    public static ArrayList extractUrns(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(((PropertySet)list.next()).get(EntityProperty.URN))) { }
        return arraylist;
    }

    public static Function toPropertySet()
    {
        return PROP_SET_SOURCE_TO_PROP_SET;
    }

    public static List toPropertySets(List list)
    {
        return Lists.transform(list, new _cls2());
    }

    public static transient List toPropertySets(PropertySetSource apropertysetsource[])
    {
        return toPropertySets(Arrays.asList(apropertysetsource));
    }


    private class _cls2
        implements Function
    {

        public final PropertySet apply(PropertySetSource propertysetsource)
        {
            return propertysetsource.toPropertySet();
        }

        public final volatile Object apply(Object obj)
        {
            return apply((PropertySetSource)obj);
        }

        _cls2()
        {
        }
    }


    private class _cls1
        implements Function
    {

        public final PropertySet apply(PropertySetSource propertysetsource)
        {
            return propertysetsource.toPropertySet();
        }

        public final volatile Object apply(Object obj)
        {
            return apply((PropertySetSource)obj);
        }

        _cls1()
        {
        }
    }

}
