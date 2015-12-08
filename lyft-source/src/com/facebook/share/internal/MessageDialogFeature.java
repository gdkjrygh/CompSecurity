// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

public final class MessageDialogFeature extends Enum
    implements DialogFeature
{

    private static final MessageDialogFeature $VALUES[];
    public static final MessageDialogFeature MESSAGE_DIALOG;
    public static final MessageDialogFeature PHOTOS;
    public static final MessageDialogFeature VIDEO;
    private int minVersion;

    private MessageDialogFeature(String s, int i, int j)
    {
        super(s, i);
        minVersion = j;
    }

    public static MessageDialogFeature valueOf(String s)
    {
        return (MessageDialogFeature)Enum.valueOf(com/facebook/share/internal/MessageDialogFeature, s);
    }

    public static MessageDialogFeature[] values()
    {
        return (MessageDialogFeature[])$VALUES.clone();
    }

    public String getAction()
    {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }

    public int getMinVersion()
    {
        return minVersion;
    }

    static 
    {
        MESSAGE_DIALOG = new MessageDialogFeature("MESSAGE_DIALOG", 0, 0x13350ac);
        PHOTOS = new MessageDialogFeature("PHOTOS", 1, 0x1335124);
        VIDEO = new MessageDialogFeature("VIDEO", 2, 0x13354a2);
        $VALUES = (new MessageDialogFeature[] {
            MESSAGE_DIALOG, PHOTOS, VIDEO
        });
    }
}
