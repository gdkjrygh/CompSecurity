// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;


// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            IntermediateRepresentation

public static final class attributeName extends Enum
{

    private static final BOTTOM $VALUES[];
    public static final BOTTOM BOTTOM;
    public static final BOTTOM CENTER;
    public static final BOTTOM TOP;
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

        return TOP;
    }

    public static TOP valueOf(String s)
    {
        return (TOP)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/IntermediateRepresentation$VerticalAlign, s);
    }

    public static TOP[] values()
    {
        return (TOP[])$VALUES.clone();
    }

    static 
    {
        TOP = new <init>("TOP", 0, "top");
        CENTER = new <init>("CENTER", 1, "center");
        BOTTOM = new <init>("BOTTOM", 2, "bottom");
        $VALUES = (new .VALUES[] {
            TOP, CENTER, BOTTOM
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        attributeName = s1;
    }
}
