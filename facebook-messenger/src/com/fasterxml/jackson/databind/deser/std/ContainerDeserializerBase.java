// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer

public abstract class ContainerDeserializerBase extends StdDeserializer
{

    protected ContainerDeserializerBase(Class class1)
    {
        super(class1);
    }

    public abstract JsonDeserializer getContentDeserializer();

    public abstract JavaType getContentType();
}
