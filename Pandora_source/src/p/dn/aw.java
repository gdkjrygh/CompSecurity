// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import p.dl.a;
import p.ds.d;

// Referenced classes of package p.dn:
//            a

public class aw extends p.dn.a
{

    public static final d g;
    public static int h;

    public aw()
    {
        this(g.b());
    }

    public aw(byte abyte0[])
    {
        super(h, "PNDR_GET_TRACK_INFO_EXTENDED", 0, abyte0);
    }

    static 
    {
        g = a.H;
        h = g.c();
    }
}
