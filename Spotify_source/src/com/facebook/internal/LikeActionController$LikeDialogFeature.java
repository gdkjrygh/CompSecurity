// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import ary;

public final class minVersion extends Enum
    implements ary
{

    public static final a a;
    private static final a b[];
    private int minVersion;

    public static minVersion valueOf(String s)
    {
        return (minVersion)Enum.valueOf(com/facebook/internal/LikeActionController$LikeDialogFeature, s);
    }

    public static minVersion[] values()
    {
        return (minVersion[])b.clone();
    }

    public final String a()
    {
        return "com.facebook.platform.action.request.LIKE_DIALOG";
    }

    public final int b()
    {
        return minVersion;
    }

    static 
    {
        a = new <init>("LIKE_DIALOG");
        b = (new b[] {
            a
        });
    }

    private (String s)
    {
        super(s, 0);
        minVersion = 0x133529d;
    }
}
