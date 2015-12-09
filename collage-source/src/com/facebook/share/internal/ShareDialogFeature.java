// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

public final class ShareDialogFeature extends Enum
    implements DialogFeature
{

    private static final ShareDialogFeature $VALUES[];
    public static final ShareDialogFeature PHOTOS;
    public static final ShareDialogFeature SHARE_DIALOG;
    public static final ShareDialogFeature VIDEO;
    private int minVersion;

    private ShareDialogFeature(String s, int i, int j)
    {
        super(s, i);
        minVersion = j;
    }

    public static ShareDialogFeature valueOf(String s)
    {
        return (ShareDialogFeature)Enum.valueOf(com/facebook/share/internal/ShareDialogFeature, s);
    }

    public static ShareDialogFeature[] values()
    {
        return (ShareDialogFeature[])$VALUES.clone();
    }

    public String getAction()
    {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }

    public int getMinVersion()
    {
        return minVersion;
    }

    static 
    {
        SHARE_DIALOG = new ShareDialogFeature("SHARE_DIALOG", 0, 0x1332b3a);
        PHOTOS = new ShareDialogFeature("PHOTOS", 1, 0x13350ac);
        VIDEO = new ShareDialogFeature("VIDEO", 2, 0x13353e4);
        $VALUES = (new ShareDialogFeature[] {
            SHARE_DIALOG, PHOTOS, VIDEO
        });
    }
}
