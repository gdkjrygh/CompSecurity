// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video;


// Referenced classes of package com.skype.android.video:
//            ViewSnapper

public static final class  extends Enum
{

    private static final RIGHT $VALUES[];
    public static final RIGHT CENTER;
    public static final RIGHT LEFT;
    public static final RIGHT NONE;
    public static final RIGHT RIGHT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/video/ViewSnapper$HorizontalSnap, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        LEFT = new <init>("LEFT", 1);
        CENTER = new <init>("CENTER", 2);
        RIGHT = new <init>("RIGHT", 3);
        $VALUES = (new .VALUES[] {
            NONE, LEFT, CENTER, RIGHT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
