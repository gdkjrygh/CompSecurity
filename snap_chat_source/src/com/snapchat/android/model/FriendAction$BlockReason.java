// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;


// Referenced classes of package com.snapchat.android.model:
//            FriendAction

public static final class textId extends Enum
{

    private static final OTHER $VALUES[];
    public static final OTHER ANNOYING;
    public static final OTHER DONT_KNOW_WHOM;
    public static final OTHER HARASSING_ME;
    public static final OTHER INAPPROPRIATE_SNAPS;
    public static final OTHER OTHER;
    private int code;
    private int textId;

    public static textId valueOf(String s)
    {
        return (textId)Enum.valueOf(com/snapchat/android/model/FriendAction$BlockReason, s);
    }

    public static textId[] values()
    {
        return (textId[])$VALUES.clone();
    }

    public final int getCode()
    {
        return code;
    }

    public final int getTextId()
    {
        return textId;
    }

    static 
    {
        INAPPROPRIATE_SNAPS = new <init>("INAPPROPRIATE_SNAPS", 0, 1, 0x7f080072);
        HARASSING_ME = new <init>("HARASSING_ME", 1, 2, 0x7f080071);
        ANNOYING = new <init>("ANNOYING", 2, 3, 0x7f08006f);
        DONT_KNOW_WHOM = new <init>("DONT_KNOW_WHOM", 3, 4, 0x7f080070);
        OTHER = new <init>("OTHER", 4, 0, 0x7f080073);
        $VALUES = (new .VALUES[] {
            INAPPROPRIATE_SNAPS, HARASSING_ME, ANNOYING, DONT_KNOW_WHOM, OTHER
        });
    }

    private _cls9(String s, int i, int j, int k)
    {
        super(s, i);
        code = j;
        textId = k;
    }
}
