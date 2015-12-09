// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//            PropertySerializerMap

public final class map
{

    public final PropertySerializerMap map;
    public final JsonSerializer serializer;

    public (JsonSerializer jsonserializer, PropertySerializerMap propertyserializermap)
    {
        serializer = jsonserializer;
        map = propertyserializermap;
    }
}
