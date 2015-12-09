// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.commands;


public final class CommandName extends Enum
{

    public static final CommandName a;
    public static final CommandName b;
    public static final CommandName c;
    public static final CommandName d;
    public static final CommandName e;
    public static final CommandName f;
    public static final CommandName g;
    public static final CommandName h;
    public static final CommandName i;
    public static final CommandName j;
    public static final CommandName k;
    public static final CommandName l;
    public static final CommandName m;
    public static final CommandName n;
    public static final CommandName o;
    public static final CommandName p;
    public static final CommandName q;
    public static final CommandName r;
    private static final CommandName s[];

    private CommandName(String s1, int i1)
    {
        super(s1, i1);
    }

    public static CommandName valueOf(String s1)
    {
        return (CommandName)Enum.valueOf(com/fitbit/bluetooth/commands/CommandName, s1);
    }

    public static CommandName[] values()
    {
        return (CommandName[])s.clone();
    }

    static 
    {
        a = new CommandName("CONFIGURE_FBACTIVITY_NOTIFICATIONS", 0);
        b = new CommandName("CONFIGURE_LIVEDATA_NOTIFICATIONS", 1);
        c = new CommandName("OPEN_SESSION", 2);
        d = new CommandName("CLOSE_SESSION", 3);
        e = new CommandName("GET_MEGADUMP", 4);
        f = new CommandName("GET_MICRODUMP", 5);
        g = new CommandName("SEND_MEGADUMP", 6);
        h = new CommandName("SEND_MICRODUMP", 7);
        i = new CommandName("ALERT_USER", 8);
        j = new CommandName("TRACKER_AUTH", 9);
        k = new CommandName("SEND_DNCS_NOTIFICATION", 10);
        l = new CommandName("CONFIGURE_LIVEDATA_LISTENER", 11);
        m = new CommandName("SET_BOND_MODE", 12);
        n = new CommandName("READ_BOND_INFO", 13);
        o = new CommandName("READ_SECURE_CHARACTERISTIC", 14);
        p = new CommandName("CLEAR_SECRET", 15);
        q = new CommandName("DISPLAY_SECRET", 16);
        r = new CommandName("READ_ACTIVITY_STATUS", 17);
        s = (new CommandName[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r
        });
    }
}
