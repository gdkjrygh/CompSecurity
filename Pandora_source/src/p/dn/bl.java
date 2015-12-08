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

// Referenced classes of package p.dn:
//            a

public class bl extends p.dn.a
{

    public static final d g;
    public static final int h;

    public bl(int i, int ai[])
    {
        super(h, "PNDR_RETURN_STATION_TOKENS", 1, a(i, ai));
    }

    public bl(byte abyte0[])
    {
        super(h, "PNDR_RETURN_STATION_TOKENS", 1, abyte0);
    }

    private static byte[] a(int i, int ai[])
    {
        ByteArrayOutputStream bytearrayoutputstream;
        try
        {
            bytearrayoutputstream = new ByteArrayOutputStream();
            bytearrayoutputstream.write(g.b());
            bytearrayoutputstream.write((new d(i)).b());
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            return new byte[0];
        }
        i = 0;
        if (i >= ai.length)
        {
            break; /* Loop/switch isn't completed */
        }
        bytearrayoutputstream.write((new c(ai[i])).b());
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_35;
_L1:
        ai = bytearrayoutputstream.toByteArray();
        return ai;
    }

    public String a(g g1)
    {
        if (g1 == g.c)
        {
            g1 = new StringBuffer(a());
            g1.append(" {");
            g1.append("startIndex=");
            g1.append(c());
            g1.append(",");
            g1.append("stationIds=");
            g1.append("[");
            int ai[] = d();
            for (int i = 0; i < ai.length; i++)
            {
                g1.append(ai[i]);
                if (i + 1 < ai.length)
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
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 1, abyte0, 0, abyte0.length);
        return (new d(abyte0)).c();
    }

    public int[] d()
    {
        int ai[] = new int[(c.length - 2) / 4];
        int j = 2;
        for (int i = 0; i < ai.length; i++)
        {
            byte abyte0[] = new byte[4];
            System.arraycopy(c, j, abyte0, 0, abyte0.length);
            ai[i] = (new c(abyte0)).c();
            j += 4;
        }

        return ai;
    }

    static 
    {
        g = a.aQ;
        h = g.c();
    }
}
