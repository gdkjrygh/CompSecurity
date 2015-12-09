// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UnwrappedPropertyHandler
{

    protected final List _properties;

    public UnwrappedPropertyHandler()
    {
        _properties = new ArrayList();
    }

    protected UnwrappedPropertyHandler(List list)
    {
        _properties = list;
    }

    public void addProperty(SettableBeanProperty settablebeanproperty)
    {
        _properties.add(settablebeanproperty);
    }

    public Object processUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, TokenBuffer tokenbuffer)
    {
        int j = _properties.size();
        for (int i = 0; i < j; i++)
        {
            jsonparser = (SettableBeanProperty)_properties.get(i);
            JsonParser jsonparser1 = tokenbuffer.asParser();
            jsonparser1.nextToken();
            jsonparser.deserializeAndSet(jsonparser1, deserializationcontext, obj);
        }

        return obj;
    }

    public UnwrappedPropertyHandler renameAll(NameTransformer nametransformer)
    {
        ArrayList arraylist = new ArrayList(_properties.size());
        SettableBeanProperty settablebeanproperty;
        for (Iterator iterator = _properties.iterator(); iterator.hasNext(); arraylist.add(settablebeanproperty))
        {
            settablebeanproperty = (SettableBeanProperty)iterator.next();
            SettableBeanProperty settablebeanproperty1 = settablebeanproperty.withSimpleName(nametransformer.transform(settablebeanproperty.getName()));
            JsonDeserializer jsondeserializer = settablebeanproperty1.getValueDeserializer();
            settablebeanproperty = settablebeanproperty1;
            if (jsondeserializer == null)
            {
                continue;
            }
            JsonDeserializer jsondeserializer1 = jsondeserializer.unwrappingDeserializer(nametransformer);
            settablebeanproperty = settablebeanproperty1;
            if (jsondeserializer1 != jsondeserializer)
            {
                settablebeanproperty = settablebeanproperty1.withValueDeserializer(jsondeserializer1);
            }
        }

        return new UnwrappedPropertyHandler(arraylist);
    }
}
