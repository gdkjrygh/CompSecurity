// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.photos;


// Referenced classes of package com.accuweather.android.models.photos:
//            PhotoUtilities

public static final class seasonTag extends Enum
{

    private static final Fall $VALUES[];
    public static final Fall Fall;
    public static final Fall Spring;
    public static final Fall Summer;
    public static final Fall Winter;
    private final String seasonTag;

    public static seasonTag valueOf(String s)
    {
        return (seasonTag)Enum.valueOf(com/accuweather/android/models/photos/PhotoUtilities$Season, s);
    }

    public static seasonTag[] values()
    {
        return (seasonTag[])$VALUES.clone();
    }

    public String getSeasonTag()
    {
        return seasonTag;
    }

    static 
    {
        Winter = new <init>("Winter", 0, "W");
        Spring = new <init>("Spring", 1, "P");
        Summer = new <init>("Summer", 2, "U");
        Fall = new <init>("Fall", 3, "F");
        $VALUES = (new .VALUES[] {
            Winter, Spring, Summer, Fall
        });
    }

    private A(String s, int i, String s1)
    {
        super(s, i);
        seasonTag = s1;
    }
}
