// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.fragment;


// Referenced classes of package com.snapchat.android.discover.ui.fragment:
//            ChannelSpanSizeLookup

public static final class mLayoutFormat extends Enum
{

    private static final m $VALUES[];
    private static m a;
    private static m b;
    private static m c;
    private static m d;
    private static m e;
    private static m f;
    private static m g;
    private static m h;
    private static m i;
    private static m j;
    private static m k;
    private static m l;
    private static m m;
    public final int mLayoutFormat[];

    public static mLayoutFormat valueOf(String s)
    {
        return (mLayoutFormat)Enum.valueOf(com/snapchat/android/discover/ui/fragment/ChannelSpanSizeLookup$Layout, s);
    }

    public static mLayoutFormat[] values()
    {
        return (mLayoutFormat[])$VALUES.clone();
    }

    public final int[] getLayoutFormat()
    {
        return mLayoutFormat;
    }

    static 
    {
        a = new <init>("ZERO", 0, new int[0]);
        b = new <init>("ONE", 1, new int[] {
            1
        });
        c = new <init>("TWO", 2, new int[] {
            1, 1
        });
        d = new <init>("THREE", 3, new int[] {
            1, 1, 1
        });
        e = new <init>("FOUR", 4, new int[] {
            1, 1, 1, 1
        });
        f = new <init>("FIVE", 5, new int[] {
            1, 3, 1
        });
        g = new <init>("SIX", 6, new int[] {
            3, 2, 1
        });
        h = new <init>("SEVEN", 7, new int[] {
            2, 3, 2
        });
        i = new <init>("EIGHT", 8, new int[] {
            2, 3, 2, 1
        });
        j = new <init>("NINE", 9, new int[] {
            2, 3, 3, 1
        });
        k = new <init>("TEN", 10, new int[] {
            2, 3, 3, 2
        });
        l = new <init>("ELEVEN", 11, new int[] {
            3, 3, 3, 2
        });
        m = new <init>("TWELVE", 12, new int[] {
            3, 3, 3, 3
        });
        $VALUES = (new .VALUES[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m
        });
    }

    private (String s, int i1, int ai[])
    {
        super(s, i1);
        mLayoutFormat = ai;
    }
}
