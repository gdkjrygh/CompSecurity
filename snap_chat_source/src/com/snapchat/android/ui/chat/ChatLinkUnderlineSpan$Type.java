// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.chat;


// Referenced classes of package com.snapchat.android.ui.chat:
//            ChatLinkUnderlineSpan

public static final class  extends Enum
{

    private static final Url $VALUES[];
    public static final Url Underline;
    public static final Url Url;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/ui/chat/ChatLinkUnderlineSpan$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Underline = new <init>("Underline", 0);
        Url = new <init>("Url", 1);
        $VALUES = (new .VALUES[] {
            Underline, Url
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
