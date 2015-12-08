// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;


public final class minVersion extends Enum
    implements minVersion
{

    private static final OG_ACTION_DIALOG $VALUES[];
    public static final OG_ACTION_DIALOG OG_ACTION_DIALOG;
    private int minVersion;

    public static minVersion valueOf(String s)
    {
        return (minVersion)Enum.valueOf(com/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature, s);
    }

    public static minVersion[] values()
    {
        return (minVersion[])$VALUES.clone();
    }

    public final String getAction()
    {
        return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    }

    public final int getMinVersion()
    {
        return minVersion;
    }

    static 
    {
        OG_ACTION_DIALOG = new <init>("OG_ACTION_DIALOG", 0, 0x1332b3a);
        $VALUES = (new .VALUES[] {
            OG_ACTION_DIALOG
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        minVersion = j;
    }
}
