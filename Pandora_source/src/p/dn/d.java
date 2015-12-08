// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import p.dl.a;
import p.dm.g;

// Referenced classes of package p.dn:
//            a

public class d extends p.dn.a
{

    public static final p.ds.d g;
    public static int h;

    public d(byte abyte0[])
    {
        super(h, "PNDR_ECHO_REQUEST", 0, abyte0);
    }

    public String a(g g1)
    {
        if (g1 == g.c)
        {
            g1 = new StringBuffer(a());
            g1.append(" {");
            g1.append("data=");
            g1.append("[");
            g1.append(b(c()));
            g1.append("]");
            g1.append("}");
            return g1.toString();
        } else
        {
            return super.a(g1);
        }
    }

    public byte[] c()
    {
        byte abyte0[] = new byte[100];
        System.arraycopy(c, 1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    static 
    {
        g = a.be;
        h = g.c();
    }
}
