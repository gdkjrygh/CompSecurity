// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.tablet;

import com.pandora.android.util.p;
import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.pandora.android.tablet:
//            TabletHome

public static final class e extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static Map f = new EnumMap(com/pandora/android/util/p);
    private static final d g[];
    p e;

    static Map a()
    {
        return f;
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/pandora/android/tablet/TabletHome$a, s);
    }

    public static f[] values()
    {
        return (f[])g.clone();
    }

    static 
    {
        a = new <init>("NOW_PLAYING", 0);
        b = new <init>("NO_STATION_SELECTED", 1);
        c = new <init>("CAP_LIMIT_REACHED", 2);
        d = new <init>("NO_STATIONS", 3);
        g = (new g[] {
            a, b, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
        e = null;
    }
}
