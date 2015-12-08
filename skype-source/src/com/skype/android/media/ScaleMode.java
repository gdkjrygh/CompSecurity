// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;


public final class ScaleMode extends Enum
{

    public static final ScaleMode a;
    public static final ScaleMode b;
    private static final ScaleMode c[];

    private ScaleMode(String s, int i)
    {
        super(s, i);
    }

    public static ScaleMode valueOf(String s)
    {
        return (ScaleMode)Enum.valueOf(com/skype/android/media/ScaleMode, s);
    }

    public static ScaleMode[] values()
    {
        return (ScaleMode[])c.clone();
    }

    static 
    {
        a = new ScaleMode("FIT", 0);
        b = new ScaleMode("CROP", 1);
        c = (new ScaleMode[] {
            a, b
        });
    }
}
