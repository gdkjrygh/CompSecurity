// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui.states;


public final class SynclairScreenState extends Enum
{

    public static final SynclairScreenState a;
    public static final SynclairScreenState b;
    public static final SynclairScreenState c;
    public static final SynclairScreenState d;
    public static final SynclairScreenState e;
    public static final SynclairScreenState f;
    public static final SynclairScreenState g;
    public static final SynclairScreenState h;
    public static final SynclairScreenState i;
    public static final SynclairScreenState j;
    public static final SynclairScreenState k;
    public static final SynclairScreenState l;
    public static final SynclairScreenState m;
    public static final SynclairScreenState n;
    public static final SynclairScreenState o;
    public static final SynclairScreenState p;
    public static final SynclairScreenState q;
    public static final SynclairScreenState r;
    public static final SynclairScreenState s;
    public static final SynclairScreenState t;
    public static final SynclairScreenState u;
    public static final SynclairScreenState v;
    public static final SynclairScreenState w;
    private static final SynclairScreenState x[];

    private SynclairScreenState(String s1, int i1)
    {
        super(s1, i1);
    }

    public static SynclairScreenState valueOf(String s1)
    {
        return (SynclairScreenState)Enum.valueOf(com/fitbit/synclair/ui/states/SynclairScreenState, s1);
    }

    public static SynclairScreenState[] values()
    {
        return (SynclairScreenState[])x.clone();
    }

    static 
    {
        a = new SynclairScreenState("BUSY", 0);
        b = new SynclairScreenState("BEFORE", 1);
        c = new SynclairScreenState("SEARCHING", 2);
        d = new SynclairScreenState("FOUND", 3);
        e = new SynclairScreenState("ENTER_NUMBER", 4);
        f = new SynclairScreenState("GREETING", 5);
        g = new SynclairScreenState("AFTER", 6);
        h = new SynclairScreenState("LAST_AFTER", 7);
        i = new SynclairScreenState("OUT_OF_BAND", 8);
        j = new SynclairScreenState("SELECT_EXERCISES", 9);
        k = new SynclairScreenState("INCORRECT_TRACKER", 10);
        l = new SynclairScreenState("FW_PAIR_BEFORE", 11);
        m = new SynclairScreenState("FW_PAIR_AFTER", 12);
        n = new SynclairScreenState("FW_PAIR_DIALOG", 13);
        o = new SynclairScreenState("FW_PAIR_ALWAYS", 14);
        p = new SynclairScreenState("FW_SEARCHING", 15);
        q = new SynclairScreenState("FW_CONNECTING", 16);
        r = new SynclairScreenState("FW_UPDATING", 17);
        s = new SynclairScreenState("SEND_FIRMWARE_ERROR", 18);
        t = new SynclairScreenState("NOT_FOUND", 19);
        u = new SynclairScreenState("NOT_WORKING", 20);
        v = new SynclairScreenState("FOUND_MANY", 21);
        w = new SynclairScreenState("LOW_BATTERY", 22);
        x = (new SynclairScreenState[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w
        });
    }
}
