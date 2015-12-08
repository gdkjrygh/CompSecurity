// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            TextFormat

public static final class _value extends Enum
{

    private static final SMALL_CAPITALS $VALUES[];
    public static final SMALL_CAPITALS CASUAL;
    public static final SMALL_CAPITALS CURSIVE;
    public static final SMALL_CAPITALS DEFAULT;
    public static final SMALL_CAPITALS MONOSPACED_WITHOUT_SERIFS;
    public static final SMALL_CAPITALS MONOSPACED_WITH_SERIFS;
    public static final SMALL_CAPITALS PROPORTIONAL_WITHOUT_SERIFS;
    public static final SMALL_CAPITALS PROPORTIONAL_WITH_SERIFS;
    public static final SMALL_CAPITALS SMALL_CAPITALS;
    private final String _value;

    public static _value valueOf(String s)
    {
        return (_value)Enum.valueOf(com/adobe/mediacore/TextFormat$Font, s);
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
        MONOSPACED_WITH_SERIFS = new <init>("MONOSPACED_WITH_SERIFS", 1, "monospaced_with_serifs");
        PROPORTIONAL_WITH_SERIFS = new <init>("PROPORTIONAL_WITH_SERIFS", 2, "proportional_with_serifs");
        MONOSPACED_WITHOUT_SERIFS = new <init>("MONOSPACED_WITHOUT_SERIFS", 3, "monospaced_without_serifs");
        PROPORTIONAL_WITHOUT_SERIFS = new <init>("PROPORTIONAL_WITHOUT_SERIFS", 4, "proportional_without_serifs");
        CASUAL = new <init>("CASUAL", 5, "casual");
        CURSIVE = new <init>("CURSIVE", 6, "cursive");
        SMALL_CAPITALS = new <init>("SMALL_CAPITALS", 7, "small_capitals");
        $VALUES = (new .VALUES[] {
            DEFAULT, MONOSPACED_WITH_SERIFS, PROPORTIONAL_WITH_SERIFS, MONOSPACED_WITHOUT_SERIFS, PROPORTIONAL_WITHOUT_SERIFS, CASUAL, CURSIVE, SMALL_CAPITALS
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        _value = s1;
    }
}
