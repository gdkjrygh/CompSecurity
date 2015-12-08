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

public class bc extends p.dn.a
{

    public static final d g;
    public static final int h;

    public bc(int i, int j, int k, int l, int i1, byte abyte0[])
    {
        super(h, "PNDR_RETURN_GENRE_STATION_ART_SEGMENT", 1, a(i, j, k, l, i1, abyte0));
    }

    public bc(byte abyte0[])
    {
        super(h, "PNDR_RETURN_GENRE_STATION_ART_SEGMENT", 1, abyte0);
    }

    private static byte[] a(int i, int j, int k, int l, int i1, byte abyte0[])
    {
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bytearrayoutputstream.write(g.b());
            bytearrayoutputstream.write((new d(i)).b());
            bytearrayoutputstream.write((new d(j)).b());
            bytearrayoutputstream.write((new c(k)).b());
            bytearrayoutputstream.write((new d(l)).b());
            bytearrayoutputstream.write((new d(i1)).b());
            bytearrayoutputstream.write(abyte0);
            abyte0 = bytearrayoutputstream.toByteArray();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
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
            g1.append("categoryIndex=");
            g1.append(c());
            g1.append(",");
            g1.append("stationIndex=");
            g1.append(d());
            g1.append(",");
            g1.append("artLength=");
            g1.append(e());
            g1.append(",");
            g1.append("segmentIndex=");
            g1.append(f());
            g1.append(",");
            g1.append("totalSegments=");
            g1.append(g());
            g1.append(",");
            g1.append((new StringBuilder()).append("dataLength=").append(h().length).toString());
            g1.append("}");
            return g1.toString();
        }
        if (g1 == g.d)
        {
            g1 = new StringBuffer();
            byte abyte0[] = new byte[10];
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

    public int e()
    {
        byte abyte0[] = new byte[4];
        System.arraycopy(c, 3, abyte0, 0, abyte0.length);
        return (new c(abyte0)).c();
    }

    public int f()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 7, abyte0, 0, abyte0.length);
        return (new d(abyte0)).c();
    }

    public int g()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 8, abyte0, 0, abyte0.length);
        return (new d(abyte0)).c();
    }

    public byte[] h()
    {
        byte abyte0[] = new byte[c.length - 9];
        System.arraycopy(c, 9, abyte0, 0, abyte0.length);
        return abyte0;
    }

    static 
    {
        g = a.ba;
        h = g.c();
    }
}
