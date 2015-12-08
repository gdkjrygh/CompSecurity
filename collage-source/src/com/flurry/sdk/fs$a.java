// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            fs

public static final class > extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];

    public static > valueOf(String s)
    {
        return (>)Enum.valueOf(com/flurry/sdk/fs$a, s);
    }

    public static Of[] values()
    {
        return (Of[])h.clone();
    }

    static 
    {
        a = new <init>("kCreated", 0);
        b = new <init>("kDestroyed", 1);
        c = new <init>("kPaused", 2);
        d = new <init>("kResumed", 3);
        e = new <init>("kStarted", 4);
        f = new <init>("kStopped", 5);
        g = new <init>("kSaveState", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
