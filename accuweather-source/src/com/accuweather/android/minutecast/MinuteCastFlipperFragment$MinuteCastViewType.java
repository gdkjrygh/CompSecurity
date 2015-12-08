// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.minutecast;


// Referenced classes of package com.accuweather.android.minutecast:
//            MinuteCastFlipperFragment

public static final class viewName extends Enum
{

    private static final List $VALUES[];
    public static final List Circle;
    public static final List List;
    public String viewName;

    public static viewName valueOf(String s)
    {
        return (viewName)Enum.valueOf(com/accuweather/android/minutecast/MinuteCastFlipperFragment$MinuteCastViewType, s);
    }

    public static viewName[] values()
    {
        return (viewName[])$VALUES.clone();
    }

    static 
    {
        Circle = new <init>("Circle", 0, "circle");
        List = new <init>("List", 1, "list");
        $VALUES = (new .VALUES[] {
            Circle, List
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        viewName = s1;
    }
}
