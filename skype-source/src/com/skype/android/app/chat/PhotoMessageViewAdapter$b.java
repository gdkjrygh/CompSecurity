// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            PhotoMessageViewAdapter

private static final class  extends Enum
{

    private static final DEFAULT $VALUES[];
    public static final DEFAULT DEFAULT;
    public static final DEFAULT FAILED;
    public static final DEFAULT LOADING;
    public static final DEFAULT UNAVAILABLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/chat/PhotoMessageViewAdapter$b, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LOADING = new <init>("LOADING", 0);
        UNAVAILABLE = new <init>("UNAVAILABLE", 1);
        FAILED = new <init>("FAILED", 2);
        DEFAULT = new <init>("DEFAULT", 3);
        $VALUES = (new .VALUES[] {
            LOADING, UNAVAILABLE, FAILED, DEFAULT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
