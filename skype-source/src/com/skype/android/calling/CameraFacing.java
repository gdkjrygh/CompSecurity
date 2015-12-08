// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;


public final class CameraFacing extends Enum
{

    public static final CameraFacing a;
    public static final CameraFacing b;
    public static final CameraFacing c;
    private static final CameraFacing d[];

    private CameraFacing(String s, int i)
    {
        super(s, i);
    }

    public static CameraFacing valueOf(String s)
    {
        return (CameraFacing)Enum.valueOf(com/skype/android/calling/CameraFacing, s);
    }

    public static CameraFacing[] values()
    {
        return (CameraFacing[])d.clone();
    }

    static 
    {
        a = new CameraFacing("FRONT", 0);
        b = new CameraFacing("BACK", 1);
        c = new CameraFacing("NONE", 2);
        d = (new CameraFacing[] {
            a, b, c
        });
    }
}
