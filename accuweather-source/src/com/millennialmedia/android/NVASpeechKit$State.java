// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            NVASpeechKit

public static final class name extends Enum
{

    private static final PROCESSING $VALUES[];
    public static final PROCESSING ERROR;
    public static final PROCESSING PROCESSING;
    public static final PROCESSING READY;
    public static final PROCESSING RECORDING;
    public static final PROCESSING VOCALIZING;
    private String name;

    public static name valueOf(String s)
    {
        return (name)Enum.valueOf(com/millennialmedia/android/NVASpeechKit$State, s);
    }

    public static name[] values()
    {
        return (name[])$VALUES.clone();
    }

    public String toString()
    {
        return name;
    }

    static 
    {
        ERROR = new <init>("ERROR", 0, "error");
        VOCALIZING = new <init>("VOCALIZING", 1, "vocalizing");
        RECORDING = new <init>("RECORDING", 2, "recording");
        READY = new <init>("READY", 3, "ready");
        PROCESSING = new <init>("PROCESSING", 4, "processing");
        $VALUES = (new .VALUES[] {
            ERROR, VOCALIZING, RECORDING, READY, PROCESSING
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }
}
