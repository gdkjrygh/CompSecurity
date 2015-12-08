// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;


// Referenced classes of package com.snapchat.android.model:
//            FriendManager

public static final class  extends Enum
{

    private static final HIGH $VALUES[];
    public static final HIGH HIGH;
    public static final HIGH LOW;
    public static final HIGH MEDIUM;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/FriendManager$FriendRequestRate, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LOW = new <init>("LOW", 0);
        MEDIUM = new <init>("MEDIUM", 1);
        HIGH = new <init>("HIGH", 2);
        $VALUES = (new .VALUES[] {
            LOW, MEDIUM, HIGH
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
