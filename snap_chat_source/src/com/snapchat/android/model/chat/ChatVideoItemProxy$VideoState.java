// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;


// Referenced classes of package com.snapchat.android.model.chat:
//            ChatVideoItemProxy

public static final class  extends Enum
{

    private static final PLAYING $VALUES[];
    public static final PLAYING ERROR;
    public static final PLAYING LOADING;
    public static final PLAYING PAUSED;
    public static final PLAYING PLAYING;
    public static final PLAYING STOPPED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/chat/ChatVideoItemProxy$VideoState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ERROR = new <init>("ERROR", 0);
        PAUSED = new <init>("PAUSED", 1);
        STOPPED = new <init>("STOPPED", 2);
        LOADING = new <init>("LOADING", 3);
        PLAYING = new <init>("PLAYING", 4);
        $VALUES = (new .VALUES[] {
            ERROR, PAUSED, STOPPED, LOADING, PLAYING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
