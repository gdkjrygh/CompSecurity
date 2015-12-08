// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;


// Referenced classes of package com.soundcloud.android.creators.record:
//            TrimHandleView

public static final class backgroundResId extends Enum
{

    private static final RIGHT $VALUES[];
    public static final RIGHT LEFT;
    public static final RIGHT RIGHT;
    private final int backgroundResId;
    private final android.widget.s layoutParams;

    public static backgroundResId valueOf(String s)
    {
        return (backgroundResId)Enum.valueOf(com/soundcloud/android/creators/record/TrimHandleView$HandleType, s);
    }

    public static backgroundResId[] values()
    {
        return (backgroundResId[])$VALUES.clone();
    }

    static 
    {
        LEFT = new <init>("LEFT", 0, TrimHandleView.access$200(), 0x7f02018f);
        RIGHT = new <init>("RIGHT", 1, TrimHandleView.getRightLayoutParams(), 0x7f020190);
        $VALUES = (new .VALUES[] {
            LEFT, RIGHT
        });
    }



    private (String s, int i, android.widget.s s1, int j)
    {
        super(s, i);
        layoutParams = s1;
        backgroundResId = j;
    }
}
