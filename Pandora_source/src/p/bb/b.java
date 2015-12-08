// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bb;

import java.util.Vector;
import p.bn.c;

public class b extends c
{

    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    private static Vector f;
    byte a;

    protected b(byte byte0, String s)
    {
        super(byte0, s);
        a = 0;
    }

    public static b a(byte byte0)
    {
        return (b)a(f, byte0);
    }

    static 
    {
        f = new Vector();
        b = new b((byte)0, "Control");
        c = new b((byte)1, "Single");
        d = new b((byte)2, "First");
        e = new b((byte)3, "Consecutive");
        f.addElement(b);
        f.addElement(c);
        f.addElement(d);
        f.addElement(e);
    }
}
