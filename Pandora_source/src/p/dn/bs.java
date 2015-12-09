// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p.dl.a;
import p.dm.g;
import p.dm.m;
import p.ds.b;
import p.ds.c;
import p.ds.d;

// Referenced classes of package p.dn:
//            a

public class bs extends p.dn.a
{

    public static final d g;
    public static final int h;

    public bs(int i1, int j1, int k1, int l1, int i2, boolean flag, boolean flag1, 
            boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, boolean flag7)
    {
        this(h, "PNDR_RETURN_TRACK_INFO", 1, a(i1, j1, k1, l1, i2, flag, flag1, flag2, flag3, flag4, flag5, flag6, flag7));
    }

    protected bs(int i1, String s, int j1, byte abyte0[])
    {
        super(i1, s, j1, abyte0);
    }

    public bs(byte abyte0[])
    {
        this(h, "PNDR_RETURN_TRACK_INFO", 1, abyte0);
        b(abyte0, 15);
    }

    public static byte[] a(int i1, int j1, int k1, int l1, int i2, boolean flag, boolean flag1, boolean flag2, 
            boolean flag3, boolean flag4, boolean flag5, boolean flag6, boolean flag7)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte0[];
        try
        {
            bytearrayoutputstream = new ByteArrayOutputStream();
            bytearrayoutputstream.write(g.b());
            bytearrayoutputstream.write((new c(i1)).b());
            bytearrayoutputstream.write((new c(j1)).b());
            bytearrayoutputstream.write((new b(k1)).b());
            bytearrayoutputstream.write((new b(l1)).b());
            bytearrayoutputstream.write((new d(i2)).b());
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return new byte[0];
        }
        j1 = 0;
        if (flag)
        {
            j1 = 1;
        }
        i1 = j1;
        if (flag1)
        {
            i1 = j1 | 2;
        }
        j1 = i1;
        if (flag2)
        {
            j1 = i1 | 4;
        }
        i1 = j1;
        if (flag3)
        {
            i1 = j1 | 8;
        }
        j1 = i1;
        if (p.dm.m.g(3))
        {
            j1 = i1;
            if (flag4)
            {
                j1 = i1 | 0x10;
            }
        }
        bytearrayoutputstream.write((new d(j1)).b());
        if (p.dm.m.g(3))
        {
            j1 = 0;
            if (flag5)
            {
                j1 = 1;
            }
            break MISSING_BLOCK_LABEL_243;
        }
          goto _L1
_L3:
        bytearrayoutputstream.write((new d(j1)).b());
_L1:
        abyte0 = bytearrayoutputstream.toByteArray();
        return abyte0;
        i1 = j1;
        if (flag6)
        {
            i1 = j1 | 2;
        }
        j1 = i1;
        if (flag7)
        {
            j1 = i1 | 4;
        }
        if (true) goto _L3; else goto _L2
_L2:
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
            g1.append("albumArtLength=");
            g1.append(d());
            g1.append(",");
            g1.append("duration=");
            g1.append(e());
            g1.append(",");
            g1.append("elapsed=");
            g1.append(f());
            g1.append(",");
            g1.append("rating=");
            g1.append(g());
            g1.append(",");
            g1.append("allowRating=");
            g1.append(h());
            g1.append(",");
            g1.append("allowSkip=");
            g1.append(i());
            g1.append(",");
            g1.append("allowBookmark=");
            g1.append(j());
            g1.append(",");
            g1.append("allowExplain=");
            g1.append(k());
            if (p.dm.m.g(3))
            {
                g1.append(",");
                g1.append("allowCreateStationFrom=");
                g1.append(l());
                g1.append(",");
                g1.append("isAd=");
                g1.append(m());
                g1.append(",");
                g1.append("isTrackBookmarked=");
                g1.append(n());
                g1.append(",");
                g1.append("isArtistBookmarked=");
                g1.append(o());
            }
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
        byte abyte0[] = new byte[4];
        System.arraycopy(c, 5, abyte0, 0, abyte0.length);
        return (new c(abyte0)).c();
    }

    public int e()
    {
        byte abyte0[] = new byte[2];
        System.arraycopy(c, 9, abyte0, 0, abyte0.length);
        return (new b(abyte0)).c();
    }

    public int f()
    {
        byte abyte0[] = new byte[2];
        System.arraycopy(c, 11, abyte0, 0, abyte0.length);
        return (new b(abyte0)).c();
    }

    public int g()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 13, abyte0, 0, abyte0.length);
        return (new d(abyte0)).c();
    }

    public boolean h()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 14, abyte0, 0, abyte0.length);
        return (abyte0[0] & 1) != 0;
    }

    public boolean i()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 14, abyte0, 0, abyte0.length);
        return (abyte0[0] & 2) != 0;
    }

    public boolean j()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 14, abyte0, 0, abyte0.length);
        return (abyte0[0] & 4) != 0;
    }

    public boolean k()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 14, abyte0, 0, abyte0.length);
        return (abyte0[0] & 8) != 0;
    }

    public boolean l()
    {
        boolean flag = true;
        if (!p.dm.m.g(3))
        {
            p.dm.m.m("[ReturnTrackInfo] getAllowCreateStationFrom - feature not support prior to PandoraLink - returning false");
            return false;
        }
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 14, abyte0, 0, abyte0.length);
        if ((abyte0[0] & 0x10) == 0)
        {
            flag = false;
        }
        return flag;
    }

    public boolean m()
    {
        boolean flag = true;
        if (!p.dm.m.g(3))
        {
            p.dm.m.m("[ReturnTrackInfo] isAudioAd - feature not support prior to PandoraLink - returning false");
            return false;
        }
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 15, abyte0, 0, abyte0.length);
        if ((abyte0[0] & 1) == 0)
        {
            flag = false;
        }
        return flag;
    }

    public boolean n()
    {
        boolean flag = true;
        if (!p.dm.m.g(3))
        {
            p.dm.m.m("[ReturnTrackInfo] isTrackBookmarked - feature not support prior to PandoraLink - returning false");
            return false;
        }
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 15, abyte0, 0, abyte0.length);
        if ((abyte0[0] & 2) == 0)
        {
            flag = false;
        }
        return flag;
    }

    public boolean o()
    {
        boolean flag = true;
        if (!p.dm.m.g(3))
        {
            p.dm.m.m("[ReturnTrackInfo] isTrackBookmarked - feature not support prior to PandoraLink - returning false");
            return false;
        }
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 15, abyte0, 0, abyte0.length);
        if ((abyte0[0] & 4) == 0)
        {
            flag = false;
        }
        return flag;
    }

    static 
    {
        g = a.az;
        h = g.c();
    }
}
