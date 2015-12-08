// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.search;


// Referenced classes of package com.netflix.mediaclient.ui.search:
//            SearchResultView

private static final class heightDimenId extends Enum
{

    private static final SQUARE $VALUES[];
    public static final SQUARE BOXART;
    public static final SQUARE SQUARE;
    private final int heightDimenId;

    public static heightDimenId valueOf(String s)
    {
        return (heightDimenId)Enum.valueOf(com/netflix/mediaclient/ui/search/SearchResultView$ImgSizeType, s);
    }

    public static heightDimenId[] values()
    {
        return (heightDimenId[])$VALUES.clone();
    }

    static 
    {
        BOXART = new <init>("BOXART", 0, 0x7f0a0046);
        SQUARE = new <init>("SQUARE", 1, 0x7f0a0045);
        $VALUES = (new .VALUES[] {
            BOXART, SQUARE
        });
    }


    private (String s, int i, int j)
    {
        super(s, i);
        heightDimenId = j;
    }
}
