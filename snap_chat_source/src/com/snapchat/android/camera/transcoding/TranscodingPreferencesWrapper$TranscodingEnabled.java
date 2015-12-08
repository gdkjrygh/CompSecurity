// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.transcoding;


// Referenced classes of package com.snapchat.android.camera.transcoding:
//            TranscodingPreferencesWrapper

public static final class a extends Enum
{

    private static final DISABLED $VALUES[];
    public static final DISABLED BLOCKED;
    public static final DISABLED DISABLED;
    public static final DISABLED ENABLED;
    public static final DISABLED ENABLED_FOR_LOW_QUALITY;
    public static final DISABLED TRANSCODING_NOT_SUPPORTED;
    public static final DISABLED UNKNOWN;
    private int a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/snapchat/android/camera/transcoding/TranscodingPreferencesWrapper$TranscodingEnabled, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    public final int getValue()
    {
        return a;
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0, 0);
        BLOCKED = new <init>("BLOCKED", 1, 1);
        TRANSCODING_NOT_SUPPORTED = new <init>("TRANSCODING_NOT_SUPPORTED", 2, 2);
        ENABLED_FOR_LOW_QUALITY = new <init>("ENABLED_FOR_LOW_QUALITY", 3, 3);
        ENABLED = new <init>("ENABLED", 4, 4);
        DISABLED = new <init>("DISABLED", 5, 5);
        $VALUES = (new .VALUES[] {
            UNKNOWN, BLOCKED, TRANSCODING_NOT_SUPPORTED, ENABLED_FOR_LOW_QUALITY, ENABLED, DISABLED
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        a = j;
    }
}
