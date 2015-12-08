// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.util;


// Referenced classes of package com.android.ex.photo.util:
//            ImageUtils

public static final class  extends Enum
{

    private static final NORMAL $VALUES[];
    public static final NORMAL EXTRA_SMALL;
    public static final NORMAL NORMAL;
    public static final NORMAL SMALL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/android/ex/photo/util/ImageUtils$ImageSize, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        EXTRA_SMALL = new <init>("EXTRA_SMALL", 0);
        SMALL = new <init>("SMALL", 1);
        NORMAL = new <init>("NORMAL", 2);
        $VALUES = (new .VALUES[] {
            EXTRA_SMALL, SMALL, NORMAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
