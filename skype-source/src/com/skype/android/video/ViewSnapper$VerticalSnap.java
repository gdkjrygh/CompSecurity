// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video;


// Referenced classes of package com.skype.android.video:
//            ViewSnapper

public static final class  extends Enum
{

    private static final BOTTOM $VALUES[];
    public static final BOTTOM BOTTOM;
    public static final BOTTOM CENTER;
    public static final BOTTOM NONE;
    public static final BOTTOM TOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/video/ViewSnapper$VerticalSnap, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        TOP = new <init>("TOP", 1);
        CENTER = new <init>("CENTER", 2);
        BOTTOM = new <init>("BOTTOM", 3);
        $VALUES = (new .VALUES[] {
            NONE, TOP, CENTER, BOTTOM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
