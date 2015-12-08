// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//            JsonFormat

public static final class  extends Enum
{

    private static final BOOLEAN $VALUES[];
    public static final BOOLEAN ANY;
    public static final BOOLEAN ARRAY;
    public static final BOOLEAN BOOLEAN;
    public static final BOOLEAN NUMBER;
    public static final BOOLEAN NUMBER_FLOAT;
    public static final BOOLEAN NUMBER_INT;
    public static final BOOLEAN OBJECT;
    public static final BOOLEAN SCALAR;
    public static final BOOLEAN STRING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fasterxml/jackson/annotation/JsonFormat$Shape, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public boolean isNumeric()
    {
        return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
    }

    static 
    {
        ANY = new <init>("ANY", 0);
        SCALAR = new <init>("SCALAR", 1);
        ARRAY = new <init>("ARRAY", 2);
        OBJECT = new <init>("OBJECT", 3);
        NUMBER = new <init>("NUMBER", 4);
        NUMBER_FLOAT = new <init>("NUMBER_FLOAT", 5);
        NUMBER_INT = new <init>("NUMBER_INT", 6);
        STRING = new <init>("STRING", 7);
        BOOLEAN = new <init>("BOOLEAN", 8);
        $VALUES = (new .VALUES[] {
            ANY, SCALAR, ARRAY, OBJECT, NUMBER, NUMBER_FLOAT, NUMBER_INT, STRING, BOOLEAN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
