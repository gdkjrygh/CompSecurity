// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

public final class LikeDialogFeature extends Enum
    implements DialogFeature
{

    private static final LikeDialogFeature $VALUES[];
    public static final LikeDialogFeature LIKE_DIALOG;
    private int minVersion;

    private LikeDialogFeature(String s, int i, int j)
    {
        super(s, i);
        minVersion = j;
    }

    public static LikeDialogFeature valueOf(String s)
    {
        return (LikeDialogFeature)Enum.valueOf(com/facebook/share/internal/LikeDialogFeature, s);
    }

    public static LikeDialogFeature[] values()
    {
        return (LikeDialogFeature[])$VALUES.clone();
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
        LIKE_DIALOG = new LikeDialogFeature("LIKE_DIALOG", 0, 0x133529d);
        $VALUES = (new LikeDialogFeature[] {
            LIKE_DIALOG
        });
    }
}
