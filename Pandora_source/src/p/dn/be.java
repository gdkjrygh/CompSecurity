// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p.dl.a;
import p.dm.g;
import p.ds.d;

// Referenced classes of package p.dn:
//            a

public class be extends p.dn.a
{

    public static final d g;
    public static final int h;

    public be(String s)
    {
        super(h, "PNDR_RETURN_LISTENER", 1, a(s));
    }

    public be(byte abyte0[])
    {
        super(h, "PNDR_RETURN_LISTENER", 1, abyte0);
    }

    private static byte[] a(String s)
    {
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bytearrayoutputstream.write(g.b());
            bytearrayoutputstream.write(a(s, 248, true, true));
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
            g1.append("listenerId=");
            g1.append(c());
            g1.append("}");
            return g1.toString();
        } else
        {
            return super.a(g1);
        }
    }

    public String c()
    {
        byte abyte0[] = new byte[c.length - 1];
        System.arraycopy(c, 1, abyte0, 0, abyte0.length);
        return (new String(abyte0)).trim();
    }

    static 
    {
        g = a.ax;
        h = g.c();
    }
}
