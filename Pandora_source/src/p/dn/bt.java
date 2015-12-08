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
//            bs, a

public class bt extends bs
{

    public static final d bg;
    public static final int bh;

    public bt(int i, int j, int k, int l, int i1, boolean flag, boolean flag1, 
            boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, boolean flag7, String s, 
            String s1, String s2)
    {
        super(bh, "PNDR_RETURN_TRACK_INFO_EXTENDED", 1, a(i, j, k, l, i1, flag, flag1, flag2, flag3, flag4, flag5, flag6, flag7, s, s1, s2));
    }

    public bt(byte abyte0[])
    {
        super(bh, "PNDR_RETURN_TRACK_INFO_EXTENDED", 1, abyte0);
    }

    public static byte[] a(int i, int j, int k, int l, int i1, boolean flag, boolean flag1, boolean flag2, 
            boolean flag3, boolean flag4, boolean flag5, boolean flag6, boolean flag7, String s, String s1, 
            String s2)
    {
_L1:
        bytearrayoutputstream.write((new d(j)).b());
        j = 0;
        if (flag5)
        {
            j = 1;
        }
        break MISSING_BLOCK_LABEL_272;
_L2:
        bytearrayoutputstream.write((new d(j)).b());
        bytearrayoutputstream.write(a(s, 248, true, true));
        bytearrayoutputstream.write(a(s1, 248, true, true));
        bytearrayoutputstream.write(a(s2, 248, true, true));
        s = bytearrayoutputstream.toByteArray();
        return s;
        {
            ByteArrayOutputStream bytearrayoutputstream;
            try
            {
                bytearrayoutputstream = new ByteArrayOutputStream();
                bytearrayoutputstream.write(bg.b());
                bytearrayoutputstream.write((new c(i)).b());
                bytearrayoutputstream.write((new c(j)).b());
                bytearrayoutputstream.write((new b(k)).b());
                bytearrayoutputstream.write((new b(l)).b());
                bytearrayoutputstream.write((new d(i1)).b());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return new byte[0];
            }
            j = 0;
            if (flag)
            {
                j = 1;
            }
            i = j;
            if (flag1)
            {
                i = j | 2;
            }
            j = i;
            if (flag2)
            {
                j = i | 4;
            }
            i = j;
            if (flag3)
            {
                i = j | 8;
            }
            j = i;
            if (flag4)
            {
                j = i | 0x10;
            }
        }
          goto _L1
        i = j;
        if (flag6)
        {
            i = j | 2;
        }
        j = i;
        if (flag7)
        {
            j = i | 4;
        }
          goto _L2
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
            g1.append(",");
            g1.append("title=");
            g1.append(p());
            g1.append(",");
            g1.append("artist=");
            g1.append(q());
            g1.append(",");
            g1.append("album=");
            g1.append(r());
            g1.append("}");
            return g1.toString();
        } else
        {
            return super.a(g1);
        }
    }

    public String p()
    {
        int i = a(c, 16);
        if (i == -1)
        {
            m.l((new StringBuilder()).append("unable to find null terminator for string for title, payload:").append(p.dn.a.a(c)).toString());
            return null;
        } else
        {
            byte abyte0[] = new byte[i - 16];
            System.arraycopy(c, 16, abyte0, 0, abyte0.length);
            return (new String(abyte0)).trim();
        }
    }

    public String q()
    {
        int i = p.dn.a.a(c, 16) + 1;
        byte abyte0[] = new byte[p.dn.a.a(c, i) - i];
        System.arraycopy(c, i, abyte0, 0, abyte0.length);
        return (new String(abyte0)).trim();
    }

    public String r()
    {
        int i = p.dn.a.a(c, 16);
        i = p.dn.a.a(c, i + 1) + 1;
        byte abyte0[] = new byte[p.dn.a.a(c, i) - i];
        System.arraycopy(c, i, abyte0, 0, abyte0.length);
        return (new String(abyte0)).trim();
    }

    static 
    {
        bg = a.aL;
        bh = bg.c();
    }
}
