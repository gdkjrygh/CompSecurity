// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public abstract class DOMDeserializer extends FromStringDeserializer
{

    static final DocumentBuilderFactory _parserFactory;

    protected DOMDeserializer(Class class1)
    {
        super(class1);
    }

    public abstract Object _deserialize(String s, DeserializationContext deserializationcontext);

    protected final Document parse(String s)
    {
        try
        {
            s = _parserFactory.newDocumentBuilder().parse(new InputSource(new StringReader(s)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to parse JSON String as XML: ").append(s.getMessage()).toString(), s);
        }
        return s;
    }

    static 
    {
        _parserFactory = DocumentBuilderFactory.newInstance();
        _parserFactory.setNamespaceAware(true);
    }
}
