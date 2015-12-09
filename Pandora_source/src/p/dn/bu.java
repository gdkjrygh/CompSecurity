// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p.dl.a;
import p.dm.g;
import p.dm.m;
import p.ds.c;
import p.ds.d;

// Referenced classes of package p.dn:
//            a

public class bu extends p.dn.a
{

    public static final d g;
    public static final int h;

    public bu(int i, String s)
    {
        super(h, "PNDR_RETURN_TRACK_TITLE", 1, a(i, s));
    }

    public bu(byte abyte0[])
    {
        super(h, "PNDR_RETURN_TRACK_TITLE", 1, abyte0);
        b(abyte0, 253);
    }

    private static byte[] a(int i, String s)
    {
        boolean flag = m.g(3);
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bytearrayoutputstream.write(g.b());
            bytearrayoutputstream.write((new c(i)).b());
            bytearrayoutputstream.write(a(s, 248, true, flag));
            s = bytearrayoutputstream.toByteArray();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return new byte[0];
        }
        return s;
    }

    public String a(g g1)
    {
        if (g1 == g.c)
        {
            g1 = new StringBuffer(a());
            g1.append(" {");
            g1.append("trackToken=");
            g1.append(c());
            g1.append(",");
            g1.append("title=");
            g1.append(d());
            g1.append("}");
            return g1.toString();
        }
        if (g1 == g.d)
        {
            g1 = new byte[Math.min(10, d().length()) + 5];
            System.arraycopy(c, 0, g1, 0, g1.length);
            return (new StringBuilder()).append("{").append(m.d(g1)).append(" ...}").toString();
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

    public String d()
    {
        byte abyte0[];
        int i;
        if (f >= 3)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i = c.length - 5;
        } else
        {
            i = 248;
        }
        abyte0 = new byte[i];
        System.arraycopy(c, 5, abyte0, 0, abyte0.length);
        return (new String(abyte0)).trim();
    }

    static 
    {
        g = a.aA;
        h = g.c();
    }
}
