// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p.dl.a;
import p.dm.g;
import p.dm.m;
import p.ds.d;
import p.ds.f;

// Referenced classes of package p.dn:
//            a

public class bk extends p.dn.a
{

    public static final d g;
    public static final int h;
    private f bg[];

    public bk(byte abyte0[])
    {
        super(h, "PNDR_RETURN_STATION_INFO", 1, abyte0);
        bg = f.a(abyte0, 1, abyte0.length - 1);
    }

    public bk(f af[])
    {
        super(h, "PNDR_RETURN_STATION_INFO", 1, a(af));
        bg = af;
    }

    private static byte[] a(f af[])
    {
        ByteArrayOutputStream bytearrayoutputstream;
        int i;
        try
        {
            bytearrayoutputstream = new ByteArrayOutputStream();
            bytearrayoutputstream.write(g.b());
        }
        // Misplaced declaration of an exception variable
        catch (f af[])
        {
            return new byte[0];
        }
        i = 0;
        if (i >= af.length)
        {
            break; /* Loop/switch isn't completed */
        }
        bytearrayoutputstream.write(af[i].a());
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_20;
_L1:
        af = bytearrayoutputstream.toByteArray();
        return af;
    }

    public String a(g g1)
    {
        boolean flag = false;
        int i = 0;
        if (g1 == g.c)
        {
            StringBuffer stringbuffer = new StringBuffer(a());
            stringbuffer.append(" {");
            stringbuffer.append("stations=");
            stringbuffer.append("[");
            for (f af[] = c(); i < af.length; i++)
            {
                stringbuffer.append(af[i].a(g1));
                if (i + 1 < af.length)
                {
                    stringbuffer.append(",");
                }
            }

            stringbuffer.append("]");
            stringbuffer.append("}");
            return stringbuffer.toString();
        }
        if (g1 == g.d)
        {
            StringBuffer stringbuffer1 = new StringBuffer("{");
            stringbuffer1.append(m.d(g.b()));
            stringbuffer1.append(" ");
            f af1[] = c();
            for (int j = ((flag) ? 1 : 0); j < af1.length; j++)
            {
                stringbuffer1.append(af1[j].a(g1));
                stringbuffer1.append("...");
            }

            stringbuffer1.append("}");
            return stringbuffer1.toString();
        } else
        {
            return super.a(g1);
        }
    }

    public f[] c()
    {
        return bg;
    }

    static 
    {
        g = a.aR;
        h = g.c();
    }
}
