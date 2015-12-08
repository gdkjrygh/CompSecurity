// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;

import java.util.Locale;

// Referenced classes of package com.brightcove.player.model:
//            Region

public static final class  extends Enum
{

    public static final AFTER AFTER;
    public static final AFTER BEFORE;
    public static final AFTER CENTER;
    private static final AFTER a[];

    public static  fromString(String s)
    {
        return valueOf(s.toUpperCase(Locale.US));
    }

    public static valueOf valueOf(String s)
    {
        return (valueOf)Enum.valueOf(com/brightcove/player/model/Region$DisplayAlign, s);
    }

    public static valueOf[] values()
    {
        return (valueOf[])a.clone();
    }

    static 
    {
        BEFORE = new <init>("BEFORE", 0);
        CENTER = new <init>("CENTER", 1);
        AFTER = new <init>("AFTER", 2);
        a = (new a[] {
            BEFORE, CENTER, AFTER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
