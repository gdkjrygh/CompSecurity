// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


final class minVersion extends Enum
    implements com.facebook.widget.e
{

    private static final LIKE_DIALOG $VALUES[];
    public static final LIKE_DIALOG LIKE_DIALOG;
    private int minVersion;

    public static minVersion valueOf(String s)
    {
        return (minVersion)Enum.valueOf(com/facebook/internal/LikeActionController$LikeDialogFeature, s);
    }

    public static minVersion[] values()
    {
        return (minVersion[])$VALUES.clone();
    }

    public final String getAction()
    {
        return "com.facebook.platform.action.request.LIKE_DIALOG";
    }

    public final int getMinVersion()
    {
        return minVersion;
    }

    static 
    {
        LIKE_DIALOG = new <init>("LIKE_DIALOG", 0, 0x133529d);
        $VALUES = (new .VALUES[] {
            LIKE_DIALOG
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        minVersion = j;
    }
}
