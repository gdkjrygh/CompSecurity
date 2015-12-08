// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;


// Referenced classes of package com.microsoft.media:
//            RtcPalEnvironment

public static final class mValue extends Enum
{

    private static final BLUETOOTH $VALUES[];
    public static final BLUETOOTH BLUETOOTH;
    public static final BLUETOOTH NON_SPEAKER;
    public static final BLUETOOTH SPEAKER;
    private int mValue;

    public static mValue valueOf(String s)
    {
        return (mValue)Enum.valueOf(com/microsoft/media/RtcPalEnvironment$AudioEndpoint, s);
    }

    public static mValue[] values()
    {
        return (mValue[])$VALUES.clone();
    }

    public final int getAudioEndpoint()
    {
        return mValue;
    }

    static 
    {
        SPEAKER = new <init>("SPEAKER", 0, 1);
        NON_SPEAKER = new <init>("NON_SPEAKER", 1, 2);
        BLUETOOTH = new <init>("BLUETOOTH", 2, 4);
        $VALUES = (new .VALUES[] {
            SPEAKER, NON_SPEAKER, BLUETOOTH
        });
    }

    private _cls9(String s, int i, int j)
    {
        super(s, i);
        mValue = j;
    }
}
