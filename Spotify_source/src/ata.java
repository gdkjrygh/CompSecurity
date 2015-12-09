// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Vector;

public final class ata extends axs
{

    public static final ata a;
    public static final ata b;
    public static final ata c;
    public static final ata d;
    private static Vector e;

    private ata(byte byte0, String s)
    {
        super(byte0, s);
    }

    public static ata a(byte byte0)
    {
        return (ata)a(e, byte0);
    }

    static 
    {
        e = new Vector();
        a = new ata((byte)0, "Control");
        b = new ata((byte)1, "Single");
        c = new ata((byte)2, "First");
        d = new ata((byte)3, "Consecutive");
        e.addElement(a);
        e.addElement(b);
        e.addElement(c);
        e.addElement(d);
    }
}
