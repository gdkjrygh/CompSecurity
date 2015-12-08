// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

public final class OpenGraphActionDialogFeature extends Enum
    implements DialogFeature
{

    private static final OpenGraphActionDialogFeature $VALUES[];
    public static final OpenGraphActionDialogFeature OG_ACTION_DIALOG;
    private int minVersion;

    private OpenGraphActionDialogFeature(String s, int i, int j)
    {
        super(s, i);
        minVersion = j;
    }

    public static OpenGraphActionDialogFeature valueOf(String s)
    {
        return (OpenGraphActionDialogFeature)Enum.valueOf(com/facebook/share/internal/OpenGraphActionDialogFeature, s);
    }

    public static OpenGraphActionDialogFeature[] values()
    {
        return (OpenGraphActionDialogFeature[])$VALUES.clone();
    }

    public String getAction()
    {
        return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    }

    public int getMinVersion()
    {
        return minVersion;
    }

    static 
    {
        OG_ACTION_DIALOG = new OpenGraphActionDialogFeature("OG_ACTION_DIALOG", 0, 0x1332b3a);
        $VALUES = (new OpenGraphActionDialogFeature[] {
            OG_ACTION_DIALOG
        });
    }
}
