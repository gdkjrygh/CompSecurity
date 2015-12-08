// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;


// Referenced classes of package com.tinder.managers:
//            ManagerLiveRail

public static final class  extends Enum
{

    public static final k a;
    public static final k b;
    public static final k c;
    public static final k d;
    public static final k e;
    public static final k f;
    public static final k g;
    public static final k h;
    public static final k i;
    public static final k j;
    public static final k k;
    private static final k l[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/tinder/managers/ManagerLiveRail$LiveRailEvent, s);
    }

    public static [] values()
    {
        return ([])l.clone();
    }

    static 
    {
        a = new <init>("impression", 0);
        b = new <init>("firstQuartile", 1);
        c = new <init>("midpoint", 2);
        d = new <init>("thirdQuartile", 3);
        e = new <init>("complete", 4);
        f = new <init>("mute", 5);
        g = new <init>("unmute", 6);
        h = new <init>("pause", 7);
        i = new <init>("resume", 8);
        j = new <init>("close", 9);
        k = new <init>("acceptInvitation", 10);
        l = (new l[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }

    private (String s, int i1)
    {
        super(s, i1);
    }
}
