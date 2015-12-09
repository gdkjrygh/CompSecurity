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

public class ci extends p.dn.a
{

    public static final d g;
    public static final int h;

    public ci(int i, boolean flag)
    {
        super(h, "PNDR_UPDATE_TRACK_BOOKMARK_TRACK", 1, a(i, flag));
    }

    public ci(byte abyte0[])
    {
        super(h, "PNDR_UPDATE_TRACK_BOOKMARK_TRACK", 1, abyte0);
    }

    private static byte[] a(int i, boolean flag)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte0[];
        try
        {
            bytearrayoutputstream = new ByteArrayOutputStream();
            bytearrayoutputstream.write(g.b());
            bytearrayoutputstream.write((new c(i)).b());
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
            g1.append("trackToken=");
            g1.append(c());
            g1.append(",");
            g1.append("isBookmarked=");
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

    public boolean d()
    {
        byte abyte0[] = new byte[1];
        System.arraycopy(c, 5, abyte0, 0, abyte0.length);
        return (new d(abyte0)).c() == 1;
    }

    static 
    {
        g = a.aJ;
        h = g.c();
    }
}
