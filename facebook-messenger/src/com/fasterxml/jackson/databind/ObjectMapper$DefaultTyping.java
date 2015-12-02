// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;


public final class  extends Enum
{

    private static final NON_FINAL $VALUES[];
    public static final NON_FINAL JAVA_LANG_OBJECT;
    public static final NON_FINAL NON_CONCRETE_AND_ARRAYS;
    public static final NON_FINAL NON_FINAL;
    public static final NON_FINAL OBJECT_AND_NON_CONCRETE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        JAVA_LANG_OBJECT = new <init>("JAVA_LANG_OBJECT", 0);
        OBJECT_AND_NON_CONCRETE = new <init>("OBJECT_AND_NON_CONCRETE", 1);
        NON_CONCRETE_AND_ARRAYS = new <init>("NON_CONCRETE_AND_ARRAYS", 2);
        NON_FINAL = new <init>("NON_FINAL", 3);
        $VALUES = (new .VALUES[] {
            JAVA_LANG_OBJECT, OBJECT_AND_NON_CONCRETE, NON_CONCRETE_AND_ARRAYS, NON_FINAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
