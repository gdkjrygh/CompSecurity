// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p.dl.a;
import p.dm.g;
import p.ds.c;
import p.ds.d;
import p.ds.e;

// Referenced classes of package p.dn:
//            a

public class bg extends p.dn.a
{

    public static final d g;
    public static final int h;
    int bg;
    private e bh[];

    public bg(int i, e ae[])
    {
        super(h, "PNDR_RETURN_SEARCH_RESULT_INFO", 1, a(i, ae));
        bg = i;
        bh = ae;
    }

    public bg(byte abyte0[])
    {
        super(h, "PNDR_RETURN_SEARCH_RESULT_INFO", 1, abyte0);
        byte abyte1[] = new byte[4];
        System.arraycopy(abyte0, 1, abyte1, 0, abyte1.length);
        bg = (new c(abyte1)).c();
        bh = e.a(abyte0, 5, abyte0.length - 5);
    }

    private static byte[] a(int i, e ae[])
    {
        ByteArrayOutputStream bytearrayoutputstream;
        try
        {
            bytearrayoutputstream = new ByteArrayOutputStream();
            bytearrayoutputstream.write(g.b());
            bytearrayoutputstream.write((new c(i)).b());
        }
        // Misplaced declaration of an exception variable
        catch (e ae[])
        {
            return new byte[0];
        }
        i = 0;
        if (i >= ae.length)
        {
            break; /* Loop/switch isn't completed */
        }
        bytearrayoutputstream.write(ae[i].a());
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_35;
_L1:
        ae = bytearrayoutputstream.toByteArray();
        return ae;
    }

    public String a(g g1)
    {
        if (g1 == g.c)
        {
            g1 = new StringBuffer(a());
            g1.append(" {");
            g1.append("searchID=");
            g1.append(c());
            g1.append(",");
            g1.append("results=");
            g1.append("[");
            e ae[] = d();
            for (int i = 0; i < ae.length; i++)
            {
                g1.append(ae[i].a(true));
                if (i + 1 < ae.length)
                {
                    g1.append(",");
                }
            }

            g1.append("]");
            g1.append("}");
            return g1.toString();
        } else
        {
            return super.a(g1);
        }
    }

    public int c()
    {
        return bg;
    }

    public e[] d()
    {
        return bh;
    }

    static 
    {
        g = a.bc;
        h = g.c();
    }
}
