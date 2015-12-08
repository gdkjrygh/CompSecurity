// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;


public final class  extends Enum
{

    private static final EXISTING_PROPERTY $VALUES[];
    public static final EXISTING_PROPERTY EXISTING_PROPERTY;
    public static final EXISTING_PROPERTY EXTERNAL_PROPERTY;
    public static final EXISTING_PROPERTY PROPERTY;
    public static final EXISTING_PROPERTY WRAPPER_ARRAY;
    public static final EXISTING_PROPERTY WRAPPER_OBJECT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fasterxml/jackson/annotation/JsonTypeInfo$As, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PROPERTY = new <init>("PROPERTY", 0);
        WRAPPER_OBJECT = new <init>("WRAPPER_OBJECT", 1);
        WRAPPER_ARRAY = new <init>("WRAPPER_ARRAY", 2);
        EXTERNAL_PROPERTY = new <init>("EXTERNAL_PROPERTY", 3);
        EXISTING_PROPERTY = new <init>("EXISTING_PROPERTY", 4);
        $VALUES = (new .VALUES[] {
            PROPERTY, WRAPPER_OBJECT, WRAPPER_ARRAY, EXTERNAL_PROPERTY, EXISTING_PROPERTY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
