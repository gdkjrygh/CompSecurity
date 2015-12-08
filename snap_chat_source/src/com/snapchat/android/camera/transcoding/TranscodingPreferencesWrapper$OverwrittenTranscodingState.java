// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.transcoding;


// Referenced classes of package com.snapchat.android.camera.transcoding:
//            TranscodingPreferencesWrapper

public static final class b extends Enum
{

    private static final FORCE_DISABLED $VALUES[];
    public static final FORCE_DISABLED FORCE_DISABLED;
    public static final FORCE_DISABLED FORCE_ENABLED;
    public static final FORCE_DISABLED OVERWRITE_OFF;
    private int a;
    private FORCE_DISABLED b;

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/snapchat/android/camera/transcoding/TranscodingPreferencesWrapper$OverwrittenTranscodingState, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    public final int getIndex()
    {
        return a;
    }

    public final a getValue()
    {
        return b;
    }

    static 
    {
        OVERWRITE_OFF = new <init>("OVERWRITE_OFF", 0, 0, <init>);
        FORCE_ENABLED = new <init>("FORCE_ENABLED", 1, 1, <init>);
        FORCE_DISABLED = new <init>("FORCE_DISABLED", 2, 2, <init>);
        $VALUES = (new .VALUES[] {
            OVERWRITE_OFF, FORCE_ENABLED, FORCE_DISABLED
        });
    }

    private (String s, int i, int j,  )
    {
        super(s, i);
        a = j;
        b = ;
    }
}
