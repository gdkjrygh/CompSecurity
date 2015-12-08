// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            TextFormat

public static final class _value extends Enum
{

    private static final LARGE $VALUES[];
    public static final LARGE DEFAULT;
    public static final LARGE LARGE;
    public static final LARGE MEDIUM;
    public static final LARGE SMALL;
    private final String _value;

    public static _value valueOf(String s)
    {
        return (_value)Enum.valueOf(com/adobe/mediacore/TextFormat$Size, s);
    }

    public static _value[] values()
    {
        return (_value[])$VALUES.clone();
    }

    public String getValue()
    {
        return _value;
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0, "default");
        SMALL = new <init>("SMALL", 1, "small");
        MEDIUM = new <init>("MEDIUM", 2, "medium");
        LARGE = new <init>("LARGE", 3, "large");
        $VALUES = (new .VALUES[] {
            DEFAULT, SMALL, MEDIUM, LARGE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        _value = s1;
    }
}
