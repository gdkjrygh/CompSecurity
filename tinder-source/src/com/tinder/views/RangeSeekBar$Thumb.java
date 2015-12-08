// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;


// Referenced classes of package com.tinder.views:
//            RangeSeekBar

private static final class  extends Enum
{

    private static final MAX $VALUES[];
    public static final MAX MAX;
    public static final MAX MIN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/tinder/views/RangeSeekBar$Thumb, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MIN = new <init>("MIN", 0);
        MAX = new <init>("MAX", 1);
        $VALUES = (new .VALUES[] {
            MIN, MAX
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
