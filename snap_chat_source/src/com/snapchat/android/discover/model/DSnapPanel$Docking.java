// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model;

import IP;
import java.util.Locale;

// Referenced classes of package com.snapchat.android.discover.model:
//            DSnapPanel

public static final class  extends Enum
{

    private static final SCREEN_BOTTOM $VALUES[];
    public static final SCREEN_BOTTOM MEDIA_BOTTOM;
    public static final SCREEN_BOTTOM MEDIA_CENTER;
    public static final SCREEN_BOTTOM MEDIA_TOP;
    public static final SCREEN_BOTTOM SCREEN_BOTTOM;
    public static final SCREEN_BOTTOM SCREEN_CENTER;
    public static final SCREEN_BOTTOM SCREEN_TOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/discover/model/DSnapPanel$Docking, s);
    }

    public static  valueOfIgnoreCase(String s)
    {
        if (IP.c("TOP", s))
        {
            return SCREEN_TOP;
        }
        if (IP.c("CENTER", s))
        {
            return SCREEN_CENTER;
        }
        if (IP.c("BOTTOM", s))
        {
            return SCREEN_BOTTOM;
        } else
        {
            return valueOf(s.toUpperCase(Locale.ENGLISH));
        }
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    public final boolean isMediaDocking()
    {
        return equals(MEDIA_TOP) || equals(MEDIA_CENTER) || equals(MEDIA_BOTTOM);
    }

    public final boolean isScreenDocking()
    {
        return equals(SCREEN_TOP) || equals(SCREEN_CENTER) || equals(SCREEN_BOTTOM);
    }

    static 
    {
        MEDIA_TOP = new <init>("MEDIA_TOP", 0);
        MEDIA_CENTER = new <init>("MEDIA_CENTER", 1);
        MEDIA_BOTTOM = new <init>("MEDIA_BOTTOM", 2);
        SCREEN_TOP = new <init>("SCREEN_TOP", 3);
        SCREEN_CENTER = new <init>("SCREEN_CENTER", 4);
        SCREEN_BOTTOM = new <init>("SCREEN_BOTTOM", 5);
        $VALUES = (new .VALUES[] {
            MEDIA_TOP, MEDIA_CENTER, MEDIA_BOTTOM, SCREEN_TOP, SCREEN_CENTER, SCREEN_BOTTOM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
