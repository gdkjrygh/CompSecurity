// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Vector;

public final class atc extends axs
{

    public static final atc a;
    public static final atc b;
    public static final atc c;
    private static Vector d;

    private atc(byte byte0, String s)
    {
        super(byte0, s);
    }

    public static atc a(byte byte0)
    {
        return (atc)a(d, byte0);
    }

    static 
    {
        d = new Vector();
        a = new atc((byte)0, "Heartbeat_Service");
        b = new atc((byte)7, "RPC");
        c = new atc((byte)15, "Bulk_Data");
        d.addElement(b);
        d.addElement(c);
        d.addElement(a);
    }
}
