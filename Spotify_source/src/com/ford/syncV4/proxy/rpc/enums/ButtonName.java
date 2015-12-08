// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class ButtonName extends Enum
{

    public static final ButtonName a;
    public static final ButtonName b;
    public static final ButtonName c;
    private static ButtonName d;
    private static ButtonName e;
    private static ButtonName f;
    private static ButtonName g;
    private static ButtonName h;
    private static ButtonName i;
    private static ButtonName j;
    private static ButtonName k;
    private static ButtonName l;
    private static ButtonName m;
    private static ButtonName n;
    private static ButtonName o;
    private static ButtonName p;
    private static ButtonName q;
    private static final ButtonName r[];

    private ButtonName(String s, int i1)
    {
        super(s, i1);
    }

    public static ButtonName a(String s)
    {
        return valueOf(s);
    }

    public static ButtonName valueOf(String s)
    {
        return (ButtonName)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/ButtonName, s);
    }

    public static ButtonName[] values()
    {
        return (ButtonName[])r.clone();
    }

    static 
    {
        a = new ButtonName("OK", 0);
        b = new ButtonName("SEEKLEFT", 1);
        c = new ButtonName("SEEKRIGHT", 2);
        d = new ButtonName("TUNEUP", 3);
        e = new ButtonName("TUNEDOWN", 4);
        f = new ButtonName("PRESET_0", 5);
        g = new ButtonName("PRESET_1", 6);
        h = new ButtonName("PRESET_2", 7);
        i = new ButtonName("PRESET_3", 8);
        j = new ButtonName("PRESET_4", 9);
        k = new ButtonName("PRESET_5", 10);
        l = new ButtonName("PRESET_6", 11);
        m = new ButtonName("PRESET_7", 12);
        n = new ButtonName("PRESET_8", 13);
        o = new ButtonName("PRESET_9", 14);
        p = new ButtonName("CUSTOM_BUTTON", 15);
        q = new ButtonName("SEARCH", 16);
        r = (new ButtonName[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q
        });
    }
}
