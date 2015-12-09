// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import p.dl.a;
import p.dm.g;
import p.ds.d;

// Referenced classes of package p.dn:
//            a

public class ag extends p.dn.a
{

    public static final d g;
    public static final int h;

    public ag(byte abyte0[])
    {
        super(h, "PNDR_GET_GENRE_STATION_NAMES", 0, abyte0);
    }

    public String a(g g1)
    {
        if (g1 == g.c)
        {
            g1 = new StringBuffer(a());
            g1.append(" {");
            g1.append("categoryIndex=");
            g1.append(c());
            g1.append(",");
            g1.append("startIndex=");
            g1.append(d());
            g1.append(",");
            g1.append("count=");
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

    public int d()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 2, abyte0, 0, abyte0.length);
        return (new d(abyte0)).c();
    }

    public int e()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 3, abyte0, 0, abyte0.length);
        return (new d(abyte0)).c();
    }

    static 
    {
        g = a.ai;
        h = g.c();
    }
}
