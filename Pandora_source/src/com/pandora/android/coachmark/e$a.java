// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;

import java.util.Locale;

// Referenced classes of package com.pandora.android.coachmark:
//            e

public static final class name extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h j[];
    public final String i;

    public static name valueOf(String s)
    {
        return (name)Enum.valueOf(com/pandora/android/coachmark/e$a, s);
    }

    public static name[] values()
    {
        return (name[])j.clone();
    }

    static 
    {
        a = new <init>("ONBOARDING", 0);
        b = new <init>("STATION_PERSONALIZATION_TEACHING", 1);
        c = new <init>("STATION_PERSONALIZATION_REWARD", 2);
        d = new <init>("CASTING", 3);
        e = new <init>("UPSELL", 4);
        f = new <init>("ARTIST_MESSAGE", 5);
        g = new <init>("TRAFFIC_DRIVER_PARTNERSHIP", 6);
        h = new <init>("SPONSORED_LISTENING", 7);
        j = (new j[] {
            a, b, c, d, e, f, g, h
        });
    }

    private (String s, int k)
    {
        super(s, k);
        i = name().toLowerCase(Locale.US);
    }
}
