// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.pcmhost;


// Referenced classes of package com.skype.pcmhost:
//            PcmHost

private static final class  extends Enum
{

    private static final SCO_CONNECTED $VALUES[];
    public static final SCO_CONNECTED EARPIECE;
    public static final SCO_CONNECTED HEADSET;
    public static final SCO_CONNECTED SCO_CONNECTED;
    public static final SCO_CONNECTED SCO_CONNECTING;
    public static final SCO_CONNECTED SPEAKER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/pcmhost/PcmHost$AudioRouteStates, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        EARPIECE = new <init>("EARPIECE", 0);
        HEADSET = new <init>("HEADSET", 1);
        SPEAKER = new <init>("SPEAKER", 2);
        SCO_CONNECTING = new <init>("SCO_CONNECTING", 3);
        SCO_CONNECTED = new <init>("SCO_CONNECTED", 4);
        $VALUES = (new .VALUES[] {
            EARPIECE, HEADSET, SPEAKER, SCO_CONNECTING, SCO_CONNECTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
