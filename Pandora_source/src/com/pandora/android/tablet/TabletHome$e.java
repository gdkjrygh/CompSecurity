// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.tablet;


// Referenced classes of package com.pandora.android.tablet:
//            TabletHome

public static final class e extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d f[];
    private final String e;

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/pandora/android/tablet/TabletHome$e, s);
    }

    public static e[] values()
    {
        return (e[])f.clone();
    }

    public String toString()
    {
        return e;
    }

    static 
    {
        a = new <init>("FEED", 0, "Feed");
        b = new <init>("PROFILE", 1, "Profile");
        c = new <init>("SETTINGS", 2, "Settings");
        d = new <init>("STATION_PERSONALIZATION", 3, "Station Personalization");
        f = (new f[] {
            a, b, c, d
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }
}
