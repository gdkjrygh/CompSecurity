// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;


// Referenced classes of package com.fitbit.home.ui.tiles:
//            HeartRateTile

private static final class stringId extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];
    private int iconDrawableId;
    private int stringId;

    public static stringId valueOf(String s)
    {
        return (stringId)Enum.valueOf(com/fitbit/home/ui/tiles/HeartRateTile$HeartrateZone, s);
    }

    public static stringId[] values()
    {
        return (stringId[])h.clone();
    }

    public int a()
    {
        return iconDrawableId;
    }

    public int b()
    {
        return stringId;
    }

    static 
    {
        a = new <init>("RESTING", 0, 0x7f020338, 0);
        b = new <init>("FAT_BURN", 1, 0x7f0201d5, 0x7f0802ee);
        c = new <init>("CARDIO", 2, 0x7f020116, 0x7f0802c4);
        d = new <init>("PEAK", 3, 0x7f020310, 0x7f080334);
        e = new <init>("IN_CUSTOM", 4, 0x7f0202b8, 0x7f0802c4);
        f = new <init>("BELOW_CUSTOM", 5, 0x7f02006a, 0x7f0802ee);
        g = new <init>("ABOVE_CUSTOM", 6, 0x7f020034, 0x7f080334);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i, int j, int k)
    {
        super(s, i);
        iconDrawableId = j;
        stringId = k;
    }
}
