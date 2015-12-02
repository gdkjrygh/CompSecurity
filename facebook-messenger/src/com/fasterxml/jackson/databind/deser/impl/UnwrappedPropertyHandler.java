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

public class UnwrappedPropertyHandler
{

    protected final ArrayList _properties = new ArrayList();

    public UnwrappedPropertyHandler()
    {
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

    public void renameAll(NameTransformer nametransformer)
    {
        Iterator iterator = (new ArrayList(_properties)).iterator();
        _properties.clear();
        SettableBeanProperty settablebeanproperty;
        for (; iterator.hasNext(); _properties.add(settablebeanproperty))
        {
            settablebeanproperty = (SettableBeanProperty)iterator.next();
            SettableBeanProperty settablebeanproperty1 = settablebeanproperty.withName(nametransformer.transform(settablebeanproperty.getName()));
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

    }
}
