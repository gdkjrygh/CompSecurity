// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//            PropertySerializerMap

private static final class  extends PropertySerializerMap
{

    public static final  FOR_PROPERTIES = new <init>(false);
    public static final <init> FOR_ROOT_VALUES = new <init>(true);

    public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
    {
        return new (this, class1, jsonserializer);
    }

    public JsonSerializer serializerFor(Class class1)
    {
        return null;
    }


    protected (boolean flag)
    {
        super(flag);
    }
}
