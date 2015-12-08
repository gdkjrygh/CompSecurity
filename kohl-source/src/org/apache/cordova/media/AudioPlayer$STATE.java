// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.media;


// Referenced classes of package org.apache.cordova.media:
//            AudioPlayer

public static final class  extends Enum
{

    private static final MEDIA_LOADING $VALUES[];
    public static final MEDIA_LOADING MEDIA_LOADING;
    public static final MEDIA_LOADING MEDIA_NONE;
    public static final MEDIA_LOADING MEDIA_PAUSED;
    public static final MEDIA_LOADING MEDIA_RUNNING;
    public static final MEDIA_LOADING MEDIA_STARTING;
    public static final MEDIA_LOADING MEDIA_STOPPED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/apache/cordova/media/AudioPlayer$STATE, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MEDIA_NONE = new <init>("MEDIA_NONE", 0);
        MEDIA_STARTING = new <init>("MEDIA_STARTING", 1);
        MEDIA_RUNNING = new <init>("MEDIA_RUNNING", 2);
        MEDIA_PAUSED = new <init>("MEDIA_PAUSED", 3);
        MEDIA_STOPPED = new <init>("MEDIA_STOPPED", 4);
        MEDIA_LOADING = new <init>("MEDIA_LOADING", 5);
        $VALUES = (new .VALUES[] {
            MEDIA_NONE, MEDIA_STARTING, MEDIA_RUNNING, MEDIA_PAUSED, MEDIA_STOPPED, MEDIA_LOADING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
