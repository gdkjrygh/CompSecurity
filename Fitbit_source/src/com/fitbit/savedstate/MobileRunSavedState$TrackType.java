// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;


// Referenced classes of package com.fitbit.savedstate:
//            MobileRunSavedState

public static final class _cls9 extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/fitbit/savedstate/MobileRunSavedState$TrackType, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])e.clone();
    }

    static 
    {
        a = new <init>("Run", 0);
        b = new <init>("Walk", 1);
        c = new <init>("Hike", 2);
        d = new <init>("Bike", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
