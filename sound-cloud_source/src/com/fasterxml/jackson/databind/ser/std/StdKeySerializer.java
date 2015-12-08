// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Date;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer

public class StdKeySerializer extends StdSerializer
{

    static final StdKeySerializer instace = new StdKeySerializer();

    public StdKeySerializer()
    {
        super(java/lang/Object);
    }

    public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        if (obj instanceof Date)
        {
            serializerprovider.defaultSerializeDateKey((Date)obj, jsongenerator);
            return;
        } else
        {
            jsongenerator.writeFieldName(obj.toString());
            return;
        }
    }

}
