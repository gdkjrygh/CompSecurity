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

public class bw extends p.dn.a
{

    public static final d g;
    public static final int h;

    public bw(boolean flag)
    {
        super(h, "PNDR_SET_TRACK_ELAPSED_POLLING", 0, a(flag));
    }

    public bw(byte abyte0[])
    {
        super(h, "PNDR_SET_TRACK_ELAPSED_POLLING", 0, abyte0);
    }

    private static byte[] a(boolean flag)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte0[];
        int i;
        try
        {
            bytearrayoutputstream = new ByteArrayOutputStream();
            bytearrayoutputstream.write(g.b());
        }
        catch (IOException ioexception)
        {
            return new byte[0];
        }
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        bytearrayoutputstream.write((new d(i)).b());
        abyte0 = bytearrayoutputstream.toByteArray();
        return abyte0;
    }

    public String a(g g1)
    {
        if (g1 == g.c)
        {
            g1 = new StringBuffer(a());
            g1.append(" {");
            g1.append("enabled=");
            g1.append(c());
            g1.append("}");
            return g1.toString();
        } else
        {
            return super.a(g1);
        }
    }

    public boolean c()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 1, abyte0, 0, abyte0.length);
        return (new d(abyte0)).c() == 1;
    }

    static 
    {
        g = a.G;
        h = g.c();
    }
}
