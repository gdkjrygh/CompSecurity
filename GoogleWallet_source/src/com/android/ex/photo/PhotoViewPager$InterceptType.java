// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo;


// Referenced classes of package com.android.ex.photo:
//            PhotoViewPager

public static final class  extends Enum
{

    private static final BOTH $VALUES[];
    public static final BOTH BOTH;
    public static final BOTH LEFT;
    public static final BOTH NONE;
    public static final BOTH RIGHT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/android/ex/photo/PhotoViewPager$InterceptType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        LEFT = new <init>("LEFT", 1);
        RIGHT = new <init>("RIGHT", 2);
        BOTH = new <init>("BOTH", 3);
        $VALUES = (new .VALUES[] {
            NONE, LEFT, RIGHT, BOTH
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
