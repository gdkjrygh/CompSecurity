// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaPlayer

public static final class  extends Enum
{

    private static final BLACKOUTS $VALUES[];
    public static final BLACKOUTS AD_PLAYBACK;
    public static final BLACKOUTS BLACKOUTS;
    public static final BLACKOUTS DRM;
    public static final BLACKOUTS PLAYBACK;
    public static final BLACKOUTS QOS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/adobe/mediacore/MediaPlayer$Event, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PLAYBACK = new <init>("PLAYBACK", 0);
        AD_PLAYBACK = new <init>("AD_PLAYBACK", 1);
        QOS = new <init>("QOS", 2);
        DRM = new <init>("DRM", 3);
        BLACKOUTS = new <init>("BLACKOUTS", 4);
        $VALUES = (new .VALUES[] {
            PLAYBACK, AD_PLAYBACK, QOS, DRM, BLACKOUTS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
