// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            ChatFragment

public static final class  extends Enum
{

    private static final CONTEXTUAL_MENU $VALUES[];
    public static final CONTEXTUAL_MENU BUTTON;
    public static final CONTEXTUAL_MENU CONTEXTUAL_MENU;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/chat/ChatFragment$MojiForwardSource, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BUTTON = new <init>("BUTTON", 0);
        CONTEXTUAL_MENU = new <init>("CONTEXTUAL_MENU", 1);
        $VALUES = (new .VALUES[] {
            BUTTON, CONTEXTUAL_MENU
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
