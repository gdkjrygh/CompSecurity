// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            NonTypedScalarSerializerBase

public final class StringSerializer extends NonTypedScalarSerializerBase
{

    public StringSerializer()
    {
        super(java/lang/String);
    }

    public final volatile boolean isEmpty(Object obj)
    {
        return isEmpty((String)obj);
    }

    public final boolean isEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((String)obj, jsongenerator, serializerprovider);
    }

    public final void serialize(String s, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeString(s);
    }
}
