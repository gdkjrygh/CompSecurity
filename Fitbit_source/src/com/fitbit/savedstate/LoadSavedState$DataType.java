// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;


// Referenced classes of package com.fitbit.savedstate:
//            LoadSavedState

public static final class  extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/savedstate/LoadSavedState$DataType, s);
    }

    public static [] values()
    {
        return ([])h.clone();
    }

    static 
    {
        a = new <init>("SLEEP_DATA", 0);
        b = new <init>("NOTIFICATIONS", 1);
        c = new <init>("FRIENDS", 2);
        d = new <init>("CONTACTS", 3);
        e = new <init>("PROFILE_PHOTO", 4);
        f = new <init>("CHALLENGES", 5);
        g = new <init>("NOTIFICATIONS_COUNT", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
