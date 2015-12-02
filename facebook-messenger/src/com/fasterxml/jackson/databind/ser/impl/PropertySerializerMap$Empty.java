// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//            PropertySerializerMap

final class  extends PropertySerializerMap
{

    protected static final  instance = new <init>();

    public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
    {
        return new (class1, jsonserializer);
    }

    public JsonSerializer serializerFor(Class class1)
    {
        return null;
    }


    private ()
    {
    }
}
