// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.broadcast;


final class i extends Enum
{

    private static final i $VALUES[];
    public static final i COMPOSE_BROADCAST;
    public static final i CONTACT_MULTIPICKER;
    public final String fragmentTag;

    private i(String s, int j, String s1)
    {
        super(s, j);
        fragmentTag = s1;
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/facebook/orca/broadcast/i, s);
    }

    public static i[] values()
    {
        return (i[])$VALUES.clone();
    }

    static 
    {
        COMPOSE_BROADCAST = new i("COMPOSE_BROADCAST", 0, "composeBroadcastFragment");
        CONTACT_MULTIPICKER = new i("CONTACT_MULTIPICKER", 1, "contactMultipickerFragment");
        $VALUES = (new i[] {
            COMPOSE_BROADCAST, CONTACT_MULTIPICKER
        });
    }
}
