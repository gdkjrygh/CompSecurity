// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;


public final class minVersion extends Enum
    implements minVersion
{

    private static final OG_MESSAGE_DIALOG $VALUES[];
    public static final OG_MESSAGE_DIALOG OG_MESSAGE_DIALOG;
    private int minVersion;

    public static minVersion valueOf(String s)
    {
        return (minVersion)Enum.valueOf(com/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature, s);
    }

    public static minVersion[] values()
    {
        return (minVersion[])$VALUES.clone();
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
        OG_MESSAGE_DIALOG = new <init>("OG_MESSAGE_DIALOG", 0, 0x13350ac);
        $VALUES = (new .VALUES[] {
            OG_MESSAGE_DIALOG
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        minVersion = j;
    }
}
