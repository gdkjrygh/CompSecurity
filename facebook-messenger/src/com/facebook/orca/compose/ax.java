// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;


final class ax extends Enum
{

    private static final ax $VALUES[];
    public static final ax LOCATION_DISABLED_NUX_SHOWING;
    public static final ax LOCATION_NUX_SHOWING;
    public static final ax OFF;

    private ax(String s, int i)
    {
        super(s, i);
    }

    public static ax valueOf(String s)
    {
        return (ax)Enum.valueOf(com/facebook/orca/compose/ax, s);
    }

    public static ax[] values()
    {
        return (ax[])$VALUES.clone();
    }

    static 
    {
        OFF = new ax("OFF", 0);
        LOCATION_NUX_SHOWING = new ax("LOCATION_NUX_SHOWING", 1);
        LOCATION_DISABLED_NUX_SHOWING = new ax("LOCATION_DISABLED_NUX_SHOWING", 2);
        $VALUES = (new ax[] {
            OFF, LOCATION_NUX_SHOWING, LOCATION_DISABLED_NUX_SHOWING
        });
    }
}
