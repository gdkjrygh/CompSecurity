// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;


// Referenced classes of package com.tinder.activities:
//            ActivityCallToActionBrowser

public static final class i extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g j[];
    Integer h;
    boolean i;

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/tinder/activities/ActivityCallToActionBrowser$FailToLoadReason, s);
    }

    public static i[] values()
    {
        return (i[])j.clone();
    }

    static 
    {
        a = new <init>("NO_EXTRAS", 0, Integer.valueOf(0x7f060252), true);
        b = new <init>("MISSING_URL", 1, Integer.valueOf(0x7f060251), true);
        c = new <init>("ALREADY_RUNNING", 2, Integer.valueOf(0x7f06024c), false);
        d = new <init>("BROWSER_ERROR", 3, Integer.valueOf(0x7f06024e), true);
        e = new <init>("BROWSER_AUTH_REQUEST", 4, Integer.valueOf(0x7f06024d), true);
        f = new <init>("BROWSER_SSL_ERROR", 5, Integer.valueOf(0x7f06024f), true);
        g = new <init>("BROWSER_TOO_MANY_REDIRECTS", 6, Integer.valueOf(0x7f060250), true);
        j = (new j[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int k, Integer integer, boolean flag)
    {
        super(s, k);
        h = integer;
        i = flag;
    }
}
