// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.media;


// Referenced classes of package org.apache.cordova.media:
//            AudioPlayer

public static final class  extends Enum
{

    private static final RECORD $VALUES[];
    public static final RECORD NONE;
    public static final RECORD PLAY;
    public static final RECORD RECORD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/apache/cordova/media/AudioPlayer$MODE, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        PLAY = new <init>("PLAY", 1);
        RECORD = new <init>("RECORD", 2);
        $VALUES = (new .VALUES[] {
            NONE, PLAY, RECORD
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
