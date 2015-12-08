// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;


// Referenced classes of package com.tinder.views:
//            LikeMeter

public static final class  extends Enum
{

    private static final EXTRA_LARGE $VALUES[];
    public static final EXTRA_LARGE EXTRA_LARGE;
    public static final EXTRA_LARGE NORMAL;
    public static final EXTRA_LARGE PLUS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/tinder/views/LikeMeter$AssetMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0);
        PLUS = new <init>("PLUS", 1);
        EXTRA_LARGE = new <init>("EXTRA_LARGE", 2);
        $VALUES = (new .VALUES[] {
            NORMAL, PLUS, EXTRA_LARGE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
