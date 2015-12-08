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

public class ay extends p.dn.a
{

    public static final d g;
    public static final int h;

    public ay(byte abyte0[])
    {
        super(h, "PNDR_RETURN_BRANDING_IMAGE_SEGMENT", 0, abyte0);
    }

    public String a(g g1)
    {
        if (g1 == g.c)
        {
            g1 = new StringBuffer(a());
            g1.append(" {");
            g1.append("segmentIndex=");
            g1.append(c());
            g1.append(",");
            g1.append("totalSegments=");
            g1.append(d());
            g1.append(",");
            g1.append((new StringBuilder()).append("dataLength=").append(e().length).toString());
            g1.append("}");
            return g1.toString();
        }
        if (g1 == g.d)
        {
            int i = Math.min(4, c.length);
            g1 = new StringBuffer();
            byte abyte0[] = new byte[i];
            System.arraycopy(c, 0, abyte0, 0, abyte0.length);
            m.a(abyte0, g1);
            return (new StringBuilder()).append("{").append(g1.toString()).append(" ...}").toString();
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

    public byte[] e()
    {
        byte abyte0[] = new byte[c.length - 3];
        System.arraycopy(c, 3, abyte0, 0, abyte0.length);
        return abyte0;
    }

    static 
    {
        g = a.w;
        h = g.c();
    }
}
