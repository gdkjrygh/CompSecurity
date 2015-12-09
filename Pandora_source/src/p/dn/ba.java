// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Vector;
import p.dl.a;
import p.dm.g;
import p.ds.d;

// Referenced classes of package p.dn:
//            a

public class ba extends p.dn.a
{

    public static final d g;
    public static final int h;

    public ba(int i, String as[])
    {
        super(h, "PNDR_RETURN_GENRE_CATEGORY_NAMES", 1, a(i, as));
    }

    public ba(byte abyte0[])
    {
        super(h, "PNDR_RETURN_GENRE_CATEGORY_NAMES", 1, abyte0);
    }

    private static byte[] a(int i, String as[])
    {
        ByteArrayOutputStream bytearrayoutputstream;
        try
        {
            bytearrayoutputstream = new ByteArrayOutputStream();
            bytearrayoutputstream.write(g.b());
            bytearrayoutputstream.write((new d(i)).b());
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            return new byte[0];
        }
        i = 0;
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        bytearrayoutputstream.write(a(as[i], 248, true, true));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_35;
_L1:
        as = bytearrayoutputstream.toByteArray();
        return as;
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
            g1.append("categoryNames=");
            g1.append("[");
            String as[] = d();
            for (int i = 0; i < as.length; i++)
            {
                g1.append(as[i]);
                if (i + 1 < as.length)
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

    public String[] d()
    {
        int i = 2;
        Vector vector = new Vector();
        int j;
        for (; i < c.length; i += j + 1)
        {
            int k = p.dn.a.a(c, i);
            j = k - i;
            if (k == -1)
            {
                j = c.length - i;
            }
            byte abyte0[] = new byte[j];
            System.arraycopy(c, i, abyte0, 0, abyte0.length);
            vector.addElement(new String(abyte0));
        }

        String as[] = new String[vector.size()];
        vector.copyInto(as);
        return as;
    }

    static 
    {
        g = a.aX;
        h = g.c();
    }
}
