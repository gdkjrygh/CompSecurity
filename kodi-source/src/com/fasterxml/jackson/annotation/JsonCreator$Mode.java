// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//            JsonCreator

public static final class  extends Enum
{

    private static final DISABLED $VALUES[];
    public static final DISABLED DEFAULT;
    public static final DISABLED DELEGATING;
    public static final DISABLED DISABLED;
    public static final DISABLED PROPERTIES;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fasterxml/jackson/annotation/JsonCreator$Mode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0);
        DELEGATING = new <init>("DELEGATING", 1);
        PROPERTIES = new <init>("PROPERTIES", 2);
        DISABLED = new <init>("DISABLED", 3);
        $VALUES = (new .VALUES[] {
            DEFAULT, DELEGATING, PROPERTIES, DISABLED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
