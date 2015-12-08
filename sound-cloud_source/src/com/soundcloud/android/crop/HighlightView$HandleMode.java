// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;


// Referenced classes of package com.soundcloud.android.crop:
//            HighlightView

static final class  extends Enum
{

    private static final Never $VALUES[];
    public static final Never Always;
    public static final Never Changing;
    public static final Never Never;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/crop/HighlightView$HandleMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Changing = new <init>("Changing", 0);
        Always = new <init>("Always", 1);
        Never = new <init>("Never", 2);
        $VALUES = (new .VALUES[] {
            Changing, Always, Never
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
