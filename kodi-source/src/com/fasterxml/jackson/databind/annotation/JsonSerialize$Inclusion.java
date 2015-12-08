// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.annotation;


// Referenced classes of package com.fasterxml.jackson.databind.annotation:
//            JsonSerialize

public static final class  extends Enum
{

    private static final DEFAULT_INCLUSION $VALUES[];
    public static final DEFAULT_INCLUSION ALWAYS;
    public static final DEFAULT_INCLUSION DEFAULT_INCLUSION;
    public static final DEFAULT_INCLUSION NON_DEFAULT;
    public static final DEFAULT_INCLUSION NON_EMPTY;
    public static final DEFAULT_INCLUSION NON_NULL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ALWAYS = new <init>("ALWAYS", 0);
        NON_NULL = new <init>("NON_NULL", 1);
        NON_DEFAULT = new <init>("NON_DEFAULT", 2);
        NON_EMPTY = new <init>("NON_EMPTY", 3);
        DEFAULT_INCLUSION = new <init>("DEFAULT_INCLUSION", 4);
        $VALUES = (new .VALUES[] {
            ALWAYS, NON_NULL, NON_DEFAULT, NON_EMPTY, DEFAULT_INCLUSION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
