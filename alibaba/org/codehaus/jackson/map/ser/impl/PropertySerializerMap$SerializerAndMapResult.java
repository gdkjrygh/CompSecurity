// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.impl;

import org.codehaus.jackson.map.JsonSerializer;

// Referenced classes of package org.codehaus.jackson.map.ser.impl:
//            PropertySerializerMap

public static final class map
{

    public final PropertySerializerMap map;
    public final JsonSerializer serializer;

    public (JsonSerializer jsonserializer, PropertySerializerMap propertyserializermap)
    {
        serializer = jsonserializer;
        map = propertyserializermap;
    }
}
