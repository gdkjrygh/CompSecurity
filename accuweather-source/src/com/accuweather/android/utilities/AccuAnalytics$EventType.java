// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;


// Referenced classes of package com.accuweather.android.utilities:
//            AccuAnalytics

private static final class  extends Enum
{

    private static final STATE $VALUES[];
    public static final STATE STATE;
    public static final STATE UI;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/accuweather/android/utilities/AccuAnalytics$EventType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UI = new <init>("UI", 0);
        STATE = new <init>("STATE", 1);
        $VALUES = (new .VALUES[] {
            UI, STATE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
