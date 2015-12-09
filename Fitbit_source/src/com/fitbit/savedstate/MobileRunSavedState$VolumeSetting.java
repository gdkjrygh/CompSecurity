// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;


// Referenced classes of package com.fitbit.savedstate:
//            MobileRunSavedState

public static final class volume extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];
    private final float volume;

    public static volume valueOf(String s)
    {
        return (volume)Enum.valueOf(com/fitbit/savedstate/MobileRunSavedState$VolumeSetting, s);
    }

    public static volume[] values()
    {
        return (volume[])e.clone();
    }

    public float a()
    {
        return volume;
    }

    static 
    {
        a = new <init>("Low", 0, 0.2F);
        b = new <init>("Medium", 1, 0.4F);
        c = new <init>("Normal", 2, 0.6F);
        d = new <init>("High", 3, 0.8F);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i, float f)
    {
        super(s, i);
        volume = f;
    }
}
