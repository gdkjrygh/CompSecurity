// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bb;

import java.util.Vector;
import p.bn.c;

public class e extends c
{

    public static final e b;
    public static final e c;
    public static final e d;
    private static Vector e;
    byte a;

    protected e(byte byte0, String s)
    {
        super(byte0, s);
        a = 0;
    }

    public static e a(byte byte0)
    {
        return (e)a(e, byte0);
    }

    static 
    {
        e = new Vector();
        b = new e((byte)0, "Heartbeat_Service");
        c = new e((byte)7, "RPC");
        d = new e((byte)15, "Bulk_Data");
        e.addElement(c);
        e.addElement(d);
        e.addElement(b);
    }
}
