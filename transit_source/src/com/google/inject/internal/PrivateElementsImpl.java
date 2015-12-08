// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binder;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.PrivateBinder;
import com.google.inject.internal.util.$ImmutableList;
import com.google.inject.internal.util.$ImmutableMap;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.internal.util.$Lists;
import com.google.inject.internal.util.$Maps;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.internal.util.$ToStringBuilder;
import com.google.inject.spi.Element;
import com.google.inject.spi.ElementVisitor;
import com.google.inject.spi.PrivateElements;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            ExposureBuilder

public final class PrivateElementsImpl
    implements PrivateElements
{

    private $ImmutableList elements;
    private List elementsMutable;
    private $ImmutableMap exposedKeysToSources;
    private List exposureBuilders;
    private Injector injector;
    private final Object source;

    public PrivateElementsImpl(Object obj)
    {
        elementsMutable = $Lists.newArrayList();
        exposureBuilders = $Lists.newArrayList();
        source = $Preconditions.checkNotNull(obj, "source");
    }

    public Object acceptVisitor(ElementVisitor elementvisitor)
    {
        return elementvisitor.visit(this);
    }

    public void addExposureBuilder(ExposureBuilder exposurebuilder)
    {
        exposureBuilders.add(exposurebuilder);
    }

    public void applyTo(Binder binder)
    {
        binder = binder.withSource(source).newPrivateBinder();
        for (Iterator iterator = getElements().iterator(); iterator.hasNext(); ((Element)iterator.next()).applyTo(binder)) { }
        getExposedKeys();
        java.util.Map.Entry entry;
        for (Iterator iterator1 = exposedKeysToSources.entrySet().iterator(); iterator1.hasNext(); binder.withSource(entry.getValue()).expose((Key)entry.getKey()))
        {
            entry = (java.util.Map.Entry)iterator1.next();
        }

    }

    public List getElements()
    {
        if (elements == null)
        {
            elements = $ImmutableList.copyOf(elementsMutable);
            elementsMutable = null;
        }
        return elements;
    }

    public List getElementsMutable()
    {
        return elementsMutable;
    }

    public Set getExposedKeys()
    {
        if (exposedKeysToSources == null)
        {
            java.util.LinkedHashMap linkedhashmap = $Maps.newLinkedHashMap();
            ExposureBuilder exposurebuilder;
            for (Iterator iterator = exposureBuilders.iterator(); iterator.hasNext(); linkedhashmap.put(exposurebuilder.getKey(), exposurebuilder.getSource()))
            {
                exposurebuilder = (ExposureBuilder)iterator.next();
            }

            exposedKeysToSources = $ImmutableMap.copyOf(linkedhashmap);
            exposureBuilders = null;
        }
        return exposedKeysToSources.keySet();
    }

    public Object getExposedSource(Key key)
    {
        getExposedKeys();
        Object obj = exposedKeysToSources.get(key);
        boolean flag;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkArgument(flag, "%s not exposed by %s.", new Object[] {
            key, this
        });
        return obj;
    }

    public Injector getInjector()
    {
        return injector;
    }

    public Object getSource()
    {
        return source;
    }

    public void initInjector(Injector injector1)
    {
        boolean flag;
        if (injector == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkState(flag, "injector already initialized");
        injector = (Injector)$Preconditions.checkNotNull(injector1, "injector");
    }

    public String toString()
    {
        return (new $ToStringBuilder(com/google/inject/spi/PrivateElements)).add("exposedKeys", getExposedKeys()).add("source", getSource()).toString();
    }
}
