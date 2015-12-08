// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.d.a;

import com.ford.syncV4.util.b;
import java.util.Vector;

public final class f extends b
{

    public static final f b;
    public static final f c;
    public static final f d;
    private static Vector e;
    byte a;

    private f(byte byte0, String s)
    {
        super(byte0, s);
        a = 0;
    }

    public static f a(byte byte0)
    {
        return (f)a(e, byte0);
    }

    static 
    {
        e = new Vector();
        b = new f((byte)0, "Heartbeat_Service");
        c = new f((byte)7, "RPC");
        d = new f((byte)15, "Bulk_Data");
        e.addElement(c);
        e.addElement(d);
        e.addElement(b);
    }
}
