// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.eventbus;


public final class SnapCaptureContext extends Enum
{

    private static final SnapCaptureContext $VALUES[];
    public static final SnapCaptureContext CAMERA;
    public static final SnapCaptureContext DISCOVER;
    public static final SnapCaptureContext PHONE_GALLERY;
    public static final SnapCaptureContext SHARE_EXTENSION;

    private SnapCaptureContext(String s, int i)
    {
        super(s, i);
    }

    public static SnapCaptureContext valueOf(String s)
    {
        return (SnapCaptureContext)Enum.valueOf(com/snapchat/android/util/eventbus/SnapCaptureContext, s);
    }

    public static SnapCaptureContext[] values()
    {
        return (SnapCaptureContext[])$VALUES.clone();
    }

    static 
    {
        CAMERA = new SnapCaptureContext("CAMERA", 0);
        DISCOVER = new SnapCaptureContext("DISCOVER", 1);
        PHONE_GALLERY = new SnapCaptureContext("PHONE_GALLERY", 2);
        SHARE_EXTENSION = new SnapCaptureContext("SHARE_EXTENSION", 3);
        $VALUES = (new SnapCaptureContext[] {
            CAMERA, DISCOVER, PHONE_GALLERY, SHARE_EXTENSION
        });
    }
}
