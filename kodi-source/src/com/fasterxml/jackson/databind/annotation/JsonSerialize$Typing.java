// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.annotation;


// Referenced classes of package com.fasterxml.jackson.databind.annotation:
//            JsonSerialize

public static final class  extends Enum
{

    private static final DEFAULT_TYPING $VALUES[];
    public static final DEFAULT_TYPING DEFAULT_TYPING;
    public static final DEFAULT_TYPING DYNAMIC;
    public static final DEFAULT_TYPING STATIC;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fasterxml/jackson/databind/annotation/JsonSerialize$Typing, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DYNAMIC = new <init>("DYNAMIC", 0);
        STATIC = new <init>("STATIC", 1);
        DEFAULT_TYPING = new <init>("DEFAULT_TYPING", 2);
        $VALUES = (new .VALUES[] {
            DYNAMIC, STATIC, DEFAULT_TYPING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
