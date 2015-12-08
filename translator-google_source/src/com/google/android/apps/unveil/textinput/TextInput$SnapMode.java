// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;


public final class A extends Enum
{

    public static final DEBUG_BOTH_HIGHRES DEBUG_BOTH_HIGHRES;
    public static final DEBUG_BOTH_HIGHRES DEBUG_BOTH_LOWRES;
    public static final DEBUG_BOTH_HIGHRES EXTERNAL;
    public static final DEBUG_BOTH_HIGHRES RECENT_FRAME;
    public static final DEBUG_BOTH_HIGHRES TAKE_PICTURE;
    private static final DEBUG_BOTH_HIGHRES a[];

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/google/android/apps/unveil/textinput/TextInput$SnapMode, s);
    }

    public static A[] values()
    {
        return (A[])a.clone();
    }

    static 
    {
        EXTERNAL = new <init>("EXTERNAL", 0);
        TAKE_PICTURE = new <init>("TAKE_PICTURE", 1);
        RECENT_FRAME = new <init>("RECENT_FRAME", 2);
        DEBUG_BOTH_LOWRES = new <init>("DEBUG_BOTH_LOWRES", 3);
        DEBUG_BOTH_HIGHRES = new <init>("DEBUG_BOTH_HIGHRES", 4);
        a = (new a[] {
            EXTERNAL, TAKE_PICTURE, RECENT_FRAME, DEBUG_BOTH_LOWRES, DEBUG_BOTH_HIGHRES
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
