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

public class cm extends p.dn.a
{

    public static final d g;
    public static final int h;

    public cm(int i, int j)
    {
        super(h, "PNDR_UPDATE_TRACK_RATING", 1, a(i, j));
    }

    public cm(byte abyte0[])
    {
        super(h, "PNDR_UPDATE_TRACK_RATING", 1, abyte0);
    }

    private static byte[] a(int i, int j)
    {
        byte abyte0[];
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bytearrayoutputstream.write(g.b());
            bytearrayoutputstream.write((new c(i)).b());
            bytearrayoutputstream.write((new d(j)).b());
            abyte0 = bytearrayoutputstream.toByteArray();
        }
        catch (IOException ioexception)
        {
            return new byte[0];
        }
        return abyte0;
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
            g1.append("rating=");
            g1.append(d());
            g1.append("}");
            return g1.toString();
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

    public int d()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 5, abyte0, 0, abyte0.length);
        return (new d(abyte0)).c();
    }

    static 
    {
        g = a.aG;
        h = g.c();
    }
}
