// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g;

import com.facebook.debug.log.b;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.io.StringWriter;

public class c
{

    private static final Class a = com/facebook/contacts/g/c;
    private final JsonFactory b;

    public c(JsonFactory jsonfactory)
    {
        b = jsonfactory;
    }

    public String a(String s, int i)
    {
        StringWriter stringwriter = new StringWriter();
        try
        {
            JsonGenerator jsongenerator = b.createJsonGenerator(stringwriter);
            jsongenerator.writeStartObject();
            jsongenerator.writeObjectFieldStart("PHONE");
            jsongenerator.writeStringField("phone_number", s);
            jsongenerator.writeNumberField("field_label_type", i);
            jsongenerator.writeEndObject();
            jsongenerator.writeEndObject();
            jsongenerator.flush();
            s = stringwriter.toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.facebook.debug.log.b.d(a, s.getMessage());
            return null;
        }
        return s;
    }

}
