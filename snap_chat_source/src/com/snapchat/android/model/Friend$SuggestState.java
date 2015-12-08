// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;


// Referenced classes of package com.snapchat.android.model:
//            Friend

public static final class  extends Enum
{

    private static final ADDRESS_BOOK $VALUES[];
    public static final ADDRESS_BOOK ADDRESS_BOOK;
    public static final ADDRESS_BOOK DOES_NOT_EXIST;
    public static final ADDRESS_BOOK EXISTS;
    public static final ADDRESS_BOOK FAILED;
    public static final ADDRESS_BOOK NOT_SUGGESTION;
    public static final ADDRESS_BOOK PENDING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/Friend$SuggestState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_SUGGESTION = new <init>("NOT_SUGGESTION", 0);
        PENDING = new <init>("PENDING", 1);
        FAILED = new <init>("FAILED", 2);
        EXISTS = new <init>("EXISTS", 3);
        DOES_NOT_EXIST = new <init>("DOES_NOT_EXIST", 4);
        ADDRESS_BOOK = new <init>("ADDRESS_BOOK", 5);
        $VALUES = (new .VALUES[] {
            NOT_SUGGESTION, PENDING, FAILED, EXISTS, DOES_NOT_EXIST, ADDRESS_BOOK
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
