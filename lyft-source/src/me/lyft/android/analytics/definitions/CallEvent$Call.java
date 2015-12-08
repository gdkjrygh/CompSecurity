// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;


public final class  extends Enum
{

    private static final GENERATE_SIGNED_URL $VALUES[];
    public static final GENERATE_SIGNED_URL GENERATE_SIGNED_URL;
    public static final GENERATE_SIGNED_URL HTTP_REQUEST;

    public static  fromString(String s)
    {
        return valueOf(s.toUpperCase());
    }

    public static valueOf valueOf(String s)
    {
        return (valueOf)Enum.valueOf(me/lyft/android/analytics/definitions/CallEvent$Call, s);
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    public String toString()
    {
        return name().toLowerCase();
    }

    static 
    {
        HTTP_REQUEST = new <init>("HTTP_REQUEST", 0);
        GENERATE_SIGNED_URL = new <init>("GENERATE_SIGNED_URL", 1);
        $VALUES = (new .VALUES[] {
            HTTP_REQUEST, GENERATE_SIGNED_URL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
