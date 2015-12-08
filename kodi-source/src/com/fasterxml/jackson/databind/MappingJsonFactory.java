// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.ObjectCodec;

// Referenced classes of package com.fasterxml.jackson.databind:
//            ObjectMapper

public class MappingJsonFactory extends JsonFactory
{

    public MappingJsonFactory()
    {
        this(null);
    }

    public MappingJsonFactory(ObjectMapper objectmapper)
    {
        super(objectmapper);
        if (objectmapper == null)
        {
            setCodec(new ObjectMapper(this));
        }
    }

    public volatile ObjectCodec getCodec()
    {
        return getCodec();
    }

    public final ObjectMapper getCodec()
    {
        return (ObjectMapper)_objectCodec;
    }
}
