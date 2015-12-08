// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdResolver;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReadableObjectId
{

    private final com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey _key;
    private LinkedList _referringProperties;
    private ObjectIdResolver _resolver;
    public final Object id;
    public Object item;

    public ReadableObjectId(com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey idkey)
    {
        _key = idkey;
        id = idkey.key;
    }

    public void appendReferring(Referring referring)
    {
        if (_referringProperties == null)
        {
            _referringProperties = new LinkedList();
        }
        _referringProperties.add(referring);
    }

    public void bindItem(Object obj)
    {
        _resolver.bindItem(_key, obj);
        item = obj;
        if (_referringProperties != null)
        {
            Iterator iterator = _referringProperties.iterator();
            _referringProperties = null;
            for (; iterator.hasNext(); ((Referring)iterator.next()).handleResolvedForwardReference(id, obj)) { }
        }
    }

    public com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey getKey()
    {
        return _key;
    }

    public boolean hasReferringProperties()
    {
        return _referringProperties != null && !_referringProperties.isEmpty();
    }

    public Iterator referringProperties()
    {
        if (_referringProperties == null)
        {
            return Collections.emptyList().iterator();
        } else
        {
            return _referringProperties.iterator();
        }
    }

    public Object resolve()
    {
        Object obj = _resolver.resolveId(_key);
        item = obj;
        return obj;
    }

    public void setResolver(ObjectIdResolver objectidresolver)
    {
        _resolver = objectidresolver;
    }

    private class Referring
    {

        private final Class _beanType;
        private final UnresolvedForwardReference _reference;

        public Class getBeanType()
        {
            return _beanType;
        }

        public JsonLocation getLocation()
        {
            return _reference.getLocation();
        }

        public abstract void handleResolvedForwardReference(Object obj, Object obj1);

        public boolean hasId(Object obj)
        {
            return obj.equals(_reference.getUnresolvedId());
        }

        public Referring(UnresolvedForwardReference unresolvedforwardreference, Class class1)
        {
            _reference = unresolvedforwardreference;
            _beanType = class1;
        }
    }

}
