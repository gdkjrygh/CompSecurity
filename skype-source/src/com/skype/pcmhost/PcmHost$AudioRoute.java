// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.pcmhost;


// Referenced classes of package com.skype.pcmhost:
//            PcmHost

public static final class  extends Enum
{

    private static final HEADSET_WITHOUT_MIC $VALUES[];
    public static final HEADSET_WITHOUT_MIC BLUETOOTH;
    public static final HEADSET_WITHOUT_MIC EARPIECE;
    public static final HEADSET_WITHOUT_MIC HEADSET_WITHOUT_MIC;
    public static final HEADSET_WITHOUT_MIC HEADSET_WITH_MIC;
    public static final HEADSET_WITHOUT_MIC SPEAKER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/pcmhost/PcmHost$AudioRoute, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        EARPIECE = new <init>("EARPIECE", 0);
        SPEAKER = new <init>("SPEAKER", 1);
        BLUETOOTH = new <init>("BLUETOOTH", 2);
        HEADSET_WITH_MIC = new <init>("HEADSET_WITH_MIC", 3);
        HEADSET_WITHOUT_MIC = new <init>("HEADSET_WITHOUT_MIC", 4);
        $VALUES = (new .VALUES[] {
            EARPIECE, SPEAKER, BLUETOOTH, HEADSET_WITH_MIC, HEADSET_WITHOUT_MIC
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
