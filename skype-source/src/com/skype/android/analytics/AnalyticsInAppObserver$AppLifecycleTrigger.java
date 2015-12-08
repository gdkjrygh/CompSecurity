// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;


// Referenced classes of package com.skype.android.analytics:
//            AnalyticsInAppObserver

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
        return ()Enum.valueOf(com/skype/android/analytics/AnalyticsInAppObserver$AppLifecycleTrigger, s);
    }

    public static [] values()
    {
        return ([])h.clone();
    }

    static 
    {
        a = new <init>("AppLaunched", 0);
        b = new <init>("Login", 1);
        c = new <init>("Foregrounded", 2);
        d = new <init>("Resumed", 3);
        e = new <init>("Killed", 4);
        f = new <init>("Logout", 5);
        g = new <init>("Backgrounded", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
