// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view;


// Referenced classes of package com.auditude.ads.view:
//            AdPlaybackSession

public static final class  extends Enum
{

    public static final NOTIFY CLICK;
    public static final NOTIFY COMPLETE;
    private static final NOTIFY ENUM$VALUES[];
    public static final NOTIFY ERROR;
    public static final NOTIFY NOTIFY;
    public static final NOTIFY PAUSE;
    public static final NOTIFY PROGRESS;
    public static final NOTIFY RESUME;
    public static final NOTIFY SKIP;
    public static final NOTIFY START;
    public static final NOTIFY STOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/auditude/ads/view/AdPlaybackSession$PlaybackConstants, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        START = new <init>("START", 0);
        PAUSE = new <init>("PAUSE", 1);
        RESUME = new <init>("RESUME", 2);
        STOP = new <init>("STOP", 3);
        COMPLETE = new <init>("COMPLETE", 4);
        ERROR = new <init>("ERROR", 5);
        CLICK = new <init>("CLICK", 6);
        SKIP = new <init>("SKIP", 7);
        PROGRESS = new <init>("PROGRESS", 8);
        NOTIFY = new <init>("NOTIFY", 9);
        ENUM$VALUES = (new ENUM.VALUES[] {
            START, PAUSE, RESUME, STOP, COMPLETE, ERROR, CLICK, SKIP, PROGRESS, NOTIFY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
