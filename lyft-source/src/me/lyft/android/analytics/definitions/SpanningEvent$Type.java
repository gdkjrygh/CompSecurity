// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;


public final class  extends Enum
{

    private static final RESULT $VALUES[];
    public static final RESULT INITIATION;
    public static final RESULT RESULT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/analytics/definitions/SpanningEvent$Type, s);
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
        INITIATION = new <init>("INITIATION", 0);
        RESULT = new <init>("RESULT", 1);
        $VALUES = (new .VALUES[] {
            INITIATION, RESULT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
