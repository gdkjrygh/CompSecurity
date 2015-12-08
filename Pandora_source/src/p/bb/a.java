// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bb;

import java.util.Vector;
import p.bn.c;

public class a extends c
{

    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    private static Vector i;
    private byte j;

    protected a(byte byte0, String s)
    {
        super(byte0, s);
        j = 0;
    }

    static 
    {
        i = new Vector();
        a = new a((byte)0, "Heartbeat");
        b = new a((byte)1, "StartSession");
        c = new a((byte)2, "StartSessionACK");
        d = new a((byte)3, "StartSessionNACK");
        e = new a((byte)4, "EndSession");
        f = new a((byte)5, "EndSessionACK");
        g = new a((byte)6, "EndSessionNACK");
        h = new a((byte)-1, "HeartbeatACK");
        i.addElement(a);
        i.addElement(b);
        i.addElement(c);
        i.addElement(d);
        i.addElement(e);
        i.addElement(f);
        i.addElement(g);
        i.addElement(h);
    }
}
