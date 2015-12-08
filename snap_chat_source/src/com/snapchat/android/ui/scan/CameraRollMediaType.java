// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.scan;


public final class CameraRollMediaType extends Enum
{

    private static final CameraRollMediaType $VALUES[];
    public static final CameraRollMediaType IMAGE;
    public static final CameraRollMediaType VIDEO;

    private CameraRollMediaType(String s, int i)
    {
        super(s, i);
    }

    public static CameraRollMediaType valueOf(String s)
    {
        return (CameraRollMediaType)Enum.valueOf(com/snapchat/android/ui/scan/CameraRollMediaType, s);
    }

    public static CameraRollMediaType[] values()
    {
        return (CameraRollMediaType[])$VALUES.clone();
    }

    static 
    {
        IMAGE = new CameraRollMediaType("IMAGE", 0);
        VIDEO = new CameraRollMediaType("VIDEO", 1);
        $VALUES = (new CameraRollMediaType[] {
            IMAGE, VIDEO
        });
    }
}
