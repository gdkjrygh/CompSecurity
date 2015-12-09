// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import p.dl.a;
import p.ds.d;

// Referenced classes of package p.dn:
//            a

public class n extends p.dn.a
{

    public static final d g;
    public static final int h;

    public n()
    {
        this(g.b());
    }

    public n(byte abyte0[])
    {
        super(h, "PNDR_EVENT_STATION_CREATE_FROM_CURRENT_TRACK", 0, abyte0);
    }

    static 
    {
        g = a.ab;
        h = g.c();
    }
}
