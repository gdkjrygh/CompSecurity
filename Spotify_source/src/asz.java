// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Vector;

public final class asz extends axs
{

    public static final asz a;
    public static final asz b;
    public static final asz c;
    public static final asz d;
    public static final asz e;
    public static final asz f;
    public static final asz g;
    private static Vector j;
    private static asz k;

    private asz(byte byte0, String s)
    {
        super(byte0, s);
    }

    static 
    {
        j = new Vector();
        a = new asz((byte)0, "Heartbeat");
        b = new asz((byte)1, "StartSession");
        c = new asz((byte)2, "StartSessionACK");
        d = new asz((byte)3, "StartSessionNACK");
        e = new asz((byte)4, "EndSession");
        f = new asz((byte)5, "EndSessionACK");
        k = new asz((byte)6, "EndSessionNACK");
        g = new asz((byte)-1, "HeartbeatACK");
        j.addElement(a);
        j.addElement(b);
        j.addElement(c);
        j.addElement(d);
        j.addElement(e);
        j.addElement(f);
        j.addElement(k);
        j.addElement(g);
    }
}
