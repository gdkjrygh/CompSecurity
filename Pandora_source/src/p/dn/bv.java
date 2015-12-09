// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import p.dl.a;
import p.dm.g;
import p.ds.c;
import p.ds.d;

// Referenced classes of package p.dn:
//            a

public class bv extends p.dn.a
{

    public static final d g;
    public static final int h;

    public bv(byte abyte0[])
    {
        super(h, "PNDR_SEARCH_DISCARD", 0, abyte0);
    }

    public String a(g g1)
    {
        if (g1 == g.c)
        {
            g1 = new StringBuffer(a());
            g1.append(" {");
            g1.append("searchID=");
            g1.append(c());
            g1.append("}");
            return g1.toString();
        } else
        {
            return super.a(g1);
        }
    }

    public int c()
    {
        byte abyte0[] = new byte[4];
        System.arraycopy(c, 1, abyte0, 0, abyte0.length);
        return (new c(abyte0)).c();
    }

    static 
    {
        g = a.aq;
        h = g.c();
    }
}
