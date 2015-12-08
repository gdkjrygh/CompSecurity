// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdKeyDeserializer

static final class  extends StdKeyDeserializer
{

    private static final <init> sObject = new <init>(java/lang/Object);
    private static final <init> sString = new <init>(java/lang/String);

    public static  forType(Class class1)
    {
        if (class1 == java/lang/String)
        {
            return sString;
        }
        if (class1 == java/lang/Object)
        {
            return sObject;
        } else
        {
            return new <init>(class1);
        }
    }

    public Object deserializeKey(String s, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return s;
    }


    private (Class class1)
    {
        super(-1, class1);
    }
}
