// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;


public final class  extends Enum
{

    private static final APP_CRASH $VALUES[];
    public static final APP_CRASH APP_CLOSE;
    public static final APP_CRASH APP_CRASH;
    public static final APP_CRASH APP_INSTALL;
    public static final APP_CRASH APP_OPEN;
    public static final APP_CRASH APP_UPDATE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/analytics/definitions/LifecycleEvent$Type, s);
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
        APP_OPEN = new <init>("APP_OPEN", 0);
        APP_CLOSE = new <init>("APP_CLOSE", 1);
        APP_INSTALL = new <init>("APP_INSTALL", 2);
        APP_UPDATE = new <init>("APP_UPDATE", 3);
        APP_CRASH = new <init>("APP_CRASH", 4);
        $VALUES = (new .VALUES[] {
            APP_OPEN, APP_CLOSE, APP_INSTALL, APP_UPDATE, APP_CRASH
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
