// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;


// Referenced classes of package com.snapchat.android.model:
//            Friend

public static final class  extends Enum
{

    private static final NONE $VALUES[];
    public static final NONE ADDRESS_BOOK;
    public static final NONE NONE;
    public static final NONE OFFICIAL_STORY;
    public static final NONE USERNAME;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/Friend$SuggestType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        USERNAME = new <init>("USERNAME", 0);
        ADDRESS_BOOK = new <init>("ADDRESS_BOOK", 1);
        OFFICIAL_STORY = new <init>("OFFICIAL_STORY", 2);
        NONE = new <init>("NONE", 3);
        $VALUES = (new .VALUES[] {
            USERNAME, ADDRESS_BOOK, OFFICIAL_STORY, NONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
