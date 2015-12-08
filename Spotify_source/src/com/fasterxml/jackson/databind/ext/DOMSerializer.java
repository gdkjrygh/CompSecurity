// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.w3c.dom.Node;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

public class DOMSerializer extends StdSerializer
{

    protected final DOMImplementationLS _domImpl;

    public DOMSerializer()
    {
        super(org/w3c/dom/Node);
        DOMImplementationRegistry domimplementationregistry;
        try
        {
            domimplementationregistry = DOMImplementationRegistry.newInstance();
        }
        catch (Exception exception)
        {
            throw new IllegalStateException((new StringBuilder("Could not instantiate DOMImplementationRegistry: ")).append(exception.getMessage()).toString(), exception);
        }
        _domImpl = (DOMImplementationLS)domimplementationregistry.getDOMImplementation("LS");
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((Node)obj, jsongenerator, serializerprovider);
    }

    public void serialize(Node node, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        if (_domImpl == null)
        {
            throw new IllegalStateException("Could not find DOM LS");
        } else
        {
            jsongenerator.writeString(_domImpl.createLSSerializer().writeToString(node));
            return;
        }
    }
}
