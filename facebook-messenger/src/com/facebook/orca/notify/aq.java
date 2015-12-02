// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;


public final class aq extends Enum
{

    private static final aq $VALUES[];
    public static final aq IN_APP_ACTIVE_10S;
    public static final aq IN_APP_ACTIVE_30S;
    public static final aq IN_APP_IDLE;
    public static final aq NOT_IN_APP;

    private aq(String s, int i)
    {
        super(s, i);
    }

    public static aq valueOf(String s)
    {
        return (aq)Enum.valueOf(com/facebook/orca/notify/aq, s);
    }

    public static aq[] values()
    {
        return (aq[])$VALUES.clone();
    }

    static 
    {
        IN_APP_ACTIVE_10S = new aq("IN_APP_ACTIVE_10S", 0);
        IN_APP_ACTIVE_30S = new aq("IN_APP_ACTIVE_30S", 1);
        IN_APP_IDLE = new aq("IN_APP_IDLE", 2);
        NOT_IN_APP = new aq("NOT_IN_APP", 3);
        $VALUES = (new aq[] {
            IN_APP_ACTIVE_10S, IN_APP_ACTIVE_30S, IN_APP_IDLE, NOT_IN_APP
        });
    }
}
