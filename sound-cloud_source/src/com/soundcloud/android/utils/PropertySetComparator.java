// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertySet;
import java.util.Comparator;

public class PropertySetComparator
    implements Comparator
{

    private final Property property;

    public PropertySetComparator(Property property1)
    {
        property = property1;
    }

    public int compare(PropertySet propertyset, PropertySet propertyset1)
    {
        return ((Comparable)propertyset.get(property)).compareTo(propertyset1.get(property));
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((PropertySet)obj, (PropertySet)obj1);
    }
}
