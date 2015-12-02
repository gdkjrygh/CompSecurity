// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdKeyDeserializer

final class  extends StdKeyDeserializer
{

    private static final _parse sObject = new <init>(java/lang/Object);
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

    public volatile Object _parse(String s, DeserializationContext deserializationcontext)
    {
        return _parse(s, deserializationcontext);
    }

    public String _parse(String s, DeserializationContext deserializationcontext)
    {
        return s;
    }


    private (Class class1)
    {
        super(class1);
    }
}
