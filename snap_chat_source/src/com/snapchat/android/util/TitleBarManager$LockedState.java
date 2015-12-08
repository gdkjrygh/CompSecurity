// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;


// Referenced classes of package com.snapchat.android.util:
//            TitleBarManager

public static final class  extends Enum
{

    private static final LOCKED $VALUES[];
    public static final LOCKED LOCKED;
    public static final LOCKED NOT_LOCKED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/TitleBarManager$LockedState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_LOCKED = new <init>("NOT_LOCKED", 0);
        LOCKED = new <init>("LOCKED", 1);
        $VALUES = (new .VALUES[] {
            NOT_LOCKED, LOCKED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
