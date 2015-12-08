// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            TextFormat

public static final class _value extends Enum
{

    private static final DROP_SHADOW_RIGHT $VALUES[];
    public static final DROP_SHADOW_RIGHT DEFAULT;
    public static final DROP_SHADOW_RIGHT DEPRESSED;
    public static final DROP_SHADOW_RIGHT DROP_SHADOW_LEFT;
    public static final DROP_SHADOW_RIGHT DROP_SHADOW_RIGHT;
    public static final DROP_SHADOW_RIGHT NONE;
    public static final DROP_SHADOW_RIGHT RAISED;
    public static final DROP_SHADOW_RIGHT UNIFORM;
    private final String _value;

    public static _value valueOf(String s)
    {
        return (_value)Enum.valueOf(com/adobe/mediacore/TextFormat$FontEdge, s);
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
        NONE = new <init>("NONE", 1, "none");
        RAISED = new <init>("RAISED", 2, "raised");
        DEPRESSED = new <init>("DEPRESSED", 3, "depressed");
        UNIFORM = new <init>("UNIFORM", 4, "uniform");
        DROP_SHADOW_LEFT = new <init>("DROP_SHADOW_LEFT", 5, "drop_shadow_left");
        DROP_SHADOW_RIGHT = new <init>("DROP_SHADOW_RIGHT", 6, "drop_shadow_right");
        $VALUES = (new .VALUES[] {
            DEFAULT, NONE, RAISED, DEPRESSED, UNIFORM, DROP_SHADOW_LEFT, DROP_SHADOW_RIGHT
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        _value = s1;
    }
}
