// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdScalarSerializer

public class ClassSerializer extends StdScalarSerializer
{

    public ClassSerializer()
    {
        super(java/lang/Class, false);
    }

    public void serialize(Class class1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeString(class1.getName());
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((Class)obj, jsongenerator, serializerprovider);
    }
}
