// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import p.dl.a;
import p.dm.g;
import p.dm.m;
import p.ds.d;

// Referenced classes of package p.dn:
//            a

public class i extends p.dn.a
{

    public static final d g;
    public static final int h;

    public i(byte abyte0[])
    {
        super(h, "PNDR_EVENT_OPEN_APP", 0, abyte0);
        b(abyte0, 250);
    }

    public String a(g g1)
    {
        if (g1 == g.c)
        {
            g1 = new StringBuffer(a());
            g1.append(" {");
            g1.append("pauseOnOpen=");
            g1.append(d());
            g1.append(",");
            g1.append("searchInput=");
            g1.append(e());
            g1.append("}");
            return g1.toString();
        } else
        {
            return super.a(g1);
        }
    }

    public int c()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 1, abyte0, 0, abyte0.length);
        return (new d(abyte0)).c();
    }

    public boolean d()
    {
        return ((byte)c() & 1) != 0;
    }

    public String e()
    {
        byte abyte0[];
        int j;
        if (m.g(3))
        {
            j = c.length - 2;
        } else
        {
            j = 248;
        }
        abyte0 = new byte[j];
        System.arraycopy(c, 2, abyte0, 0, abyte0.length);
        return (new String(abyte0)).trim();
    }

    static 
    {
        g = a.ar;
        h = g.c();
    }
}
