// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.controller.countdown;


// Referenced classes of package com.snapchat.android.controller.countdown:
//            SnapCountdownController

public static final class  extends Enum
{

    private static final SKIP $VALUES[];
    public static final SKIP CANCEL;
    public static final SKIP EXPIRE;
    public static final SKIP SKIP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/controller/countdown/SnapCountdownController$Action, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        EXPIRE = new <init>("EXPIRE", 0);
        CANCEL = new <init>("CANCEL", 1);
        SKIP = new <init>("SKIP", 2);
        $VALUES = (new .VALUES[] {
            EXPIRE, CANCEL, SKIP
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
