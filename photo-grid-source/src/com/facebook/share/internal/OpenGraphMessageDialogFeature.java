// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

public final class OpenGraphMessageDialogFeature extends Enum
    implements DialogFeature
{

    private static final OpenGraphMessageDialogFeature $VALUES[];
    public static final OpenGraphMessageDialogFeature OG_MESSAGE_DIALOG;
    private int minVersion;

    private OpenGraphMessageDialogFeature(String s, int i, int j)
    {
        super(s, i);
        minVersion = j;
    }

    public static OpenGraphMessageDialogFeature valueOf(String s)
    {
        return (OpenGraphMessageDialogFeature)Enum.valueOf(com/facebook/share/internal/OpenGraphMessageDialogFeature, s);
    }

    public static OpenGraphMessageDialogFeature[] values()
    {
        return (OpenGraphMessageDialogFeature[])$VALUES.clone();
    }

    public final String getAction()
    {
        return "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
    }

    public final int getMinVersion()
    {
        return minVersion;
    }

    static 
    {
        OG_MESSAGE_DIALOG = new OpenGraphMessageDialogFeature("OG_MESSAGE_DIALOG", 0, 0x13350ac);
        $VALUES = (new OpenGraphMessageDialogFeature[] {
            OG_MESSAGE_DIALOG
        });
    }
}
