// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;


// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            IntermediateRepresentation

public static final class attributeName extends Enum
{

    private static final RIGHT $VALUES[];
    public static final RIGHT CENTER;
    public static final RIGHT LEFT;
    public static final RIGHT RIGHT;
    private final String attributeName;

    public static attributeName of(String s)
    {
        attributeName aattributename[] = values();
        int j = aattributename.length;
        for (int i = 0; i < j; i++)
        {
            attributeName attributename = aattributename[i];
            if (attributename.attributeName.equalsIgnoreCase(s))
            {
                return attributename;
            }
        }

        return LEFT;
    }

    public static LEFT valueOf(String s)
    {
        return (LEFT)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/IntermediateRepresentation$HorizontalAlign, s);
    }

    public static LEFT[] values()
    {
        return (LEFT[])$VALUES.clone();
    }

    static 
    {
        LEFT = new <init>("LEFT", 0, "left");
        CENTER = new <init>("CENTER", 1, "center");
        RIGHT = new <init>("RIGHT", 2, "right");
        $VALUES = (new .VALUES[] {
            LEFT, CENTER, RIGHT
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        attributeName = s1;
    }
}
