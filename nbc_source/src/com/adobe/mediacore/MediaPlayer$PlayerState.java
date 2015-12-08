// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaPlayer

public static final class  extends Enum
{

    private static final SUSPENDED $VALUES[];
    public static final SUSPENDED COMPLETE;
    public static final SUSPENDED ERROR;
    public static final SUSPENDED IDLE;
    public static final SUSPENDED INITIALIZED;
    public static final SUSPENDED INITIALIZING;
    public static final SUSPENDED PAUSED;
    public static final SUSPENDED PLAYING;
    public static final SUSPENDED PREPARED;
    public static final SUSPENDED PREPARING;
    public static final SUSPENDED READY;
    public static final SUSPENDED RELEASED;
    public static final SUSPENDED SUSPENDED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/adobe/mediacore/MediaPlayer$PlayerState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        IDLE = new <init>("IDLE", 0);
        INITIALIZING = new <init>("INITIALIZING", 1);
        INITIALIZED = new <init>("INITIALIZED", 2);
        PREPARING = new <init>("PREPARING", 3);
        PREPARED = new <init>("PREPARED", 4);
        READY = new <init>("READY", 5);
        PLAYING = new <init>("PLAYING", 6);
        PAUSED = new <init>("PAUSED", 7);
        COMPLETE = new <init>("COMPLETE", 8);
        ERROR = new <init>("ERROR", 9);
        RELEASED = new <init>("RELEASED", 10);
        SUSPENDED = new <init>("SUSPENDED", 11);
        $VALUES = (new .VALUES[] {
            IDLE, INITIALIZING, INITIALIZED, PREPARING, PREPARED, READY, PLAYING, PAUSED, COMPLETE, ERROR, 
            RELEASED, SUSPENDED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
