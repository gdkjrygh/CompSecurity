// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            MojiMediaMessageViewAdapter

private static final class  extends Enum
{

    private static final PLAYED $VALUES[];
    public static final PLAYED LOADING_MOJI;
    public static final PLAYED LOADING_PREVIEW;
    public static final PLAYED PLAYED;
    public static final PLAYED PLAYING;
    public static final PLAYED READY_FOR_PLAY;
    public static final PLAYED UNAVAILABLE_MOJI;
    public static final PLAYED UNAVAILABLE_PREVIEW;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/chat/MojiMediaMessageViewAdapter$b, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LOADING_PREVIEW = new <init>("LOADING_PREVIEW", 0);
        LOADING_MOJI = new <init>("LOADING_MOJI", 1);
        UNAVAILABLE_PREVIEW = new <init>("UNAVAILABLE_PREVIEW", 2);
        UNAVAILABLE_MOJI = new <init>("UNAVAILABLE_MOJI", 3);
        READY_FOR_PLAY = new <init>("READY_FOR_PLAY", 4);
        PLAYING = new <init>("PLAYING", 5);
        PLAYED = new <init>("PLAYED", 6);
        $VALUES = (new .VALUES[] {
            LOADING_PREVIEW, LOADING_MOJI, UNAVAILABLE_PREVIEW, UNAVAILABLE_MOJI, READY_FOR_PLAY, PLAYING, PLAYED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
