// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;


public final class  extends Enum
{

    private static final DISMISS $VALUES[];
    public static final DISMISS DISMISS;
    public static final DISMISS DISPLAY;
    public static final DISMISS TAP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/analytics/definitions/UxEvent$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public String toString()
    {
        return name().toLowerCase();
    }

    static 
    {
        TAP = new <init>("TAP", 0);
        DISPLAY = new <init>("DISPLAY", 1);
        DISMISS = new <init>("DISMISS", 2);
        $VALUES = (new .VALUES[] {
            TAP, DISPLAY, DISMISS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
