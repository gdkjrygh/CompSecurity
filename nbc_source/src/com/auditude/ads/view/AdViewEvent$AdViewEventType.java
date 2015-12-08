// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view;


// Referenced classes of package com.auditude.ads.view:
//            AdViewEvent

public static final class  extends Enum
{

    public static final AD_SKIP AD_CLICK;
    public static final AD_SKIP AD_COMPLETE;
    public static final AD_SKIP AD_ERROR;
    public static final AD_SKIP AD_LOAD;
    public static final AD_SKIP AD_LOG;
    public static final AD_SKIP AD_PAUSE;
    public static final AD_SKIP AD_PROGRESS;
    public static final AD_SKIP AD_REPLAY;
    public static final AD_SKIP AD_RESUME;
    public static final AD_SKIP AD_SKIP;
    public static final AD_SKIP AD_START;
    public static final AD_SKIP AD_STOP;
    public static final AD_SKIP AD_USER_CLOSE;
    public static final AD_SKIP AD_VOLUME_CHANGE;
    private static final AD_SKIP ENUM$VALUES[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/auditude/ads/view/AdViewEvent$AdViewEventType, s);
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
        AD_START = new <init>("AD_START", 0);
        AD_REPLAY = new <init>("AD_REPLAY", 1);
        AD_STOP = new <init>("AD_STOP", 2);
        AD_COMPLETE = new <init>("AD_COMPLETE", 3);
        AD_LOAD = new <init>("AD_LOAD", 4);
        AD_PROGRESS = new <init>("AD_PROGRESS", 5);
        AD_PAUSE = new <init>("AD_PAUSE", 6);
        AD_RESUME = new <init>("AD_RESUME", 7);
        AD_LOG = new <init>("AD_LOG", 8);
        AD_ERROR = new <init>("AD_ERROR", 9);
        AD_CLICK = new <init>("AD_CLICK", 10);
        AD_VOLUME_CHANGE = new <init>("AD_VOLUME_CHANGE", 11);
        AD_USER_CLOSE = new <init>("AD_USER_CLOSE", 12);
        AD_SKIP = new <init>("AD_SKIP", 13);
        ENUM$VALUES = (new ENUM.VALUES[] {
            AD_START, AD_REPLAY, AD_STOP, AD_COMPLETE, AD_LOAD, AD_PROGRESS, AD_PAUSE, AD_RESUME, AD_LOG, AD_ERROR, 
            AD_CLICK, AD_VOLUME_CHANGE, AD_USER_CLOSE, AD_SKIP
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
